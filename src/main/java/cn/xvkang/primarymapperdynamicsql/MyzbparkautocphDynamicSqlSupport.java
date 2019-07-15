package cn.xvkang.primarymapperdynamicsql;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MyzbparkautocphDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.810+08:00", comments="Source Table: MYZBPARKAutoCPH")
    public static final Myzbparkautocph myzbparkautocph = new Myzbparkautocph();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.810+08:00", comments="Source field: MYZBPARKAutoCPH.ID")
    public static final SqlColumn<Integer> id = myzbparkautocph.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.810+08:00", comments="Source field: MYZBPARKAutoCPH.CPH")
    public static final SqlColumn<String> cph = myzbparkautocph.cph;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.810+08:00", comments="Source field: MYZBPARKAutoCPH.Address")
    public static final SqlColumn<String> address = myzbparkautocph.address;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.810+08:00", comments="Source field: MYZBPARKAutoCPH.Favorable")
    public static final SqlColumn<BigDecimal> favorable = myzbparkautocph.favorable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.810+08:00", comments="Source field: MYZBPARKAutoCPH.Manner")
    public static final SqlColumn<String> manner = myzbparkautocph.manner;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.810+08:00", comments="Source field: MYZBPARKAutoCPH.OutHour")
    public static final SqlColumn<BigDecimal> outhour = myzbparkautocph.outhour;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.810+08:00", comments="Source field: MYZBPARKAutoCPH.OutDayNo")
    public static final SqlColumn<BigDecimal> outdayno = myzbparkautocph.outdayno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.810+08:00", comments="Source field: MYZBPARKAutoCPH.Enable")
    public static final SqlColumn<Boolean> enable = myzbparkautocph.enable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.810+08:00", comments="Source field: MYZBPARKAutoCPH.PCName")
    public static final SqlColumn<String> pcname = myzbparkautocph.pcname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.810+08:00", comments="Source field: MYZBPARKAutoCPH.OptTime")
    public static final SqlColumn<Date> opttime = myzbparkautocph.opttime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.810+08:00", comments="Source field: MYZBPARKAutoCPH.Operator")
    public static final SqlColumn<String> operator = myzbparkautocph.operator;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.810+08:00", comments="Source Table: MYZBPARKAutoCPH")
    public static final class Myzbparkautocph extends SqlTable {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<String> cph = column("CPH", JDBCType.VARCHAR);

        public final SqlColumn<String> address = column("Address", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> favorable = column("Favorable", JDBCType.DECIMAL);

        public final SqlColumn<String> manner = column("Manner", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> outhour = column("OutHour", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> outdayno = column("OutDayNo", JDBCType.DECIMAL);

        public final SqlColumn<Boolean> enable = column("Enable", JDBCType.BIT);

        public final SqlColumn<String> pcname = column("PCName", JDBCType.VARCHAR);

        public final SqlColumn<Date> opttime = column("OptTime", JDBCType.TIMESTAMP);

        public final SqlColumn<String> operator = column("Operator", JDBCType.VARCHAR);

        public Myzbparkautocph() {
            super("MYZBPARKAutoCPH");
        }
    }
}