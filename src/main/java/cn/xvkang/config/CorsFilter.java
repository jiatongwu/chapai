package cn.xvkang.config;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CorsFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {
//		HttpServletResponse response = (HttpServletResponse) servletResponse;
//		HttpServletRequest request = (HttpServletRequest) servletRequest;
//
//		response.setHeader("Access-Control-Allow-Origin", "*");
//		response.setHeader("Access-Control-Allow-Methods", "GET,POST,DELETE,PUT,OPTIONS");
//		response.setHeader("Access-Control-Allow-Headers", "*");
//		response.setHeader("Access-Control-Allow-Credentials", "true");
//		response.setHeader("Access-Control-Max-Age", "86400");

		HttpServletRequest req = (HttpServletRequest) servletRequest;
		HttpServletResponse resp = (HttpServletResponse) servletResponse;
		String origin = req.getHeader("Origin");
		if (origin == null) {
			origin = req.getHeader("Referer");
		}
		resp.setHeader("Access-Control-Allow-Origin", origin); // 允许指定域访问跨域资源
		resp.setHeader("Access-Control-Allow-Credentials", "true"); // 允许客户端携带跨域cookie，此时origin值不能为“*”，只能为指定单一域名

		if ("OPTIONS".equals(req.getMethod())) {
			String allowMethod = req.getHeader("Access-Control-Request-Method");
			String allowHeaders = req.getHeader("Access-Control-Request-Headers");
			resp.setHeader("Access-Control-Max-Age", "86400"); // 浏览器缓存预检请求结果时间,单位:秒
			resp.setHeader("Access-Control-Allow-Methods", allowMethod); // 允许浏览器在预检请求成功之后发送的实际请求方法名
			resp.setHeader("Access-Control-Allow-Headers", allowHeaders); // 允许浏览器发送的请求消息头
			return;
		}
		filterChain.doFilter(servletRequest, servletResponse);

		// filterChain.doFilter(servletRequest, servletResponse);
	}

	@Override
	public void destroy() {

	}
}