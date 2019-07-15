package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MDoortypenameDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.MDoortypename;
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
public interface MDoortypenameDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.856+08:00", comments="Source Table: M_DoorTypeName")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.856+08:00", comments="Source Table: M_DoorTypeName")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.856+08:00", comments="Source Table: M_DoorTypeName")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.doorid", before=true, resultType=Integer.class)
    int insert(InsertStatementProvider<MDoortypename> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.856+08:00", comments="Source Table: M_DoorTypeName")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MDoortypenameResult")
    MDoortypename selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.856+08:00", comments="Source Table: M_DoorTypeName")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MDoortypenameResult", value = {
        @Result(column="DoorID", property="doorid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="DoorTypeC", property="doortypec", jdbcType=JdbcType.VARCHAR),
        @Result(column="DoorTypeE", property="doortypee", jdbcType=JdbcType.VARCHAR),
        @Result(column="DoorMark", property="doormark", jdbcType=JdbcType.VARCHAR)
    })
    List<MDoortypename> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.856+08:00", comments="Source Table: M_DoorTypeName")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.856+08:00", comments="Source Table: M_DoorTypeName")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(MDoortypename);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.856+08:00", comments="Source Table: M_DoorTypeName")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, MDoortypename);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.856+08:00", comments="Source Table: M_DoorTypeName")
    default int deleteByPrimaryKey(Integer doorid_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, MDoortypename)
                .where(doorid, isEqualTo(doorid_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.856+08:00", comments="Source Table: M_DoorTypeName")
    default int insert(MDoortypename record) {
        return insert(SqlBuilder.insert(record)
                .into(MDoortypename)
                .map(doorid).toProperty("doorid")
                .map(doortypec).toProperty("doortypec")
                .map(doortypee).toProperty("doortypee")
                .map(doormark).toProperty("doormark")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.856+08:00", comments="Source Table: M_DoorTypeName")
    default int insertSelective(MDoortypename record) {
        return insert(SqlBuilder.insert(record)
                .into(MDoortypename)
                .map(doorid).toProperty("doorid")
                .map(doortypec).toPropertyWhenPresent("doortypec", record::getDoortypec)
                .map(doortypee).toPropertyWhenPresent("doortypee", record::getDoortypee)
                .map(doormark).toPropertyWhenPresent("doormark", record::getDoormark)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.856+08:00", comments="Source Table: M_DoorTypeName")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<MDoortypename>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, doorid, doortypec, doortypee, doormark)
                .from(MDoortypename);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.856+08:00", comments="Source Table: M_DoorTypeName")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<MDoortypename>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, doorid, doortypec, doortypee, doormark)
                .from(MDoortypename);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.856+08:00", comments="Source Table: M_DoorTypeName")
    default MDoortypename selectByPrimaryKey(Integer doorid_) {
        return SelectDSL.selectWithMapper(this::selectOne, doorid, doortypec, doortypee, doormark)
                .from(MDoortypename)
                .where(doorid, isEqualTo(doorid_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.856+08:00", comments="Source Table: M_DoorTypeName")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(MDoortypename record) {
        return UpdateDSL.updateWithMapper(this::update, MDoortypename)
                .set(doorid).equalTo(record::getDoorid)
                .set(doortypec).equalTo(record::getDoortypec)
                .set(doortypee).equalTo(record::getDoortypee)
                .set(doormark).equalTo(record::getDoormark);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.856+08:00", comments="Source Table: M_DoorTypeName")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(MDoortypename record) {
        return UpdateDSL.updateWithMapper(this::update, MDoortypename)
                .set(doorid).equalToWhenPresent(record::getDoorid)
                .set(doortypec).equalToWhenPresent(record::getDoortypec)
                .set(doortypee).equalToWhenPresent(record::getDoortypee)
                .set(doormark).equalToWhenPresent(record::getDoormark);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.856+08:00", comments="Source Table: M_DoorTypeName")
    default int updateByPrimaryKey(MDoortypename record) {
        return UpdateDSL.updateWithMapper(this::update, MDoortypename)
                .set(doortypec).equalTo(record::getDoortypec)
                .set(doortypee).equalTo(record::getDoortypee)
                .set(doormark).equalTo(record::getDoormark)
                .where(doorid, isEqualTo(record::getDoorid))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.856+08:00", comments="Source Table: M_DoorTypeName")
    default int updateByPrimaryKeySelective(MDoortypename record) {
        return UpdateDSL.updateWithMapper(this::update, MDoortypename)
                .set(doortypec).equalToWhenPresent(record::getDoortypec)
                .set(doortypee).equalToWhenPresent(record::getDoortypee)
                .set(doormark).equalToWhenPresent(record::getDoormark)
                .where(doorid, isEqualTo(record::getDoorid))
                .build()
                .execute();
    }
}