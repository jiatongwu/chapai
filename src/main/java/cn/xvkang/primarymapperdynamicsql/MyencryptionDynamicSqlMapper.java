package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MyencryptionDynamicSqlSupport.*;

import cn.xvkang.primaryentity.Myencryption;
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
public interface MyencryptionDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.881+08:00", comments="Source Table: MyEncryption")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.881+08:00", comments="Source Table: MyEncryption")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.881+08:00", comments="Source Table: MyEncryption")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Myencryption> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.881+08:00", comments="Source Table: MyEncryption")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MyencryptionResult", value = {
        @Result(column="SQLkey", property="sqlkey", jdbcType=JdbcType.VARCHAR)
    })
    List<Myencryption> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.881+08:00", comments="Source Table: MyEncryption")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.881+08:00", comments="Source Table: MyEncryption")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(myencryption);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.881+08:00", comments="Source Table: MyEncryption")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, myencryption);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.881+08:00", comments="Source Table: MyEncryption")
    default int insert(Myencryption record) {
        return insert(SqlBuilder.insert(record)
                .into(myencryption)
                .map(sqlkey).toProperty("sqlkey")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.881+08:00", comments="Source Table: MyEncryption")
    default int insertSelective(Myencryption record) {
        return insert(SqlBuilder.insert(record)
                .into(myencryption)
                .map(sqlkey).toPropertyWhenPresent("sqlkey", record::getSqlkey)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.881+08:00", comments="Source Table: MyEncryption")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myencryption>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, sqlkey)
                .from(myencryption);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.881+08:00", comments="Source Table: MyEncryption")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myencryption>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, sqlkey)
                .from(myencryption);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.881+08:00", comments="Source Table: MyEncryption")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Myencryption record) {
        return UpdateDSL.updateWithMapper(this::update, myencryption)
                .set(sqlkey).equalTo(record::getSqlkey);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.881+08:00", comments="Source Table: MyEncryption")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Myencryption record) {
        return UpdateDSL.updateWithMapper(this::update, myencryption)
                .set(sqlkey).equalToWhenPresent(record::getSqlkey);
    }
}