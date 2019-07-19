package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MyZfbkeysetDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.815+08:00", comments="Source Table: My_ZFBKeySet")
    public static final MyZfbkeyset myZfbkeyset = new MyZfbkeyset();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.815+08:00", comments="Source field: My_ZFBKeySet.ID")
    public static final SqlColumn<Integer> id = myZfbkeyset.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.815+08:00", comments="Source field: My_ZFBKeySet.alipay_rsa_public_key")
    public static final SqlColumn<String> alipayRsaPublicKey = myZfbkeyset.alipayRsaPublicKey;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.815+08:00", comments="Source field: My_ZFBKeySet.rsa_private_key")
    public static final SqlColumn<String> rsaPrivateKey = myZfbkeyset.rsaPrivateKey;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.815+08:00", comments="Source field: My_ZFBKeySet.Rs1")
    public static final SqlColumn<String> rs1 = myZfbkeyset.rs1;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.815+08:00", comments="Source field: My_ZFBKeySet.Rs2")
    public static final SqlColumn<String> rs2 = myZfbkeyset.rs2;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.815+08:00", comments="Source field: My_ZFBKeySet.Rs3")
    public static final SqlColumn<String> rs3 = myZfbkeyset.rs3;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.815+08:00", comments="Source Table: My_ZFBKeySet")
    public static final class MyZfbkeyset extends SqlTable {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<String> alipayRsaPublicKey = column("alipay_rsa_public_key", JDBCType.VARCHAR);

        public final SqlColumn<String> rsaPrivateKey = column("rsa_private_key", JDBCType.VARCHAR);

        public final SqlColumn<String> rs1 = column("Rs1", JDBCType.VARCHAR);

        public final SqlColumn<String> rs2 = column("Rs2", JDBCType.VARCHAR);

        public final SqlColumn<String> rs3 = column("Rs3", JDBCType.VARCHAR);

        public MyZfbkeyset() {
            super("My_ZFBKeySet");
        }
    }
}