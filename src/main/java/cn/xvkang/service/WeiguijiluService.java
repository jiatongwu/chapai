package cn.xvkang.service;

import java.util.List;
import java.util.Map;

import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.data.domain.PageImpl;

import cn.xvkang.primaryentity.Weiguijilu;

public interface WeiguijiluService {

	public int saveOneWeiguijilu(Weiguijilu weiguijilu);

	public PageImpl<Map<String, Object>> selectAll(Map<String, Object> params, Integer pageNum, Integer pageSize);

	public Weiguijilu findById(Integer id);

	public List<Weiguijilu> findByExample(SelectStatementProvider selectStatementProvider);

	public List<Weiguijilu> getBySelectStatementProvider(SelectStatementProvider render);
}
