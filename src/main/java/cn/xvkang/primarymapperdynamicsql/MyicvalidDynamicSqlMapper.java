package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MyicvalidDynamicSqlSupport.*;

import cn.xvkang.primaryentity.Myicvalid;
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
public interface MyicvalidDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.277+08:00", comments="Source Table: MYICVALID")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.277+08:00", comments="Source Table: MYICVALID")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.277+08:00", comments="Source Table: MYICVALID")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Myicvalid> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.277+08:00", comments="Source Table: MYICVALID")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MyicvalidResult", value = {
        @Result(column="CardNO", property="cardno", jdbcType=JdbcType.VARCHAR),
        @Result(column="OptDate", property="optdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="NewStartDate", property="newstartdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="NewEndDate", property="newenddate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="NewEachDayStartTime", property="neweachdaystarttime", jdbcType=JdbcType.CHAR),
        @Result(column="NewEachDayEndTime", property="neweachdayendtime", jdbcType=JdbcType.CHAR),
        @Result(column="ValidMachineID", property="validmachineid", jdbcType=JdbcType.CHAR),
        @Result(column="OperatorCardNO", property="operatorcardno", jdbcType=JdbcType.VARCHAR),
        @Result(column="OptType", property="opttype", jdbcType=JdbcType.VARCHAR)
    })
    List<Myicvalid> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.278+08:00", comments="Source Table: MYICVALID")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.278+08:00", comments="Source Table: MYICVALID")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(myicvalid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.278+08:00", comments="Source Table: MYICVALID")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, myicvalid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.278+08:00", comments="Source Table: MYICVALID")
    default int insert(Myicvalid record) {
        return insert(SqlBuilder.insert(record)
                .into(myicvalid)
                .map(cardno).toProperty("cardno")
                .map(optdate).toProperty("optdate")
                .map(newstartdate).toProperty("newstartdate")
                .map(newenddate).toProperty("newenddate")
                .map(neweachdaystarttime).toProperty("neweachdaystarttime")
                .map(neweachdayendtime).toProperty("neweachdayendtime")
                .map(validmachineid).toProperty("validmachineid")
                .map(operatorcardno).toProperty("operatorcardno")
                .map(opttype).toProperty("opttype")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.278+08:00", comments="Source Table: MYICVALID")
    default int insertSelective(Myicvalid record) {
        return insert(SqlBuilder.insert(record)
                .into(myicvalid)
                .map(cardno).toPropertyWhenPresent("cardno", record::getCardno)
                .map(optdate).toPropertyWhenPresent("optdate", record::getOptdate)
                .map(newstartdate).toPropertyWhenPresent("newstartdate", record::getNewstartdate)
                .map(newenddate).toPropertyWhenPresent("newenddate", record::getNewenddate)
                .map(neweachdaystarttime).toPropertyWhenPresent("neweachdaystarttime", record::getNeweachdaystarttime)
                .map(neweachdayendtime).toPropertyWhenPresent("neweachdayendtime", record::getNeweachdayendtime)
                .map(validmachineid).toPropertyWhenPresent("validmachineid", record::getValidmachineid)
                .map(operatorcardno).toPropertyWhenPresent("operatorcardno", record::getOperatorcardno)
                .map(opttype).toPropertyWhenPresent("opttype", record::getOpttype)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.278+08:00", comments="Source Table: MYICVALID")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myicvalid>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, cardno, optdate, newstartdate, newenddate, neweachdaystarttime, neweachdayendtime, validmachineid, operatorcardno, opttype)
                .from(myicvalid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.278+08:00", comments="Source Table: MYICVALID")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myicvalid>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, cardno, optdate, newstartdate, newenddate, neweachdaystarttime, neweachdayendtime, validmachineid, operatorcardno, opttype)
                .from(myicvalid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.278+08:00", comments="Source Table: MYICVALID")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Myicvalid record) {
        return UpdateDSL.updateWithMapper(this::update, myicvalid)
                .set(cardno).equalTo(record::getCardno)
                .set(optdate).equalTo(record::getOptdate)
                .set(newstartdate).equalTo(record::getNewstartdate)
                .set(newenddate).equalTo(record::getNewenddate)
                .set(neweachdaystarttime).equalTo(record::getNeweachdaystarttime)
                .set(neweachdayendtime).equalTo(record::getNeweachdayendtime)
                .set(validmachineid).equalTo(record::getValidmachineid)
                .set(operatorcardno).equalTo(record::getOperatorcardno)
                .set(opttype).equalTo(record::getOpttype);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.278+08:00", comments="Source Table: MYICVALID")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Myicvalid record) {
        return UpdateDSL.updateWithMapper(this::update, myicvalid)
                .set(cardno).equalToWhenPresent(record::getCardno)
                .set(optdate).equalToWhenPresent(record::getOptdate)
                .set(newstartdate).equalToWhenPresent(record::getNewstartdate)
                .set(newenddate).equalToWhenPresent(record::getNewenddate)
                .set(neweachdaystarttime).equalToWhenPresent(record::getNeweachdaystarttime)
                .set(neweachdayendtime).equalToWhenPresent(record::getNeweachdayendtime)
                .set(validmachineid).equalToWhenPresent(record::getValidmachineid)
                .set(operatorcardno).equalToWhenPresent(record::getOperatorcardno)
                .set(opttype).equalToWhenPresent(record::getOpttype);
    }
}