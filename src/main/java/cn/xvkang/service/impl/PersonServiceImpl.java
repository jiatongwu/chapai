package cn.xvkang.service.impl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;

import cn.xvkang.middle.LogServiceMiddle;
import cn.xvkang.primarycustommapper.BaseCustomMapper;
import cn.xvkang.primaryentity.Myfaxingssue;
import cn.xvkang.primaryentity.Myjibenziliao;
import cn.xvkang.primarymapperdynamicsql.MyfaxingssueDynamicSqlMapper;
import cn.xvkang.primarymapperdynamicsql.MyfaxingssueDynamicSqlSupport;
import cn.xvkang.primarymapperdynamicsql.MyicmoneyDynamicSqlMapper;
import cn.xvkang.primarymapperdynamicsql.MyicmoneyDynamicSqlSupport;
import cn.xvkang.primarymapperdynamicsql.MyicvalidDynamicSqlMapper;
import cn.xvkang.primarymapperdynamicsql.MyicvalidDynamicSqlSupport;
import cn.xvkang.primarymapperdynamicsql.MyjibenziliaoDynamicSqlMapper;
import cn.xvkang.primarymapperdynamicsql.MyjibenziliaoDynamicSqlSupport;
import cn.xvkang.primarymapperdynamicsql.UserPersonCreateDynamicSqlSupport;
import cn.xvkang.primarymapperdynamicsql.UserTableDynamicSqlSupport;
import cn.xvkang.service.PersonService;
import cn.xvkang.utils.Constants;
import cn.xvkang.utils.MyPageImpl;

