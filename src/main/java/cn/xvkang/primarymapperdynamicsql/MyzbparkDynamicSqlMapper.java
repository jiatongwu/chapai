package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MyzbparkDynamicSqlSupport.*;

import cn.xvkang.primaryentity.Myzbpark;
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
public interface MyzbparkDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.817+08:00", comments="Source Table: MYZBPARK")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.817+08:00", comments="Source Table: MYZBPARK")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.817+08:00", comments="Source Table: MYZBPARK")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Myzbpark> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.817+08:00", comments="Source Table: MYZBPARK")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MyzbparkResult", value = {
        @Result(column="CtrlNumber", property="ctrlnumber", jdbcType=JdbcType.INTEGER),
        @Result(column="Location", property="location", jdbcType=JdbcType.VARCHAR)
    })
    List<Myzbpark> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.817+08:00", comments="Source Table: MYZBPARK")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.817+08:00", comments="Source Table: MYZBPARK")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(myzbpark);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.817+08:00", comments="Source Table: MYZBPARK")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, myzbpark);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.817+08:00", comments="Source Table: MYZBPARK")
    default int insert(Myzbpark record) {
        return insert(SqlBuilder.insert(record)
                .into(myzbpark)
                .map(ctrlnumber).toProperty("ctrlnumber")
                .map(location).toProperty("location")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.817+08:00", comments="Source Table: MYZBPARK")
    default int insertSelective(Myzbpark record) {
        return insert(SqlBuilder.insert(record)
                .into(myzbpark)
                .map(ctrlnumber).toPropertyWhenPresent("ctrlnumber", record::getCtrlnumber)
                .map(location).toPropertyWhenPresent("location", record::getLocation)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.817+08:00", comments="Source Table: MYZBPARK")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myzbpark>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, ctrlnumber, location)
                .from(myzbpark);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.817+08:00", comments="Source Table: MYZBPARK")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myzbpark>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, ctrlnumber, location)
                .from(myzbpark);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.817+08:00", comments="Source Table: MYZBPARK")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Myzbpark record) {
        return UpdateDSL.updateWithMapper(this::update, myzbpark)
                .set(ctrlnumber).equalTo(record::getCtrlnumber)
                .set(location).equalTo(record::getLocation);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.817+08:00", comments="Source Table: MYZBPARK")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Myzbpark record) {
        return UpdateDSL.updateWithMapper(this::update, myzbpark)
                .set(ctrlnumber).equalToWhenPresent(record::getCtrlnumber)
                .set(location).equalToWhenPresent(record::getLocation);
    }
}