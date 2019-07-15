package cn.xvkang.service;

import java.util.List;

import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;

import cn.xvkang.primaryentity.UserCarCreate;

public interface UserCarCreateService {
	public List<UserCarCreate> findByExample(SelectStatementProvider selectStatementProvider);
}
