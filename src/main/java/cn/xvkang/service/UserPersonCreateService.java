package cn.xvkang.service;

import java.util.List;

import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;

import cn.xvkang.primaryentity.UserPersonCreate;

public interface UserPersonCreateService {
	public List<UserPersonCreate> findByExample(SelectStatementProvider selectStatementProvider);
}
