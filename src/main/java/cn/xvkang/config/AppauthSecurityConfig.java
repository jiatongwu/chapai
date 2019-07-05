/**
 * 
 */
package cn.xvkang.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.stereotype.Component;

import cn.xvkang.securiy.appauth.AppLogOutFilter;
import cn.xvkang.securiy.appauth.AppLoginFilter;
import cn.xvkang.securiy.appauth.AppPhoneLoginFilter;
import cn.xvkang.securiy.appauth.AppauthFilter;

/**
 * @author zhailiang
 *
 */
@Component("appauthSecurityConfig")
public class AppauthSecurityConfig extends SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity> {

	@Autowired
	private AppauthFilter appauthFilter;
	@Autowired
	private AppLoginFilter appLoginFilter;
	@Autowired
	private AppLogOutFilter appLogoutFilter;
	@Autowired
	private AppPhoneLoginFilter appPhoneLoginFilter;

	@Override
	public void configure(HttpSecurity http) throws Exception {

		http.addFilterAfter(appauthFilter, UsernamePasswordAuthenticationFilter.class);
		http.addFilterBefore(appPhoneLoginFilter, AppauthFilter.class);
		http.addFilterBefore(appLoginFilter, AppPhoneLoginFilter.class);
		http.addFilterBefore(appLogoutFilter, AppLoginFilter.class);

	}

}
