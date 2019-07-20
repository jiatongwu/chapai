package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DoormjrealtimestautsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.948+08:00", comments="Source Table: DoorMjRealTimeStauts")
    public static final Doormjrealtimestauts doormjrealtimestauts = new Doormjrealtimestauts();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.949+08:00", comments="Source field: DoorMjRealTimeStauts.id")
    public static final SqlColumn<Integer> id = doormjrealtimestauts.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.949+08:00", comments="Source field: DoorMjRealTimeStauts.DoorName")
    public static final SqlColumn<String> doorname = doormjrealtimestauts.doorname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.949+08:00", comments="Source Table: DoorMjRealTimeStauts")
    public static final class Doormjrealtimestauts extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> doorname = column("DoorName", JDBCType.VARCHAR);

        public Doormjrealtimestauts() {
            super("DoorMjRealTimeStauts");
        }
    }
}