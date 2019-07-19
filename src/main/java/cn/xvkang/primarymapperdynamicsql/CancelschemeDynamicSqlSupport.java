package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class CancelschemeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.496+08:00", comments="Source Table: CancelScheme")
    public static final Cancelscheme cancelscheme = new Cancelscheme();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.496+08:00", comments="Source field: CancelScheme.SchId")
    public static final SqlColumn<Integer> schid = cancelscheme.schid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.496+08:00", comments="Source field: CancelScheme.SchName")
    public static final SqlColumn<String> schname = cancelscheme.schname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.497+08:00", comments="Source field: CancelScheme.FieldName")
    public static final SqlColumn<String> fieldname = cancelscheme.fieldname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.497+08:00", comments="Source field: CancelScheme.Operators")
    public static final SqlColumn<String> operators = cancelscheme.operators;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.497+08:00", comments="Source field: CancelScheme.Selectvalues")
    public static final SqlColumn<String> selectvalues = cancelscheme.selectvalues;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.497+08:00", comments="Source field: CancelScheme.startime")
    public static final SqlColumn<String> startime = cancelscheme.startime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.497+08:00", comments="Source field: CancelScheme.endtime")
    public static final SqlColumn<String> endtime = cancelscheme.endtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.496+08:00", comments="Source Table: CancelScheme")
    public static final class Cancelscheme extends SqlTable {
        public final SqlColumn<Integer> schid = column("SchId", JDBCType.INTEGER);

        public final SqlColumn<String> schname = column("SchName", JDBCType.VARCHAR);

        public final SqlColumn<String> fieldname = column("FieldName", JDBCType.VARCHAR);

        public final SqlColumn<String> operators = column("Operators", JDBCType.VARCHAR);

        public final SqlColumn<String> selectvalues = column("Selectvalues", JDBCType.VARCHAR);

        public final SqlColumn<String> startime = column("startime", JDBCType.VARCHAR);

        public final SqlColumn<String> endtime = column("endtime", JDBCType.VARCHAR);

        public Cancelscheme() {
            super("CancelScheme");
        }
    }
}