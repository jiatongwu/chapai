package cn.xvkang.securiy;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import cn.xvkang.dto.MyUserDetails;
import cn.xvkang.dto.UserDto;
import cn.xvkang.service.UserService;

@Component
public class MyUserDetailsService implements UserDetailsService {
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private UserService userService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// cn.xvkang.entitydynamicsql.User findByUsername =
		// userService.findByUsername(username);
		System.out.println("123456的密码是:" + passwordEncoder.encode("123456"));
		UserDto userDto = userService.loginFindByUsername(username);
		if (userDto != null) {
			List<String> authorityList = new ArrayList<>();
			authorityList.addAll(userDto.getRoleCodes());
			authorityList.addAll(userDto.getPermissionCodes());
			String join = StringUtils.join(authorityList, ',');
			MyUserDetails myUserDetails = new MyUserDetails(username, userDto.getUser().getPassword(), true, true, true,
					userDto.getUser().getDisabled().intValue() == 1 ? false : true,
					AuthorityUtils.commaSeparatedStringToAuthorityList(join));
			userDto.getUser().setPassword(null);
			userDto.getUser().setSalt(null);
			myUserDetails.setMySystemUser(userDto.getUser());
			myUserDetails.setPermissionCodes(userDto.getPermissionCodes());
			myUserDetails.setPermissions(userDto.getPermissions());
			myUserDetails.setRoleCodes(userDto.getRoleCodes());
			myUserDetails.setRoles(userDto.getRoless());

			return myUserDetails;
		} else {
			throw new UsernameNotFoundException("没有此用户");
		}
	}

}
