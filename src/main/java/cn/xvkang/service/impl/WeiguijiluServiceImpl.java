package cn.xvkang.service.impl;

import java.sql.Clob;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
import org.springframework.stereotype.Component;

import com.github.pagehelper.PageHelper;

import cn.xvkang.primarycustommapper.WeiguijiluCustomMapper;
import cn.xvkang.primaryentity.Weiguijilu;
import cn.xvkang.primarymapperdynamicsql.UserTableDynamicSqlSupport;
import cn.xvkang.primarymapperdynamicsql.WeiguijiluDynamicSqlMapper;
import cn.xvkang.primarymapperdynamicsql.WeiguijiluDynamicSqlSupport;
import cn.xvkang.service.WeiguijiluService;
import cn.xvkang.utils.MyPageImpl;

@Component
public class WeiguijiluServiceImpl implements WeiguijiluService {
	@Autowired
	private WeiguijiluCustomMapper weiguijiluCustomMapper;

	@Override
	public int saveOneWeiguijilu(Weiguijilu weiguijilu) {
		return weiguijiluDynamicSqlMapper.insert(weiguijilu);

	}

	@Autowired
	private WeiguijiluDynamicSqlMapper weiguijiluDynamicSqlMapper;

	@Override
	public PageImpl<Map<String, Object>> selectAll(Map<String, Object> params, Integer pageNum, Integer pageSize) {
		QueryExpressionDSL<SelectModel>.QueryExpressionWhereBuilder where = SqlBuilder
				.select(WeiguijiluDynamicSqlSupport.weiguijilu.allColumns(),
						UserTableDynamicSqlSupport.name.as("personName"))
				.from(WeiguijiluDynamicSqlSupport.weiguijilu, "weiguijilu")
				.leftJoin(UserTableDynamicSqlSupport.userTable, "userTable")
				.on(UserTableDynamicSqlSupport.userTable.id, SqlBuilder.equalTo(WeiguijiluDynamicSqlSupport.userId))
				.where();
		String personName = (String) params.get("personName");
		if (StringUtils.isNotBlank(personName)) {
			params.put("personName", "%" + personName + "%");
			where.and(UserTableDynamicSqlSupport.name, SqlBuilder.isLike((String) params.get("personName")));
		}
		String cph = (String) params.get("cph");
		if (StringUtils.isNotBlank(cph)) {
			params.put("cph", "%" + cph + "%");
			where.and(WeiguijiluDynamicSqlSupport.cph, SqlBuilder.isLike((String) params.get("cph")));
		}
		String startTime = (String) params.get("startTime");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		if (StringUtils.isNotBlank(startTime)) {
			try {
				where.and(WeiguijiluDynamicSqlSupport.createtime,
						SqlBuilder.isGreaterThanOrEqualTo(sdf.parse(startTime)));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		String endTime = (String) params.get("endTime");
		if (StringUtils.isNotBlank(endTime)) {
			try {
				where.and(WeiguijiluDynamicSqlSupport.createtime, SqlBuilder.isLessThanOrEqualTo(sdf.parse(endTime)));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}

		String createTimeAsc = (String) params.get("createTimeAsc");
		if (StringUtils.isNotBlank(createTimeAsc)) {
			if ("1".equals(createTimeAsc)) {
				where.orderBy(WeiguijiluDynamicSqlSupport.weiguijilu.createtime);
			} else if ("0".equals(createTimeAsc)) {
				where.orderBy(WeiguijiluDynamicSqlSupport.weiguijilu.createtime.descending());
			}
		}
		SelectStatementProvider render = where.build().render(RenderingStrategy.MYBATIS3);
		;
		PageHelper.startPage(pageNum, pageSize);
		List<Map<String, Object>> selectByExample = weiguijiluCustomMapper.selectMany(render);

		for (Map<String, Object> tmp : selectByExample) {
			Clob clob = (Clob) tmp.get("base64image");
			String base64 = "";
			if (clob != null) {
				try {
					base64 = clob.getSubString(1, (int) clob.length());
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			tmp.put("base64image", base64);
		}

		PageImpl<Map<String, Object>> pageImpl = new MyPageImpl<Map<String, Object>>(selectByExample,
				new PageRequest(pageNum - 1, pageSize),
				((com.github.pagehelper.Page<Map<String, Object>>) selectByExample).getTotal());

		return pageImpl;
	}

	@Override
	public List<Weiguijilu> getBySelectStatementProvider(SelectStatementProvider render) {
		List<Weiguijilu> selectByExample = weiguijiluDynamicSqlMapper.selectMany(render);
		return selectByExample;
	}

	@Override
	public Weiguijilu findById(Integer id) {
		return weiguijiluDynamicSqlMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Weiguijilu> findByExample(SelectStatementProvider selectStatementProvider) {
		return weiguijiluDynamicSqlMapper.selectMany(selectStatementProvider);
	}

}
