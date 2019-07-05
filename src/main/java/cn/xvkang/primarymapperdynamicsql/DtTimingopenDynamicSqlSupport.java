package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DtTimingopenDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.418+08:00", comments="Source Table: Dt_TimingOpen")
    public static final DtTimingopen dtTimingopen = new DtTimingopen();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.418+08:00", comments="Source field: Dt_TimingOpen.id")
    public static final SqlColumn<Integer> id = dtTimingopen.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.418+08:00", comments="Source field: Dt_TimingOpen.DevcNum")
    public static final SqlColumn<Integer> devcnum = dtTimingopen.devcnum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.419+08:00", comments="Source field: Dt_TimingOpen.NoMalSet")
    public static final SqlColumn<Integer> nomalset = dtTimingopen.nomalset;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.419+08:00", comments="Source field: Dt_TimingOpen.Week")
    public static final SqlColumn<Integer> week = dtTimingopen.week;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.419+08:00", comments="Source field: Dt_TimingOpen.star1")
    public static final SqlColumn<String> star1 = dtTimingopen.star1;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.419+08:00", comments="Source field: Dt_TimingOpen.end1")
    public static final SqlColumn<String> end1 = dtTimingopen.end1;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.419+08:00", comments="Source field: Dt_TimingOpen.star2")
    public static final SqlColumn<String> star2 = dtTimingopen.star2;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.419+08:00", comments="Source field: Dt_TimingOpen.end2")
    public static final SqlColumn<String> end2 = dtTimingopen.end2;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.419+08:00", comments="Source field: Dt_TimingOpen.star3")
    public static final SqlColumn<String> star3 = dtTimingopen.star3;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.419+08:00", comments="Source field: Dt_TimingOpen.end3")
    public static final SqlColumn<String> end3 = dtTimingopen.end3;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.419+08:00", comments="Source field: Dt_TimingOpen.star4")
    public static final SqlColumn<String> star4 = dtTimingopen.star4;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.420+08:00", comments="Source field: Dt_TimingOpen.end4")
    public static final SqlColumn<String> end4 = dtTimingopen.end4;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.420+08:00", comments="Source field: Dt_TimingOpen.FoorInfo")
    public static final SqlColumn<String> foorinfo = dtTimingopen.foorinfo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.418+08:00", comments="Source Table: Dt_TimingOpen")
    public static final class DtTimingopen extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> devcnum = column("DevcNum", JDBCType.INTEGER);

        public final SqlColumn<Integer> nomalset = column("NoMalSet", JDBCType.INTEGER);

        public final SqlColumn<Integer> week = column("Week", JDBCType.INTEGER);

        public final SqlColumn<String> star1 = column("star1", JDBCType.VARCHAR);

        public final SqlColumn<String> end1 = column("end1", JDBCType.VARCHAR);

        public final SqlColumn<String> star2 = column("star2", JDBCType.VARCHAR);

        public final SqlColumn<String> end2 = column("end2", JDBCType.VARCHAR);

        public final SqlColumn<String> star3 = column("star3", JDBCType.VARCHAR);

        public final SqlColumn<String> end3 = column("end3", JDBCType.VARCHAR);

        public final SqlColumn<String> star4 = column("star4", JDBCType.VARCHAR);

        public final SqlColumn<String> end4 = column("end4", JDBCType.VARCHAR);

        public final SqlColumn<String> foorinfo = column("FoorInfo", JDBCType.VARCHAR);

        public DtTimingopen() {
            super("Dt_TimingOpen");
        }
    }
}