@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
	private LogServiceMiddle logServiceMiddle;
	@Autowired
	private BaseCustomMapper baseCustomMapper;
	@Autowired
	private MyjibenziliaoDynamicSqlMapper myjibenziliaoDynamicSqlMapper;
	@Autowired
	private MyfaxingssueDynamicSqlMapper myfaxingssueDynamicSqlMapper;
	@Autowired
	private MyicvalidDynamicSqlMapper myicvalidDynamicSqlMapper;
	@Autowired
	private MyicmoneyDynamicSqlMapper myicmoneyDynamicSqlMapper;

	@Override
	public PageImpl<Map<String, Object>> selectAllPage(Map<String, Object> params, Integer pageNum, Integer pageSize) {

		/*
		 * @UserNO='0000018',@UserName='田三',@Sex='男',@HomeAddress='家庭住址',@DeptName='',@
		 * Job='',@WorkTime='2019-07-07 00:00:00',@BirthDate='2019-07-07
		 * 00:00:00',@IDCard='131102199001223011',@MaritalStatus='未婚',@HighestDegree='',
		 * 
		 * @PoliticalStatus='',@PicPath='',@School='',@Speciality='',@ForeignLanguage=''
		 * ,@Skill='',@TelNumber='18293829328',@MobNumber='18293829328',@ZipCode='',@
		 * NativePlace='籍贯',@CPH='',@CarType='',@CarColor='#FFFFFF',@CarPic='',@CarPlace
		 * ='',@PersonPhoto=NULL,@CarPhoto=NULL
		 */
		QueryExpressionDSL<SelectModel>.QueryExpressionWhereBuilder where = SqlBuilder
				.select(MyjibenziliaoDynamicSqlSupport.myjibenziliao.allColumns(), UserTableDynamicSqlSupport.name,
						UserTableDynamicSqlSupport.username.as("createUsername"))
				.from(MyjibenziliaoDynamicSqlSupport.myjibenziliao, "myjibenziliao")
				.leftJoin(UserPersonCreateDynamicSqlSupport.userPersonCreate, "userPersonCreate")
				.on(UserPersonCreateDynamicSqlSupport.userPersonCreate.personId,
						SqlBuilder.equalTo(MyjibenziliaoDynamicSqlSupport.myjibenziliao.id))
				.leftJoin(UserTableDynamicSqlSupport.userTable, "userTable")
				.on(UserPersonCreateDynamicSqlSupport.userPersonCreate.userId,
						SqlBuilder.equalTo(UserTableDynamicSqlSupport.userTable.id))
				.where();
		/*
		 * 
		 * personName personPhone cheBianma chexing chepaihao isInDate createTimeAsc
		 */
		String personName = (String) params.get("personName");
		if (StringUtils.isNotBlank(personName)) {
			params.put("personName", "%" + personName + "%");
			where.and(MyjibenziliaoDynamicSqlSupport.username, SqlBuilder.isLike((String) params.get("personName")));
		}

		String createUserName = (String) params.get("createUserName");
		if (StringUtils.isNotBlank(createUserName)) {
			params.put("createUserName", "%" + createUserName + "%");
			where.and(UserTableDynamicSqlSupport.name, SqlBuilder.isLike((String) params.get("createUserName")));
		}
		String personPhone = (String) params.get("personPhone");
		if (StringUtils.isNotBlank(personPhone)) {
			params.put("personPhone", "%" + personPhone + "%");
			where.and(MyjibenziliaoDynamicSqlSupport.mobnumber, SqlBuilder.isLike((String) params.get("personPhone")));
		}
		String personBianma = (String) params.get("personBianma");
		if (StringUtils.isNotBlank(personBianma)) {
			params.put("personBianma", "%" + personBianma + "%");
			where.and(MyjibenziliaoDynamicSqlSupport.userno, SqlBuilder.isLike((String) params.get("personBianma")));
		}
		String jiguan = (String) params.get("jiguan");
		if (StringUtils.isNotBlank(jiguan)) {
			params.put("jiguan", "%" + jiguan + "%");
			where.and(MyjibenziliaoDynamicSqlSupport.nativeplace, SqlBuilder.isLike((String) params.get("jiguan")));
		}
		String homeAddress = (String) params.get("homeAddress");
		if (StringUtils.isNotBlank(homeAddress)) {
			params.put("homeAddress", "%" + homeAddress + "%");
			where.and(MyjibenziliaoDynamicSqlSupport.homeaddress,
					SqlBuilder.isLike((String) params.get("homeAddress")));
		}
		String createTimeAsc = (String) params.get("createTimeAsc");
		if (StringUtils.isNotBlank(createTimeAsc)) {
			if ("1".equals(createTimeAsc)) {
				where.orderBy(MyjibenziliaoDynamicSqlSupport.myjibenziliao.worktime);
			} else if ("0".equals(createTimeAsc)) {
				where.orderBy(MyjibenziliaoDynamicSqlSupport.myjibenziliao.worktime.descending());
			}
		}
		SelectStatementProvider render = where.build().render(RenderingStrategy.MYBATIS3);
		PageHelper.startPage(pageNum, pageSize);
		List<Map<String, Object>> selectByExample = baseCustomMapper.selectMany(render);// findAll(params);//
																						// signupCustomMapper.findAll(params);
		// signupDynamicSqlMapper
		// .selectMany(where.build().render(RenderingStrategy.MYBATIS3));
		PageImpl<Map<String, Object>> pageImpl = new MyPageImpl<Map<String, Object>>(selectByExample,
				new PageRequest(pageNum - 1, pageSize),
				((com.github.pagehelper.Page<Map<String, Object>>) selectByExample).getTotal());
		return pageImpl;
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
				if ("first_trial".equals(columnKey)) {
					Integer firstTrial = (Integer) object;
					String firstTrialString = "";
					if (firstTrial != null) {
						if (firstTrial.intValue() == 1) {
							firstTrialString = "通过";
						} else if (firstTrial.intValue() == 2) {
							firstTrialString = "未通过";
						}
					}
					cell.setCellValue(firstTrialString);
				} else {
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
				}
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

	public Resource exportStudent(Map<String, Object> params) {

		String name = (String) params.get("name");
		if (StringUtils.isNotBlank(name)) {
			params.put("name", "%" + name + "%");
		}

		String phone = (String) params.get("phone");
		if (StringUtils.isNotBlank(phone)) {
			params.put("phone", "%" + phone + "%");
		}
		String idcard = (String) params.get("idcard");
		if (StringUtils.isNotBlank(idcard)) {
			params.put("idcard", "%" + idcard + "%");
		}

		String regCode = (String) params.get("regCode");
		if (StringUtils.isNotBlank(regCode)) {
			params.put("regCode", "%" + regCode + "%");
		}

		String birthdayStart = (String) params.get("birthdayStart");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		if (StringUtils.isNotBlank(birthdayStart)) {
			try {
				params.put("birthdayStart", sdf.parse(birthdayStart));
			} catch (ParseException e) {
				e.printStackTrace();
				params.put("birthdayStart", null);
			}
		} else {
			params.put("birthdayStart", null);
		}
		String birthdayEnd = (String) params.get("birthdayEnd");
		if (StringUtils.isNotBlank(birthdayEnd)) {
			try {
				params.put("birthdayEnd", sdf.parse(birthdayEnd));
			} catch (ParseException e) {
				e.printStackTrace();
				params.put("birthdayEnd", null);
			}
		} else {
			params.put("birthdayEnd", null);
		}

		List<Map<String, Object>> datas = null;// signupCustomMapper.findAll(params);

		return expExcel(
				Arrays.asList("姓名", "性别", "身份证号", "预约号", "出生年月", "手机号", "户籍", "是否是固定住房", "固定住址", "户口所在地", "父亲姓名",
						"父亲工作单位", "母亲姓名", "母亲工作单位", "初审状态", "审核意见"),
				Arrays.asList("name", "gender", "idcard", "reg_code", "birthday", "phone", "census", "fixed_house",
						"address", "account_location", "father", "father_workunit", "mother", "mother_workunit",
						"first_trial", "first_trial_information"),
				datas);

	}

	@Override
	public int delete(String userno) {
		// List<Myjibenziliao> myjibenziliaos =
		// myjibenziliaoDynamicSqlMapper.selectByExample()
		// .where(MyjibenziliaoDynamicSqlSupport.userno,
		// SqlBuilder.isEqualTo(userno)).build().execute();
		List<String> messages = new ArrayList<>();
		List<Myfaxingssue> myfaxingssues = myfaxingssueDynamicSqlMapper.selectByExample()
				.where(MyfaxingssueDynamicSqlSupport.userno, SqlBuilder.isEqualTo(userno)).build().execute();
		List<Myjibenziliao> myjibenziliaos = myjibenziliaoDynamicSqlMapper.selectByExample()
				.where(MyjibenziliaoDynamicSqlSupport.userno, SqlBuilder.isEqualTo(userno)).build().execute();
		if (myjibenziliaos.size() > 0) {
			Myjibenziliao myjibenziliao = myjibenziliaos.get(0);
			messages.add("删除人员：" + myjibenziliao.getUsername() + ",手机号：" + myjibenziliao.getMobnumber() == null ? ""
					: myjibenziliao.getMobnumber());
		}
		List<String> cphs = new ArrayList<>();
		for (Myfaxingssue myfaxingssue : myfaxingssues) {
			messages.add("删除此人员的车牌：" + myfaxingssue.getCph());
			cphs.add(myfaxingssue.getCph());
			String cardno = myfaxingssue.getCardno();
			myicmoneyDynamicSqlMapper.deleteByExample()
					.where(MyicmoneyDynamicSqlSupport.cardno, SqlBuilder.isEqualTo(cardno)).build().execute();
			myicvalidDynamicSqlMapper.deleteByExample()
					.where(MyicvalidDynamicSqlSupport.cardno, SqlBuilder.isEqualTo(cardno)).build().execute();
			myfaxingssueDynamicSqlMapper.deleteByExample()
					.where(MyfaxingssueDynamicSqlSupport.cardno, SqlBuilder.isEqualTo(cardno)).build().execute();
		}
		Integer deleteResult = myjibenziliaoDynamicSqlMapper.deleteByExample()
				.where(MyjibenziliaoDynamicSqlSupport.userno, SqlBuilder.isEqualTo(userno)).build().execute();
		// 记录删除人员日志
		if (deleteResult.intValue() > 0) {
			if (myjibenziliaos.size() > 0) {
				Myjibenziliao myjibenziliao = myjibenziliaos.get(0);
				logServiceMiddle.insertOperateLog(Constants.LOG_MESSAGE_KEY_ENUM.人员删除.getName(),
						myjibenziliao.getUsername(), myjibenziliao.getMobnumber(), StringUtils.join(cphs, ","), null);
			}
		}
		return 1;
	}

	@Override
	public Myjibenziliao getPersonByUserno(String userno) {
		if (StringUtils.isNotBlank(userno)) {
			List<Myjibenziliao> myjibenziliaos = myjibenziliaoDynamicSqlMapper.selectByExample()
					.where(MyjibenziliaoDynamicSqlSupport.userno, SqlBuilder.isEqualTo(userno)).build().execute();
			if (myjibenziliaos.size() > 0) {
				return myjibenziliaos.get(0);
			}
		}
		return null;
	}

	@Override
	public List<Myfaxingssue> getCarsByUserno(String userno) {
		List<Myfaxingssue> myfaxingssues = myfaxingssueDynamicSqlMapper.selectByExample()
				.where(MyfaxingssueDynamicSqlSupport.userno, SqlBuilder.isEqualTo(userno)).build().execute();
		return myfaxingssues;
	}

	@Override
	public int modifyPhone(String userno, String phone) {
		UpdateStatementProvider render = SqlBuilder.update(MyjibenziliaoDynamicSqlSupport.myjibenziliao)
				.set(MyjibenziliaoDynamicSqlSupport.mobnumber).equalTo(phone == null ? "" : phone)
				.where(MyjibenziliaoDynamicSqlSupport.userno, SqlBuilder.isEqualTo(userno)).build()
				.render(RenderingStrategy.MYBATIS3);

		return myjibenziliaoDynamicSqlMapper.update(render);
	}

	@Override
	public List<Myjibenziliao> selectByExample(SelectStatementProvider selectStatementProvider) {
		return myjibenziliaoDynamicSqlMapper.selectMany(selectStatementProvider);
	}

}
