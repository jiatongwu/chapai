package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MyAuthorizationDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.152+08:00", comments="Source Table: My_Authorization")
    public static final MyAuthorization myAuthorization = new MyAuthorization();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.153+08:00", comments="Source field: My_Authorization.bAuthorization")
    public static final SqlColumn<Boolean> bauthorization = myAuthorization.bauthorization;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.153+08:00", comments="Source Table: My_Authorization")
    public static final class MyAuthorization extends SqlTable {
        public final SqlColumn<Boolean> bauthorization = column("bAuthorization", JDBCType.BIT);

        public MyAuthorization() {
            super("My_Authorization");
        }
    }
}