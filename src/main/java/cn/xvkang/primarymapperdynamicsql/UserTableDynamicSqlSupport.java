package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UserTableDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.878+08:00", comments="Source Table: user_table")
    public static final UserTable userTable = new UserTable();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.878+08:00", comments="Source field: user_table.id")
    public static final SqlColumn<Integer> id = userTable.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.878+08:00", comments="Source field: user_table.username")
    public static final SqlColumn<String> username = userTable.username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.878+08:00", comments="Source field: user_table.password")
    public static final SqlColumn<String> password = userTable.password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.878+08:00", comments="Source field: user_table.name")
    public static final SqlColumn<String> name = userTable.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.878+08:00", comments="Source field: user_table.extend")
    public static final SqlColumn<String> extend = userTable.extend;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.878+08:00", comments="Source field: user_table.type")
    public static final SqlColumn<Integer> type = userTable.type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.878+08:00", comments="Source field: user_table.salt")
    public static final SqlColumn<String> salt = userTable.salt;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.878+08:00", comments="Source Table: user_table")
    public static final class UserTable extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> username = column("username", JDBCType.VARCHAR);

        public final SqlColumn<String> password = column("password", JDBCType.VARCHAR);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> extend = column("extend", JDBCType.VARCHAR);

        public final SqlColumn<Integer> type = column("type", JDBCType.INTEGER);

        public final SqlColumn<String> salt = column("salt", JDBCType.VARCHAR);

        public UserTable() {
            super("user_table");
        }
    }
}