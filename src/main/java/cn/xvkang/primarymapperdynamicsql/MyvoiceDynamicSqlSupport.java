package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MyvoiceDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.890+08:00", comments="Source Table: MyVoice")
    public static final Myvoice myvoice = new Myvoice();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.890+08:00", comments="Source field: MyVoice.Number")
    public static final SqlColumn<Integer> number = myvoice.number;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.890+08:00", comments="Source field: MyVoice.CardNO")
    public static final SqlColumn<String> cardno = myvoice.cardno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.890+08:00", comments="Source field: MyVoice.StartTime")
    public static final SqlColumn<Date> starttime = myvoice.starttime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.890+08:00", comments="Source field: MyVoice.EndTime")
    public static final SqlColumn<Date> endtime = myvoice.endtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.890+08:00", comments="Source field: MyVoice.InVoice")
    public static final SqlColumn<String> invoice = myvoice.invoice;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.890+08:00", comments="Source field: MyVoice.OutVoice")
    public static final SqlColumn<String> outvoice = myvoice.outvoice;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.890+08:00", comments="Source Table: MyVoice")
    public static final class Myvoice extends SqlTable {
        public final SqlColumn<Integer> number = column("Number", JDBCType.INTEGER);

        public final SqlColumn<String> cardno = column("CardNO", JDBCType.VARCHAR);

        public final SqlColumn<Date> starttime = column("StartTime", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> endtime = column("EndTime", JDBCType.TIMESTAMP);

        public final SqlColumn<String> invoice = column("InVoice", JDBCType.VARCHAR);

        public final SqlColumn<String> outvoice = column("OutVoice", JDBCType.VARCHAR);

        public Myvoice() {
            super("MyVoice");
        }
    }
}