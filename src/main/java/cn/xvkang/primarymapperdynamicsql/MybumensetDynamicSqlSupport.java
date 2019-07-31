package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MybumensetDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.969+08:00", comments="Source Table: MYBUMENSET")
    public static final Mybumenset mybumenset = new Mybumenset();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.969+08:00", comments="Source field: MYBUMENSET.ID")
    public static final SqlColumn<Integer> id = mybumenset.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.970+08:00", comments="Source field: MYBUMENSET.DeptNO")
    public static final SqlColumn<String> deptno = mybumenset.deptno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.970+08:00", comments="Source field: MYBUMENSET.DeptName")
    public static final SqlColumn<String> deptname = mybumenset.deptname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.970+08:00", comments="Source field: MYBUMENSET.DeptSymbol")
    public static final SqlColumn<String> deptsymbol = mybumenset.deptsymbol;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.970+08:00", comments="Source field: MYBUMENSET.PID")
    public static final SqlColumn<Integer> pid = mybumenset.pid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.969+08:00", comments="Source Table: MYBUMENSET")
    public static final class Mybumenset extends SqlTable {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<String> deptno = column("DeptNO", JDBCType.VARCHAR);

        public final SqlColumn<String> deptname = column("DeptName", JDBCType.VARCHAR);

        public final SqlColumn<String> deptsymbol = column("DeptSymbol", JDBCType.VARCHAR);

        public final SqlColumn<Integer> pid = column("PID", JDBCType.INTEGER);

        public Mybumenset() {
            super("MYBUMENSET");
        }
    }
}