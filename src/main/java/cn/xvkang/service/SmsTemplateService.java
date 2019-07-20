package cn.xvkang.service;

import java.util.List;
import java.util.Map;

import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.data.domain.PageImpl;

import cn.xvkang.primaryentity.SmsTemplate;

public interface SmsTemplateService {

	public PageImpl<SmsTemplate> selectAll(Map<String, Object> params, Integer pageNum, Integer pageSize);

	public SmsTemplate findById(Integer id);

	public List<SmsTemplate> findByExample(SelectStatementProvider selectStatementProvider);

	public int add(Map<String, Object> params);

	public int edit(Map<String, Object> params);

	public int delete(Map<String, Object> params);

	public List<SmsTemplate> getBySelectStatementProvider(SelectStatementProvider render);
}
