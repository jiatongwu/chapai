package cn.xvkang.controller.appauth;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.xvkang.properties.ApplicationProperties;
import cn.xvkang.utils.Constants;
import cn.xvkang.utils.RandomStringUtil;
import cn.xvkang.utils.TonglianSmsUtils;

@RestController
@RequestMapping("/appauth")
public class SmsController {
	// public static final String REQUEST_KEY_LOGIN_USER_INFORMATION =
	// "loginUserInformation";
	public static final String REQUEST_KEY_LOGIN_USER_AUTHENTICATION = "appAuthentication";
	public static final String REQUEST_KEY_JWT_TOKEN = "jwttoken";

	public static enum ERROR_CODE {
		短信发送太频繁(100001, "短信发送太频繁"), 一天内发短信次数超限(100002, "一天内发短信次数超限"), 发送短信失败(100003, "发送短信失败"),
		登录时短信验证码输入有误(100004, "登录时短信验证码输入有误"), 短信提供商返回数据有问题(100005, "短信提供商返回数据有问题");
		private Integer code;
		private String message;

		ERROR_CODE(Integer code, String message) {
			this.code = code;
			this.message = message;
		}

		public Integer getCode() {
			return this.code;
		}

		public String getMessage() {
			return this.message;
		}
	}

	public static final String PHONE_SMS_NAMESPACE_PREFIX = "phonesms:";
	public static final String PHONE_SMS_VALUE_KEY = "value";
	// public static final String PHONE_SMS__LAST_SEND_TIME_KEY = "last_send_time";
	public static final String PHONE_SMS_TODAY_SEND_COUNT_KEY_SUFFIX = "_today_count";
	// @Autowired
	// private RedisTemplate<String, String> redisTemplatePhoneJwts; //
	// 一个登录名（app中是手机号） 对应很多jwt
	// 当一个手机号点退出时，将此手机号对应的所有jwt在redis都删除
	// @Autowired
	// private RedisTemplate<String, LoginUserInformation>
	// redisTemplateJwtLoginUserInformation; // 一个jwt代表一个登录用户 对应一个登录信息
	@Autowired
	private RedisTemplate<String, String> redisTemplateString;// 一个手机号 一个短信验证码
	@Autowired
	private RedisTemplate<String, Integer> redisTemplateInteger;//
//	@Autowired
//	private UserService userService;
	// @Autowired
	// private StudentService studentService;
	@Autowired
	private ApplicationProperties applicationProperties;

