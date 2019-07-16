package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.ZhMthcarchargeDynamicSqlSupport.*;

import cn.xvkang.primaryentity.ZhMthcarcharge;
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
public interface ZhMthcarchargeDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.979+08:00", comments="Source Table: zh_MthCarCharge")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.979+08:00", comments="Source Table: zh_MthCarCharge")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.979+08:00", comments="Source Table: zh_MthCarCharge")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<ZhMthcarcharge> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.979+08:00", comments="Source Table: zh_MthCarCharge")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ZhMthcarchargeResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER),
        @Result(column="carNo", property="carno", jdbcType=JdbcType.VARCHAR),
        @Result(column="beginTime", property="begintime", jdbcType=JdbcType.VARCHAR),
        @Result(column="endTime", property="endtime", jdbcType=JdbcType.VARCHAR),
        @Result(column="chargeTime", property="chargetime", jdbcType=JdbcType.VARCHAR),
        @Result(column="chargeMoney", property="chargemoney", jdbcType=JdbcType.DECIMAL),
        @Result(column="synflag", property="synflag", jdbcType=JdbcType.INTEGER)
    })
    List<ZhMthcarcharge> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.979+08:00", comments="Source Table: zh_MthCarCharge")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.979+08:00", comments="Source Table: zh_MthCarCharge")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(zhMthcarcharge);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.979+08:00", comments="Source Table: zh_MthCarCharge")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, zhMthcarcharge);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.979+08:00", comments="Source Table: zh_MthCarCharge")
    default int insert(ZhMthcarcharge record) {
        return insert(SqlBuilder.insert(record)
                .into(zhMthcarcharge)
                .map(carno).toProperty("carno")
                .map(begintime).toProperty("begintime")
                .map(endtime).toProperty("endtime")
                .map(chargetime).toProperty("chargetime")
                .map(chargemoney).toProperty("chargemoney")
                .map(synflag).toProperty("synflag")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.979+08:00", comments="Source Table: zh_MthCarCharge")
    default int insertSelective(ZhMthcarcharge record) {
        return insert(SqlBuilder.insert(record)
                .into(zhMthcarcharge)
                .map(carno).toPropertyWhenPresent("carno", record::getCarno)
                .map(begintime).toPropertyWhenPresent("begintime", record::getBegintime)
                .map(endtime).toPropertyWhenPresent("endtime", record::getEndtime)
                .map(chargetime).toPropertyWhenPresent("chargetime", record::getChargetime)
                .map(chargemoney).toPropertyWhenPresent("chargemoney", record::getChargemoney)
                .map(synflag).toPropertyWhenPresent("synflag", record::getSynflag)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.979+08:00", comments="Source Table: zh_MthCarCharge")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ZhMthcarcharge>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, carno, begintime, endtime, chargetime, chargemoney, synflag)
                .from(zhMthcarcharge);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.979+08:00", comments="Source Table: zh_MthCarCharge")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ZhMthcarcharge>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, carno, begintime, endtime, chargetime, chargemoney, synflag)
                .from(zhMthcarcharge);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.979+08:00", comments="Source Table: zh_MthCarCharge")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(ZhMthcarcharge record) {
        return UpdateDSL.updateWithMapper(this::update, zhMthcarcharge)
                .set(carno).equalTo(record::getCarno)
                .set(begintime).equalTo(record::getBegintime)
                .set(endtime).equalTo(record::getEndtime)
                .set(chargetime).equalTo(record::getChargetime)
                .set(chargemoney).equalTo(record::getChargemoney)
                .set(synflag).equalTo(record::getSynflag);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.979+08:00", comments="Source Table: zh_MthCarCharge")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(ZhMthcarcharge record) {
        return UpdateDSL.updateWithMapper(this::update, zhMthcarcharge)
                .set(carno).equalToWhenPresent(record::getCarno)
                .set(begintime).equalToWhenPresent(record::getBegintime)
                .set(endtime).equalToWhenPresent(record::getEndtime)
                .set(chargetime).equalToWhenPresent(record::getChargetime)
                .set(chargemoney).equalToWhenPresent(record::getChargemoney)
                .set(synflag).equalToWhenPresent(record::getSynflag);
    }
}