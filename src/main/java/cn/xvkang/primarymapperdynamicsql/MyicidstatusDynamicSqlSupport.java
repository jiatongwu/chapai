package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MyicidstatusDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.027+08:00", comments="Source Table: MYICIDSTATUS")
    public static final Myicidstatus myicidstatus = new Myicidstatus();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.027+08:00", comments="Source field: MYICIDSTATUS.CardState")
    public static final SqlColumn<String> cardstate = myicidstatus.cardstate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.027+08:00", comments="Source field: MYICIDSTATUS.CardState2")
    public static final SqlColumn<String> cardstate2 = myicidstatus.cardstate2;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.027+08:00", comments="Source Table: MYICIDSTATUS")
    public static final class Myicidstatus extends SqlTable {
        public final SqlColumn<String> cardstate = column("CardState", JDBCType.VARCHAR);

        public final SqlColumn<String> cardstate2 = column("CardState2", JDBCType.VARCHAR);

        public Myicidstatus() {
            super("MYICIDSTATUS");
        }
    }
}