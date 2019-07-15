package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SerYantimesetDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.939+08:00", comments="Source Table: Ser_YanTimeSet")
    public static final SerYantimeset serYantimeset = new SerYantimeset();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.939+08:00", comments="Source field: Ser_YanTimeSet.id")
    public static final SqlColumn<Integer> id = serYantimeset.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.939+08:00", comments="Source field: Ser_YanTimeSet.DevcNum")
    public static final SqlColumn<Integer> devcnum = serYantimeset.devcnum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.939+08:00", comments="Source field: Ser_YanTimeSet.Yanshi")
    public static final SqlColumn<String> yanshi = serYantimeset.yanshi;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.939+08:00", comments="Source Table: Ser_YanTimeSet")
    public static final class SerYantimeset extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> devcnum = column("DevcNum", JDBCType.INTEGER);

        public final SqlColumn<String> yanshi = column("Yanshi", JDBCType.VARCHAR);

        public SerYantimeset() {
            super("Ser_YanTimeSet");
        }
    }
}