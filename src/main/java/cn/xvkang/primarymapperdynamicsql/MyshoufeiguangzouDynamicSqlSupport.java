package cn.xvkang.primarymapperdynamicsql;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MyshoufeiguangzouDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.644+08:00", comments="Source Table: MYSHOUFEIGUANGZOU")
    public static final Myshoufeiguangzou myshoufeiguangzou = new Myshoufeiguangzou();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.645+08:00", comments="Source field: MYSHOUFEIGUANGZOU.CardType")
    public static final SqlColumn<String> cardtype = myshoufeiguangzou.cardtype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.645+08:00", comments="Source field: MYSHOUFEIGUANGZOU.FreeMark")
    public static final SqlColumn<Integer> freemark = myshoufeiguangzou.freemark;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.645+08:00", comments="Source field: MYSHOUFEIGUANGZOU.FreeTime")
    public static final SqlColumn<Integer> freetime = myshoufeiguangzou.freetime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.645+08:00", comments="Source field: MYSHOUFEIGUANGZOU.SFCycle")
    public static final SqlColumn<Integer> sfcycle = myshoufeiguangzou.sfcycle;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.645+08:00", comments="Source field: MYSHOUFEIGUANGZOU.TimePeriod")
    public static final SqlColumn<Integer> timeperiod = myshoufeiguangzou.timeperiod;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.645+08:00", comments="Source field: MYSHOUFEIGUANGZOU.WithinPeriodSF")
    public static final SqlColumn<BigDecimal> withinperiodsf = myshoufeiguangzou.withinperiodsf;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.645+08:00", comments="Source field: MYSHOUFEIGUANGZOU.WithoutPeriodSF")
    public static final SqlColumn<BigDecimal> withoutperiodsf = myshoufeiguangzou.withoutperiodsf;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.644+08:00", comments="Source Table: MYSHOUFEIGUANGZOU")
    public static final class Myshoufeiguangzou extends SqlTable {
        public final SqlColumn<String> cardtype = column("CardType", JDBCType.VARCHAR);

        public final SqlColumn<Integer> freemark = column("FreeMark", JDBCType.INTEGER);

        public final SqlColumn<Integer> freetime = column("FreeTime", JDBCType.INTEGER);

        public final SqlColumn<Integer> sfcycle = column("SFCycle", JDBCType.INTEGER);

        public final SqlColumn<Integer> timeperiod = column("TimePeriod", JDBCType.INTEGER);

        public final SqlColumn<BigDecimal> withinperiodsf = column("WithinPeriodSF", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> withoutperiodsf = column("WithoutPeriodSF", JDBCType.DECIMAL);

        public Myshoufeiguangzou() {
            super("MYSHOUFEIGUANGZOU");
        }
    }
}