package cn.xvkang.utils.mybatis;

import cn.xvkang.utils.StringUtil;

public class TableNameGenerateMybatisGeneratorDynamicSqlXML {
	public static void main(String[] args) {

		String[] arr = { "AutoCPH      ", "CancelScheme          ", "CarChargeScheme       ", "DoorMjRealTimeStauts  ",
				"DtFxReportSelectScheme", "DtSelectScheme        ", "Dt_BaoJinSet          ", "Dt_CardType           ",
				"Dt_DoorData           ", "Dt_Door_Holiday       ", "Dt_FaxingSsue         ", "Dt_FlootSet           ",
				"Dt_FoorOutSet         ", "Dt_HordayStuat        ", "Dt_OpenTimeWeek       ", "Dt_RealTimStuats      ",
				"Dt_Record             ", "Dt_SendData           ", "Dt_TimeGroup          ", "Dt_TimingOpen         ",
				"Dt_YanTimeSet         ", "Dt_foorTb             ", "Dt_ldTimes            ", "Dt_qrsDoorDevcSet     ",
				"InOutPermition        ", "InParkScheme          ", "IssueScheme           ", "JJCNEWSHENZHEN        ",
				"JiaoJieScheme         ", "MJDownCardOutTimeSettb", "MJSelectScheme        ", "MYAutoTempChange      ",
				"MYAutoTempDownLoad    ", "MYBUMENSET            ", "MYBlacklist           ", "MYCAOZUOYUAN          ",
				"MYCAOZUOYUANGROUP     ", "MYCARCOMERECORD       ", "MYCARGOOUTRECORD      ", "MYCARGOOUTRECORDREPORT",
				"MYCHECHANGNORMALSHOUFEI", "MYCHECHANGPASS        ", "MYCHECHANGSTATUS      ", "MYCHECHANGXITONGSET   ",
				"MYCOMPUTERSET         ", "MYCarCancelTable      ", "MYCardType            ", "MYFAXINGSSUE          ",
				"MYGANGWEIKOUSET       ", "MYICIDSTATUS          ", "MYICLOST              ", "MYICMONEY             ",
				"MYICVALID             ", "MYJIBENZILIAO         ", "MYMENJINRECORD        ", "MYMIANFEISHIYOU       ",
				"MYOffLine             ", "MYPHOTOIMAGE          ", "MYPrint               ", "MYQUANXIANSET         ",
				"MYRECORDMEMORY        ", "MYRECORDQUERY         ", "MYSHOUFEIGUANGZOU     ", "MYSQLNAMEPEIZHI       ",
				"MYSurplusCarScreen    ", "MYTBMEISHUOSET        ", "MYTEMPISSUE           ", "MYVideoSet            ",
				"MYWORKSTATIONSET      ", "MYZBPARK              ", "MYZBPARK2             ", "MYZBPARKAutoCPH       ",
				"MYZBPARKSet           ", "MYjiaojieWorkTable    ", "M_CardType            ", "M_DoorData            ",
				"M_DoorMapsB           ", "M_DoorMapsDoorInfo    ", "M_DoorTypeName        ", "M_Door_Holiday        ",
				"M_JurisdTeam          ", "M_NormalOpenDoorSet   ", "M_OpenDoorModel       ", "M_OutTimeBaoJingRec   ",
				"M_Record              ", "M_Records             ", "M_Rrecords_Filer      ", "M_SendData            ",
				"M_TimeGroup           ", "M_TimeOutSet          ", "MoneyScheme           ", "MyAutoCPHSet          ",
				"MyCommonality         ", "MyEncryption          ", "MyFreeCPH             ", "MyHoliday             ",
				"MyHolidays            ", "MyNoCPH               ", "MyParkingGreeting     ", "MyParkingRecover      ",
				"MyScanCodePay         ", "MyVoice               ", "MyVoiceCardNO         ", "MyVoiceCardNOSET      ",
				"My_Authorization      ", "My_ZFBKeySet          ", "OpenClosedDoorStaut   ", "OptLog                ",
				"OptStateLog           ", "PostPoneScheme        ", "QRCodeControl         ", "QrFxSelectScheme      ",
				"QrSelectScheme        ", "Qr_ComSet             ", "Qr_FaxingSsue         ", "Qr_OutTimeBaoJingRec  ",
				"Qr_Record             ", "Qr_YanTimeSet         ", "SelectLossScheme      ", "SerDoorSelectScheme   ",
				"SerFaxingSelectScheme ", "Ser_CardType          ", "Ser_ClosedDStaut      ", "Ser_DoorData          ",
				"Ser_DoorMapsB         ", "Ser_DoorMapsDoorInfo  ", "Ser_DoorRealTimeStuats", "Ser_Door_Holiday      ",
				"Ser_FaxingSsue        ", "Ser_OpenDoorMode      ", "Ser_OutTimeBaoJingRec ", "Ser_Records           ",
				"Ser_TeQuanMode        ", "Ser_TimeGroup         ", "Ser_TimingOpen        ", "Ser_YanTimeSet        ",
				"permission            ", "role                  ", "role_permission       ", "tSpecialCPH           ",
				"tbSystemDataBak       ", "tblConstant           ", "tblDBVersion          ", "tblOpenType           ",
				"tblQuery              ", "user                  ", "user_role             ", "zh_Coupon             ",
				"zh_EnterCar           ", "zh_EstCarEnter        ", "zh_EstCarOut          ", "zh_MthCar             ",
				"zh_MthCarCharge       ", "zh_OutCar             ", "zh_PayOrder           ", "zh_Person             ",
				"zh_ReserveCar         ", "zh_SentryBox          ", "zh_UpdateCar" };

		for (String ar : arr) {
			String token = ar.trim();

			String xml = "<table tableName=\"" + token + "\"  mapperName=\"" + StringUtil.underline2Camel(token, false)
					+ "DynamicSqlMapper\">\r\n"
					+ "			<property name=\"useActualColumnNames\" value=\"false\" />\r\n"
					+ "			<generatedKey column=\"id\" sqlStatement=\"Mysql\" identity=\"true\" />\r\n"
					+ "		</table>";

			System.out.println(xml);
		}
	}

}
