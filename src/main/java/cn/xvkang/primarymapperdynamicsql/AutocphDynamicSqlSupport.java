package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class AutocphDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.474+08:00", comments="Source Table: AutoCPH")
    public static final Autocph autocph = new Autocph();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.475+08:00", comments="Source field: AutoCPH.CPH")
    public static final SqlColumn<String> cph = autocph.cph;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.475+08:00", comments="Source Table: AutoCPH")
    public static final class Autocph extends SqlTable {
        public final SqlColumn<String> cph = column("CPH", JDBCType.VARCHAR);

        public Autocph() {
            super("AutoCPH");
        }
    }
}