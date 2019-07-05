package cn.xvkang.properties;

import java.util.ArrayList;
import java.util.List;

public class AppauthProperties {

	private String appUrlPrefix = "/appauth";
	private String appLoginUrlSuffix = "/login";
	private String appPhoneLoginUrlSuffix = "/phoneLogin";
	private String appLogoutUrlSuffix = "/logout";
	private List<String> notAuthCanAccessUrls = new ArrayList<>();
	private long jwtExpireTime = 604800;

	public long getJwtExpireTime() {
		return jwtExpireTime;
	}

	public void setJwtExpireTime(long jwtExpireTime) {
		this.jwtExpireTime = jwtExpireTime;
	}

	public List<String> getNotAuthCanAccessUrls() {
		return notAuthCanAccessUrls;
	}

	public void setNotAuthCanAccessUrls(List<String> notAuthCanAccessUrls) {
		this.notAuthCanAccessUrls = notAuthCanAccessUrls;
	}

	public String getAppPhoneLoginUrlSuffix() {
		return appPhoneLoginUrlSuffix;
	}

	public void setAppPhoneLoginUrlSuffix(String appPhoneLoginUrlSuffix) {
		this.appPhoneLoginUrlSuffix = appPhoneLoginUrlSuffix;
	}

	public String getAppUrlPrefix() {
		return appUrlPrefix;
	}

	public void setAppUrlPrefix(String appUrlPrefix) {
		this.appUrlPrefix = appUrlPrefix;
	}

	public String getAppLoginUrlSuffix() {
		return appLoginUrlSuffix;
	}

	public void setAppLoginUrlSuffix(String appLoginUrlSuffix) {
		this.appLoginUrlSuffix = appLoginUrlSuffix;
	}

	public String getAppLogoutUrlSuffix() {
		return appLogoutUrlSuffix;
	}

	public void setAppLogoutUrlSuffix(String appLogoutUrlSuffix) {
		this.appLogoutUrlSuffix = appLogoutUrlSuffix;
	}

}
