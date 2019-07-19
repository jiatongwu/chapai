package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DtRealtimstuatsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.571+08:00", comments="Source Table: Dt_RealTimStuats")
    public static final DtRealtimstuats dtRealtimstuats = new DtRealtimstuats();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.572+08:00", comments="Source field: Dt_RealTimStuats.id")
    public static final SqlColumn<Integer> id = dtRealtimstuats.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.572+08:00", comments="Source field: Dt_RealTimStuats.DevcName")
    public static final SqlColumn<String> devcname = dtRealtimstuats.devcname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.571+08:00", comments="Source Table: Dt_RealTimStuats")
    public static final class DtRealtimstuats extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> devcname = column("DevcName", JDBCType.VARCHAR);

        public DtRealtimstuats() {
            super("Dt_RealTimStuats");
        }
    }
}