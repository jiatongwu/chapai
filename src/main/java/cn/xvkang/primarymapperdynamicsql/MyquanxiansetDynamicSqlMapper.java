package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MyquanxiansetDynamicSqlSupport.*;

import cn.xvkang.primaryentity.Myquanxianset;
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
public interface MyquanxiansetDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.786+08:00", comments="Source Table: MYQUANXIANSET")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.786+08:00", comments="Source Table: MYQUANXIANSET")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.786+08:00", comments="Source Table: MYQUANXIANSET")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Myquanxianset> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.786+08:00", comments="Source Table: MYQUANXIANSET")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MyquanxiansetResult", value = {
        @Result(column="FormName", property="formname", jdbcType=JdbcType.VARCHAR),
        @Result(column="MenuName", property="menuname", jdbcType=JdbcType.VARCHAR),
        @Result(column="MenuText", property="menutext", jdbcType=JdbcType.VARCHAR),
        @Result(column="ValidMark", property="validmark", jdbcType=JdbcType.VARCHAR),
        @Result(column="KEYVALUE", property="keyvalue", jdbcType=JdbcType.VARCHAR)
    })
    List<Myquanxianset> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.786+08:00", comments="Source Table: MYQUANXIANSET")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.786+08:00", comments="Source Table: MYQUANXIANSET")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(myquanxianset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.786+08:00", comments="Source Table: MYQUANXIANSET")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, myquanxianset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.786+08:00", comments="Source Table: MYQUANXIANSET")
    default int insert(Myquanxianset record) {
        return insert(SqlBuilder.insert(record)
                .into(myquanxianset)
                .map(formname).toProperty("formname")
                .map(menuname).toProperty("menuname")
                .map(menutext).toProperty("menutext")
                .map(validmark).toProperty("validmark")
                .map(keyvalue).toProperty("keyvalue")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.786+08:00", comments="Source Table: MYQUANXIANSET")
    default int insertSelective(Myquanxianset record) {
        return insert(SqlBuilder.insert(record)
                .into(myquanxianset)
                .map(formname).toPropertyWhenPresent("formname", record::getFormname)
                .map(menuname).toPropertyWhenPresent("menuname", record::getMenuname)
                .map(menutext).toPropertyWhenPresent("menutext", record::getMenutext)
                .map(validmark).toPropertyWhenPresent("validmark", record::getValidmark)
                .map(keyvalue).toPropertyWhenPresent("keyvalue", record::getKeyvalue)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.786+08:00", comments="Source Table: MYQUANXIANSET")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myquanxianset>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, formname, menuname, menutext, validmark, keyvalue)
                .from(myquanxianset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.786+08:00", comments="Source Table: MYQUANXIANSET")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myquanxianset>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, formname, menuname, menutext, validmark, keyvalue)
                .from(myquanxianset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.786+08:00", comments="Source Table: MYQUANXIANSET")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Myquanxianset record) {
        return UpdateDSL.updateWithMapper(this::update, myquanxianset)
                .set(formname).equalTo(record::getFormname)
                .set(menuname).equalTo(record::getMenuname)
                .set(menutext).equalTo(record::getMenutext)
                .set(validmark).equalTo(record::getValidmark)
                .set(keyvalue).equalTo(record::getKeyvalue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.786+08:00", comments="Source Table: MYQUANXIANSET")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Myquanxianset record) {
        return UpdateDSL.updateWithMapper(this::update, myquanxianset)
                .set(formname).equalToWhenPresent(record::getFormname)
                .set(menuname).equalToWhenPresent(record::getMenuname)
                .set(menutext).equalToWhenPresent(record::getMenutext)
                .set(validmark).equalToWhenPresent(record::getValidmark)
                .set(keyvalue).equalToWhenPresent(record::getKeyvalue);
    }
}