package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DoormjrealtimestautsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.334+08:00", comments="Source Table: DoorMjRealTimeStauts")
    public static final Doormjrealtimestauts doormjrealtimestauts = new Doormjrealtimestauts();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.335+08:00", comments="Source field: DoorMjRealTimeStauts.id")
    public static final SqlColumn<Integer> id = doormjrealtimestauts.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.335+08:00", comments="Source field: DoorMjRealTimeStauts.DoorName")
    public static final SqlColumn<String> doorname = doormjrealtimestauts.doorname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.335+08:00", comments="Source Table: DoorMjRealTimeStauts")
    public static final class Doormjrealtimestauts extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> doorname = column("DoorName", JDBCType.VARCHAR);

        public Doormjrealtimestauts() {
            super("DoorMjRealTimeStauts");
        }
    }
}