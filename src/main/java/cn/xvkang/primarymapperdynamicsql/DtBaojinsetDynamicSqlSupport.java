package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DtBaojinsetDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.962+08:00", comments="Source Table: Dt_BaoJinSet")
    public static final DtBaojinset dtBaojinset = new DtBaojinset();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.963+08:00", comments="Source field: Dt_BaoJinSet.id")
    public static final SqlColumn<Integer> id = dtBaojinset.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.963+08:00", comments="Source field: Dt_BaoJinSet.DevcNum")
    public static final SqlColumn<Integer> devcnum = dtBaojinset.devcnum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.963+08:00", comments="Source field: Dt_BaoJinSet.BaoJin")
    public static final SqlColumn<Integer> baojin = dtBaojinset.baojin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.962+08:00", comments="Source Table: Dt_BaoJinSet")
    public static final class DtBaojinset extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> devcnum = column("DevcNum", JDBCType.INTEGER);

        public final SqlColumn<Integer> baojin = column("BaoJin", JDBCType.INTEGER);

        public DtBaojinset() {
            super("Dt_BaoJinSet");
        }
    }
}