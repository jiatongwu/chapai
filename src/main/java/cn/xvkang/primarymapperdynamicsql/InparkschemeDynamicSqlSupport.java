package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class InparkschemeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.437+08:00", comments="Source Table: InParkScheme")
    public static final Inparkscheme inparkscheme = new Inparkscheme();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.437+08:00", comments="Source field: InParkScheme.SchId")
    public static final SqlColumn<Integer> schid = inparkscheme.schid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.437+08:00", comments="Source field: InParkScheme.SchName")
    public static final SqlColumn<String> schname = inparkscheme.schname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.437+08:00", comments="Source field: InParkScheme.FieldName")
    public static final SqlColumn<String> fieldname = inparkscheme.fieldname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.437+08:00", comments="Source field: InParkScheme.Operators")
    public static final SqlColumn<String> operators = inparkscheme.operators;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.437+08:00", comments="Source field: InParkScheme.Selectvalues")
    public static final SqlColumn<String> selectvalues = inparkscheme.selectvalues;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.437+08:00", comments="Source field: InParkScheme.startime")
    public static final SqlColumn<String> startime = inparkscheme.startime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.438+08:00", comments="Source field: InParkScheme.endtime")
    public static final SqlColumn<String> endtime = inparkscheme.endtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.437+08:00", comments="Source Table: InParkScheme")
    public static final class Inparkscheme extends SqlTable {
        public final SqlColumn<Integer> schid = column("SchId", JDBCType.INTEGER);

        public final SqlColumn<String> schname = column("SchName", JDBCType.VARCHAR);

        public final SqlColumn<String> fieldname = column("FieldName", JDBCType.VARCHAR);

        public final SqlColumn<String> operators = column("Operators", JDBCType.VARCHAR);

        public final SqlColumn<String> selectvalues = column("Selectvalues", JDBCType.VARCHAR);

        public final SqlColumn<String> startime = column("startime", JDBCType.VARCHAR);

        public final SqlColumn<String> endtime = column("endtime", JDBCType.VARCHAR);

        public Inparkscheme() {
            super("InParkScheme");
        }
    }
}