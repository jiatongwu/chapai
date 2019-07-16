package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.AutocphDynamicSqlSupport.*;

import cn.xvkang.primaryentity.Autocph;
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
public interface AutocphDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.471+08:00", comments="Source Table: AutoCPH")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.473+08:00", comments="Source Table: AutoCPH")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.473+08:00", comments="Source Table: AutoCPH")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Autocph> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.476+08:00", comments="Source Table: AutoCPH")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AutocphResult", value = {
        @Result(column="CPH", property="cph", jdbcType=JdbcType.VARCHAR)
    })
    List<Autocph> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.477+08:00", comments="Source Table: AutoCPH")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.478+08:00", comments="Source Table: AutoCPH")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(autocph);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.479+08:00", comments="Source Table: AutoCPH")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, autocph);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.481+08:00", comments="Source Table: AutoCPH")
    default int insert(Autocph record) {
        return insert(SqlBuilder.insert(record)
                .into(autocph)
                .map(cph).toProperty("cph")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.482+08:00", comments="Source Table: AutoCPH")
    default int insertSelective(Autocph record) {
        return insert(SqlBuilder.insert(record)
                .into(autocph)
                .map(cph).toPropertyWhenPresent("cph", record::getCph)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.483+08:00", comments="Source Table: AutoCPH")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Autocph>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, cph)
                .from(autocph);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.484+08:00", comments="Source Table: AutoCPH")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Autocph>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, cph)
                .from(autocph);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.485+08:00", comments="Source Table: AutoCPH")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Autocph record) {
        return UpdateDSL.updateWithMapper(this::update, autocph)
                .set(cph).equalTo(record::getCph);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.486+08:00", comments="Source Table: AutoCPH")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Autocph record) {
        return UpdateDSL.updateWithMapper(this::update, autocph)
                .set(cph).equalToWhenPresent(record::getCph);
    }
}