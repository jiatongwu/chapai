package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SerTequanmodeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.932+08:00", comments="Source Table: Ser_TeQuanMode")
    public static final SerTequanmode serTequanmode = new SerTequanmode();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.932+08:00", comments="Source field: Ser_TeQuanMode.id")
    public static final SqlColumn<Integer> id = serTequanmode.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.932+08:00", comments="Source field: Ser_TeQuanMode.Devcid")
    public static final SqlColumn<Integer> devcid = serTequanmode.devcid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.932+08:00", comments="Source field: Ser_TeQuanMode.Doorid")
    public static final SqlColumn<Integer> doorid = serTequanmode.doorid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.932+08:00", comments="Source field: Ser_TeQuanMode.DoorMode")
    public static final SqlColumn<String> doormode = serTequanmode.doormode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.932+08:00", comments="Source Table: Ser_TeQuanMode")
    public static final class SerTequanmode extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> devcid = column("Devcid", JDBCType.INTEGER);

        public final SqlColumn<Integer> doorid = column("Doorid", JDBCType.INTEGER);

        public final SqlColumn<String> doormode = column("DoorMode", JDBCType.VARCHAR);

        public SerTequanmode() {
            super("Ser_TeQuanMode");
        }
    }
}