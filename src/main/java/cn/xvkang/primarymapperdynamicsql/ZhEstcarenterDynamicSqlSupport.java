package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ZhEstcarenterDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.897+08:00", comments="Source Table: zh_EstCarEnter")
    public static final ZhEstcarenter zhEstcarenter = new ZhEstcarenter();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.897+08:00", comments="Source field: zh_EstCarEnter.id")
    public static final SqlColumn<Integer> id = zhEstcarenter.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.897+08:00", comments="Source field: zh_EstCarEnter.orderNo")
    public static final SqlColumn<String> orderno = zhEstcarenter.orderno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.897+08:00", comments="Source field: zh_EstCarEnter.carNo")
    public static final SqlColumn<String> carno = zhEstcarenter.carno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.897+08:00", comments="Source field: zh_EstCarEnter.carType")
    public static final SqlColumn<String> cartype = zhEstcarenter.cartype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.897+08:00", comments="Source field: zh_EstCarEnter.enterTime")
    public static final SqlColumn<Date> entertime = zhEstcarenter.entertime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.897+08:00", comments="Source field: zh_EstCarEnter.imgpath")
    public static final SqlColumn<String> imgpath = zhEstcarenter.imgpath;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.897+08:00", comments="Source field: zh_EstCarEnter.gateName")
    public static final SqlColumn<String> gatename = zhEstcarenter.gatename;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.897+08:00", comments="Source field: zh_EstCarEnter.synflag")
    public static final SqlColumn<Integer> synflag = zhEstcarenter.synflag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.897+08:00", comments="Source Table: zh_EstCarEnter")
    public static final class ZhEstcarenter extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> orderno = column("orderNo", JDBCType.VARCHAR);

        public final SqlColumn<String> carno = column("carNo", JDBCType.VARCHAR);

        public final SqlColumn<String> cartype = column("carType", JDBCType.VARCHAR);

        public final SqlColumn<Date> entertime = column("enterTime", JDBCType.TIMESTAMP);

        public final SqlColumn<String> imgpath = column("imgpath", JDBCType.VARCHAR);

        public final SqlColumn<String> gatename = column("gateName", JDBCType.VARCHAR);

        public final SqlColumn<Integer> synflag = column("synflag", JDBCType.INTEGER);

        public ZhEstcarenter() {
            super("zh_EstCarEnter");
        }
    }
}