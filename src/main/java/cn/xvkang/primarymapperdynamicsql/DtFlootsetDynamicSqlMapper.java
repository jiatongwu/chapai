package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.DtFlootsetDynamicSqlSupport.*;

import cn.xvkang.primaryentity.DtFlootset;
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
public interface DtFlootsetDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.996+08:00", comments="Source Table: Dt_FlootSet")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.996+08:00", comments="Source Table: Dt_FlootSet")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.996+08:00", comments="Source Table: Dt_FlootSet")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<DtFlootset> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.996+08:00", comments="Source Table: Dt_FlootSet")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="DtFlootsetResult", value = {
        @Result(column="Floot", property="floot", jdbcType=JdbcType.INTEGER)
    })
    List<DtFlootset> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.997+08:00", comments="Source Table: Dt_FlootSet")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.997+08:00", comments="Source Table: Dt_FlootSet")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(dtFlootset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.997+08:00", comments="Source Table: Dt_FlootSet")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, dtFlootset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.997+08:00", comments="Source Table: Dt_FlootSet")
    default int insert(DtFlootset record) {
        return insert(SqlBuilder.insert(record)
                .into(dtFlootset)
                .map(floot).toProperty("floot")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.997+08:00", comments="Source Table: Dt_FlootSet")
    default int insertSelective(DtFlootset record) {
        return insert(SqlBuilder.insert(record)
                .into(dtFlootset)
                .map(floot).toPropertyWhenPresent("floot", record::getFloot)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.997+08:00", comments="Source Table: Dt_FlootSet")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<DtFlootset>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, floot)
                .from(dtFlootset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.997+08:00", comments="Source Table: Dt_FlootSet")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<DtFlootset>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, floot)
                .from(dtFlootset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.997+08:00", comments="Source Table: Dt_FlootSet")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(DtFlootset record) {
        return UpdateDSL.updateWithMapper(this::update, dtFlootset)
                .set(floot).equalTo(record::getFloot);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.997+08:00", comments="Source Table: Dt_FlootSet")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(DtFlootset record) {
        return UpdateDSL.updateWithMapper(this::update, dtFlootset)
                .set(floot).equalToWhenPresent(record::getFloot);
    }
}