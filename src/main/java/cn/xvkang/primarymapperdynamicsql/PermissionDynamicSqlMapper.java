package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.PermissionDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.Permission;
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
public interface PermissionDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.954+08:00", comments="Source Table: permission")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.954+08:00", comments="Source Table: permission")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.954+08:00", comments="Source Table: permission")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<Permission> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.954+08:00", comments="Source Table: permission")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("PermissionResult")
    Permission selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.954+08:00", comments="Source Table: permission")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="PermissionResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="parent_id", property="parentId", jdbcType=JdbcType.INTEGER),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="describe", property="describe", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="icon", property="icon", jdbcType=JdbcType.VARCHAR),
        @Result(column="num", property="num", jdbcType=JdbcType.INTEGER),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="spread", property="spread", jdbcType=JdbcType.VARCHAR),
        @Result(column="attribute", property="attribute", jdbcType=JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="level", property="level", jdbcType=JdbcType.INTEGER),
        @Result(column="time", property="time", jdbcType=JdbcType.VARCHAR),
        @Result(column="checked", property="checked", jdbcType=JdbcType.INTEGER)
    })
    List<Permission> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.954+08:00", comments="Source Table: permission")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.954+08:00", comments="Source Table: permission")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(permission);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.954+08:00", comments="Source Table: permission")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, permission);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.954+08:00", comments="Source Table: permission")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, permission)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.954+08:00", comments="Source Table: permission")
    default int insert(Permission record) {
        return insert(SqlBuilder.insert(record)
                .into(permission)
                .map(parentId).toProperty("parentId")
                .map(name).toProperty("name")
                .map(describe).toProperty("describe")
                .map(url).toProperty("url")
                .map(icon).toProperty("icon")
                .map(num).toProperty("num")
                .map(code).toProperty("code")
                .map(spread).toProperty("spread")
                .map(attribute).toProperty("attribute")
                .map(type).toProperty("type")
                .map(level).toProperty("level")
                .map(time).toProperty("time")
                .map(checked).toProperty("checked")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.954+08:00", comments="Source Table: permission")
    default int insertSelective(Permission record) {
        return insert(SqlBuilder.insert(record)
                .into(permission)
                .map(parentId).toPropertyWhenPresent("parentId", record::getParentId)
                .map(name).toPropertyWhenPresent("name", record::getName)
                .map(describe).toPropertyWhenPresent("describe", record::getDescribe)
                .map(url).toPropertyWhenPresent("url", record::getUrl)
                .map(icon).toPropertyWhenPresent("icon", record::getIcon)
                .map(num).toPropertyWhenPresent("num", record::getNum)
                .map(code).toPropertyWhenPresent("code", record::getCode)
                .map(spread).toPropertyWhenPresent("spread", record::getSpread)
                .map(attribute).toPropertyWhenPresent("attribute", record::getAttribute)
                .map(type).toPropertyWhenPresent("type", record::getType)
                .map(level).toPropertyWhenPresent("level", record::getLevel)
                .map(time).toPropertyWhenPresent("time", record::getTime)
                .map(checked).toPropertyWhenPresent("checked", record::getChecked)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.955+08:00", comments="Source Table: permission")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Permission>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, parentId, name, describe, url, icon, num, code, spread, attribute, type, level, time, checked)
                .from(permission);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.955+08:00", comments="Source Table: permission")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Permission>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, parentId, name, describe, url, icon, num, code, spread, attribute, type, level, time, checked)
                .from(permission);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.955+08:00", comments="Source Table: permission")
    default Permission selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, parentId, name, describe, url, icon, num, code, spread, attribute, type, level, time, checked)
                .from(permission)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.955+08:00", comments="Source Table: permission")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Permission record) {
        return UpdateDSL.updateWithMapper(this::update, permission)
                .set(parentId).equalTo(record::getParentId)
                .set(name).equalTo(record::getName)
                .set(describe).equalTo(record::getDescribe)
                .set(url).equalTo(record::getUrl)
                .set(icon).equalTo(record::getIcon)
                .set(num).equalTo(record::getNum)
                .set(code).equalTo(record::getCode)
                .set(spread).equalTo(record::getSpread)
                .set(attribute).equalTo(record::getAttribute)
                .set(type).equalTo(record::getType)
                .set(level).equalTo(record::getLevel)
                .set(time).equalTo(record::getTime)
                .set(checked).equalTo(record::getChecked);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.955+08:00", comments="Source Table: permission")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Permission record) {
        return UpdateDSL.updateWithMapper(this::update, permission)
                .set(parentId).equalToWhenPresent(record::getParentId)
                .set(name).equalToWhenPresent(record::getName)
                .set(describe).equalToWhenPresent(record::getDescribe)
                .set(url).equalToWhenPresent(record::getUrl)
                .set(icon).equalToWhenPresent(record::getIcon)
                .set(num).equalToWhenPresent(record::getNum)
                .set(code).equalToWhenPresent(record::getCode)
                .set(spread).equalToWhenPresent(record::getSpread)
                .set(attribute).equalToWhenPresent(record::getAttribute)
                .set(type).equalToWhenPresent(record::getType)
                .set(level).equalToWhenPresent(record::getLevel)
                .set(time).equalToWhenPresent(record::getTime)
                .set(checked).equalToWhenPresent(record::getChecked);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.955+08:00", comments="Source Table: permission")
    default int updateByPrimaryKey(Permission record) {
        return UpdateDSL.updateWithMapper(this::update, permission)
                .set(parentId).equalTo(record::getParentId)
                .set(name).equalTo(record::getName)
                .set(describe).equalTo(record::getDescribe)
                .set(url).equalTo(record::getUrl)
                .set(icon).equalTo(record::getIcon)
                .set(num).equalTo(record::getNum)
                .set(code).equalTo(record::getCode)
                .set(spread).equalTo(record::getSpread)
                .set(attribute).equalTo(record::getAttribute)
                .set(type).equalTo(record::getType)
                .set(level).equalTo(record::getLevel)
                .set(time).equalTo(record::getTime)
                .set(checked).equalTo(record::getChecked)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.955+08:00", comments="Source Table: permission")
    default int updateByPrimaryKeySelective(Permission record) {
        return UpdateDSL.updateWithMapper(this::update, permission)
                .set(parentId).equalToWhenPresent(record::getParentId)
                .set(name).equalToWhenPresent(record::getName)
                .set(describe).equalToWhenPresent(record::getDescribe)
                .set(url).equalToWhenPresent(record::getUrl)
                .set(icon).equalToWhenPresent(record::getIcon)
                .set(num).equalToWhenPresent(record::getNum)
                .set(code).equalToWhenPresent(record::getCode)
                .set(spread).equalToWhenPresent(record::getSpread)
                .set(attribute).equalToWhenPresent(record::getAttribute)
                .set(type).equalToWhenPresent(record::getType)
                .set(level).equalToWhenPresent(record::getLevel)
                .set(time).equalToWhenPresent(record::getTime)
                .set(checked).equalToWhenPresent(record::getChecked)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}