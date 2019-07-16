package cn.xvkang.primarymapperdynamicsql;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MychechangnormalshoufeiDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.685+08:00", comments="Source Table: MYCHECHANGNORMALSHOUFEI")
    public static final Mychechangnormalshoufei mychechangnormalshoufei = new Mychechangnormalshoufei();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.685+08:00", comments="Source field: MYCHECHANGNORMALSHOUFEI.CardType")
    public static final SqlColumn<String> cardtype = mychechangnormalshoufei.cardtype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.685+08:00", comments="Source field: MYCHECHANGNORMALSHOUFEI.FreeMinute")
    public static final SqlColumn<Integer> freeminute = mychechangnormalshoufei.freeminute;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.685+08:00", comments="Source field: MYCHECHANGNORMALSHOUFEI.TopSF")
    public static final SqlColumn<Integer> topsf = mychechangnormalshoufei.topsf;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.685+08:00", comments="Source field: MYCHECHANGNORMALSHOUFEI.Hours")
    public static final SqlColumn<Integer> hours = mychechangnormalshoufei.hours;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.686+08:00", comments="Source field: MYCHECHANGNORMALSHOUFEI.JE")
    public static final SqlColumn<BigDecimal> je = mychechangnormalshoufei.je;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.685+08:00", comments="Source Table: MYCHECHANGNORMALSHOUFEI")
    public static final class Mychechangnormalshoufei extends SqlTable {
        public final SqlColumn<String> cardtype = column("CardType", JDBCType.VARCHAR);

        public final SqlColumn<Integer> freeminute = column("FreeMinute", JDBCType.INTEGER);

        public final SqlColumn<Integer> topsf = column("TopSF", JDBCType.INTEGER);

        public final SqlColumn<Integer> hours = column("Hours", JDBCType.INTEGER);

        public final SqlColumn<BigDecimal> je = column("JE", JDBCType.DECIMAL);

        public Mychechangnormalshoufei() {
            super("MYCHECHANGNORMALSHOUFEI");
        }
    }
}