package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.ZhReservecarDynamicSqlSupport.*;

import cn.xvkang.primaryentity.ZhReservecar;
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
public interface ZhReservecarDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.224+08:00", comments="Source Table: zh_ReserveCar")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.224+08:00", comments="Source Table: zh_ReserveCar")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.224+08:00", comments="Source Table: zh_ReserveCar")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<ZhReservecar> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.224+08:00", comments="Source Table: zh_ReserveCar")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ZhReservecarResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER),
        @Result(column="orderNo", property="orderno", jdbcType=JdbcType.VARCHAR),
        @Result(column="carNo", property="carno", jdbcType=JdbcType.VARCHAR),
        @Result(column="expirationTime", property="expirationtime", jdbcType=JdbcType.VARCHAR),
        @Result(column="stuat", property="stuat", jdbcType=JdbcType.INTEGER),
        @Result(column="alterTime", property="altertime", jdbcType=JdbcType.VARCHAR)
    })
    List<ZhReservecar> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.224+08:00", comments="Source Table: zh_ReserveCar")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.224+08:00", comments="Source Table: zh_ReserveCar")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(zhReservecar);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.224+08:00", comments="Source Table: zh_ReserveCar")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, zhReservecar);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.224+08:00", comments="Source Table: zh_ReserveCar")
    default int insert(ZhReservecar record) {
        return insert(SqlBuilder.insert(record)
                .into(zhReservecar)
                .map(orderno).toProperty("orderno")
                .map(carno).toProperty("carno")
                .map(expirationtime).toProperty("expirationtime")
                .map(stuat).toProperty("stuat")
                .map(altertime).toProperty("altertime")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.224+08:00", comments="Source Table: zh_ReserveCar")
    default int insertSelective(ZhReservecar record) {
        return insert(SqlBuilder.insert(record)
                .into(zhReservecar)
                .map(orderno).toPropertyWhenPresent("orderno", record::getOrderno)
                .map(carno).toPropertyWhenPresent("carno", record::getCarno)
                .map(expirationtime).toPropertyWhenPresent("expirationtime", record::getExpirationtime)
                .map(stuat).toPropertyWhenPresent("stuat", record::getStuat)
                .map(altertime).toPropertyWhenPresent("altertime", record::getAltertime)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.224+08:00", comments="Source Table: zh_ReserveCar")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ZhReservecar>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, orderno, carno, expirationtime, stuat, altertime)
                .from(zhReservecar);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.224+08:00", comments="Source Table: zh_ReserveCar")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ZhReservecar>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, orderno, carno, expirationtime, stuat, altertime)
                .from(zhReservecar);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.224+08:00", comments="Source Table: zh_ReserveCar")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(ZhReservecar record) {
        return UpdateDSL.updateWithMapper(this::update, zhReservecar)
                .set(orderno).equalTo(record::getOrderno)
                .set(carno).equalTo(record::getCarno)
                .set(expirationtime).equalTo(record::getExpirationtime)
                .set(stuat).equalTo(record::getStuat)
                .set(altertime).equalTo(record::getAltertime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.224+08:00", comments="Source Table: zh_ReserveCar")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(ZhReservecar record) {
        return UpdateDSL.updateWithMapper(this::update, zhReservecar)
                .set(orderno).equalToWhenPresent(record::getOrderno)
                .set(carno).equalToWhenPresent(record::getCarno)
                .set(expirationtime).equalToWhenPresent(record::getExpirationtime)
                .set(stuat).equalToWhenPresent(record::getStuat)
                .set(altertime).equalToWhenPresent(record::getAltertime);
    }
}