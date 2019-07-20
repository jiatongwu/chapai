package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MJurisdteamDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.375+08:00", comments="Source Table: M_JurisdTeam")
    public static final MJurisdteam MJurisdteam = new MJurisdteam();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.375+08:00", comments="Source field: M_JurisdTeam.id")
    public static final SqlColumn<Integer> id = MJurisdteam.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.375+08:00", comments="Source field: M_JurisdTeam.JurName")
    public static final SqlColumn<String> jurname = MJurisdteam.jurname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.375+08:00", comments="Source field: M_JurisdTeam.CardType")
    public static final SqlColumn<String> cardtype = MJurisdteam.cardtype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.375+08:00", comments="Source field: M_JurisdTeam.TempNumber")
    public static final SqlColumn<Integer> tempnumber = MJurisdteam.tempnumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.375+08:00", comments="Source field: M_JurisdTeam.TeamName")
    public static final SqlColumn<String> teamname = MJurisdteam.teamname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.375+08:00", comments="Source field: M_JurisdTeam.MJBeginDate")
    public static final SqlColumn<Date> mjbegindate = MJurisdteam.mjbegindate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.375+08:00", comments="Source field: M_JurisdTeam.MJEndDate")
    public static final SqlColumn<Date> mjenddate = MJurisdteam.mjenddate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.379+08:00", comments="Source field: M_JurisdTeam.mark")
    public static final SqlColumn<String> mark = MJurisdteam.mark;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.379+08:00", comments="Source field: M_JurisdTeam.UserInfo")
    public static final SqlColumn<String> userinfo = MJurisdteam.userinfo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.379+08:00", comments="Source field: M_JurisdTeam.HolidayLimited")
    public static final SqlColumn<String> holidaylimited = MJurisdteam.holidaylimited;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.379+08:00", comments="Source field: M_JurisdTeam.MjEnabSysHoliday")
    public static final SqlColumn<String> mjenabsysholiday = MJurisdteam.mjenabsysholiday;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.379+08:00", comments="Source field: M_JurisdTeam.MJValidMachine")
    public static final SqlColumn<String> mjvalidmachine = MJurisdteam.mjvalidmachine;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.375+08:00", comments="Source Table: M_JurisdTeam")
    public static final class MJurisdteam extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> jurname = column("JurName", JDBCType.VARCHAR);

        public final SqlColumn<String> cardtype = column("CardType", JDBCType.VARCHAR);

        public final SqlColumn<Integer> tempnumber = column("TempNumber", JDBCType.INTEGER);

        public final SqlColumn<String> teamname = column("TeamName", JDBCType.VARCHAR);

        public final SqlColumn<Date> mjbegindate = column("MJBeginDate", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> mjenddate = column("MJEndDate", JDBCType.TIMESTAMP);

        public final SqlColumn<String> mark = column("mark", JDBCType.VARCHAR);

        public final SqlColumn<String> userinfo = column("UserInfo", JDBCType.VARCHAR);

        public final SqlColumn<String> holidaylimited = column("HolidayLimited", JDBCType.VARCHAR);

        public final SqlColumn<String> mjenabsysholiday = column("MjEnabSysHoliday", JDBCType.VARCHAR);

        public final SqlColumn<String> mjvalidmachine = column("MJValidMachine", JDBCType.VARCHAR);

        public MJurisdteam() {
            super("M_JurisdTeam");
        }
    }
}