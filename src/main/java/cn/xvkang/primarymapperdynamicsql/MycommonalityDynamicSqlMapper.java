package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MycommonalityDynamicSqlSupport.*;

import cn.xvkang.primaryentity.Mycommonality;
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
public interface MycommonalityDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.801+08:00", comments="Source Table: MyCommonality")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.801+08:00", comments="Source Table: MyCommonality")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.801+08:00", comments="Source Table: MyCommonality")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Mycommonality> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.801+08:00", comments="Source Table: MyCommonality")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MycommonalityResult", value = {
        @Result(column="FileDate", property="filedate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Mycommonality> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.801+08:00", comments="Source Table: MyCommonality")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.801+08:00", comments="Source Table: MyCommonality")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(mycommonality);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.801+08:00", comments="Source Table: MyCommonality")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, mycommonality);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.801+08:00", comments="Source Table: MyCommonality")
    default int insert(Mycommonality record) {
        return insert(SqlBuilder.insert(record)
                .into(mycommonality)
                .map(filedate).toProperty("filedate")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.801+08:00", comments="Source Table: MyCommonality")
    default int insertSelective(Mycommonality record) {
        return insert(SqlBuilder.insert(record)
                .into(mycommonality)
                .map(filedate).toPropertyWhenPresent("filedate", record::getFiledate)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.801+08:00", comments="Source Table: MyCommonality")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Mycommonality>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, filedate)
                .from(mycommonality);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.801+08:00", comments="Source Table: MyCommonality")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Mycommonality>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, filedate)
                .from(mycommonality);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.801+08:00", comments="Source Table: MyCommonality")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Mycommonality record) {
        return UpdateDSL.updateWithMapper(this::update, mycommonality)
                .set(filedate).equalTo(record::getFiledate);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.801+08:00", comments="Source Table: MyCommonality")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Mycommonality record) {
        return UpdateDSL.updateWithMapper(this::update, mycommonality)
                .set(filedate).equalToWhenPresent(record::getFiledate);
    }
}