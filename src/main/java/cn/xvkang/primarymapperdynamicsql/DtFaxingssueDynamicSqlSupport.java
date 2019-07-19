package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DtFaxingssueDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.553+08:00", comments="Source Table: Dt_FaxingSsue")
    public static final DtFaxingssue dtFaxingssue = new DtFaxingssue();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.553+08:00", comments="Source field: Dt_FaxingSsue.ID")
    public static final SqlColumn<Integer> id = dtFaxingssue.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.554+08:00", comments="Source field: Dt_FaxingSsue.CardNo")
    public static final SqlColumn<String> cardno = dtFaxingssue.cardno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.554+08:00", comments="Source field: Dt_FaxingSsue.CardIDNO")
    public static final SqlColumn<String> cardidno = dtFaxingssue.cardidno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.554+08:00", comments="Source field: Dt_FaxingSsue.CardIdIcflag")
    public static final SqlColumn<Integer> cardidicflag = dtFaxingssue.cardidicflag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.554+08:00", comments="Source field: Dt_FaxingSsue.UserNo")
    public static final SqlColumn<String> userno = dtFaxingssue.userno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.554+08:00", comments="Source field: Dt_FaxingSsue.CardState")
    public static final SqlColumn<Integer> cardstate = dtFaxingssue.cardstate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.554+08:00", comments="Source field: Dt_FaxingSsue.IssDate")
    public static final SqlColumn<Date> issdate = dtFaxingssue.issdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.554+08:00", comments="Source field: Dt_FaxingSsue.CardType")
    public static final SqlColumn<Integer> cardtype = dtFaxingssue.cardtype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.554+08:00", comments="Source field: Dt_FaxingSsue.TemNum")
    public static final SqlColumn<Integer> temnum = dtFaxingssue.temnum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.555+08:00", comments="Source field: Dt_FaxingSsue.TimeTeam")
    public static final SqlColumn<Integer> timeteam = dtFaxingssue.timeteam;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.555+08:00", comments="Source field: Dt_FaxingSsue.EndDate")
    public static final SqlColumn<Date> enddate = dtFaxingssue.enddate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.555+08:00", comments="Source field: Dt_FaxingSsue.PersonDevcID")
    public static final SqlColumn<Integer> persondevcid = dtFaxingssue.persondevcid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.555+08:00", comments="Source field: Dt_FaxingSsue.PersonFoorid")
    public static final SqlColumn<Integer> personfoorid = dtFaxingssue.personfoorid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.555+08:00", comments="Source field: Dt_FaxingSsue.Mark")
    public static final SqlColumn<String> mark = dtFaxingssue.mark;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.555+08:00", comments="Source field: Dt_FaxingSsue.Holiday")
    public static final SqlColumn<String> holiday = dtFaxingssue.holiday;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.555+08:00", comments="Source field: Dt_FaxingSsue.visitsFloor")
    public static final SqlColumn<String> visitsfloor = dtFaxingssue.visitsfloor;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.555+08:00", comments="Source field: Dt_FaxingSsue.isitsFlag")
    public static final SqlColumn<String> isitsflag = dtFaxingssue.isitsflag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.557+08:00", comments="Source field: Dt_FaxingSsue.CardExitflag")
    public static final SqlColumn<Boolean> cardexitflag = dtFaxingssue.cardexitflag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.557+08:00", comments="Source field: Dt_FaxingSsue.CardDownFlag")
    public static final SqlColumn<Boolean> carddownflag = dtFaxingssue.carddownflag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.558+08:00", comments="Source field: Dt_FaxingSsue.SfMoeny")
    public static final SqlColumn<Integer> sfmoeny = dtFaxingssue.sfmoeny;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.559+08:00", comments="Source field: Dt_FaxingSsue.fxmode")
    public static final SqlColumn<Integer> fxmode = dtFaxingssue.fxmode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.559+08:00", comments="Source field: Dt_FaxingSsue.TineOnline")
    public static final SqlColumn<String> tineonline = dtFaxingssue.tineonline;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.553+08:00", comments="Source Table: Dt_FaxingSsue")
    public static final class DtFaxingssue extends SqlTable {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<String> cardno = column("CardNo", JDBCType.VARCHAR);

        public final SqlColumn<String> cardidno = column("CardIDNO", JDBCType.VARCHAR);

        public final SqlColumn<Integer> cardidicflag = column("CardIdIcflag", JDBCType.INTEGER);

        public final SqlColumn<String> userno = column("UserNo", JDBCType.VARCHAR);

        public final SqlColumn<Integer> cardstate = column("CardState", JDBCType.INTEGER);

        public final SqlColumn<Date> issdate = column("IssDate", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> cardtype = column("CardType", JDBCType.INTEGER);

        public final SqlColumn<Integer> temnum = column("TemNum", JDBCType.INTEGER);

        public final SqlColumn<Integer> timeteam = column("TimeTeam", JDBCType.INTEGER);

        public final SqlColumn<Date> enddate = column("EndDate", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> persondevcid = column("PersonDevcID", JDBCType.INTEGER);

        public final SqlColumn<Integer> personfoorid = column("PersonFoorid", JDBCType.INTEGER);

        public final SqlColumn<String> mark = column("Mark", JDBCType.VARCHAR);

        public final SqlColumn<String> holiday = column("Holiday", JDBCType.VARCHAR);

        public final SqlColumn<String> visitsfloor = column("visitsFloor", JDBCType.VARCHAR);

        public final SqlColumn<String> isitsflag = column("isitsFlag", JDBCType.VARCHAR);

        public final SqlColumn<Boolean> cardexitflag = column("CardExitflag", JDBCType.BIT);

        public final SqlColumn<Boolean> carddownflag = column("CardDownFlag", JDBCType.BIT);

        public final SqlColumn<Integer> sfmoeny = column("SfMoeny", JDBCType.INTEGER);

        public final SqlColumn<Integer> fxmode = column("fxmode", JDBCType.INTEGER);

        public final SqlColumn<String> tineonline = column("TineOnline", JDBCType.CLOB);

        public DtFaxingssue() {
            super("Dt_FaxingSsue");
        }
    }
}