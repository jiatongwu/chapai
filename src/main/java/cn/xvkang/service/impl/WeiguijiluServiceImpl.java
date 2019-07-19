package cn.xvkang.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.xvkang.primaryentity.Weiguijilu;
import cn.xvkang.primarymapperdynamicsql.WeiguijiluDynamicSqlMapper;
import cn.xvkang.service.WeiguijiluService;

@Component
public class WeiguijiluServiceImpl implements WeiguijiluService {
	@Autowired
	private WeiguijiluDynamicSqlMapper weiguijiluDynamicSqlMapper;

	@Override
	public int saveOneWeiguijilu(Weiguijilu weiguijilu) {
		return weiguijiluDynamicSqlMapper.insert(weiguijilu);
	}

}
