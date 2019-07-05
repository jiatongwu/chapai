/**
 * 
 */
package cn.xvkang.validate.code.sms;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.context.request.ServletWebRequest;

import com.fasterxml.jackson.databind.ObjectMapper;

import cn.xvkang.utils.Constants;
import cn.xvkang.utils.TonglianSmsUtils;

/**
 * @author zhailiang
 *
 */
public class DefaultSmsCodeSender implements SmsCodeSender {
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

	private boolean isRealySendSms;

	private String smsUrl;

	private String smsName;

	private String smsPwd;

	private String smsPrdid;

	private String smsSign;

	private String smsMessageFormatString;

	private ObjectMapper objectMapper;

	private RedisTemplate<String, String> redisTemplateString;// 一个手机号 一个短信验证码

	private RedisTemplate<String, Integer> redisTemplateInteger;//

	private int onePhoneOneDayMaxSendCount;

	private String redisNamespace;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.imooc.security.core.validate.code.sms.SmsCodeSender#send(java.lang.
	 * String, java.lang.String)
	 */
	@SuppressWarnings("unused")
	@Override
	public void send(ServletWebRequest request, String mobile, String code) {
		Map<String, Object> result = new HashMap<String, Object>();
		List<String> message = new ArrayList<String>();
		result.put("message", message);

		HttpServletResponse response = request.getResponse();
		response.setCharacterEncoding("UTF-8");
		response.setHeader("Content-Type", "application/json;charset=UTF-8");

		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String nowDayString = sdf.format(now);
		String phoneSmsTodaySendCountKey = redisNamespace + PHONE_SMS_NAMESPACE_PREFIX + mobile + ":" + nowDayString
				+ PHONE_SMS_TODAY_SEND_COUNT_KEY_SUFFIX;
		System.out.println("向手机" + mobile + "发送短信验证码" + code);
		String format = String.format(smsMessageFormatString, code);
		// 判断当天这个手机号发送验证码的数量是否超过规定值
		Integer sendCount = redisTemplateInteger.opsForValue().get(phoneSmsTodaySendCountKey);

		if ((sendCount == null) || (sendCount.intValue() < onePhoneOneDayMaxSendCount)) {

			boolean sendSms = isRealySendSms
					? TonglianSmsUtils.sendSms(smsUrl, smsName, smsPwd, smsPrdid, smsSign, mobile, format)
					: true;
			if (sendSms) {
				result.put("code", Constants.ReturnCode.成功.getCode());
//				redisTemplateString.opsForValue().set(phoneSmsKey, smscode);
//				Calendar c = Calendar.getInstance();
//				c.setTime(new Date());
//				c.add(Calendar.SECOND, smsExpireTime.intValue());
//				redisTemplateString.expireAt(phoneSmsKey, c.getTime());
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
			} else {
				result.put("code", ERROR_CODE.发送短信失败.getCode());
				message.add(ERROR_CODE.发送短信失败.getMessage());
			}
		} else {
			// 一天内发送验证码的次数超过指定次数
			result.put("code", ERROR_CODE.一天内发短信次数超限.getCode());
			message.add(ERROR_CODE.一天内发短信次数超限.getMessage());
		}
		// objectMapper.setSerializerProvider(new CustomSerializerProvider());
		try {
			PrintWriter out = response.getWriter();
			out.println(objectMapper.writeValueAsString(result));
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public int getOnePhoneOneDayMaxSendCount() {
		return onePhoneOneDayMaxSendCount;
	}

	public void setOnePhoneOneDayMaxSendCount(int onePhoneOneDayMaxSendCount) {
		this.onePhoneOneDayMaxSendCount = onePhoneOneDayMaxSendCount;
	}

	public RedisTemplate<String, String> getRedisTemplateString() {
		return redisTemplateString;
	}

	public void setRedisTemplateString(RedisTemplate<String, String> redisTemplateString) {
		this.redisTemplateString = redisTemplateString;
	}

	public ObjectMapper getObjectMapper() {
		return objectMapper;
	}

	public void setObjectMapper(ObjectMapper objectMapper) {
		this.objectMapper = objectMapper;
	}

	public String getSmsUrl() {
		return smsUrl;
	}

	public String getRedisNamespace() {
		return redisNamespace;
	}

	public void setRedisNamespace(String redisNamespace) {
		this.redisNamespace = redisNamespace;
	}

	public void setSmsUrl(String smsUrl) {
		this.smsUrl = smsUrl;
	}

	public String getSmsName() {
		return smsName;
	}

	public void setSmsName(String smsName) {
		this.smsName = smsName;
	}

	public String getSmsPwd() {
		return smsPwd;
	}

	public void setSmsPwd(String smsPwd) {
		this.smsPwd = smsPwd;
	}

	public RedisTemplate<String, Integer> getRedisTemplateInteger() {
		return redisTemplateInteger;
	}

	public void setRedisTemplateInteger(RedisTemplate<String, Integer> redisTemplateInteger) {
		this.redisTemplateInteger = redisTemplateInteger;
	}

	public String getSmsPrdid() {
		return smsPrdid;
	}

	public void setSmsPrdid(String smsPrdid) {
		this.smsPrdid = smsPrdid;
	}

	public String getSmsSign() {
		return smsSign;
	}

	public void setSmsSign(String smsSign) {
		this.smsSign = smsSign;
	}

	public boolean isRealySendSms() {
		return isRealySendSms;
	}

	public void setRealySendSms(boolean isRealySendSms) {
		this.isRealySendSms = isRealySendSms;
	}

	public String getSmsMessageFormatString() {
		return smsMessageFormatString;
	}

	public void setSmsMessageFormatString(String smsMessageFormatString) {
		this.smsMessageFormatString = smsMessageFormatString;
	}

}
