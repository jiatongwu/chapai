package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SerDoormapsbDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.834+08:00", comments="Source Table: Ser_DoorMapsB")
    public static final SerDoormapsb serDoormapsb = new SerDoormapsb();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.834+08:00", comments="Source field: Ser_DoorMapsB.Mapid")
    public static final SqlColumn<Integer> mapid = serDoormapsb.mapid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.834+08:00", comments="Source field: Ser_DoorMapsB.MapName")
    public static final SqlColumn<String> mapname = serDoormapsb.mapname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.834+08:00", comments="Source field: Ser_DoorMapsB.AltDate")
    public static final SqlColumn<Date> altdate = serDoormapsb.altdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.834+08:00", comments="Source field: Ser_DoorMapsB.MapLiu")
    public static final SqlColumn<byte[]> mapliu = serDoormapsb.mapliu;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.834+08:00", comments="Source Table: Ser_DoorMapsB")
    public static final class SerDoormapsb extends SqlTable {
        public final SqlColumn<Integer> mapid = column("Mapid", JDBCType.INTEGER);

        public final SqlColumn<String> mapname = column("MapName", JDBCType.VARCHAR);

        public final SqlColumn<Date> altdate = column("AltDate", JDBCType.TIMESTAMP);

        public final SqlColumn<byte[]> mapliu = column("MapLiu", JDBCType.BLOB);

        public SerDoormapsb() {
            super("Ser_DoorMapsB");
        }
    }
}