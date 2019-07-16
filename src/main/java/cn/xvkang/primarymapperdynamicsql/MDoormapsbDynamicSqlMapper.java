package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MDoormapsbDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.MDoormapsb;
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
public interface MDoormapsbDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.833+08:00", comments="Source Table: M_DoorMapsB")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.834+08:00", comments="Source Table: M_DoorMapsB")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.834+08:00", comments="Source Table: M_DoorMapsB")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.mapid", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<MDoormapsb> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.834+08:00", comments="Source Table: M_DoorMapsB")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MDoormapsbResult")
    MDoormapsb selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.834+08:00", comments="Source Table: M_DoorMapsB")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MDoormapsbResult", value = {
        @Result(column="Mapid", property="mapid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="MapName", property="mapname", jdbcType=JdbcType.VARCHAR),
        @Result(column="AltDate", property="altdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MapLiu", property="mapliu", jdbcType=JdbcType.BLOB)
    })
    List<MDoormapsb> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.834+08:00", comments="Source Table: M_DoorMapsB")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.834+08:00", comments="Source Table: M_DoorMapsB")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(MDoormapsb);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.834+08:00", comments="Source Table: M_DoorMapsB")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, MDoormapsb);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.834+08:00", comments="Source Table: M_DoorMapsB")
    default int deleteByPrimaryKey(Integer mapid_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, MDoormapsb)
                .where(mapid, isEqualTo(mapid_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.834+08:00", comments="Source Table: M_DoorMapsB")
    default int insert(MDoormapsb record) {
        return insert(SqlBuilder.insert(record)
                .into(MDoormapsb)
                .map(mapname).toProperty("mapname")
                .map(altdate).toProperty("altdate")
                .map(mapliu).toProperty("mapliu")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.834+08:00", comments="Source Table: M_DoorMapsB")
    default int insertSelective(MDoormapsb record) {
        return insert(SqlBuilder.insert(record)
                .into(MDoormapsb)
                .map(mapname).toPropertyWhenPresent("mapname", record::getMapname)
                .map(altdate).toPropertyWhenPresent("altdate", record::getAltdate)
                .map(mapliu).toPropertyWhenPresent("mapliu", record::getMapliu)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.834+08:00", comments="Source Table: M_DoorMapsB")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<MDoormapsb>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, mapid, mapname, altdate, mapliu)
                .from(MDoormapsb);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.834+08:00", comments="Source Table: M_DoorMapsB")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<MDoormapsb>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, mapid, mapname, altdate, mapliu)
                .from(MDoormapsb);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.834+08:00", comments="Source Table: M_DoorMapsB")
    default MDoormapsb selectByPrimaryKey(Integer mapid_) {
        return SelectDSL.selectWithMapper(this::selectOne, mapid, mapname, altdate, mapliu)
                .from(MDoormapsb)
                .where(mapid, isEqualTo(mapid_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.834+08:00", comments="Source Table: M_DoorMapsB")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(MDoormapsb record) {
        return UpdateDSL.updateWithMapper(this::update, MDoormapsb)
                .set(mapname).equalTo(record::getMapname)
                .set(altdate).equalTo(record::getAltdate)
                .set(mapliu).equalTo(record::getMapliu);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.834+08:00", comments="Source Table: M_DoorMapsB")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(MDoormapsb record) {
        return UpdateDSL.updateWithMapper(this::update, MDoormapsb)
                .set(mapname).equalToWhenPresent(record::getMapname)
                .set(altdate).equalToWhenPresent(record::getAltdate)
                .set(mapliu).equalToWhenPresent(record::getMapliu);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.834+08:00", comments="Source Table: M_DoorMapsB")
    default int updateByPrimaryKey(MDoormapsb record) {
        return UpdateDSL.updateWithMapper(this::update, MDoormapsb)
                .set(mapname).equalTo(record::getMapname)
                .set(altdate).equalTo(record::getAltdate)
                .set(mapliu).equalTo(record::getMapliu)
                .where(mapid, isEqualTo(record::getMapid))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.834+08:00", comments="Source Table: M_DoorMapsB")
    default int updateByPrimaryKeySelective(MDoormapsb record) {
        return UpdateDSL.updateWithMapper(this::update, MDoormapsb)
                .set(mapname).equalToWhenPresent(record::getMapname)
                .set(altdate).equalToWhenPresent(record::getAltdate)
                .set(mapliu).equalToWhenPresent(record::getMapliu)
                .where(mapid, isEqualTo(record::getMapid))
                .build()
                .execute();
    }
}