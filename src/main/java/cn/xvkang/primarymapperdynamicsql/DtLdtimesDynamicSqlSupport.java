package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DtLdtimesDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.660+08:00", comments="Source Table: Dt_ldTimes")
    public static final DtLdtimes dtLdtimes = new DtLdtimes();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.661+08:00", comments="Source field: Dt_ldTimes.id")
    public static final SqlColumn<Integer> id = dtLdtimes.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.661+08:00", comments="Source field: Dt_ldTimes.DevcNo")
    public static final SqlColumn<Integer> devcno = dtLdtimes.devcno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.661+08:00", comments="Source field: Dt_ldTimes.times")
    public static final SqlColumn<String> times = dtLdtimes.times;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.660+08:00", comments="Source Table: Dt_ldTimes")
    public static final class DtLdtimes extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> devcno = column("DevcNo", JDBCType.INTEGER);

        public final SqlColumn<String> times = column("times", JDBCType.VARCHAR);

        public DtLdtimes() {
            super("Dt_ldTimes");
        }
    }
}