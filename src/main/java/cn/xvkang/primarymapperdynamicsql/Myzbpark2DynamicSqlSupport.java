package cn.xvkang.primarymapperdynamicsql;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class Myzbpark2DynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.808+08:00", comments="Source Table: MYZBPARK2")
    public static final Myzbpark2 myzbpark2 = new Myzbpark2();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.808+08:00", comments="Source field: MYZBPARK2.CtrlNumber")
    public static final SqlColumn<Integer> ctrlnumber = myzbpark2.ctrlnumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.808+08:00", comments="Source field: MYZBPARK2.Address")
    public static final SqlColumn<String> address = myzbpark2.address;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.808+08:00", comments="Source field: MYZBPARK2.Favorable")
    public static final SqlColumn<BigDecimal> favorable = myzbpark2.favorable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.808+08:00", comments="Source field: MYZBPARK2.Manner")
    public static final SqlColumn<String> manner = myzbpark2.manner;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.808+08:00", comments="Source field: MYZBPARK2.OutHour")
    public static final SqlColumn<BigDecimal> outhour = myzbpark2.outhour;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.808+08:00", comments="Source field: MYZBPARK2.OutDayNo")
    public static final SqlColumn<BigDecimal> outdayno = myzbpark2.outdayno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.808+08:00", comments="Source Table: MYZBPARK2")
    public static final class Myzbpark2 extends SqlTable {
        public final SqlColumn<Integer> ctrlnumber = column("CtrlNumber", JDBCType.INTEGER);

        public final SqlColumn<String> address = column("Address", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> favorable = column("Favorable", JDBCType.DECIMAL);

        public final SqlColumn<String> manner = column("Manner", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> outhour = column("OutHour", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> outdayno = column("OutDayNo", JDBCType.DECIMAL);

        public Myzbpark2() {
            super("MYZBPARK2");
        }
    }
}