package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ZhEstcaroutDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.215+08:00", comments="Source Table: zh_EstCarOut")
    public static final ZhEstcarout zhEstcarout = new ZhEstcarout();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.215+08:00", comments="Source field: zh_EstCarOut.id")
    public static final SqlColumn<Integer> id = zhEstcarout.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.215+08:00", comments="Source field: zh_EstCarOut.orderNo")
    public static final SqlColumn<String> orderno = zhEstcarout.orderno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.215+08:00", comments="Source field: zh_EstCarOut.carNo")
    public static final SqlColumn<String> carno = zhEstcarout.carno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.215+08:00", comments="Source field: zh_EstCarOut.carType")
    public static final SqlColumn<String> cartype = zhEstcarout.cartype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.215+08:00", comments="Source field: zh_EstCarOut.outTime")
    public static final SqlColumn<Date> outtime = zhEstcarout.outtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.215+08:00", comments="Source field: zh_EstCarOut.imgpath")
    public static final SqlColumn<String> imgpath = zhEstcarout.imgpath;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.215+08:00", comments="Source field: zh_EstCarOut.gateName")
    public static final SqlColumn<String> gatename = zhEstcarout.gatename;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.215+08:00", comments="Source field: zh_EstCarOut.ctlNo")
    public static final SqlColumn<Integer> ctlno = zhEstcarout.ctlno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.215+08:00", comments="Source field: zh_EstCarOut.synflag")
    public static final SqlColumn<Integer> synflag = zhEstcarout.synflag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.215+08:00", comments="Source Table: zh_EstCarOut")
    public static final class ZhEstcarout extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> orderno = column("orderNo", JDBCType.VARCHAR);

        public final SqlColumn<String> carno = column("carNo", JDBCType.VARCHAR);

        public final SqlColumn<String> cartype = column("carType", JDBCType.VARCHAR);

        public final SqlColumn<Date> outtime = column("outTime", JDBCType.TIMESTAMP);

        public final SqlColumn<String> imgpath = column("imgpath", JDBCType.VARCHAR);

        public final SqlColumn<String> gatename = column("gateName", JDBCType.VARCHAR);

        public final SqlColumn<Integer> ctlno = column("ctlNo", JDBCType.INTEGER);

        public final SqlColumn<Integer> synflag = column("synflag", JDBCType.INTEGER);

        public ZhEstcarout() {
            super("zh_EstCarOut");
        }
    }
}