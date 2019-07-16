package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MyvoicecardnosetDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.883+08:00", comments="Source Table: MyVoiceCardNOSET")
    public static final Myvoicecardnoset myvoicecardnoset = new Myvoicecardnoset();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.883+08:00", comments="Source field: MyVoiceCardNOSET.CtrlNumber")
    public static final SqlColumn<Integer> ctrlnumber = myvoicecardnoset.ctrlnumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.884+08:00", comments="Source field: MyVoiceCardNOSET.Voice")
    public static final SqlColumn<String> voice = myvoicecardnoset.voice;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.883+08:00", comments="Source Table: MyVoiceCardNOSET")
    public static final class Myvoicecardnoset extends SqlTable {
        public final SqlColumn<Integer> ctrlnumber = column("CtrlNumber", JDBCType.INTEGER);

        public final SqlColumn<String> voice = column("Voice", JDBCType.VARCHAR);

        public Myvoicecardnoset() {
            super("MyVoiceCardNOSET");
        }
    }
}