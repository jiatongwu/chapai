package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DtFlootsetDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.548+08:00", comments="Source Table: Dt_FlootSet")
    public static final DtFlootset dtFlootset = new DtFlootset();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.548+08:00", comments="Source field: Dt_FlootSet.Floot")
    public static final SqlColumn<Integer> floot = dtFlootset.floot;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.548+08:00", comments="Source Table: Dt_FlootSet")
    public static final class DtFlootset extends SqlTable {
        public final SqlColumn<Integer> floot = column("Floot", JDBCType.INTEGER);

        public DtFlootset() {
            super("Dt_FlootSet");
        }
    }
}