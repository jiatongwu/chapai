package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.SerDoordataDynamicSqlSupport.*;

import cn.xvkang.primaryentity.SerDoordata;
import java.util.List;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
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
public interface SerDoordataDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.919+08:00", comments="Source Table: Ser_DoorData")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.919+08:00", comments="Source Table: Ser_DoorData")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.919+08:00", comments="Source Table: Ser_DoorData")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SerDoordata> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.919+08:00", comments="Source Table: Ser_DoorData")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SerDoordataResult", value = {
        @Result(column="DevcNo", property="devcno", jdbcType=JdbcType.INTEGER),
        @Result(column="Place", property="place", jdbcType=JdbcType.VARCHAR),
        @Result(column="DevcType", property="devctype", jdbcType=JdbcType.INTEGER),
        @Result(column="Com", property="com", jdbcType=JdbcType.INTEGER),
        @Result(column="DoorInfo", property="doorinfo", jdbcType=JdbcType.VARCHAR)
    })
    List<SerDoordata> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.919+08:00", comments="Source Table: Ser_DoorData")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.919+08:00", comments="Source Table: Ser_DoorData")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(serDoordata);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.919+08:00", comments="Source Table: Ser_DoorData")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, serDoordata);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.919+08:00", comments="Source Table: Ser_DoorData")
    default int insert(SerDoordata record) {
        return insert(SqlBuilder.insert(record)
                .into(serDoordata)
                .map(devcno).toProperty("devcno")
                .map(place).toProperty("place")
                .map(devctype).toProperty("devctype")
                .map(com).toProperty("com")
                .map(doorinfo).toProperty("doorinfo")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.919+08:00", comments="Source Table: Ser_DoorData")
    default int insertSelective(SerDoordata record) {
        return insert(SqlBuilder.insert(record)
                .into(serDoordata)
                .map(devcno).toPropertyWhenPresent("devcno", record::getDevcno)
                .map(place).toPropertyWhenPresent("place", record::getPlace)
                .map(devctype).toPropertyWhenPresent("devctype", record::getDevctype)
                .map(com).toPropertyWhenPresent("com", record::getCom)
                .map(doorinfo).toPropertyWhenPresent("doorinfo", record::getDoorinfo)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.919+08:00", comments="Source Table: Ser_DoorData")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<SerDoordata>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, devcno, place, devctype, com, doorinfo)
                .from(serDoordata);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.919+08:00", comments="Source Table: Ser_DoorData")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<SerDoordata>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, devcno, place, devctype, com, doorinfo)
                .from(serDoordata);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.919+08:00", comments="Source Table: Ser_DoorData")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(SerDoordata record) {
        return UpdateDSL.updateWithMapper(this::update, serDoordata)
                .set(devcno).equalTo(record::getDevcno)
                .set(place).equalTo(record::getPlace)
                .set(devctype).equalTo(record::getDevctype)
                .set(com).equalTo(record::getCom)
                .set(doorinfo).equalTo(record::getDoorinfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.920+08:00", comments="Source Table: Ser_DoorData")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(SerDoordata record) {
        return UpdateDSL.updateWithMapper(this::update, serDoordata)
                .set(devcno).equalToWhenPresent(record::getDevcno)
                .set(place).equalToWhenPresent(record::getPlace)
                .set(devctype).equalToWhenPresent(record::getDevctype)
                .set(com).equalToWhenPresent(record::getCom)
                .set(doorinfo).equalToWhenPresent(record::getDoorinfo);
    }
}