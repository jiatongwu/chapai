package cn.xvkang.primarymapperdynamicsql;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MyicmoneyDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.768+08:00", comments="Source Table: MYICMONEY")
    public static final Myicmoney myicmoney = new Myicmoney();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.768+08:00", comments="Source field: MYICMONEY.ID")
    public static final SqlColumn<Integer> id = myicmoney.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.768+08:00", comments="Source field: MYICMONEY.CardNO")
    public static final SqlColumn<String> cardno = myicmoney.cardno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.768+08:00", comments="Source field: MYICMONEY.OptDate")
    public static final SqlColumn<Date> optdate = myicmoney.optdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.768+08:00", comments="Source field: MYICMONEY.SFJE")
    public static final SqlColumn<BigDecimal> sfje = myicmoney.sfje;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.768+08:00", comments="Source field: MYICMONEY.Balance")
    public static final SqlColumn<BigDecimal> balance = myicmoney.balance;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.768+08:00", comments="Source field: MYICMONEY.OperatorCardNO")
    public static final SqlColumn<String> operatorcardno = myicmoney.operatorcardno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.768+08:00", comments="Source field: MYICMONEY.OptType")
    public static final SqlColumn<String> opttype = myicmoney.opttype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.768+08:00", comments="Source field: MYICMONEY.NewStartDate")
    public static final SqlColumn<Date> newstartdate = myicmoney.newstartdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.768+08:00", comments="Source field: MYICMONEY.NewEndDate")
    public static final SqlColumn<Date> newenddate = myicmoney.newenddate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.768+08:00", comments="Source field: MYICMONEY.LastEndDate")
    public static final SqlColumn<Date> lastenddate = myicmoney.lastenddate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.768+08:00", comments="Source field: MYICMONEY.Remark")
    public static final SqlColumn<String> remark = myicmoney.remark;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.768+08:00", comments="Source Table: MYICMONEY")
    public static final class Myicmoney extends SqlTable {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<String> cardno = column("CardNO", JDBCType.VARCHAR);

        public final SqlColumn<Date> optdate = column("OptDate", JDBCType.TIMESTAMP);

        public final SqlColumn<BigDecimal> sfje = column("SFJE", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> balance = column("Balance", JDBCType.DECIMAL);

        public final SqlColumn<String> operatorcardno = column("OperatorCardNO", JDBCType.VARCHAR);

        public final SqlColumn<String> opttype = column("OptType", JDBCType.VARCHAR);

        public final SqlColumn<Date> newstartdate = column("NewStartDate", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> newenddate = column("NewEndDate", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> lastenddate = column("LastEndDate", JDBCType.TIMESTAMP);

        public final SqlColumn<String> remark = column("Remark", JDBCType.VARCHAR);

        public Myicmoney() {
            super("MYICMONEY");
        }
    }
}