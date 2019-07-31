package cn.xvkang.service;

import java.util.List;
import java.util.Map;

import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.data.domain.PageImpl;

import cn.xvkang.primaryentity.Myfaxingssue;
import cn.xvkang.primaryentity.Myjibenziliao;

public interface PersonService {

	public PageImpl<Map<String, Object>> selectAllPage(Map<String, Object> params, Integer pageNum, Integer pageSize);

	public int delete(String userno);

	public Myjibenziliao getPersonByUserno(String userno);

	public List<Myfaxingssue> getCarsByUserno(String userno);

	public int modifyPhone(String userno, String phone);

	public List<Myjibenziliao> selectByExample(SelectStatementProvider selectStatementProvider);

}
