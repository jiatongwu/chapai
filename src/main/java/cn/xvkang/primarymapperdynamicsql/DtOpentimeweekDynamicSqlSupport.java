package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DtOpentimeweekDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.631+08:00", comments="Source Table: Dt_OpenTimeWeek")
    public static final DtOpentimeweek dtOpentimeweek = new DtOpentimeweek();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.631+08:00", comments="Source field: Dt_OpenTimeWeek.id")
    public static final SqlColumn<Integer> id = dtOpentimeweek.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.631+08:00", comments="Source field: Dt_OpenTimeWeek.DevcNum")
    public static final SqlColumn<Integer> devcnum = dtOpentimeweek.devcnum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.631+08:00", comments="Source field: Dt_OpenTimeWeek.Week")
    public static final SqlColumn<Integer> week = dtOpentimeweek.week;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.631+08:00", comments="Source field: Dt_OpenTimeWeek.startime")
    public static final SqlColumn<String> startime = dtOpentimeweek.startime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.632+08:00", comments="Source field: Dt_OpenTimeWeek.endtime")
    public static final SqlColumn<String> endtime = dtOpentimeweek.endtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.631+08:00", comments="Source Table: Dt_OpenTimeWeek")
    public static final class DtOpentimeweek extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> devcnum = column("DevcNum", JDBCType.INTEGER);

        public final SqlColumn<Integer> week = column("Week", JDBCType.INTEGER);

        public final SqlColumn<String> startime = column("startime", JDBCType.VARCHAR);

        public final SqlColumn<String> endtime = column("endtime", JDBCType.VARCHAR);

        public DtOpentimeweek() {
            super("Dt_OpenTimeWeek");
        }
    }
}