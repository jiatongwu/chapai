package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.SerDoorrealtimestuatsDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.SerDoorrealtimestuats;
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
public interface SerDoorrealtimestuatsDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.506+08:00", comments="Source Table: Ser_DoorRealTimeStuats")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.506+08:00", comments="Source Table: Ser_DoorRealTimeStuats")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.506+08:00", comments="Source Table: Ser_DoorRealTimeStuats")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<SerDoorrealtimestuats> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.506+08:00", comments="Source Table: Ser_DoorRealTimeStuats")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SerDoorrealtimestuatsResult")
    SerDoorrealtimestuats selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.506+08:00", comments="Source Table: Ser_DoorRealTimeStuats")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SerDoorrealtimestuatsResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="DoorName", property="doorname", jdbcType=JdbcType.VARCHAR)
    })
    List<SerDoorrealtimestuats> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.506+08:00", comments="Source Table: Ser_DoorRealTimeStuats")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.506+08:00", comments="Source Table: Ser_DoorRealTimeStuats")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(serDoorrealtimestuats);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.506+08:00", comments="Source Table: Ser_DoorRealTimeStuats")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, serDoorrealtimestuats);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.506+08:00", comments="Source Table: Ser_DoorRealTimeStuats")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, serDoorrealtimestuats)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.506+08:00", comments="Source Table: Ser_DoorRealTimeStuats")
    default int insert(SerDoorrealtimestuats record) {
        return insert(SqlBuilder.insert(record)
                .into(serDoorrealtimestuats)
                .map(doorname).toProperty("doorname")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.506+08:00", comments="Source Table: Ser_DoorRealTimeStuats")
    default int insertSelective(SerDoorrealtimestuats record) {
        return insert(SqlBuilder.insert(record)
                .into(serDoorrealtimestuats)
                .map(doorname).toPropertyWhenPresent("doorname", record::getDoorname)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.506+08:00", comments="Source Table: Ser_DoorRealTimeStuats")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<SerDoorrealtimestuats>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, doorname)
                .from(serDoorrealtimestuats);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.506+08:00", comments="Source Table: Ser_DoorRealTimeStuats")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<SerDoorrealtimestuats>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, doorname)
                .from(serDoorrealtimestuats);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.506+08:00", comments="Source Table: Ser_DoorRealTimeStuats")
    default SerDoorrealtimestuats selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, doorname)
                .from(serDoorrealtimestuats)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.506+08:00", comments="Source Table: Ser_DoorRealTimeStuats")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(SerDoorrealtimestuats record) {
        return UpdateDSL.updateWithMapper(this::update, serDoorrealtimestuats)
                .set(doorname).equalTo(record::getDoorname);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.507+08:00", comments="Source Table: Ser_DoorRealTimeStuats")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(SerDoorrealtimestuats record) {
        return UpdateDSL.updateWithMapper(this::update, serDoorrealtimestuats)
                .set(doorname).equalToWhenPresent(record::getDoorname);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.507+08:00", comments="Source Table: Ser_DoorRealTimeStuats")
    default int updateByPrimaryKey(SerDoorrealtimestuats record) {
        return UpdateDSL.updateWithMapper(this::update, serDoorrealtimestuats)
                .set(doorname).equalTo(record::getDoorname)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.507+08:00", comments="Source Table: Ser_DoorRealTimeStuats")
    default int updateByPrimaryKeySelective(SerDoorrealtimestuats record) {
        return UpdateDSL.updateWithMapper(this::update, serDoorrealtimestuats)
                .set(doorname).equalToWhenPresent(record::getDoorname)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}