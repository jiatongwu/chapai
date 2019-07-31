package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MymenjinrecordDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.038+08:00", comments="Source Table: MYMENJINRECORD")
    public static final Mymenjinrecord mymenjinrecord = new Mymenjinrecord();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.038+08:00", comments="Source field: MYMENJINRECORD.CtrlNumber")
    public static final SqlColumn<Integer> ctrlnumber = mymenjinrecord.ctrlnumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.038+08:00", comments="Source field: MYMENJINRECORD.CardNO")
    public static final SqlColumn<String> cardno = mymenjinrecord.cardno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.038+08:00", comments="Source field: MYMENJINRECORD.OpenDoorTime")
    public static final SqlColumn<Date> opendoortime = mymenjinrecord.opendoortime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.038+08:00", comments="Source field: MYMENJINRECORD.CardType")
    public static final SqlColumn<String> cardtype = mymenjinrecord.cardtype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.038+08:00", comments="Source Table: MYMENJINRECORD")
    public static final class Mymenjinrecord extends SqlTable {
        public final SqlColumn<Integer> ctrlnumber = column("CtrlNumber", JDBCType.INTEGER);

        public final SqlColumn<String> cardno = column("CardNO", JDBCType.VARCHAR);

        public final SqlColumn<Date> opendoortime = column("OpenDoorTime", JDBCType.TIMESTAMP);

        public final SqlColumn<String> cardtype = column("CardType", JDBCType.VARCHAR);

        public Mymenjinrecord() {
            super("MYMENJINRECORD");
        }
    }
}