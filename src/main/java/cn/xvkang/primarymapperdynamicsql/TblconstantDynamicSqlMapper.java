package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.TblconstantDynamicSqlSupport.*;

import cn.xvkang.primaryentity.Tblconstant;
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
public interface TblconstantDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.885+08:00", comments="Source Table: tblConstant")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.885+08:00", comments="Source Table: tblConstant")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.885+08:00", comments="Source Table: tblConstant")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Tblconstant> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.885+08:00", comments="Source Table: tblConstant")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="TblconstantResult", value = {
        @Result(column="Types", property="types", jdbcType=JdbcType.VARCHAR),
        @Result(column="OrderNO", property="orderno", jdbcType=JdbcType.SMALLINT),
        @Result(column="Keys", property="keys", jdbcType=JdbcType.VARCHAR),
        @Result(column="Value", property="value", jdbcType=JdbcType.VARCHAR),
        @Result(column="Flag", property="flag", jdbcType=JdbcType.TINYINT)
    })
    List<Tblconstant> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.885+08:00", comments="Source Table: tblConstant")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.885+08:00", comments="Source Table: tblConstant")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(tblconstant);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.886+08:00", comments="Source Table: tblConstant")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, tblconstant);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.886+08:00", comments="Source Table: tblConstant")
    default int insert(Tblconstant record) {
        return insert(SqlBuilder.insert(record)
                .into(tblconstant)
                .map(types).toProperty("types")
                .map(orderno).toProperty("orderno")
                .map(keys).toProperty("keys")
                .map(value).toProperty("value")
                .map(flag).toProperty("flag")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.886+08:00", comments="Source Table: tblConstant")
    default int insertSelective(Tblconstant record) {
        return insert(SqlBuilder.insert(record)
                .into(tblconstant)
                .map(types).toPropertyWhenPresent("types", record::getTypes)
                .map(orderno).toPropertyWhenPresent("orderno", record::getOrderno)
                .map(keys).toPropertyWhenPresent("keys", record::getKeys)
                .map(value).toPropertyWhenPresent("value", record::getValue)
                .map(flag).toPropertyWhenPresent("flag", record::getFlag)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.886+08:00", comments="Source Table: tblConstant")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Tblconstant>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, types, orderno, keys, value, flag)
                .from(tblconstant);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.886+08:00", comments="Source Table: tblConstant")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Tblconstant>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, types, orderno, keys, value, flag)
                .from(tblconstant);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.886+08:00", comments="Source Table: tblConstant")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Tblconstant record) {
        return UpdateDSL.updateWithMapper(this::update, tblconstant)
                .set(types).equalTo(record::getTypes)
                .set(orderno).equalTo(record::getOrderno)
                .set(keys).equalTo(record::getKeys)
                .set(value).equalTo(record::getValue)
                .set(flag).equalTo(record::getFlag);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.886+08:00", comments="Source Table: tblConstant")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Tblconstant record) {
        return UpdateDSL.updateWithMapper(this::update, tblconstant)
                .set(types).equalToWhenPresent(record::getTypes)
                .set(orderno).equalToWhenPresent(record::getOrderno)
                .set(keys).equalToWhenPresent(record::getKeys)
                .set(value).equalToWhenPresent(record::getValue)
                .set(flag).equalToWhenPresent(record::getFlag);
    }
}