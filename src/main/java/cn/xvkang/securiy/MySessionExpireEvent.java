package cn.xvkang.securiy;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.session.SessionInformationExpiredEvent;
import org.springframework.security.web.session.SessionInformationExpiredStrategy;

import com.fasterxml.jackson.databind.ObjectMapper;

import cn.xvkang.utils.Constants;

public class MySessionExpireEvent implements SessionInformationExpiredStrategy {
	private ObjectMapper objectMapper;
	private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

	public MySessionExpireEvent(ObjectMapper objectMapper) {
		this.objectMapper = objectMapper;
	}

	@Override
	public void onExpiredSessionDetected(SessionInformationExpiredEvent event) throws IOException, ServletException {
		HttpServletResponse response = event.getResponse();
		HttpServletRequest request = event.getRequest();
		String requestURI = request.getRequestURI();

		if (requestURI.indexOf("?") != -1) {
			requestURI = requestURI.substring(0, requestURI.indexOf("?"));
		}

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

		if (StringUtils.endsWithIgnoreCase(requestURI, ".html")) {
			redirectStrategy.sendRedirect(request, response, "/notLogin.html");
			return;
		}
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		// objectMapper.setSerializerProvider(new CustomSerializerProvider());

		Map<String, Object> result = new HashMap<String, Object>();
		List<String> message = new ArrayList<String>();
		result.put("message", message);
		result.put("code", Constants.ReturnCode.您被挤掉线了.getCode());
		message.add(Constants.ReturnCode.您被挤掉线了.getMessage());
		out.println(objectMapper.writeValueAsString(result));
		out.flush();
		out.close();
		// 父类默认行为
		// super.onAuthenticationSuccess(request, response, authentication);

	}

}
