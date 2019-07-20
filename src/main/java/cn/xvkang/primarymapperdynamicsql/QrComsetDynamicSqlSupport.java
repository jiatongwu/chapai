package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class QrComsetDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.460+08:00", comments="Source Table: Qr_ComSet")
    public static final QrComset qrComset = new QrComset();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.460+08:00", comments="Source field: Qr_ComSet.com")
    public static final SqlColumn<Integer> com = qrComset.com;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.460+08:00", comments="Source Table: Qr_ComSet")
    public static final class QrComset extends SqlTable {
        public final SqlColumn<Integer> com = column("com", JDBCType.INTEGER);

        public QrComset() {
            super("Qr_ComSet");
        }
    }
}