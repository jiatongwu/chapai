package cn.xvkang.service;

import java.util.List;
import java.util.Map;

import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.core.io.Resource;
import org.springframework.data.domain.PageImpl;

import cn.xvkang.primaryentity.SendSmsLog;

public interface SendSmsLogService {

	public List<SendSmsLog> findByExample(SelectStatementProvider selectStatementProvider);

	public PageImpl<Map<String, Object>> selectAll(Map<String, Object> params, Integer pageNum, Integer pageSize);

	public SendSmsLog findById(Integer id);

	public Map<String, Object> findMapById(Integer id);

	public Resource exportSendSmsLog(Map<String, Object> params);

	public int saveOneSendSmsLog(SendSmsLog sendSmsLog);

}
