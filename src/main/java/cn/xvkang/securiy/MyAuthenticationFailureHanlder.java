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
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import cn.xvkang.utils.Constants;
import cn.xvkang.validate.code.ValidateCodeException;

@Component
public class MyAuthenticationFailureHanlder extends SimpleUrlAuthenticationFailureHandler {// implements
																							// AuthenticationFailureHandler
																							// {
	@Autowired
	private ObjectMapper objectMapper;

	@Override
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException exception) throws IOException, ServletException {
		// response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
		response.setStatus(HttpStatus.OK.value());

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
		if (exception instanceof ValidateCodeException) {
			result.put("code", Constants.ReturnCode.验证码错误.getCode());
			message.add("验证码填写错误");
		} else if (exception instanceof UsernameNotFoundException) {
			result.put("code", Constants.ReturnCode.账号不存在.getCode());
			message.add("用户名或密码错误");
		} else if (exception instanceof BadCredentialsException) {
			result.put("code", Constants.ReturnCode.账号不存在.getCode());
			message.add("用户名或密码错误");
		} else if (exception instanceof LockedException) {
			result.put("code", Constants.ReturnCode.账号被禁用.getCode());
			message.add("账号被禁用");
		} else {
			result.put("code", Constants.ReturnCode.登录失败.getCode());
			message.add(exception.getMessage());
		}

		out.println(objectMapper.writeValueAsString(result));
		exception.printStackTrace();
		out.flush();
		out.close();
		// 父类默认行为
		// super.onAuthenticationFailure(request, response, exception);
	}

}
