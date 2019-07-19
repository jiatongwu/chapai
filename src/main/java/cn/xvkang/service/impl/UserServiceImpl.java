package cn.xvkang.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectModel;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;

import cn.xvkang.dto.UserDto;
import cn.xvkang.primaryentity.Permission;
import cn.xvkang.primaryentity.Role;
import cn.xvkang.primaryentity.UserRole;
import cn.xvkang.primaryentity.UserTable;
import cn.xvkang.primarymapperdynamicsql.PermissionDynamicSqlMapper;
import cn.xvkang.primarymapperdynamicsql.PermissionDynamicSqlSupport;
import cn.xvkang.primarymapperdynamicsql.RoleDynamicSqlMapper;
import cn.xvkang.primarymapperdynamicsql.RoleDynamicSqlSupport;
import cn.xvkang.primarymapperdynamicsql.RolePermissionDynamicSqlSupport;
import cn.xvkang.primarymapperdynamicsql.UserRoleDynamicSqlMapper;
import cn.xvkang.primarymapperdynamicsql.UserRoleDynamicSqlSupport;
import cn.xvkang.primarymapperdynamicsql.UserTableDynamicSqlMapper;
import cn.xvkang.primarymapperdynamicsql.UserTableDynamicSqlSupport;
import cn.xvkang.service.UserService;
import cn.xvkang.utils.Constants;
import cn.xvkang.utils.MyPageImpl;
import cn.xvkang.utils.SpringUtils;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserTableDynamicSqlMapper userTableDynamicSqlMapper;
	@Autowired
	private RoleDynamicSqlMapper roleDynamicSqlMapper;
	@Autowired
	private PermissionDynamicSqlMapper permissionDynamicSqlMapper;
	@Autowired
	private UserRoleDynamicSqlMapper userRoleDynamicSqlMapper;

	private PasswordEncoder passwordEncoder;

	@Override
	public UserTable findByUsername(String username) {
		List<UserTable> users = userTableDynamicSqlMapper.selectByExample()
				.where(UserTableDynamicSqlSupport.username, SqlBuilder.isEqualTo(username)).build().execute();
		if (users.size() > 0) {
			return users.get(0);
		}
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

	@Override
	public PageImpl<UserTable> selectAll(Map<String, Object> params, Integer pageNum, Integer pageSize) {

		QueryExpressionDSL<SelectModel>.QueryExpressionWhereBuilder where = SqlBuilder
				.select(UserTableDynamicSqlSupport.userTable.username, UserTableDynamicSqlSupport.userTable.disabled,
						UserTableDynamicSqlSupport.userTable.id, UserTableDynamicSqlSupport.userTable.createTime,
						UserTableDynamicSqlSupport.userTable.name)
				.from(UserTableDynamicSqlSupport.userTable, "userTable")
				.leftJoin(UserRoleDynamicSqlSupport.userRole, "userRole")
				.on(UserTableDynamicSqlSupport.userTable.id,
						SqlBuilder.equalTo((UserRoleDynamicSqlSupport.userRole.userId)))
				.leftJoin(RoleDynamicSqlSupport.role, "role")
				.on(UserRoleDynamicSqlSupport.userRole.roleId, SqlBuilder.equalTo(RoleDynamicSqlSupport.role.id))
				.where();
		where.and(RoleDynamicSqlSupport.role.code,
				SqlBuilder.isNotEqualTo(Constants.DEFAULT_ROLES_ENUM.超级管理员.getCode()));
		/*
		 * 
		 * personName personPhone cheBianma chexing chepaihao isInDate createTimeAsc
		 */
		String username = (String) params.get("username");
		if (StringUtils.isNotBlank(username)) {
			params.put("username", "%" + username + "%");
			where.and(UserTableDynamicSqlSupport.userTable.username,
					SqlBuilder.isLike((String) params.get("username")));
		}
		String name = (String) params.get("name");
		if (StringUtils.isNotBlank(name)) {
			params.put("name", "%" + name + "%");
			where.and(UserTableDynamicSqlSupport.userTable.name, SqlBuilder.isLike((String) params.get("name")));
		}

		String createTimeAsc = (String) params.get("createTimeAsc");

		if (StringUtils.isNotBlank(createTimeAsc)) {
			if ("1".equals(createTimeAsc)) {
				where.orderBy(UserTableDynamicSqlSupport.userTable.createTime);
			} else if ("0".equals(createTimeAsc)) {
				where.orderBy(UserTableDynamicSqlSupport.userTable.createTime.descending());
			}
		}
		SelectStatementProvider render = where.build().render(RenderingStrategy.MYBATIS3);
		PageHelper.startPage(pageNum, pageSize);
		List<UserTable> selectByExample = userTableDynamicSqlMapper.selectMany(render);
		PageImpl<UserTable> pageImpl = new MyPageImpl<UserTable>(selectByExample,
				new PageRequest(pageNum - 1, pageSize),
				((com.github.pagehelper.Page<UserTable>) selectByExample).getTotal());
		return pageImpl;
	}

	@Override
	public UserTable findById(Integer id) {
		return userTableDynamicSqlMapper.selectByPrimaryKey(id);
	}

	@Override
	public int add(Map<String, Object> params) {
		String username = (String) params.get("username");
		String name = (String) params.get("name");
		String password = (String) params.get("password");

		UserTable userTable = new UserTable();
		userTable.setUsername(username);
		userTable.setDisabled(0);
		userTable.setCreateTime(new Date());
		if (passwordEncoder == null) {
			passwordEncoder = SpringUtils.ac.getBean(PasswordEncoder.class);
		}
		userTable.setPassword(passwordEncoder.encode(password));
		userTable.setSalt("");
		userTable.setName(name);
		int userInsertResult = userTableDynamicSqlMapper.insert(userTable);
		// 默认在这里添加的用户都是普通用户
		UserRole ur = new UserRole();
		List<Role> roles = roleDynamicSqlMapper.selectByExample()
				.where(RoleDynamicSqlSupport.code, SqlBuilder.isEqualTo(Constants.DEFAULT_ROLES_ENUM.普通用户.getCode()))
				.build().execute();
		if (roles.size() > 0) {
			ur.setRoleId(roles.get(0).getId());
		}
		ur.setUserId(userTable.getId());
		userRoleDynamicSqlMapper.insert(ur);
		return userInsertResult;
	}

	@Override
	public int edit(Map<String, Object> params) {
		String name = (String) params.get("name");
		Integer id = Integer.parseInt((String) params.get("id"));
		UserTable userTable = new UserTable();
		userTable.setId(id);
		userTable.setName(name);
		return userTableDynamicSqlMapper.updateByPrimaryKeySelective(userTable);
	}

	@Override
	public List<UserTable> findByExample(SelectStatementProvider selectStatementProvider) {
		return userTableDynamicSqlMapper.selectMany(selectStatementProvider);
	}

	@Override
	public int delete(Map<String, Object> params) {
		Integer id = Integer.parseInt((String) params.get("id"));
		int userDeleteResult = userTableDynamicSqlMapper.deleteByPrimaryKey(id);
		userRoleDynamicSqlMapper.deleteByExample().where(UserRoleDynamicSqlSupport.userId, SqlBuilder.isEqualTo(id))
				.build().execute();
		return userDeleteResult;
	}

	@Override
	public Resource exportUser(Map<String, Object> params) {

		return null;
	}

	@Override
	public int modifyPwd(Integer userId, String newPassword) {
		if (StringUtils.isNotBlank(newPassword)) {
			UserTable user = new UserTable();
			user.setId(userId);
			if (passwordEncoder == null) {
				passwordEncoder = SpringUtils.ac.getBean(PasswordEncoder.class);
			}
			user.setPassword(passwordEncoder.encode(newPassword));
			return userTableDynamicSqlMapper.updateByPrimaryKeySelective(user);
		}
		return 0;
	}

	@Override
	public int resetPwd(Integer userId, String newPassword) {
		if (StringUtils.isNotBlank(newPassword)) {
			UserTable user = new UserTable();
			user.setId(userId);
			if (passwordEncoder == null) {
				passwordEncoder = SpringUtils.ac.getBean(PasswordEncoder.class);
			}
			user.setPassword(passwordEncoder.encode(newPassword));
			return userTableDynamicSqlMapper.updateByPrimaryKeySelective(user);
		}
		return 0;
	}

	@Override
	public int disabled(Integer userId, int disabled) {

		UserTable user = new UserTable();
		user.setId(userId);
		user.setDisabled(disabled);
		return userTableDynamicSqlMapper.updateByPrimaryKeySelective(user);

	}

}
