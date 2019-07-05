package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MRecordDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.746+08:00", comments="Source Table: M_Record")
    public static final MRecord MRecord = new MRecord();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.746+08:00", comments="Source field: M_Record.CardID")
    public static final SqlColumn<String> cardid = MRecord.cardid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.746+08:00", comments="Source field: M_Record.CardType")
    public static final SqlColumn<String> cardtype = MRecord.cardtype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.746+08:00", comments="Source field: M_Record.UserNo")
    public static final SqlColumn<String> userno = MRecord.userno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.746+08:00", comments="Source field: M_Record.UserName")
    public static final SqlColumn<String> username = MRecord.username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.746+08:00", comments="Source field: M_Record.Dept")
    public static final SqlColumn<String> dept = MRecord.dept;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.746+08:00", comments="Source field: M_Record.MachNo")
    public static final SqlColumn<Integer> machno = MRecord.machno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.746+08:00", comments="Source field: M_Record.MachPlace")
    public static final SqlColumn<String> machplace = MRecord.machplace;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.746+08:00", comments="Source field: M_Record.DoorNo")
    public static final SqlColumn<Integer> doorno = MRecord.doorno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.746+08:00", comments="Source field: M_Record.DoorPlace")
    public static final SqlColumn<String> doorplace = MRecord.doorplace;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.746+08:00", comments="Source field: M_Record.Events")
    public static final SqlColumn<String> events = MRecord.events;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.746+08:00", comments="Source field: M_Record.OpenTime")
    public static final SqlColumn<Date> opentime = MRecord.opentime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.746+08:00", comments="Source field: M_Record.ControlType")
    public static final SqlColumn<String> controltype = MRecord.controltype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.746+08:00", comments="Source Table: M_Record")
    public static final class MRecord extends SqlTable {
        public final SqlColumn<String> cardid = column("CardID", JDBCType.VARCHAR);

        public final SqlColumn<String> cardtype = column("CardType", JDBCType.VARCHAR);

        public final SqlColumn<String> userno = column("UserNo", JDBCType.VARCHAR);

        public final SqlColumn<String> username = column("UserName", JDBCType.VARCHAR);

        public final SqlColumn<String> dept = column("Dept", JDBCType.VARCHAR);

        public final SqlColumn<Integer> machno = column("MachNo", JDBCType.INTEGER);

        public final SqlColumn<String> machplace = column("MachPlace", JDBCType.VARCHAR);

        public final SqlColumn<Integer> doorno = column("DoorNo", JDBCType.INTEGER);

        public final SqlColumn<String> doorplace = column("DoorPlace", JDBCType.VARCHAR);

        public final SqlColumn<String> events = column("Events", JDBCType.VARCHAR);

        public final SqlColumn<Date> opentime = column("OpenTime", JDBCType.TIMESTAMP);

        public final SqlColumn<String> controltype = column("ControlType", JDBCType.CHAR);

        public MRecord() {
            super("M_Record");
        }
    }
}