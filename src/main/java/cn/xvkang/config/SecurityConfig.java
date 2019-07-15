package cn.xvkang.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

import cn.xvkang.properties.ApplicationProperties;
import cn.xvkang.securiy.MyAuthenticationFailureHanlder;
import cn.xvkang.securiy.MyAuthenticationSuccessHanlder;
import cn.xvkang.securiy.MyLogoutSuccessHandler;
import cn.xvkang.securiy.authentication.mobile.SmsCodeAuthenticationSecurityConfig;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	// @Autowired
	// private ImageValidateCodeFilter imageValidateCodeFilter;

	// @Autowired
	// private ObjectMapper objectMapper;

	@Bean
	CorsFilter corsFilter() {
		CorsFilter filter = new CorsFilter();
		return filter;
	}

	@Autowired
	private MyAuthenticationSuccessHanlder myAuthenticationSuccessHanlder;
	@Autowired
	private MyAuthenticationFailureHanlder myAuthenticationFailureHanlder;
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication().withUser("user").password("password").roles("USER").and().withUser("admin")
//				.password("admin").roles("USER", "ADMIN");
//	}
	@Autowired
	private DataSource dataSource;
	// @Autowired
	// private UserDetailsService userDetailsService;
	@Autowired
	private ValidateCodeSecurityConfig validateCodeSecurityConfig;
	@Autowired
	private AppauthSecurityConfig appauthSecurityConfig;
	@Autowired
	private SmsCodeAuthenticationSecurityConfig smsCodeAuthenticationSecurityConfig;
	@Autowired
	private MyLogoutSuccessHandler myLogoutSuccessHandler;
	@Autowired
	private ApplicationProperties applicationProperties;

	@Bean
	public PersistentTokenRepository persistentTokenRepository() {
		JdbcTokenRepositoryImpl jdbcTokenRepositoryImpl = new JdbcTokenRepositoryImpl();
		jdbcTokenRepositoryImpl.setDataSource(dataSource);
		jdbcTokenRepositoryImpl.setCreateTableOnStartup(false);
		return jdbcTokenRepositoryImpl;
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.// addFilterBefore(corsFilter(), SessionManagementFilter.class).// adds your
				// custom CorsFilter//
		// addFilterBefore(imageValidateCodeFilter,
		// AbstractPreAuthenticatedProcessingFilter.class).
				formLogin().loginPage("/toLogin").loginProcessingUrl("/loginProcessingUrl")
				.successHandler(myAuthenticationSuccessHanlder).failureHandler(myAuthenticationFailureHanlder).and()
				// .sessionManagement().maximumSessions(1)// .maxSessionsPreventsLogin(true) //
				// 阻止后面的人登录
				// .expiredSessionStrategy(new MySessionExpireEvent(objectMapper)).and()
				// .and()
				.logout().logoutUrl("/logout.html").logoutSuccessHandler(myLogoutSuccessHandler).and()
				.authorizeRequests()
				.antMatchers("/favicon.ico", "/toLogin", "/loginPage.html", "/captchaImage", "/notLogin.html",
						"/getValidateCode/*", "/static/**", "/app/isPhoneCanLogin", "/app/signupAndRegisterUser",
						"/getZhaoShengTime", "/app/isRegCodeEmptyByPhone", "/webjars/**", "/swagger-ui.html",
						"/v2/api-docs", "/swagger-resources", "/swagger-resources/**", "/configuration/ui",
						"/configuration/security", applicationProperties.getAppauth().getAppUrlPrefix() + "/**")
				.permitAll().anyRequest().authenticated()
				// .and().rememberMe()
				// .tokenRepository(persistentTokenRepository()).tokenValiditySeconds(86400)
				// .userDetailsService(userDetailsService)
				// .anonymous()
				.and().csrf().disable().apply(validateCodeSecurityConfig).and().headers().frameOptions().sameOrigin()
				.and().apply(smsCodeAuthenticationSecurityConfig).and().apply(appauthSecurityConfig);
	}
}
