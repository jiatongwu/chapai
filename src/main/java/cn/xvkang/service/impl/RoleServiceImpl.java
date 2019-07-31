package cn.xvkang.service.impl;

import java.util.List;

import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import cn.xvkang.primaryentity.Role;
import cn.xvkang.primarymapperdynamicsql.RoleDynamicSqlMapper;
import cn.xvkang.service.RoleService;

@Service("roleService")
public class RoleServiceImpl implements RoleService {
	@Autowired
	private RoleDynamicSqlMapper roleDynamicSqlMapper;

	@Override
	public boolean hasSchoolManagerRole(Authentication authentication) {

		return true;
	}

	@Override
	public List<Role> findByExample(SelectStatementProvider selectStatementProvider) {
		return roleDynamicSqlMapper.selectMany(selectStatementProvider);
	}

}
