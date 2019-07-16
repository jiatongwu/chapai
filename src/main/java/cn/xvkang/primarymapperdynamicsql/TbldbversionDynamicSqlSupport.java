package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TbldbversionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.961+08:00", comments="Source Table: tblDBVersion")
    public static final Tbldbversion tbldbversion = new Tbldbversion();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.961+08:00", comments="Source field: tblDBVersion.DBVer")
    public static final SqlColumn<Integer> dbver = tbldbversion.dbver;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.961+08:00", comments="Source field: tblDBVersion.upd_Time")
    public static final SqlColumn<Date> updTime = tbldbversion.updTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.961+08:00", comments="Source Table: tblDBVersion")
    public static final class Tbldbversion extends SqlTable {
        public final SqlColumn<Integer> dbver = column("DBVer", JDBCType.INTEGER);

        public final SqlColumn<Date> updTime = column("upd_Time", JDBCType.TIMESTAMP);

        public Tbldbversion() {
            super("tblDBVersion");
        }
    }
}