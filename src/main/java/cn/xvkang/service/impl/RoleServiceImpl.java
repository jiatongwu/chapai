package cn.xvkang.service.impl;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import cn.xvkang.service.RoleService;

@Service("roleService")
public class RoleServiceImpl implements RoleService {

	@Override
	public boolean hasSchoolManagerRole(Authentication authentication) {

		return true;
	}

}
