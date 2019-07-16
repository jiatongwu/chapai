package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MychechangstatusDynamicSqlSupport.*;

import cn.xvkang.primaryentity.Mychechangstatus;
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
public interface MychechangstatusDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.688+08:00", comments="Source Table: MYCHECHANGSTATUS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.688+08:00", comments="Source Table: MYCHECHANGSTATUS")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.688+08:00", comments="Source Table: MYCHECHANGSTATUS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Mychechangstatus> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.688+08:00", comments="Source Table: MYCHECHANGSTATUS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MychechangstatusResult", value = {
        @Result(column="PCName", property="pcname", jdbcType=JdbcType.VARCHAR),
        @Result(column="Online", property="online", jdbcType=JdbcType.INTEGER)
    })
    List<Mychechangstatus> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.688+08:00", comments="Source Table: MYCHECHANGSTATUS")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.688+08:00", comments="Source Table: MYCHECHANGSTATUS")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(mychechangstatus);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.688+08:00", comments="Source Table: MYCHECHANGSTATUS")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, mychechangstatus);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.688+08:00", comments="Source Table: MYCHECHANGSTATUS")
    default int insert(Mychechangstatus record) {
        return insert(SqlBuilder.insert(record)
                .into(mychechangstatus)
                .map(pcname).toProperty("pcname")
                .map(online).toProperty("online")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.689+08:00", comments="Source Table: MYCHECHANGSTATUS")
    default int insertSelective(Mychechangstatus record) {
        return insert(SqlBuilder.insert(record)
                .into(mychechangstatus)
                .map(pcname).toPropertyWhenPresent("pcname", record::getPcname)
                .map(online).toPropertyWhenPresent("online", record::getOnline)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.689+08:00", comments="Source Table: MYCHECHANGSTATUS")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Mychechangstatus>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, pcname, online)
                .from(mychechangstatus);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.690+08:00", comments="Source Table: MYCHECHANGSTATUS")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Mychechangstatus>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, pcname, online)
                .from(mychechangstatus);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.690+08:00", comments="Source Table: MYCHECHANGSTATUS")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Mychechangstatus record) {
        return UpdateDSL.updateWithMapper(this::update, mychechangstatus)
                .set(pcname).equalTo(record::getPcname)
                .set(online).equalTo(record::getOnline);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.690+08:00", comments="Source Table: MYCHECHANGSTATUS")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Mychechangstatus record) {
        return UpdateDSL.updateWithMapper(this::update, mychechangstatus)
                .set(pcname).equalToWhenPresent(record::getPcname)
                .set(online).equalToWhenPresent(record::getOnline);
    }
}