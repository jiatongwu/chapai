package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class IssueschemeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.951+08:00", comments="Source Table: IssueScheme")
    public static final Issuescheme issuescheme = new Issuescheme();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.951+08:00", comments="Source field: IssueScheme.SchId")
    public static final SqlColumn<Integer> schid = issuescheme.schid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.951+08:00", comments="Source field: IssueScheme.SchName")
    public static final SqlColumn<String> schname = issuescheme.schname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.951+08:00", comments="Source field: IssueScheme.FieldName")
    public static final SqlColumn<String> fieldname = issuescheme.fieldname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.951+08:00", comments="Source field: IssueScheme.Operators")
    public static final SqlColumn<String> operators = issuescheme.operators;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.951+08:00", comments="Source field: IssueScheme.Selectvalues")
    public static final SqlColumn<String> selectvalues = issuescheme.selectvalues;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.951+08:00", comments="Source field: IssueScheme.startime")
    public static final SqlColumn<String> startime = issuescheme.startime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.951+08:00", comments="Source field: IssueScheme.endtime")
    public static final SqlColumn<String> endtime = issuescheme.endtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.951+08:00", comments="Source Table: IssueScheme")
    public static final class Issuescheme extends SqlTable {
        public final SqlColumn<Integer> schid = column("SchId", JDBCType.INTEGER);

        public final SqlColumn<String> schname = column("SchName", JDBCType.VARCHAR);

        public final SqlColumn<String> fieldname = column("FieldName", JDBCType.VARCHAR);

        public final SqlColumn<String> operators = column("Operators", JDBCType.VARCHAR);

        public final SqlColumn<String> selectvalues = column("Selectvalues", JDBCType.VARCHAR);

        public final SqlColumn<String> startime = column("startime", JDBCType.VARCHAR);

        public final SqlColumn<String> endtime = column("endtime", JDBCType.VARCHAR);

        public Issuescheme() {
            super("IssueScheme");
        }
    }
}