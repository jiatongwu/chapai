package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DtQrsdoordevcsetDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.662+08:00", comments="Source Table: Dt_qrsDoorDevcSet")
    public static final DtQrsdoordevcset dtQrsdoordevcset = new DtQrsdoordevcset();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.662+08:00", comments="Source field: Dt_qrsDoorDevcSet.DevcNum")
    public static final SqlColumn<Integer> devcnum = dtQrsdoordevcset.devcnum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.662+08:00", comments="Source field: Dt_qrsDoorDevcSet.DoorNum")
    public static final SqlColumn<Integer> doornum = dtQrsdoordevcset.doornum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.662+08:00", comments="Source field: Dt_qrsDoorDevcSet.DoorPace")
    public static final SqlColumn<String> doorpace = dtQrsdoordevcset.doorpace;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.662+08:00", comments="Source Table: Dt_qrsDoorDevcSet")
    public static final class DtQrsdoordevcset extends SqlTable {
        public final SqlColumn<Integer> devcnum = column("DevcNum", JDBCType.INTEGER);

        public final SqlColumn<Integer> doornum = column("DoorNum", JDBCType.INTEGER);

        public final SqlColumn<String> doorpace = column("DoorPace", JDBCType.VARCHAR);

        public DtQrsdoordevcset() {
            super("Dt_qrsDoorDevcSet");
        }
    }
}