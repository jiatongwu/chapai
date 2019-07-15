package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MyofflineDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.778+08:00", comments="Source Table: MYOffLine")
    public static final Myoffline myoffline = new Myoffline();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.778+08:00", comments="Source field: MYOffLine.CardNO")
    public static final SqlColumn<String> cardno = myoffline.cardno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.778+08:00", comments="Source field: MYOffLine.CPHCardNO")
    public static final SqlColumn<String> cphcardno = myoffline.cphcardno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.778+08:00", comments="Source field: MYOffLine.DownLoadTime")
    public static final SqlColumn<Date> downloadtime = myoffline.downloadtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.778+08:00", comments="Source field: MYOffLine.State")
    public static final SqlColumn<Integer> state = myoffline.state;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.778+08:00", comments="Source Table: MYOffLine")
    public static final class Myoffline extends SqlTable {
        public final SqlColumn<String> cardno = column("CardNO", JDBCType.VARCHAR);

        public final SqlColumn<String> cphcardno = column("CPHCardNO", JDBCType.VARCHAR);

        public final SqlColumn<Date> downloadtime = column("DownLoadTime", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> state = column("State", JDBCType.INTEGER);

        public Myoffline() {
            super("MYOffLine");
        }
    }
}