package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.InoutpermitionDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.Inoutpermition;
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
public interface InoutpermitionDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.434+08:00", comments="Source Table: InOutPermition")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.434+08:00", comments="Source Table: InOutPermition")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.435+08:00", comments="Source Table: InOutPermition")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<Inoutpermition> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.435+08:00", comments="Source Table: InOutPermition")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("InoutpermitionResult")
    Inoutpermition selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.435+08:00", comments="Source Table: InOutPermition")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="InoutpermitionResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CtrlNumbers", property="ctrlnumbers", jdbcType=JdbcType.VARCHAR),
        @Result(column="CardTypes", property="cardtypes", jdbcType=JdbcType.VARCHAR),
        @Result(column="WeekDays", property="weekdays", jdbcType=JdbcType.VARCHAR),
        @Result(column="TimeBegin", property="timebegin", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="TimeEnd", property="timeend", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Inoutpermition> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.435+08:00", comments="Source Table: InOutPermition")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.435+08:00", comments="Source Table: InOutPermition")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(inoutpermition);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.435+08:00", comments="Source Table: InOutPermition")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, inoutpermition);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.435+08:00", comments="Source Table: InOutPermition")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, inoutpermition)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.435+08:00", comments="Source Table: InOutPermition")
    default int insert(Inoutpermition record) {
        return insert(SqlBuilder.insert(record)
                .into(inoutpermition)
                .map(ctrlnumbers).toProperty("ctrlnumbers")
                .map(cardtypes).toProperty("cardtypes")
                .map(weekdays).toProperty("weekdays")
                .map(timebegin).toProperty("timebegin")
                .map(timeend).toProperty("timeend")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.435+08:00", comments="Source Table: InOutPermition")
    default int insertSelective(Inoutpermition record) {
        return insert(SqlBuilder.insert(record)
                .into(inoutpermition)
                .map(ctrlnumbers).toPropertyWhenPresent("ctrlnumbers", record::getCtrlnumbers)
                .map(cardtypes).toPropertyWhenPresent("cardtypes", record::getCardtypes)
                .map(weekdays).toPropertyWhenPresent("weekdays", record::getWeekdays)
                .map(timebegin).toPropertyWhenPresent("timebegin", record::getTimebegin)
                .map(timeend).toPropertyWhenPresent("timeend", record::getTimeend)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.435+08:00", comments="Source Table: InOutPermition")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Inoutpermition>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, ctrlnumbers, cardtypes, weekdays, timebegin, timeend)
                .from(inoutpermition);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.435+08:00", comments="Source Table: InOutPermition")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Inoutpermition>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, ctrlnumbers, cardtypes, weekdays, timebegin, timeend)
                .from(inoutpermition);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.435+08:00", comments="Source Table: InOutPermition")
    default Inoutpermition selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, ctrlnumbers, cardtypes, weekdays, timebegin, timeend)
                .from(inoutpermition)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.435+08:00", comments="Source Table: InOutPermition")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Inoutpermition record) {
        return UpdateDSL.updateWithMapper(this::update, inoutpermition)
                .set(ctrlnumbers).equalTo(record::getCtrlnumbers)
                .set(cardtypes).equalTo(record::getCardtypes)
                .set(weekdays).equalTo(record::getWeekdays)
                .set(timebegin).equalTo(record::getTimebegin)
                .set(timeend).equalTo(record::getTimeend);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.435+08:00", comments="Source Table: InOutPermition")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Inoutpermition record) {
        return UpdateDSL.updateWithMapper(this::update, inoutpermition)
                .set(ctrlnumbers).equalToWhenPresent(record::getCtrlnumbers)
                .set(cardtypes).equalToWhenPresent(record::getCardtypes)
                .set(weekdays).equalToWhenPresent(record::getWeekdays)
                .set(timebegin).equalToWhenPresent(record::getTimebegin)
                .set(timeend).equalToWhenPresent(record::getTimeend);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.435+08:00", comments="Source Table: InOutPermition")
    default int updateByPrimaryKey(Inoutpermition record) {
        return UpdateDSL.updateWithMapper(this::update, inoutpermition)
                .set(ctrlnumbers).equalTo(record::getCtrlnumbers)
                .set(cardtypes).equalTo(record::getCardtypes)
                .set(weekdays).equalTo(record::getWeekdays)
                .set(timebegin).equalTo(record::getTimebegin)
                .set(timeend).equalTo(record::getTimeend)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.435+08:00", comments="Source Table: InOutPermition")
    default int updateByPrimaryKeySelective(Inoutpermition record) {
        return UpdateDSL.updateWithMapper(this::update, inoutpermition)
                .set(ctrlnumbers).equalToWhenPresent(record::getCtrlnumbers)
                .set(cardtypes).equalToWhenPresent(record::getCardtypes)
                .set(weekdays).equalToWhenPresent(record::getWeekdays)
                .set(timebegin).equalToWhenPresent(record::getTimebegin)
                .set(timeend).equalToWhenPresent(record::getTimeend)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}