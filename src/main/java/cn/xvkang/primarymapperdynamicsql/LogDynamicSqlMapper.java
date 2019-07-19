package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.LogDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.Log;
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
public interface LogDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.917+08:00", comments="Source Table: log")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.917+08:00", comments="Source Table: log")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.917+08:00", comments="Source Table: log")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @Options(useGeneratedKeys=true,keyProperty="record.id")
    int insert(InsertStatementProvider<Log> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.917+08:00", comments="Source Table: log")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("LogResult")
    Log selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.917+08:00", comments="Source Table: log")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="LogResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="operate_name", property="operateName", jdbcType=JdbcType.VARCHAR),
        @Result(column="createtime", property="createtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="user_agent", property="userAgent", jdbcType=JdbcType.VARCHAR),
        @Result(column="client_ip", property="clientIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="operate_username", property="operateUsername", jdbcType=JdbcType.VARCHAR),
        @Result(column="operate_user_phone", property="operateUserPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="operate_cph", property="operateCph", jdbcType=JdbcType.VARCHAR),
        @Result(column="validEnd", property="validend", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Log> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.917+08:00", comments="Source Table: log")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.917+08:00", comments="Source Table: log")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(log);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.917+08:00", comments="Source Table: log")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, log);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.917+08:00", comments="Source Table: log")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, log)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.917+08:00", comments="Source Table: log")
    default int insert(Log record) {
        return insert(SqlBuilder.insert(record)
                .into(log)
                .map(userId).toProperty("userId")
                .map(operateName).toProperty("operateName")
                .map(createtime).toProperty("createtime")
                .map(userAgent).toProperty("userAgent")
                .map(clientIp).toProperty("clientIp")
                .map(operateUsername).toProperty("operateUsername")
                .map(operateUserPhone).toProperty("operateUserPhone")
                .map(operateCph).toProperty("operateCph")
                .map(validend).toProperty("validend")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.917+08:00", comments="Source Table: log")
    default int insertSelective(Log record) {
        return insert(SqlBuilder.insert(record)
                .into(log)
                .map(userId).toPropertyWhenPresent("userId", record::getUserId)
                .map(operateName).toPropertyWhenPresent("operateName", record::getOperateName)
                .map(createtime).toPropertyWhenPresent("createtime", record::getCreatetime)
                .map(userAgent).toPropertyWhenPresent("userAgent", record::getUserAgent)
                .map(clientIp).toPropertyWhenPresent("clientIp", record::getClientIp)
                .map(operateUsername).toPropertyWhenPresent("operateUsername", record::getOperateUsername)
                .map(operateUserPhone).toPropertyWhenPresent("operateUserPhone", record::getOperateUserPhone)
                .map(operateCph).toPropertyWhenPresent("operateCph", record::getOperateCph)
                .map(validend).toPropertyWhenPresent("validend", record::getValidend)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.917+08:00", comments="Source Table: log")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Log>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, userId, operateName, createtime, userAgent, clientIp, operateUsername, operateUserPhone, operateCph, validend)
                .from(log);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.917+08:00", comments="Source Table: log")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Log>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, userId, operateName, createtime, userAgent, clientIp, operateUsername, operateUserPhone, operateCph, validend)
                .from(log);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.917+08:00", comments="Source Table: log")
    default Log selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, userId, operateName, createtime, userAgent, clientIp, operateUsername, operateUserPhone, operateCph, validend)
                .from(log)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.917+08:00", comments="Source Table: log")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Log record) {
        return UpdateDSL.updateWithMapper(this::update, log)
                .set(userId).equalTo(record::getUserId)
                .set(operateName).equalTo(record::getOperateName)
                .set(createtime).equalTo(record::getCreatetime)
                .set(userAgent).equalTo(record::getUserAgent)
                .set(clientIp).equalTo(record::getClientIp)
                .set(operateUsername).equalTo(record::getOperateUsername)
                .set(operateUserPhone).equalTo(record::getOperateUserPhone)
                .set(operateCph).equalTo(record::getOperateCph)
                .set(validend).equalTo(record::getValidend);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.917+08:00", comments="Source Table: log")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Log record) {
        return UpdateDSL.updateWithMapper(this::update, log)
                .set(userId).equalToWhenPresent(record::getUserId)
                .set(operateName).equalToWhenPresent(record::getOperateName)
                .set(createtime).equalToWhenPresent(record::getCreatetime)
                .set(userAgent).equalToWhenPresent(record::getUserAgent)
                .set(clientIp).equalToWhenPresent(record::getClientIp)
                .set(operateUsername).equalToWhenPresent(record::getOperateUsername)
                .set(operateUserPhone).equalToWhenPresent(record::getOperateUserPhone)
                .set(operateCph).equalToWhenPresent(record::getOperateCph)
                .set(validend).equalToWhenPresent(record::getValidend);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.917+08:00", comments="Source Table: log")
    default int updateByPrimaryKey(Log record) {
        return UpdateDSL.updateWithMapper(this::update, log)
                .set(userId).equalTo(record::getUserId)
                .set(operateName).equalTo(record::getOperateName)
                .set(createtime).equalTo(record::getCreatetime)
                .set(userAgent).equalTo(record::getUserAgent)
                .set(clientIp).equalTo(record::getClientIp)
                .set(operateUsername).equalTo(record::getOperateUsername)
                .set(operateUserPhone).equalTo(record::getOperateUserPhone)
                .set(operateCph).equalTo(record::getOperateCph)
                .set(validend).equalTo(record::getValidend)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.917+08:00", comments="Source Table: log")
    default int updateByPrimaryKeySelective(Log record) {
        return UpdateDSL.updateWithMapper(this::update, log)
                .set(userId).equalToWhenPresent(record::getUserId)
                .set(operateName).equalToWhenPresent(record::getOperateName)
                .set(createtime).equalToWhenPresent(record::getCreatetime)
                .set(userAgent).equalToWhenPresent(record::getUserAgent)
                .set(clientIp).equalToWhenPresent(record::getClientIp)
                .set(operateUsername).equalToWhenPresent(record::getOperateUsername)
                .set(operateUserPhone).equalToWhenPresent(record::getOperateUserPhone)
                .set(operateCph).equalToWhenPresent(record::getOperateCph)
                .set(validend).equalToWhenPresent(record::getValidend)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}