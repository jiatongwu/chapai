package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SerRecordsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.869+08:00", comments="Source Table: Ser_Records")
    public static final SerRecords serRecords = new SerRecords();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.869+08:00", comments="Source field: Ser_Records.CardID")
    public static final SqlColumn<String> cardid = serRecords.cardid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.869+08:00", comments="Source field: Ser_Records.UserNo")
    public static final SqlColumn<String> userno = serRecords.userno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.869+08:00", comments="Source field: Ser_Records.MachNo")
    public static final SqlColumn<Integer> machno = serRecords.machno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.869+08:00", comments="Source field: Ser_Records.MachPlace")
    public static final SqlColumn<String> machplace = serRecords.machplace;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.869+08:00", comments="Source field: Ser_Records.DoorNo")
    public static final SqlColumn<Integer> doorno = serRecords.doorno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.869+08:00", comments="Source field: Ser_Records.DoorPlace")
    public static final SqlColumn<String> doorplace = serRecords.doorplace;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.869+08:00", comments="Source field: Ser_Records.Events")
    public static final SqlColumn<String> events = serRecords.events;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.869+08:00", comments="Source field: Ser_Records.OpenTime")
    public static final SqlColumn<Date> opentime = serRecords.opentime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.869+08:00", comments="Source field: Ser_Records.Password")
    public static final SqlColumn<String> password = serRecords.password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.869+08:00", comments="Source field: Ser_Records.PasswordType")
    public static final SqlColumn<String> passwordtype = serRecords.passwordtype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.869+08:00", comments="Source Table: Ser_Records")
    public static final class SerRecords extends SqlTable {
        public final SqlColumn<String> cardid = column("CardID", JDBCType.VARCHAR);

        public final SqlColumn<String> userno = column("UserNo", JDBCType.VARCHAR);

        public final SqlColumn<Integer> machno = column("MachNo", JDBCType.INTEGER);

        public final SqlColumn<String> machplace = column("MachPlace", JDBCType.VARCHAR);

        public final SqlColumn<Integer> doorno = column("DoorNo", JDBCType.INTEGER);

        public final SqlColumn<String> doorplace = column("DoorPlace", JDBCType.VARCHAR);

        public final SqlColumn<String> events = column("Events", JDBCType.VARCHAR);

        public final SqlColumn<Date> opentime = column("OpenTime", JDBCType.TIMESTAMP);

        public final SqlColumn<String> password = column("Password", JDBCType.VARCHAR);

        public final SqlColumn<String> passwordtype = column("PasswordType", JDBCType.VARCHAR);

        public SerRecords() {
            super("Ser_Records");
        }
    }
}