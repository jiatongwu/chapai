package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.RolePermissionDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.RolePermission;
import java.util.List;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.delete.DeleteDSL;
import org.mybatis.dynamic.sql.delete.MyBatis3DeleteModelAdapter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.MyBatis3SelectModelAdapter;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectDSL;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.MyBatis3UpdateModelAdapter;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;

@Mapper
public interface RolePermissionDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.882+08:00", comments="Source Table: role_permission")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.882+08:00", comments="Source Table: role_permission")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.882+08:00", comments="Source Table: role_permission")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<RolePermission> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.882+08:00", comments="Source Table: role_permission")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("RolePermissionResult")
    RolePermission selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.882+08:00", comments="Source Table: role_permission")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="RolePermissionResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="permission_id", property="permissionId", jdbcType=JdbcType.INTEGER),
        @Result(column="role_id", property="roleId", jdbcType=JdbcType.INTEGER),
        @Result(column="menu_attribute", property="menuAttribute", jdbcType=JdbcType.INTEGER)
    })
    List<RolePermission> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.882+08:00", comments="Source Table: role_permission")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.882+08:00", comments="Source Table: role_permission")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(rolePermission);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.882+08:00", comments="Source Table: role_permission")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, rolePermission);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.882+08:00", comments="Source Table: role_permission")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, rolePermission)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.882+08:00", comments="Source Table: role_permission")
    default int insert(RolePermission record) {
        return insert(SqlBuilder.insert(record)
                .into(rolePermission)
                .map(permissionId).toProperty("permissionId")
                .map(roleId).toProperty("roleId")
                .map(menuAttribute).toProperty("menuAttribute")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.882+08:00", comments="Source Table: role_permission")
    default int insertSelective(RolePermission record) {
        return insert(SqlBuilder.insert(record)
                .into(rolePermission)
                .map(permissionId).toPropertyWhenPresent("permissionId", record::getPermissionId)
                .map(roleId).toPropertyWhenPresent("roleId", record::getRoleId)
                .map(menuAttribute).toPropertyWhenPresent("menuAttribute", record::getMenuAttribute)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.882+08:00", comments="Source Table: role_permission")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<RolePermission>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, permissionId, roleId, menuAttribute)
                .from(rolePermission);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.882+08:00", comments="Source Table: role_permission")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<RolePermission>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, permissionId, roleId, menuAttribute)
                .from(rolePermission);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.882+08:00", comments="Source Table: role_permission")
    default RolePermission selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, permissionId, roleId, menuAttribute)
                .from(rolePermission)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.882+08:00", comments="Source Table: role_permission")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(RolePermission record) {
        return UpdateDSL.updateWithMapper(this::update, rolePermission)
                .set(permissionId).equalTo(record::getPermissionId)
                .set(roleId).equalTo(record::getRoleId)
                .set(menuAttribute).equalTo(record::getMenuAttribute);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.882+08:00", comments="Source Table: role_permission")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(RolePermission record) {
        return UpdateDSL.updateWithMapper(this::update, rolePermission)
                .set(permissionId).equalToWhenPresent(record::getPermissionId)
                .set(roleId).equalToWhenPresent(record::getRoleId)
                .set(menuAttribute).equalToWhenPresent(record::getMenuAttribute);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.882+08:00", comments="Source Table: role_permission")
    default int updateByPrimaryKey(RolePermission record) {
        return UpdateDSL.updateWithMapper(this::update, rolePermission)
                .set(permissionId).equalTo(record::getPermissionId)
                .set(roleId).equalTo(record::getRoleId)
                .set(menuAttribute).equalTo(record::getMenuAttribute)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.882+08:00", comments="Source Table: role_permission")
    default int updateByPrimaryKeySelective(RolePermission record) {
        return UpdateDSL.updateWithMapper(this::update, rolePermission)
                .set(permissionId).equalToWhenPresent(record::getPermissionId)
                .set(roleId).equalToWhenPresent(record::getRoleId)
                .set(menuAttribute).equalToWhenPresent(record::getMenuAttribute)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}