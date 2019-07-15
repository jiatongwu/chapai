package cn.xvkang.service.impl;

import java.util.List;

import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xvkang.primaryentity.Log;
import cn.xvkang.primarymapperdynamicsql.LogDynamicSqlMapper;
import cn.xvkang.service.LogService;

@Service
public class LogServiceImpl implements LogService {
	@Autowired
	private LogDynamicSqlMapper logDynamicSqlMapper;

	@Override
	public List<Log> findByExample(SelectStatementProvider selectStatementProvider) {

		return logDynamicSqlMapper.selectMany(selectStatementProvider);
	}

}
