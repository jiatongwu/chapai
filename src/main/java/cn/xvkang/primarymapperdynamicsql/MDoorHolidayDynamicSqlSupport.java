package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MDoorHolidayDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.837+08:00", comments="Source Table: M_Door_Holiday")
    public static final MDoorHoliday MDoorHoliday = new MDoorHoliday();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.837+08:00", comments="Source field: M_Door_Holiday.id")
    public static final SqlColumn<Integer> id = MDoorHoliday.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.837+08:00", comments="Source field: M_Door_Holiday.sDate")
    public static final SqlColumn<String> sdate = MDoorHoliday.sdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.837+08:00", comments="Source field: M_Door_Holiday.DevcNum")
    public static final SqlColumn<Integer> devcnum = MDoorHoliday.devcnum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.837+08:00", comments="Source field: M_Door_Holiday.DoorLei")
    public static final SqlColumn<Integer> doorlei = MDoorHoliday.doorlei;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.837+08:00", comments="Source Table: M_Door_Holiday")
    public static final class MDoorHoliday extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> sdate = column("sDate", JDBCType.VARCHAR);

        public final SqlColumn<Integer> devcnum = column("DevcNum", JDBCType.INTEGER);

        public final SqlColumn<Integer> doorlei = column("DoorLei", JDBCType.INTEGER);

        public MDoorHoliday() {
            super("M_Door_Holiday");
        }
    }
}