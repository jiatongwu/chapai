package cn.xvkang.service.impl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
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
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;

import cn.xvkang.dto.MyUserDetails;
import cn.xvkang.middle.LogServiceMiddle;
import cn.xvkang.primarycustommapper.ChepaiCustomMapper;
import cn.xvkang.primarycustommapper.PersonCustomMapper;
import cn.xvkang.primaryentity.Myfaxingssue;
import cn.xvkang.primaryentity.Myicvalid;
import cn.xvkang.primaryentity.Myjibenziliao;
import cn.xvkang.primaryentity.UserCarCreate;
import cn.xvkang.primaryentity.UserPersonCreate;
import cn.xvkang.primarymapperdynamicsql.MycardtypeDynamicSqlSupport;
import cn.xvkang.primarymapperdynamicsql.MyfaxingssueDynamicSqlMapper;
import cn.xvkang.primarymapperdynamicsql.MyfaxingssueDynamicSqlSupport;
import cn.xvkang.primarymapperdynamicsql.MyicmoneyDynamicSqlMapper;
import cn.xvkang.primarymapperdynamicsql.MyicmoneyDynamicSqlSupport;
import cn.xvkang.primarymapperdynamicsql.MyicvalidDynamicSqlMapper;
import cn.xvkang.primarymapperdynamicsql.MyicvalidDynamicSqlSupport;
import cn.xvkang.primarymapperdynamicsql.MyjibenziliaoDynamicSqlMapper;
import cn.xvkang.primarymapperdynamicsql.MyjibenziliaoDynamicSqlSupport;
import cn.xvkang.primarymapperdynamicsql.UserCarCreateDynamicSqlMapper;
import cn.xvkang.primarymapperdynamicsql.UserCarCreateDynamicSqlSupport;
import cn.xvkang.primarymapperdynamicsql.UserPersonCreateDynamicSqlMapper;
import cn.xvkang.primarymapperdynamicsql.UserPersonCreateDynamicSqlSupport;
import cn.xvkang.primarymapperdynamicsql.UserTableDynamicSqlSupport;
import cn.xvkang.service.ChepaiService;
import cn.xvkang.utils.Constants;
import cn.xvkang.utils.MyPageImpl;
import cn.xvkang.utils.WordExcelUtils;

@Service
public class ChepaiServiceImpl implements ChepaiService {
	private static ThreadLocal<List<String>> importOkMessages = new ThreadLocal<List<String>>();
	@Autowired
	private LogServiceMiddle logServiceMiddle;
	@Autowired
	private ChepaiCustomMapper chepaiCustomMapper;
	@Autowired
	private MyjibenziliaoDynamicSqlMapper myjibenziliaoDynamicSqlMapper;
	@Autowired
	private MyfaxingssueDynamicSqlMapper myfaxingssueDynamicSqlMapper;
	@Autowired
	private MyicvalidDynamicSqlMapper myicvalidDynamicSqlMapper;
	@Autowired
	private MyicmoneyDynamicSqlMapper myicmoneyDynamicSqlMapper;
	@Autowired
	private PersonCustomMapper personCustomMapper;
	@Autowired
	private UserCarCreateDynamicSqlMapper userCarCreateDynamicSqlMapper;
	@Autowired
	private UserPersonCreateDynamicSqlMapper userPersonCreateDynamicSqlMapper;
	// @Autowired
	// private BaseCustomMapper baseCustomMapper;
	public static String startPersonNo = "Z40001";
	public static String startCarno = "Y4000001";

