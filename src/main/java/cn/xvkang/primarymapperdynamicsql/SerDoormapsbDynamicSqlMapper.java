package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.SerDoormapsbDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.SerDoormapsb;
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
public interface SerDoormapsbDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.503+08:00", comments="Source Table: Ser_DoorMapsB")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.503+08:00", comments="Source Table: Ser_DoorMapsB")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.503+08:00", comments="Source Table: Ser_DoorMapsB")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.mapid", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<SerDoormapsb> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.503+08:00", comments="Source Table: Ser_DoorMapsB")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SerDoormapsbResult")
    SerDoormapsb selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.503+08:00", comments="Source Table: Ser_DoorMapsB")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SerDoormapsbResult", value = {
        @Result(column="Mapid", property="mapid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="MapName", property="mapname", jdbcType=JdbcType.VARCHAR),
        @Result(column="AltDate", property="altdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MapLiu", property="mapliu", jdbcType=JdbcType.BLOB)
    })
    List<SerDoormapsb> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.503+08:00", comments="Source Table: Ser_DoorMapsB")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.503+08:00", comments="Source Table: Ser_DoorMapsB")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(serDoormapsb);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.503+08:00", comments="Source Table: Ser_DoorMapsB")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, serDoormapsb);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.503+08:00", comments="Source Table: Ser_DoorMapsB")
    default int deleteByPrimaryKey(Integer mapid_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, serDoormapsb)
                .where(mapid, isEqualTo(mapid_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.503+08:00", comments="Source Table: Ser_DoorMapsB")
    default int insert(SerDoormapsb record) {
        return insert(SqlBuilder.insert(record)
                .into(serDoormapsb)
                .map(mapname).toProperty("mapname")
                .map(altdate).toProperty("altdate")
                .map(mapliu).toProperty("mapliu")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.503+08:00", comments="Source Table: Ser_DoorMapsB")
    default int insertSelective(SerDoormapsb record) {
        return insert(SqlBuilder.insert(record)
                .into(serDoormapsb)
                .map(mapname).toPropertyWhenPresent("mapname", record::getMapname)
                .map(altdate).toPropertyWhenPresent("altdate", record::getAltdate)
                .map(mapliu).toPropertyWhenPresent("mapliu", record::getMapliu)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.503+08:00", comments="Source Table: Ser_DoorMapsB")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<SerDoormapsb>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, mapid, mapname, altdate, mapliu)
                .from(serDoormapsb);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.503+08:00", comments="Source Table: Ser_DoorMapsB")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<SerDoormapsb>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, mapid, mapname, altdate, mapliu)
                .from(serDoormapsb);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.503+08:00", comments="Source Table: Ser_DoorMapsB")
    default SerDoormapsb selectByPrimaryKey(Integer mapid_) {
        return SelectDSL.selectWithMapper(this::selectOne, mapid, mapname, altdate, mapliu)
                .from(serDoormapsb)
                .where(mapid, isEqualTo(mapid_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.503+08:00", comments="Source Table: Ser_DoorMapsB")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(SerDoormapsb record) {
        return UpdateDSL.updateWithMapper(this::update, serDoormapsb)
                .set(mapname).equalTo(record::getMapname)
                .set(altdate).equalTo(record::getAltdate)
                .set(mapliu).equalTo(record::getMapliu);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.503+08:00", comments="Source Table: Ser_DoorMapsB")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(SerDoormapsb record) {
        return UpdateDSL.updateWithMapper(this::update, serDoormapsb)
                .set(mapname).equalToWhenPresent(record::getMapname)
                .set(altdate).equalToWhenPresent(record::getAltdate)
                .set(mapliu).equalToWhenPresent(record::getMapliu);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.503+08:00", comments="Source Table: Ser_DoorMapsB")
    default int updateByPrimaryKey(SerDoormapsb record) {
        return UpdateDSL.updateWithMapper(this::update, serDoormapsb)
                .set(mapname).equalTo(record::getMapname)
                .set(altdate).equalTo(record::getAltdate)
                .set(mapliu).equalTo(record::getMapliu)
                .where(mapid, isEqualTo(record::getMapid))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.503+08:00", comments="Source Table: Ser_DoorMapsB")
    default int updateByPrimaryKeySelective(SerDoormapsb record) {
        return UpdateDSL.updateWithMapper(this::update, serDoormapsb)
                .set(mapname).equalToWhenPresent(record::getMapname)
                .set(altdate).equalToWhenPresent(record::getAltdate)
                .set(mapliu).equalToWhenPresent(record::getMapliu)
                .where(mapid, isEqualTo(record::getMapid))
                .build()
                .execute();
    }
}