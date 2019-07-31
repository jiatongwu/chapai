package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MyvoicecardnoDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.151+08:00", comments="Source Table: MyVoiceCardNO")
    public static final Myvoicecardno myvoicecardno = new Myvoicecardno();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.151+08:00", comments="Source field: MyVoiceCardNO.VoiceCardNO")
    public static final SqlColumn<String> voicecardno = myvoicecardno.voicecardno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.151+08:00", comments="Source field: MyVoiceCardNO.CtrlNumber")
    public static final SqlColumn<Integer> ctrlnumber = myvoicecardno.ctrlnumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.151+08:00", comments="Source Table: MyVoiceCardNO")
    public static final class Myvoicecardno extends SqlTable {
        public final SqlColumn<String> voicecardno = column("VoiceCardNO", JDBCType.VARCHAR);

        public final SqlColumn<Integer> ctrlnumber = column("CtrlNumber", JDBCType.INTEGER);

        public Myvoicecardno() {
            super("MyVoiceCardNO");
        }
    }
}