	@PostMapping("/sendSms")
	public Map<String, Object> sendSms(String mobile) {

		Map<String, Object> result = new HashMap<String, Object>();
		List<String> message = new ArrayList<String>();
		result.put("message", message);
		result.put("code", Constants.ReturnCode.成功.getCode());
		result.put("data", "");

		String phoneSmsKey = applicationProperties.getRedisNameSpace() + ":" + PHONE_SMS_NAMESPACE_PREFIX + mobile + ":"
				+ PHONE_SMS_VALUE_KEY;
		// String phoneSmsLastSendTimeKey = Constants.REDIS_PREFIX +
		// PHONE_SMS_NAMESPACE_PREFIX + phone + ":" + PHONE_SMS__LAST_SEND_TIME_KEY;
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String nowDayString = sdf.format(now);
		String phoneSmsTodaySendCountKey = applicationProperties.getRedisNameSpace() + ":" + PHONE_SMS_NAMESPACE_PREFIX
				+ mobile + ":" + nowDayString + PHONE_SMS_TODAY_SEND_COUNT_KEY_SUFFIX;

		// 查询redis是否有 这个手机号的sms 如果有并且距离上次发送时间超过60秒那么就 <可以重新发送> ，否则返回错误提示,发送太频繁。
		// 如果可以发送并且当天发送的次数已经超过10次那么就不能再发了
		// redis没有此手机sms,就 <可以重新发送>
		// 发送验证码，然后在redis中(更新)缓存sms,然后在redis中
		// 增加这个手机号这当天的发送次数

		String smsString = redisTemplateString.opsForValue().get(phoneSmsKey);
		boolean sendPhone = false;
		if (StringUtils.isBlank(smsString)) {
			sendPhone = true;
		} else {
			Long expire = redisTemplateString.getExpire(phoneSmsKey);
			long jingguoTime = applicationProperties.getSms().getValidateSecond() - expire.longValue();
			if (jingguoTime < 50) {
				// 经过不到50秒 又要求发送验证码，返回发送太频繁错误
				result.put("code", ERROR_CODE.短信发送太频繁.getCode());
				message.add(ERROR_CODE.短信发送太频繁.getMessage());
			} else {
				// 判断当天这个手机号发送验证码的数量是否超过规定值
				Integer sendCount = redisTemplateInteger.opsForValue().get(phoneSmsTodaySendCountKey);
				if ((sendCount == null)
						|| (sendCount.intValue() < applicationProperties.getSms().getOnePhoneOneDayMaxSendCount())) {
					sendPhone = true;
				} else {
					// 一天内发送验证码的次数超过指定次数
					result.put("code", ERROR_CODE.一天内发短信次数超限.getCode());
					message.add(ERROR_CODE.一天内发短信次数超限.getMessage());
				}
			}
		}
		if (sendPhone) {
			// 可以发送手机短信验证码
			String smscode = RandomStringUtil.getNumber(6);

			String format = String.format(applicationProperties.getSms().getSmsMessageFormatString(), smscode);
			boolean sendOk = TonglianSmsUtils.sendSms(applicationProperties.getSms().getSmsUrl(),
					applicationProperties.getSms().getSmsName(), applicationProperties.getSms().getSmsPwd(),
					applicationProperties.getSms().getSmsPrdid(), applicationProperties.getSms().getSmsSign(), mobile,
					format);
//			sendSmsResponse = AliSmsUtils.sendSms(phone, smscode);
//			System.out.println("短信接口返回的数据----------------");
//			System.out.println("Code=" + sendSmsResponse.getCode());
//			System.out.println("Message=" + sendSmsResponse.getMessage());
//			System.out.println("RequestId=" + sendSmsResponse.getRequestId());
//			System.out.println("BizId=" + sendSmsResponse.getBizId());
			// if (!("OK".equals(sendSmsResponse.getCode()))) {
			if (!sendOk) {
				result.put("code", ERROR_CODE.短信提供商返回数据有问题.getCode());
				message.add(ERROR_CODE.短信提供商返回数据有问题.getMessage());
			} else {
				// Code=OK
				// Message=OK
				// RequestId=D0C3FC5E-88A8-4357-9D39-122AD7FA5923
				// BizId=688012858177425658^0
				//
				// Code=isv.SMS_SIGNATURE_ILLEGAL
				// Message=签名不合法(不存在或被拉黑)
				// RequestId=835149FB-3714-4E2C-BB8D-90744045FDAC
				// BizId=null
				// TODO 将发送短信成功或失败的返回结果写到数据库日志表中
				redisTemplateString.opsForValue().set(phoneSmsKey, smscode);
				Calendar c = Calendar.getInstance();
				c.setTime(new Date());
				c.add(Calendar.SECOND, new Long(applicationProperties.getSms().getValidateSecond()).intValue());
				redisTemplateString.expireAt(phoneSmsKey, c.getTime());
				// 增加发送次数
				Integer sendCountToday = redisTemplateInteger.opsForValue().get(phoneSmsTodaySendCountKey);
				int currentSendCountToday = 1;
				if (sendCountToday != null) {
					currentSendCountToday = sendCountToday.intValue() + 1;
				}
				redisTemplateInteger.opsForValue().set(phoneSmsTodaySendCountKey, currentSendCountToday);
				Calendar c2 = Calendar.getInstance();
				c2.setTime(new Date());
				c2.add(Calendar.SECOND, 24 * 60 * 60);
				redisTemplateString.expireAt(phoneSmsTodaySendCountKey, c2.getTime());
			}

		}
		return result;
	}

}
