package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MDoormapsbDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.833+08:00", comments="Source Table: M_DoorMapsB")
    public static final MDoormapsb MDoormapsb = new MDoormapsb();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.833+08:00", comments="Source field: M_DoorMapsB.Mapid")
    public static final SqlColumn<Integer> mapid = MDoormapsb.mapid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.833+08:00", comments="Source field: M_DoorMapsB.MapName")
    public static final SqlColumn<String> mapname = MDoormapsb.mapname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.833+08:00", comments="Source field: M_DoorMapsB.AltDate")
    public static final SqlColumn<Date> altdate = MDoormapsb.altdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.833+08:00", comments="Source field: M_DoorMapsB.MapLiu")
    public static final SqlColumn<byte[]> mapliu = MDoormapsb.mapliu;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.833+08:00", comments="Source Table: M_DoorMapsB")
    public static final class MDoormapsb extends SqlTable {
        public final SqlColumn<Integer> mapid = column("Mapid", JDBCType.INTEGER);

        public final SqlColumn<String> mapname = column("MapName", JDBCType.VARCHAR);

        public final SqlColumn<Date> altdate = column("AltDate", JDBCType.TIMESTAMP);

        public final SqlColumn<byte[]> mapliu = column("MapLiu", JDBCType.BLOB);

        public MDoormapsb() {
            super("M_DoorMapsB");
        }
    }
}