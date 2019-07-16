package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MyicvalidDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.761+08:00", comments="Source Table: MYICVALID")
    public static final Myicvalid myicvalid = new Myicvalid();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.761+08:00", comments="Source field: MYICVALID.CardNO")
    public static final SqlColumn<String> cardno = myicvalid.cardno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.761+08:00", comments="Source field: MYICVALID.OptDate")
    public static final SqlColumn<Date> optdate = myicvalid.optdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.761+08:00", comments="Source field: MYICVALID.NewStartDate")
    public static final SqlColumn<Date> newstartdate = myicvalid.newstartdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.761+08:00", comments="Source field: MYICVALID.NewEndDate")
    public static final SqlColumn<Date> newenddate = myicvalid.newenddate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.761+08:00", comments="Source field: MYICVALID.NewEachDayStartTime")
    public static final SqlColumn<String> neweachdaystarttime = myicvalid.neweachdaystarttime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.761+08:00", comments="Source field: MYICVALID.NewEachDayEndTime")
    public static final SqlColumn<String> neweachdayendtime = myicvalid.neweachdayendtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.761+08:00", comments="Source field: MYICVALID.ValidMachineID")
    public static final SqlColumn<String> validmachineid = myicvalid.validmachineid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.761+08:00", comments="Source field: MYICVALID.OperatorCardNO")
    public static final SqlColumn<String> operatorcardno = myicvalid.operatorcardno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.761+08:00", comments="Source field: MYICVALID.OptType")
    public static final SqlColumn<String> opttype = myicvalid.opttype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.761+08:00", comments="Source Table: MYICVALID")
    public static final class Myicvalid extends SqlTable {
        public final SqlColumn<String> cardno = column("CardNO", JDBCType.VARCHAR);

        public final SqlColumn<Date> optdate = column("OptDate", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> newstartdate = column("NewStartDate", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> newenddate = column("NewEndDate", JDBCType.TIMESTAMP);

        public final SqlColumn<String> neweachdaystarttime = column("NewEachDayStartTime", JDBCType.CHAR);

        public final SqlColumn<String> neweachdayendtime = column("NewEachDayEndTime", JDBCType.CHAR);

        public final SqlColumn<String> validmachineid = column("ValidMachineID", JDBCType.CHAR);

        public final SqlColumn<String> operatorcardno = column("OperatorCardNO", JDBCType.VARCHAR);

        public final SqlColumn<String> opttype = column("OptType", JDBCType.VARCHAR);

        public Myicvalid() {
            super("MYICVALID");
        }
    }
}