	@Override
	public PageImpl<Map<String, Object>> selectAllPage(Map<String, Object> params, Integer pageNum, Integer pageSize) {

		/*
		 * select f.ID,f.CPH,f.CardNO,t.CardType CarCardType, CASE f.CardState WHEN 0
		 * THEN '正常使用' WHEN 1 THEN '挂失未下载' WHEN 2 THEN '挂失已下载' WHEN 3 THEN '解挂未下载' WHEN
		 * 4 THEN '解挂已下载' WHEN 5 THEN '已注销' END AS
		 * CardState,f.UserNO,m.UserName,f.CarValidStartDate,f.CarValidEndDate,m.
		 * MobNumber,m.HomeAddress,f.Balance,f.CardYJ,f.CarType,f.CarPlace,f.
		 * CarIssueDate,f.CarIssueUserCard ,f.CarValidZone,f.CarMemo
		 * ,f.CarValidMachine,m.ZipCode from dbo.MYFAXINGSSUE f left join MYJIBENZILIAO
		 * m on f.Userno=m.UserNO left JOIN MYCardType t ON t.Identifying =
		 * f.CarCardType where substring(f.SubSystem,1,1)='1' and f.CardState=0 order by
		 * f.CarissueDate desc;
		 */
		QueryExpressionDSL<SelectModel>.QueryExpressionWhereBuilder where = SqlBuilder
				.select(MyjibenziliaoDynamicSqlSupport.myjibenziliao.username,
						MyjibenziliaoDynamicSqlSupport.myjibenziliao.mobnumber,
						MyfaxingssueDynamicSqlSupport.myfaxingssue.cph,
						MyfaxingssueDynamicSqlSupport.myfaxingssue.cardno,
						MyfaxingssueDynamicSqlSupport.myfaxingssue.carvalidstartdate,
						MyfaxingssueDynamicSqlSupport.myfaxingssue.carvalidenddate,
						MyfaxingssueDynamicSqlSupport.myfaxingssue.id,
						MyfaxingssueDynamicSqlSupport.myfaxingssue.cartype,
						MyfaxingssueDynamicSqlSupport.myfaxingssue.carissuedate, UserTableDynamicSqlSupport.name,
						UserTableDynamicSqlSupport.username.as("createUsername"))
				.from(MyfaxingssueDynamicSqlSupport.myfaxingssue, "myfaxingssue")
				.leftJoin(MyjibenziliaoDynamicSqlSupport.myjibenziliao, "myjibenziliao")
				.on(MyfaxingssueDynamicSqlSupport.myfaxingssue.userno,
						SqlBuilder.equalTo(MyjibenziliaoDynamicSqlSupport.myjibenziliao.userno))
				.leftJoin(MycardtypeDynamicSqlSupport.mycardtype, "mycardtype")
				.on(MyfaxingssueDynamicSqlSupport.myfaxingssue.carcardtype,
						SqlBuilder.equalTo(MycardtypeDynamicSqlSupport.mycardtype.identifying))
				.leftJoin(UserCarCreateDynamicSqlSupport.userCarCreate, "userCarCreate")
				.on(UserCarCreateDynamicSqlSupport.userCarCreate.carId,
						SqlBuilder.equalTo(MyfaxingssueDynamicSqlSupport.myfaxingssue.id))
				.leftJoin(UserTableDynamicSqlSupport.userTable, "userTable")
				.on(UserCarCreateDynamicSqlSupport.userCarCreate.userId,
						SqlBuilder.equalTo(UserTableDynamicSqlSupport.userTable.id))
				.where();
		/*
		 * 
		 * personName personPhone cheBianma chexing chepaihao isInDate createTimeAsc
		 */
		String createUserName = (String) params.get("createUserName");
		if (StringUtils.isNotBlank(createUserName)) {
			params.put("createUserName", "%" + createUserName + "%");
			where.and(UserTableDynamicSqlSupport.name, SqlBuilder.isLike((String) params.get("createUserName")));
		}
		String personName = (String) params.get("personName");
		if (StringUtils.isNotBlank(personName)) {
			params.put("personName", "%" + personName + "%");
			where.and(MyjibenziliaoDynamicSqlSupport.username, SqlBuilder.isLike((String) params.get("personName")));
		}
		String personPhone = (String) params.get("personPhone");
		if (StringUtils.isNotBlank(personPhone)) {
			params.put("personPhone", "%" + personPhone + "%");
			where.and(MyjibenziliaoDynamicSqlSupport.mobnumber, SqlBuilder.isLike((String) params.get("personPhone")));
		}
		String cheBianma = (String) params.get("cheBianma");
		if (StringUtils.isNotBlank(cheBianma)) {
			params.put("cheBianma", "%" + cheBianma + "%");
			where.and(MyfaxingssueDynamicSqlSupport.cardno, SqlBuilder.isLike((String) params.get("cheBianma")));
		}
		String chexing = (String) params.get("chexing");
		if (StringUtils.isNotBlank(chexing)) {
			params.put("chexing", "%" + chexing + "%");
			where.and(MyfaxingssueDynamicSqlSupport.cartype, SqlBuilder.isLike((String) params.get("chexing")));
		}
		String chepaihao = (String) params.get("chepaihao");
		if (StringUtils.isNotBlank(chepaihao)) {
			params.put("chepaihao", "%" + chepaihao + "%");
			where.and(MyfaxingssueDynamicSqlSupport.cph, SqlBuilder.isLike((String) params.get("chepaihao")));
		}
		String createTimeAsc = (String) params.get("createTimeAsc");
		String isInDate = (String) params.get("isInDate");
		if (StringUtils.isNotBlank(isInDate)) {
			Date now = new Date();
			if ("1".equals(isInDate)) {
				where.and(MyfaxingssueDynamicSqlSupport.carvalidstartdate, SqlBuilder.isLessThanOrEqualTo(now));
				where.and(MyfaxingssueDynamicSqlSupport.carvalidenddate, SqlBuilder.isGreaterThanOrEqualTo(now));
			} else if ("0".equals(isInDate)) {
				where.and(MyfaxingssueDynamicSqlSupport.carvalidstartdate, SqlBuilder.isGreaterThan(now),
						SqlBuilder.or(MyfaxingssueDynamicSqlSupport.carvalidenddate, SqlBuilder.isLessThan(now)));
			}
		}
		if (StringUtils.isNotBlank(createTimeAsc)) {
			if ("1".equals(createTimeAsc)) {
				where.orderBy(MyfaxingssueDynamicSqlSupport.myfaxingssue.carissuedate);
			} else if ("0".equals(createTimeAsc)) {
				where.orderBy(MyfaxingssueDynamicSqlSupport.myfaxingssue.carissuedate.descending());
			}
		}
		SelectStatementProvider render = where.build().render(RenderingStrategy.MYBATIS3);
		PageHelper.startPage(pageNum, pageSize);
		List<Map<String, Object>> selectByExample = chepaiCustomMapper.selectMany(render);// findAll(params);// //
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

	public static void main(String[] args) {

	}

	@Override
	public int add(Map<String, Object> params) {
		// personName phone homeAddress chepaihao chexing validStart validEnd cheRemark
		Date now = new Date();
		String personName = (String) params.get("personName");
		String phone = (String) params.get("phone");
		String homeAddress = (String) params.get("homeAddress");
		String chepaihao = (String) params.get("chepaihao");
		String chexing = (String) params.get("chexing");
		String validStart = (String) params.get("validStart");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		LocalDateTime yestday = LocalDateTime.now().minusDays(1);
		ZoneId zoneId = ZoneId.systemDefault();
		ZonedDateTime zdt = yestday.atZone(zoneId);
		Date validStartDate = Date.from(zdt.toInstant());
		try {
			validStartDate = sdf.parse(validStart);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		String validEnd = (String) params.get("validEnd");
		LocalDateTime plusMonth = LocalDateTime.now().plusMonths(1);

		ZonedDateTime plusMonthzdt = plusMonth.atZone(zoneId);
		Date validEndDate = Date.from(plusMonthzdt.toInstant());
		;
		try {
			validEndDate = sdf.parse(validEnd);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		String cheRemark = (String) params.get("cheRemark");
		// 新增或修改人员信息
		/**
		 * 
		 * 用户编号userNo
		 * ,@UserName='吴佳同',@Sex='男',@HomeAddress='河北衡水',@DeptName='',@Job='',@WorkTime='2019-07-05
		 * 14:33:04.887',@BirthDate='2019-07-05
		 * 14:33:04.887',@IDCard='',@MaritalStatus='未婚', @HighestDegree='',@PoliticalStatus='',@PicPath='',@School='',@Speciality='',@ForeignLanguage='',@Skill='',@TelNumber=''
		 * ,@MobNumber='13120344930',@ZipCode='1',@NativePlace='',@CPH='冀T2A086',@CarType='蓝鸟', @CarColor='#FFFFFF',@CarPic='',@CarPlace='11车位',@PersonPhoto=NULL,@CarPhoto=NULL
		 */
		String userno = getNextPersonNo();
		Myjibenziliao myjibenziliao = new Myjibenziliao();
		myjibenziliao.setUserno(userno);
		myjibenziliao.setUsername(personName);
		myjibenziliao.setSex("男");
		myjibenziliao.setHomeaddress(homeAddress);
		myjibenziliao.setDeptname("");
		myjibenziliao.setJob("");
		myjibenziliao.setWorktime(now);
		myjibenziliao.setBirthdate(now);
		myjibenziliao.setIdcard("");
		myjibenziliao.setMaritalstatus("未婚");
		myjibenziliao.setHighestdegree("");
		myjibenziliao.setPoliticalstatus("");
		myjibenziliao.setPicpath("");
		myjibenziliao.setSchool("");
		myjibenziliao.setSpeciality("");
		myjibenziliao.setForeignlanguage("");
		myjibenziliao.setSkill("");
		myjibenziliao.setTelnumber("");
		myjibenziliao.setMobnumber(phone);
		myjibenziliao.setZipcode("1");
		myjibenziliao.setNativeplace("");
		myjibenziliao.setCph("");
		myjibenziliao.setCartype("");
		myjibenziliao.setCarcolor("");
		myjibenziliao.setCarpic("");
		myjibenziliao.setCarplace("21");
		myjibenziliao.setPersonphoto(null);
		myjibenziliao.setCarphoto(null);
		int saveOrUpdatePersonByPhone = saveOrUpdatePersonByPhone(myjibenziliao);
		// 新增或修改车牌信息
		/**
		 * CardNO车辆编号 UserNO用户编号 cardState=‘0’ CardYj=0.0000 SubSystem='10000'
		 * CarCardType=FreB,FreA,MthA CarIssueDate=now CarIssueUserCard='888888'
		 * Balance=0.0000 CarValidStartDate CarValidEndDate
		 * CPH='桂A8C088' @CarColor=N'0',@CarType='蓝鸟',@CarPlace='11车位',@CarWithdrawCardDate=now
		 * CarWithdrawOptCard=''
		 * CarValidMachine='FF7FFFFFFFFFFFFFFFFFFFFFFFFFFFFF'这个好像是机号?
		 * CarValidZone='0000000000000000' CarMemo='车辆备注' @MJCardType='2'
		 * MJIssueDate=now MJIssueUserCard='888888',
		 * MJEndDate=now @MJValidStartTime='00'
		 * ,@MJValidEndTime='24', @MJValidMachine='F' @MJWithdrawCardDate=now @MJWithdrawOptCard='',@MJMemo=''
		 * ,@IssueDate=now @WithdrawDate=now,@IssueUserCard='888888', @WithdrawUserCard='',@LossregDate=now
		 * ,@LossregUserCard='',
		 * ,@CardIDNO='',@DownloadSignal='00000000000000000000000000000000000000000000000000'
		 */
		Myfaxingssue myfaxingssue = new Myfaxingssue();
		String cardno = getNextCarNo();
		myfaxingssue.setCardno(cardno);
		myfaxingssue.setUserno(myjibenziliao.getUserno());
		myfaxingssue.setCardstate("0");
		myfaxingssue.setCardyj(new BigDecimal(0.0000d));
		myfaxingssue.setSubsystem("10000");
		myfaxingssue.setCarcardtype("FreB");
		myfaxingssue.setCarissuedate(now);
		myfaxingssue.setCarissueusercard("888888");
		myfaxingssue.setBalance(new BigDecimal(0.0000d));
		myfaxingssue.setCarvalidstartdate(validStartDate);
		myfaxingssue.setCarvalidenddate(validEndDate);
		myfaxingssue.setCph(chepaihao);
		myfaxingssue.setCarcolor("");
		myfaxingssue.setCartype(chexing);
		myfaxingssue.setCarplace("11车位");
		myfaxingssue.setCarwithdrawcarddate(now);
		myfaxingssue.setCarwithdrawoptcard("");

		myfaxingssue.setCarvalidmachine("00000003FFFFFFFFFFFFFFFFFFFFFFFF");
		myfaxingssue.setCarvalidzone("0000000000000000");
		myfaxingssue.setCarmemo(cheRemark);
		myfaxingssue.setMjissuedate(now);
		myfaxingssue.setMjvalidstarttime("00");
		myfaxingssue.setMjvalidendtime("24");
		myfaxingssue.setMjvalidmachine("F");
		myfaxingssue.setMjcardtype("2");
		myfaxingssue.setMjwithdrawcarddate(now);
		myfaxingssue.setMjwithdrawoptcard("");
		myfaxingssue.setMjmemo("");
		myfaxingssue.setIssuedate(now);
		myfaxingssue.setWithdrawdate(now);
		myfaxingssue.setIssueusercard("888888");
		myfaxingssue.setWithdrawusercard("");
		myfaxingssue.setLossregdate(now);
		myfaxingssue.setLossregusercard("");
		myfaxingssue.setCardidno("");
		myfaxingssue.setDownloadsignal("00000000000000000000000000000000000000000000000000");
		myfaxingssue.setCphdownloadsignal("10000000000000000000000000000000000000000000000000");
		int saveOrUpdateChepaiByChepaihao = saveOrUpdateChepaiByChepaihao(myfaxingssue);
		// 新增 Myicvalid表一条数据
		/*
		 * @CardNO='88000004',@OptDate='2019-07-05
		 * 15:54:19.603',@NewStartDate='2019-07-05 00:00:00',@NewEndDate='2019-08-05
		 * 00:00:00',@NewEachDayStartTime=' ',@NewEachDayEndTime=' ',@ValidMachineID='
		 * ',@OperatorCardNO='888888',@OptType='t' * *
		 * 
		 * @CardNO='88000005',@OptDate='2019-07-05
		 * 16:04:52.530',@NewStartDate='2019-07-05 00:00:00',@NewEndDate='2019-08-05
		 * 00:00:00',@NewEachDayStartTime=' ',@NewEachDayEndTime=' ',@ValidMachineID='
		 * ',@OperatorCardNO='888888',@OptType='t'
		 */
		Myicvalid myicvalid = new Myicvalid();
		myicvalid.setCardno(myfaxingssue.getCardno());
		myicvalid.setOptdate(now);
		myicvalid.setNewstartdate(validStartDate);
		myicvalid.setNewenddate(validEndDate);
		myicvalid.setNeweachdaystarttime("");
		myicvalid.setNeweachdayendtime("");
		myicvalid.setValidmachineid("");
		myicvalid.setOperatorcardno("888888");
		myicvalid.setOpttype("t");
		int saveOrUpdateMyIcvalid = saveOrUpdateMyIcvalid(myicvalid);
		if (saveOrUpdateChepaiByChepaihao > 0 && saveOrUpdatePersonByPhone > 0 && saveOrUpdateMyIcvalid > 0) {
			// List<String> messages = new ArrayList<>();
			List<String> list = importOkMessages.get();
			// messages.add("车牌号：" + myfaxingssue.getCph() + ",人员姓名：" +
			// myjibenziliao.getUsername() + ",手机：" + myjibenziliao.getMobnumber() +
			// ",车牌有效时间截止：" + validEnd);
			if (list == null) {
				logServiceMiddle.insertOperateLog(Constants.LOG_MESSAGE_KEY_ENUM.添加车牌.getName(),
						myjibenziliao.getUsername(), myjibenziliao.getMobnumber(), myfaxingssue.getCph(), validEndDate);
			}
			return 1;
		}
		return 0;
	}

	public int saveOrUpdateMyicmoney() {
		// TODO 这个表是否可以不插入数据
		// 一个车多条数据
		/*
		 * @CardNO='88000004',@OptDate='2019-07-05
		 * 15:54:19.597',@SFJE=$200.0000,@OperatorCardNO='888888',@OptType='E',@
		 * NewStartDate='2019-07-05 00:00:00',@NewEndDate='2019-08-05
		 * 00:00:00',@LastEndDate='2019-07-05 00:00:00',@Remark='' *
		 * 
		 * @CardNO='88000005',@OptDate='2019-07-05
		 * 16:04:52.527',@SFJE=$1000.0000,@OperatorCardNO='888888',@OptType='1',@
		 * NewStartDate='2019-07-05 00:00:00',@NewEndDate='2019-08-05
		 * 00:00:00',@LastEndDate='2019-07-05 00:00:00',@Remark=''
		 */
		return 0;
	}

	public int saveOrUpdateMyIcvalid(Myicvalid myicvalid) {
		// 一个车一条数据

		// 为了简单 可以先删除此数据然后统一进行新增

		String cardno = myicvalid.getCardno();

		List<Myicvalid> myicvalids = myicvalidDynamicSqlMapper.selectByExample()
				.where(MyicvalidDynamicSqlSupport.cardno, SqlBuilder.isEqualTo(cardno)).build().execute();
		if (myicvalids.size() > 0) {
			// 更新//为了简单 可以先删除此数据然后统一进行新增
			myicvalidDynamicSqlMapper.deleteByExample()
					.where(MyicvalidDynamicSqlSupport.cardno, SqlBuilder.isEqualTo(cardno)).build().execute();
		}
		// 新增
		return myicvalidDynamicSqlMapper.insert(myicvalid);
		/*
		 * @CardNO='88000004',@OptDate='2019-07-05
		 * 15:54:19.603',@NewStartDate='2019-07-05 00:00:00',@NewEndDate='2019-08-05
		 * 00:00:00',@NewEachDayStartTime=' ',@NewEachDayEndTime=' ',@ValidMachineID='
		 * ',@OperatorCardNO='888888',@OptType='t' * *
		 * 
		 * @CardNO='88000005',@OptDate='2019-07-05
		 * 16:04:52.530',@NewStartDate='2019-07-05 00:00:00',@NewEndDate='2019-08-05
		 * 00:00:00',@NewEachDayStartTime=' ',@NewEachDayEndTime=' ',@ValidMachineID='
		 * ',@OperatorCardNO='888888',@OptType='t'
		 */
	}

	public int saveOrUpdatePersonByPhone(Myjibenziliao myjibenziliao) {
		/**
		 * 
		 * 用户编号userNo
		 * ,@UserName='吴佳同',@Sex='男',@HomeAddress='河北衡水',@DeptName='',@Job='',@WorkTime='2019-07-05
		 * 14:33:04.887',@BirthDate='2019-07-05
		 * 14:33:04.887',@IDCard='',@MaritalStatus='未婚', @HighestDegree='',@PoliticalStatus='',@PicPath='',@School='',@Speciality='',@ForeignLanguage='',@Skill='',@TelNumber='',@MobNumber='13120344930',@ZipCode='1',@NativePlace='',@CPH='冀T2A086',@CarType='蓝鸟', @CarColor='#FFFFFF',@CarPic='',@CarPlace='11车位',@PersonPhoto=NULL,@CarPhoto=NULL
		 */
		String mobnumber = myjibenziliao.getMobnumber();
		List<Myjibenziliao> myjibenziliaos = myjibenziliaoDynamicSqlMapper.selectByExample()
				.where(MyjibenziliaoDynamicSqlSupport.mobnumber, SqlBuilder.isEqualTo(mobnumber)).build().execute();
		if (myjibenziliaos.size() > 0) {
			// 更新//为了简单 可以先删除此数据然后统一进行新增
			myjibenziliao.setUserno(myjibenziliaos.get(0).getUserno());
			myjibenziliaoDynamicSqlMapper.deleteByExample()
					.where(MyjibenziliaoDynamicSqlSupport.mobnumber, SqlBuilder.isEqualTo(mobnumber)).build().execute();
		}
		// 新增
		int insertResult = myjibenziliaoDynamicSqlMapper.insert(myjibenziliao);
		if (insertResult > 0) {
			Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
			MyUserDetails myUserDetails = (MyUserDetails) authentication.getPrincipal();
			saveUserPersonCreateData(myUserDetails.getMySystemUser().getId(), myjibenziliao.getId());
		}
		return insertResult;
	}

	public String getNextCarNo() {
		SelectStatementProvider render = SqlBuilder.select(SqlBuilder.max(MyfaxingssueDynamicSqlSupport.cardno))
				.from(MyfaxingssueDynamicSqlSupport.myfaxingssue)
				.where(MyfaxingssueDynamicSqlSupport.cardno, SqlBuilder.isLike("Y%")).build()
				.render(RenderingStrategy.MYBATIS3);
		String selectMax = chepaiCustomMapper.selectMaxCarno(render);

		if (selectMax == null) {
			return startCarno;
		}
		String substring = selectMax.substring(1, selectMax.length());
		Integer maxCarNo = Integer.parseInt(substring);
		return "Y" + (maxCarNo.intValue() + 1);
	}

	public String getNextPersonNo() {
		SelectStatementProvider render = SqlBuilder.select(SqlBuilder.max(MyjibenziliaoDynamicSqlSupport.userno))
				.from(MyjibenziliaoDynamicSqlSupport.myjibenziliao)
				.where(MyjibenziliaoDynamicSqlSupport.userno, SqlBuilder.isLike("Z%")).build()
				.render(RenderingStrategy.MYBATIS3);
		String selectMax = personCustomMapper.selectMaxPersonno(render);

		if (selectMax == null) {
			return startPersonNo;
		}
		String substring = selectMax.substring(1, selectMax.length());
		Integer maxPersonNo = Integer.parseInt(substring);
		return "Z" + (maxPersonNo.intValue() + 1);

	}

	public int saveOrUpdateChepaiByChepaihao(Myfaxingssue myfaxingssue) {
		/**
		 * CardNO车辆编号 UserNO用户编号 cardState=‘0’ CardYj=0.0000 SubSystem='10000'
		 * CarCardType=FreB,FreA,MthA CarIssueDate=now CarIssueUserCard='888888'
		 * Balance=0.0000 CarValidStartDate CarValidEndDate
		 * CPH='桂A8C088' @CarColor=N'0',@CarType='蓝鸟',@CarPlace='11车位',@CarWithdrawCardDate=now
		 * CarWithdrawOptCard=''
		 * CarValidMachine='FF7FFFFFFFFFFFFFFFFFFFFFFFFFFFFF'这个好像是机号?
		 * CarValidZone='0000000000000000' CarMemo='车辆备注' @MJCardType='2'
		 * MJIssueDate=now MJIssueUserCard='888888',
		 * MJEndDate=now @MJValidStartTime='00'
		 * ,@MJValidEndTime='24', @MJValidMachine='F' @MJWithdrawCardDate=now @MJWithdrawOptCard='',@MJMemo=''
		 * ,@IssueDate=now @WithdrawDate=now,@IssueUserCard='888888', @WithdrawUserCard='',@LossregDate=now
		 * ,@LossregUserCard='',
		 * ,@CardIDNO='',@DownloadSignal='00000000000000000000000000000000000000000000000000'
		 */
		String cph = myfaxingssue.getCph();
		List<Myfaxingssue> myfaxingssues = myfaxingssueDynamicSqlMapper.selectByExample()
				.where(MyfaxingssueDynamicSqlSupport.cph, SqlBuilder.isEqualTo(cph)).build().execute();
		if (myfaxingssues.size() > 0) {
			String oldcardno = myfaxingssues.get(0).getCardno();
			myfaxingssue.setCardno(oldcardno);
			// 更新//为了简单 可以先删除此数据然后统一进行新增
			myfaxingssueDynamicSqlMapper.deleteByExample()
					.where(MyfaxingssueDynamicSqlSupport.cph, SqlBuilder.isEqualTo(cph)).build().execute();
		}
		// 新增
		int insertResult = myfaxingssueDynamicSqlMapper.insert(myfaxingssue);
		if (insertResult > 0) {
			Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
			MyUserDetails myUserDetails = (MyUserDetails) authentication.getPrincipal();
			saveUserCarCreateData(myUserDetails.getMySystemUser().getId(), myfaxingssue.getId());
		}
		return insertResult;
	}

	@Override
	public int delete(String id) {
		Myfaxingssue myfaxingssue = myfaxingssueDynamicSqlMapper.selectByPrimaryKey(Integer.parseInt(id));
		if (myfaxingssue != null) {
			List<Myjibenziliao> myjibenziliaos = myjibenziliaoDynamicSqlMapper.selectByExample()
					.where(MyjibenziliaoDynamicSqlSupport.userno, SqlBuilder.isEqualTo(myfaxingssue.getUserno()))
					.build().execute();
			myicmoneyDynamicSqlMapper.deleteByExample()
					.where(MyicmoneyDynamicSqlSupport.cardno, SqlBuilder.isEqualTo(myfaxingssue.getCardno())).build()
					.execute();
			myicvalidDynamicSqlMapper.deleteByExample()
					.where(MyicvalidDynamicSqlSupport.cardno, SqlBuilder.isEqualTo(myfaxingssue.getCardno())).build()
					.execute();
			Integer deleteResult = myfaxingssueDynamicSqlMapper.deleteByExample()
					.where(MyfaxingssueDynamicSqlSupport.cardno, SqlBuilder.isEqualTo(myfaxingssue.getCardno())).build()
					.execute();
			if (deleteResult.intValue() > 0) {
				List<String> messages = new ArrayList<>();
				messages.add("车牌号：" + myfaxingssue.getCph());
				String operateUsername = "";
				String operateUserPhone = "";
				if (myjibenziliaos.size() > 0) {
					Myjibenziliao myjibenziliao = myjibenziliaos.get(0);
					operateUsername = myjibenziliao.getUsername();
					operateUserPhone = myjibenziliao.getMobnumber();
				}
				logServiceMiddle.insertOperateLog(Constants.LOG_MESSAGE_KEY_ENUM.车牌删除.getName(), operateUsername,
						operateUserPhone, myfaxingssue.getCph(), myfaxingssue.getCarvalidenddate());
			}
			return 1;
		}
		return 1;
	}

	@Override
	public Myfaxingssue getCarById(String id) {
		if (StringUtils.isNotBlank(id)) {
			return myfaxingssueDynamicSqlMapper.selectByPrimaryKey(Integer.parseInt(id));
		}
		return null;
	}

	@Override
	public int yaqi(String id, String endDate) {
		/*
		 * Update MYFAXINGSSUE set
		 * CarValidStartDate=@CarValidStartDate,CarValidEndDate=@CarValidEndDate,
		 * DownloadSignal=@DownloadSignal, CPHDownloadSignal=@CPHDownloadSignal where
		 * CardNO=@CardNO',N'@CarValidStartDate datetime,@CarValidEndDate
		 * datetime,@DownloadSignal varchar(50),@CPHDownloadSignal varchar(50),@CardNO
		 * varchar(8)',
		 * 
		 * @CarValidStartDate='2019-07-02 00:00:00',@CarValidEndDate='2019-07-20
		 * 00:00:00',@DownloadSignal='00000000000000000000000000000000000000000000000000
		 * ',@CPHDownloadSignal='00000000000000000000000000000000000000000000000000',@
		 * CardNO='Y9000001'
		 * 
		 * insert into
		 * MYICMONEY(CardNO,OptDate,SFJE,OperatorCardNO,OptType,NewStartDate,NewEndDate,
		 * LastEndDate,Remark) values
		 * (@CardNO,@OptDate,@SFJE,@OperatorCardNO,@OptType,@NewStartDate,@NewEndDate,@
		 * LastEndDate,@Remark);
		 * 
		 * select @@IDENTITY',N'@CardNO varchar(30),@OptDate datetime,@SFJE
		 * money,@OperatorCardNO varchar(30),@OptType varchar(50),@NewStartDate
		 * datetime,@NewEndDate datetime,@LastEndDate datetime,@Remark varchar(255)',
		 * 
		 * @CardNO='Y9000001',@OptDate='2019-07-12
		 * 11:21:48.257',@SFJE=$0.0000,@OperatorCardNO='888888',@OptType='F',@
		 * NewStartDate='2019-07-02 00:00:00',@NewEndDate='2019-07-20
		 * 00:00:00',@LastEndDate='2019-07-13 00:00:00',@Remark=''
		 */
		Myfaxingssue myfaxingssue = myfaxingssueDynamicSqlMapper.selectByPrimaryKey(Integer.parseInt(id));
		if (myfaxingssue != null) {
			List<Myjibenziliao> myjibenziliaos = myjibenziliaoDynamicSqlMapper.selectByExample()
					.where(MyjibenziliaoDynamicSqlSupport.userno, SqlBuilder.isEqualTo(myfaxingssue.getUserno()))
					.build().execute();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			try {
				UpdateStatementProvider updateStatement = SqlBuilder.update(MyfaxingssueDynamicSqlSupport.myfaxingssue)
						.set(MyfaxingssueDynamicSqlSupport.carvalidenddate).equalTo(sdf.parse(endDate))
						.set(MyfaxingssueDynamicSqlSupport.downloadsignal)
						.equalTo("00000000000000000000000000000000000000000000000000")
						.set(MyfaxingssueDynamicSqlSupport.cphdownloadsignal)
						.equalTo("00000000000000000000000000000000000000000000000000")
						.where(MyfaxingssueDynamicSqlSupport.id, SqlBuilder.isEqualTo(Integer.parseInt(id))).build()
						.render(RenderingStrategy.MYBATIS3);
				int updateResult = myfaxingssueDynamicSqlMapper.update(updateStatement);
				if (updateResult > 0) {
					List<String> messages = new ArrayList<>();
					messages.add("车牌号：" + myfaxingssue.getCph() + ",延期到：" + endDate);
					String operateUsername = "";
					String operateUserPhone = "";

					if (myjibenziliaos.size() > 0) {
						Myjibenziliao myjibenziliao = myjibenziliaos.get(0);
						operateUsername = myjibenziliao.getUsername();
						operateUserPhone = myjibenziliao.getMobnumber();

					}
					logServiceMiddle.insertOperateLog(Constants.LOG_MESSAGE_KEY_ENUM.车牌延期.getName(), operateUsername,
							operateUserPhone, myfaxingssue.getCph(), myfaxingssue.getCarvalidenddate());
				}
				return updateResult;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return 0;
	}

	@SuppressWarnings("unused")
	@Override
	public Map<String, Object> importExcel(InputStream inputStream) {
		importOkMessages.remove();
		importOkMessages.set(new ArrayList<String>());
		Date now = new Date();
		List<String> errorMessages = new ArrayList<String>();
		List<Map<String, Object>> datas = new ArrayList<>();
		Set<String> tmpUniqueKeyUniqueSet = new HashSet<>();
		long errorCount = 0l;
		long successCount = 0l;
		XSSFWorkbook xssfWorkbook;
		try {
			xssfWorkbook = new XSSFWorkbook(inputStream);
			XSSFSheet sheetAt = xssfWorkbook.getSheetAt(0);
			for (int i = 1; i < 1048576; i++) {
				// 处理每一行
				XSSFRow row = sheetAt.getRow(i);
				if (row == null) {
					// 最后一行了，终止处理。
					break;
				}
				XSSFCell nameCell = row.getCell(0);
				String nameCellString = WordExcelUtils.getCellStringValue(nameCell);
				if (StringUtils.isBlank(nameCellString)) {
					// 最后一行了，终止处理。
					break;
				}
				XSSFCell phoneCell = row.getCell(1);
				XSSFCell cphCell = row.getCell(2);
				XSSFCell chexingCell = row.getCell(3);
				XSSFCell validStartCell = row.getCell(4);
				XSSFCell validEndCell = row.getCell(5);
				XSSFCell cheRemarkCell = row.getCell(6);

				String phoneCellString = WordExcelUtils.getCellStringValue(phoneCell);
				String cphCellString = WordExcelUtils.getCellStringValue(cphCell);
				String chexingCellString = WordExcelUtils.getCellStringValue(chexingCell);
				String validStartCellString = WordExcelUtils.getCellStringValue(validStartCell);
				String validEndCellString = WordExcelUtils.getCellStringValue(validEndCell);
				String cheRemarkCellString = WordExcelUtils.getCellStringValue(cheRemarkCell);

				boolean isDataFormatOk = true;

				StringBuilder errorMsgStringBuilder = new StringBuilder();
				errorMsgStringBuilder.append("第" + (i + 1) + "行：");

				if (StringUtils.isBlank(nameCellString)) {
					isDataFormatOk = false;
					errorMsgStringBuilder.append(" 联系人姓名不能为空 ");
				}
				if (StringUtils.isBlank(phoneCellString)) {
					isDataFormatOk = false;
					errorMsgStringBuilder.append(" 联系人手机号不能为空 ");
				}
				if (StringUtils.isBlank(cphCellString)) {
					isDataFormatOk = false;
					errorMsgStringBuilder.append(" 车牌号不能为空 ");
				}
				if (StringUtils.isBlank(chexingCellString)) {
					isDataFormatOk = false;
					errorMsgStringBuilder.append(" 车型不能为空 ");
				}
				if (StringUtils.isBlank(validStartCellString)) {
					isDataFormatOk = false;
					errorMsgStringBuilder.append(" 有效期起始日不能为空 ");
				} else {
					if (!(validStartCellString.matches("^\\d{4}-\\d{1,2}-\\d{1,2}$")
							|| validStartCellString.matches("^\\d{4}年\\d{1,2}月\\d{1,2}日$"))) {
						isDataFormatOk = false;
						errorMsgStringBuilder.append(" 有效期起始日格式不正确 ");
					}
//					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//					try {
//						sdf.parse(validStartCellString);
//					} catch (ParseException e) {
//						isDataFormatOk = false;
//						errorMsgStringBuilder.append("有效期起始日格式不正确 ");
//					}
				}
				if (StringUtils.isBlank(validEndCellString)) {
					isDataFormatOk = false;
					errorMsgStringBuilder.append(" 有效期止日不能为空 ");
				} else {
					if (!(validEndCellString.matches("^\\d{4}-\\d{1,2}-\\d{1,2}$")
							|| validEndCellString.matches("^\\d{4}年\\d{1,2}月\\d{1,2}日$"))) {
						isDataFormatOk = false;
						errorMsgStringBuilder.append(" 有效期止日格式不正确 ");
					}
				}
				if (isDataFormatOk) {
					Map<String, Object> tmpData = new HashMap<String, Object>();
					tmpData.put("personName", nameCellString);
					tmpData.put("phone", phoneCellString);
					tmpData.put("homeAddress", " ");
					tmpData.put("chepaihao", cphCellString);
					tmpData.put("chexing", chexingCellString);
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
					SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
					if (validStartCellString.matches("^\\d{4}年\\d{1,2}月\\d{1,2}日$")) {
						try {
							validStartCellString = sdf2.format(sdf.parse(validStartCellString));
						} catch (Exception e) {
						}
					}
					if (validEndCellString.matches("^\\d{4}年\\d{1,2}月\\d{1,2}日$")) {
						try {
							validEndCellString = sdf2.format(sdf.parse(validEndCellString));
						} catch (Exception e) {
						}
					}
					tmpData.put("validStart", validStartCellString);
					tmpData.put("validEnd", validEndCellString);
					tmpData.put("cheRemark", cheRemarkCellString);
					datas.add(tmpData);
				} else {
					// 有格式不正确的行 ，提示给用户
					errorMessages.add(errorMsgStringBuilder.toString());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 批量插入学生信息
		List<Map<String, String>> batchImportExcelStudent = batchImportExcel(datas);
		successCount = datas.size() - batchImportExcelStudent.size();
		errorCount = errorMessages.size() + batchImportExcelStudent.size();

		for (Map<String, String> tmp : batchImportExcelStudent) {
			String chepaihao = tmp.get("chepaihao");
			String phone = tmp.get("phone");
			errorMessages.add("联系人手机：" + phone + ",车牌号" + chepaihao + " 导入失败，请联系管理员。");
		}
		Map<String, Object> result = new HashMap<>();
		result.put("state", "ok");
		result.put("msg", "导入成功" + successCount + "个学生");
		result.put("errorMessages", errorMessages);
		result.put("successCount", successCount);
		result.put("errorCount", errorCount);
		// 插入日志
		// List<String> messageLists = importOkMessages.get();

		importOkMessages.remove();
		return result;
	}

	private List<Map<String, String>> batchImportExcel(List<Map<String, Object>> datas) {
		List<Map<String, String>> result = new ArrayList<Map<String, String>>();
		for (Map<String, Object> s : datas) {
			int addResult = add(s);
			if (addResult == 0) {
				Map<String, String> errorStudent = new HashMap<String, String>();
				errorStudent.put("phone", (String) s.get("phone"));
				errorStudent.put("chepaihao", (String) s.get("chepaihao"));
				result.add(errorStudent);
			} else {
				// 导入一个成功记录日志
				String personName = (String) s.get("personName");
				String phone = (String) s.get("phone");
				String chepaihao = (String) s.get("chepaihao");
				// messages.add("人员姓名：" + personName + ",手机：" + phone + ",家庭住址：" + homeAddress +
				// ",车牌号：" + chepaihao + ",车型：" + chexing + ",有效时间起日：" + validStart + ",有效时间止日："
				// + validEnd + ",车牌备注：" + cheRemark);
				String validStart = (String) s.get("validStart");
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				Date validStartDate = null;
				try {
					validStartDate = sdf.parse(validStart);
				} catch (Exception e) {
				}
				logServiceMiddle.insertOperateLog(Constants.LOG_MESSAGE_KEY_ENUM.批量导入车牌.getName(), personName, phone,
						chepaihao, validStartDate);
			}
		}
		return result;
	}

	private void saveUserCarCreateData(Integer userId, Integer carId) {
		List<UserCarCreate> userCarCreates = userCarCreateDynamicSqlMapper.selectByExample()
				.where(UserCarCreateDynamicSqlSupport.userId, SqlBuilder.isEqualTo(userId))
				.and(UserCarCreateDynamicSqlSupport.carId, SqlBuilder.isEqualTo(carId)).build().execute();
		if (userCarCreates.size() > 0) {
			// 更新时间
			UserCarCreate userCarCreate = userCarCreates.get(0);
			userCarCreate.setCreatetime(new Date());
			userCarCreateDynamicSqlMapper.updateByPrimaryKey(userCarCreate);
		} else {
			UserCarCreate userCarCreate = new UserCarCreate();
			userCarCreate.setCarId(carId);
			userCarCreate.setUserId(userId);
			userCarCreate.setCreatetime(new Date());
			userCarCreateDynamicSqlMapper.insert(userCarCreate);
		}
	}

	private void saveUserPersonCreateData(Integer userId, Integer personId) {
		List<UserPersonCreate> userPersonCreates = userPersonCreateDynamicSqlMapper.selectByExample()
				.where(UserPersonCreateDynamicSqlSupport.userId, SqlBuilder.isEqualTo(userId))
				.and(UserPersonCreateDynamicSqlSupport.personId, SqlBuilder.isEqualTo(personId)).build().execute();
		if (userPersonCreates.size() > 0) {
			// 更新时间
			UserPersonCreate userPersonCreate = userPersonCreates.get(0);
			userPersonCreate.setCreatetime(new Date());
			userPersonCreateDynamicSqlMapper.updateByPrimaryKey(userPersonCreate);
		} else {
			UserPersonCreate userPersonCreate = new UserPersonCreate();
			userPersonCreate.setUserId(userId);
			userPersonCreate.setPersonId(personId);
			userPersonCreate.setCreatetime(new Date());
			userPersonCreateDynamicSqlMapper.insert(userPersonCreate);
		}
	}

	@Override
	public Myjibenziliao findByChp(String cph) {
		SelectStatementProvider render = SqlBuilder.select(MyjibenziliaoDynamicSqlSupport.myjibenziliao.allColumns())
				.from(MyjibenziliaoDynamicSqlSupport.myjibenziliao, "myjibenziliao")
				.leftJoin(MyfaxingssueDynamicSqlSupport.myfaxingssue, "myfaxingssue")
				.on(MyjibenziliaoDynamicSqlSupport.userno, SqlBuilder.equalTo(MyfaxingssueDynamicSqlSupport.userno))
				.where(MyfaxingssueDynamicSqlSupport.cph, SqlBuilder.isEqualTo(cph)).build()
				.render(RenderingStrategy.MYBATIS3);
		List<Myjibenziliao> myjibenziliaos = myjibenziliaoDynamicSqlMapper.selectMany(render);
		if (myjibenziliaos.size() > 0) {
			return myjibenziliaos.get(0);
		}
		return null;
	}
}
