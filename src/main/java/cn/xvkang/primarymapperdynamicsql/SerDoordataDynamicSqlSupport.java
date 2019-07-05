package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SerDoordataDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.834+08:00", comments="Source Table: Ser_DoorData")
    public static final SerDoordata serDoordata = new SerDoordata();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.834+08:00", comments="Source field: Ser_DoorData.DevcNo")
    public static final SqlColumn<Integer> devcno = serDoordata.devcno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.834+08:00", comments="Source field: Ser_DoorData.Place")
    public static final SqlColumn<String> place = serDoordata.place;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.834+08:00", comments="Source field: Ser_DoorData.DevcType")
    public static final SqlColumn<Integer> devctype = serDoordata.devctype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.834+08:00", comments="Source field: Ser_DoorData.Com")
    public static final SqlColumn<Integer> com = serDoordata.com;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.834+08:00", comments="Source field: Ser_DoorData.DoorInfo")
    public static final SqlColumn<String> doorinfo = serDoordata.doorinfo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.834+08:00", comments="Source Table: Ser_DoorData")
    public static final class SerDoordata extends SqlTable {
        public final SqlColumn<Integer> devcno = column("DevcNo", JDBCType.INTEGER);

        public final SqlColumn<String> place = column("Place", JDBCType.VARCHAR);

        public final SqlColumn<Integer> devctype = column("DevcType", JDBCType.INTEGER);

        public final SqlColumn<Integer> com = column("Com", JDBCType.INTEGER);

        public final SqlColumn<String> doorinfo = column("DoorInfo", JDBCType.VARCHAR);

        public SerDoordata() {
            super("Ser_DoorData");
        }
    }
}