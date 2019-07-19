package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.SerDoormapsdoorinfoDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.SerDoormapsdoorinfo;
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
public interface SerDoormapsdoorinfoDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.857+08:00", comments="Source Table: Ser_DoorMapsDoorInfo")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.857+08:00", comments="Source Table: Ser_DoorMapsDoorInfo")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.857+08:00", comments="Source Table: Ser_DoorMapsDoorInfo")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<SerDoormapsdoorinfo> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.857+08:00", comments="Source Table: Ser_DoorMapsDoorInfo")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SerDoormapsdoorinfoResult")
    SerDoormapsdoorinfo selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.857+08:00", comments="Source Table: Ser_DoorMapsDoorInfo")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SerDoormapsdoorinfoResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="Mapid", property="mapid", jdbcType=JdbcType.INTEGER),
        @Result(column="Drawing", property="drawing", jdbcType=JdbcType.VARCHAR),
        @Result(column="DevcID", property="devcid", jdbcType=JdbcType.VARCHAR),
        @Result(column="DevcName", property="devcname", jdbcType=JdbcType.VARCHAR),
        @Result(column="Doorid", property="doorid", jdbcType=JdbcType.VARCHAR),
        @Result(column="DoorName", property="doorname", jdbcType=JdbcType.VARCHAR)
    })
    List<SerDoormapsdoorinfo> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.857+08:00", comments="Source Table: Ser_DoorMapsDoorInfo")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.857+08:00", comments="Source Table: Ser_DoorMapsDoorInfo")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(serDoormapsdoorinfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.858+08:00", comments="Source Table: Ser_DoorMapsDoorInfo")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, serDoormapsdoorinfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.858+08:00", comments="Source Table: Ser_DoorMapsDoorInfo")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, serDoormapsdoorinfo)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.858+08:00", comments="Source Table: Ser_DoorMapsDoorInfo")
    default int insert(SerDoormapsdoorinfo record) {
        return insert(SqlBuilder.insert(record)
                .into(serDoormapsdoorinfo)
                .map(mapid).toProperty("mapid")
                .map(drawing).toProperty("drawing")
                .map(devcid).toProperty("devcid")
                .map(devcname).toProperty("devcname")
                .map(doorid).toProperty("doorid")
                .map(doorname).toProperty("doorname")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.858+08:00", comments="Source Table: Ser_DoorMapsDoorInfo")
    default int insertSelective(SerDoormapsdoorinfo record) {
        return insert(SqlBuilder.insert(record)
                .into(serDoormapsdoorinfo)
                .map(mapid).toPropertyWhenPresent("mapid", record::getMapid)
                .map(drawing).toPropertyWhenPresent("drawing", record::getDrawing)
                .map(devcid).toPropertyWhenPresent("devcid", record::getDevcid)
                .map(devcname).toPropertyWhenPresent("devcname", record::getDevcname)
                .map(doorid).toPropertyWhenPresent("doorid", record::getDoorid)
                .map(doorname).toPropertyWhenPresent("doorname", record::getDoorname)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.858+08:00", comments="Source Table: Ser_DoorMapsDoorInfo")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<SerDoormapsdoorinfo>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, mapid, drawing, devcid, devcname, doorid, doorname)
                .from(serDoormapsdoorinfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.858+08:00", comments="Source Table: Ser_DoorMapsDoorInfo")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<SerDoormapsdoorinfo>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, mapid, drawing, devcid, devcname, doorid, doorname)
                .from(serDoormapsdoorinfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.858+08:00", comments="Source Table: Ser_DoorMapsDoorInfo")
    default SerDoormapsdoorinfo selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, mapid, drawing, devcid, devcname, doorid, doorname)
                .from(serDoormapsdoorinfo)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.858+08:00", comments="Source Table: Ser_DoorMapsDoorInfo")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(SerDoormapsdoorinfo record) {
        return UpdateDSL.updateWithMapper(this::update, serDoormapsdoorinfo)
                .set(mapid).equalTo(record::getMapid)
                .set(drawing).equalTo(record::getDrawing)
                .set(devcid).equalTo(record::getDevcid)
                .set(devcname).equalTo(record::getDevcname)
                .set(doorid).equalTo(record::getDoorid)
                .set(doorname).equalTo(record::getDoorname);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.858+08:00", comments="Source Table: Ser_DoorMapsDoorInfo")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(SerDoormapsdoorinfo record) {
        return UpdateDSL.updateWithMapper(this::update, serDoormapsdoorinfo)
                .set(mapid).equalToWhenPresent(record::getMapid)
                .set(drawing).equalToWhenPresent(record::getDrawing)
                .set(devcid).equalToWhenPresent(record::getDevcid)
                .set(devcname).equalToWhenPresent(record::getDevcname)
                .set(doorid).equalToWhenPresent(record::getDoorid)
                .set(doorname).equalToWhenPresent(record::getDoorname);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.858+08:00", comments="Source Table: Ser_DoorMapsDoorInfo")
    default int updateByPrimaryKey(SerDoormapsdoorinfo record) {
        return UpdateDSL.updateWithMapper(this::update, serDoormapsdoorinfo)
                .set(mapid).equalTo(record::getMapid)
                .set(drawing).equalTo(record::getDrawing)
                .set(devcid).equalTo(record::getDevcid)
                .set(devcname).equalTo(record::getDevcname)
                .set(doorid).equalTo(record::getDoorid)
                .set(doorname).equalTo(record::getDoorname)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.858+08:00", comments="Source Table: Ser_DoorMapsDoorInfo")
    default int updateByPrimaryKeySelective(SerDoormapsdoorinfo record) {
        return UpdateDSL.updateWithMapper(this::update, serDoormapsdoorinfo)
                .set(mapid).equalToWhenPresent(record::getMapid)
                .set(drawing).equalToWhenPresent(record::getDrawing)
                .set(devcid).equalToWhenPresent(record::getDevcid)
                .set(devcname).equalToWhenPresent(record::getDevcname)
                .set(doorid).equalToWhenPresent(record::getDoorid)
                .set(doorname).equalToWhenPresent(record::getDoorname)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}