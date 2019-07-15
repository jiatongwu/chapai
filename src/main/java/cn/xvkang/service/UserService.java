package cn.xvkang.service;

import java.util.List;
import java.util.Map;

import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.core.io.Resource;
import org.springframework.data.domain.PageImpl;

import cn.xvkang.dto.UserDto;
import cn.xvkang.primaryentity.UserTable;

public interface UserService {
	UserTable findByUsername(String username);

	UserDto loginFindByUsername(String username);

	public PageImpl<UserTable> selectAll(Map<String, Object> params, Integer pageNum, Integer pageSize);

	public UserTable findById(Integer id);

	public Resource exportUser(Map<String, Object> params);

	public List<UserTable> findByExample(SelectStatementProvider selectStatementProvider);

	public int add(Map<String, Object> params);

	public int edit(Map<String, Object> params);

	public int delete(Map<String, Object> params);

	public int modifyPwd(Integer userId, String newPassword);

	public int resetPwd(Integer userId, String newPassword);

	public int disabled(Integer userId, int disabled);

}
