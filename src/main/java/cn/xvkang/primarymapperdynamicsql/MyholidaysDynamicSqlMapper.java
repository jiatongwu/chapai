package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MyholidaysDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.Myholidays;
import java.util.Date;
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
public interface MyholidaysDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.804+08:00", comments="Source Table: MyHolidays")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.804+08:00", comments="Source Table: MyHolidays")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.804+08:00", comments="Source Table: MyHolidays")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.holidaystime", before=true, resultType=Date.class)
    int insert(InsertStatementProvider<Myholidays> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.804+08:00", comments="Source Table: MyHolidays")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MyholidaysResult")
    Myholidays selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.804+08:00", comments="Source Table: MyHolidays")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MyholidaysResult", value = {
        @Result(column="HolidaysTime", property="holidaystime", jdbcType=JdbcType.TIMESTAMP, id=true),
        @Result(column="HolidaysContent", property="holidayscontent", jdbcType=JdbcType.VARCHAR)
    })
    List<Myholidays> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.804+08:00", comments="Source Table: MyHolidays")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.804+08:00", comments="Source Table: MyHolidays")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(myholidays);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.804+08:00", comments="Source Table: MyHolidays")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, myholidays);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.804+08:00", comments="Source Table: MyHolidays")
    default int deleteByPrimaryKey(Date holidaystime_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, myholidays)
                .where(holidaystime, isEqualTo(holidaystime_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.804+08:00", comments="Source Table: MyHolidays")
    default int insert(Myholidays record) {
        return insert(SqlBuilder.insert(record)
                .into(myholidays)
                .map(holidaystime).toProperty("holidaystime")
                .map(holidayscontent).toProperty("holidayscontent")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.804+08:00", comments="Source Table: MyHolidays")
    default int insertSelective(Myholidays record) {
        return insert(SqlBuilder.insert(record)
                .into(myholidays)
                .map(holidaystime).toProperty("holidaystime")
                .map(holidayscontent).toPropertyWhenPresent("holidayscontent", record::getHolidayscontent)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.804+08:00", comments="Source Table: MyHolidays")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myholidays>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, holidaystime, holidayscontent)
                .from(myholidays);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.804+08:00", comments="Source Table: MyHolidays")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myholidays>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, holidaystime, holidayscontent)
                .from(myholidays);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.804+08:00", comments="Source Table: MyHolidays")
    default Myholidays selectByPrimaryKey(Date holidaystime_) {
        return SelectDSL.selectWithMapper(this::selectOne, holidaystime, holidayscontent)
                .from(myholidays)
                .where(holidaystime, isEqualTo(holidaystime_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.804+08:00", comments="Source Table: MyHolidays")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Myholidays record) {
        return UpdateDSL.updateWithMapper(this::update, myholidays)
                .set(holidaystime).equalTo(record::getHolidaystime)
                .set(holidayscontent).equalTo(record::getHolidayscontent);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.804+08:00", comments="Source Table: MyHolidays")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Myholidays record) {
        return UpdateDSL.updateWithMapper(this::update, myholidays)
                .set(holidaystime).equalToWhenPresent(record::getHolidaystime)
                .set(holidayscontent).equalToWhenPresent(record::getHolidayscontent);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.804+08:00", comments="Source Table: MyHolidays")
    default int updateByPrimaryKey(Myholidays record) {
        return UpdateDSL.updateWithMapper(this::update, myholidays)
                .set(holidayscontent).equalTo(record::getHolidayscontent)
                .where(holidaystime, isEqualTo(record::getHolidaystime))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.804+08:00", comments="Source Table: MyHolidays")
    default int updateByPrimaryKeySelective(Myholidays record) {
        return UpdateDSL.updateWithMapper(this::update, myholidays)
                .set(holidayscontent).equalToWhenPresent(record::getHolidayscontent)
                .where(holidaystime, isEqualTo(record::getHolidaystime))
                .build()
                .execute();
    }
}