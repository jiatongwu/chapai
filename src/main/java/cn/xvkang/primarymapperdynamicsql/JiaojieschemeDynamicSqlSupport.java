package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class JiaojieschemeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.682+08:00", comments="Source Table: JiaoJieScheme")
    public static final Jiaojiescheme jiaojiescheme = new Jiaojiescheme();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.682+08:00", comments="Source field: JiaoJieScheme.SchId")
    public static final SqlColumn<Integer> schid = jiaojiescheme.schid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.682+08:00", comments="Source field: JiaoJieScheme.SchName")
    public static final SqlColumn<String> schname = jiaojiescheme.schname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.682+08:00", comments="Source field: JiaoJieScheme.FieldName")
    public static final SqlColumn<String> fieldname = jiaojiescheme.fieldname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.682+08:00", comments="Source field: JiaoJieScheme.Operators")
    public static final SqlColumn<String> operators = jiaojiescheme.operators;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.683+08:00", comments="Source field: JiaoJieScheme.Selectvalues")
    public static final SqlColumn<String> selectvalues = jiaojiescheme.selectvalues;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.683+08:00", comments="Source field: JiaoJieScheme.startime")
    public static final SqlColumn<String> startime = jiaojiescheme.startime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.683+08:00", comments="Source field: JiaoJieScheme.endtime")
    public static final SqlColumn<String> endtime = jiaojiescheme.endtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.682+08:00", comments="Source Table: JiaoJieScheme")
    public static final class Jiaojiescheme extends SqlTable {
        public final SqlColumn<Integer> schid = column("SchId", JDBCType.INTEGER);

        public final SqlColumn<String> schname = column("SchName", JDBCType.VARCHAR);

        public final SqlColumn<String> fieldname = column("FieldName", JDBCType.VARCHAR);

        public final SqlColumn<String> operators = column("Operators", JDBCType.VARCHAR);

        public final SqlColumn<String> selectvalues = column("Selectvalues", JDBCType.VARCHAR);

        public final SqlColumn<String> startime = column("startime", JDBCType.VARCHAR);

        public final SqlColumn<String> endtime = column("endtime", JDBCType.VARCHAR);

        public Jiaojiescheme() {
            super("JiaoJieScheme");
        }
    }
}