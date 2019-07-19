package cn.xvkang.primarymapperdynamicsql;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ZhEntercarDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.895+08:00", comments="Source Table: zh_EnterCar")
    public static final ZhEntercar zhEntercar = new ZhEntercar();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.895+08:00", comments="Source field: zh_EnterCar.id")
    public static final SqlColumn<Integer> id = zhEntercar.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.895+08:00", comments="Source field: zh_EnterCar.orderNo")
    public static final SqlColumn<String> orderno = zhEntercar.orderno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.895+08:00", comments="Source field: zh_EnterCar.carNo")
    public static final SqlColumn<String> carno = zhEntercar.carno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.895+08:00", comments="Source field: zh_EnterCar.carType")
    public static final SqlColumn<String> cartype = zhEntercar.cartype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.895+08:00", comments="Source field: zh_EnterCar.enterTime")
    public static final SqlColumn<String> entertime = zhEntercar.entertime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.895+08:00", comments="Source field: zh_EnterCar.gateName")
    public static final SqlColumn<String> gatename = zhEntercar.gatename;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.895+08:00", comments="Source field: zh_EnterCar.operatorName")
    public static final SqlColumn<String> operatorname = zhEntercar.operatorname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.895+08:00", comments="Source field: zh_EnterCar.reserveOrderNo")
    public static final SqlColumn<String> reserveorderno = zhEntercar.reserveorderno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.895+08:00", comments="Source field: zh_EnterCar.imgpath")
    public static final SqlColumn<String> imgpath = zhEntercar.imgpath;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.895+08:00", comments="Source field: zh_EnterCar.lockstuat")
    public static final SqlColumn<Integer> lockstuat = zhEntercar.lockstuat;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.895+08:00", comments="Source field: zh_EnterCar.walletTotalMoney")
    public static final SqlColumn<BigDecimal> wallettotalmoney = zhEntercar.wallettotalmoney;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.895+08:00", comments="Source field: zh_EnterCar.imgflag")
    public static final SqlColumn<Integer> imgflag = zhEntercar.imgflag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.895+08:00", comments="Source field: zh_EnterCar.synflag")
    public static final SqlColumn<Integer> synflag = zhEntercar.synflag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.895+08:00", comments="Source Table: zh_EnterCar")
    public static final class ZhEntercar extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> orderno = column("orderNo", JDBCType.VARCHAR);

        public final SqlColumn<String> carno = column("carNo", JDBCType.VARCHAR);

        public final SqlColumn<String> cartype = column("carType", JDBCType.VARCHAR);

        public final SqlColumn<String> entertime = column("enterTime", JDBCType.VARCHAR);

        public final SqlColumn<String> gatename = column("gateName", JDBCType.VARCHAR);

        public final SqlColumn<String> operatorname = column("operatorName", JDBCType.VARCHAR);

        public final SqlColumn<String> reserveorderno = column("reserveOrderNo", JDBCType.VARCHAR);

        public final SqlColumn<String> imgpath = column("imgpath", JDBCType.VARCHAR);

        public final SqlColumn<Integer> lockstuat = column("lockstuat", JDBCType.INTEGER);

        public final SqlColumn<BigDecimal> wallettotalmoney = column("walletTotalMoney", JDBCType.DECIMAL);

        public final SqlColumn<Integer> imgflag = column("imgflag", JDBCType.INTEGER);

        public final SqlColumn<Integer> synflag = column("synflag", JDBCType.INTEGER);

        public ZhEntercar() {
            super("zh_EnterCar");
        }
    }
}