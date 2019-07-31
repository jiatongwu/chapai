package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ZhUpdatecarDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.226+08:00", comments="Source Table: zh_UpdateCar")
    public static final ZhUpdatecar zhUpdatecar = new ZhUpdatecar();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.226+08:00", comments="Source field: zh_UpdateCar.id")
    public static final SqlColumn<Integer> id = zhUpdatecar.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.226+08:00", comments="Source field: zh_UpdateCar.orderNo")
    public static final SqlColumn<String> orderno = zhUpdatecar.orderno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.226+08:00", comments="Source field: zh_UpdateCar.carNo")
    public static final SqlColumn<String> carno = zhUpdatecar.carno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.226+08:00", comments="Source field: zh_UpdateCar.synflag")
    public static final SqlColumn<Integer> synflag = zhUpdatecar.synflag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.226+08:00", comments="Source Table: zh_UpdateCar")
    public static final class ZhUpdatecar extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> orderno = column("orderNo", JDBCType.VARCHAR);

        public final SqlColumn<String> carno = column("carNo", JDBCType.VARCHAR);

        public final SqlColumn<Integer> synflag = column("synflag", JDBCType.INTEGER);

        public ZhUpdatecar() {
            super("zh_UpdateCar");
        }
    }
}