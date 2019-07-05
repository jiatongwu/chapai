package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DtselectschemeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.345+08:00", comments="Source Table: DtSelectScheme")
    public static final Dtselectscheme dtselectscheme = new Dtselectscheme();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.346+08:00", comments="Source field: DtSelectScheme.SchId")
    public static final SqlColumn<Integer> schid = dtselectscheme.schid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.346+08:00", comments="Source field: DtSelectScheme.SchName")
    public static final SqlColumn<String> schname = dtselectscheme.schname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.346+08:00", comments="Source field: DtSelectScheme.FieldName")
    public static final SqlColumn<String> fieldname = dtselectscheme.fieldname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.346+08:00", comments="Source field: DtSelectScheme.Operators")
    public static final SqlColumn<String> operators = dtselectscheme.operators;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.346+08:00", comments="Source field: DtSelectScheme.Selectvalues")
    public static final SqlColumn<String> selectvalues = dtselectscheme.selectvalues;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.347+08:00", comments="Source field: DtSelectScheme.startime")
    public static final SqlColumn<String> startime = dtselectscheme.startime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.347+08:00", comments="Source field: DtSelectScheme.endtime")
    public static final SqlColumn<String> endtime = dtselectscheme.endtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.345+08:00", comments="Source Table: DtSelectScheme")
    public static final class Dtselectscheme extends SqlTable {
        public final SqlColumn<Integer> schid = column("SchId", JDBCType.INTEGER);

        public final SqlColumn<String> schname = column("SchName", JDBCType.VARCHAR);

        public final SqlColumn<String> fieldname = column("FieldName", JDBCType.VARCHAR);

        public final SqlColumn<String> operators = column("Operators", JDBCType.VARCHAR);

        public final SqlColumn<String> selectvalues = column("Selectvalues", JDBCType.VARCHAR);

        public final SqlColumn<String> startime = column("startime", JDBCType.VARCHAR);

        public final SqlColumn<String> endtime = column("endtime", JDBCType.VARCHAR);

        public Dtselectscheme() {
            super("DtSelectScheme");
        }
    }
}