package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.SerOpendoormodeDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.SerOpendoormode;
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
public interface SerOpendoormodeDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.854+08:00", comments="Source Table: Ser_OpenDoorMode")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.854+08:00", comments="Source Table: Ser_OpenDoorMode")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.854+08:00", comments="Source Table: Ser_OpenDoorMode")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<SerOpendoormode> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.854+08:00", comments="Source Table: Ser_OpenDoorMode")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SerOpendoormodeResult")
    SerOpendoormode selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.854+08:00", comments="Source Table: Ser_OpenDoorMode")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SerOpendoormodeResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="Devcid", property="devcid", jdbcType=JdbcType.INTEGER),
        @Result(column="Doorid", property="doorid", jdbcType=JdbcType.INTEGER),
        @Result(column="DoorJl", property="doorjl", jdbcType=JdbcType.VARCHAR)
    })
    List<SerOpendoormode> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.854+08:00", comments="Source Table: Ser_OpenDoorMode")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.854+08:00", comments="Source Table: Ser_OpenDoorMode")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(serOpendoormode);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.854+08:00", comments="Source Table: Ser_OpenDoorMode")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, serOpendoormode);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.854+08:00", comments="Source Table: Ser_OpenDoorMode")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, serOpendoormode)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.854+08:00", comments="Source Table: Ser_OpenDoorMode")
    default int insert(SerOpendoormode record) {
        return insert(SqlBuilder.insert(record)
                .into(serOpendoormode)
                .map(devcid).toProperty("devcid")
                .map(doorid).toProperty("doorid")
                .map(doorjl).toProperty("doorjl")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.854+08:00", comments="Source Table: Ser_OpenDoorMode")
    default int insertSelective(SerOpendoormode record) {
        return insert(SqlBuilder.insert(record)
                .into(serOpendoormode)
                .map(devcid).toPropertyWhenPresent("devcid", record::getDevcid)
                .map(doorid).toPropertyWhenPresent("doorid", record::getDoorid)
                .map(doorjl).toPropertyWhenPresent("doorjl", record::getDoorjl)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.854+08:00", comments="Source Table: Ser_OpenDoorMode")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<SerOpendoormode>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, devcid, doorid, doorjl)
                .from(serOpendoormode);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.854+08:00", comments="Source Table: Ser_OpenDoorMode")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<SerOpendoormode>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, devcid, doorid, doorjl)
                .from(serOpendoormode);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.854+08:00", comments="Source Table: Ser_OpenDoorMode")
    default SerOpendoormode selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, devcid, doorid, doorjl)
                .from(serOpendoormode)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.854+08:00", comments="Source Table: Ser_OpenDoorMode")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(SerOpendoormode record) {
        return UpdateDSL.updateWithMapper(this::update, serOpendoormode)
                .set(devcid).equalTo(record::getDevcid)
                .set(doorid).equalTo(record::getDoorid)
                .set(doorjl).equalTo(record::getDoorjl);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.854+08:00", comments="Source Table: Ser_OpenDoorMode")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(SerOpendoormode record) {
        return UpdateDSL.updateWithMapper(this::update, serOpendoormode)
                .set(devcid).equalToWhenPresent(record::getDevcid)
                .set(doorid).equalToWhenPresent(record::getDoorid)
                .set(doorjl).equalToWhenPresent(record::getDoorjl);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.854+08:00", comments="Source Table: Ser_OpenDoorMode")
    default int updateByPrimaryKey(SerOpendoormode record) {
        return UpdateDSL.updateWithMapper(this::update, serOpendoormode)
                .set(devcid).equalTo(record::getDevcid)
                .set(doorid).equalTo(record::getDoorid)
                .set(doorjl).equalTo(record::getDoorjl)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.854+08:00", comments="Source Table: Ser_OpenDoorMode")
    default int updateByPrimaryKeySelective(SerOpendoormode record) {
        return UpdateDSL.updateWithMapper(this::update, serOpendoormode)
                .set(devcid).equalToWhenPresent(record::getDevcid)
                .set(doorid).equalToWhenPresent(record::getDoorid)
                .set(doorjl).equalToWhenPresent(record::getDoorjl)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}