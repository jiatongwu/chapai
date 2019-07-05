package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MyholidayDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.768+08:00", comments="Source Table: MyHoliday")
    public static final Myholiday myholiday = new Myholiday();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.768+08:00", comments="Source field: MyHoliday.Dates")
    public static final SqlColumn<Date> dates = myholiday.dates;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.768+08:00", comments="Source field: MyHoliday.Types")
    public static final SqlColumn<String> types = myholiday.types;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.768+08:00", comments="Source Table: MyHoliday")
    public static final class Myholiday extends SqlTable {
        public final SqlColumn<Date> dates = column("Dates", JDBCType.TIMESTAMP);

        public final SqlColumn<String> types = column("Types", JDBCType.VARCHAR);

        public Myholiday() {
            super("MyHoliday");
        }
    }
}