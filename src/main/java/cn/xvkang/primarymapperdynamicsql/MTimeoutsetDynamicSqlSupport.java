package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MTimeoutsetDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.796+08:00", comments="Source Table: M_TimeOutSet")
    public static final MTimeoutset MTimeoutset = new MTimeoutset();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.797+08:00", comments="Source field: M_TimeOutSet.id")
    public static final SqlColumn<Integer> id = MTimeoutset.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.797+08:00", comments="Source field: M_TimeOutSet.DevcNum")
    public static final SqlColumn<Integer> devcnum = MTimeoutset.devcnum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.797+08:00", comments="Source field: M_TimeOutSet.Doornum")
    public static final SqlColumn<Integer> doornum = MTimeoutset.doornum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.797+08:00", comments="Source field: M_TimeOutSet.Times")
    public static final SqlColumn<Integer> times = MTimeoutset.times;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.796+08:00", comments="Source Table: M_TimeOutSet")
    public static final class MTimeoutset extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> devcnum = column("DevcNum", JDBCType.INTEGER);

        public final SqlColumn<Integer> doornum = column("Doornum", JDBCType.INTEGER);

        public final SqlColumn<Integer> times = column("Times", JDBCType.INTEGER);

        public MTimeoutset() {
            super("M_TimeOutSet");
        }
    }
}