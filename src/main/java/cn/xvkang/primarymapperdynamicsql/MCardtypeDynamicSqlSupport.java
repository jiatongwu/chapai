package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MCardtypeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.829+08:00", comments="Source Table: M_CardType")
    public static final MCardtype MCardtype = new MCardtype();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.829+08:00", comments="Source field: M_CardType.carid")
    public static final SqlColumn<Integer> carid = MCardtype.carid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.829+08:00", comments="Source field: M_CardType.carCname")
    public static final SqlColumn<String> carcname = MCardtype.carcname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.829+08:00", comments="Source field: M_CardType.carEname")
    public static final SqlColumn<String> carename = MCardtype.carename;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.829+08:00", comments="Source field: M_CardType.carMark")
    public static final SqlColumn<String> carmark = MCardtype.carmark;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.829+08:00", comments="Source Table: M_CardType")
    public static final class MCardtype extends SqlTable {
        public final SqlColumn<Integer> carid = column("carid", JDBCType.INTEGER);

        public final SqlColumn<String> carcname = column("carCname", JDBCType.VARCHAR);

        public final SqlColumn<String> carename = column("carEname", JDBCType.VARCHAR);

        public final SqlColumn<String> carmark = column("carMark", JDBCType.VARCHAR);

        public MCardtype() {
            super("M_CardType");
        }
    }
}