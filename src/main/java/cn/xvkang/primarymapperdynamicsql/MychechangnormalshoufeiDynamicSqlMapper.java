package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MychechangnormalshoufeiDynamicSqlSupport.*;

import cn.xvkang.primaryentity.Mychechangnormalshoufei;
import java.util.List;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
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
public interface MychechangnormalshoufeiDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.996+08:00", comments="Source Table: MYCHECHANGNORMALSHOUFEI")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.996+08:00", comments="Source Table: MYCHECHANGNORMALSHOUFEI")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.996+08:00", comments="Source Table: MYCHECHANGNORMALSHOUFEI")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Mychechangnormalshoufei> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.996+08:00", comments="Source Table: MYCHECHANGNORMALSHOUFEI")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MychechangnormalshoufeiResult", value = {
        @Result(column="CardType", property="cardtype", jdbcType=JdbcType.VARCHAR),
        @Result(column="FreeMinute", property="freeminute", jdbcType=JdbcType.INTEGER),
        @Result(column="TopSF", property="topsf", jdbcType=JdbcType.INTEGER),
        @Result(column="Hours", property="hours", jdbcType=JdbcType.INTEGER),
        @Result(column="JE", property="je", jdbcType=JdbcType.DECIMAL)
    })
    List<Mychechangnormalshoufei> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.996+08:00", comments="Source Table: MYCHECHANGNORMALSHOUFEI")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.996+08:00", comments="Source Table: MYCHECHANGNORMALSHOUFEI")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(mychechangnormalshoufei);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.996+08:00", comments="Source Table: MYCHECHANGNORMALSHOUFEI")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, mychechangnormalshoufei);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.996+08:00", comments="Source Table: MYCHECHANGNORMALSHOUFEI")
    default int insert(Mychechangnormalshoufei record) {
        return insert(SqlBuilder.insert(record)
                .into(mychechangnormalshoufei)
                .map(cardtype).toProperty("cardtype")
                .map(freeminute).toProperty("freeminute")
                .map(topsf).toProperty("topsf")
                .map(hours).toProperty("hours")
                .map(je).toProperty("je")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.996+08:00", comments="Source Table: MYCHECHANGNORMALSHOUFEI")
    default int insertSelective(Mychechangnormalshoufei record) {
        return insert(SqlBuilder.insert(record)
                .into(mychechangnormalshoufei)
                .map(cardtype).toPropertyWhenPresent("cardtype", record::getCardtype)
                .map(freeminute).toPropertyWhenPresent("freeminute", record::getFreeminute)
                .map(topsf).toPropertyWhenPresent("topsf", record::getTopsf)
                .map(hours).toPropertyWhenPresent("hours", record::getHours)
                .map(je).toPropertyWhenPresent("je", record::getJe)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.996+08:00", comments="Source Table: MYCHECHANGNORMALSHOUFEI")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Mychechangnormalshoufei>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, cardtype, freeminute, topsf, hours, je)
                .from(mychechangnormalshoufei);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.996+08:00", comments="Source Table: MYCHECHANGNORMALSHOUFEI")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Mychechangnormalshoufei>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, cardtype, freeminute, topsf, hours, je)
                .from(mychechangnormalshoufei);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.996+08:00", comments="Source Table: MYCHECHANGNORMALSHOUFEI")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Mychechangnormalshoufei record) {
        return UpdateDSL.updateWithMapper(this::update, mychechangnormalshoufei)
                .set(cardtype).equalTo(record::getCardtype)
                .set(freeminute).equalTo(record::getFreeminute)
                .set(topsf).equalTo(record::getTopsf)
                .set(hours).equalTo(record::getHours)
                .set(je).equalTo(record::getJe);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.996+08:00", comments="Source Table: MYCHECHANGNORMALSHOUFEI")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Mychechangnormalshoufei record) {
        return UpdateDSL.updateWithMapper(this::update, mychechangnormalshoufei)
                .set(cardtype).equalToWhenPresent(record::getCardtype)
                .set(freeminute).equalToWhenPresent(record::getFreeminute)
                .set(topsf).equalToWhenPresent(record::getTopsf)
                .set(hours).equalToWhenPresent(record::getHours)
                .set(je).equalToWhenPresent(record::getJe);
    }
}