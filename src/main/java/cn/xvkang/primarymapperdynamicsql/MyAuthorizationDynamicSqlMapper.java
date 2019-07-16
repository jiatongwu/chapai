package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MyAuthorizationDynamicSqlSupport.*;

import cn.xvkang.primaryentity.MyAuthorization;
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
public interface MyAuthorizationDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.885+08:00", comments="Source Table: My_Authorization")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.885+08:00", comments="Source Table: My_Authorization")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.885+08:00", comments="Source Table: My_Authorization")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MyAuthorization> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.885+08:00", comments="Source Table: My_Authorization")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MyAuthorizationResult", value = {
        @Result(column="bAuthorization", property="bauthorization", jdbcType=JdbcType.BIT)
    })
    List<MyAuthorization> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.885+08:00", comments="Source Table: My_Authorization")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.885+08:00", comments="Source Table: My_Authorization")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(myAuthorization);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.885+08:00", comments="Source Table: My_Authorization")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, myAuthorization);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.885+08:00", comments="Source Table: My_Authorization")
    default int insert(MyAuthorization record) {
        return insert(SqlBuilder.insert(record)
                .into(myAuthorization)
                .map(bauthorization).toProperty("bauthorization")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.885+08:00", comments="Source Table: My_Authorization")
    default int insertSelective(MyAuthorization record) {
        return insert(SqlBuilder.insert(record)
                .into(myAuthorization)
                .map(bauthorization).toPropertyWhenPresent("bauthorization", record::getBauthorization)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.885+08:00", comments="Source Table: My_Authorization")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<MyAuthorization>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, bauthorization)
                .from(myAuthorization);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.885+08:00", comments="Source Table: My_Authorization")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<MyAuthorization>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, bauthorization)
                .from(myAuthorization);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.885+08:00", comments="Source Table: My_Authorization")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(MyAuthorization record) {
        return UpdateDSL.updateWithMapper(this::update, myAuthorization)
                .set(bauthorization).equalTo(record::getBauthorization);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.885+08:00", comments="Source Table: My_Authorization")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(MyAuthorization record) {
        return UpdateDSL.updateWithMapper(this::update, myAuthorization)
                .set(bauthorization).equalToWhenPresent(record::getBauthorization);
    }
}