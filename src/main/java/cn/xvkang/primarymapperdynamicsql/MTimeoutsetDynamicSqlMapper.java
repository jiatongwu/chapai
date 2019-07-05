package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MTimeoutsetDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.MTimeoutset;
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
public interface MTimeoutsetDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.757+08:00", comments="Source Table: M_TimeOutSet")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.757+08:00", comments="Source Table: M_TimeOutSet")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.757+08:00", comments="Source Table: M_TimeOutSet")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<MTimeoutset> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.757+08:00", comments="Source Table: M_TimeOutSet")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MTimeoutsetResult")
    MTimeoutset selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.757+08:00", comments="Source Table: M_TimeOutSet")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MTimeoutsetResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="DevcNum", property="devcnum", jdbcType=JdbcType.INTEGER),
        @Result(column="Doornum", property="doornum", jdbcType=JdbcType.INTEGER),
        @Result(column="Times", property="times", jdbcType=JdbcType.INTEGER)
    })
    List<MTimeoutset> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.757+08:00", comments="Source Table: M_TimeOutSet")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.757+08:00", comments="Source Table: M_TimeOutSet")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(MTimeoutset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.757+08:00", comments="Source Table: M_TimeOutSet")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, MTimeoutset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.757+08:00", comments="Source Table: M_TimeOutSet")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, MTimeoutset)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.758+08:00", comments="Source Table: M_TimeOutSet")
    default int insert(MTimeoutset record) {
        return insert(SqlBuilder.insert(record)
                .into(MTimeoutset)
                .map(devcnum).toProperty("devcnum")
                .map(doornum).toProperty("doornum")
                .map(times).toProperty("times")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.758+08:00", comments="Source Table: M_TimeOutSet")
    default int insertSelective(MTimeoutset record) {
        return insert(SqlBuilder.insert(record)
                .into(MTimeoutset)
                .map(devcnum).toPropertyWhenPresent("devcnum", record::getDevcnum)
                .map(doornum).toPropertyWhenPresent("doornum", record::getDoornum)
                .map(times).toPropertyWhenPresent("times", record::getTimes)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.758+08:00", comments="Source Table: M_TimeOutSet")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<MTimeoutset>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, devcnum, doornum, times)
                .from(MTimeoutset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.758+08:00", comments="Source Table: M_TimeOutSet")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<MTimeoutset>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, devcnum, doornum, times)
                .from(MTimeoutset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.758+08:00", comments="Source Table: M_TimeOutSet")
    default MTimeoutset selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, devcnum, doornum, times)
                .from(MTimeoutset)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.759+08:00", comments="Source Table: M_TimeOutSet")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(MTimeoutset record) {
        return UpdateDSL.updateWithMapper(this::update, MTimeoutset)
                .set(devcnum).equalTo(record::getDevcnum)
                .set(doornum).equalTo(record::getDoornum)
                .set(times).equalTo(record::getTimes);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.759+08:00", comments="Source Table: M_TimeOutSet")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(MTimeoutset record) {
        return UpdateDSL.updateWithMapper(this::update, MTimeoutset)
                .set(devcnum).equalToWhenPresent(record::getDevcnum)
                .set(doornum).equalToWhenPresent(record::getDoornum)
                .set(times).equalToWhenPresent(record::getTimes);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.759+08:00", comments="Source Table: M_TimeOutSet")
    default int updateByPrimaryKey(MTimeoutset record) {
        return UpdateDSL.updateWithMapper(this::update, MTimeoutset)
                .set(devcnum).equalTo(record::getDevcnum)
                .set(doornum).equalTo(record::getDoornum)
                .set(times).equalTo(record::getTimes)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.759+08:00", comments="Source Table: M_TimeOutSet")
    default int updateByPrimaryKeySelective(MTimeoutset record) {
        return UpdateDSL.updateWithMapper(this::update, MTimeoutset)
                .set(devcnum).equalToWhenPresent(record::getDevcnum)
                .set(doornum).equalToWhenPresent(record::getDoornum)
                .set(times).equalToWhenPresent(record::getTimes)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}