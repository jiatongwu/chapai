package cn.xvkang.service;

import java.util.Map;

import org.springframework.data.domain.PageImpl;

public interface PersonService {

	
	public PageImpl<Map<String, Object>> selectAllPage(Map<String, Object> params, Integer pageNum, Integer pageSize);

	
}
