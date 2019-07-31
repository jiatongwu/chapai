package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MjdowncardouttimesettbDynamicSqlSupport.*;

import cn.xvkang.primaryentity.Mjdowncardouttimesettb;
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
public interface MjdowncardouttimesettbDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.960+08:00", comments="Source Table: MJDownCardOutTimeSettb")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.960+08:00", comments="Source Table: MJDownCardOutTimeSettb")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.960+08:00", comments="Source Table: MJDownCardOutTimeSettb")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Mjdowncardouttimesettb> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.960+08:00", comments="Source Table: MJDownCardOutTimeSettb")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MjdowncardouttimesettbResult", value = {
        @Result(column="outtime", property="outtime", jdbcType=JdbcType.INTEGER)
    })
    List<Mjdowncardouttimesettb> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.960+08:00", comments="Source Table: MJDownCardOutTimeSettb")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.961+08:00", comments="Source Table: MJDownCardOutTimeSettb")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(mjdowncardouttimesettb);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.961+08:00", comments="Source Table: MJDownCardOutTimeSettb")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, mjdowncardouttimesettb);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.961+08:00", comments="Source Table: MJDownCardOutTimeSettb")
    default int insert(Mjdowncardouttimesettb record) {
        return insert(SqlBuilder.insert(record)
                .into(mjdowncardouttimesettb)
                .map(outtime).toProperty("outtime")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.961+08:00", comments="Source Table: MJDownCardOutTimeSettb")
    default int insertSelective(Mjdowncardouttimesettb record) {
        return insert(SqlBuilder.insert(record)
                .into(mjdowncardouttimesettb)
                .map(outtime).toPropertyWhenPresent("outtime", record::getOuttime)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.961+08:00", comments="Source Table: MJDownCardOutTimeSettb")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Mjdowncardouttimesettb>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, outtime)
                .from(mjdowncardouttimesettb);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.961+08:00", comments="Source Table: MJDownCardOutTimeSettb")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Mjdowncardouttimesettb>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, outtime)
                .from(mjdowncardouttimesettb);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.961+08:00", comments="Source Table: MJDownCardOutTimeSettb")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Mjdowncardouttimesettb record) {
        return UpdateDSL.updateWithMapper(this::update, mjdowncardouttimesettb)
                .set(outtime).equalTo(record::getOuttime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.961+08:00", comments="Source Table: MJDownCardOutTimeSettb")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Mjdowncardouttimesettb record) {
        return UpdateDSL.updateWithMapper(this::update, mjdowncardouttimesettb)
                .set(outtime).equalToWhenPresent(record::getOuttime);
    }
}