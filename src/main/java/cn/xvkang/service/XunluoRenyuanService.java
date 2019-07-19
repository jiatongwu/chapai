package cn.xvkang.service;

public interface XunluoRenyuanService {

	/**
	 * 登录成功返回token
	 */
	String login(String username, String password, String imei);

}
