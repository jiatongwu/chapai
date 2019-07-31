package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.SendSmsLogDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.SendSmsLog;
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
public interface SendSmsLogDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.233+08:00", comments="Source Table: send_sms_log")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.233+08:00", comments="Source Table: send_sms_log")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.233+08:00", comments="Source Table: send_sms_log")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @Options(useGeneratedKeys=true,keyProperty="record.id")
    int insert(InsertStatementProvider<SendSmsLog> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.233+08:00", comments="Source Table: send_sms_log")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SendSmsLogResult")
    SendSmsLog selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.233+08:00", comments="Source Table: send_sms_log")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SendSmsLogResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="createtime", property="createtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="cph", property="cph", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="sms_message", property="smsMessage", jdbcType=JdbcType.VARCHAR)
    })
    List<SendSmsLog> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.233+08:00", comments="Source Table: send_sms_log")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.233+08:00", comments="Source Table: send_sms_log")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(sendSmsLog);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.233+08:00", comments="Source Table: send_sms_log")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, sendSmsLog);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.233+08:00", comments="Source Table: send_sms_log")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, sendSmsLog)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.233+08:00", comments="Source Table: send_sms_log")
    default int insert(SendSmsLog record) {
        return insert(SqlBuilder.insert(record)
                .into(sendSmsLog)
                .map(userId).toProperty("userId")
                .map(createtime).toProperty("createtime")
                .map(cph).toProperty("cph")
                .map(phone).toProperty("phone")
                .map(smsMessage).toProperty("smsMessage")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.233+08:00", comments="Source Table: send_sms_log")
    default int insertSelective(SendSmsLog record) {
        return insert(SqlBuilder.insert(record)
                .into(sendSmsLog)
                .map(userId).toPropertyWhenPresent("userId", record::getUserId)
                .map(createtime).toPropertyWhenPresent("createtime", record::getCreatetime)
                .map(cph).toPropertyWhenPresent("cph", record::getCph)
                .map(phone).toPropertyWhenPresent("phone", record::getPhone)
                .map(smsMessage).toPropertyWhenPresent("smsMessage", record::getSmsMessage)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.234+08:00", comments="Source Table: send_sms_log")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<SendSmsLog>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, userId, createtime, cph, phone, smsMessage)
                .from(sendSmsLog);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.234+08:00", comments="Source Table: send_sms_log")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<SendSmsLog>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, userId, createtime, cph, phone, smsMessage)
                .from(sendSmsLog);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.234+08:00", comments="Source Table: send_sms_log")
    default SendSmsLog selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, userId, createtime, cph, phone, smsMessage)
                .from(sendSmsLog)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.234+08:00", comments="Source Table: send_sms_log")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(SendSmsLog record) {
        return UpdateDSL.updateWithMapper(this::update, sendSmsLog)
                .set(userId).equalTo(record::getUserId)
                .set(createtime).equalTo(record::getCreatetime)
                .set(cph).equalTo(record::getCph)
                .set(phone).equalTo(record::getPhone)
                .set(smsMessage).equalTo(record::getSmsMessage);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.234+08:00", comments="Source Table: send_sms_log")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(SendSmsLog record) {
        return UpdateDSL.updateWithMapper(this::update, sendSmsLog)
                .set(userId).equalToWhenPresent(record::getUserId)
                .set(createtime).equalToWhenPresent(record::getCreatetime)
                .set(cph).equalToWhenPresent(record::getCph)
                .set(phone).equalToWhenPresent(record::getPhone)
                .set(smsMessage).equalToWhenPresent(record::getSmsMessage);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.234+08:00", comments="Source Table: send_sms_log")
    default int updateByPrimaryKey(SendSmsLog record) {
        return UpdateDSL.updateWithMapper(this::update, sendSmsLog)
                .set(userId).equalTo(record::getUserId)
                .set(createtime).equalTo(record::getCreatetime)
                .set(cph).equalTo(record::getCph)
                .set(phone).equalTo(record::getPhone)
                .set(smsMessage).equalTo(record::getSmsMessage)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.234+08:00", comments="Source Table: send_sms_log")
    default int updateByPrimaryKeySelective(SendSmsLog record) {
        return UpdateDSL.updateWithMapper(this::update, sendSmsLog)
                .set(userId).equalToWhenPresent(record::getUserId)
                .set(createtime).equalToWhenPresent(record::getCreatetime)
                .set(cph).equalToWhenPresent(record::getCph)
                .set(phone).equalToWhenPresent(record::getPhone)
                .set(smsMessage).equalToWhenPresent(record::getSmsMessage)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}