package cn.xvkang.properties;

public class SmsCodeValidateProperties {

	/*
	 * # 短信验证码接口 sms_url=https://seccf.51welink.com/submitdata/service.asmx/g_Submit
	 * sms_name=dlxinkao sms_pwd=YsrGj22D sms_prdid=1012808 sms_sign=【校园报名系统】
	 * smsMessageFormatString=您的验证码%s，该验证码20分钟内有效，请勿泄漏于他人！
	 */

	private String smsUrl;
	private String smsName;
	private String smsPwd;
	private String smsPrdid;
	private String smsSign;
	private String smsMessageFormatString;
	private int onePhoneOneDayMaxSendCount = 1;
	private String smsMessageNotAgreeString;
	private String smsMessageAgreeString;
	private String smsMessageReGeneratorRegCodeString;

	public String getSmsMessageNotAgreeString() {
		return smsMessageNotAgreeString;
	}

	public void setSmsMessageNotAgreeString(String smsMessageNotAgreeString) {
		this.smsMessageNotAgreeString = smsMessageNotAgreeString;
	}

	public String getSmsMessageAgreeString() {
		return smsMessageAgreeString;
	}

	public void setSmsMessageAgreeString(String smsMessageAgreeString) {
		this.smsMessageAgreeString = smsMessageAgreeString;
	}

	private int length = 6;
	private long validateSecond = 1200;

	public long getValidateSecond() {
		return validateSecond;
	}

	public int getOnePhoneOneDayMaxSendCount() {
		return onePhoneOneDayMaxSendCount;
	}

	public void setOnePhoneOneDayMaxSendCount(int onePhoneOneDayMaxSendCount) {
		this.onePhoneOneDayMaxSendCount = onePhoneOneDayMaxSendCount;
	}

	public void setValidateSecond(long validateSecond) {
		this.validateSecond = validateSecond;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getSmsUrl() {
		return smsUrl;
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

	public String getSmsMessageReGeneratorRegCodeString() {
		return smsMessageReGeneratorRegCodeString;
	}

	public void setSmsMessageReGeneratorRegCodeString(String smsMessageReGeneratorRegCodeString) {
		this.smsMessageReGeneratorRegCodeString = smsMessageReGeneratorRegCodeString;
	}

	public String getSmsMessageFormatString() {
		return smsMessageFormatString;
	}

	public void setSmsMessageFormatString(String smsMessageFormatString) {
		this.smsMessageFormatString = smsMessageFormatString;
	}

}
