package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SerOpendoormodeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.853+08:00", comments="Source Table: Ser_OpenDoorMode")
    public static final SerOpendoormode serOpendoormode = new SerOpendoormode();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.854+08:00", comments="Source field: Ser_OpenDoorMode.id")
    public static final SqlColumn<Integer> id = serOpendoormode.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.854+08:00", comments="Source field: Ser_OpenDoorMode.Devcid")
    public static final SqlColumn<Integer> devcid = serOpendoormode.devcid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.854+08:00", comments="Source field: Ser_OpenDoorMode.Doorid")
    public static final SqlColumn<Integer> doorid = serOpendoormode.doorid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.854+08:00", comments="Source field: Ser_OpenDoorMode.DoorJl")
    public static final SqlColumn<String> doorjl = serOpendoormode.doorjl;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.854+08:00", comments="Source Table: Ser_OpenDoorMode")
    public static final class SerOpendoormode extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> devcid = column("Devcid", JDBCType.INTEGER);

        public final SqlColumn<Integer> doorid = column("Doorid", JDBCType.INTEGER);

        public final SqlColumn<String> doorjl = column("DoorJl", JDBCType.VARCHAR);

        public SerOpendoormode() {
            super("Ser_OpenDoorMode");
        }
    }
}