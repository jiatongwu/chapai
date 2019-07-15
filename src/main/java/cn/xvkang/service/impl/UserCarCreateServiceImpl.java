package cn.xvkang.service.impl;

import java.util.List;

import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xvkang.primaryentity.UserCarCreate;
import cn.xvkang.primarymapperdynamicsql.UserCarCreateDynamicSqlMapper;
import cn.xvkang.service.UserCarCreateService;

@Service
public class UserCarCreateServiceImpl implements UserCarCreateService {
	@Autowired
	private UserCarCreateDynamicSqlMapper userCarCreateDynamicSqlMapper;

	@Override
	public List<UserCarCreate> findByExample(SelectStatementProvider selectStatementProvider) {

		return userCarCreateDynamicSqlMapper.selectMany(selectStatementProvider);
	}

}
