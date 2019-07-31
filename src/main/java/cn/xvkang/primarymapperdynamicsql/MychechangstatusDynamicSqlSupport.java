package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MychechangstatusDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.998+08:00", comments="Source Table: MYCHECHANGSTATUS")
    public static final Mychechangstatus mychechangstatus = new Mychechangstatus();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.998+08:00", comments="Source field: MYCHECHANGSTATUS.PCName")
    public static final SqlColumn<String> pcname = mychechangstatus.pcname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.998+08:00", comments="Source field: MYCHECHANGSTATUS.Online")
    public static final SqlColumn<Integer> online = mychechangstatus.online;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.998+08:00", comments="Source Table: MYCHECHANGSTATUS")
    public static final class Mychechangstatus extends SqlTable {
        public final SqlColumn<String> pcname = column("PCName", JDBCType.VARCHAR);

        public final SqlColumn<Integer> online = column("Online", JDBCType.INTEGER);

        public Mychechangstatus() {
            super("MYCHECHANGSTATUS");
        }
    }
}