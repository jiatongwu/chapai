package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DtRecordDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.398+08:00", comments="Source Table: Dt_Record")
    public static final DtRecord dtRecord = new DtRecord();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.398+08:00", comments="Source field: Dt_Record.CardNo")
    public static final SqlColumn<String> cardno = dtRecord.cardno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.398+08:00", comments="Source field: Dt_Record.CardFlag")
    public static final SqlColumn<String> cardflag = dtRecord.cardflag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.398+08:00", comments="Source field: Dt_Record.OpenTime")
    public static final SqlColumn<Date> opentime = dtRecord.opentime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.398+08:00", comments="Source field: Dt_Record.DevcNo")
    public static final SqlColumn<Integer> devcno = dtRecord.devcno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.398+08:00", comments="Source field: Dt_Record.Foorflag")
    public static final SqlColumn<String> foorflag = dtRecord.foorflag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.398+08:00", comments="Source field: Dt_Record.Eventss")
    public static final SqlColumn<String> eventss = dtRecord.eventss;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.398+08:00", comments="Source Table: Dt_Record")
    public static final class DtRecord extends SqlTable {
        public final SqlColumn<String> cardno = column("CardNo", JDBCType.VARCHAR);

        public final SqlColumn<String> cardflag = column("CardFlag", JDBCType.VARCHAR);

        public final SqlColumn<Date> opentime = column("OpenTime", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> devcno = column("DevcNo", JDBCType.INTEGER);

        public final SqlColumn<String> foorflag = column("Foorflag", JDBCType.VARCHAR);

        public final SqlColumn<String> eventss = column("Eventss", JDBCType.VARCHAR);

        public DtRecord() {
            super("Dt_Record");
        }
    }
}