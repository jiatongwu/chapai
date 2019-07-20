package cn.xvkang.primarymapperdynamicsql;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MyfaxingssueDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.260+08:00", comments="Source Table: MYFAXINGSSUE")
    public static final Myfaxingssue myfaxingssue = new Myfaxingssue();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.261+08:00", comments="Source field: MYFAXINGSSUE.ID")
    public static final SqlColumn<Integer> id = myfaxingssue.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.261+08:00", comments="Source field: MYFAXINGSSUE.CardNO")
    public static final SqlColumn<String> cardno = myfaxingssue.cardno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.261+08:00", comments="Source field: MYFAXINGSSUE.UserNO")
    public static final SqlColumn<String> userno = myfaxingssue.userno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.261+08:00", comments="Source field: MYFAXINGSSUE.CardState")
    public static final SqlColumn<String> cardstate = myfaxingssue.cardstate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.261+08:00", comments="Source field: MYFAXINGSSUE.CardYJ")
    public static final SqlColumn<BigDecimal> cardyj = myfaxingssue.cardyj;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.261+08:00", comments="Source field: MYFAXINGSSUE.SubSystem")
    public static final SqlColumn<String> subsystem = myfaxingssue.subsystem;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.261+08:00", comments="Source field: MYFAXINGSSUE.CarCardType")
    public static final SqlColumn<String> carcardtype = myfaxingssue.carcardtype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.261+08:00", comments="Source field: MYFAXINGSSUE.CarIssueDate")
    public static final SqlColumn<Date> carissuedate = myfaxingssue.carissuedate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.261+08:00", comments="Source field: MYFAXINGSSUE.CarIssueUserCard")
    public static final SqlColumn<String> carissueusercard = myfaxingssue.carissueusercard;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.261+08:00", comments="Source field: MYFAXINGSSUE.Balance")
    public static final SqlColumn<BigDecimal> balance = myfaxingssue.balance;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.261+08:00", comments="Source field: MYFAXINGSSUE.CarValidStartDate")
    public static final SqlColumn<Date> carvalidstartdate = myfaxingssue.carvalidstartdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.261+08:00", comments="Source field: MYFAXINGSSUE.CarValidEndDate")
    public static final SqlColumn<Date> carvalidenddate = myfaxingssue.carvalidenddate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.261+08:00", comments="Source field: MYFAXINGSSUE.CPH")
    public static final SqlColumn<String> cph = myfaxingssue.cph;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.261+08:00", comments="Source field: MYFAXINGSSUE.CarColor")
    public static final SqlColumn<String> carcolor = myfaxingssue.carcolor;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.261+08:00", comments="Source field: MYFAXINGSSUE.CarType")
    public static final SqlColumn<String> cartype = myfaxingssue.cartype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.261+08:00", comments="Source field: MYFAXINGSSUE.CarPlace")
    public static final SqlColumn<String> carplace = myfaxingssue.carplace;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.261+08:00", comments="Source field: MYFAXINGSSUE.CarWithdrawCardDate")
    public static final SqlColumn<Date> carwithdrawcarddate = myfaxingssue.carwithdrawcarddate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.261+08:00", comments="Source field: MYFAXINGSSUE.CarWithdrawOptCard")
    public static final SqlColumn<String> carwithdrawoptcard = myfaxingssue.carwithdrawoptcard;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.261+08:00", comments="Source field: MYFAXINGSSUE.CarValidMachine")
    public static final SqlColumn<String> carvalidmachine = myfaxingssue.carvalidmachine;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.261+08:00", comments="Source field: MYFAXINGSSUE.CarValidZone")
    public static final SqlColumn<String> carvalidzone = myfaxingssue.carvalidzone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.261+08:00", comments="Source field: MYFAXINGSSUE.CarMemo")
    public static final SqlColumn<String> carmemo = myfaxingssue.carmemo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.261+08:00", comments="Source field: MYFAXINGSSUE.MJCardType")
    public static final SqlColumn<String> mjcardtype = myfaxingssue.mjcardtype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.261+08:00", comments="Source field: MYFAXINGSSUE.MJIssueDate")
    public static final SqlColumn<Date> mjissuedate = myfaxingssue.mjissuedate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.261+08:00", comments="Source field: MYFAXINGSSUE.MJIssueUserCard")
    public static final SqlColumn<String> mjissueusercard = myfaxingssue.mjissueusercard;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.261+08:00", comments="Source field: MYFAXINGSSUE.MJEndDate")
    public static final SqlColumn<Date> mjenddate = myfaxingssue.mjenddate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.261+08:00", comments="Source field: MYFAXINGSSUE.MJValidStartTime")
    public static final SqlColumn<String> mjvalidstarttime = myfaxingssue.mjvalidstarttime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.261+08:00", comments="Source field: MYFAXINGSSUE.MJValidEndTime")
    public static final SqlColumn<String> mjvalidendtime = myfaxingssue.mjvalidendtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.261+08:00", comments="Source field: MYFAXINGSSUE.MJValidMachine")
    public static final SqlColumn<String> mjvalidmachine = myfaxingssue.mjvalidmachine;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.262+08:00", comments="Source field: MYFAXINGSSUE.MJWithdrawCardDate")
    public static final SqlColumn<Date> mjwithdrawcarddate = myfaxingssue.mjwithdrawcarddate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.262+08:00", comments="Source field: MYFAXINGSSUE.MJWithdrawOptCard")
    public static final SqlColumn<String> mjwithdrawoptcard = myfaxingssue.mjwithdrawoptcard;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.262+08:00", comments="Source field: MYFAXINGSSUE.MJMemo")
    public static final SqlColumn<String> mjmemo = myfaxingssue.mjmemo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.262+08:00", comments="Source field: MYFAXINGSSUE.IssueDate")
    public static final SqlColumn<Date> issuedate = myfaxingssue.issuedate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.262+08:00", comments="Source field: MYFAXINGSSUE.WithdrawDate")
    public static final SqlColumn<Date> withdrawdate = myfaxingssue.withdrawdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.262+08:00", comments="Source field: MYFAXINGSSUE.IssueUserCard")
    public static final SqlColumn<String> issueusercard = myfaxingssue.issueusercard;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.262+08:00", comments="Source field: MYFAXINGSSUE.WithdrawUserCard")
    public static final SqlColumn<String> withdrawusercard = myfaxingssue.withdrawusercard;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.262+08:00", comments="Source field: MYFAXINGSSUE.LossregDate")
    public static final SqlColumn<Date> lossregdate = myfaxingssue.lossregdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.262+08:00", comments="Source field: MYFAXINGSSUE.LossregUserCard")
    public static final SqlColumn<String> lossregusercard = myfaxingssue.lossregusercard;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.262+08:00", comments="Source field: MYFAXINGSSUE.CardIDNO")
    public static final SqlColumn<String> cardidno = myfaxingssue.cardidno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.262+08:00", comments="Source field: MYFAXINGSSUE.DownloadSignal")
    public static final SqlColumn<String> downloadsignal = myfaxingssue.downloadsignal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.262+08:00", comments="Source field: MYFAXINGSSUE.CarPic")
    public static final SqlColumn<String> carpic = myfaxingssue.carpic;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.262+08:00", comments="Source field: MYFAXINGSSUE.Tempnumber")
    public static final SqlColumn<Integer> tempnumber = myfaxingssue.tempnumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.262+08:00", comments="Source field: MYFAXINGSSUE.TimeTeam")
    public static final SqlColumn<String> timeteam = myfaxingssue.timeteam;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.262+08:00", comments="Source field: MYFAXINGSSUE.HolidayLimited")
    public static final SqlColumn<String> holidaylimited = myfaxingssue.holidaylimited;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.262+08:00", comments="Source field: MYFAXINGSSUE.UserInfo")
    public static final SqlColumn<String> userinfo = myfaxingssue.userinfo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.262+08:00", comments="Source field: MYFAXINGSSUE.BackCardNum")
    public static final SqlColumn<String> backcardnum = myfaxingssue.backcardnum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.262+08:00", comments="Source field: MYFAXINGSSUE.CardIdLossState")
    public static final SqlColumn<String> cardidlossstate = myfaxingssue.cardidlossstate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.262+08:00", comments="Source field: MYFAXINGSSUE.CardIdUnLossState")
    public static final SqlColumn<String> cardidunlossstate = myfaxingssue.cardidunlossstate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.262+08:00", comments="Source field: MYFAXINGSSUE.UnLossDate")
    public static final SqlColumn<Date> unlossdate = myfaxingssue.unlossdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.262+08:00", comments="Source field: MYFAXINGSSUE.UnLossUer")
    public static final SqlColumn<String> unlossuer = myfaxingssue.unlossuer;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.262+08:00", comments="Source field: MYFAXINGSSUE.MJBeginDate")
    public static final SqlColumn<Date> mjbegindate = myfaxingssue.mjbegindate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.262+08:00", comments="Source field: MYFAXINGSSUE.CarFailID")
    public static final SqlColumn<String> carfailid = myfaxingssue.carfailid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.262+08:00", comments="Source field: MYFAXINGSSUE.CaRFailOKNO")
    public static final SqlColumn<String> carfailokno = myfaxingssue.carfailokno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.262+08:00", comments="Source field: MYFAXINGSSUE.DownLoadState")
    public static final SqlColumn<String> downloadstate = myfaxingssue.downloadstate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.262+08:00", comments="Source field: MYFAXINGSSUE.CardLossMachine")
    public static final SqlColumn<String> cardlossmachine = myfaxingssue.cardlossmachine;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.262+08:00", comments="Source field: MYFAXINGSSUE.MjPassword")
    public static final SqlColumn<String> mjpassword = myfaxingssue.mjpassword;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.262+08:00", comments="Source field: MYFAXINGSSUE.MjEnabSysHoliday")
    public static final SqlColumn<String> mjenabsysholiday = myfaxingssue.mjenabsysholiday;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.262+08:00", comments="Source field: MYFAXINGSSUE.MJJureTeam")
    public static final SqlColumn<String> mjjureteam = myfaxingssue.mjjureteam;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.262+08:00", comments="Source field: MYFAXINGSSUE.MJTCard")
    public static final SqlColumn<Boolean> mjtcard = myfaxingssue.mjtcard;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.262+08:00", comments="Source field: MYFAXINGSSUE.MonthType")
    public static final SqlColumn<Integer> monthtype = myfaxingssue.monthtype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.262+08:00", comments="Source field: MYFAXINGSSUE.CPHDownloadSignal")
    public static final SqlColumn<String> cphdownloadsignal = myfaxingssue.cphdownloadsignal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.262+08:00", comments="Source field: MYFAXINGSSUE.Res1")
    public static final SqlColumn<String> res1 = myfaxingssue.res1;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.262+08:00", comments="Source field: MYFAXINGSSUE.Res2")
    public static final SqlColumn<String> res2 = myfaxingssue.res2;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.262+08:00", comments="Source field: MYFAXINGSSUE.CarPhoto")
    public static final SqlColumn<byte[]> carphoto = myfaxingssue.carphoto;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.261+08:00", comments="Source Table: MYFAXINGSSUE")
    public static final class Myfaxingssue extends SqlTable {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<String> cardno = column("CardNO", JDBCType.VARCHAR);

        public final SqlColumn<String> userno = column("UserNO", JDBCType.VARCHAR);

        public final SqlColumn<String> cardstate = column("CardState", JDBCType.CHAR);

        public final SqlColumn<BigDecimal> cardyj = column("CardYJ", JDBCType.DECIMAL);

        public final SqlColumn<String> subsystem = column("SubSystem", JDBCType.VARCHAR);

        public final SqlColumn<String> carcardtype = column("CarCardType", JDBCType.VARCHAR);

        public final SqlColumn<Date> carissuedate = column("CarIssueDate", JDBCType.TIMESTAMP);

        public final SqlColumn<String> carissueusercard = column("CarIssueUserCard", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> balance = column("Balance", JDBCType.DECIMAL);

        public final SqlColumn<Date> carvalidstartdate = column("CarValidStartDate", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> carvalidenddate = column("CarValidEndDate", JDBCType.TIMESTAMP);

        public final SqlColumn<String> cph = column("CPH", JDBCType.VARCHAR);

        public final SqlColumn<String> carcolor = column("CarColor", JDBCType.VARCHAR);

        public final SqlColumn<String> cartype = column("CarType", JDBCType.VARCHAR);

        public final SqlColumn<String> carplace = column("CarPlace", JDBCType.VARCHAR);

        public final SqlColumn<Date> carwithdrawcarddate = column("CarWithdrawCardDate", JDBCType.TIMESTAMP);

        public final SqlColumn<String> carwithdrawoptcard = column("CarWithdrawOptCard", JDBCType.VARCHAR);

        public final SqlColumn<String> carvalidmachine = column("CarValidMachine", JDBCType.VARCHAR);

        public final SqlColumn<String> carvalidzone = column("CarValidZone", JDBCType.VARCHAR);

        public final SqlColumn<String> carmemo = column("CarMemo", JDBCType.VARCHAR);

        public final SqlColumn<String> mjcardtype = column("MJCardType", JDBCType.VARCHAR);

        public final SqlColumn<Date> mjissuedate = column("MJIssueDate", JDBCType.TIMESTAMP);

        public final SqlColumn<String> mjissueusercard = column("MJIssueUserCard", JDBCType.VARCHAR);

        public final SqlColumn<Date> mjenddate = column("MJEndDate", JDBCType.TIMESTAMP);

        public final SqlColumn<String> mjvalidstarttime = column("MJValidStartTime", JDBCType.CHAR);

        public final SqlColumn<String> mjvalidendtime = column("MJValidEndTime", JDBCType.CHAR);

        public final SqlColumn<String> mjvalidmachine = column("MJValidMachine", JDBCType.VARCHAR);

        public final SqlColumn<Date> mjwithdrawcarddate = column("MJWithdrawCardDate", JDBCType.TIMESTAMP);

        public final SqlColumn<String> mjwithdrawoptcard = column("MJWithdrawOptCard", JDBCType.VARCHAR);

        public final SqlColumn<String> mjmemo = column("MJMemo", JDBCType.VARCHAR);

        public final SqlColumn<Date> issuedate = column("IssueDate", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> withdrawdate = column("WithdrawDate", JDBCType.TIMESTAMP);

        public final SqlColumn<String> issueusercard = column("IssueUserCard", JDBCType.VARCHAR);

        public final SqlColumn<String> withdrawusercard = column("WithdrawUserCard", JDBCType.VARCHAR);

        public final SqlColumn<Date> lossregdate = column("LossregDate", JDBCType.TIMESTAMP);

        public final SqlColumn<String> lossregusercard = column("LossregUserCard", JDBCType.VARCHAR);

        public final SqlColumn<String> cardidno = column("CardIDNO", JDBCType.VARCHAR);

        public final SqlColumn<String> downloadsignal = column("DownloadSignal", JDBCType.VARCHAR);

        public final SqlColumn<String> carpic = column("CarPic", JDBCType.VARCHAR);

        public final SqlColumn<Integer> tempnumber = column("Tempnumber", JDBCType.INTEGER);

        public final SqlColumn<String> timeteam = column("TimeTeam", JDBCType.VARCHAR);

        public final SqlColumn<String> holidaylimited = column("HolidayLimited", JDBCType.VARCHAR);

        public final SqlColumn<String> userinfo = column("UserInfo", JDBCType.VARCHAR);

        public final SqlColumn<String> backcardnum = column("BackCardNum", JDBCType.VARCHAR);

        public final SqlColumn<String> cardidlossstate = column("CardIdLossState", JDBCType.CHAR);

        public final SqlColumn<String> cardidunlossstate = column("CardIdUnLossState", JDBCType.VARCHAR);

        public final SqlColumn<Date> unlossdate = column("UnLossDate", JDBCType.TIMESTAMP);

        public final SqlColumn<String> unlossuer = column("UnLossUer", JDBCType.VARCHAR);

        public final SqlColumn<Date> mjbegindate = column("MJBeginDate", JDBCType.TIMESTAMP);

        public final SqlColumn<String> carfailid = column("CarFailID", JDBCType.VARCHAR);

        public final SqlColumn<String> carfailokno = column("CaRFailOKNO", JDBCType.CHAR);

        public final SqlColumn<String> downloadstate = column("DownLoadState", JDBCType.CHAR);

        public final SqlColumn<String> cardlossmachine = column("CardLossMachine", JDBCType.VARCHAR);

        public final SqlColumn<String> mjpassword = column("MjPassword", JDBCType.VARCHAR);

        public final SqlColumn<String> mjenabsysholiday = column("MjEnabSysHoliday", JDBCType.VARCHAR);

        public final SqlColumn<String> mjjureteam = column("MJJureTeam", JDBCType.VARCHAR);

        public final SqlColumn<Boolean> mjtcard = column("MJTCard", JDBCType.BIT);

        public final SqlColumn<Integer> monthtype = column("MonthType", JDBCType.INTEGER);

        public final SqlColumn<String> cphdownloadsignal = column("CPHDownloadSignal", JDBCType.VARCHAR);

        public final SqlColumn<String> res1 = column("Res1", JDBCType.VARCHAR);

        public final SqlColumn<String> res2 = column("Res2", JDBCType.VARCHAR);

        public final SqlColumn<byte[]> carphoto = column("CarPhoto", JDBCType.BLOB);

        public Myfaxingssue() {
            super("MYFAXINGSSUE");
        }
    }
}