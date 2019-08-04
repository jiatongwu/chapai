package cn.xvkang.service;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.PageImpl;

import cn.xvkang.primaryentity.Myfaxingssue;
import cn.xvkang.primaryentity.Myjibenziliao;

public interface ChepaiService {

	public PageImpl<Map<String, Object>> selectAllPage(Map<String, Object> params, Integer pageNum, Integer pageSize);

	public int add(Map<String, Object> params);

	public int delete(String id);

	public Myfaxingssue getCarById(String id);

	public int yaqi(String id, String endDate);

	public Map<String, Object> importExcel(InputStream inputStream);

	public Myjibenziliao findByChp(String cph);

	public List<Map<String, Object>> findByCphLike(String cphLike);
}
