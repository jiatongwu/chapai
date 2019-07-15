package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.ZhSentryboxDynamicSqlSupport.*;

import cn.xvkang.primaryentity.ZhSentrybox;
import java.util.List;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectKey;
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
public interface ZhSentryboxDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.970+08:00", comments="Source Table: zh_SentryBox")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.970+08:00", comments="Source Table: zh_SentryBox")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.970+08:00", comments="Source Table: zh_SentryBox")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<ZhSentrybox> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.970+08:00", comments="Source Table: zh_SentryBox")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ZhSentryboxResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER),
        @Result(column="sentrybox_No", property="sentryboxNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="vehichlejson", property="vehichlejson", jdbcType=JdbcType.VARCHAR),
        @Result(column="eidtTime", property="eidttime", jdbcType=JdbcType.VARCHAR),
        @Result(column="synflag", property="synflag", jdbcType=JdbcType.INTEGER)
    })
    List<ZhSentrybox> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.970+08:00", comments="Source Table: zh_SentryBox")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.971+08:00", comments="Source Table: zh_SentryBox")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(zhSentrybox);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.971+08:00", comments="Source Table: zh_SentryBox")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, zhSentrybox);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.971+08:00", comments="Source Table: zh_SentryBox")
    default int insert(ZhSentrybox record) {
        return insert(SqlBuilder.insert(record)
                .into(zhSentrybox)
                .map(sentryboxNo).toProperty("sentryboxNo")
                .map(vehichlejson).toProperty("vehichlejson")
                .map(eidttime).toProperty("eidttime")
                .map(synflag).toProperty("synflag")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.971+08:00", comments="Source Table: zh_SentryBox")
    default int insertSelective(ZhSentrybox record) {
        return insert(SqlBuilder.insert(record)
                .into(zhSentrybox)
                .map(sentryboxNo).toPropertyWhenPresent("sentryboxNo", record::getSentryboxNo)
                .map(vehichlejson).toPropertyWhenPresent("vehichlejson", record::getVehichlejson)
                .map(eidttime).toPropertyWhenPresent("eidttime", record::getEidttime)
                .map(synflag).toPropertyWhenPresent("synflag", record::getSynflag)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.971+08:00", comments="Source Table: zh_SentryBox")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ZhSentrybox>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, sentryboxNo, vehichlejson, eidttime, synflag)
                .from(zhSentrybox);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.971+08:00", comments="Source Table: zh_SentryBox")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ZhSentrybox>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, sentryboxNo, vehichlejson, eidttime, synflag)
                .from(zhSentrybox);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.971+08:00", comments="Source Table: zh_SentryBox")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(ZhSentrybox record) {
        return UpdateDSL.updateWithMapper(this::update, zhSentrybox)
                .set(sentryboxNo).equalTo(record::getSentryboxNo)
                .set(vehichlejson).equalTo(record::getVehichlejson)
                .set(eidttime).equalTo(record::getEidttime)
                .set(synflag).equalTo(record::getSynflag);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.971+08:00", comments="Source Table: zh_SentryBox")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(ZhSentrybox record) {
        return UpdateDSL.updateWithMapper(this::update, zhSentrybox)
                .set(sentryboxNo).equalToWhenPresent(record::getSentryboxNo)
                .set(vehichlejson).equalToWhenPresent(record::getVehichlejson)
                .set(eidttime).equalToWhenPresent(record::getEidttime)
                .set(synflag).equalToWhenPresent(record::getSynflag);
    }
}