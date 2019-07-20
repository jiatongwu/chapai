package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class CarchargeschemeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.944+08:00", comments="Source Table: CarChargeScheme")
    public static final Carchargescheme carchargescheme = new Carchargescheme();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.944+08:00", comments="Source field: CarChargeScheme.SchId")
    public static final SqlColumn<Integer> schid = carchargescheme.schid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.945+08:00", comments="Source field: CarChargeScheme.SchName")
    public static final SqlColumn<String> schname = carchargescheme.schname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.945+08:00", comments="Source field: CarChargeScheme.FieldName")
    public static final SqlColumn<String> fieldname = carchargescheme.fieldname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.945+08:00", comments="Source field: CarChargeScheme.Operators")
    public static final SqlColumn<String> operators = carchargescheme.operators;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.945+08:00", comments="Source field: CarChargeScheme.Selectvalues")
    public static final SqlColumn<String> selectvalues = carchargescheme.selectvalues;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.945+08:00", comments="Source field: CarChargeScheme.startime")
    public static final SqlColumn<String> startime = carchargescheme.startime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.945+08:00", comments="Source field: CarChargeScheme.endtime")
    public static final SqlColumn<String> endtime = carchargescheme.endtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.944+08:00", comments="Source Table: CarChargeScheme")
    public static final class Carchargescheme extends SqlTable {
        public final SqlColumn<Integer> schid = column("SchId", JDBCType.INTEGER);

        public final SqlColumn<String> schname = column("SchName", JDBCType.VARCHAR);

        public final SqlColumn<String> fieldname = column("FieldName", JDBCType.VARCHAR);

        public final SqlColumn<String> operators = column("Operators", JDBCType.VARCHAR);

        public final SqlColumn<String> selectvalues = column("Selectvalues", JDBCType.VARCHAR);

        public final SqlColumn<String> startime = column("startime", JDBCType.VARCHAR);

        public final SqlColumn<String> endtime = column("endtime", JDBCType.VARCHAR);

        public Carchargescheme() {
            super("CarChargeScheme");
        }
    }
}