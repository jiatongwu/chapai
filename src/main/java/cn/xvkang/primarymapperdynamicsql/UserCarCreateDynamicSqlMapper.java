package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.UserCarCreateDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.UserCarCreate;
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
public interface UserCarCreateDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.228+08:00", comments="Source Table: user_car_create")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.228+08:00", comments="Source Table: user_car_create")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.228+08:00", comments="Source Table: user_car_create")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @Options(useGeneratedKeys=true,keyProperty="record.id")
    int insert(InsertStatementProvider<UserCarCreate> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.228+08:00", comments="Source Table: user_car_create")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UserCarCreateResult")
    UserCarCreate selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.228+08:00", comments="Source Table: user_car_create")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UserCarCreateResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="car_id", property="carId", jdbcType=JdbcType.INTEGER),
        @Result(column="createtime", property="createtime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<UserCarCreate> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.228+08:00", comments="Source Table: user_car_create")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.228+08:00", comments="Source Table: user_car_create")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(userCarCreate);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.228+08:00", comments="Source Table: user_car_create")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, userCarCreate);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.228+08:00", comments="Source Table: user_car_create")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, userCarCreate)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.228+08:00", comments="Source Table: user_car_create")
    default int insert(UserCarCreate record) {
        return insert(SqlBuilder.insert(record)
                .into(userCarCreate)
                .map(userId).toProperty("userId")
                .map(carId).toProperty("carId")
                .map(createtime).toProperty("createtime")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.228+08:00", comments="Source Table: user_car_create")
    default int insertSelective(UserCarCreate record) {
        return insert(SqlBuilder.insert(record)
                .into(userCarCreate)
                .map(userId).toPropertyWhenPresent("userId", record::getUserId)
                .map(carId).toPropertyWhenPresent("carId", record::getCarId)
                .map(createtime).toPropertyWhenPresent("createtime", record::getCreatetime)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.228+08:00", comments="Source Table: user_car_create")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<UserCarCreate>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, userId, carId, createtime)
                .from(userCarCreate);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.228+08:00", comments="Source Table: user_car_create")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<UserCarCreate>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, userId, carId, createtime)
                .from(userCarCreate);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.228+08:00", comments="Source Table: user_car_create")
    default UserCarCreate selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, userId, carId, createtime)
                .from(userCarCreate)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.228+08:00", comments="Source Table: user_car_create")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(UserCarCreate record) {
        return UpdateDSL.updateWithMapper(this::update, userCarCreate)
                .set(userId).equalTo(record::getUserId)
                .set(carId).equalTo(record::getCarId)
                .set(createtime).equalTo(record::getCreatetime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.228+08:00", comments="Source Table: user_car_create")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(UserCarCreate record) {
        return UpdateDSL.updateWithMapper(this::update, userCarCreate)
                .set(userId).equalToWhenPresent(record::getUserId)
                .set(carId).equalToWhenPresent(record::getCarId)
                .set(createtime).equalToWhenPresent(record::getCreatetime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.228+08:00", comments="Source Table: user_car_create")
    default int updateByPrimaryKey(UserCarCreate record) {
        return UpdateDSL.updateWithMapper(this::update, userCarCreate)
                .set(userId).equalTo(record::getUserId)
                .set(carId).equalTo(record::getCarId)
                .set(createtime).equalTo(record::getCreatetime)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.228+08:00", comments="Source Table: user_car_create")
    default int updateByPrimaryKeySelective(UserCarCreate record) {
        return UpdateDSL.updateWithMapper(this::update, userCarCreate)
                .set(userId).equalToWhenPresent(record::getUserId)
                .set(carId).equalToWhenPresent(record::getCarId)
                .set(createtime).equalToWhenPresent(record::getCreatetime)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}