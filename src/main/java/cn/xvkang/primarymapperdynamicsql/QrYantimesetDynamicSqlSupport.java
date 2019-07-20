package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class QrYantimesetDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.466+08:00", comments="Source Table: Qr_YanTimeSet")
    public static final QrYantimeset qrYantimeset = new QrYantimeset();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.467+08:00", comments="Source field: Qr_YanTimeSet.id")
    public static final SqlColumn<Integer> id = qrYantimeset.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.467+08:00", comments="Source field: Qr_YanTimeSet.DevcNum")
    public static final SqlColumn<Integer> devcnum = qrYantimeset.devcnum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.467+08:00", comments="Source field: Qr_YanTimeSet.Yanshi")
    public static final SqlColumn<String> yanshi = qrYantimeset.yanshi;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.467+08:00", comments="Source Table: Qr_YanTimeSet")
    public static final class QrYantimeset extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> devcnum = column("DevcNum", JDBCType.INTEGER);

        public final SqlColumn<String> yanshi = column("Yanshi", JDBCType.VARCHAR);

        public QrYantimeset() {
            super("Qr_YanTimeSet");
        }
    }
}