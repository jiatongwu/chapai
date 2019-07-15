package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.RoleDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.Role;
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
public interface RoleDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.942+08:00", comments="Source Table: role")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.942+08:00", comments="Source Table: role")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.942+08:00", comments="Source Table: role")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<Role> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.942+08:00", comments="Source Table: role")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("RoleResult")
    Role selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.942+08:00", comments="Source Table: role")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="RoleResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="describe", property="describe", jdbcType=JdbcType.VARCHAR),
        @Result(column="time", property="time", jdbcType=JdbcType.VARCHAR),
        @Result(column="state", property="state", jdbcType=JdbcType.INTEGER)
    })
    List<Role> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.942+08:00", comments="Source Table: role")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.942+08:00", comments="Source Table: role")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(role);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.943+08:00", comments="Source Table: role")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, role);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.943+08:00", comments="Source Table: role")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, role)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.943+08:00", comments="Source Table: role")
    default int insert(Role record) {
        return insert(SqlBuilder.insert(record)
                .into(role)
                .map(name).toProperty("name")
                .map(code).toProperty("code")
                .map(describe).toProperty("describe")
                .map(time).toProperty("time")
                .map(state).toProperty("state")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.943+08:00", comments="Source Table: role")
    default int insertSelective(Role record) {
        return insert(SqlBuilder.insert(record)
                .into(role)
                .map(name).toPropertyWhenPresent("name", record::getName)
                .map(code).toPropertyWhenPresent("code", record::getCode)
                .map(describe).toPropertyWhenPresent("describe", record::getDescribe)
                .map(time).toPropertyWhenPresent("time", record::getTime)
                .map(state).toPropertyWhenPresent("state", record::getState)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.943+08:00", comments="Source Table: role")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Role>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, name, code, describe, time, state)
                .from(role);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.943+08:00", comments="Source Table: role")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Role>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, name, code, describe, time, state)
                .from(role);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.943+08:00", comments="Source Table: role")
    default Role selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, name, code, describe, time, state)
                .from(role)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.943+08:00", comments="Source Table: role")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Role record) {
        return UpdateDSL.updateWithMapper(this::update, role)
                .set(name).equalTo(record::getName)
                .set(code).equalTo(record::getCode)
                .set(describe).equalTo(record::getDescribe)
                .set(time).equalTo(record::getTime)
                .set(state).equalTo(record::getState);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.943+08:00", comments="Source Table: role")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Role record) {
        return UpdateDSL.updateWithMapper(this::update, role)
                .set(name).equalToWhenPresent(record::getName)
                .set(code).equalToWhenPresent(record::getCode)
                .set(describe).equalToWhenPresent(record::getDescribe)
                .set(time).equalToWhenPresent(record::getTime)
                .set(state).equalToWhenPresent(record::getState);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.943+08:00", comments="Source Table: role")
    default int updateByPrimaryKey(Role record) {
        return UpdateDSL.updateWithMapper(this::update, role)
                .set(name).equalTo(record::getName)
                .set(code).equalTo(record::getCode)
                .set(describe).equalTo(record::getDescribe)
                .set(time).equalTo(record::getTime)
                .set(state).equalTo(record::getState)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.943+08:00", comments="Source Table: role")
    default int updateByPrimaryKeySelective(Role record) {
        return UpdateDSL.updateWithMapper(this::update, role)
                .set(name).equalToWhenPresent(record::getName)
                .set(code).equalToWhenPresent(record::getCode)
                .set(describe).equalToWhenPresent(record::getDescribe)
                .set(time).equalToWhenPresent(record::getTime)
                .set(state).equalToWhenPresent(record::getState)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}