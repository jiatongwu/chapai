package cn.xvkang.service.impl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectModel;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;

import cn.xvkang.primarycustommapper.SendSmsLogCustomMapper;
import cn.xvkang.primaryentity.Myjibenziliao;
import cn.xvkang.primaryentity.SendSmsLog;
import cn.xvkang.primarymapperdynamicsql.MyjibenziliaoDynamicSqlMapper;
import cn.xvkang.primarymapperdynamicsql.MyjibenziliaoDynamicSqlSupport;
import cn.xvkang.primarymapperdynamicsql.SendSmsLogDynamicSqlMapper;
import cn.xvkang.primarymapperdynamicsql.SendSmsLogDynamicSqlSupport;
import cn.xvkang.primarymapperdynamicsql.UserTableDynamicSqlSupport;
import cn.xvkang.service.SendSmsLogService;
import cn.xvkang.utils.MyPageImpl;

@Service
public class SendSmsLogServiceImpl implements SendSmsLogService {
	@Autowired
	private SendSmsLogDynamicSqlMapper sendSmsLogDynamicSqlMapper;
	@Autowired
	private SendSmsLogCustomMapper sendSmsLogCustomMapper;
	@Autowired
	private MyjibenziliaoDynamicSqlMapper myjibenziliaoDynamicSqlMapper;

	@Override
	public List<SendSmsLog> findByExample(SelectStatementProvider selectStatementProvider) {
		return sendSmsLogDynamicSqlMapper.selectMany(selectStatementProvider);
	}

	@Override
	public PageImpl<Map<String, Object>> selectAll(Map<String, Object> params, Integer pageNum, Integer pageSize) {
		List<Map<String, Object>> selectByExample = selectAllByParameter(params, pageNum, pageSize, true);
		PageImpl<Map<String, Object>> pageImpl = new MyPageImpl<Map<String, Object>>(selectByExample,
				new PageRequest(pageNum - 1, pageSize),
				((com.github.pagehelper.Page<Map<String, Object>>) selectByExample).getTotal());
		return pageImpl;
	}

