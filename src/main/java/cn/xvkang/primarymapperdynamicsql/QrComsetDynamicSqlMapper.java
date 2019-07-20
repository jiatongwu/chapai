package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.QrComsetDynamicSqlSupport.*;

import cn.xvkang.primaryentity.QrComset;
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
public interface QrComsetDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.460+08:00", comments="Source Table: Qr_ComSet")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.460+08:00", comments="Source Table: Qr_ComSet")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.460+08:00", comments="Source Table: Qr_ComSet")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<QrComset> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.460+08:00", comments="Source Table: Qr_ComSet")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="QrComsetResult", value = {
        @Result(column="com", property="com", jdbcType=JdbcType.INTEGER)
    })
    List<QrComset> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.461+08:00", comments="Source Table: Qr_ComSet")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.461+08:00", comments="Source Table: Qr_ComSet")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(qrComset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.461+08:00", comments="Source Table: Qr_ComSet")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, qrComset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.461+08:00", comments="Source Table: Qr_ComSet")
    default int insert(QrComset record) {
        return insert(SqlBuilder.insert(record)
                .into(qrComset)
                .map(com).toProperty("com")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.461+08:00", comments="Source Table: Qr_ComSet")
    default int insertSelective(QrComset record) {
        return insert(SqlBuilder.insert(record)
                .into(qrComset)
                .map(com).toPropertyWhenPresent("com", record::getCom)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.461+08:00", comments="Source Table: Qr_ComSet")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<QrComset>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, com)
                .from(qrComset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.461+08:00", comments="Source Table: Qr_ComSet")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<QrComset>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, com)
                .from(qrComset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.461+08:00", comments="Source Table: Qr_ComSet")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(QrComset record) {
        return UpdateDSL.updateWithMapper(this::update, qrComset)
                .set(com).equalTo(record::getCom);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.461+08:00", comments="Source Table: Qr_ComSet")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(QrComset record) {
        return UpdateDSL.updateWithMapper(this::update, qrComset)
                .set(com).equalToWhenPresent(record::getCom);
    }
}