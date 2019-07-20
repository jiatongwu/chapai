package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MychechangpassDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.199+08:00", comments="Source Table: MYCHECHANGPASS")
    public static final Mychechangpass mychechangpass = new Mychechangpass();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.199+08:00", comments="Source field: MYCHECHANGPASS.Pwd")
    public static final SqlColumn<String> pwd = mychechangpass.pwd;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.199+08:00", comments="Source field: MYCHECHANGPASS.PCName")
    public static final SqlColumn<String> pcname = mychechangpass.pcname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.214+08:00", comments="Source field: MYCHECHANGPASS.BakeupTime")
    public static final SqlColumn<Date> bakeuptime = mychechangpass.bakeuptime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.199+08:00", comments="Source Table: MYCHECHANGPASS")
    public static final class Mychechangpass extends SqlTable {
        public final SqlColumn<String> pwd = column("Pwd", JDBCType.VARCHAR);

        public final SqlColumn<String> pcname = column("PCName", JDBCType.VARCHAR);

        public final SqlColumn<Date> bakeuptime = column("BakeupTime", JDBCType.TIMESTAMP);

        public Mychechangpass() {
            super("MYCHECHANGPASS");
        }
    }
}