package cn.xvkang.phone;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Transparency;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.imageio.ImageIO;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.thrift.TException;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectModel;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import cn.xvkang.phone.baidu.ai.chepai.jsonpojo.OkResponse;
import cn.xvkang.phone.thrift.ChepaiPhoneService;
import cn.xvkang.phone.thrift.DataException;
import cn.xvkang.phone.thrift.GetAllSmsTemplateOneItem;
import cn.xvkang.phone.thrift.GetAllSmsTemplateRequest;
import cn.xvkang.phone.thrift.GetAllSmsTemplateResponse;
import cn.xvkang.phone.thrift.GetCarPersonPojo;
import cn.xvkang.phone.thrift.GetCarPersonRequest;
import cn.xvkang.phone.thrift.GetCarPersonResponse;
import cn.xvkang.phone.thrift.GetCarPersonTypeEnum;
import cn.xvkang.phone.thrift.GetOneWeiguijiluRequest;
import cn.xvkang.phone.thrift.GetWeiguiRequestData;
import cn.xvkang.phone.thrift.GetWeiguiResponseData;
import cn.xvkang.phone.thrift.ResetPwdRequest;
import cn.xvkang.phone.thrift.ResetPwdResponse;
import cn.xvkang.phone.thrift.Result_Code;
import cn.xvkang.phone.thrift.SendPhotoRequestData;
import cn.xvkang.phone.thrift.SendPhotoResponseData;
import cn.xvkang.phone.thrift.UploadPhotoResultEnum;
import cn.xvkang.primaryentity.Myjibenziliao;
import cn.xvkang.primaryentity.SendSmsLog;
import cn.xvkang.primaryentity.SmsTemplate;
import cn.xvkang.primaryentity.UserTable;
import cn.xvkang.primaryentity.Weiguijilu;
import cn.xvkang.primarymapperdynamicsql.SmsTemplateDynamicSqlSupport;
import cn.xvkang.properties.ApplicationProperties;
import cn.xvkang.service.ChepaiService;
import cn.xvkang.service.SendSmsLogService;
import cn.xvkang.service.SmsTemplateService;
import cn.xvkang.service.UserService;
import cn.xvkang.service.WeiguijiluService;
import cn.xvkang.service.XunluoRenyuanService;
import cn.xvkang.utils.BaiduAuthService;
import cn.xvkang.utils.Constants;
import cn.xvkang.utils.FreeMarkerStringUtils;
import cn.xvkang.utils.JjwtUtils;
import cn.xvkang.utils.SpringUtils;
import cn.xvkang.utils.TonglianSmsUtils;
import io.jsonwebtoken.Claims;

