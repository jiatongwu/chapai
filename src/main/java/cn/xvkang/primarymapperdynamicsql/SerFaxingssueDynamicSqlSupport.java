package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SerFaxingssueDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.185+08:00", comments="Source Table: Ser_FaxingSsue")
    public static final SerFaxingssue serFaxingssue = new SerFaxingssue();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.185+08:00", comments="Source field: Ser_FaxingSsue.ID")
    public static final SqlColumn<Integer> id = serFaxingssue.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.185+08:00", comments="Source field: Ser_FaxingSsue.CardNo")
    public static final SqlColumn<String> cardno = serFaxingssue.cardno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.185+08:00", comments="Source field: Ser_FaxingSsue.CardIDNo")
    public static final SqlColumn<String> cardidno = serFaxingssue.cardidno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.185+08:00", comments="Source field: Ser_FaxingSsue.UserNo")
    public static final SqlColumn<String> userno = serFaxingssue.userno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.185+08:00", comments="Source field: Ser_FaxingSsue.CardState")
    public static final SqlColumn<Integer> cardstate = serFaxingssue.cardstate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.185+08:00", comments="Source field: Ser_FaxingSsue.IssDate")
    public static final SqlColumn<Date> issdate = serFaxingssue.issdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.185+08:00", comments="Source field: Ser_FaxingSsue.CardType")
    public static final SqlColumn<Integer> cardtype = serFaxingssue.cardtype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.185+08:00", comments="Source field: Ser_FaxingSsue.TemNum")
    public static final SqlColumn<Integer> temnum = serFaxingssue.temnum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.185+08:00", comments="Source field: Ser_FaxingSsue.TimeTeam")
    public static final SqlColumn<Integer> timeteam = serFaxingssue.timeteam;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.185+08:00", comments="Source field: Ser_FaxingSsue.CaseCade")
    public static final SqlColumn<Integer> casecade = serFaxingssue.casecade;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.185+08:00", comments="Source field: Ser_FaxingSsue.EndDate")
    public static final SqlColumn<Date> enddate = serFaxingssue.enddate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.185+08:00", comments="Source field: Ser_FaxingSsue.DoorMark")
    public static final SqlColumn<String> doormark = serFaxingssue.doormark;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.185+08:00", comments="Source field: Ser_FaxingSsue.DoorPerInfo")
    public static final SqlColumn<String> doorperinfo = serFaxingssue.doorperinfo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.185+08:00", comments="Source field: Ser_FaxingSsue.Holiday")
    public static final SqlColumn<String> holiday = serFaxingssue.holiday;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.185+08:00", comments="Source field: Ser_FaxingSsue.SysHoliday")
    public static final SqlColumn<String> sysholiday = serFaxingssue.sysholiday;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.185+08:00", comments="Source field: Ser_FaxingSsue.DevcNum")
    public static final SqlColumn<String> devcnum = serFaxingssue.devcnum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.185+08:00", comments="Source field: Ser_FaxingSsue.DoorNum")
    public static final SqlColumn<String> doornum = serFaxingssue.doornum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.185+08:00", comments="Source field: Ser_FaxingSsue.CardDownFlag")
    public static final SqlColumn<Integer> carddownflag = serFaxingssue.carddownflag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.185+08:00", comments="Source Table: Ser_FaxingSsue")
    public static final class SerFaxingssue extends SqlTable {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<String> cardno = column("CardNo", JDBCType.VARCHAR);

        public final SqlColumn<String> cardidno = column("CardIDNo", JDBCType.VARCHAR);

        public final SqlColumn<String> userno = column("UserNo", JDBCType.VARCHAR);

        public final SqlColumn<Integer> cardstate = column("CardState", JDBCType.INTEGER);

        public final SqlColumn<Date> issdate = column("IssDate", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> cardtype = column("CardType", JDBCType.INTEGER);

        public final SqlColumn<Integer> temnum = column("TemNum", JDBCType.INTEGER);

        public final SqlColumn<Integer> timeteam = column("TimeTeam", JDBCType.INTEGER);

        public final SqlColumn<Integer> casecade = column("CaseCade", JDBCType.INTEGER);

        public final SqlColumn<Date> enddate = column("EndDate", JDBCType.TIMESTAMP);

        public final SqlColumn<String> doormark = column("DoorMark", JDBCType.VARCHAR);

        public final SqlColumn<String> doorperinfo = column("DoorPerInfo", JDBCType.VARCHAR);

        public final SqlColumn<String> holiday = column("Holiday", JDBCType.VARCHAR);

        public final SqlColumn<String> sysholiday = column("SysHoliday", JDBCType.VARCHAR);

        public final SqlColumn<String> devcnum = column("DevcNum", JDBCType.VARCHAR);

        public final SqlColumn<String> doornum = column("DoorNum", JDBCType.VARCHAR);

        public final SqlColumn<Integer> carddownflag = column("CardDownFlag", JDBCType.INTEGER);

        public SerFaxingssue() {
            super("Ser_FaxingSsue");
        }
    }
}