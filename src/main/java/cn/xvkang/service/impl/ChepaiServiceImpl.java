package cn.xvkang.service.impl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
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

import cn.xvkang.primarycustommapper.ChepaiCustomMapper;
import cn.xvkang.primarycustommapper.PersonCustomMapper;
import cn.xvkang.primaryentity.Myfaxingssue;
import cn.xvkang.primaryentity.Myicvalid;
import cn.xvkang.primaryentity.Myjibenziliao;
import cn.xvkang.primarymapperdynamicsql.MycardtypeDynamicSqlSupport;
import cn.xvkang.primarymapperdynamicsql.MyfaxingssueDynamicSqlMapper;
import cn.xvkang.primarymapperdynamicsql.MyfaxingssueDynamicSqlSupport;
import cn.xvkang.primarymapperdynamicsql.MyicmoneyDynamicSqlMapper;
import cn.xvkang.primarymapperdynamicsql.MyicmoneyDynamicSqlSupport;
import cn.xvkang.primarymapperdynamicsql.MyicvalidDynamicSqlMapper;
import cn.xvkang.primarymapperdynamicsql.MyicvalidDynamicSqlSupport;
import cn.xvkang.primarymapperdynamicsql.MyjibenziliaoDynamicSqlMapper;
import cn.xvkang.primarymapperdynamicsql.MyjibenziliaoDynamicSqlSupport;
import cn.xvkang.service.ChepaiService;
import cn.xvkang.utils.MyPageImpl;

@Service
public class ChepaiServiceImpl implements ChepaiService {
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
	// @Autowired
	// private BaseCustomMapper baseCustomMapper;
	public static String startPersonNo = "Z99000001";
	public static String startCarno = "YY99000001";

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
						MyfaxingssueDynamicSqlSupport.myfaxingssue.carissuedate)
				.from(MyfaxingssueDynamicSqlSupport.myfaxingssue, "myfaxingssue")
				.leftJoin(MyjibenziliaoDynamicSqlSupport.myjibenziliao, "myjibenziliao")
				.on(MyfaxingssueDynamicSqlSupport.myfaxingssue.userno,
						SqlBuilder.equalTo(MyjibenziliaoDynamicSqlSupport.myjibenziliao.userno))
				.leftJoin(MycardtypeDynamicSqlSupport.mycardtype, "mycardtype")
				.on(MyfaxingssueDynamicSqlSupport.myfaxingssue.carcardtype,
						SqlBuilder.equalTo(MycardtypeDynamicSqlSupport.mycardtype.identifying))
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
		// TODO
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
		return myjibenziliaoDynamicSqlMapper.insert(myjibenziliao);
	}

	public String getNextCarNo() {
		SelectStatementProvider render = SqlBuilder.select(SqlBuilder.max(MyfaxingssueDynamicSqlSupport.cardno))
				.from(MyfaxingssueDynamicSqlSupport.myfaxingssue)
				.where(MyfaxingssueDynamicSqlSupport.cardno, SqlBuilder.isLike("YY%")).build()
				.render(RenderingStrategy.MYBATIS3);
		String selectMax = chepaiCustomMapper.selectMaxCarno(render);

		if (selectMax == null) {
			return startCarno;
		}
		String substring = selectMax.substring(2, selectMax.length());
		Integer maxCarNo = Integer.parseInt(substring);
		return "YY" + maxCarNo.intValue() + 1;
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
		String substring = selectMax.substring(2, selectMax.length());
		Integer maxPersonNo = Integer.parseInt(substring);
		return "Z" + maxPersonNo.intValue() + 1;

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
			// 更新//为了简单 可以先删除此数据然后统一进行新增
			myfaxingssueDynamicSqlMapper.deleteByExample()
					.where(MyfaxingssueDynamicSqlSupport.cph, SqlBuilder.isEqualTo(cph)).build().execute();
		}
		// 新增
		return myfaxingssueDynamicSqlMapper.insert(myfaxingssue);
	}

	@Override
	public int delete(String id) {
		Myfaxingssue myfaxingssue = myfaxingssueDynamicSqlMapper.selectByPrimaryKey(Integer.parseInt(id));
		if (myfaxingssue != null) {
			myicmoneyDynamicSqlMapper.deleteByExample()
					.where(MyicmoneyDynamicSqlSupport.cardno, SqlBuilder.isEqualTo(myfaxingssue.getCardno())).build()
					.execute();
			myicvalidDynamicSqlMapper.deleteByExample()
					.where(MyicvalidDynamicSqlSupport.cardno, SqlBuilder.isEqualTo(myfaxingssue.getCardno())).build()
					.execute();
			myfaxingssueDynamicSqlMapper.deleteByExample()
					.where(MyfaxingssueDynamicSqlSupport.cardno, SqlBuilder.isEqualTo(myfaxingssue.getCardno())).build()
					.execute();
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
}
