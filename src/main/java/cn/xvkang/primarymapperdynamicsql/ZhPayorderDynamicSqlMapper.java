package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.ZhPayorderDynamicSqlSupport.*;

import cn.xvkang.primaryentity.ZhPayorder;
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
public interface ZhPayorderDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.983+08:00", comments="Source Table: zh_PayOrder")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.983+08:00", comments="Source Table: zh_PayOrder")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.983+08:00", comments="Source Table: zh_PayOrder")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<ZhPayorder> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.983+08:00", comments="Source Table: zh_PayOrder")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ZhPayorderResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER),
        @Result(column="payOrderNo", property="payorderno", jdbcType=JdbcType.VARCHAR),
        @Result(column="orderNo", property="orderno", jdbcType=JdbcType.VARCHAR),
        @Result(column="carNo", property="carno", jdbcType=JdbcType.VARCHAR),
        @Result(column="carType", property="cartype", jdbcType=JdbcType.VARCHAR),
        @Result(column="payTime", property="paytime", jdbcType=JdbcType.VARCHAR),
        @Result(column="payMoney", property="paymoney", jdbcType=JdbcType.DECIMAL),
        @Result(column="payType", property="paytype", jdbcType=JdbcType.VARCHAR),
        @Result(column="enterTime", property="entertime", jdbcType=JdbcType.VARCHAR),
        @Result(column="synflag", property="synflag", jdbcType=JdbcType.INTEGER)
    })
    List<ZhPayorder> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.983+08:00", comments="Source Table: zh_PayOrder")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.983+08:00", comments="Source Table: zh_PayOrder")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(zhPayorder);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.983+08:00", comments="Source Table: zh_PayOrder")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, zhPayorder);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.983+08:00", comments="Source Table: zh_PayOrder")
    default int insert(ZhPayorder record) {
        return insert(SqlBuilder.insert(record)
                .into(zhPayorder)
                .map(payorderno).toProperty("payorderno")
                .map(orderno).toProperty("orderno")
                .map(carno).toProperty("carno")
                .map(cartype).toProperty("cartype")
                .map(paytime).toProperty("paytime")
                .map(paymoney).toProperty("paymoney")
                .map(paytype).toProperty("paytype")
                .map(entertime).toProperty("entertime")
                .map(synflag).toProperty("synflag")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.983+08:00", comments="Source Table: zh_PayOrder")
    default int insertSelective(ZhPayorder record) {
        return insert(SqlBuilder.insert(record)
                .into(zhPayorder)
                .map(payorderno).toPropertyWhenPresent("payorderno", record::getPayorderno)
                .map(orderno).toPropertyWhenPresent("orderno", record::getOrderno)
                .map(carno).toPropertyWhenPresent("carno", record::getCarno)
                .map(cartype).toPropertyWhenPresent("cartype", record::getCartype)
                .map(paytime).toPropertyWhenPresent("paytime", record::getPaytime)
                .map(paymoney).toPropertyWhenPresent("paymoney", record::getPaymoney)
                .map(paytype).toPropertyWhenPresent("paytype", record::getPaytype)
                .map(entertime).toPropertyWhenPresent("entertime", record::getEntertime)
                .map(synflag).toPropertyWhenPresent("synflag", record::getSynflag)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.983+08:00", comments="Source Table: zh_PayOrder")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ZhPayorder>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, payorderno, orderno, carno, cartype, paytime, paymoney, paytype, entertime, synflag)
                .from(zhPayorder);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.983+08:00", comments="Source Table: zh_PayOrder")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ZhPayorder>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, payorderno, orderno, carno, cartype, paytime, paymoney, paytype, entertime, synflag)
                .from(zhPayorder);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.983+08:00", comments="Source Table: zh_PayOrder")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(ZhPayorder record) {
        return UpdateDSL.updateWithMapper(this::update, zhPayorder)
                .set(payorderno).equalTo(record::getPayorderno)
                .set(orderno).equalTo(record::getOrderno)
                .set(carno).equalTo(record::getCarno)
                .set(cartype).equalTo(record::getCartype)
                .set(paytime).equalTo(record::getPaytime)
                .set(paymoney).equalTo(record::getPaymoney)
                .set(paytype).equalTo(record::getPaytype)
                .set(entertime).equalTo(record::getEntertime)
                .set(synflag).equalTo(record::getSynflag);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.983+08:00", comments="Source Table: zh_PayOrder")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(ZhPayorder record) {
        return UpdateDSL.updateWithMapper(this::update, zhPayorder)
                .set(payorderno).equalToWhenPresent(record::getPayorderno)
                .set(orderno).equalToWhenPresent(record::getOrderno)
                .set(carno).equalToWhenPresent(record::getCarno)
                .set(cartype).equalToWhenPresent(record::getCartype)
                .set(paytime).equalToWhenPresent(record::getPaytime)
                .set(paymoney).equalToWhenPresent(record::getPaymoney)
                .set(paytype).equalToWhenPresent(record::getPaytype)
                .set(entertime).equalToWhenPresent(record::getEntertime)
                .set(synflag).equalToWhenPresent(record::getSynflag);
    }
}