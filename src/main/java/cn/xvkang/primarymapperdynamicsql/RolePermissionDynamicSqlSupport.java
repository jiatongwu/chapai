package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class RolePermissionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.525+08:00", comments="Source Table: role_permission")
    public static final RolePermission rolePermission = new RolePermission();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.525+08:00", comments="Source field: role_permission.id")
    public static final SqlColumn<Integer> id = rolePermission.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.525+08:00", comments="Source field: role_permission.permission_id")
    public static final SqlColumn<Integer> permissionId = rolePermission.permissionId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.525+08:00", comments="Source field: role_permission.role_id")
    public static final SqlColumn<Integer> roleId = rolePermission.roleId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.525+08:00", comments="Source field: role_permission.menu_attribute")
    public static final SqlColumn<Integer> menuAttribute = rolePermission.menuAttribute;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.525+08:00", comments="Source Table: role_permission")
    public static final class RolePermission extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> permissionId = column("permission_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> roleId = column("role_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> menuAttribute = column("menu_attribute", JDBCType.INTEGER);

        public RolePermission() {
            super("role_permission");
        }
    }
}