package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ZhCouponDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.210+08:00", comments="Source Table: zh_Coupon")
    public static final ZhCoupon zhCoupon = new ZhCoupon();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.210+08:00", comments="Source field: zh_Coupon.id")
    public static final SqlColumn<Integer> id = zhCoupon.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.210+08:00", comments="Source field: zh_Coupon.orderNo")
    public static final SqlColumn<String> orderno = zhCoupon.orderno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.210+08:00", comments="Source field: zh_Coupon.carNo")
    public static final SqlColumn<String> carno = zhCoupon.carno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.210+08:00", comments="Source field: zh_Coupon.couponType")
    public static final SqlColumn<String> coupontype = zhCoupon.coupontype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.210+08:00", comments="Source field: zh_Coupon.couponValue")
    public static final SqlColumn<String> couponvalue = zhCoupon.couponvalue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.211+08:00", comments="Source field: zh_Coupon.invalidTime")
    public static final SqlColumn<Date> invalidtime = zhCoupon.invalidtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.211+08:00", comments="Source field: zh_Coupon.couponId")
    public static final SqlColumn<String> couponid = zhCoupon.couponid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.211+08:00", comments="Source field: zh_Coupon.merchantId")
    public static final SqlColumn<String> merchantid = zhCoupon.merchantid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.211+08:00", comments="Source field: zh_Coupon.merchantName")
    public static final SqlColumn<String> merchantname = zhCoupon.merchantname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.211+08:00", comments="Source field: zh_Coupon.couponStatus")
    public static final SqlColumn<Integer> couponstatus = zhCoupon.couponstatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.211+08:00", comments="Source field: zh_Coupon.alterTime")
    public static final SqlColumn<String> altertime = zhCoupon.altertime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.210+08:00", comments="Source Table: zh_Coupon")
    public static final class ZhCoupon extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> orderno = column("orderNo", JDBCType.VARCHAR);

        public final SqlColumn<String> carno = column("carNo", JDBCType.VARCHAR);

        public final SqlColumn<String> coupontype = column("couponType", JDBCType.VARCHAR);

        public final SqlColumn<String> couponvalue = column("couponValue", JDBCType.VARCHAR);

        public final SqlColumn<Date> invalidtime = column("invalidTime", JDBCType.TIMESTAMP);

        public final SqlColumn<String> couponid = column("couponId", JDBCType.VARCHAR);

        public final SqlColumn<String> merchantid = column("merchantId", JDBCType.VARCHAR);

        public final SqlColumn<String> merchantname = column("merchantName", JDBCType.VARCHAR);

        public final SqlColumn<Integer> couponstatus = column("couponStatus", JDBCType.INTEGER);

        public final SqlColumn<String> altertime = column("alterTime", JDBCType.VARCHAR);

        public ZhCoupon() {
            super("zh_Coupon");
        }
    }
}