package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DtfxreportselectschemeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.860+08:00", comments="Source Table: DtFxReportSelectScheme")
    public static final Dtfxreportselectscheme dtfxreportselectscheme = new Dtfxreportselectscheme();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.860+08:00", comments="Source field: DtFxReportSelectScheme.SchId")
    public static final SqlColumn<Integer> schid = dtfxreportselectscheme.schid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.860+08:00", comments="Source field: DtFxReportSelectScheme.SchName")
    public static final SqlColumn<String> schname = dtfxreportselectscheme.schname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.860+08:00", comments="Source field: DtFxReportSelectScheme.FieldName")
    public static final SqlColumn<String> fieldname = dtfxreportselectscheme.fieldname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.861+08:00", comments="Source field: DtFxReportSelectScheme.Operators")
    public static final SqlColumn<String> operators = dtfxreportselectscheme.operators;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.861+08:00", comments="Source field: DtFxReportSelectScheme.Selectvalues")
    public static final SqlColumn<String> selectvalues = dtfxreportselectscheme.selectvalues;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.861+08:00", comments="Source field: DtFxReportSelectScheme.startime")
    public static final SqlColumn<String> startime = dtfxreportselectscheme.startime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.861+08:00", comments="Source field: DtFxReportSelectScheme.endtime")
    public static final SqlColumn<String> endtime = dtfxreportselectscheme.endtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.860+08:00", comments="Source Table: DtFxReportSelectScheme")
    public static final class Dtfxreportselectscheme extends SqlTable {
        public final SqlColumn<Integer> schid = column("SchId", JDBCType.INTEGER);

        public final SqlColumn<String> schname = column("SchName", JDBCType.VARCHAR);

        public final SqlColumn<String> fieldname = column("FieldName", JDBCType.VARCHAR);

        public final SqlColumn<String> operators = column("Operators", JDBCType.VARCHAR);

        public final SqlColumn<String> selectvalues = column("Selectvalues", JDBCType.VARCHAR);

        public final SqlColumn<String> startime = column("startime", JDBCType.VARCHAR);

        public final SqlColumn<String> endtime = column("endtime", JDBCType.VARCHAR);

        public Dtfxreportselectscheme() {
            super("DtFxReportSelectScheme");
        }
    }
}