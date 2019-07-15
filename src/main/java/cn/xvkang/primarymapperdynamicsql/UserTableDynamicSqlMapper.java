package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.UserTableDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.UserTable;
import java.util.List;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
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
public interface UserTableDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.952+08:00", comments="Source Table: user_table")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.952+08:00", comments="Source Table: user_table")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.952+08:00", comments="Source Table: user_table")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @Options(useGeneratedKeys=true,keyProperty="record.id")
    int insert(InsertStatementProvider<UserTable> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.952+08:00", comments="Source Table: user_table")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UserTableResult")
    UserTable selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.952+08:00", comments="Source Table: user_table")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UserTableResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="extend", property="extend", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="salt", property="salt", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="disabled", property="disabled", jdbcType=JdbcType.INTEGER)
    })
    List<UserTable> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.952+08:00", comments="Source Table: user_table")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.952+08:00", comments="Source Table: user_table")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(userTable);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.953+08:00", comments="Source Table: user_table")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, userTable);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.953+08:00", comments="Source Table: user_table")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, userTable)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.953+08:00", comments="Source Table: user_table")
    default int insert(UserTable record) {
        return insert(SqlBuilder.insert(record)
                .into(userTable)
                .map(username).toProperty("username")
                .map(password).toProperty("password")
                .map(name).toProperty("name")
                .map(extend).toProperty("extend")
                .map(type).toProperty("type")
                .map(salt).toProperty("salt")
                .map(createTime).toProperty("createTime")
                .map(disabled).toProperty("disabled")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.953+08:00", comments="Source Table: user_table")
    default int insertSelective(UserTable record) {
        return insert(SqlBuilder.insert(record)
                .into(userTable)
                .map(username).toPropertyWhenPresent("username", record::getUsername)
                .map(password).toPropertyWhenPresent("password", record::getPassword)
                .map(name).toPropertyWhenPresent("name", record::getName)
                .map(extend).toPropertyWhenPresent("extend", record::getExtend)
                .map(type).toPropertyWhenPresent("type", record::getType)
                .map(salt).toPropertyWhenPresent("salt", record::getSalt)
                .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
                .map(disabled).toPropertyWhenPresent("disabled", record::getDisabled)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.953+08:00", comments="Source Table: user_table")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<UserTable>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, username, password, name, extend, type, salt, createTime, disabled)
                .from(userTable);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.953+08:00", comments="Source Table: user_table")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<UserTable>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, username, password, name, extend, type, salt, createTime, disabled)
                .from(userTable);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.953+08:00", comments="Source Table: user_table")
    default UserTable selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, username, password, name, extend, type, salt, createTime, disabled)
                .from(userTable)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.953+08:00", comments="Source Table: user_table")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(UserTable record) {
        return UpdateDSL.updateWithMapper(this::update, userTable)
                .set(username).equalTo(record::getUsername)
                .set(password).equalTo(record::getPassword)
                .set(name).equalTo(record::getName)
                .set(extend).equalTo(record::getExtend)
                .set(type).equalTo(record::getType)
                .set(salt).equalTo(record::getSalt)
                .set(createTime).equalTo(record::getCreateTime)
                .set(disabled).equalTo(record::getDisabled);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.953+08:00", comments="Source Table: user_table")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(UserTable record) {
        return UpdateDSL.updateWithMapper(this::update, userTable)
                .set(username).equalToWhenPresent(record::getUsername)
                .set(password).equalToWhenPresent(record::getPassword)
                .set(name).equalToWhenPresent(record::getName)
                .set(extend).equalToWhenPresent(record::getExtend)
                .set(type).equalToWhenPresent(record::getType)
                .set(salt).equalToWhenPresent(record::getSalt)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(disabled).equalToWhenPresent(record::getDisabled);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.953+08:00", comments="Source Table: user_table")
    default int updateByPrimaryKey(UserTable record) {
        return UpdateDSL.updateWithMapper(this::update, userTable)
                .set(username).equalTo(record::getUsername)
                .set(password).equalTo(record::getPassword)
                .set(name).equalTo(record::getName)
                .set(extend).equalTo(record::getExtend)
                .set(type).equalTo(record::getType)
                .set(salt).equalTo(record::getSalt)
                .set(createTime).equalTo(record::getCreateTime)
                .set(disabled).equalTo(record::getDisabled)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.953+08:00", comments="Source Table: user_table")
    default int updateByPrimaryKeySelective(UserTable record) {
        return UpdateDSL.updateWithMapper(this::update, userTable)
                .set(username).equalToWhenPresent(record::getUsername)
                .set(password).equalToWhenPresent(record::getPassword)
                .set(name).equalToWhenPresent(record::getName)
                .set(extend).equalToWhenPresent(record::getExtend)
                .set(type).equalToWhenPresent(record::getType)
                .set(salt).equalToWhenPresent(record::getSalt)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(disabled).equalToWhenPresent(record::getDisabled)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}