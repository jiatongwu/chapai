package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MyholidaysDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.432+08:00", comments="Source Table: MyHolidays")
    public static final Myholidays myholidays = new Myholidays();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.432+08:00", comments="Source field: MyHolidays.HolidaysTime")
    public static final SqlColumn<Date> holidaystime = myholidays.holidaystime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.432+08:00", comments="Source field: MyHolidays.HolidaysContent")
    public static final SqlColumn<String> holidayscontent = myholidays.holidayscontent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.432+08:00", comments="Source Table: MyHolidays")
    public static final class Myholidays extends SqlTable {
        public final SqlColumn<Date> holidaystime = column("HolidaysTime", JDBCType.TIMESTAMP);

        public final SqlColumn<String> holidayscontent = column("HolidaysContent", JDBCType.VARCHAR);

        public Myholidays() {
            super("MyHolidays");
        }
    }
}