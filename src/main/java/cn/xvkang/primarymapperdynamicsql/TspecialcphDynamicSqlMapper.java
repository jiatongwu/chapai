package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.TspecialcphDynamicSqlSupport.*;

import cn.xvkang.primaryentity.Tspecialcph;
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
public interface TspecialcphDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.883+08:00", comments="Source Table: tSpecialCPH")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.883+08:00", comments="Source Table: tSpecialCPH")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.883+08:00", comments="Source Table: tSpecialCPH")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Tspecialcph> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.883+08:00", comments="Source Table: tSpecialCPH")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="TspecialcphResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.BIGINT),
        @Result(column="Type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="CPH", property="cph", jdbcType=JdbcType.VARCHAR),
        @Result(column="Mode", property="mode", jdbcType=JdbcType.VARCHAR),
        @Result(column="Show", property="show", jdbcType=JdbcType.VARCHAR)
    })
    List<Tspecialcph> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.883+08:00", comments="Source Table: tSpecialCPH")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.883+08:00", comments="Source Table: tSpecialCPH")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(tspecialcph);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.883+08:00", comments="Source Table: tSpecialCPH")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, tspecialcph);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.883+08:00", comments="Source Table: tSpecialCPH")
    default int insert(Tspecialcph record) {
        return insert(SqlBuilder.insert(record)
                .into(tspecialcph)
                .map(id).toProperty("id")
                .map(type).toProperty("type")
                .map(cph).toProperty("cph")
                .map(mode).toProperty("mode")
                .map(show).toProperty("show")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.883+08:00", comments="Source Table: tSpecialCPH")
    default int insertSelective(Tspecialcph record) {
        return insert(SqlBuilder.insert(record)
                .into(tspecialcph)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(type).toPropertyWhenPresent("type", record::getType)
                .map(cph).toPropertyWhenPresent("cph", record::getCph)
                .map(mode).toPropertyWhenPresent("mode", record::getMode)
                .map(show).toPropertyWhenPresent("show", record::getShow)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.883+08:00", comments="Source Table: tSpecialCPH")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Tspecialcph>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, type, cph, mode, show)
                .from(tspecialcph);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.883+08:00", comments="Source Table: tSpecialCPH")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Tspecialcph>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, type, cph, mode, show)
                .from(tspecialcph);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.883+08:00", comments="Source Table: tSpecialCPH")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Tspecialcph record) {
        return UpdateDSL.updateWithMapper(this::update, tspecialcph)
                .set(id).equalTo(record::getId)
                .set(type).equalTo(record::getType)
                .set(cph).equalTo(record::getCph)
                .set(mode).equalTo(record::getMode)
                .set(show).equalTo(record::getShow);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.883+08:00", comments="Source Table: tSpecialCPH")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Tspecialcph record) {
        return UpdateDSL.updateWithMapper(this::update, tspecialcph)
                .set(id).equalToWhenPresent(record::getId)
                .set(type).equalToWhenPresent(record::getType)
                .set(cph).equalToWhenPresent(record::getCph)
                .set(mode).equalToWhenPresent(record::getMode)
                .set(show).equalToWhenPresent(record::getShow);
    }
}