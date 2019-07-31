package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SerfaxingselectschemeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.174+08:00", comments="Source Table: SerFaxingSelectScheme")
    public static final Serfaxingselectscheme serfaxingselectscheme = new Serfaxingselectscheme();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.174+08:00", comments="Source field: SerFaxingSelectScheme.SchId")
    public static final SqlColumn<Integer> schid = serfaxingselectscheme.schid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.174+08:00", comments="Source field: SerFaxingSelectScheme.SchName")
    public static final SqlColumn<String> schname = serfaxingselectscheme.schname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.174+08:00", comments="Source field: SerFaxingSelectScheme.FieldName")
    public static final SqlColumn<String> fieldname = serfaxingselectscheme.fieldname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.174+08:00", comments="Source field: SerFaxingSelectScheme.Operators")
    public static final SqlColumn<String> operators = serfaxingselectscheme.operators;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.174+08:00", comments="Source field: SerFaxingSelectScheme.Selectvalues")
    public static final SqlColumn<String> selectvalues = serfaxingselectscheme.selectvalues;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.174+08:00", comments="Source field: SerFaxingSelectScheme.startime")
    public static final SqlColumn<String> startime = serfaxingselectscheme.startime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.174+08:00", comments="Source field: SerFaxingSelectScheme.endtime")
    public static final SqlColumn<String> endtime = serfaxingselectscheme.endtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.174+08:00", comments="Source Table: SerFaxingSelectScheme")
    public static final class Serfaxingselectscheme extends SqlTable {
        public final SqlColumn<Integer> schid = column("SchId", JDBCType.INTEGER);

        public final SqlColumn<String> schname = column("SchName", JDBCType.VARCHAR);

        public final SqlColumn<String> fieldname = column("FieldName", JDBCType.VARCHAR);

        public final SqlColumn<String> operators = column("Operators", JDBCType.VARCHAR);

        public final SqlColumn<String> selectvalues = column("Selectvalues", JDBCType.VARCHAR);

        public final SqlColumn<String> startime = column("startime", JDBCType.VARCHAR);

        public final SqlColumn<String> endtime = column("endtime", JDBCType.VARCHAR);

        public Serfaxingselectscheme() {
            super("SerFaxingSelectScheme");
        }
    }
}