package cn.xvkang.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectModel;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;

import cn.xvkang.primaryentity.SmsTemplate;
import cn.xvkang.primarymapperdynamicsql.SmsTemplateDynamicSqlMapper;
import cn.xvkang.primarymapperdynamicsql.SmsTemplateDynamicSqlSupport;
import cn.xvkang.service.SmsTemplateService;
import cn.xvkang.utils.MyPageImpl;

@Service
public class SmsTemplateServiceImpl implements SmsTemplateService {
	@Autowired
	private SmsTemplateDynamicSqlMapper smsTemplateDynamicSqlMapper;

	@Override
	public PageImpl<SmsTemplate> selectAll(Map<String, Object> params, Integer pageNum, Integer pageSize) {
		QueryExpressionDSL<SelectModel>.QueryExpressionWhereBuilder where = SqlBuilder
				.select(SmsTemplateDynamicSqlSupport.smsTemplate.allColumns())
				.from(SmsTemplateDynamicSqlSupport.smsTemplate, "smsTemplate").where();
		String name = (String) params.get("name");
		if (StringUtils.isNotBlank(name)) {
			params.put("name", "%" + name + "%");
			where.and(SmsTemplateDynamicSqlSupport.smsTemplate.name, SqlBuilder.isLike((String) params.get("name")));
		}
		String content = (String) params.get("content");
		if (StringUtils.isNotBlank(content)) {
			params.put("content", "%" + content + "%");
			where.and(SmsTemplateDynamicSqlSupport.smsTemplate.content,
					SqlBuilder.isLike((String) params.get("content")));
		}
		String createTimeAsc = (String) params.get("createTimeAsc");
		if (StringUtils.isNotBlank(createTimeAsc)) {
			if ("1".equals(createTimeAsc)) {
				where.orderBy(SmsTemplateDynamicSqlSupport.smsTemplate.createtime);
			} else if ("0".equals(createTimeAsc)) {
				where.orderBy(SmsTemplateDynamicSqlSupport.smsTemplate.createtime.descending());
			}
		}
		SelectStatementProvider render = where.build().render(RenderingStrategy.MYBATIS3);
		PageHelper.startPage(pageNum, pageSize);
		List<SmsTemplate> selectByExample = getBySelectStatementProvider(render);
		PageImpl<SmsTemplate> pageImpl = new MyPageImpl<SmsTemplate>(selectByExample,
				new PageRequest(pageNum - 1, pageSize),
				((com.github.pagehelper.Page<SmsTemplate>) selectByExample).getTotal());
		return pageImpl;
	}

	@Override
	public List<SmsTemplate> getBySelectStatementProvider(SelectStatementProvider render) {
		List<SmsTemplate> selectByExample = smsTemplateDynamicSqlMapper.selectMany(render);
		return selectByExample;
	}

	@Override
	public SmsTemplate findById(Integer id) {
		return smsTemplateDynamicSqlMapper.selectByPrimaryKey(id);
	}

	@Override
	public int add(Map<String, Object> params) {
		String name = (String) params.get("name");
		String content = (String) params.get("content");
		Date now = new Date();
		SmsTemplate smsTemplate = new SmsTemplate();
		smsTemplate.setContent(content);
		smsTemplate.setCreatetime(now);
		smsTemplate.setName(name);
		int userInsertResult = smsTemplateDynamicSqlMapper.insert(smsTemplate);
		return userInsertResult;
	}

	@Override
	public int edit(Map<String, Object> params) {
		String name = (String) params.get("name");
		String content = (String) params.get("content");
		Integer id = Integer.parseInt((String) params.get("id"));
		SmsTemplate smsTemplate = new SmsTemplate();
		smsTemplate.setContent(content);
		smsTemplate.setId(id);
		smsTemplate.setName(name);
		return smsTemplateDynamicSqlMapper.updateByPrimaryKeySelective(smsTemplate);
	}

	@Override
	public List<SmsTemplate> findByExample(SelectStatementProvider selectStatementProvider) {
		return smsTemplateDynamicSqlMapper.selectMany(selectStatementProvider);
	}

	@Override
	public int delete(Map<String, Object> params) {
		Integer id = Integer.parseInt((String) params.get("id"));
		int userDeleteResult = smsTemplateDynamicSqlMapper.deleteByPrimaryKey(id);
		return userDeleteResult;
	}

}
