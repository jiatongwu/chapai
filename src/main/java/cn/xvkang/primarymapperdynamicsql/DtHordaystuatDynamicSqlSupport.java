package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DtHordaystuatDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.894+08:00", comments="Source Table: Dt_HordayStuat")
    public static final DtHordaystuat dtHordaystuat = new DtHordaystuat();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.894+08:00", comments="Source field: Dt_HordayStuat.id")
    public static final SqlColumn<Integer> id = dtHordaystuat.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.895+08:00", comments="Source field: Dt_HordayStuat.DevcNum")
    public static final SqlColumn<Integer> devcnum = dtHordaystuat.devcnum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.895+08:00", comments="Source field: Dt_HordayStuat.FoorInfo")
    public static final SqlColumn<String> foorinfo = dtHordaystuat.foorinfo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.894+08:00", comments="Source Table: Dt_HordayStuat")
    public static final class DtHordaystuat extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> devcnum = column("DevcNum", JDBCType.INTEGER);

        public final SqlColumn<String> foorinfo = column("FoorInfo", JDBCType.VARCHAR);

        public DtHordaystuat() {
            super("Dt_HordayStuat");
        }
    }
}