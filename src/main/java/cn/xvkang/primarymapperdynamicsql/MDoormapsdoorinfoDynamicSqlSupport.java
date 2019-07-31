package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MDoormapsdoorinfoDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.085+08:00", comments="Source Table: M_DoorMapsDoorInfo")
    public static final MDoormapsdoorinfo MDoormapsdoorinfo = new MDoormapsdoorinfo();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.085+08:00", comments="Source field: M_DoorMapsDoorInfo.id")
    public static final SqlColumn<Integer> id = MDoormapsdoorinfo.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.085+08:00", comments="Source field: M_DoorMapsDoorInfo.Mapid")
    public static final SqlColumn<Integer> mapid = MDoormapsdoorinfo.mapid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.085+08:00", comments="Source field: M_DoorMapsDoorInfo.Drawing")
    public static final SqlColumn<String> drawing = MDoormapsdoorinfo.drawing;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.085+08:00", comments="Source field: M_DoorMapsDoorInfo.DevcID")
    public static final SqlColumn<String> devcid = MDoormapsdoorinfo.devcid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.085+08:00", comments="Source field: M_DoorMapsDoorInfo.DevcName")
    public static final SqlColumn<String> devcname = MDoormapsdoorinfo.devcname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.085+08:00", comments="Source field: M_DoorMapsDoorInfo.Doorid")
    public static final SqlColumn<String> doorid = MDoormapsdoorinfo.doorid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.085+08:00", comments="Source field: M_DoorMapsDoorInfo.DoorName")
    public static final SqlColumn<String> doorname = MDoormapsdoorinfo.doorname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.085+08:00", comments="Source Table: M_DoorMapsDoorInfo")
    public static final class MDoormapsdoorinfo extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> mapid = column("Mapid", JDBCType.INTEGER);

        public final SqlColumn<String> drawing = column("Drawing", JDBCType.VARCHAR);

        public final SqlColumn<String> devcid = column("DevcID", JDBCType.VARCHAR);

        public final SqlColumn<String> devcname = column("DevcName", JDBCType.VARCHAR);

        public final SqlColumn<String> doorid = column("Doorid", JDBCType.VARCHAR);

        public final SqlColumn<String> doorname = column("DoorName", JDBCType.VARCHAR);

        public MDoormapsdoorinfo() {
            super("M_DoorMapsDoorInfo");
        }
    }
}