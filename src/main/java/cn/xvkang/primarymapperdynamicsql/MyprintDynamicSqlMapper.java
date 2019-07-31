package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MyprintDynamicSqlSupport.*;

import cn.xvkang.primaryentity.Myprint;
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
public interface MyprintDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.043+08:00", comments="Source Table: MYPrint")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.043+08:00", comments="Source Table: MYPrint")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.043+08:00", comments="Source Table: MYPrint")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Myprint> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.043+08:00", comments="Source Table: MYPrint")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MyprintResult", value = {
        @Result(column="Title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="FTitle", property="ftitle", jdbcType=JdbcType.VARCHAR),
        @Result(column="Footer", property="footer", jdbcType=JdbcType.VARCHAR)
    })
    List<Myprint> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.043+08:00", comments="Source Table: MYPrint")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.043+08:00", comments="Source Table: MYPrint")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(myprint);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.043+08:00", comments="Source Table: MYPrint")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, myprint);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.043+08:00", comments="Source Table: MYPrint")
    default int insert(Myprint record) {
        return insert(SqlBuilder.insert(record)
                .into(myprint)
                .map(title).toProperty("title")
                .map(ftitle).toProperty("ftitle")
                .map(footer).toProperty("footer")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.043+08:00", comments="Source Table: MYPrint")
    default int insertSelective(Myprint record) {
        return insert(SqlBuilder.insert(record)
                .into(myprint)
                .map(title).toPropertyWhenPresent("title", record::getTitle)
                .map(ftitle).toPropertyWhenPresent("ftitle", record::getFtitle)
                .map(footer).toPropertyWhenPresent("footer", record::getFooter)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.043+08:00", comments="Source Table: MYPrint")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myprint>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, title, ftitle, footer)
                .from(myprint);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.043+08:00", comments="Source Table: MYPrint")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myprint>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, title, ftitle, footer)
                .from(myprint);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.043+08:00", comments="Source Table: MYPrint")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Myprint record) {
        return UpdateDSL.updateWithMapper(this::update, myprint)
                .set(title).equalTo(record::getTitle)
                .set(ftitle).equalTo(record::getFtitle)
                .set(footer).equalTo(record::getFooter);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.043+08:00", comments="Source Table: MYPrint")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Myprint record) {
        return UpdateDSL.updateWithMapper(this::update, myprint)
                .set(title).equalToWhenPresent(record::getTitle)
                .set(ftitle).equalToWhenPresent(record::getFtitle)
                .set(footer).equalToWhenPresent(record::getFooter);
    }
}