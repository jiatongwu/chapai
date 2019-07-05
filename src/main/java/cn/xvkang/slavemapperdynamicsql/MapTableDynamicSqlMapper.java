package cn.xvkang.slavemapperdynamicsql;

import static cn.xvkang.slavemapperdynamicsql.MapTableDynamicSqlSupport.id;
import static cn.xvkang.slavemapperdynamicsql.MapTableDynamicSqlSupport.key;
import static cn.xvkang.slavemapperdynamicsql.MapTableDynamicSqlSupport.mapTable;
import static cn.xvkang.slavemapperdynamicsql.MapTableDynamicSqlSupport.value;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

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

import cn.xvkang.slaveentity.MapTable;

@Mapper
public interface MapTableDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.552+08:00", comments="Source Table: map_table")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.552+08:00", comments="Source Table: map_table")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.552+08:00", comments="Source Table: map_table")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<MapTable> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.552+08:00", comments="Source Table: map_table")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MapTableResult")
    MapTable selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.552+08:00", comments="Source Table: map_table")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MapTableResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="key", property="key", jdbcType=JdbcType.VARCHAR),
        @Result(column="value", property="value", jdbcType=JdbcType.VARCHAR)
    })
    List<MapTable> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.552+08:00", comments="Source Table: map_table")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.552+08:00", comments="Source Table: map_table")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(mapTable);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.553+08:00", comments="Source Table: map_table")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, mapTable);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.553+08:00", comments="Source Table: map_table")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, mapTable)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.553+08:00", comments="Source Table: map_table")
    default int insert(MapTable record) {
        return insert(SqlBuilder.insert(record)
                .into(mapTable)
                .map(key).toProperty("key")
                .map(value).toProperty("value")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.553+08:00", comments="Source Table: map_table")
    default int insertSelective(MapTable record) {
        return insert(SqlBuilder.insert(record)
                .into(mapTable)
                .map(key).toPropertyWhenPresent("key", record::getKey)
                .map(value).toPropertyWhenPresent("value", record::getValue)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.553+08:00", comments="Source Table: map_table")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<MapTable>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, key, value)
                .from(mapTable);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.553+08:00", comments="Source Table: map_table")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<MapTable>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, key, value)
                .from(mapTable);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.553+08:00", comments="Source Table: map_table")
    default MapTable selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, key, value)
                .from(mapTable)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.553+08:00", comments="Source Table: map_table")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(MapTable record) {
        return UpdateDSL.updateWithMapper(this::update, mapTable)
                .set(key).equalTo(record::getKey)
                .set(value).equalTo(record::getValue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.553+08:00", comments="Source Table: map_table")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(MapTable record) {
        return UpdateDSL.updateWithMapper(this::update, mapTable)
                .set(key).equalToWhenPresent(record::getKey)
                .set(value).equalToWhenPresent(record::getValue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.553+08:00", comments="Source Table: map_table")
    default int updateByPrimaryKey(MapTable record) {
        return UpdateDSL.updateWithMapper(this::update, mapTable)
                .set(key).equalTo(record::getKey)
                .set(value).equalTo(record::getValue)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.553+08:00", comments="Source Table: map_table")
    default int updateByPrimaryKeySelective(MapTable record) {
        return UpdateDSL.updateWithMapper(this::update, mapTable)
                .set(key).equalToWhenPresent(record::getKey)
                .set(value).equalToWhenPresent(record::getValue)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}