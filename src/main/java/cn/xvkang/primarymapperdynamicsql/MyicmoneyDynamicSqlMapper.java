package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MyicmoneyDynamicSqlSupport.*;

import cn.xvkang.primaryentity.Myicmoney;
import java.util.List;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
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
public interface MyicmoneyDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.769+08:00", comments="Source Table: MYICMONEY")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.769+08:00", comments="Source Table: MYICMONEY")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.769+08:00", comments="Source Table: MYICMONEY")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<Myicmoney> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.769+08:00", comments="Source Table: MYICMONEY")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MyicmoneyResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER),
        @Result(column="CardNO", property="cardno", jdbcType=JdbcType.VARCHAR),
        @Result(column="OptDate", property="optdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="SFJE", property="sfje", jdbcType=JdbcType.DECIMAL),
        @Result(column="Balance", property="balance", jdbcType=JdbcType.DECIMAL),
        @Result(column="OperatorCardNO", property="operatorcardno", jdbcType=JdbcType.VARCHAR),
        @Result(column="OptType", property="opttype", jdbcType=JdbcType.VARCHAR),
        @Result(column="NewStartDate", property="newstartdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="NewEndDate", property="newenddate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LastEndDate", property="lastenddate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="Remark", property="remark", jdbcType=JdbcType.VARCHAR)
    })
    List<Myicmoney> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.769+08:00", comments="Source Table: MYICMONEY")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.769+08:00", comments="Source Table: MYICMONEY")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(myicmoney);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.769+08:00", comments="Source Table: MYICMONEY")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, myicmoney);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.769+08:00", comments="Source Table: MYICMONEY")
    default int insert(Myicmoney record) {
        return insert(SqlBuilder.insert(record)
                .into(myicmoney)
                .map(cardno).toProperty("cardno")
                .map(optdate).toProperty("optdate")
                .map(sfje).toProperty("sfje")
                .map(balance).toProperty("balance")
                .map(operatorcardno).toProperty("operatorcardno")
                .map(opttype).toProperty("opttype")
                .map(newstartdate).toProperty("newstartdate")
                .map(newenddate).toProperty("newenddate")
                .map(lastenddate).toProperty("lastenddate")
                .map(remark).toProperty("remark")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.769+08:00", comments="Source Table: MYICMONEY")
    default int insertSelective(Myicmoney record) {
        return insert(SqlBuilder.insert(record)
                .into(myicmoney)
                .map(cardno).toPropertyWhenPresent("cardno", record::getCardno)
                .map(optdate).toPropertyWhenPresent("optdate", record::getOptdate)
                .map(sfje).toPropertyWhenPresent("sfje", record::getSfje)
                .map(balance).toPropertyWhenPresent("balance", record::getBalance)
                .map(operatorcardno).toPropertyWhenPresent("operatorcardno", record::getOperatorcardno)
                .map(opttype).toPropertyWhenPresent("opttype", record::getOpttype)
                .map(newstartdate).toPropertyWhenPresent("newstartdate", record::getNewstartdate)
                .map(newenddate).toPropertyWhenPresent("newenddate", record::getNewenddate)
                .map(lastenddate).toPropertyWhenPresent("lastenddate", record::getLastenddate)
                .map(remark).toPropertyWhenPresent("remark", record::getRemark)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.769+08:00", comments="Source Table: MYICMONEY")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myicmoney>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, cardno, optdate, sfje, balance, operatorcardno, opttype, newstartdate, newenddate, lastenddate, remark)
                .from(myicmoney);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.769+08:00", comments="Source Table: MYICMONEY")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myicmoney>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, cardno, optdate, sfje, balance, operatorcardno, opttype, newstartdate, newenddate, lastenddate, remark)
                .from(myicmoney);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.769+08:00", comments="Source Table: MYICMONEY")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Myicmoney record) {
        return UpdateDSL.updateWithMapper(this::update, myicmoney)
                .set(cardno).equalTo(record::getCardno)
                .set(optdate).equalTo(record::getOptdate)
                .set(sfje).equalTo(record::getSfje)
                .set(balance).equalTo(record::getBalance)
                .set(operatorcardno).equalTo(record::getOperatorcardno)
                .set(opttype).equalTo(record::getOpttype)
                .set(newstartdate).equalTo(record::getNewstartdate)
                .set(newenddate).equalTo(record::getNewenddate)
                .set(lastenddate).equalTo(record::getLastenddate)
                .set(remark).equalTo(record::getRemark);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.769+08:00", comments="Source Table: MYICMONEY")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Myicmoney record) {
        return UpdateDSL.updateWithMapper(this::update, myicmoney)
                .set(cardno).equalToWhenPresent(record::getCardno)
                .set(optdate).equalToWhenPresent(record::getOptdate)
                .set(sfje).equalToWhenPresent(record::getSfje)
                .set(balance).equalToWhenPresent(record::getBalance)
                .set(operatorcardno).equalToWhenPresent(record::getOperatorcardno)
                .set(opttype).equalToWhenPresent(record::getOpttype)
                .set(newstartdate).equalToWhenPresent(record::getNewstartdate)
                .set(newenddate).equalToWhenPresent(record::getNewenddate)
                .set(lastenddate).equalToWhenPresent(record::getLastenddate)
                .set(remark).equalToWhenPresent(record::getRemark);
    }
}