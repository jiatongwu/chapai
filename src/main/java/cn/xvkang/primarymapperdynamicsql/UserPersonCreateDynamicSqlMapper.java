package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.UserPersonCreateDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.UserPersonCreate;
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
public interface UserPersonCreateDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.554+08:00", comments="Source Table: user_person_create")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.554+08:00", comments="Source Table: user_person_create")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.555+08:00", comments="Source Table: user_person_create")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @Options(useGeneratedKeys=true,keyProperty="record.id")
    int insert(InsertStatementProvider<UserPersonCreate> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.555+08:00", comments="Source Table: user_person_create")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UserPersonCreateResult")
    UserPersonCreate selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.555+08:00", comments="Source Table: user_person_create")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UserPersonCreateResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="person_id", property="personId", jdbcType=JdbcType.INTEGER),
        @Result(column="createtime", property="createtime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<UserPersonCreate> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.555+08:00", comments="Source Table: user_person_create")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.555+08:00", comments="Source Table: user_person_create")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(userPersonCreate);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.555+08:00", comments="Source Table: user_person_create")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, userPersonCreate);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.555+08:00", comments="Source Table: user_person_create")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, userPersonCreate)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.555+08:00", comments="Source Table: user_person_create")
    default int insert(UserPersonCreate record) {
        return insert(SqlBuilder.insert(record)
                .into(userPersonCreate)
                .map(userId).toProperty("userId")
                .map(personId).toProperty("personId")
                .map(createtime).toProperty("createtime")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.555+08:00", comments="Source Table: user_person_create")
    default int insertSelective(UserPersonCreate record) {
        return insert(SqlBuilder.insert(record)
                .into(userPersonCreate)
                .map(userId).toPropertyWhenPresent("userId", record::getUserId)
                .map(personId).toPropertyWhenPresent("personId", record::getPersonId)
                .map(createtime).toPropertyWhenPresent("createtime", record::getCreatetime)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.555+08:00", comments="Source Table: user_person_create")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<UserPersonCreate>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, userId, personId, createtime)
                .from(userPersonCreate);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.555+08:00", comments="Source Table: user_person_create")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<UserPersonCreate>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, userId, personId, createtime)
                .from(userPersonCreate);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.555+08:00", comments="Source Table: user_person_create")
    default UserPersonCreate selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, userId, personId, createtime)
                .from(userPersonCreate)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.555+08:00", comments="Source Table: user_person_create")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(UserPersonCreate record) {
        return UpdateDSL.updateWithMapper(this::update, userPersonCreate)
                .set(userId).equalTo(record::getUserId)
                .set(personId).equalTo(record::getPersonId)
                .set(createtime).equalTo(record::getCreatetime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.555+08:00", comments="Source Table: user_person_create")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(UserPersonCreate record) {
        return UpdateDSL.updateWithMapper(this::update, userPersonCreate)
                .set(userId).equalToWhenPresent(record::getUserId)
                .set(personId).equalToWhenPresent(record::getPersonId)
                .set(createtime).equalToWhenPresent(record::getCreatetime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.555+08:00", comments="Source Table: user_person_create")
    default int updateByPrimaryKey(UserPersonCreate record) {
        return UpdateDSL.updateWithMapper(this::update, userPersonCreate)
                .set(userId).equalTo(record::getUserId)
                .set(personId).equalTo(record::getPersonId)
                .set(createtime).equalTo(record::getCreatetime)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.555+08:00", comments="Source Table: user_person_create")
    default int updateByPrimaryKeySelective(UserPersonCreate record) {
        return UpdateDSL.updateWithMapper(this::update, userPersonCreate)
                .set(userId).equalToWhenPresent(record::getUserId)
                .set(personId).equalToWhenPresent(record::getPersonId)
                .set(createtime).equalToWhenPresent(record::getCreatetime)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}