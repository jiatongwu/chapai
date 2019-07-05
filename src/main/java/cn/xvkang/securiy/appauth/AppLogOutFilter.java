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
import java.util.Set;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.filter.OncePerRequestFilter;

import com.fasterxml.jackson.databind.ObjectMapper;

import cn.xvkang.properties.ApplicationProperties;
import cn.xvkang.utils.Constants;
import cn.xvkang.utils.JjwtUtils;
import io.jsonwebtoken.Claims;

/**
 * @author zhailiang
 *
 */
@Component("appLogOutFilter")
public class AppLogOutFilter extends OncePerRequestFilter implements InitializingBean {
	/**
	 * 验证码校验失败处理器
	 */
	// @Autowired
	// private AuthenticationFailureHandler authenticationFailureHandler;
	/**
	 * 系统配置信息
	 */

//	@Autowired
	// private AppauthSuccessHanlder appauthSuccessHanlder;
	// @Autowired
	// private AppauthFailureHanlder appauthFailureHanlder;
	@Autowired
	private RedisTemplate<String, String> redisTemplateString;//
//	@Autowired
//	private UserDetailsService userDetailsService;
	private Logger logger = LoggerFactory.getLogger(AppLogOutFilter.class);
	@Autowired
	private ApplicationProperties applicationProperties;
	@Autowired
	private ObjectMapper objectMapper;
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
	@Autowired
	private RedisTemplate<String, String> redisStringTemplate;// 一个jwt代表一个登录用户 对应一个登录信息

	/**
	 * 初始化要拦截的url配置信息
	 */
	@Override
	public void afterPropertiesSet() throws ServletException {
		super.afterPropertiesSet();
	}

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws ServletException, IOException {
		logger.debug("appLogOutFilter doFilterInternal");

		String requestURI = request.getRequestURI();
		String method = request.getMethod();
		String loginUrl = applicationProperties.getAppauth().getAppUrlPrefix()
				+ applicationProperties.getAppauth().getAppLogoutUrlSuffix();

		if (StringUtils.equalsIgnoreCase(method, "get") && pathMatcher.match(loginUrl + "/**", requestURI)) {
			String username = null;
			Map<String, Object> result = new HashMap<String, Object>();
			List<String> message = new ArrayList<String>();
			result.put("message", message);
			result.put("code", Constants.ReturnCode.成功.getCode());
			String authorization = request.getHeader("Authorization");
			logger.info("=======> http header Authorization is :" + authorization);
			boolean errorJwtFormat = false;
			String authToken = null;
			Claims decodeJWT = null;
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
						username = redisStringTemplate.opsForValue().get(applicationProperties.getRedisNameSpace() + ":"
								+ Constants.REDIS_JWT_PREFIX + authToken);
						if (username == null) {
							errorJwtFormat = true;
						}
					}
				}
			}
			if (!errorJwtFormat) {
				// 正确的jwt格式
				String phoneJwtStartWith = applicationProperties.getRedisNameSpace() + ":" + Constants.REDIS_JWT_PREFIX
						+ decodeJWT.getSubject() + "_";
				// 删除掉此用户所有登录设备上的redis jwt
				Set<String> redisKeys = redisTemplateString.keys(phoneJwtStartWith + "*");// redisTemplatePhoneJwts.opsForSet().members(phoneJwtSetKey);
				if (redisKeys != null) {
					for (String key : redisKeys) {
						String jwt = redisTemplateString.opsForValue().get(key);
						if (jwt != null) {
							redisStringTemplate.expireAt(
									applicationProperties.getRedisNameSpace() + ":" + Constants.REDIS_JWT_PREFIX + jwt,
									new Date());
						}
						redisTemplateString.expireAt(key, new Date());
					}
				}
			}
			response.setCharacterEncoding("UTF-8");
			response.setHeader("Content-Type", "application/json;charset=UTF-8");
			PrintWriter out = response.getWriter();
			// objectMapper.setSerializerProvider(new CustomSerializerProvider());
			out.println(objectMapper.writeValueAsString(result));
			out.flush();
			out.close();
			return;
		}
		// redisTemplatePhoneJwts.expireAt(phoneJwtSetKey, new Date());

		chain.doFilter(request, response);

		// 成功返回token 失败返回错误信息
		// return;
	}

}
