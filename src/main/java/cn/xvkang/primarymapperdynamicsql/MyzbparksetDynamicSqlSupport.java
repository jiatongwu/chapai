package cn.xvkang.primarymapperdynamicsql;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MyzbparksetDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.072+08:00", comments="Source Table: MYZBPARKSet")
    public static final Myzbparkset myzbparkset = new Myzbparkset();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.072+08:00", comments="Source field: MYZBPARKSet.ID")
    public static final SqlColumn<Integer> id = myzbparkset.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.072+08:00", comments="Source field: MYZBPARKSet.Address")
    public static final SqlColumn<String> address = myzbparkset.address;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.072+08:00", comments="Source field: MYZBPARKSet.Favorable")
    public static final SqlColumn<BigDecimal> favorable = myzbparkset.favorable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.072+08:00", comments="Source field: MYZBPARKSet.Manner")
    public static final SqlColumn<String> manner = myzbparkset.manner;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.072+08:00", comments="Source field: MYZBPARKSet.OutHour")
    public static final SqlColumn<BigDecimal> outhour = myzbparkset.outhour;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.072+08:00", comments="Source field: MYZBPARKSet.OutDayNo")
    public static final SqlColumn<BigDecimal> outdayno = myzbparkset.outdayno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.072+08:00", comments="Source field: MYZBPARKSet.PCName")
    public static final SqlColumn<String> pcname = myzbparkset.pcname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.072+08:00", comments="Source Table: MYZBPARKSet")
    public static final class Myzbparkset extends SqlTable {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<String> address = column("Address", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> favorable = column("Favorable", JDBCType.DECIMAL);

        public final SqlColumn<String> manner = column("Manner", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> outhour = column("OutHour", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> outdayno = column("OutDayNo", JDBCType.DECIMAL);

        public final SqlColumn<String> pcname = column("PCName", JDBCType.VARCHAR);

        public Myzbparkset() {
            super("MYZBPARKSet");
        }
    }
}