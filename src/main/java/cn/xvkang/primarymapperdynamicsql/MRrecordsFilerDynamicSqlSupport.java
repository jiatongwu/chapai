package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MRrecordsFilerDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.751+08:00", comments="Source Table: M_Rrecords_Filer")
    public static final MRrecordsFiler MRrecordsFiler = new MRrecordsFiler();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.751+08:00", comments="Source field: M_Rrecords_Filer.CardID")
    public static final SqlColumn<String> cardid = MRrecordsFiler.cardid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.751+08:00", comments="Source field: M_Rrecords_Filer.UserNo")
    public static final SqlColumn<String> userno = MRrecordsFiler.userno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.751+08:00", comments="Source field: M_Rrecords_Filer.MachNo")
    public static final SqlColumn<Integer> machno = MRrecordsFiler.machno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.751+08:00", comments="Source field: M_Rrecords_Filer.MachPlace")
    public static final SqlColumn<String> machplace = MRrecordsFiler.machplace;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.751+08:00", comments="Source field: M_Rrecords_Filer.DoorNo")
    public static final SqlColumn<Integer> doorno = MRrecordsFiler.doorno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.751+08:00", comments="Source field: M_Rrecords_Filer.DoorPlace")
    public static final SqlColumn<String> doorplace = MRrecordsFiler.doorplace;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.751+08:00", comments="Source field: M_Rrecords_Filer.Events")
    public static final SqlColumn<String> events = MRrecordsFiler.events;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.751+08:00", comments="Source field: M_Rrecords_Filer.OpenTime")
    public static final SqlColumn<Date> opentime = MRrecordsFiler.opentime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.752+08:00", comments="Source field: M_Rrecords_Filer.Password")
    public static final SqlColumn<String> password = MRrecordsFiler.password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.752+08:00", comments="Source field: M_Rrecords_Filer.PasswordType")
    public static final SqlColumn<String> passwordtype = MRrecordsFiler.passwordtype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.751+08:00", comments="Source Table: M_Rrecords_Filer")
    public static final class MRrecordsFiler extends SqlTable {
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

        public MRrecordsFiler() {
            super("M_Rrecords_Filer");
        }
    }
}