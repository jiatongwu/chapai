package cn.xvkang.service.impl;

import java.util.List;

import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xvkang.primaryentity.UserPersonCreate;
import cn.xvkang.primarymapperdynamicsql.UserPersonCreateDynamicSqlMapper;
import cn.xvkang.service.UserPersonCreateService;

@Service
public class UserPersonCreateServiceImpl implements UserPersonCreateService {
	@Autowired
	private UserPersonCreateDynamicSqlMapper userPersonCreateDynamicSqlMapper;

	@Override
	public List<UserPersonCreate> findByExample(SelectStatementProvider selectStatementProvider) {

		return userPersonCreateDynamicSqlMapper.selectMany(selectStatementProvider);
	}

}
