package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MDoordataDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.081+08:00", comments="Source Table: M_DoorData")
    public static final MDoordata MDoordata = new MDoordata();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.082+08:00", comments="Source field: M_DoorData.MachNo")
    public static final SqlColumn<Integer> machno = MDoordata.machno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.082+08:00", comments="Source field: M_DoorData.Place")
    public static final SqlColumn<String> place = MDoordata.place;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.082+08:00", comments="Source field: M_DoorData.BaudRate")
    public static final SqlColumn<Integer> baudrate = MDoordata.baudrate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.082+08:00", comments="Source field: M_DoorData.ControlType")
    public static final SqlColumn<Integer> controltype = MDoordata.controltype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.082+08:00", comments="Source field: M_DoorData.IPadress")
    public static final SqlColumn<String> ipadress = MDoordata.ipadress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.082+08:00", comments="Source field: M_DoorData.DoorNumber")
    public static final SqlColumn<String> doornumber = MDoordata.doornumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.082+08:00", comments="Source field: M_DoorData.DoorName")
    public static final SqlColumn<String> doorname = MDoordata.doorname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.082+08:00", comments="Source field: M_DoorData.DoorNumber1")
    public static final SqlColumn<String> doornumber1 = MDoordata.doornumber1;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.082+08:00", comments="Source field: M_DoorData.DoorName1")
    public static final SqlColumn<String> doorname1 = MDoordata.doorname1;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.082+08:00", comments="Source field: M_DoorData.DoorNumber2")
    public static final SqlColumn<String> doornumber2 = MDoordata.doornumber2;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.082+08:00", comments="Source field: M_DoorData.DoorName2")
    public static final SqlColumn<String> doorname2 = MDoordata.doorname2;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.082+08:00", comments="Source field: M_DoorData.DoorNumber3")
    public static final SqlColumn<String> doornumber3 = MDoordata.doornumber3;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.082+08:00", comments="Source field: M_DoorData.DoorName3")
    public static final SqlColumn<String> doorname3 = MDoordata.doorname3;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.082+08:00", comments="Source field: M_DoorData.DoorNumber4")
    public static final SqlColumn<String> doornumber4 = MDoordata.doornumber4;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.082+08:00", comments="Source field: M_DoorData.DoorName4")
    public static final SqlColumn<String> doorname4 = MDoordata.doorname4;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.082+08:00", comments="Source field: M_DoorData.DoorLeibie")
    public static final SqlColumn<String> doorleibie = MDoordata.doorleibie;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.082+08:00", comments="Source field: M_DoorData.DoorLeibie1")
    public static final SqlColumn<String> doorleibie1 = MDoordata.doorleibie1;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.082+08:00", comments="Source field: M_DoorData.DoorLeibie2")
    public static final SqlColumn<String> doorleibie2 = MDoordata.doorleibie2;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.082+08:00", comments="Source field: M_DoorData.DoorLeibie3")
    public static final SqlColumn<String> doorleibie3 = MDoordata.doorleibie3;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.082+08:00", comments="Source field: M_DoorData.DoorLeibie4")
    public static final SqlColumn<String> doorleibie4 = MDoordata.doorleibie4;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.082+08:00", comments="Source Table: M_DoorData")
    public static final class MDoordata extends SqlTable {
        public final SqlColumn<Integer> machno = column("MachNo", JDBCType.INTEGER);

        public final SqlColumn<String> place = column("Place", JDBCType.VARCHAR);

        public final SqlColumn<Integer> baudrate = column("BaudRate", JDBCType.INTEGER);

        public final SqlColumn<Integer> controltype = column("ControlType", JDBCType.INTEGER);

        public final SqlColumn<String> ipadress = column("IPadress", JDBCType.VARCHAR);

        public final SqlColumn<String> doornumber = column("DoorNumber", JDBCType.VARCHAR);

        public final SqlColumn<String> doorname = column("DoorName", JDBCType.VARCHAR);

        public final SqlColumn<String> doornumber1 = column("DoorNumber1", JDBCType.VARCHAR);

        public final SqlColumn<String> doorname1 = column("DoorName1", JDBCType.VARCHAR);

        public final SqlColumn<String> doornumber2 = column("DoorNumber2", JDBCType.VARCHAR);

        public final SqlColumn<String> doorname2 = column("DoorName2", JDBCType.VARCHAR);

        public final SqlColumn<String> doornumber3 = column("DoorNumber3", JDBCType.VARCHAR);

        public final SqlColumn<String> doorname3 = column("DoorName3", JDBCType.VARCHAR);

        public final SqlColumn<String> doornumber4 = column("DoorNumber4", JDBCType.VARCHAR);

        public final SqlColumn<String> doorname4 = column("DoorName4", JDBCType.VARCHAR);

        public final SqlColumn<String> doorleibie = column("DoorLeibie", JDBCType.VARCHAR);

        public final SqlColumn<String> doorleibie1 = column("DoorLeibie1", JDBCType.VARCHAR);

        public final SqlColumn<String> doorleibie2 = column("DoorLeibie2", JDBCType.VARCHAR);

        public final SqlColumn<String> doorleibie3 = column("DoorLeibie3", JDBCType.VARCHAR);

        public final SqlColumn<String> doorleibie4 = column("DoorLeibie4", JDBCType.VARCHAR);

        public MDoordata() {
            super("M_DoorData");
        }
    }
}