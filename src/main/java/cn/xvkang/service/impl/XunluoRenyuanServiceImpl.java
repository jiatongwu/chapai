package cn.xvkang.service.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import cn.xvkang.primaryentity.UserTable;
import cn.xvkang.primarymapperdynamicsql.RoleDynamicSqlMapper;
import cn.xvkang.primarymapperdynamicsql.RoleDynamicSqlSupport;
import cn.xvkang.primarymapperdynamicsql.UserRoleDynamicSqlMapper;
import cn.xvkang.primarymapperdynamicsql.UserRoleDynamicSqlSupport;
import cn.xvkang.primarymapperdynamicsql.UserTableDynamicSqlMapper;
import cn.xvkang.primarymapperdynamicsql.UserTableDynamicSqlSupport;
import cn.xvkang.properties.ApplicationProperties;
import cn.xvkang.service.XunluoRenyuanService;
import cn.xvkang.utils.Constants;
import cn.xvkang.utils.JjwtUtils;
import cn.xvkang.utils.SpringUtils;

@Service
public class XunluoRenyuanServiceImpl implements XunluoRenyuanService {
	private Logger logger = LoggerFactory.getLogger(XunluoRenyuanServiceImpl.class);

	public XunluoRenyuanServiceImpl() {
		logger.debug("XunluoRenyuanServiceImpl constructor");
	}

	@Autowired
	private UserTableDynamicSqlMapper userTableDynamicSqlMapper;
	@SuppressWarnings("unused")
	@Autowired
	private UserRoleDynamicSqlMapper userRoleDynamicSqlMapper;
	@SuppressWarnings("unused")
	@Autowired
	private RoleDynamicSqlMapper roleDynamicSqlMapper;

	private PasswordEncoder passwordEncoder;
	@Autowired
	private RedisTemplate<String, String> redisTemplateString;//

	@Autowired
	private ApplicationProperties applicationProperties;

	@Override
	public String login(String username, String password, String imei) {
		SelectStatementProvider render = SqlBuilder.select(UserTableDynamicSqlSupport.userTable.allColumns())
				.from(UserTableDynamicSqlSupport.userTable, "userTable")
				.leftJoin(UserRoleDynamicSqlSupport.userRole, "userRole")
				.on(UserTableDynamicSqlSupport.userTable.id,
						SqlBuilder.equalTo(UserRoleDynamicSqlSupport.userRole.userId))
				.leftJoin(RoleDynamicSqlSupport.role, "role")
				.on(RoleDynamicSqlSupport.role.id, SqlBuilder.equalTo(UserRoleDynamicSqlSupport.userRole.roleId))
				.where(RoleDynamicSqlSupport.role.code,
						SqlBuilder.isEqualTo(Constants.DEFAULT_ROLES_ENUM.巡逻人员.getCode()))
				.and(UserTableDynamicSqlSupport.username, SqlBuilder.isEqualTo(username)).build()
				.render(RenderingStrategy.MYBATIS3);
		List<UserTable> users = userTableDynamicSqlMapper.selectMany(render);
		if (users.size() > 0) {
			UserTable user = users.get(0);
			String password2 = user.getPassword();
			if (passwordEncoder == null) {
				passwordEncoder = SpringUtils.ac.getBean(PasswordEncoder.class);
			}
			if (passwordEncoder.matches(password, password2)) {
				// 登录成功 返回 jwt
				Map<String, String> extraDataMap = new HashMap<String, String>();
				extraDataMap.put("imei", imei);
				String jwt = JjwtUtils.createJWT(username + "", Constants.JWT_ISSUER, username,
						applicationProperties.getXunluoRenyuan().getJwtExpireTime() * 1000, extraDataMap);
				Calendar c = Calendar.getInstance();
				c.setTime(new Date());
				c.add(Calendar.SECOND,
						new Long(applicationProperties.getXunluoRenyuan().getJwtExpireTime()).intValue());
				// 一个人在同一手机上有可能有多个jwt
				String xunluoRenyuanJwtTokenKey = applicationProperties.getRedisNameSpace() + ":"
						+ Constants.REDIS_JWT_XUNLUO_RENYUAN_PREFIX + username + "_" + imei + "_"
						+ System.currentTimeMillis();
				redisTemplateString.opsForValue().set(xunluoRenyuanJwtTokenKey, jwt);
				redisTemplateString.expireAt(xunluoRenyuanJwtTokenKey, c.getTime());
				// 每一个jwt都代表一个人在一个手机上某一时间登录
				String jwtKey = applicationProperties.getRedisNameSpace() + ":"
						+ Constants.REDIS_JWT_XUNLUO_RENYUAN_PREFIX + jwt;
				redisTemplateString.opsForValue().set(jwtKey, username + "_" + imei);
				redisTemplateString.expireAt(jwtKey, c.getTime());
				return jwt;
			}
		}
		return "";
	}

}
