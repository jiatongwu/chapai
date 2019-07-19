package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SerDoorrealtimestuatsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.859+08:00", comments="Source Table: Ser_DoorRealTimeStuats")
    public static final SerDoorrealtimestuats serDoorrealtimestuats = new SerDoorrealtimestuats();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.859+08:00", comments="Source field: Ser_DoorRealTimeStuats.id")
    public static final SqlColumn<Integer> id = serDoorrealtimestuats.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.859+08:00", comments="Source field: Ser_DoorRealTimeStuats.DoorName")
    public static final SqlColumn<String> doorname = serDoorrealtimestuats.doorname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.859+08:00", comments="Source Table: Ser_DoorRealTimeStuats")
    public static final class SerDoorrealtimestuats extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> doorname = column("DoorName", JDBCType.VARCHAR);

        public SerDoorrealtimestuats() {
            super("Ser_DoorRealTimeStuats");
        }
    }
}