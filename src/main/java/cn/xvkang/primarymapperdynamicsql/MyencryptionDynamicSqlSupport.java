package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MyencryptionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.881+08:00", comments="Source Table: MyEncryption")
    public static final Myencryption myencryption = new Myencryption();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.881+08:00", comments="Source field: MyEncryption.SQLkey")
    public static final SqlColumn<String> sqlkey = myencryption.sqlkey;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.881+08:00", comments="Source Table: MyEncryption")
    public static final class Myencryption extends SqlTable {
        public final SqlColumn<String> sqlkey = column("SQLkey", JDBCType.VARCHAR);

        public Myencryption() {
            super("MyEncryption");
        }
    }
}