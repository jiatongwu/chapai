package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MyzbparkDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.762+08:00", comments="Source Table: MYZBPARK")
    public static final Myzbpark myzbpark = new Myzbpark();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.762+08:00", comments="Source field: MYZBPARK.CtrlNumber")
    public static final SqlColumn<Integer> ctrlnumber = myzbpark.ctrlnumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.762+08:00", comments="Source field: MYZBPARK.Location")
    public static final SqlColumn<String> location = myzbpark.location;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.762+08:00", comments="Source Table: MYZBPARK")
    public static final class Myzbpark extends SqlTable {
        public final SqlColumn<Integer> ctrlnumber = column("CtrlNumber", JDBCType.INTEGER);

        public final SqlColumn<String> location = column("Location", JDBCType.VARCHAR);

        public Myzbpark() {
            super("MYZBPARK");
        }
    }
}