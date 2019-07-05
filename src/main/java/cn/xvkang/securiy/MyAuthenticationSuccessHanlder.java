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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.social.connect.web.HttpSessionSessionStrategy;
import org.springframework.social.connect.web.SessionStrategy;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.ServletWebRequest;

import com.fasterxml.jackson.databind.ObjectMapper;

import cn.xvkang.securiy.authentication.mobile.SmsCodeAuthenticationToken;
import cn.xvkang.utils.Constants;
import cn.xvkang.validate.code.ValidateCodeProcessor;

@Component
public class MyAuthenticationSuccessHanlder extends SavedRequestAwareAuthenticationSuccessHandler {// implements
																									// AuthenticationSuccessHandler
	private SessionStrategy sessionStrategy = new HttpSessionSessionStrategy(); // {
	@Autowired
	private ObjectMapper objectMapper;

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {

		response.setCharacterEncoding("UTF-8");
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

		PrintWriter out = response.getWriter();
		// objectMapper.setSerializerProvider(new CustomSerializerProvider());

		Map<String, Object> result = new HashMap<String, Object>();
		List<String> message = new ArrayList<String>();
		result.put("message", message);
		result.put("code", Constants.ReturnCode.成功.getCode());
		if (authentication instanceof SmsCodeAuthenticationToken) {
			sessionStrategy.removeAttribute(new ServletWebRequest(request, response),
					ValidateCodeProcessor.SESSION_KEY_PREFIX + (Constants.SMS_VALIDAE_PREFIX_NAME.toUpperCase()));
		}
		result.put("data", authentication);
		out.println(objectMapper.writeValueAsString(result));
		out.flush();
		out.close();
		// 父类默认行为
		// super.onAuthenticationSuccess(request, response, authentication);

	}

}
