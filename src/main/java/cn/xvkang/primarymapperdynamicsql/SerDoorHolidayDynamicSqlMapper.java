package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.SerDoorHolidayDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.SerDoorHoliday;
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
public interface SerDoorHolidayDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.507+08:00", comments="Source Table: Ser_Door_Holiday")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.507+08:00", comments="Source Table: Ser_Door_Holiday")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.507+08:00", comments="Source Table: Ser_Door_Holiday")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<SerDoorHoliday> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.507+08:00", comments="Source Table: Ser_Door_Holiday")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SerDoorHolidayResult")
    SerDoorHoliday selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.507+08:00", comments="Source Table: Ser_Door_Holiday")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SerDoorHolidayResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="sDate", property="sdate", jdbcType=JdbcType.VARCHAR),
        @Result(column="DevcNum", property="devcnum", jdbcType=JdbcType.INTEGER),
        @Result(column="Doorid", property="doorid", jdbcType=JdbcType.INTEGER)
    })
    List<SerDoorHoliday> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.508+08:00", comments="Source Table: Ser_Door_Holiday")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.508+08:00", comments="Source Table: Ser_Door_Holiday")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(serDoorHoliday);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.508+08:00", comments="Source Table: Ser_Door_Holiday")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, serDoorHoliday);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.508+08:00", comments="Source Table: Ser_Door_Holiday")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, serDoorHoliday)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.508+08:00", comments="Source Table: Ser_Door_Holiday")
    default int insert(SerDoorHoliday record) {
        return insert(SqlBuilder.insert(record)
                .into(serDoorHoliday)
                .map(sdate).toProperty("sdate")
                .map(devcnum).toProperty("devcnum")
                .map(doorid).toProperty("doorid")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.508+08:00", comments="Source Table: Ser_Door_Holiday")
    default int insertSelective(SerDoorHoliday record) {
        return insert(SqlBuilder.insert(record)
                .into(serDoorHoliday)
                .map(sdate).toPropertyWhenPresent("sdate", record::getSdate)
                .map(devcnum).toPropertyWhenPresent("devcnum", record::getDevcnum)
                .map(doorid).toPropertyWhenPresent("doorid", record::getDoorid)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.508+08:00", comments="Source Table: Ser_Door_Holiday")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<SerDoorHoliday>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, sdate, devcnum, doorid)
                .from(serDoorHoliday);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.508+08:00", comments="Source Table: Ser_Door_Holiday")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<SerDoorHoliday>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, sdate, devcnum, doorid)
                .from(serDoorHoliday);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.508+08:00", comments="Source Table: Ser_Door_Holiday")
    default SerDoorHoliday selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, sdate, devcnum, doorid)
                .from(serDoorHoliday)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.508+08:00", comments="Source Table: Ser_Door_Holiday")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(SerDoorHoliday record) {
        return UpdateDSL.updateWithMapper(this::update, serDoorHoliday)
                .set(sdate).equalTo(record::getSdate)
                .set(devcnum).equalTo(record::getDevcnum)
                .set(doorid).equalTo(record::getDoorid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.508+08:00", comments="Source Table: Ser_Door_Holiday")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(SerDoorHoliday record) {
        return UpdateDSL.updateWithMapper(this::update, serDoorHoliday)
                .set(sdate).equalToWhenPresent(record::getSdate)
                .set(devcnum).equalToWhenPresent(record::getDevcnum)
                .set(doorid).equalToWhenPresent(record::getDoorid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.508+08:00", comments="Source Table: Ser_Door_Holiday")
    default int updateByPrimaryKey(SerDoorHoliday record) {
        return UpdateDSL.updateWithMapper(this::update, serDoorHoliday)
                .set(sdate).equalTo(record::getSdate)
                .set(devcnum).equalTo(record::getDevcnum)
                .set(doorid).equalTo(record::getDoorid)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.508+08:00", comments="Source Table: Ser_Door_Holiday")
    default int updateByPrimaryKeySelective(SerDoorHoliday record) {
        return UpdateDSL.updateWithMapper(this::update, serDoorHoliday)
                .set(sdate).equalToWhenPresent(record::getSdate)
                .set(devcnum).equalToWhenPresent(record::getDevcnum)
                .set(doorid).equalToWhenPresent(record::getDoorid)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}