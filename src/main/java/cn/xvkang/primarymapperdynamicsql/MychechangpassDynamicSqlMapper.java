package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MychechangpassDynamicSqlSupport.*;

import cn.xvkang.primaryentity.Mychechangpass;
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
public interface MychechangpassDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.505+08:00", comments="Source Table: MYCHECHANGPASS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.505+08:00", comments="Source Table: MYCHECHANGPASS")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.505+08:00", comments="Source Table: MYCHECHANGPASS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Mychechangpass> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.505+08:00", comments="Source Table: MYCHECHANGPASS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MychechangpassResult", value = {
        @Result(column="Pwd", property="pwd", jdbcType=JdbcType.VARCHAR),
        @Result(column="PCName", property="pcname", jdbcType=JdbcType.VARCHAR),
        @Result(column="BakeupTime", property="bakeuptime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Mychechangpass> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.505+08:00", comments="Source Table: MYCHECHANGPASS")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.505+08:00", comments="Source Table: MYCHECHANGPASS")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(mychechangpass);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.505+08:00", comments="Source Table: MYCHECHANGPASS")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, mychechangpass);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.505+08:00", comments="Source Table: MYCHECHANGPASS")
    default int insert(Mychechangpass record) {
        return insert(SqlBuilder.insert(record)
                .into(mychechangpass)
                .map(pwd).toProperty("pwd")
                .map(pcname).toProperty("pcname")
                .map(bakeuptime).toProperty("bakeuptime")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.506+08:00", comments="Source Table: MYCHECHANGPASS")
    default int insertSelective(Mychechangpass record) {
        return insert(SqlBuilder.insert(record)
                .into(mychechangpass)
                .map(pwd).toPropertyWhenPresent("pwd", record::getPwd)
                .map(pcname).toPropertyWhenPresent("pcname", record::getPcname)
                .map(bakeuptime).toPropertyWhenPresent("bakeuptime", record::getBakeuptime)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.506+08:00", comments="Source Table: MYCHECHANGPASS")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Mychechangpass>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, pwd, pcname, bakeuptime)
                .from(mychechangpass);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.506+08:00", comments="Source Table: MYCHECHANGPASS")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Mychechangpass>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, pwd, pcname, bakeuptime)
                .from(mychechangpass);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.506+08:00", comments="Source Table: MYCHECHANGPASS")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Mychechangpass record) {
        return UpdateDSL.updateWithMapper(this::update, mychechangpass)
                .set(pwd).equalTo(record::getPwd)
                .set(pcname).equalTo(record::getPcname)
                .set(bakeuptime).equalTo(record::getBakeuptime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.506+08:00", comments="Source Table: MYCHECHANGPASS")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Mychechangpass record) {
        return UpdateDSL.updateWithMapper(this::update, mychechangpass)
                .set(pwd).equalToWhenPresent(record::getPwd)
                .set(pcname).equalToWhenPresent(record::getPcname)
                .set(bakeuptime).equalToWhenPresent(record::getBakeuptime);
    }
}