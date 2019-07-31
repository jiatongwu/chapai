package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DtYantimesetDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.936+08:00", comments="Source Table: Dt_YanTimeSet")
    public static final DtYantimeset dtYantimeset = new DtYantimeset();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.936+08:00", comments="Source field: Dt_YanTimeSet.id")
    public static final SqlColumn<Integer> id = dtYantimeset.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.936+08:00", comments="Source field: Dt_YanTimeSet.DevcNum")
    public static final SqlColumn<Integer> devcnum = dtYantimeset.devcnum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.936+08:00", comments="Source field: Dt_YanTimeSet.Yanshi")
    public static final SqlColumn<Integer> yanshi = dtYantimeset.yanshi;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.936+08:00", comments="Source Table: Dt_YanTimeSet")
    public static final class DtYantimeset extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> devcnum = column("DevcNum", JDBCType.INTEGER);

        public final SqlColumn<Integer> yanshi = column("Yanshi", JDBCType.INTEGER);

        public DtYantimeset() {
            super("Dt_YanTimeSet");
        }
    }
}