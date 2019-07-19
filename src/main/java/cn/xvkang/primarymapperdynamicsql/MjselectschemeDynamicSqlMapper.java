package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MjselectschemeDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.Mjselectscheme;
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
public interface MjselectschemeDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.631+08:00", comments="Source Table: MJSelectScheme")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.631+08:00", comments="Source Table: MJSelectScheme")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.631+08:00", comments="Source Table: MJSelectScheme")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.schid", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<Mjselectscheme> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.631+08:00", comments="Source Table: MJSelectScheme")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MjselectschemeResult")
    Mjselectscheme selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.631+08:00", comments="Source Table: MJSelectScheme")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MjselectschemeResult", value = {
        @Result(column="SchId", property="schid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="SchName", property="schname", jdbcType=JdbcType.VARCHAR),
        @Result(column="FieldName", property="fieldname", jdbcType=JdbcType.VARCHAR),
        @Result(column="Operators", property="operators", jdbcType=JdbcType.VARCHAR),
        @Result(column="Selectvalues", property="selectvalues", jdbcType=JdbcType.VARCHAR),
        @Result(column="startime", property="startime", jdbcType=JdbcType.VARCHAR),
        @Result(column="endtime", property="endtime", jdbcType=JdbcType.VARCHAR)
    })
    List<Mjselectscheme> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.631+08:00", comments="Source Table: MJSelectScheme")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.631+08:00", comments="Source Table: MJSelectScheme")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(mjselectscheme);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.631+08:00", comments="Source Table: MJSelectScheme")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, mjselectscheme);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.631+08:00", comments="Source Table: MJSelectScheme")
    default int deleteByPrimaryKey(Integer schid_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, mjselectscheme)
                .where(schid, isEqualTo(schid_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.631+08:00", comments="Source Table: MJSelectScheme")
    default int insert(Mjselectscheme record) {
        return insert(SqlBuilder.insert(record)
                .into(mjselectscheme)
                .map(schname).toProperty("schname")
                .map(fieldname).toProperty("fieldname")
                .map(operators).toProperty("operators")
                .map(selectvalues).toProperty("selectvalues")
                .map(startime).toProperty("startime")
                .map(endtime).toProperty("endtime")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.631+08:00", comments="Source Table: MJSelectScheme")
    default int insertSelective(Mjselectscheme record) {
        return insert(SqlBuilder.insert(record)
                .into(mjselectscheme)
                .map(schname).toPropertyWhenPresent("schname", record::getSchname)
                .map(fieldname).toPropertyWhenPresent("fieldname", record::getFieldname)
                .map(operators).toPropertyWhenPresent("operators", record::getOperators)
                .map(selectvalues).toPropertyWhenPresent("selectvalues", record::getSelectvalues)
                .map(startime).toPropertyWhenPresent("startime", record::getStartime)
                .map(endtime).toPropertyWhenPresent("endtime", record::getEndtime)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.631+08:00", comments="Source Table: MJSelectScheme")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Mjselectscheme>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, schid, schname, fieldname, operators, selectvalues, startime, endtime)
                .from(mjselectscheme);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.632+08:00", comments="Source Table: MJSelectScheme")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Mjselectscheme>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, schid, schname, fieldname, operators, selectvalues, startime, endtime)
                .from(mjselectscheme);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.632+08:00", comments="Source Table: MJSelectScheme")
    default Mjselectscheme selectByPrimaryKey(Integer schid_) {
        return SelectDSL.selectWithMapper(this::selectOne, schid, schname, fieldname, operators, selectvalues, startime, endtime)
                .from(mjselectscheme)
                .where(schid, isEqualTo(schid_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.632+08:00", comments="Source Table: MJSelectScheme")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Mjselectscheme record) {
        return UpdateDSL.updateWithMapper(this::update, mjselectscheme)
                .set(schname).equalTo(record::getSchname)
                .set(fieldname).equalTo(record::getFieldname)
                .set(operators).equalTo(record::getOperators)
                .set(selectvalues).equalTo(record::getSelectvalues)
                .set(startime).equalTo(record::getStartime)
                .set(endtime).equalTo(record::getEndtime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.632+08:00", comments="Source Table: MJSelectScheme")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Mjselectscheme record) {
        return UpdateDSL.updateWithMapper(this::update, mjselectscheme)
                .set(schname).equalToWhenPresent(record::getSchname)
                .set(fieldname).equalToWhenPresent(record::getFieldname)
                .set(operators).equalToWhenPresent(record::getOperators)
                .set(selectvalues).equalToWhenPresent(record::getSelectvalues)
                .set(startime).equalToWhenPresent(record::getStartime)
                .set(endtime).equalToWhenPresent(record::getEndtime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.632+08:00", comments="Source Table: MJSelectScheme")
    default int updateByPrimaryKey(Mjselectscheme record) {
        return UpdateDSL.updateWithMapper(this::update, mjselectscheme)
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

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.633+08:00", comments="Source Table: MJSelectScheme")
    default int updateByPrimaryKeySelective(Mjselectscheme record) {
        return UpdateDSL.updateWithMapper(this::update, mjselectscheme)
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