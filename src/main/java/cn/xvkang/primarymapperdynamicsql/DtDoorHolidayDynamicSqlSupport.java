package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DtDoorHolidayDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.367+08:00", comments="Source Table: Dt_Door_Holiday")
    public static final DtDoorHoliday dtDoorHoliday = new DtDoorHoliday();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.368+08:00", comments="Source field: Dt_Door_Holiday.id")
    public static final SqlColumn<Integer> id = dtDoorHoliday.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.368+08:00", comments="Source field: Dt_Door_Holiday.sDate")
    public static final SqlColumn<String> sdate = dtDoorHoliday.sdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.368+08:00", comments="Source field: Dt_Door_Holiday.DevcNum")
    public static final SqlColumn<Integer> devcnum = dtDoorHoliday.devcnum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.367+08:00", comments="Source Table: Dt_Door_Holiday")
    public static final class DtDoorHoliday extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> sdate = column("sDate", JDBCType.VARCHAR);

        public final SqlColumn<Integer> devcnum = column("DevcNum", JDBCType.INTEGER);

        public DtDoorHoliday() {
            super("Dt_Door_Holiday");
        }
    }
}