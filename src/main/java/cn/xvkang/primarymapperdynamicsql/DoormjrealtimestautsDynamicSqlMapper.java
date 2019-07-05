package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.DoormjrealtimestautsDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.Doormjrealtimestauts;
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
public interface DoormjrealtimestautsDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.335+08:00", comments="Source Table: DoorMjRealTimeStauts")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.335+08:00", comments="Source Table: DoorMjRealTimeStauts")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.335+08:00", comments="Source Table: DoorMjRealTimeStauts")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<Doormjrealtimestauts> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.335+08:00", comments="Source Table: DoorMjRealTimeStauts")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("DoormjrealtimestautsResult")
    Doormjrealtimestauts selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.336+08:00", comments="Source Table: DoorMjRealTimeStauts")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="DoormjrealtimestautsResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="DoorName", property="doorname", jdbcType=JdbcType.VARCHAR)
    })
    List<Doormjrealtimestauts> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.336+08:00", comments="Source Table: DoorMjRealTimeStauts")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.336+08:00", comments="Source Table: DoorMjRealTimeStauts")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(doormjrealtimestauts);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.336+08:00", comments="Source Table: DoorMjRealTimeStauts")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, doormjrealtimestauts);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.336+08:00", comments="Source Table: DoorMjRealTimeStauts")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, doormjrealtimestauts)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.336+08:00", comments="Source Table: DoorMjRealTimeStauts")
    default int insert(Doormjrealtimestauts record) {
        return insert(SqlBuilder.insert(record)
                .into(doormjrealtimestauts)
                .map(doorname).toProperty("doorname")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.336+08:00", comments="Source Table: DoorMjRealTimeStauts")
    default int insertSelective(Doormjrealtimestauts record) {
        return insert(SqlBuilder.insert(record)
                .into(doormjrealtimestauts)
                .map(doorname).toPropertyWhenPresent("doorname", record::getDoorname)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.336+08:00", comments="Source Table: DoorMjRealTimeStauts")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Doormjrealtimestauts>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, doorname)
                .from(doormjrealtimestauts);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.337+08:00", comments="Source Table: DoorMjRealTimeStauts")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Doormjrealtimestauts>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, doorname)
                .from(doormjrealtimestauts);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.337+08:00", comments="Source Table: DoorMjRealTimeStauts")
    default Doormjrealtimestauts selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, doorname)
                .from(doormjrealtimestauts)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.337+08:00", comments="Source Table: DoorMjRealTimeStauts")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Doormjrealtimestauts record) {
        return UpdateDSL.updateWithMapper(this::update, doormjrealtimestauts)
                .set(doorname).equalTo(record::getDoorname);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.337+08:00", comments="Source Table: DoorMjRealTimeStauts")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Doormjrealtimestauts record) {
        return UpdateDSL.updateWithMapper(this::update, doormjrealtimestauts)
                .set(doorname).equalToWhenPresent(record::getDoorname);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.337+08:00", comments="Source Table: DoorMjRealTimeStauts")
    default int updateByPrimaryKey(Doormjrealtimestauts record) {
        return UpdateDSL.updateWithMapper(this::update, doormjrealtimestauts)
                .set(doorname).equalTo(record::getDoorname)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.337+08:00", comments="Source Table: DoorMjRealTimeStauts")
    default int updateByPrimaryKeySelective(Doormjrealtimestauts record) {
        return UpdateDSL.updateWithMapper(this::update, doormjrealtimestauts)
                .set(doorname).equalToWhenPresent(record::getDoorname)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}