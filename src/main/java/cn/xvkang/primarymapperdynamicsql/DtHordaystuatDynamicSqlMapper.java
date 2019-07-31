package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.DtHordaystuatDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.DtHordaystuat;
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
public interface DtHordaystuatDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.895+08:00", comments="Source Table: Dt_HordayStuat")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.895+08:00", comments="Source Table: Dt_HordayStuat")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.895+08:00", comments="Source Table: Dt_HordayStuat")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<DtHordaystuat> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.895+08:00", comments="Source Table: Dt_HordayStuat")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("DtHordaystuatResult")
    DtHordaystuat selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.895+08:00", comments="Source Table: Dt_HordayStuat")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="DtHordaystuatResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="DevcNum", property="devcnum", jdbcType=JdbcType.INTEGER),
        @Result(column="FoorInfo", property="foorinfo", jdbcType=JdbcType.VARCHAR)
    })
    List<DtHordaystuat> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.895+08:00", comments="Source Table: Dt_HordayStuat")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.895+08:00", comments="Source Table: Dt_HordayStuat")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(dtHordaystuat);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.895+08:00", comments="Source Table: Dt_HordayStuat")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, dtHordaystuat);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.895+08:00", comments="Source Table: Dt_HordayStuat")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, dtHordaystuat)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.895+08:00", comments="Source Table: Dt_HordayStuat")
    default int insert(DtHordaystuat record) {
        return insert(SqlBuilder.insert(record)
                .into(dtHordaystuat)
                .map(devcnum).toProperty("devcnum")
                .map(foorinfo).toProperty("foorinfo")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.895+08:00", comments="Source Table: Dt_HordayStuat")
    default int insertSelective(DtHordaystuat record) {
        return insert(SqlBuilder.insert(record)
                .into(dtHordaystuat)
                .map(devcnum).toPropertyWhenPresent("devcnum", record::getDevcnum)
                .map(foorinfo).toPropertyWhenPresent("foorinfo", record::getFoorinfo)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.895+08:00", comments="Source Table: Dt_HordayStuat")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<DtHordaystuat>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, devcnum, foorinfo)
                .from(dtHordaystuat);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.895+08:00", comments="Source Table: Dt_HordayStuat")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<DtHordaystuat>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, devcnum, foorinfo)
                .from(dtHordaystuat);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.895+08:00", comments="Source Table: Dt_HordayStuat")
    default DtHordaystuat selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, devcnum, foorinfo)
                .from(dtHordaystuat)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.895+08:00", comments="Source Table: Dt_HordayStuat")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(DtHordaystuat record) {
        return UpdateDSL.updateWithMapper(this::update, dtHordaystuat)
                .set(devcnum).equalTo(record::getDevcnum)
                .set(foorinfo).equalTo(record::getFoorinfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.895+08:00", comments="Source Table: Dt_HordayStuat")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(DtHordaystuat record) {
        return UpdateDSL.updateWithMapper(this::update, dtHordaystuat)
                .set(devcnum).equalToWhenPresent(record::getDevcnum)
                .set(foorinfo).equalToWhenPresent(record::getFoorinfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.895+08:00", comments="Source Table: Dt_HordayStuat")
    default int updateByPrimaryKey(DtHordaystuat record) {
        return UpdateDSL.updateWithMapper(this::update, dtHordaystuat)
                .set(devcnum).equalTo(record::getDevcnum)
                .set(foorinfo).equalTo(record::getFoorinfo)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.896+08:00", comments="Source Table: Dt_HordayStuat")
    default int updateByPrimaryKeySelective(DtHordaystuat record) {
        return UpdateDSL.updateWithMapper(this::update, dtHordaystuat)
                .set(devcnum).equalToWhenPresent(record::getDevcnum)
                .set(foorinfo).equalToWhenPresent(record::getFoorinfo)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}