/**
 * 
 */
package cn.xvkang.securiy.appauth;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import org.springframework.security.core.authority.AuthorityUtils;
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

/**
 * @author zhailiang
 *
 */
@Component("appPhoneLoginFilter")
public class AppPhoneLoginFilter extends OncePerRequestFilter implements InitializingBean {
	/**
	 * 验证码校验失败处理器
	 */
	// @Autowired
	// private AuthenticationFailureHandler authenticationFailureHandler;
	/**
	 * 系统配置信息
	 */

	@Autowired
	private UserDetailsService userDetailsService;
	private Logger logger = LoggerFactory.getLogger(AppPhoneLoginFilter.class);
	@Autowired
	private ApplicationProperties applicationProperties;
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
	private ObjectMapper objectMapper;
	@Autowired
	private RedisTemplate<String, String> redisTemplateString;//

//	@Autowired
//	private RedisTemplate<String, MyUserDetails> redisTemplateJwtAuthentication;// 一个jwt代表一个登录用户 对应一个登录信息

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
		logger.debug("appLoginFilter doFilterInternal");

		String requestURI = request.getRequestURI();
		String method = request.getMethod();
		String loginUrl = applicationProperties.getAppauth().getAppUrlPrefix()
				+ applicationProperties.getAppauth().getAppPhoneLoginUrlSuffix();
		String username = request.getParameter("mobile");
		String smsCode = request.getParameter("smsCode");
		if (StringUtils.equalsIgnoreCase(method, "post") && pathMatcher.match(loginUrl, requestURI)) {
			Map<String, Object> result = new HashMap<String, Object>();
			List<String> message = new ArrayList<String>();
			result.put("message", message);
			result.put("code", Constants.ReturnCode.成功.getCode());
			boolean isLoginOk = true;
			String phoneSmsKey = applicationProperties.getRedisNameSpace() + ":"
					+ SmsController.PHONE_SMS_NAMESPACE_PREFIX + username + ":" + SmsController.PHONE_SMS_VALUE_KEY;

			String phoneJwtStartWith = applicationProperties.getRedisNameSpace() + ":" + Constants.REDIS_JWT_PREFIX
					+ username + "_";
			if (StringUtils.isBlank(username)) {
				isLoginOk = false;
			}

			// 验证输入的短信验证码是否正确
			// 创建jwt
			// 在redis中创建 一个登录名（app中是手机号）对应很多jwt Set添加一个
			// 在redis中创建 一个jwt对应一个登录信息
			// 返回给app jwt
			// 登录成功删除掉 保存的短信验证码
			MyUserDetails loadUserByUsername = (MyUserDetails) userDetailsService.loadUserByUsername(username);
			if (loadUserByUsername == null) {
				isLoginOk = false;
			} else {
				// 用户名存在 校验下短信验证码
				String smsString = redisTemplateString.opsForValue().get(phoneSmsKey);
				if (smsCode != null && smsCode.equals(smsString)) {

				} else {
					isLoginOk = false;
				}
			}

			if (isLoginOk) {

				String jwt = JjwtUtils.createJWT(username + "", Constants.JWT_ISSUER, username,
						applicationProperties.getAppauth().getJwtExpireTime() * 1000, null);

				Calendar c = Calendar.getInstance();
				c.setTime(new Date());
				c.add(Calendar.SECOND, new Long(applicationProperties.getAppauth().getJwtExpireTime()).intValue());

				String phoneStartWithKey = phoneJwtStartWith + System.currentTimeMillis();
				redisTemplateString.opsForValue().set(phoneStartWithKey, jwt);
				redisTemplateString.expireAt(phoneStartWithKey, c.getTime());

				String jwtKey = applicationProperties.getRedisNameSpace() + ":" + Constants.REDIS_JWT_PREFIX + jwt;

				List<String> authorityList = new ArrayList<>();
				authorityList.addAll(loadUserByUsername.getRoleCodes());
				authorityList.addAll(loadUserByUsername.getPermissionCodes());
				String join = StringUtils.join(authorityList, ',');
				AppauthAuthenticationToken authentication = new AppauthAuthenticationToken(loadUserByUsername,
						AuthorityUtils.commaSeparatedStringToAuthorityList(join));
				authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));

				request.setAttribute(SmsController.REQUEST_KEY_LOGIN_USER_AUTHENTICATION, authentication);

				redisTemplateString.opsForValue().set(jwtKey, username);
				redisTemplateString.expireAt(jwtKey, c.getTime());
				result.put("data", jwt);
			} else {
				result.put("code", Constants.ReturnCode.用户名或短信验证码错误.getCode());
			}

			response.setCharacterEncoding("UTF-8");
			response.setHeader("Content-Type", "application/json;charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println(objectMapper.writeValueAsString(result));
			out.flush();
			out.close();

			return;

		}

		chain.doFilter(request, response);

		// 成功返回token 失败返回错误信息
		// return;
	}

}
