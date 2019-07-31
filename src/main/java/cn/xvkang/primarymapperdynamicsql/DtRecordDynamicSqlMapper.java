package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.DtRecordDynamicSqlSupport.*;

import cn.xvkang.primaryentity.DtRecord;
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
public interface DtRecordDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.903+08:00", comments="Source Table: Dt_Record")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.903+08:00", comments="Source Table: Dt_Record")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.903+08:00", comments="Source Table: Dt_Record")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<DtRecord> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.903+08:00", comments="Source Table: Dt_Record")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="DtRecordResult", value = {
        @Result(column="CardNo", property="cardno", jdbcType=JdbcType.VARCHAR),
        @Result(column="CardFlag", property="cardflag", jdbcType=JdbcType.VARCHAR),
        @Result(column="OpenTime", property="opentime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="DevcNo", property="devcno", jdbcType=JdbcType.INTEGER),
        @Result(column="Foorflag", property="foorflag", jdbcType=JdbcType.VARCHAR),
        @Result(column="Eventss", property="eventss", jdbcType=JdbcType.VARCHAR)
    })
    List<DtRecord> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.903+08:00", comments="Source Table: Dt_Record")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.903+08:00", comments="Source Table: Dt_Record")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(dtRecord);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.903+08:00", comments="Source Table: Dt_Record")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, dtRecord);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.903+08:00", comments="Source Table: Dt_Record")
    default int insert(DtRecord record) {
        return insert(SqlBuilder.insert(record)
                .into(dtRecord)
                .map(cardno).toProperty("cardno")
                .map(cardflag).toProperty("cardflag")
                .map(opentime).toProperty("opentime")
                .map(devcno).toProperty("devcno")
                .map(foorflag).toProperty("foorflag")
                .map(eventss).toProperty("eventss")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.903+08:00", comments="Source Table: Dt_Record")
    default int insertSelective(DtRecord record) {
        return insert(SqlBuilder.insert(record)
                .into(dtRecord)
                .map(cardno).toPropertyWhenPresent("cardno", record::getCardno)
                .map(cardflag).toPropertyWhenPresent("cardflag", record::getCardflag)
                .map(opentime).toPropertyWhenPresent("opentime", record::getOpentime)
                .map(devcno).toPropertyWhenPresent("devcno", record::getDevcno)
                .map(foorflag).toPropertyWhenPresent("foorflag", record::getFoorflag)
                .map(eventss).toPropertyWhenPresent("eventss", record::getEventss)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.903+08:00", comments="Source Table: Dt_Record")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<DtRecord>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, cardno, cardflag, opentime, devcno, foorflag, eventss)
                .from(dtRecord);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.903+08:00", comments="Source Table: Dt_Record")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<DtRecord>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, cardno, cardflag, opentime, devcno, foorflag, eventss)
                .from(dtRecord);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.904+08:00", comments="Source Table: Dt_Record")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(DtRecord record) {
        return UpdateDSL.updateWithMapper(this::update, dtRecord)
                .set(cardno).equalTo(record::getCardno)
                .set(cardflag).equalTo(record::getCardflag)
                .set(opentime).equalTo(record::getOpentime)
                .set(devcno).equalTo(record::getDevcno)
                .set(foorflag).equalTo(record::getFoorflag)
                .set(eventss).equalTo(record::getEventss);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.904+08:00", comments="Source Table: Dt_Record")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(DtRecord record) {
        return UpdateDSL.updateWithMapper(this::update, dtRecord)
                .set(cardno).equalToWhenPresent(record::getCardno)
                .set(cardflag).equalToWhenPresent(record::getCardflag)
                .set(opentime).equalToWhenPresent(record::getOpentime)
                .set(devcno).equalToWhenPresent(record::getDevcno)
                .set(foorflag).equalToWhenPresent(record::getFoorflag)
                .set(eventss).equalToWhenPresent(record::getEventss);
    }
}