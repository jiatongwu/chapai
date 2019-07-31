package cn.xvkang.primarymapperdynamicsql;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ZhOutcarDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.219+08:00", comments="Source Table: zh_OutCar")
    public static final ZhOutcar zhOutcar = new ZhOutcar();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.219+08:00", comments="Source field: zh_OutCar.id")
    public static final SqlColumn<Integer> id = zhOutcar.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.219+08:00", comments="Source field: zh_OutCar.orderNo")
    public static final SqlColumn<String> orderno = zhOutcar.orderno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.219+08:00", comments="Source field: zh_OutCar.carNo")
    public static final SqlColumn<String> carno = zhOutcar.carno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.219+08:00", comments="Source field: zh_OutCar.carType")
    public static final SqlColumn<String> cartype = zhOutcar.cartype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.219+08:00", comments="Source field: zh_OutCar.outTime")
    public static final SqlColumn<String> outtime = zhOutcar.outtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.219+08:00", comments="Source field: zh_OutCar.gateName")
    public static final SqlColumn<String> gatename = zhOutcar.gatename;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.219+08:00", comments="Source field: zh_OutCar.operatorName")
    public static final SqlColumn<String> operatorname = zhOutcar.operatorname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.219+08:00", comments="Source field: zh_OutCar.imgpath")
    public static final SqlColumn<String> imgpath = zhOutcar.imgpath;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.219+08:00", comments="Source field: zh_OutCar.totalAmount")
    public static final SqlColumn<BigDecimal> totalamount = zhOutcar.totalamount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.219+08:00", comments="Source field: zh_OutCar.couponId")
    public static final SqlColumn<Integer> couponid = zhOutcar.couponid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.219+08:00", comments="Source field: zh_OutCar.couponMoney")
    public static final SqlColumn<BigDecimal> couponmoney = zhOutcar.couponmoney;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.220+08:00", comments="Source field: zh_OutCar.walletPayMoney")
    public static final SqlColumn<BigDecimal> walletpaymoney = zhOutcar.walletpaymoney;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.220+08:00", comments="Source field: zh_OutCar.ycflag")
    public static final SqlColumn<Integer> ycflag = zhOutcar.ycflag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.220+08:00", comments="Source field: zh_OutCar.imgflag")
    public static final SqlColumn<Integer> imgflag = zhOutcar.imgflag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.220+08:00", comments="Source field: zh_OutCar.synflag")
    public static final SqlColumn<Integer> synflag = zhOutcar.synflag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.220+08:00", comments="Source field: zh_OutCar.freeReason")
    public static final SqlColumn<String> freereason = zhOutcar.freereason;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.219+08:00", comments="Source Table: zh_OutCar")
    public static final class ZhOutcar extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> orderno = column("orderNo", JDBCType.VARCHAR);

        public final SqlColumn<String> carno = column("carNo", JDBCType.VARCHAR);

        public final SqlColumn<String> cartype = column("carType", JDBCType.VARCHAR);

        public final SqlColumn<String> outtime = column("outTime", JDBCType.VARCHAR);

        public final SqlColumn<String> gatename = column("gateName", JDBCType.VARCHAR);

        public final SqlColumn<String> operatorname = column("operatorName", JDBCType.VARCHAR);

        public final SqlColumn<String> imgpath = column("imgpath", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> totalamount = column("totalAmount", JDBCType.DECIMAL);

        public final SqlColumn<Integer> couponid = column("couponId", JDBCType.INTEGER);

        public final SqlColumn<BigDecimal> couponmoney = column("couponMoney", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> walletpaymoney = column("walletPayMoney", JDBCType.DECIMAL);

        public final SqlColumn<Integer> ycflag = column("ycflag", JDBCType.INTEGER);

        public final SqlColumn<Integer> imgflag = column("imgflag", JDBCType.INTEGER);

        public final SqlColumn<Integer> synflag = column("synflag", JDBCType.INTEGER);

        public final SqlColumn<String> freereason = column("freeReason", JDBCType.VARCHAR);

        public ZhOutcar() {
            super("zh_OutCar");
        }
    }
}