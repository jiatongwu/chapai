package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DtFoortbDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.599+08:00", comments="Source Table: Dt_foorTb")
    public static final DtFoortb dtFoortb = new DtFoortb();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.600+08:00", comments="Source field: Dt_foorTb.id")
    public static final SqlColumn<Integer> id = dtFoortb.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.600+08:00", comments="Source field: Dt_foorTb.foorid")
    public static final SqlColumn<Integer> foorid = dtFoortb.foorid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.600+08:00", comments="Source field: Dt_foorTb.FoorName")
    public static final SqlColumn<String> foorname = dtFoortb.foorname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.600+08:00", comments="Source field: Dt_foorTb.devcNo")
    public static final SqlColumn<Integer> devcno = dtFoortb.devcno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.600+08:00", comments="Source field: Dt_foorTb.FoorNo")
    public static final SqlColumn<Integer> foorno = dtFoortb.foorno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.600+08:00", comments="Source Table: Dt_foorTb")
    public static final class DtFoortb extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> foorid = column("foorid", JDBCType.INTEGER);

        public final SqlColumn<String> foorname = column("FoorName", JDBCType.VARCHAR);

        public final SqlColumn<Integer> devcno = column("devcNo", JDBCType.INTEGER);

        public final SqlColumn<Integer> foorno = column("FoorNo", JDBCType.INTEGER);

        public DtFoortb() {
            super("Dt_foorTb");
        }
    }
}