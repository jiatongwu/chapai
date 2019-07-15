package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.TblopentypeDynamicSqlSupport.*;

import cn.xvkang.primaryentity.Tblopentype;
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
public interface TblopentypeDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.949+08:00", comments="Source Table: tblOpenType")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.950+08:00", comments="Source Table: tblOpenType")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.950+08:00", comments="Source Table: tblOpenType")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Tblopentype> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.950+08:00", comments="Source Table: tblOpenType")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="TblopentypeResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.SMALLINT),
        @Result(column="OpenType", property="opentype", jdbcType=JdbcType.VARCHAR)
    })
    List<Tblopentype> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.950+08:00", comments="Source Table: tblOpenType")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.950+08:00", comments="Source Table: tblOpenType")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(tblopentype);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.950+08:00", comments="Source Table: tblOpenType")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, tblopentype);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.950+08:00", comments="Source Table: tblOpenType")
    default int insert(Tblopentype record) {
        return insert(SqlBuilder.insert(record)
                .into(tblopentype)
                .map(id).toProperty("id")
                .map(opentype).toProperty("opentype")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.950+08:00", comments="Source Table: tblOpenType")
    default int insertSelective(Tblopentype record) {
        return insert(SqlBuilder.insert(record)
                .into(tblopentype)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(opentype).toPropertyWhenPresent("opentype", record::getOpentype)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.950+08:00", comments="Source Table: tblOpenType")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Tblopentype>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, opentype)
                .from(tblopentype);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.950+08:00", comments="Source Table: tblOpenType")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Tblopentype>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, opentype)
                .from(tblopentype);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.950+08:00", comments="Source Table: tblOpenType")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Tblopentype record) {
        return UpdateDSL.updateWithMapper(this::update, tblopentype)
                .set(id).equalTo(record::getId)
                .set(opentype).equalTo(record::getOpentype);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.950+08:00", comments="Source Table: tblOpenType")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Tblopentype record) {
        return UpdateDSL.updateWithMapper(this::update, tblopentype)
                .set(id).equalToWhenPresent(record::getId)
                .set(opentype).equalToWhenPresent(record::getOpentype);
    }
}