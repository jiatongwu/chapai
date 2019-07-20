package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PostponeschemeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.454+08:00", comments="Source Table: PostPoneScheme")
    public static final Postponescheme postponescheme = new Postponescheme();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.454+08:00", comments="Source field: PostPoneScheme.SchId")
    public static final SqlColumn<Integer> schid = postponescheme.schid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.454+08:00", comments="Source field: PostPoneScheme.SchName")
    public static final SqlColumn<String> schname = postponescheme.schname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.454+08:00", comments="Source field: PostPoneScheme.FieldName")
    public static final SqlColumn<String> fieldname = postponescheme.fieldname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.454+08:00", comments="Source field: PostPoneScheme.Operators")
    public static final SqlColumn<String> operators = postponescheme.operators;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.454+08:00", comments="Source field: PostPoneScheme.Selectvalues")
    public static final SqlColumn<String> selectvalues = postponescheme.selectvalues;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.455+08:00", comments="Source field: PostPoneScheme.startime")
    public static final SqlColumn<String> startime = postponescheme.startime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.455+08:00", comments="Source field: PostPoneScheme.endtime")
    public static final SqlColumn<String> endtime = postponescheme.endtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.454+08:00", comments="Source Table: PostPoneScheme")
    public static final class Postponescheme extends SqlTable {
        public final SqlColumn<Integer> schid = column("SchId", JDBCType.INTEGER);

        public final SqlColumn<String> schname = column("SchName", JDBCType.VARCHAR);

        public final SqlColumn<String> fieldname = column("FieldName", JDBCType.VARCHAR);

        public final SqlColumn<String> operators = column("Operators", JDBCType.VARCHAR);

        public final SqlColumn<String> selectvalues = column("Selectvalues", JDBCType.VARCHAR);

        public final SqlColumn<String> startime = column("startime", JDBCType.VARCHAR);

        public final SqlColumn<String> endtime = column("endtime", JDBCType.VARCHAR);

        public Postponescheme() {
            super("PostPoneScheme");
        }
    }
}