package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.WeiguijiluDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.Weiguijilu;
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
public interface WeiguijiluDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.557+08:00", comments="Source Table: weiguijilu")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.557+08:00", comments="Source Table: weiguijilu")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.557+08:00", comments="Source Table: weiguijilu")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @Options(useGeneratedKeys=true,keyProperty="record.id")
    int insert(InsertStatementProvider<Weiguijilu> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.557+08:00", comments="Source Table: weiguijilu")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("WeiguijiluResult")
    Weiguijilu selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.557+08:00", comments="Source Table: weiguijilu")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="WeiguijiluResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="cph", property="cph", jdbcType=JdbcType.VARCHAR),
        @Result(column="createtime", property="createtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="base64image", property="base64image", jdbcType=JdbcType.CLOB)
    })
    List<Weiguijilu> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.557+08:00", comments="Source Table: weiguijilu")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.557+08:00", comments="Source Table: weiguijilu")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(weiguijilu);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.557+08:00", comments="Source Table: weiguijilu")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, weiguijilu);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.557+08:00", comments="Source Table: weiguijilu")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, weiguijilu)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.557+08:00", comments="Source Table: weiguijilu")
    default int insert(Weiguijilu record) {
        return insert(SqlBuilder.insert(record)
                .into(weiguijilu)
                .map(userId).toProperty("userId")
                .map(remark).toProperty("remark")
                .map(cph).toProperty("cph")
                .map(createtime).toProperty("createtime")
                .map(base64image).toProperty("base64image")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.557+08:00", comments="Source Table: weiguijilu")
    default int insertSelective(Weiguijilu record) {
        return insert(SqlBuilder.insert(record)
                .into(weiguijilu)
                .map(userId).toPropertyWhenPresent("userId", record::getUserId)
                .map(remark).toPropertyWhenPresent("remark", record::getRemark)
                .map(cph).toPropertyWhenPresent("cph", record::getCph)
                .map(createtime).toPropertyWhenPresent("createtime", record::getCreatetime)
                .map(base64image).toPropertyWhenPresent("base64image", record::getBase64image)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.557+08:00", comments="Source Table: weiguijilu")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Weiguijilu>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, userId, remark, cph, createtime, base64image)
                .from(weiguijilu);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.557+08:00", comments="Source Table: weiguijilu")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Weiguijilu>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, userId, remark, cph, createtime, base64image)
                .from(weiguijilu);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.557+08:00", comments="Source Table: weiguijilu")
    default Weiguijilu selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, userId, remark, cph, createtime, base64image)
                .from(weiguijilu)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.557+08:00", comments="Source Table: weiguijilu")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Weiguijilu record) {
        return UpdateDSL.updateWithMapper(this::update, weiguijilu)
                .set(userId).equalTo(record::getUserId)
                .set(remark).equalTo(record::getRemark)
                .set(cph).equalTo(record::getCph)
                .set(createtime).equalTo(record::getCreatetime)
                .set(base64image).equalTo(record::getBase64image);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.558+08:00", comments="Source Table: weiguijilu")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Weiguijilu record) {
        return UpdateDSL.updateWithMapper(this::update, weiguijilu)
                .set(userId).equalToWhenPresent(record::getUserId)
                .set(remark).equalToWhenPresent(record::getRemark)
                .set(cph).equalToWhenPresent(record::getCph)
                .set(createtime).equalToWhenPresent(record::getCreatetime)
                .set(base64image).equalToWhenPresent(record::getBase64image);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.558+08:00", comments="Source Table: weiguijilu")
    default int updateByPrimaryKey(Weiguijilu record) {
        return UpdateDSL.updateWithMapper(this::update, weiguijilu)
                .set(userId).equalTo(record::getUserId)
                .set(remark).equalTo(record::getRemark)
                .set(cph).equalTo(record::getCph)
                .set(createtime).equalTo(record::getCreatetime)
                .set(base64image).equalTo(record::getBase64image)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.558+08:00", comments="Source Table: weiguijilu")
    default int updateByPrimaryKeySelective(Weiguijilu record) {
        return UpdateDSL.updateWithMapper(this::update, weiguijilu)
                .set(userId).equalToWhenPresent(record::getUserId)
                .set(remark).equalToWhenPresent(record::getRemark)
                .set(cph).equalToWhenPresent(record::getCph)
                .set(createtime).equalToWhenPresent(record::getCreatetime)
                .set(base64image).equalToWhenPresent(record::getBase64image)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}