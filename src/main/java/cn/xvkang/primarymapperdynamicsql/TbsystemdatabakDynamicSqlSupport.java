package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TbsystemdatabakDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.946+08:00", comments="Source Table: tbSystemDataBak")
    public static final Tbsystemdatabak tbsystemdatabak = new Tbsystemdatabak();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.946+08:00", comments="Source field: tbSystemDataBak.id")
    public static final SqlColumn<Integer> id = tbsystemdatabak.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.946+08:00", comments="Source field: tbSystemDataBak.IsEnld")
    public static final SqlColumn<Boolean> isenld = tbsystemdatabak.isenld;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.946+08:00", comments="Source field: tbSystemDataBak.LoadRoute")
    public static final SqlColumn<String> loadroute = tbsystemdatabak.loadroute;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.946+08:00", comments="Source field: tbSystemDataBak.BakTime")
    public static final SqlColumn<String> baktime = tbsystemdatabak.baktime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.946+08:00", comments="Source Table: tbSystemDataBak")
    public static final class Tbsystemdatabak extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Boolean> isenld = column("IsEnld", JDBCType.BIT);

        public final SqlColumn<String> loadroute = column("LoadRoute", JDBCType.VARCHAR);

        public final SqlColumn<String> baktime = column("BakTime", JDBCType.VARCHAR);

        public Tbsystemdatabak() {
            super("tbSystemDataBak");
        }
    }
}