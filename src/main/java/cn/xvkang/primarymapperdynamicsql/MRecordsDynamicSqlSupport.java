package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MRecordsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.866+08:00", comments="Source Table: M_Records")
    public static final MRecords MRecords = new MRecords();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.866+08:00", comments="Source field: M_Records.CardID")
    public static final SqlColumn<String> cardid = MRecords.cardid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.866+08:00", comments="Source field: M_Records.UserNo")
    public static final SqlColumn<String> userno = MRecords.userno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.866+08:00", comments="Source field: M_Records.MachNo")
    public static final SqlColumn<Integer> machno = MRecords.machno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.866+08:00", comments="Source field: M_Records.MachPlace")
    public static final SqlColumn<String> machplace = MRecords.machplace;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.866+08:00", comments="Source field: M_Records.DoorNo")
    public static final SqlColumn<Integer> doorno = MRecords.doorno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.866+08:00", comments="Source field: M_Records.DoorPlace")
    public static final SqlColumn<String> doorplace = MRecords.doorplace;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.866+08:00", comments="Source field: M_Records.Events")
    public static final SqlColumn<String> events = MRecords.events;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.866+08:00", comments="Source field: M_Records.OpenTime")
    public static final SqlColumn<Date> opentime = MRecords.opentime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.866+08:00", comments="Source field: M_Records.Password")
    public static final SqlColumn<String> password = MRecords.password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.866+08:00", comments="Source field: M_Records.PasswordType")
    public static final SqlColumn<String> passwordtype = MRecords.passwordtype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.866+08:00", comments="Source Table: M_Records")
    public static final class MRecords extends SqlTable {
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

        public MRecords() {
            super("M_Records");
        }
    }
}