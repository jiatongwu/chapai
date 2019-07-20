package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MycomputersetDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.244+08:00", comments="Source Table: MYCOMPUTERSET")
    public static final Mycomputerset mycomputerset = new Mycomputerset();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.244+08:00", comments="Source field: MYCOMPUTERSET.PCName")
    public static final SqlColumn<String> pcname = mycomputerset.pcname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.244+08:00", comments="Source field: MYCOMPUTERSET.CtrlNumber")
    public static final SqlColumn<Integer> ctrlnumber = mycomputerset.ctrlnumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.244+08:00", comments="Source Table: MYCOMPUTERSET")
    public static final class Mycomputerset extends SqlTable {
        public final SqlColumn<String> pcname = column("PCName", JDBCType.VARCHAR);

        public final SqlColumn<Integer> ctrlnumber = column("CtrlNumber", JDBCType.INTEGER);

        public Mycomputerset() {
            super("MYCOMPUTERSET");
        }
    }
}