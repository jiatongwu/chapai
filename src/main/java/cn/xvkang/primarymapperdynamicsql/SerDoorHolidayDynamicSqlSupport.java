package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SerDoorHolidayDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.507+08:00", comments="Source Table: Ser_Door_Holiday")
    public static final SerDoorHoliday serDoorHoliday = new SerDoorHoliday();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.507+08:00", comments="Source field: Ser_Door_Holiday.id")
    public static final SqlColumn<Integer> id = serDoorHoliday.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.507+08:00", comments="Source field: Ser_Door_Holiday.sDate")
    public static final SqlColumn<String> sdate = serDoorHoliday.sdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.507+08:00", comments="Source field: Ser_Door_Holiday.DevcNum")
    public static final SqlColumn<Integer> devcnum = serDoorHoliday.devcnum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.507+08:00", comments="Source field: Ser_Door_Holiday.Doorid")
    public static final SqlColumn<Integer> doorid = serDoorHoliday.doorid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.507+08:00", comments="Source Table: Ser_Door_Holiday")
    public static final class SerDoorHoliday extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> sdate = column("sDate", JDBCType.VARCHAR);

        public final SqlColumn<Integer> devcnum = column("DevcNum", JDBCType.INTEGER);

        public final SqlColumn<Integer> doorid = column("Doorid", JDBCType.INTEGER);

        public SerDoorHoliday() {
            super("Ser_Door_Holiday");
        }
    }
}