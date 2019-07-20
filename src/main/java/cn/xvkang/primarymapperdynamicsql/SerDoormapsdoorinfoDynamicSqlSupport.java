package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SerDoormapsdoorinfoDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.504+08:00", comments="Source Table: Ser_DoorMapsDoorInfo")
    public static final SerDoormapsdoorinfo serDoormapsdoorinfo = new SerDoormapsdoorinfo();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.504+08:00", comments="Source field: Ser_DoorMapsDoorInfo.id")
    public static final SqlColumn<Integer> id = serDoormapsdoorinfo.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.504+08:00", comments="Source field: Ser_DoorMapsDoorInfo.Mapid")
    public static final SqlColumn<Integer> mapid = serDoormapsdoorinfo.mapid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.504+08:00", comments="Source field: Ser_DoorMapsDoorInfo.Drawing")
    public static final SqlColumn<String> drawing = serDoormapsdoorinfo.drawing;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.504+08:00", comments="Source field: Ser_DoorMapsDoorInfo.DevcID")
    public static final SqlColumn<String> devcid = serDoormapsdoorinfo.devcid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.504+08:00", comments="Source field: Ser_DoorMapsDoorInfo.DevcName")
    public static final SqlColumn<String> devcname = serDoormapsdoorinfo.devcname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.504+08:00", comments="Source field: Ser_DoorMapsDoorInfo.Doorid")
    public static final SqlColumn<String> doorid = serDoormapsdoorinfo.doorid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.504+08:00", comments="Source field: Ser_DoorMapsDoorInfo.DoorName")
    public static final SqlColumn<String> doorname = serDoormapsdoorinfo.doorname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.504+08:00", comments="Source Table: Ser_DoorMapsDoorInfo")
    public static final class SerDoormapsdoorinfo extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> mapid = column("Mapid", JDBCType.INTEGER);

        public final SqlColumn<String> drawing = column("Drawing", JDBCType.VARCHAR);

        public final SqlColumn<String> devcid = column("DevcID", JDBCType.VARCHAR);

        public final SqlColumn<String> devcname = column("DevcName", JDBCType.VARCHAR);

        public final SqlColumn<String> doorid = column("Doorid", JDBCType.VARCHAR);

        public final SqlColumn<String> doorname = column("DoorName", JDBCType.VARCHAR);

        public SerDoormapsdoorinfo() {
            super("Ser_DoorMapsDoorInfo");
        }
    }
}