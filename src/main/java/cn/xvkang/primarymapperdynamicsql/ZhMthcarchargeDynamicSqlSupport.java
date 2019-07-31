package cn.xvkang.primarymapperdynamicsql;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ZhMthcarchargeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.218+08:00", comments="Source Table: zh_MthCarCharge")
    public static final ZhMthcarcharge zhMthcarcharge = new ZhMthcarcharge();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.218+08:00", comments="Source field: zh_MthCarCharge.id")
    public static final SqlColumn<Integer> id = zhMthcarcharge.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.218+08:00", comments="Source field: zh_MthCarCharge.carNo")
    public static final SqlColumn<String> carno = zhMthcarcharge.carno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.218+08:00", comments="Source field: zh_MthCarCharge.beginTime")
    public static final SqlColumn<String> begintime = zhMthcarcharge.begintime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.218+08:00", comments="Source field: zh_MthCarCharge.endTime")
    public static final SqlColumn<String> endtime = zhMthcarcharge.endtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.218+08:00", comments="Source field: zh_MthCarCharge.chargeTime")
    public static final SqlColumn<String> chargetime = zhMthcarcharge.chargetime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.218+08:00", comments="Source field: zh_MthCarCharge.chargeMoney")
    public static final SqlColumn<BigDecimal> chargemoney = zhMthcarcharge.chargemoney;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.218+08:00", comments="Source field: zh_MthCarCharge.synflag")
    public static final SqlColumn<Integer> synflag = zhMthcarcharge.synflag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.218+08:00", comments="Source Table: zh_MthCarCharge")
    public static final class ZhMthcarcharge extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> carno = column("carNo", JDBCType.VARCHAR);

        public final SqlColumn<String> begintime = column("beginTime", JDBCType.VARCHAR);

        public final SqlColumn<String> endtime = column("endTime", JDBCType.VARCHAR);

        public final SqlColumn<String> chargetime = column("chargeTime", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> chargemoney = column("chargeMoney", JDBCType.DECIMAL);

        public final SqlColumn<Integer> synflag = column("synflag", JDBCType.INTEGER);

        public ZhMthcarcharge() {
            super("zh_MthCarCharge");
        }
    }
}