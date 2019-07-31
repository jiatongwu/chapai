package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.CarchargeschemeDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.Carchargescheme;
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
public interface CarchargeschemeDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.854+08:00", comments="Source Table: CarChargeScheme")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.854+08:00", comments="Source Table: CarChargeScheme")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.854+08:00", comments="Source Table: CarChargeScheme")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.schid", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<Carchargescheme> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.854+08:00", comments="Source Table: CarChargeScheme")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("CarchargeschemeResult")
    Carchargescheme selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.854+08:00", comments="Source Table: CarChargeScheme")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="CarchargeschemeResult", value = {
        @Result(column="SchId", property="schid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="SchName", property="schname", jdbcType=JdbcType.VARCHAR),
        @Result(column="FieldName", property="fieldname", jdbcType=JdbcType.VARCHAR),
        @Result(column="Operators", property="operators", jdbcType=JdbcType.VARCHAR),
        @Result(column="Selectvalues", property="selectvalues", jdbcType=JdbcType.VARCHAR),
        @Result(column="startime", property="startime", jdbcType=JdbcType.VARCHAR),
        @Result(column="endtime", property="endtime", jdbcType=JdbcType.VARCHAR)
    })
    List<Carchargescheme> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.854+08:00", comments="Source Table: CarChargeScheme")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.854+08:00", comments="Source Table: CarChargeScheme")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(carchargescheme);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.854+08:00", comments="Source Table: CarChargeScheme")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, carchargescheme);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.854+08:00", comments="Source Table: CarChargeScheme")
    default int deleteByPrimaryKey(Integer schid_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, carchargescheme)
                .where(schid, isEqualTo(schid_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.854+08:00", comments="Source Table: CarChargeScheme")
    default int insert(Carchargescheme record) {
        return insert(SqlBuilder.insert(record)
                .into(carchargescheme)
                .map(schname).toProperty("schname")
                .map(fieldname).toProperty("fieldname")
                .map(operators).toProperty("operators")
                .map(selectvalues).toProperty("selectvalues")
                .map(startime).toProperty("startime")
                .map(endtime).toProperty("endtime")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.855+08:00", comments="Source Table: CarChargeScheme")
    default int insertSelective(Carchargescheme record) {
        return insert(SqlBuilder.insert(record)
                .into(carchargescheme)
                .map(schname).toPropertyWhenPresent("schname", record::getSchname)
                .map(fieldname).toPropertyWhenPresent("fieldname", record::getFieldname)
                .map(operators).toPropertyWhenPresent("operators", record::getOperators)
                .map(selectvalues).toPropertyWhenPresent("selectvalues", record::getSelectvalues)
                .map(startime).toPropertyWhenPresent("startime", record::getStartime)
                .map(endtime).toPropertyWhenPresent("endtime", record::getEndtime)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.855+08:00", comments="Source Table: CarChargeScheme")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Carchargescheme>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, schid, schname, fieldname, operators, selectvalues, startime, endtime)
                .from(carchargescheme);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.855+08:00", comments="Source Table: CarChargeScheme")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Carchargescheme>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, schid, schname, fieldname, operators, selectvalues, startime, endtime)
                .from(carchargescheme);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.855+08:00", comments="Source Table: CarChargeScheme")
    default Carchargescheme selectByPrimaryKey(Integer schid_) {
        return SelectDSL.selectWithMapper(this::selectOne, schid, schname, fieldname, operators, selectvalues, startime, endtime)
                .from(carchargescheme)
                .where(schid, isEqualTo(schid_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.855+08:00", comments="Source Table: CarChargeScheme")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Carchargescheme record) {
        return UpdateDSL.updateWithMapper(this::update, carchargescheme)
                .set(schname).equalTo(record::getSchname)
                .set(fieldname).equalTo(record::getFieldname)
                .set(operators).equalTo(record::getOperators)
                .set(selectvalues).equalTo(record::getSelectvalues)
                .set(startime).equalTo(record::getStartime)
                .set(endtime).equalTo(record::getEndtime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.855+08:00", comments="Source Table: CarChargeScheme")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Carchargescheme record) {
        return UpdateDSL.updateWithMapper(this::update, carchargescheme)
                .set(schname).equalToWhenPresent(record::getSchname)
                .set(fieldname).equalToWhenPresent(record::getFieldname)
                .set(operators).equalToWhenPresent(record::getOperators)
                .set(selectvalues).equalToWhenPresent(record::getSelectvalues)
                .set(startime).equalToWhenPresent(record::getStartime)
                .set(endtime).equalToWhenPresent(record::getEndtime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.855+08:00", comments="Source Table: CarChargeScheme")
    default int updateByPrimaryKey(Carchargescheme record) {
        return UpdateDSL.updateWithMapper(this::update, carchargescheme)
                .set(schname).equalTo(record::getSchname)
                .set(fieldname).equalTo(record::getFieldname)
                .set(operators).equalTo(record::getOperators)
                .set(selectvalues).equalTo(record::getSelectvalues)
                .set(startime).equalTo(record::getStartime)
                .set(endtime).equalTo(record::getEndtime)
                .where(schid, isEqualTo(record::getSchid))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.855+08:00", comments="Source Table: CarChargeScheme")
    default int updateByPrimaryKeySelective(Carchargescheme record) {
        return UpdateDSL.updateWithMapper(this::update, carchargescheme)
                .set(schname).equalToWhenPresent(record::getSchname)
                .set(fieldname).equalToWhenPresent(record::getFieldname)
                .set(operators).equalToWhenPresent(record::getOperators)
                .set(selectvalues).equalToWhenPresent(record::getSelectvalues)
                .set(startime).equalToWhenPresent(record::getStartime)
                .set(endtime).equalToWhenPresent(record::getEndtime)
                .where(schid, isEqualTo(record::getSchid))
                .build()
                .execute();
    }
}