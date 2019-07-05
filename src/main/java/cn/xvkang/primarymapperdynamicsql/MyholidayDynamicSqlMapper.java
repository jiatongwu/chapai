package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MyholidayDynamicSqlSupport.*;

import cn.xvkang.primaryentity.Myholiday;
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
public interface MyholidayDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.768+08:00", comments="Source Table: MyHoliday")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.768+08:00", comments="Source Table: MyHoliday")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.768+08:00", comments="Source Table: MyHoliday")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Myholiday> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.768+08:00", comments="Source Table: MyHoliday")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MyholidayResult", value = {
        @Result(column="Dates", property="dates", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="Types", property="types", jdbcType=JdbcType.VARCHAR)
    })
    List<Myholiday> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.768+08:00", comments="Source Table: MyHoliday")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.768+08:00", comments="Source Table: MyHoliday")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(myholiday);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.768+08:00", comments="Source Table: MyHoliday")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, myholiday);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.768+08:00", comments="Source Table: MyHoliday")
    default int insert(Myholiday record) {
        return insert(SqlBuilder.insert(record)
                .into(myholiday)
                .map(dates).toProperty("dates")
                .map(types).toProperty("types")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.768+08:00", comments="Source Table: MyHoliday")
    default int insertSelective(Myholiday record) {
        return insert(SqlBuilder.insert(record)
                .into(myholiday)
                .map(dates).toPropertyWhenPresent("dates", record::getDates)
                .map(types).toPropertyWhenPresent("types", record::getTypes)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.768+08:00", comments="Source Table: MyHoliday")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myholiday>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, dates, types)
                .from(myholiday);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.769+08:00", comments="Source Table: MyHoliday")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myholiday>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, dates, types)
                .from(myholiday);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.769+08:00", comments="Source Table: MyHoliday")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Myholiday record) {
        return UpdateDSL.updateWithMapper(this::update, myholiday)
                .set(dates).equalTo(record::getDates)
                .set(types).equalTo(record::getTypes);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.769+08:00", comments="Source Table: MyHoliday")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Myholiday record) {
        return UpdateDSL.updateWithMapper(this::update, myholiday)
                .set(dates).equalToWhenPresent(record::getDates)
                .set(types).equalToWhenPresent(record::getTypes);
    }
}