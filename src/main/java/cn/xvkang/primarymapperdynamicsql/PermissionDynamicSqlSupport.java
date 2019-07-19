package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PermissionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.879+08:00", comments="Source Table: permission")
    public static final Permission permission = new Permission();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.879+08:00", comments="Source field: permission.id")
    public static final SqlColumn<Integer> id = permission.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.879+08:00", comments="Source field: permission.parent_id")
    public static final SqlColumn<Integer> parentId = permission.parentId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.879+08:00", comments="Source field: permission.name")
    public static final SqlColumn<String> name = permission.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.879+08:00", comments="Source field: permission.describe")
    public static final SqlColumn<String> describe = permission.describe;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.879+08:00", comments="Source field: permission.url")
    public static final SqlColumn<String> url = permission.url;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.879+08:00", comments="Source field: permission.icon")
    public static final SqlColumn<String> icon = permission.icon;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.879+08:00", comments="Source field: permission.num")
    public static final SqlColumn<Integer> num = permission.num;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.879+08:00", comments="Source field: permission.code")
    public static final SqlColumn<String> code = permission.code;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.879+08:00", comments="Source field: permission.spread")
    public static final SqlColumn<String> spread = permission.spread;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.879+08:00", comments="Source field: permission.attribute")
    public static final SqlColumn<Integer> attribute = permission.attribute;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.879+08:00", comments="Source field: permission.type")
    public static final SqlColumn<Integer> type = permission.type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.879+08:00", comments="Source field: permission.level")
    public static final SqlColumn<Integer> level = permission.level;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.879+08:00", comments="Source field: permission.time")
    public static final SqlColumn<String> time = permission.time;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.879+08:00", comments="Source field: permission.checked")
    public static final SqlColumn<Integer> checked = permission.checked;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.879+08:00", comments="Source Table: permission")
    public static final class Permission extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> parentId = column("parent_id", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> describe = column("describe", JDBCType.VARCHAR);

        public final SqlColumn<String> url = column("url", JDBCType.VARCHAR);

        public final SqlColumn<String> icon = column("icon", JDBCType.VARCHAR);

        public final SqlColumn<Integer> num = column("num", JDBCType.INTEGER);

        public final SqlColumn<String> code = column("code", JDBCType.VARCHAR);

        public final SqlColumn<String> spread = column("spread", JDBCType.VARCHAR);

        public final SqlColumn<Integer> attribute = column("attribute", JDBCType.INTEGER);

        public final SqlColumn<Integer> type = column("type", JDBCType.INTEGER);

        public final SqlColumn<Integer> level = column("level", JDBCType.INTEGER);

        public final SqlColumn<String> time = column("time", JDBCType.VARCHAR);

        public final SqlColumn<Integer> checked = column("checked", JDBCType.INTEGER);

        public Permission() {
            super("permission");
        }
    }
}