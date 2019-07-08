package cn.xvkang.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xvkang.dto.UserDto;
import cn.xvkang.primaryentity.Permission;
import cn.xvkang.primaryentity.Role;
import cn.xvkang.primaryentity.UserTable;
import cn.xvkang.primarymapperdynamicsql.PermissionDynamicSqlMapper;
import cn.xvkang.primarymapperdynamicsql.PermissionDynamicSqlSupport;
import cn.xvkang.primarymapperdynamicsql.RoleDynamicSqlMapper;
import cn.xvkang.primarymapperdynamicsql.RoleDynamicSqlSupport;
import cn.xvkang.primarymapperdynamicsql.RolePermissionDynamicSqlSupport;
import cn.xvkang.primarymapperdynamicsql.UserRoleDynamicSqlSupport;
import cn.xvkang.primarymapperdynamicsql.UserTableDynamicSqlMapper;
import cn.xvkang.primarymapperdynamicsql.UserTableDynamicSqlSupport;
import cn.xvkang.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserTableDynamicSqlMapper userTableDynamicSqlMapper;
	// @Autowired
	// private UserRoleDynamicSqlMapper userRoleDynamicSqlMapper;
	@Autowired
	private RoleDynamicSqlMapper roleDynamicSqlMapper;
	// @Autowired
	// private RolePermissionDynamicSqlMapper rolePermissionDynamicSqlMapper;
	@Autowired
	private PermissionDynamicSqlMapper permissionDynamicSqlMapper;

	@Override
	public UserTable findByUsername(String username) {
//		List<User> users = userDynamicSqlMapper.selectByExample()
//				.where(UserDynamicSqlSupport.username, SqlBuilder.isEqualTo(username)).build().execute();
//		if (users.size() > 0) {
//			return users.get(0);
//		}
		return null;
	}

	@Override
	public UserDto loginFindByUsername(String username) {
		List<UserTable> users = userTableDynamicSqlMapper.selectByExample()
				.where(UserTableDynamicSqlSupport.username, SqlBuilder.isEqualTo(username)).build().execute();
		if (users.size() > 0) {
			UserTable u = users.get(0);
			Integer userId = u.getId();

			SelectStatementProvider roleProvider = SqlBuilder
					.select(RoleDynamicSqlSupport.id, RoleDynamicSqlSupport.code, RoleDynamicSqlSupport.name)
					.from(RoleDynamicSqlSupport.role, "r").leftJoin(UserRoleDynamicSqlSupport.userRole, "ur")
					.on(RoleDynamicSqlSupport.role.id, SqlBuilder.equalTo(UserRoleDynamicSqlSupport.userRole.roleId))
					.where(UserRoleDynamicSqlSupport.userId, SqlBuilder.isEqualTo(userId)).build()
					.render(RenderingStrategy.MYBATIS3);
			;
			List<Role> roles = roleDynamicSqlMapper.selectMany(roleProvider);
			List<String> roleStrings = roles.stream().map((item) -> {
				String code = item.getCode();
				return "ROLE_" + code;
			}).collect(Collectors.toList());
			UserDto userDto = new UserDto();

			SelectStatementProvider permissionProvider = SqlBuilder
					.select(PermissionDynamicSqlSupport.id, PermissionDynamicSqlSupport.code,
							PermissionDynamicSqlSupport.name)
					.from(PermissionDynamicSqlSupport.permission, "p")
					.leftJoin(RolePermissionDynamicSqlSupport.rolePermission, "rp")
					.on(PermissionDynamicSqlSupport.permission.id,
							SqlBuilder.equalTo(RolePermissionDynamicSqlSupport.rolePermission.permissionId))

					.where(RolePermissionDynamicSqlSupport.roleId, SqlBuilder.isIn()).build()
					.render(RenderingStrategy.MYBATIS3);
			List<Permission> permissions = permissionDynamicSqlMapper.selectMany(permissionProvider);
			List<String> permissionStrings = permissions.stream().map((item) -> {
				String code = item.getCode();
				return code;
			}).collect(Collectors.toList());

			userDto.setPermissions(permissions);
			userDto.setUser(u);
			userDto.setPermissionCodes(permissionStrings);
			userDto.setRoless(roles);
			userDto.setRoleCodes(roleStrings);

			return userDto;
		}
		return null;
	}

}
