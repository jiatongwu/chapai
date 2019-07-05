/**
 * 
 */
package cn.xvkang.securiy.appauth;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.buf.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.filter.OncePerRequestFilter;

import com.fasterxml.jackson.databind.ObjectMapper;

import cn.xvkang.controller.appauth.SmsController;
import cn.xvkang.dto.MyUserDetails;
import cn.xvkang.properties.ApplicationProperties;
import cn.xvkang.utils.Constants;
import cn.xvkang.utils.JjwtUtils;
import io.jsonwebtoken.Claims;

/**
 * @author zhailiang
 *
 */
@Component("appauthFilter")
public class AppauthFilter extends OncePerRequestFilter implements InitializingBean {
	/**
	 * 验证码校验失败处理器
	 */
	// @Autowired
	// private AuthenticationFailureHandler authenticationFailureHandler;
	/**
	 * 系统配置信息
	 */

	// @Autowired
	// private AppauthSuccessHanlder appauthSuccessHanlder;
	// @Autowired
	// private AppauthFailureHanlder appauthFailureHanlder;
	@Autowired
	private UserDetailsService userDetailsService;
	private Logger logger = LoggerFactory.getLogger(AppauthFilter.class);
	@Autowired
	private ApplicationProperties applicationProperties;
	@Autowired
	private RedisTemplate<String, String> redisStringTemplate;// 一个jwt代表一个登录用户 对应一个登录信息
	/**
	 * 系统中的校验码处理器
	 */
	// @Autowired
	// private ValidateCodeProcessorHolder validateCodeProcessorHolder;
	/**
	 * 存放所有需要校验验证码的url
	 */
	// private Map<String, ValidateCodeType> urlMap = new HashMap<>();
	/**
	 * 验证请求url与配置的url是否匹配的工具类
	 */
	private AntPathMatcher pathMatcher = new AntPathMatcher();

	/**
	 * 初始化要拦截的url配置信息
	 */
	@Override
	public void afterPropertiesSet() throws ServletException {
		super.afterPropertiesSet();
//		
	}

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws ServletException, IOException {
		logger.debug("appauthFilger doFilterInternal");

//
//		chain.doFilter(request, response);
		List<String> notAuthCanAccessUrls = applicationProperties.getAppauth().getNotAuthCanAccessUrls();
		String requestURI = request.getRequestURI();

		// if (!StringUtils.equalsIgnoreCase(request.getMethod(), "get")) {
		boolean isAllowAccess = false;
		boolean isAppCanAccessNotlogin = false;
		for (String url : notAuthCanAccessUrls) {
			if (pathMatcher.match(url, requestURI)) {
				isAllowAccess = true;
				isAppCanAccessNotlogin = true;
				break;
			}
		}
		String authToken = null;

		Claims decodeJWT = null;
		MyUserDetails myUserDetails = null;
		String appAuthMathchRegexp = applicationProperties.getAppauth().getAppUrlPrefix() + "/**";

		if (!pathMatcher.match(appAuthMathchRegexp, requestURI)) {
			isAllowAccess = true;
		}
		if (!isAllowAccess) {

			String authorization = request.getHeader("Authorization");
			logger.info("=======> http header Authorization is :" + authorization);
			boolean errorJwtFormat = false;
			if (authorization == null || !authorization.startsWith("Bearer ") || authorization.length() < 9) {
				errorJwtFormat = true;
			} else {
				authToken = authorization.substring(7);
				decodeJWT = JjwtUtils.decodeJWT(authToken);

				if (decodeJWT == null) {
					errorJwtFormat = true;
					// 错误格式的jwt
					logger.info("=============> 错误的jwt格式　");
				} else {
					// 还要判断是否在有效时间内
					Date now = new Date();
					Date expiration = decodeJWT.getExpiration();
					if (now.getTime() > expiration.getTime()) {
						errorJwtFormat = true;
					} else {
						// 还要判断是否在redis中存在 如果redis中不存在了说明用户点击退出了，所有的客户端都退出了 所有此用户的jwt都失效
						String username = redisStringTemplate.opsForValue()
								.get(applicationProperties.getRedisNameSpace() + ":" + Constants.REDIS_JWT_PREFIX
										+ authToken);
						if (username == null) {
							errorJwtFormat = true;
						} else {
							myUserDetails = (MyUserDetails) userDetailsService.loadUserByUsername(username);
						}
					}
				}
			}
			if (!errorJwtFormat) {
				isAllowAccess = true;
			}

		}

		// 有一个不拦截列表
		// token 有效 securitycontextholder设置authentication 失败返回错误信息
		if (isAllowAccess) {
			if (!pathMatcher.match(appAuthMathchRegexp, requestURI)) {
				// 非app端
				chain.doFilter(request, response);
			} else {
				Cookie cookie = new Cookie("SESSION", null); // Not necessary, but saves bandwidth.
				cookie.setPath("/");
				cookie.setHttpOnly(true);
				cookie.setMaxAge(0); // Don't set to -1 or it will become a session cookie!
				response.addCookie(cookie);
				// 有可能是app匿名访问的方式
				if (isAppCanAccessNotlogin) {

				} else {
					request.setAttribute(SmsController.REQUEST_KEY_JWT_TOKEN, authToken);
					List<String> authorityList = new ArrayList<>();
					authorityList.addAll(myUserDetails.getRoleCodes());
					authorityList.addAll(myUserDetails.getPermissionCodes());
					String join = StringUtils.join(authorityList, ',');
					AppauthAuthenticationToken authentication = new AppauthAuthenticationToken(myUserDetails,
							AuthorityUtils.commaSeparatedStringToAuthorityList(join));
					authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
					logger.info("authenticated user " + decodeJWT.getSubject() + ", setting security context");
					SecurityContextHolder.getContext().setAuthentication(authentication);
					request.setAttribute(SmsController.REQUEST_KEY_LOGIN_USER_AUTHENTICATION, authentication);

				}
				chain.doFilter(request, response);
				SecurityContextHolder.getContext().setAuthentication(null);
			}

		} else {
			// 返回报错信息
			// 错误的jwt 全部返回未认证 让他重新登录
			// 没有进行登录认证，返回错误json
			HttpServletResponse httpServletResponse = (HttpServletResponse) response;
			httpServletResponse.setCharacterEncoding("UTF-8");
			httpServletResponse.setHeader("Content-Type", "application/json;charset=UTF-8");
			PrintWriter out = httpServletResponse.getWriter();
			Map<String, Object> result = new HashMap<String, Object>();
			result.put("code", Constants.ReturnCode.未认证.getCode());
			ObjectMapper objectMapper = new ObjectMapper();
			// objectMapper.setSerializerProvider(new CustomSerializerProvider());
			out.println(objectMapper.writeValueAsString(result));
			out.flush();
			out.close();
			return;
		}
	}

}
