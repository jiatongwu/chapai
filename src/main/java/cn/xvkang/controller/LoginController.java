package cn.xvkang.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.savedrequest.RequestCache;
import org.springframework.security.web.savedrequest.SavedRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.xvkang.utils.Constants;

@RestController
public class LoginController {
	private RequestCache requestCache = new HttpSessionRequestCache();
	private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
	private Logger logger = LoggerFactory.getLogger(LoginController.class);

	@RequestMapping("/session/invalideUrl")
	public Map<String, Object> sessionInvalideUrl(HttpServletRequest request, HttpServletResponse response)
			throws IOException {

		String origin = request.getHeader("Origin");
		if (origin == null) {
			origin = request.getHeader("Referer");
		}
		response.setHeader("Content-Type", "application/json;charset=UTF-8");
		response.setHeader("Access-Control-Allow-Origin", origin); // 允许指定域访问跨域资源
		response.setHeader("Access-Control-Allow-Credentials", "true"); // 允许客户端携带跨域cookie，此时origin值不能为“*”，只能为指定单一域名

		String allowMethod = request.getHeader("Access-Control-Request-Method");
		response.setHeader("Access-Control-Max-Age", "86400"); // 浏览器缓存预检请求结果时间,单位:秒
		response.setHeader("Access-Control-Allow-Methods", allowMethod); // 允许浏览器在预检请求成功之后发送的实际请求方法名
		response.setHeader("Access-Control-Allow-Headers", "*"); // 允许浏览器发送的请求消息头

		redirectStrategy.sendRedirect(request, response, "/notLogin.html");
		return null;
	}

	@RequestMapping("/toLogin")
	public Map<String, Object> toLogin(HttpServletRequest request, HttpServletResponse response) throws IOException {
		SavedRequest savedRequest = requestCache.getRequest(request, response);

		if (savedRequest != null) {
			String redirectUrl = savedRequest.getRedirectUrl();
			if (redirectUrl.indexOf("?") != -1) {
				redirectUrl = redirectUrl.substring(0, redirectUrl.indexOf("?"));
			}
			logger.info("引发跳转的请求url:" + redirectUrl);
			if (StringUtils.endsWithIgnoreCase(redirectUrl, ".html")) {
				redirectStrategy.sendRedirect(request, response, "/notLogin.html");
			}
		}

		Map<String, Object> result = new HashMap<String, Object>();
		List<String> message = new ArrayList<String>();
		result.put("code", Constants.ReturnCode.未认证.getCode());
		result.put("message", message);
		message.add(Constants.ReturnCode.未认证.getMessage());
		return result;
	}

	@RequestMapping("/me")
	public Authentication me(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
			throws IOException {

		return authentication;
	}

}
