package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ZhMthcarDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.961+08:00", comments="Source Table: zh_MthCar")
    public static final ZhMthcar zhMthcar = new ZhMthcar();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.961+08:00", comments="Source field: zh_MthCar.id")
    public static final SqlColumn<Integer> id = zhMthcar.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.961+08:00", comments="Source field: zh_MthCar.carNo")
    public static final SqlColumn<String> carno = zhMthcar.carno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.961+08:00", comments="Source field: zh_MthCar.carType")
    public static final SqlColumn<String> cartype = zhMthcar.cartype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.961+08:00", comments="Source field: zh_MthCar.beginTime")
    public static final SqlColumn<String> begintime = zhMthcar.begintime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.961+08:00", comments="Source field: zh_MthCar.endTime")
    public static final SqlColumn<String> endtime = zhMthcar.endtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.961+08:00", comments="Source field: zh_MthCar.iusseTime")
    public static final SqlColumn<String> iussetime = zhMthcar.iussetime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.961+08:00", comments="Source field: zh_MthCar.userNo")
    public static final SqlColumn<String> userno = zhMthcar.userno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.961+08:00", comments="Source field: zh_MthCar.userName")
    public static final SqlColumn<String> username = zhMthcar.username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.961+08:00", comments="Source field: zh_MthCar.homeAddress")
    public static final SqlColumn<String> homeaddress = zhMthcar.homeaddress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.962+08:00", comments="Source field: zh_MthCar.mobNumber")
    public static final SqlColumn<String> mobnumber = zhMthcar.mobnumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.962+08:00", comments="Source field: zh_MthCar.carSpalcesNum")
    public static final SqlColumn<String> carspalcesnum = zhMthcar.carspalcesnum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.962+08:00", comments="Source field: zh_MthCar.stuat")
    public static final SqlColumn<Integer> stuat = zhMthcar.stuat;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.962+08:00", comments="Source field: zh_MthCar.synflag")
    public static final SqlColumn<Integer> synflag = zhMthcar.synflag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.961+08:00", comments="Source Table: zh_MthCar")
    public static final class ZhMthcar extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> carno = column("carNo", JDBCType.VARCHAR);

        public final SqlColumn<String> cartype = column("carType", JDBCType.VARCHAR);

        public final SqlColumn<String> begintime = column("beginTime", JDBCType.VARCHAR);

        public final SqlColumn<String> endtime = column("endTime", JDBCType.VARCHAR);

        public final SqlColumn<String> iussetime = column("iusseTime", JDBCType.VARCHAR);

        public final SqlColumn<String> userno = column("userNo", JDBCType.VARCHAR);

        public final SqlColumn<String> username = column("userName", JDBCType.VARCHAR);

        public final SqlColumn<String> homeaddress = column("homeAddress", JDBCType.VARCHAR);

        public final SqlColumn<String> mobnumber = column("mobNumber", JDBCType.VARCHAR);

        public final SqlColumn<String> carspalcesnum = column("carSpalcesNum", JDBCType.VARCHAR);

        public final SqlColumn<Integer> stuat = column("stuat", JDBCType.INTEGER);

        public final SqlColumn<Integer> synflag = column("synflag", JDBCType.INTEGER);

        public ZhMthcar() {
            super("zh_MthCar");
        }
    }
}