package cn.xvkang.securiy;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import cn.xvkang.controller.CaptchaController;
import cn.xvkang.exception.ImageCodeException;

@Component
public class ImageValidateCodeFilter extends OncePerRequestFilter {
	@Autowired
	private MyAuthenticationFailureHanlder myAuthenticationFailureHanlder;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		if (StringUtils.equals("/loginProcessingUrl", request.getRequestURI())
				&& StringUtils.equalsIgnoreCase(request.getMethod(), "post")) {
			String parameter = request.getParameter("imageCode");
			String rightCode = (String) request.getSession().getAttribute(CaptchaController.SESSION_IMAGECODE_KEY);
			if (rightCode != null && rightCode.equalsIgnoreCase(parameter)) {
			} else {
				ImageCodeException runtimeException = new ImageCodeException("验证码不正确");
				myAuthenticationFailureHanlder.onAuthenticationFailure(request, response, runtimeException);
				return;
			}

		}
		filterChain.doFilter(request, response);
	}

}