@Component
public class ChepaiPhoneServiceImpl implements ChepaiPhoneService.Iface {
	private Logger logger = LoggerFactory.getLogger(ChepaiPhoneServiceImpl.class);
	@Autowired
	private WeiguijiluService weiguijiluService;
	@Autowired
	private SendSmsLogService sendSmsLogService;
	@Autowired
	private ObjectMapper objectMapper;
	@Autowired
	private RedisTemplate<String, String> redisTemplateString;//
	@Autowired
	private UserService userService;
	@Autowired
	private XunluoRenyuanService xunluoRenyuanService;
	@Autowired
	private RedisTemplate<String, String> redisStringTemplate;
	@Autowired
	private RedisTemplate<String, Integer> redisTemplateInteger;//
	@Autowired
	private ApplicationProperties applicationProperties;
	@Autowired
	private ChepaiService chepaiService;
	@Autowired
	private SmsTemplateService smsTemplateService;

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
		String cph = request.getCph();// chepaiShibie(base64image);
		// 车牌识别一次 redis中记录当天发送次数加1
		// 增加发送次数
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String nowDayString = sdf.format(now);
		String baiduChepaiShibieTodaySendCountKey = applicationProperties.getRedisNameSpace() + ":"
				+ Constants.BAIDU_AI_CHEPAI_SHIBIE_PREFIX + Constants.BAIDU_AI_CHEPAI_SHIBIE_TODAY_COUNT_PREFIX
				+ nowDayString;
		Integer sendCountToday = redisTemplateInteger.opsForValue().get(baiduChepaiShibieTodaySendCountKey);
		int currentSendCountToday = 1;
		if (sendCountToday != null) {
			currentSendCountToday = sendCountToday.intValue() + 1;
		}
		redisTemplateInteger.opsForValue().set(baiduChepaiShibieTodaySendCountKey, currentSendCountToday);
		Calendar c2 = Calendar.getInstance();
		c2.setTime(new Date());
		c2.add(Calendar.SECOND, 7 * 24 * 60 * 60);
		redisTemplateInteger.expireAt(baiduChepaiShibieTodaySendCountKey, c2.getTime());
//		if (cph == null) {
//			response.setCode(Result_Code.ERROR);
//			response.setUploadPhotoResultEnum(UploadPhotoResultEnum.SHIBIE_BULIAO);
//			return response;
//		}
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
				int smsTemplateId = request.getSmsTemplateId();
				SmsTemplate smsTemplate = smsTemplateService.findById(smsTemplateId);
				String defaultSmsMessage = "您的汽车:" + cph + ",停放位置违规，请及时挪走！";
				if (smsTemplate != null) {
					String smsTemplateContent = smsTemplate.getContent();
					Map<String, String> map = new HashMap<>();
					map.put("cph", cph);
					map.put("personName", myjibenziliao.getUsername());
					String templateString = FreeMarkerStringUtils.getPage(smsTemplateContent, map);
					if (templateString != null) {
						defaultSmsMessage = templateString;
					}
				}
				// 发送短信通知那个人
				String mobile = myjibenziliao.getMobnumber();
				if (StringUtils.isBlank(mobile)) {
					response.setCode(Result_Code.ERROR);
					response.setUploadPhotoResultEnum(UploadPhotoResultEnum.SEND_SMS_ERROR);
					return response;
				}
				boolean sendSmsResult = sendSms(mobile, defaultSmsMessage);
				if (!sendSmsResult) {
					response.setCode(Result_Code.ERROR);
					response.setUploadPhotoResultEnum(UploadPhotoResultEnum.SEND_SMS_ERROR);
					return response;
				} else {
					// 发送短信成功做下记录
					SendSmsLog sendSmsLog = new SendSmsLog();
					sendSmsLog.setCph(cph);
					sendSmsLog.setCreatetime(new Date());
					sendSmsLog.setPhone(mobile);
					sendSmsLog.setSmsMessage(defaultSmsMessage);
					sendSmsLog.setUserId(userId);
					sendSmsLogService.saveOneSendSmsLog(sendSmsLog);
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

	public boolean sendSms(String phone, String sms) {
		String smsUrl = applicationProperties.getSms().getSmsUrl();
		String smsName = applicationProperties.getSms().getSmsName();
		String smsPwd = applicationProperties.getSms().getSmsPwd();
		String smsPrdid = applicationProperties.getSms().getSmsPrdid();
		String smsSign = applicationProperties.getSms().getSmsSign();
		boolean sendSms = TonglianSmsUtils.sendSms(smsUrl, smsName, smsPwd, smsPrdid, smsSign, phone, sms);
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

	@Override
	public GetAllSmsTemplateResponse GetAllsmsTemplateResponse(GetAllSmsTemplateRequest request)
			throws DataException, TException {

		QueryExpressionDSL<SelectModel>.QueryExpressionWhereBuilder where = SqlBuilder
				.select(SmsTemplateDynamicSqlSupport.smsTemplate.allColumns())
				.from(SmsTemplateDynamicSqlSupport.smsTemplate, "smsTemplate").where();
		SelectStatementProvider render = where.build().render(RenderingStrategy.MYBATIS3);
		List<SmsTemplate> smsTemplates = smsTemplateService.getBySelectStatementProvider(render);
		GetAllSmsTemplateResponse response = new GetAllSmsTemplateResponse();
		List<GetAllSmsTemplateOneItem> items = new ArrayList<>();
		response.setCount(smsTemplates.size());

		for (SmsTemplate smsTemplate : smsTemplates) {
			GetAllSmsTemplateOneItem item = new GetAllSmsTemplateOneItem();
			item.setId(smsTemplate.getId());
			item.setContent(smsTemplate.getContent());
			item.setName(smsTemplate.getName());
			items.add(item);
		}
		response.setSmsTemplates(items);
		return response;
	}

	@Override
	public String autologin(String oldjwt) throws DataException, TException {

		Claims claims = JjwtUtils.decodeJWT(oldjwt);
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
						+ Constants.REDIS_JWT_XUNLUO_RENYUAN_PREFIX + oldjwt);
				if (usernameImei == null) {
					errorJwtFormat = true;
				}
			}
		}
		if (errorJwtFormat) {
			return "";
		}
		String[] usernameImeiStringArray = usernameImei.split("_");
		String username = usernameImeiStringArray[0];
		String imei = usernameImeiStringArray[1];
		// 登录成功 返回 jwt
		Map<String, String> extraDataMap = new HashMap<String, String>();
		extraDataMap.put("imei", imei);
		String jwt = JjwtUtils.createJWT(username + "", Constants.JWT_ISSUER, username,
				applicationProperties.getXunluoRenyuan().getJwtExpireTime() * 1000, extraDataMap);
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		c.add(Calendar.SECOND, new Long(applicationProperties.getXunluoRenyuan().getJwtExpireTime()).intValue());
		// 一个人在同一手机上有可能有多个jwt
		String xunluoRenyuanJwtTokenKey = applicationProperties.getRedisNameSpace() + ":"
				+ Constants.REDIS_JWT_XUNLUO_RENYUAN_PREFIX + username + "_" + imei + "_" + System.currentTimeMillis();
		redisTemplateString.opsForValue().set(xunluoRenyuanJwtTokenKey, jwt);
		redisTemplateString.expireAt(xunluoRenyuanJwtTokenKey, c.getTime());
		// 每一个jwt都代表一个人在一个手机上某一时间登录
		String jwtKey = applicationProperties.getRedisNameSpace() + ":" + Constants.REDIS_JWT_XUNLUO_RENYUAN_PREFIX
				+ jwt;
		redisTemplateString.opsForValue().set(jwtKey, username + "_" + imei);
		redisTemplateString.expireAt(jwtKey, c.getTime());
		return jwt;
	}

	@Override
	public GetWeiguiResponseData GetWeiguijiluResponse(GetWeiguiRequestData request) throws DataException, TException {
		int pageSize = 20;
		GetWeiguiResponseData response = new GetWeiguiResponseData();
		String cph = request.getCph();
		String date = request.getDate();
		String jwt = request.getJwt();
		int pageNum = request.getPageNum();
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
		Map<String, Object> params = new HashMap<>();
		params.put("createTimeAsc", "0");
		if (StringUtils.isNotBlank(cph)) {
			params.put("cph", cph);
		}
		if (StringUtils.isNotBlank(date)) {
			String startTime = date + " 00:00:01";
			String endTime = date + " 23:59:59";
			params.put("startTime", startTime);
			params.put("endTime", endTime);
		}
		PageImpl<Map<String, Object>> pages = weiguijiluService.selectAll(params, pageNum, pageSize);
		List<cn.xvkang.phone.thrift.Weiguijilu> weiguijilus = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		for (Map<String, Object> map : pages.getContent()) {
			cn.xvkang.phone.thrift.Weiguijilu weiguijilu = new cn.xvkang.phone.thrift.Weiguijilu();
			weiguijilu.setCph((String) map.get("cph"));
			Date createtime = (Date) map.get("createtime");
			weiguijilu.setCreatetime(sdf.format(createtime));
			weiguijilu.setPersonName((String) map.get("personName"));
			weiguijilu.setId((Integer) map.get("id"));
			String originBase64image = (String) map.get("base64image");
			if (StringUtils.isNotBlank(originBase64image)) {

				byte[] base64bytes = org.apache.commons.codec.binary.Base64.decodeBase64(originBase64image);

				try {

					BufferedImage read = ImageIO.read(new ByteArrayInputStream(base64bytes));
					BufferedImage outBufferedImage = scale(read, 80, 50);

					ByteArrayOutputStream bos = new ByteArrayOutputStream();
					ImageIO.write(outBufferedImage, "jpeg", bos);
					byte[] imageBytes = bos.toByteArray();
					bos.flush();
					bos.close();
					originBase64image = org.apache.commons.codec.binary.Base64.encodeBase64String(imageBytes);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			weiguijilu.setBase64image(originBase64image);
			weiguijilus.add(weiguijilu);
		}

		int totalPages = pages.getTotalPages();
		response.setTotalPage(totalPages);
		response.setPageNum(pageNum);
		response.setCode(Result_Code.OK);
		response.setWeiguijilus(weiguijilus);
		return response;
	}

	public BufferedImage scale(BufferedImage img, int targetWidth, int targetHeight) {
		int type = (img.getTransparency() == Transparency.OPAQUE) ? BufferedImage.TYPE_INT_RGB
				: BufferedImage.TYPE_INT_ARGB;
		BufferedImage ret = img;
		BufferedImage scratchImage = null;
		Graphics2D g2 = null;

		int w = img.getWidth();
		int h = img.getHeight();
		int prevW = w;
		int prevH = h;
		do {
			if (w > targetWidth) {
				w /= 2;
				w = (w < targetWidth) ? targetWidth : w;
			}
			if (h > targetHeight) {
				h /= 2;
				h = (h < targetHeight) ? targetHeight : h;
			}
			if (scratchImage == null) {
				scratchImage = new BufferedImage(w, h, type);
				g2 = scratchImage.createGraphics();
			}
			g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
			g2.drawImage(ret, 0, 0, w, h, 0, 0, prevW, prevH, null);

			prevW = w;
			prevH = h;
			ret = scratchImage;
		} while (w != targetWidth || h != targetHeight);
		if (g2 != null) {
			g2.dispose();
		}
		if (targetWidth != ret.getWidth() || targetHeight != ret.getHeight()) {
			scratchImage = new BufferedImage(targetWidth, targetHeight, type);
			g2 = scratchImage.createGraphics();
			g2.drawImage(ret, 0, 0, null);
			g2.dispose();
			ret = scratchImage;
		}
		return ret;
	}

	@Override
	public cn.xvkang.phone.thrift.Weiguijilu getOneWeiguijilu(GetOneWeiguijiluRequest request)
			throws DataException, TException {
		int id = request.getId();
		Weiguijilu findById = weiguijiluService.findById(id);
		cn.xvkang.phone.thrift.Weiguijilu weiguijilu = new cn.xvkang.phone.thrift.Weiguijilu();
		weiguijilu.setBase64image(findById.getBase64image());
		weiguijilu.setCph(findById.getCph());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		weiguijilu.setCreatetime(sdf.format(findById.getCreatetime()));
		weiguijilu.setId(findById.getId());
		Integer userId = findById.getUserId();
		UserTable user = userService.findById(userId);
		if (user != null) {
			weiguijilu.setPersonName(user.getName());
		}
		return weiguijilu;
	}

	@Override
	public ResetPwdResponse resetPwd(ResetPwdRequest request) throws DataException, TException {
		ResetPwdResponse response = new ResetPwdResponse();
		String oldPwd = request.getOldPwd();
		String jwt = request.getJwt();
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
			response.setResult_code(Result_Code.ERROR);
			return response;
		}
		String[] usernameImeiStringArray = usernameImei.split("_");
		String username = usernameImeiStringArray[0];
		String imei = usernameImeiStringArray[1];
		UserTable user = userService.findByUsername(username);
		String password = user.getPassword();
		PasswordEncoder passwordEncoder = SpringUtils.ac.getBean(PasswordEncoder.class);
		if (!passwordEncoder.matches(oldPwd, password)) {
			response.setResult_code(Result_Code.ERROR);
			return response;
		}
		// 在此设备上重置密码 那么其他设备就不能登录了 只有这台设备能登录

		// 一个人在同一手机上有可能有多个jwt
		String xunluoRenyuanJwtTokenKeyStartWith = applicationProperties.getRedisNameSpace() + ":"
				+ Constants.REDIS_JWT_XUNLUO_RENYUAN_PREFIX + username + "_" + imei + "_" + "*";

		// redisTemplateString.opsForValue().set(xunluoRenyuanJwtTokenKey, jwt);

		// 每一个jwt都代表一个人在一个手机上某一时间登录
		// String currentJwtKey = applicationProperties.getRedisNameSpace() + ":" +
		// Constants.REDIS_JWT_XUNLUO_RENYUAN_PREFIX + jwt;

		// String phoneJwtSetKey = Constants.REDIS_PREFIX + Constants.REDIS_JWT_PREFIX +
		// phone + Constants.PHONE_JWT_SET_SUFFIX;
		// 删除掉此用户所有登录设备上的redis jwt
		Set<String> redisKeys = redisTemplateString.keys(xunluoRenyuanJwtTokenKeyStartWith);// redisTemplatePhoneJwts.opsForSet().members(phoneJwtSetKey);
		if (redisKeys != null) {
			for (String key : redisKeys) {
				String oneJwt = redisTemplateString.opsForValue().get(key);
				if ((oneJwt != null) && (!oneJwt.equals(jwt))) {
					redisStringTemplate.expireAt(applicationProperties.getRedisNameSpace() + ":"
							+ Constants.REDIS_JWT_XUNLUO_RENYUAN_PREFIX + oneJwt, new Date());

				}
				if (!jwt.equals(oneJwt)) {
					redisStringTemplate.expireAt(key, new Date());
				}
			}
		}

		String newPwd = request.getNewPwd();
		userService.resetPwd(user.getId(), newPwd);
		response.setResult_code(Result_Code.OK);
		return response;
	}

	@Override
	public void logout(String jwt) throws DataException, TException {

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
		if (!errorJwtFormat) {
			String[] usernameImeiStringArray = usernameImei.split("_");
			String username = usernameImeiStringArray[0];
			String imei = usernameImeiStringArray[1];

			// 一个人在同一手机上有可能有多个jwt
			String xunluoRenyuanJwtTokenKeyStartWith = applicationProperties.getRedisNameSpace() + ":"
					+ Constants.REDIS_JWT_XUNLUO_RENYUAN_PREFIX + username + "_" + imei + "_" + "*";
			// redisTemplateString.opsForValue().set(xunluoRenyuanJwtTokenKey, jwt);
			// 每一个jwt都代表一个人在一个手机上某一时间登录
			// String jwtKey = applicationProperties.getRedisNameSpace() + ":" +
			// Constants.REDIS_JWT_XUNLUO_RENYUAN_PREFIX + jwt;
			// String phoneJwtSetKey = Constants.REDIS_PREFIX + Constants.REDIS_JWT_PREFIX +
			// phone + Constants.PHONE_JWT_SET_SUFFIX;
			// 删除掉此用户所有登录设备上的redis jwt
			Set<String> redisKeys = redisTemplateString.keys(xunluoRenyuanJwtTokenKeyStartWith);// redisTemplatePhoneJwts.opsForSet().members(phoneJwtSetKey);
			if (redisKeys != null) {
				for (String key : redisKeys) {
					String oneJwt = redisTemplateString.opsForValue().get(key);
					if (oneJwt != null) {
						redisStringTemplate.expireAt(applicationProperties.getRedisNameSpace() + ":"
								+ Constants.REDIS_JWT_XUNLUO_RENYUAN_PREFIX + oneJwt, new Date());
					}
					redisStringTemplate.expireAt(key, new Date());
				}
			}
		}
	}

	@Override
	public GetCarPersonResponse getCarPersonByPhotoOrCph(GetCarPersonRequest request) throws DataException, TException {
		GetCarPersonResponse response = new GetCarPersonResponse();
		response.setCode(Result_Code.OK);
		List<GetCarPersonPojo> carPersons = new ArrayList<>();
		response.setCarPersons(carPersons);
		GetCarPersonTypeEnum getCarPersonTypeEnum = request.getCarPersonTypeEnum;
		if (getCarPersonTypeEnum == GetCarPersonTypeEnum.CPH) {
			List<Map<String, Object>> myjibenziliaos = chepaiService.findByCphLike(request.getImageOrCph());
			if (myjibenziliaos != null) {
				for (Map<String, Object> tmpMap : myjibenziliaos) {
					GetCarPersonPojo pojo = new GetCarPersonPojo();
					pojo.setCph((String) tmpMap.get("chepaihao"));
					pojo.setPersonName((String) tmpMap.get("UserName"));
					pojo.setPhone((String) tmpMap.get("MobNumber"));
					carPersons.add(pojo);
				}
			}
		} else if (getCarPersonTypeEnum == GetCarPersonTypeEnum.PHOTO) {
			// 这种情况不用考虑 已经修改成由手机通过4G网进行车牌识别
		}
		return response;
	}
}
