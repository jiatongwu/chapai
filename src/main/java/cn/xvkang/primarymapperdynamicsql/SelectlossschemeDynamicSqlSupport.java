package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SelectlossschemeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.905+08:00", comments="Source Table: SelectLossScheme")
    public static final Selectlossscheme selectlossscheme = new Selectlossscheme();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.905+08:00", comments="Source field: SelectLossScheme.SchId")
    public static final SqlColumn<Integer> schid = selectlossscheme.schid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.905+08:00", comments="Source field: SelectLossScheme.SchName")
    public static final SqlColumn<String> schname = selectlossscheme.schname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.905+08:00", comments="Source field: SelectLossScheme.FieldName")
    public static final SqlColumn<String> fieldname = selectlossscheme.fieldname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.905+08:00", comments="Source field: SelectLossScheme.Operators")
    public static final SqlColumn<String> operators = selectlossscheme.operators;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.905+08:00", comments="Source field: SelectLossScheme.Selectvalues")
    public static final SqlColumn<String> selectvalues = selectlossscheme.selectvalues;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.905+08:00", comments="Source field: SelectLossScheme.startime")
    public static final SqlColumn<String> startime = selectlossscheme.startime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.905+08:00", comments="Source field: SelectLossScheme.endtime")
    public static final SqlColumn<String> endtime = selectlossscheme.endtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.905+08:00", comments="Source Table: SelectLossScheme")
    public static final class Selectlossscheme extends SqlTable {
        public final SqlColumn<Integer> schid = column("SchId", JDBCType.INTEGER);

        public final SqlColumn<String> schname = column("SchName", JDBCType.VARCHAR);

        public final SqlColumn<String> fieldname = column("FieldName", JDBCType.VARCHAR);

        public final SqlColumn<String> operators = column("Operators", JDBCType.VARCHAR);

        public final SqlColumn<String> selectvalues = column("Selectvalues", JDBCType.VARCHAR);

        public final SqlColumn<String> startime = column("startime", JDBCType.VARCHAR);

        public final SqlColumn<String> endtime = column("endtime", JDBCType.VARCHAR);

        public Selectlossscheme() {
            super("SelectLossScheme");
        }
    }
}