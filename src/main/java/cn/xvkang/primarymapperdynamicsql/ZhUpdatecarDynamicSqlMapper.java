package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.ZhUpdatecarDynamicSqlSupport.*;

import cn.xvkang.primaryentity.ZhUpdatecar;
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
public interface ZhUpdatecarDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.987+08:00", comments="Source Table: zh_UpdateCar")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.987+08:00", comments="Source Table: zh_UpdateCar")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.987+08:00", comments="Source Table: zh_UpdateCar")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<ZhUpdatecar> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.987+08:00", comments="Source Table: zh_UpdateCar")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ZhUpdatecarResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER),
        @Result(column="orderNo", property="orderno", jdbcType=JdbcType.VARCHAR),
        @Result(column="carNo", property="carno", jdbcType=JdbcType.VARCHAR),
        @Result(column="synflag", property="synflag", jdbcType=JdbcType.INTEGER)
    })
    List<ZhUpdatecar> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.987+08:00", comments="Source Table: zh_UpdateCar")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.987+08:00", comments="Source Table: zh_UpdateCar")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(zhUpdatecar);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.987+08:00", comments="Source Table: zh_UpdateCar")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, zhUpdatecar);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.987+08:00", comments="Source Table: zh_UpdateCar")
    default int insert(ZhUpdatecar record) {
        return insert(SqlBuilder.insert(record)
                .into(zhUpdatecar)
                .map(orderno).toProperty("orderno")
                .map(carno).toProperty("carno")
                .map(synflag).toProperty("synflag")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.987+08:00", comments="Source Table: zh_UpdateCar")
    default int insertSelective(ZhUpdatecar record) {
        return insert(SqlBuilder.insert(record)
                .into(zhUpdatecar)
                .map(orderno).toPropertyWhenPresent("orderno", record::getOrderno)
                .map(carno).toPropertyWhenPresent("carno", record::getCarno)
                .map(synflag).toPropertyWhenPresent("synflag", record::getSynflag)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.987+08:00", comments="Source Table: zh_UpdateCar")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ZhUpdatecar>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, orderno, carno, synflag)
                .from(zhUpdatecar);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.987+08:00", comments="Source Table: zh_UpdateCar")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ZhUpdatecar>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, orderno, carno, synflag)
                .from(zhUpdatecar);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.987+08:00", comments="Source Table: zh_UpdateCar")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(ZhUpdatecar record) {
        return UpdateDSL.updateWithMapper(this::update, zhUpdatecar)
                .set(orderno).equalTo(record::getOrderno)
                .set(carno).equalTo(record::getCarno)
                .set(synflag).equalTo(record::getSynflag);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.987+08:00", comments="Source Table: zh_UpdateCar")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(ZhUpdatecar record) {
        return UpdateDSL.updateWithMapper(this::update, zhUpdatecar)
                .set(orderno).equalToWhenPresent(record::getOrderno)
                .set(carno).equalToWhenPresent(record::getCarno)
                .set(synflag).equalToWhenPresent(record::getSynflag);
    }
}