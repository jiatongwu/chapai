package cn.xvkang.phone;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.thrift.TException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import cn.xvkang.phone.baidu.ai.chepai.jsonpojo.OkResponse;
import cn.xvkang.phone.thrift.ChepaiPhoneService;
import cn.xvkang.phone.thrift.DataException;
import cn.xvkang.phone.thrift.Result_Code;
import cn.xvkang.phone.thrift.SendPhotoRequestData;
import cn.xvkang.phone.thrift.SendPhotoResponseData;
import cn.xvkang.phone.thrift.UploadPhotoResultEnum;
import cn.xvkang.primaryentity.Myjibenziliao;
import cn.xvkang.primaryentity.UserTable;
import cn.xvkang.primaryentity.Weiguijilu;
import cn.xvkang.properties.ApplicationProperties;
import cn.xvkang.service.ChepaiService;
import cn.xvkang.service.UserService;
import cn.xvkang.service.WeiguijiluService;
import cn.xvkang.service.XunluoRenyuanService;
import cn.xvkang.utils.BaiduAuthService;
import cn.xvkang.utils.Constants;
import cn.xvkang.utils.JjwtUtils;
import cn.xvkang.utils.TonglianSmsUtils;
import io.jsonwebtoken.Claims;

@Component
public class ChepaiPhoneServiceImpl implements ChepaiPhoneService.Iface {
	private Logger logger = LoggerFactory.getLogger(ChepaiPhoneServiceImpl.class);
	@Autowired
	private WeiguijiluService weiguijiluService;
	@Autowired
	private ObjectMapper objectMapper;
	@Autowired
	private UserService userService;
	@Autowired
	private XunluoRenyuanService xunluoRenyuanService;
	@Autowired
	private RedisTemplate<String, String> redisStringTemplate;
	@Autowired
	private ApplicationProperties applicationProperties;
	@Autowired
	private ChepaiService chepaiService;

	@Override
	public String say(String msg) throws DataException, TException {
		logger.debug("服务器say()收到消息：" + msg);
		return "helloworld";
	}

	@Override
	public String login(String username, String password, String imei) throws DataException, TException {
		return xunluoRenyuanService.login(username, password, imei);
	}

	@Override
	public SendPhotoResponseData uploadPhoto(SendPhotoRequestData request) throws DataException, TException {
		SendPhotoResponseData response = new SendPhotoResponseData();
		String jwt = request.getJwt();
		String base64image = request.getBase64image();
		Claims claims = JjwtUtils.decodeJWT(jwt);
		boolean errorJwtFormat = false;
		String usernameImei = null;
		if (claims == null) {
			errorJwtFormat = true;
			// 错误格式的jwt
			logger.info("=============> 错误的jwt格式　");
		} else {
			// 还要判断是否在有效时间内
			Date now = new Date();
			Date expiration = claims.getExpiration();
			if (now.getTime() > expiration.getTime()) {
				errorJwtFormat = true;
			} else {
				// 还要判断是否在redis中存在 如果redis中不存在了说明用户点击退出了，所有的客户端都退出了 所有此用户的jwt都失效
				usernameImei = redisStringTemplate.opsForValue().get(applicationProperties.getRedisNameSpace() + ":"
						+ Constants.REDIS_JWT_XUNLUO_RENYUAN_PREFIX + jwt);
				if (usernameImei == null) {
					errorJwtFormat = true;
				}
			}
		}
		if (errorJwtFormat) {
			response.setCode(Result_Code.NOT_LOGIN);
			return response;
		}
		String cph = chepaiShibie(base64image);
		if (cph == null) {
			response.setCode(Result_Code.ERROR);
			response.setUploadPhotoResultEnum(UploadPhotoResultEnum.SHIBIE_BULIAO);
			return response;
		}

		// 判断这个车牌号是否在库里存在
		Myjibenziliao myjibenziliao = chepaiService.findByChp(cph);
		if (myjibenziliao == null) {
			response.setCode(Result_Code.ERROR);
			response.setUploadPhotoResultEnum(UploadPhotoResultEnum.CPH_NOT_EXIST);
			return response;
		} else {
			String[] usernameImeiStringArray = usernameImei.split("_");
			String username = usernameImeiStringArray[0];
			UserTable userTable = userService.findByUsername(username);
			Integer userId = userTable.getId();
			Weiguijilu weiguijilu = new Weiguijilu();
			weiguijilu.setCph(cph);
			weiguijilu.setBase64image(base64image);
			weiguijilu.setCreatetime(new Date());
			weiguijilu.setRemark("");
			weiguijilu.setUserId(userId);
			int saveResult = weiguijiluService.saveOneWeiguijilu(weiguijilu);
			if (saveResult > 0) {
				// 发送短信通知那个人
				String mobile = myjibenziliao.getMobnumber();
				boolean sendSmsResult = sendSms(mobile, cph);
				if (!sendSmsResult) {
					response.setCode(Result_Code.ERROR);
					response.setUploadPhotoResultEnum(UploadPhotoResultEnum.SEND_SMS_ERROR);
					return response;
				}
			} else {
				response.setCode(Result_Code.ERROR);
				response.setUploadPhotoResultEnum(UploadPhotoResultEnum.SAVE_TO_DATABASE_ERROR);
				return response;
			}
		}
		response.setCode(Result_Code.OK);
		return response;
	}

