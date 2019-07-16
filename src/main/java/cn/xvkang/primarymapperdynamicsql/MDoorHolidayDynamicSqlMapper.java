package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MDoorHolidayDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.MDoorHoliday;
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
public interface MDoorHolidayDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.837+08:00", comments="Source Table: M_Door_Holiday")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.837+08:00", comments="Source Table: M_Door_Holiday")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.837+08:00", comments="Source Table: M_Door_Holiday")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<MDoorHoliday> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.837+08:00", comments="Source Table: M_Door_Holiday")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MDoorHolidayResult")
    MDoorHoliday selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.837+08:00", comments="Source Table: M_Door_Holiday")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MDoorHolidayResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="sDate", property="sdate", jdbcType=JdbcType.VARCHAR),
        @Result(column="DevcNum", property="devcnum", jdbcType=JdbcType.INTEGER),
        @Result(column="DoorLei", property="doorlei", jdbcType=JdbcType.INTEGER)
    })
    List<MDoorHoliday> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.838+08:00", comments="Source Table: M_Door_Holiday")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.838+08:00", comments="Source Table: M_Door_Holiday")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(MDoorHoliday);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.838+08:00", comments="Source Table: M_Door_Holiday")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, MDoorHoliday);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.838+08:00", comments="Source Table: M_Door_Holiday")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, MDoorHoliday)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.838+08:00", comments="Source Table: M_Door_Holiday")
    default int insert(MDoorHoliday record) {
        return insert(SqlBuilder.insert(record)
                .into(MDoorHoliday)
                .map(sdate).toProperty("sdate")
                .map(devcnum).toProperty("devcnum")
                .map(doorlei).toProperty("doorlei")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.838+08:00", comments="Source Table: M_Door_Holiday")
    default int insertSelective(MDoorHoliday record) {
        return insert(SqlBuilder.insert(record)
                .into(MDoorHoliday)
                .map(sdate).toPropertyWhenPresent("sdate", record::getSdate)
                .map(devcnum).toPropertyWhenPresent("devcnum", record::getDevcnum)
                .map(doorlei).toPropertyWhenPresent("doorlei", record::getDoorlei)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.838+08:00", comments="Source Table: M_Door_Holiday")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<MDoorHoliday>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, sdate, devcnum, doorlei)
                .from(MDoorHoliday);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.838+08:00", comments="Source Table: M_Door_Holiday")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<MDoorHoliday>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, sdate, devcnum, doorlei)
                .from(MDoorHoliday);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.838+08:00", comments="Source Table: M_Door_Holiday")
    default MDoorHoliday selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, sdate, devcnum, doorlei)
                .from(MDoorHoliday)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.838+08:00", comments="Source Table: M_Door_Holiday")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(MDoorHoliday record) {
        return UpdateDSL.updateWithMapper(this::update, MDoorHoliday)
                .set(sdate).equalTo(record::getSdate)
                .set(devcnum).equalTo(record::getDevcnum)
                .set(doorlei).equalTo(record::getDoorlei);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.838+08:00", comments="Source Table: M_Door_Holiday")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(MDoorHoliday record) {
        return UpdateDSL.updateWithMapper(this::update, MDoorHoliday)
                .set(sdate).equalToWhenPresent(record::getSdate)
                .set(devcnum).equalToWhenPresent(record::getDevcnum)
                .set(doorlei).equalToWhenPresent(record::getDoorlei);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.838+08:00", comments="Source Table: M_Door_Holiday")
    default int updateByPrimaryKey(MDoorHoliday record) {
        return UpdateDSL.updateWithMapper(this::update, MDoorHoliday)
                .set(sdate).equalTo(record::getSdate)
                .set(devcnum).equalTo(record::getDevcnum)
                .set(doorlei).equalTo(record::getDoorlei)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.838+08:00", comments="Source Table: M_Door_Holiday")
    default int updateByPrimaryKeySelective(MDoorHoliday record) {
        return UpdateDSL.updateWithMapper(this::update, MDoorHoliday)
                .set(sdate).equalToWhenPresent(record::getSdate)
                .set(devcnum).equalToWhenPresent(record::getDevcnum)
                .set(doorlei).equalToWhenPresent(record::getDoorlei)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}