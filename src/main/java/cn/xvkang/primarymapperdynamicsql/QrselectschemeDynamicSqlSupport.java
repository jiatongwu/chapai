package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class QrselectschemeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.821+08:00", comments="Source Table: QrSelectScheme")
    public static final Qrselectscheme qrselectscheme = new Qrselectscheme();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.821+08:00", comments="Source field: QrSelectScheme.SchId")
    public static final SqlColumn<Integer> schid = qrselectscheme.schid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.821+08:00", comments="Source field: QrSelectScheme.SchName")
    public static final SqlColumn<String> schname = qrselectscheme.schname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.821+08:00", comments="Source field: QrSelectScheme.FieldName")
    public static final SqlColumn<String> fieldname = qrselectscheme.fieldname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.821+08:00", comments="Source field: QrSelectScheme.Operators")
    public static final SqlColumn<String> operators = qrselectscheme.operators;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.821+08:00", comments="Source field: QrSelectScheme.Selectvalues")
    public static final SqlColumn<String> selectvalues = qrselectscheme.selectvalues;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.821+08:00", comments="Source field: QrSelectScheme.startime")
    public static final SqlColumn<String> startime = qrselectscheme.startime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.821+08:00", comments="Source field: QrSelectScheme.endtime")
    public static final SqlColumn<String> endtime = qrselectscheme.endtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.821+08:00", comments="Source Table: QrSelectScheme")
    public static final class Qrselectscheme extends SqlTable {
        public final SqlColumn<Integer> schid = column("SchId", JDBCType.INTEGER);

        public final SqlColumn<String> schname = column("SchName", JDBCType.VARCHAR);

        public final SqlColumn<String> fieldname = column("FieldName", JDBCType.VARCHAR);

        public final SqlColumn<String> operators = column("Operators", JDBCType.VARCHAR);

        public final SqlColumn<String> selectvalues = column("Selectvalues", JDBCType.VARCHAR);

        public final SqlColumn<String> startime = column("startime", JDBCType.VARCHAR);

        public final SqlColumn<String> endtime = column("endtime", JDBCType.VARCHAR);

        public Qrselectscheme() {
            super("QrSelectScheme");
        }
    }
}