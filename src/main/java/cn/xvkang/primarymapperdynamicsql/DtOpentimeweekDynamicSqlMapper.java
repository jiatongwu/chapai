package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.DtOpentimeweekDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.DtOpentimeweek;
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
public interface DtOpentimeweekDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.632+08:00", comments="Source Table: Dt_OpenTimeWeek")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.632+08:00", comments="Source Table: Dt_OpenTimeWeek")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.632+08:00", comments="Source Table: Dt_OpenTimeWeek")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<DtOpentimeweek> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.632+08:00", comments="Source Table: Dt_OpenTimeWeek")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("DtOpentimeweekResult")
    DtOpentimeweek selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.632+08:00", comments="Source Table: Dt_OpenTimeWeek")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="DtOpentimeweekResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="DevcNum", property="devcnum", jdbcType=JdbcType.INTEGER),
        @Result(column="Week", property="week", jdbcType=JdbcType.INTEGER),
        @Result(column="startime", property="startime", jdbcType=JdbcType.VARCHAR),
        @Result(column="endtime", property="endtime", jdbcType=JdbcType.VARCHAR)
    })
    List<DtOpentimeweek> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.632+08:00", comments="Source Table: Dt_OpenTimeWeek")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.632+08:00", comments="Source Table: Dt_OpenTimeWeek")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(dtOpentimeweek);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.632+08:00", comments="Source Table: Dt_OpenTimeWeek")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, dtOpentimeweek);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.632+08:00", comments="Source Table: Dt_OpenTimeWeek")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, dtOpentimeweek)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.632+08:00", comments="Source Table: Dt_OpenTimeWeek")
    default int insert(DtOpentimeweek record) {
        return insert(SqlBuilder.insert(record)
                .into(dtOpentimeweek)
                .map(devcnum).toProperty("devcnum")
                .map(week).toProperty("week")
                .map(startime).toProperty("startime")
                .map(endtime).toProperty("endtime")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.632+08:00", comments="Source Table: Dt_OpenTimeWeek")
    default int insertSelective(DtOpentimeweek record) {
        return insert(SqlBuilder.insert(record)
                .into(dtOpentimeweek)
                .map(devcnum).toPropertyWhenPresent("devcnum", record::getDevcnum)
                .map(week).toPropertyWhenPresent("week", record::getWeek)
                .map(startime).toPropertyWhenPresent("startime", record::getStartime)
                .map(endtime).toPropertyWhenPresent("endtime", record::getEndtime)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.632+08:00", comments="Source Table: Dt_OpenTimeWeek")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<DtOpentimeweek>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, devcnum, week, startime, endtime)
                .from(dtOpentimeweek);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.632+08:00", comments="Source Table: Dt_OpenTimeWeek")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<DtOpentimeweek>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, devcnum, week, startime, endtime)
                .from(dtOpentimeweek);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.633+08:00", comments="Source Table: Dt_OpenTimeWeek")
    default DtOpentimeweek selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, devcnum, week, startime, endtime)
                .from(dtOpentimeweek)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.633+08:00", comments="Source Table: Dt_OpenTimeWeek")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(DtOpentimeweek record) {
        return UpdateDSL.updateWithMapper(this::update, dtOpentimeweek)
                .set(devcnum).equalTo(record::getDevcnum)
                .set(week).equalTo(record::getWeek)
                .set(startime).equalTo(record::getStartime)
                .set(endtime).equalTo(record::getEndtime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.633+08:00", comments="Source Table: Dt_OpenTimeWeek")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(DtOpentimeweek record) {
        return UpdateDSL.updateWithMapper(this::update, dtOpentimeweek)
                .set(devcnum).equalToWhenPresent(record::getDevcnum)
                .set(week).equalToWhenPresent(record::getWeek)
                .set(startime).equalToWhenPresent(record::getStartime)
                .set(endtime).equalToWhenPresent(record::getEndtime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.633+08:00", comments="Source Table: Dt_OpenTimeWeek")
    default int updateByPrimaryKey(DtOpentimeweek record) {
        return UpdateDSL.updateWithMapper(this::update, dtOpentimeweek)
                .set(devcnum).equalTo(record::getDevcnum)
                .set(week).equalTo(record::getWeek)
                .set(startime).equalTo(record::getStartime)
                .set(endtime).equalTo(record::getEndtime)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.633+08:00", comments="Source Table: Dt_OpenTimeWeek")
    default int updateByPrimaryKeySelective(DtOpentimeweek record) {
        return UpdateDSL.updateWithMapper(this::update, dtOpentimeweek)
                .set(devcnum).equalToWhenPresent(record::getDevcnum)
                .set(week).equalToWhenPresent(record::getWeek)
                .set(startime).equalToWhenPresent(record::getStartime)
                .set(endtime).equalToWhenPresent(record::getEndtime)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}