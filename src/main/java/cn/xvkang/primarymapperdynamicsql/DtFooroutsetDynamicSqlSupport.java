package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DtFooroutsetDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.551+08:00", comments="Source Table: Dt_FoorOutSet")
    public static final DtFooroutset dtFooroutset = new DtFooroutset();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.551+08:00", comments="Source field: Dt_FoorOutSet.id")
    public static final SqlColumn<Integer> id = dtFooroutset.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.551+08:00", comments="Source field: Dt_FoorOutSet.DevcNo")
    public static final SqlColumn<Integer> devcno = dtFooroutset.devcno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.552+08:00", comments="Source field: Dt_FoorOutSet.Holid")
    public static final SqlColumn<Boolean> holid = dtFooroutset.holid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.552+08:00", comments="Source field: Dt_FoorOutSet.Foorkzout")
    public static final SqlColumn<Boolean> foorkzout = dtFooroutset.foorkzout;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.552+08:00", comments="Source field: Dt_FoorOutSet.Foorhf")
    public static final SqlColumn<Boolean> foorhf = dtFooroutset.foorhf;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.552+08:00", comments="Source field: Dt_FoorOutSet.BaoJin")
    public static final SqlColumn<Boolean> baojin = dtFooroutset.baojin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.552+08:00", comments="Source field: Dt_FoorOutSet.RecCunchu")
    public static final SqlColumn<Boolean> reccunchu = dtFooroutset.reccunchu;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.552+08:00", comments="Source field: Dt_FoorOutSet.FoorInfo")
    public static final SqlColumn<String> foorinfo = dtFooroutset.foorinfo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.551+08:00", comments="Source Table: Dt_FoorOutSet")
    public static final class DtFooroutset extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> devcno = column("DevcNo", JDBCType.INTEGER);

        public final SqlColumn<Boolean> holid = column("Holid", JDBCType.BIT);

        public final SqlColumn<Boolean> foorkzout = column("Foorkzout", JDBCType.BIT);

        public final SqlColumn<Boolean> foorhf = column("Foorhf", JDBCType.BIT);

        public final SqlColumn<Boolean> baojin = column("BaoJin", JDBCType.BIT);

        public final SqlColumn<Boolean> reccunchu = column("RecCunchu", JDBCType.BIT);

        public final SqlColumn<String> foorinfo = column("FoorInfo", JDBCType.VARCHAR);

        public DtFooroutset() {
            super("Dt_FoorOutSet");
        }
    }
}