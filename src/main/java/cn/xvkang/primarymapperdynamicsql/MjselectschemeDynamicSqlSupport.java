package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MjselectschemeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.134+08:00", comments="Source Table: MJSelectScheme")
    public static final Mjselectscheme mjselectscheme = new Mjselectscheme();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.135+08:00", comments="Source field: MJSelectScheme.SchId")
    public static final SqlColumn<Integer> schid = mjselectscheme.schid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.135+08:00", comments="Source field: MJSelectScheme.SchName")
    public static final SqlColumn<String> schname = mjselectscheme.schname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.135+08:00", comments="Source field: MJSelectScheme.FieldName")
    public static final SqlColumn<String> fieldname = mjselectscheme.fieldname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.135+08:00", comments="Source field: MJSelectScheme.Operators")
    public static final SqlColumn<String> operators = mjselectscheme.operators;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.135+08:00", comments="Source field: MJSelectScheme.Selectvalues")
    public static final SqlColumn<String> selectvalues = mjselectscheme.selectvalues;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.135+08:00", comments="Source field: MJSelectScheme.startime")
    public static final SqlColumn<String> startime = mjselectscheme.startime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.135+08:00", comments="Source field: MJSelectScheme.endtime")
    public static final SqlColumn<String> endtime = mjselectscheme.endtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.135+08:00", comments="Source Table: MJSelectScheme")
    public static final class Mjselectscheme extends SqlTable {
        public final SqlColumn<Integer> schid = column("SchId", JDBCType.INTEGER);

        public final SqlColumn<String> schname = column("SchName", JDBCType.VARCHAR);

        public final SqlColumn<String> fieldname = column("FieldName", JDBCType.VARCHAR);

        public final SqlColumn<String> operators = column("Operators", JDBCType.VARCHAR);

        public final SqlColumn<String> selectvalues = column("Selectvalues", JDBCType.VARCHAR);

        public final SqlColumn<String> startime = column("startime", JDBCType.VARCHAR);

        public final SqlColumn<String> endtime = column("endtime", JDBCType.VARCHAR);

        public Mjselectscheme() {
            super("MJSelectScheme");
        }
    }
}