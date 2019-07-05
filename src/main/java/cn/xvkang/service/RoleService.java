package cn.xvkang.service;

import org.springframework.security.core.Authentication;

public interface RoleService {
	boolean hasSchoolManagerRole(Authentication authentication);
}