	public boolean sendSms(String phone, String cph) {
		String smsUrl = applicationProperties.getSms().getSmsUrl();
		String smsName = applicationProperties.getSms().getSmsName();
		String smsPwd = applicationProperties.getSms().getSmsPwd();
		String smsPrdid = applicationProperties.getSms().getSmsPrdid();
		String smsSign = applicationProperties.getSms().getSmsSign();
		boolean sendSms = TonglianSmsUtils.sendSms(smsUrl, smsName, smsPwd, smsPrdid, smsSign, phone,
				"您的汽车:" + cph + ",停放位置违规，请及时挪走！");
		return sendSms;
	}

	/**
	 * { "log_id": 6050422887479169426, "words_result": { "color": "blue", "number":
	 * "沪CZP291", "probability": [ 0.9008601903915405, 0.9013025760650635,
	 * 0.9007153511047363, 0.8972151875495911, 0.9010491371154785,
	 * 0.9012423753738403, 0.9015415906906128 ], "vertexes_location": [ { "y": 240,
	 * "x": 261 }, { "y": 239, "x": 434 }, { "y": 286, "x": 435 }, { "y": 288, "x":
	 * 262 } ] } }
	 * 
	 * 
	 * 
	 * { "log_id": 8416385800509612722, "error_code": 282102, "error_msg": "detect
	 * plate number error" }
	 * 
	 * @param base64img
	 * @return
	 */
	public String chepaiShibie(String base64img) {
		try (CloseableHttpClient closeableHttpClient = HttpClients.createDefault();) {
//		sms_url=https://seccf.51welink.com/submitdata/service.asmx/g_Submit
//			sms_name=dlxinkao
//			sms_pwd=YsrGj22D
//			sms_prdid=1012808
//			sms_sign=【校园报名系统】
			String auth = BaiduAuthService.getAuth();
			HttpPost httpPost = new HttpPost("https://aip.baidubce.com/rest/2.0/ocr/v1/license_plate");
			httpPost.setHeader("Connection", "close");
			List<NameValuePair> form = new ArrayList<>();
			form.add(new BasicNameValuePair("access_token", auth));
			form.add(new BasicNameValuePair("image", base64img));
			UrlEncodedFormEntity entity = new UrlEncodedFormEntity(form, "UTF-8");
			httpPost.setEntity(entity);
			CloseableHttpResponse response = closeableHttpClient.execute(httpPost);
			HttpEntity responseHttpEntity = response.getEntity();
			InputStream responseInputStream = responseHttpEntity.getContent();
			// List<String> readLines = IOUtils.readLines(responseInputStream, "UTF-8");
			// if (readLines != null && readLines.size() > 0) {
			// String responseUtf8String = StringUtils.join(readLines, "");
			OkResponse okResponse = objectMapper.readValue(responseInputStream, OkResponse.class);
			closeableHttpClient.close();
			return okResponse.getWords_result().getNumber();
			// }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {

	}
}
