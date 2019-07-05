package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.TblqueryDynamicSqlSupport.*;

import cn.xvkang.primaryentity.Tblquery;
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
public interface TblqueryDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.877+08:00", comments="Source Table: tblQuery")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.877+08:00", comments="Source Table: tblQuery")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.877+08:00", comments="Source Table: tblQuery")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Tblquery> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.877+08:00", comments="Source Table: tblQuery")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="TblqueryResult", value = {
        @Result(column="Window", property="window", jdbcType=JdbcType.VARCHAR),
        @Result(column="SaveName", property="savename", jdbcType=JdbcType.VARCHAR),
        @Result(column="ShowField_CN", property="showfieldCn", jdbcType=JdbcType.VARCHAR),
        @Result(column="ShowField_EN", property="showfieldEn", jdbcType=JdbcType.VARCHAR),
        @Result(column="RealField", property="realfield", jdbcType=JdbcType.VARCHAR),
        @Result(column="OP", property="op", jdbcType=JdbcType.VARCHAR),
        @Result(column="SearchValue", property="searchvalue", jdbcType=JdbcType.VARCHAR),
        @Result(column="DataType", property="datatype", jdbcType=JdbcType.VARCHAR),
        @Result(column="Selected", property="selected", jdbcType=JdbcType.TINYINT),
        @Result(column="CurrentShow", property="currentshow", jdbcType=JdbcType.TINYINT)
    })
    List<Tblquery> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.877+08:00", comments="Source Table: tblQuery")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.877+08:00", comments="Source Table: tblQuery")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(tblquery);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.877+08:00", comments="Source Table: tblQuery")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, tblquery);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.877+08:00", comments="Source Table: tblQuery")
    default int insert(Tblquery record) {
        return insert(SqlBuilder.insert(record)
                .into(tblquery)
                .map(window).toProperty("window")
                .map(savename).toProperty("savename")
                .map(showfieldCn).toProperty("showfieldCn")
                .map(showfieldEn).toProperty("showfieldEn")
                .map(realfield).toProperty("realfield")
                .map(op).toProperty("op")
                .map(searchvalue).toProperty("searchvalue")
                .map(datatype).toProperty("datatype")
                .map(selected).toProperty("selected")
                .map(currentshow).toProperty("currentshow")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.877+08:00", comments="Source Table: tblQuery")
    default int insertSelective(Tblquery record) {
        return insert(SqlBuilder.insert(record)
                .into(tblquery)
                .map(window).toPropertyWhenPresent("window", record::getWindow)
                .map(savename).toPropertyWhenPresent("savename", record::getSavename)
                .map(showfieldCn).toPropertyWhenPresent("showfieldCn", record::getShowfieldCn)
                .map(showfieldEn).toPropertyWhenPresent("showfieldEn", record::getShowfieldEn)
                .map(realfield).toPropertyWhenPresent("realfield", record::getRealfield)
                .map(op).toPropertyWhenPresent("op", record::getOp)
                .map(searchvalue).toPropertyWhenPresent("searchvalue", record::getSearchvalue)
                .map(datatype).toPropertyWhenPresent("datatype", record::getDatatype)
                .map(selected).toPropertyWhenPresent("selected", record::getSelected)
                .map(currentshow).toPropertyWhenPresent("currentshow", record::getCurrentshow)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.877+08:00", comments="Source Table: tblQuery")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Tblquery>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, window, savename, showfieldCn, showfieldEn, realfield, op, searchvalue, datatype, selected, currentshow)
                .from(tblquery);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.877+08:00", comments="Source Table: tblQuery")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Tblquery>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, window, savename, showfieldCn, showfieldEn, realfield, op, searchvalue, datatype, selected, currentshow)
                .from(tblquery);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.877+08:00", comments="Source Table: tblQuery")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Tblquery record) {
        return UpdateDSL.updateWithMapper(this::update, tblquery)
                .set(window).equalTo(record::getWindow)
                .set(savename).equalTo(record::getSavename)
                .set(showfieldCn).equalTo(record::getShowfieldCn)
                .set(showfieldEn).equalTo(record::getShowfieldEn)
                .set(realfield).equalTo(record::getRealfield)
                .set(op).equalTo(record::getOp)
                .set(searchvalue).equalTo(record::getSearchvalue)
                .set(datatype).equalTo(record::getDatatype)
                .set(selected).equalTo(record::getSelected)
                .set(currentshow).equalTo(record::getCurrentshow);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.877+08:00", comments="Source Table: tblQuery")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Tblquery record) {
        return UpdateDSL.updateWithMapper(this::update, tblquery)
                .set(window).equalToWhenPresent(record::getWindow)
                .set(savename).equalToWhenPresent(record::getSavename)
                .set(showfieldCn).equalToWhenPresent(record::getShowfieldCn)
                .set(showfieldEn).equalToWhenPresent(record::getShowfieldEn)
                .set(realfield).equalToWhenPresent(record::getRealfield)
                .set(op).equalToWhenPresent(record::getOp)
                .set(searchvalue).equalToWhenPresent(record::getSearchvalue)
                .set(datatype).equalToWhenPresent(record::getDatatype)
                .set(selected).equalToWhenPresent(record::getSelected)
                .set(currentshow).equalToWhenPresent(record::getCurrentshow);
    }
}