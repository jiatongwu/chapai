package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SerdoorselectschemeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.906+08:00", comments="Source Table: SerDoorSelectScheme")
    public static final Serdoorselectscheme serdoorselectscheme = new Serdoorselectscheme();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.906+08:00", comments="Source field: SerDoorSelectScheme.SchId")
    public static final SqlColumn<Integer> schid = serdoorselectscheme.schid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.906+08:00", comments="Source field: SerDoorSelectScheme.SchName")
    public static final SqlColumn<String> schname = serdoorselectscheme.schname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.906+08:00", comments="Source field: SerDoorSelectScheme.FieldName")
    public static final SqlColumn<String> fieldname = serdoorselectscheme.fieldname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.906+08:00", comments="Source field: SerDoorSelectScheme.Operators")
    public static final SqlColumn<String> operators = serdoorselectscheme.operators;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.906+08:00", comments="Source field: SerDoorSelectScheme.Selectvalues")
    public static final SqlColumn<String> selectvalues = serdoorselectscheme.selectvalues;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.906+08:00", comments="Source field: SerDoorSelectScheme.startime")
    public static final SqlColumn<String> startime = serdoorselectscheme.startime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.906+08:00", comments="Source field: SerDoorSelectScheme.endtime")
    public static final SqlColumn<String> endtime = serdoorselectscheme.endtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.906+08:00", comments="Source Table: SerDoorSelectScheme")
    public static final class Serdoorselectscheme extends SqlTable {
        public final SqlColumn<Integer> schid = column("SchId", JDBCType.INTEGER);

        public final SqlColumn<String> schname = column("SchName", JDBCType.VARCHAR);

        public final SqlColumn<String> fieldname = column("FieldName", JDBCType.VARCHAR);

        public final SqlColumn<String> operators = column("Operators", JDBCType.VARCHAR);

        public final SqlColumn<String> selectvalues = column("Selectvalues", JDBCType.VARCHAR);

        public final SqlColumn<String> startime = column("startime", JDBCType.VARCHAR);

        public final SqlColumn<String> endtime = column("endtime", JDBCType.VARCHAR);

        public Serdoorselectscheme() {
            super("SerDoorSelectScheme");
        }
    }
}