/**
 * 
 */
package cn.xvkang.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author zhailiang
 *
 */
@ConfigurationProperties(prefix = "cn.xvkang")
public class ApplicationProperties {
	private AppauthProperties appauth = new AppauthProperties();
	private String name;
	private SmsCodeValidateProperties sms = new SmsCodeValidateProperties();
	private ImageCodeValidateProperties imageCode = new ImageCodeValidateProperties();
	private XunluoRenyuanProperties xunluoRenyuan = new XunluoRenyuanProperties();
	private String imageCodeRequireValidateUrls;
	private String smsCodeRequireValidateUrls;
	private String birthdayStart;
	private String birthdayEnd;
	private int nongyeStartRegCode;
	private int nongyeEndRegCode;
	private int feiNongyeStartRegCode;
	private int feiNongyeEndRegCode;
	private String maxRegStudent;
	private String redisNameSpace;

	public String getRedisNameSpace() {
		return redisNameSpace;
	}

	public void setRedisNameSpace(String redisNameSpace) {
		this.redisNameSpace = redisNameSpace;
	}

	public String getMaxRegStudent() {
		return maxRegStudent;
	}

	public void setMaxRegStudent(String maxRegStudent) {
		this.maxRegStudent = maxRegStudent;
	}

	public int getNongyeStartRegCode() {
		return nongyeStartRegCode;
	}

	public void setNongyeStartRegCode(int nongyeStartRegCode) {
		this.nongyeStartRegCode = nongyeStartRegCode;
	}

	public AppauthProperties getAppauth() {
		return appauth;
	}

	public void setAppauth(AppauthProperties appauth) {
		this.appauth = appauth;
	}

	public int getNongyeEndRegCode() {
		return nongyeEndRegCode;
	}

	public void setNongyeEndRegCode(int nongyeEndRegCode) {
		this.nongyeEndRegCode = nongyeEndRegCode;
	}

	public int getFeiNongyeStartRegCode() {
		return feiNongyeStartRegCode;
	}

	public void setFeiNongyeStartRegCode(int feiNongyeStartRegCode) {
		this.feiNongyeStartRegCode = feiNongyeStartRegCode;
	}

	public int getFeiNongyeEndRegCode() {
		return feiNongyeEndRegCode;
	}

	public void setFeiNongyeEndRegCode(int feiNongyeEndRegCode) {
		this.feiNongyeEndRegCode = feiNongyeEndRegCode;
	}

	public String getBirthdayStart() {
		return birthdayStart;
	}

	public void setBirthdayStart(String birthdayStart) {
		this.birthdayStart = birthdayStart;
	}

	public String getBirthdayEnd() {
		return birthdayEnd;
	}

	public void setBirthdayEnd(String birthdayEnd) {
		this.birthdayEnd = birthdayEnd;
	}

	public ImageCodeValidateProperties getImageCode() {
		return imageCode;
	}

	public void setImageCode(ImageCodeValidateProperties imageCode) {
		this.imageCode = imageCode;
	}

	public String getImageCodeRequireValidateUrls() {
		return imageCodeRequireValidateUrls;
	}

	public void setImageCodeRequireValidateUrls(String imageCodeRequireValidateUrls) {
		this.imageCodeRequireValidateUrls = imageCodeRequireValidateUrls;
	}

	public String getSmsCodeRequireValidateUrls() {
		return smsCodeRequireValidateUrls;
	}

	public void setSmsCodeRequireValidateUrls(String smsCodeRequireValidateUrls) {
		this.smsCodeRequireValidateUrls = smsCodeRequireValidateUrls;
	}

	public SmsCodeValidateProperties getSms() {
		return sms;
	}

	public void setSms(SmsCodeValidateProperties sms) {
		this.sms = sms;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public XunluoRenyuanProperties getXunluoRenyuan() {
		return xunluoRenyuan;
	}

	public void setXunluoRenyuan(XunluoRenyuanProperties xunluoRenyuan) {
		this.xunluoRenyuan = xunluoRenyuan;
	}

}