	private List<Map<String, Object>> selectAllByParameter(Map<String, Object> params, Integer pageNum,
			Integer pageSize, boolean isPage) {
		QueryExpressionDSL<SelectModel>.QueryExpressionWhereBuilder where = SqlBuilder
				.select(SendSmsLogDynamicSqlSupport.sendSmsLog.allColumns(), UserTableDynamicSqlSupport.userTable.name,
						UserTableDynamicSqlSupport.userTable.username
				// where(id, isIn(select(id).from(employee).where(firstName,isEqualTo("Bob"),
				// or(firstName, isEqualTo("Alice")))))) )))
				// SqlBuilder.select(MyjibenziliaoDynamicSqlSupport.username).from(MyjibenziliaoDynamicSqlSupport.myjibenziliao)
				// .where(MyjibenziliaoDynamicSqlSupport.mobnumber,SqlBuilder.isEqualTo(SendSmsLogDynamicSqlSupport.phone)))
				).from(SendSmsLogDynamicSqlSupport.sendSmsLog, "sendSmsLog")
				.leftJoin(UserTableDynamicSqlSupport.userTable, "userTable")
				.on(SendSmsLogDynamicSqlSupport.sendSmsLog.userId,
						SqlBuilder.equalTo((UserTableDynamicSqlSupport.userTable.id)))
				.where();
		String username = (String) params.get("username");
		if (StringUtils.isNotBlank(username)) {
			params.put("username", "%" + username + "%");
			where.and(UserTableDynamicSqlSupport.userTable.username,
					SqlBuilder.isLike((String) params.get("username")));
		}
		String phone = (String) params.get("phone");
		if (StringUtils.isNotBlank(phone)) {
			params.put("phone", "%" + phone + "%");
			where.and(SendSmsLogDynamicSqlSupport.phone, SqlBuilder.isLike((String) params.get("phone")));
		}
		String cph = (String) params.get("cph");
		if (StringUtils.isNotBlank(cph)) {
			params.put("cph", "%" + cph + "%");
			where.and(SendSmsLogDynamicSqlSupport.cph, SqlBuilder.isLike((String) params.get("cph")));
		}

		String ownerName = (String) params.get("ownerName");
		if (StringUtils.isNotBlank(ownerName)) {
			params.put("ownerName", "%" + ownerName + "%");
			where.and(SendSmsLogDynamicSqlSupport.phone,
					SqlBuilder.isIn(SqlBuilder.select(MyjibenziliaoDynamicSqlSupport.mobnumber)
							.from(MyjibenziliaoDynamicSqlSupport.myjibenziliao).where()
							.and(MyjibenziliaoDynamicSqlSupport.username,
									SqlBuilder.isLike((String) params.get("ownerName")))));
		}

		String startTime = (String) params.get("startTime");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		if (StringUtils.isNotBlank(startTime)) {
			try {
				where.and(SendSmsLogDynamicSqlSupport.createtime,
						SqlBuilder.isGreaterThanOrEqualTo(sdf.parse(startTime)));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		String endTime = (String) params.get("endTime");
		if (StringUtils.isNotBlank(endTime)) {
			try {
				where.and(SendSmsLogDynamicSqlSupport.createtime, SqlBuilder.isLessThanOrEqualTo(sdf.parse(endTime)));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		String name = (String) params.get("name");
		if (StringUtils.isNotBlank(name)) {
			params.put("name", "%" + name + "%");
			where.and(UserTableDynamicSqlSupport.userTable.name, SqlBuilder.isLike((String) params.get("name")));
		}
		String createTimeAsc = (String) params.get("createTimeAsc");
		if (StringUtils.isNotBlank(createTimeAsc)) {
			if ("1".equals(createTimeAsc)) {
				where.orderBy(SendSmsLogDynamicSqlSupport.sendSmsLog.createtime);
			} else if ("0".equals(createTimeAsc)) {
				where.orderBy(SendSmsLogDynamicSqlSupport.sendSmsLog.createtime.descending());
			}
		}
		SelectStatementProvider render = where.build().render(RenderingStrategy.MYBATIS3);
		if (isPage) {
			PageHelper.startPage(pageNum, pageSize);
		}
		List<Map<String, Object>> selectByExample = sendSmsLogCustomMapper.selectMany(render);
		for (Map<String, Object> tmp : selectByExample) {
			List<Myjibenziliao> myjibenziliaos = myjibenziliaoDynamicSqlMapper.selectByExample()
					.where(MyjibenziliaoDynamicSqlSupport.mobnumber, SqlBuilder.isEqualTo((String) tmp.get("phone")))
					.build().execute();
			if (myjibenziliaos.size() > 0) {
				String ownerNameTmp = myjibenziliaos.get(0).getUsername();
				tmp.put("ownerName", ownerNameTmp);
			}
		}
		return selectByExample;
	}

	@Override
	public SendSmsLog findById(Integer id) {
		return sendSmsLogDynamicSqlMapper.selectByPrimaryKey(id);
	}

	@Override
	public Map<String, Object> findMapById(Integer id) {
		QueryExpressionDSL<SelectModel>.QueryExpressionWhereBuilder where = SqlBuilder
				.select(SendSmsLogDynamicSqlSupport.sendSmsLog.allColumns(), UserTableDynamicSqlSupport.userTable.name,
						UserTableDynamicSqlSupport.userTable.username)
				.from(SendSmsLogDynamicSqlSupport.sendSmsLog, "sendSmsLog")
				.leftJoin(UserTableDynamicSqlSupport.userTable, "userTable")
				.on(SendSmsLogDynamicSqlSupport.sendSmsLog.userId,
						SqlBuilder.equalTo((UserTableDynamicSqlSupport.userTable.id)))
				.where(SendSmsLogDynamicSqlSupport.id, SqlBuilder.isEqualTo(id));
		SelectStatementProvider render = where.build().render(RenderingStrategy.MYBATIS3);
		List<Map<String, Object>> selectByExample = sendSmsLogCustomMapper.selectMany(render);
		if (selectByExample.size() > 0) {
			Map<String, Object> map = selectByExample.get(0);
			return map;
		}
		return null;
	}

	/**
	 * 导出Excel
	 * 
	 * @return
	 */
	public Resource expExcel(List<String> headers, List<String> attrs, List<Map<String, Object>> contents) {
		// 标题长度
		int len = headers.size();
		// 内容大小
		int size = contents.size();
		// 表格宽度
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("sheet1");
		for (int i = 0; i < len; i++) {
			sheet.setColumnWidth(i, 25 * 256);
			// sheet.autoSizeColumn(i);
		}
		// 居中
		CellStyle style = workbook.createCellStyle();
		style.setAlignment(HorizontalAlignment.CENTER);
		// style.setAlignment(CellStyle.ALIGN_CENTER);
		// style.setVerticalAlignment(CellStyle.VERTICAL_CENTER);
		style.setVerticalAlignment(VerticalAlignment.CENTER);
		// 字体
		Font font = workbook.createFont();
		font.setFontName("宋体");
		font.setFontHeightInPoints((short) 12);
		style.setFont(font);
		// 文本格式
		DataFormat format = workbook.createDataFormat();
		style.setDataFormat(format.getFormat("@"));
		// 标题
		Row row = sheet.createRow(0);
		Cell cell = null;
		for (int i = 0; i < len; i++) {
			cell = row.createCell(i);
			cell.setCellValue(headers.get(i));
			cell.setCellStyle(style);
		}
		// 内容
		for (int i = 0; i < size; i++) {
			row = sheet.createRow(i + 1);
			Map<String, Object> content = contents.get(i);
			for (int j = 0; j < len; j++) {
				cell = row.createCell(j);
				String columnKey = attrs.get(j);
				Object object = content.get(columnKey);
//				if ("first_trial".equals(columnKey)) {
//					Integer firstTrial = (Integer) object;
//					String firstTrialString = "";
//					if (firstTrial != null) {
//						if (firstTrial.intValue() == 1) {
//							firstTrialString = "通过";
//						} else if (firstTrial.intValue() == 2) {
//							firstTrialString = "未通过";
//						}
//					}
//					cell.setCellValue(firstTrialString);
//				} else {
				String value = "";
				if (object != null) {
					if (object instanceof Date) {
						SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
						value = sdf.format((Date) object);
					}
					if (object instanceof Integer) {
						value = ((Integer) object).intValue() + "";
					}
					if (object instanceof String) {
						value = (String) object;
					}
				}
				cell.setCellValue(value);
				// }
				cell.setCellStyle(style);
			}
		}
		// 写入输出流
		try {
			ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
			workbook.write(byteArrayOutputStream);
			InputStreamResource isr = new InputStreamResource(
					new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
			return isr;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				workbook.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public Resource exportSendSmsLog(Map<String, Object> params) {
		List<Map<String, Object>> datas = selectAllByParameter(params, 0, 0, false);

		return expExcel(Arrays.asList("操作人", "发短信时间", "汽车所有人", "手机号", "车牌号", "发送短信内容"),
				Arrays.asList("name", "createtime", "ownerName", "phone", "chp", "sms_message"), datas);
	}

	@Override
	public int saveOneSendSmsLog(SendSmsLog sendSmsLog) {
		return sendSmsLogDynamicSqlMapper.insert(sendSmsLog);
	}
}
