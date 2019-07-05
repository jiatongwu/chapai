package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class RoleDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.867+08:00", comments="Source Table: role")
    public static final Role role = new Role();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.867+08:00", comments="Source field: role.id")
    public static final SqlColumn<Integer> id = role.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.867+08:00", comments="Source field: role.name")
    public static final SqlColumn<String> name = role.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.868+08:00", comments="Source field: role.code")
    public static final SqlColumn<String> code = role.code;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.868+08:00", comments="Source field: role.describe")
    public static final SqlColumn<String> describe = role.describe;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.868+08:00", comments="Source field: role.time")
    public static final SqlColumn<String> time = role.time;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.868+08:00", comments="Source field: role.state")
    public static final SqlColumn<Integer> state = role.state;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.867+08:00", comments="Source Table: role")
    public static final class Role extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> code = column("code", JDBCType.VARCHAR);

        public final SqlColumn<String> describe = column("describe", JDBCType.VARCHAR);

        public final SqlColumn<String> time = column("time", JDBCType.VARCHAR);

        public final SqlColumn<Integer> state = column("state", JDBCType.INTEGER);

        public Role() {
            super("role");
        }
    }
}