package cn.xvkang.service;

import java.util.List;

import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.security.core.Authentication;

import cn.xvkang.primaryentity.Role;

public interface RoleService {
	boolean hasSchoolManagerRole(Authentication authentication);

	public List<Role> findByExample(SelectStatementProvider selectStatementProvider);
}
