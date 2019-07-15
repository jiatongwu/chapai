package cn.xvkang.service;

import java.util.List;

import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;

import cn.xvkang.primaryentity.Log;

public interface LogService {
	public List<Log> findByExample(SelectStatementProvider selectStatementProvider);
}
