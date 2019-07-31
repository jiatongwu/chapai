package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MyparkinggreetingDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.118+08:00", comments="Source Table: MyParkingGreeting")
    public static final Myparkinggreeting myparkinggreeting = new Myparkinggreeting();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.118+08:00", comments="Source field: MyParkingGreeting.CtrlNumber")
    public static final SqlColumn<Integer> ctrlnumber = myparkinggreeting.ctrlnumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.118+08:00", comments="Source field: MyParkingGreeting.Voice")
    public static final SqlColumn<String> voice = myparkinggreeting.voice;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.118+08:00", comments="Source field: MyParkingGreeting.StartTime")
    public static final SqlColumn<Date> starttime = myparkinggreeting.starttime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.118+08:00", comments="Source field: MyParkingGreeting.EndTime")
    public static final SqlColumn<Date> endtime = myparkinggreeting.endtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.118+08:00", comments="Source field: MyParkingGreeting.DredgeVoice")
    public static final SqlColumn<Boolean> dredgevoice = myparkinggreeting.dredgevoice;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.118+08:00", comments="Source Table: MyParkingGreeting")
    public static final class Myparkinggreeting extends SqlTable {
        public final SqlColumn<Integer> ctrlnumber = column("CtrlNumber", JDBCType.INTEGER);

        public final SqlColumn<String> voice = column("Voice", JDBCType.VARCHAR);

        public final SqlColumn<Date> starttime = column("StartTime", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> endtime = column("EndTime", JDBCType.TIMESTAMP);

        public final SqlColumn<Boolean> dredgevoice = column("DredgeVoice", JDBCType.BIT);

        public Myparkinggreeting() {
            super("MyParkingGreeting");
        }
    }
}