package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.SmsTemplateDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.SmsTemplate;
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
public interface SmsTemplateDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.232+08:00", comments="Source Table: sms_template")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.232+08:00", comments="Source Table: sms_template")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.232+08:00", comments="Source Table: sms_template")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @Options(useGeneratedKeys=true,keyProperty="record.id")
    int insert(InsertStatementProvider<SmsTemplate> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.232+08:00", comments="Source Table: sms_template")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SmsTemplateResult")
    SmsTemplate selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.232+08:00", comments="Source Table: sms_template")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SmsTemplateResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="createtime", property="createtime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SmsTemplate> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.232+08:00", comments="Source Table: sms_template")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.232+08:00", comments="Source Table: sms_template")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(smsTemplate);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.232+08:00", comments="Source Table: sms_template")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, smsTemplate);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.232+08:00", comments="Source Table: sms_template")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, smsTemplate)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.232+08:00", comments="Source Table: sms_template")
    default int insert(SmsTemplate record) {
        return insert(SqlBuilder.insert(record)
                .into(smsTemplate)
                .map(name).toProperty("name")
                .map(content).toProperty("content")
                .map(createtime).toProperty("createtime")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.232+08:00", comments="Source Table: sms_template")
    default int insertSelective(SmsTemplate record) {
        return insert(SqlBuilder.insert(record)
                .into(smsTemplate)
                .map(name).toPropertyWhenPresent("name", record::getName)
                .map(content).toPropertyWhenPresent("content", record::getContent)
                .map(createtime).toPropertyWhenPresent("createtime", record::getCreatetime)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.232+08:00", comments="Source Table: sms_template")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<SmsTemplate>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, name, content, createtime)
                .from(smsTemplate);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.232+08:00", comments="Source Table: sms_template")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<SmsTemplate>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, name, content, createtime)
                .from(smsTemplate);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.232+08:00", comments="Source Table: sms_template")
    default SmsTemplate selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, name, content, createtime)
                .from(smsTemplate)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.232+08:00", comments="Source Table: sms_template")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(SmsTemplate record) {
        return UpdateDSL.updateWithMapper(this::update, smsTemplate)
                .set(name).equalTo(record::getName)
                .set(content).equalTo(record::getContent)
                .set(createtime).equalTo(record::getCreatetime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.232+08:00", comments="Source Table: sms_template")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(SmsTemplate record) {
        return UpdateDSL.updateWithMapper(this::update, smsTemplate)
                .set(name).equalToWhenPresent(record::getName)
                .set(content).equalToWhenPresent(record::getContent)
                .set(createtime).equalToWhenPresent(record::getCreatetime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.232+08:00", comments="Source Table: sms_template")
    default int updateByPrimaryKey(SmsTemplate record) {
        return UpdateDSL.updateWithMapper(this::update, smsTemplate)
                .set(name).equalTo(record::getName)
                .set(content).equalTo(record::getContent)
                .set(createtime).equalTo(record::getCreatetime)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.232+08:00", comments="Source Table: sms_template")
    default int updateByPrimaryKeySelective(SmsTemplate record) {
        return UpdateDSL.updateWithMapper(this::update, smsTemplate)
                .set(name).equalToWhenPresent(record::getName)
                .set(content).equalToWhenPresent(record::getContent)
                .set(createtime).equalToWhenPresent(record::getCreatetime)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}