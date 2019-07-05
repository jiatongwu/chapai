package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ZhReservecarDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.917+08:00", comments="Source Table: zh_ReserveCar")
    public static final ZhReservecar zhReservecar = new ZhReservecar();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.917+08:00", comments="Source field: zh_ReserveCar.id")
    public static final SqlColumn<Integer> id = zhReservecar.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.917+08:00", comments="Source field: zh_ReserveCar.orderNo")
    public static final SqlColumn<String> orderno = zhReservecar.orderno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.917+08:00", comments="Source field: zh_ReserveCar.carNo")
    public static final SqlColumn<String> carno = zhReservecar.carno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.917+08:00", comments="Source field: zh_ReserveCar.expirationTime")
    public static final SqlColumn<String> expirationtime = zhReservecar.expirationtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.917+08:00", comments="Source field: zh_ReserveCar.stuat")
    public static final SqlColumn<Integer> stuat = zhReservecar.stuat;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.918+08:00", comments="Source field: zh_ReserveCar.alterTime")
    public static final SqlColumn<String> altertime = zhReservecar.altertime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.917+08:00", comments="Source Table: zh_ReserveCar")
    public static final class ZhReservecar extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> orderno = column("orderNo", JDBCType.VARCHAR);

        public final SqlColumn<String> carno = column("carNo", JDBCType.VARCHAR);

        public final SqlColumn<String> expirationtime = column("expirationTime", JDBCType.VARCHAR);

        public final SqlColumn<Integer> stuat = column("stuat", JDBCType.INTEGER);

        public final SqlColumn<String> altertime = column("alterTime", JDBCType.VARCHAR);

        public ZhReservecar() {
            super("zh_ReserveCar");
        }
    }
}