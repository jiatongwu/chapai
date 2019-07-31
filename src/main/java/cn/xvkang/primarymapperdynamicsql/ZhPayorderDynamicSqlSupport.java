package cn.xvkang.primarymapperdynamicsql;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ZhPayorderDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.221+08:00", comments="Source Table: zh_PayOrder")
    public static final ZhPayorder zhPayorder = new ZhPayorder();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.221+08:00", comments="Source field: zh_PayOrder.id")
    public static final SqlColumn<Integer> id = zhPayorder.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.221+08:00", comments="Source field: zh_PayOrder.payOrderNo")
    public static final SqlColumn<String> payorderno = zhPayorder.payorderno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.221+08:00", comments="Source field: zh_PayOrder.orderNo")
    public static final SqlColumn<String> orderno = zhPayorder.orderno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.221+08:00", comments="Source field: zh_PayOrder.carNo")
    public static final SqlColumn<String> carno = zhPayorder.carno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.221+08:00", comments="Source field: zh_PayOrder.carType")
    public static final SqlColumn<String> cartype = zhPayorder.cartype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.221+08:00", comments="Source field: zh_PayOrder.payTime")
    public static final SqlColumn<String> paytime = zhPayorder.paytime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.221+08:00", comments="Source field: zh_PayOrder.payMoney")
    public static final SqlColumn<BigDecimal> paymoney = zhPayorder.paymoney;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.221+08:00", comments="Source field: zh_PayOrder.payType")
    public static final SqlColumn<String> paytype = zhPayorder.paytype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.221+08:00", comments="Source field: zh_PayOrder.enterTime")
    public static final SqlColumn<String> entertime = zhPayorder.entertime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.221+08:00", comments="Source field: zh_PayOrder.synflag")
    public static final SqlColumn<Integer> synflag = zhPayorder.synflag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.221+08:00", comments="Source Table: zh_PayOrder")
    public static final class ZhPayorder extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> payorderno = column("payOrderNo", JDBCType.VARCHAR);

        public final SqlColumn<String> orderno = column("orderNo", JDBCType.VARCHAR);

        public final SqlColumn<String> carno = column("carNo", JDBCType.VARCHAR);

        public final SqlColumn<String> cartype = column("carType", JDBCType.VARCHAR);

        public final SqlColumn<String> paytime = column("payTime", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> paymoney = column("payMoney", JDBCType.DECIMAL);

        public final SqlColumn<String> paytype = column("payType", JDBCType.VARCHAR);

        public final SqlColumn<String> entertime = column("enterTime", JDBCType.VARCHAR);

        public final SqlColumn<Integer> synflag = column("synflag", JDBCType.INTEGER);

        public ZhPayorder() {
            super("zh_PayOrder");
        }
    }
}