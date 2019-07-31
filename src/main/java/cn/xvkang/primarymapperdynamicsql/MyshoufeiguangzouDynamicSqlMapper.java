package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MyshoufeiguangzouDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.Myshoufeiguangzou;
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
public interface MyshoufeiguangzouDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.054+08:00", comments="Source Table: MYSHOUFEIGUANGZOU")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.054+08:00", comments="Source Table: MYSHOUFEIGUANGZOU")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.054+08:00", comments="Source Table: MYSHOUFEIGUANGZOU")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.cardtype", before=false, resultType=String.class)
    int insert(InsertStatementProvider<Myshoufeiguangzou> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.054+08:00", comments="Source Table: MYSHOUFEIGUANGZOU")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MyshoufeiguangzouResult")
    Myshoufeiguangzou selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.054+08:00", comments="Source Table: MYSHOUFEIGUANGZOU")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MyshoufeiguangzouResult", value = {
        @Result(column="CardType", property="cardtype", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="FreeMark", property="freemark", jdbcType=JdbcType.INTEGER),
        @Result(column="FreeTime", property="freetime", jdbcType=JdbcType.INTEGER),
        @Result(column="SFCycle", property="sfcycle", jdbcType=JdbcType.INTEGER),
        @Result(column="TimePeriod", property="timeperiod", jdbcType=JdbcType.INTEGER),
        @Result(column="WithinPeriodSF", property="withinperiodsf", jdbcType=JdbcType.DECIMAL),
        @Result(column="WithoutPeriodSF", property="withoutperiodsf", jdbcType=JdbcType.DECIMAL)
    })
    List<Myshoufeiguangzou> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.054+08:00", comments="Source Table: MYSHOUFEIGUANGZOU")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.054+08:00", comments="Source Table: MYSHOUFEIGUANGZOU")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(myshoufeiguangzou);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.054+08:00", comments="Source Table: MYSHOUFEIGUANGZOU")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, myshoufeiguangzou);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.054+08:00", comments="Source Table: MYSHOUFEIGUANGZOU")
    default int deleteByPrimaryKey(String cardtype_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, myshoufeiguangzou)
                .where(cardtype, isEqualTo(cardtype_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.054+08:00", comments="Source Table: MYSHOUFEIGUANGZOU")
    default int insert(Myshoufeiguangzou record) {
        return insert(SqlBuilder.insert(record)
                .into(myshoufeiguangzou)
                .map(freemark).toProperty("freemark")
                .map(freetime).toProperty("freetime")
                .map(sfcycle).toProperty("sfcycle")
                .map(timeperiod).toProperty("timeperiod")
                .map(withinperiodsf).toProperty("withinperiodsf")
                .map(withoutperiodsf).toProperty("withoutperiodsf")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.054+08:00", comments="Source Table: MYSHOUFEIGUANGZOU")
    default int insertSelective(Myshoufeiguangzou record) {
        return insert(SqlBuilder.insert(record)
                .into(myshoufeiguangzou)
                .map(freemark).toPropertyWhenPresent("freemark", record::getFreemark)
                .map(freetime).toPropertyWhenPresent("freetime", record::getFreetime)
                .map(sfcycle).toPropertyWhenPresent("sfcycle", record::getSfcycle)
                .map(timeperiod).toPropertyWhenPresent("timeperiod", record::getTimeperiod)
                .map(withinperiodsf).toPropertyWhenPresent("withinperiodsf", record::getWithinperiodsf)
                .map(withoutperiodsf).toPropertyWhenPresent("withoutperiodsf", record::getWithoutperiodsf)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.055+08:00", comments="Source Table: MYSHOUFEIGUANGZOU")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myshoufeiguangzou>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, cardtype, freemark, freetime, sfcycle, timeperiod, withinperiodsf, withoutperiodsf)
                .from(myshoufeiguangzou);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.055+08:00", comments="Source Table: MYSHOUFEIGUANGZOU")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myshoufeiguangzou>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, cardtype, freemark, freetime, sfcycle, timeperiod, withinperiodsf, withoutperiodsf)
                .from(myshoufeiguangzou);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.055+08:00", comments="Source Table: MYSHOUFEIGUANGZOU")
    default Myshoufeiguangzou selectByPrimaryKey(String cardtype_) {
        return SelectDSL.selectWithMapper(this::selectOne, cardtype, freemark, freetime, sfcycle, timeperiod, withinperiodsf, withoutperiodsf)
                .from(myshoufeiguangzou)
                .where(cardtype, isEqualTo(cardtype_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.055+08:00", comments="Source Table: MYSHOUFEIGUANGZOU")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Myshoufeiguangzou record) {
        return UpdateDSL.updateWithMapper(this::update, myshoufeiguangzou)
                .set(freemark).equalTo(record::getFreemark)
                .set(freetime).equalTo(record::getFreetime)
                .set(sfcycle).equalTo(record::getSfcycle)
                .set(timeperiod).equalTo(record::getTimeperiod)
                .set(withinperiodsf).equalTo(record::getWithinperiodsf)
                .set(withoutperiodsf).equalTo(record::getWithoutperiodsf);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.055+08:00", comments="Source Table: MYSHOUFEIGUANGZOU")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Myshoufeiguangzou record) {
        return UpdateDSL.updateWithMapper(this::update, myshoufeiguangzou)
                .set(freemark).equalToWhenPresent(record::getFreemark)
                .set(freetime).equalToWhenPresent(record::getFreetime)
                .set(sfcycle).equalToWhenPresent(record::getSfcycle)
                .set(timeperiod).equalToWhenPresent(record::getTimeperiod)
                .set(withinperiodsf).equalToWhenPresent(record::getWithinperiodsf)
                .set(withoutperiodsf).equalToWhenPresent(record::getWithoutperiodsf);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.055+08:00", comments="Source Table: MYSHOUFEIGUANGZOU")
    default int updateByPrimaryKey(Myshoufeiguangzou record) {
        return UpdateDSL.updateWithMapper(this::update, myshoufeiguangzou)
                .set(freemark).equalTo(record::getFreemark)
                .set(freetime).equalTo(record::getFreetime)
                .set(sfcycle).equalTo(record::getSfcycle)
                .set(timeperiod).equalTo(record::getTimeperiod)
                .set(withinperiodsf).equalTo(record::getWithinperiodsf)
                .set(withoutperiodsf).equalTo(record::getWithoutperiodsf)
                .where(cardtype, isEqualTo(record::getCardtype))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.055+08:00", comments="Source Table: MYSHOUFEIGUANGZOU")
    default int updateByPrimaryKeySelective(Myshoufeiguangzou record) {
        return UpdateDSL.updateWithMapper(this::update, myshoufeiguangzou)
                .set(freemark).equalToWhenPresent(record::getFreemark)
                .set(freetime).equalToWhenPresent(record::getFreetime)
                .set(sfcycle).equalToWhenPresent(record::getSfcycle)
                .set(timeperiod).equalToWhenPresent(record::getTimeperiod)
                .set(withinperiodsf).equalToWhenPresent(record::getWithinperiodsf)
                .set(withoutperiodsf).equalToWhenPresent(record::getWithoutperiodsf)
                .where(cardtype, isEqualTo(record::getCardtype))
                .build()
                .execute();
    }
}