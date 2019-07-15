package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.OptstatelogDynamicSqlSupport.*;

import cn.xvkang.primaryentity.Optstatelog;
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
public interface OptstatelogDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.898+08:00", comments="Source Table: OptStateLog")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.898+08:00", comments="Source Table: OptStateLog")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.898+08:00", comments="Source Table: OptStateLog")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Optstatelog> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.898+08:00", comments="Source Table: OptStateLog")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="OptstatelogResult", value = {
        @Result(column="OptCardNO", property="optcardno", jdbcType=JdbcType.VARCHAR),
        @Result(column="UserName", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="OptMenu", property="optmenu", jdbcType=JdbcType.VARCHAR),
        @Result(column="OptContent", property="optcontent", jdbcType=JdbcType.VARCHAR),
        @Result(column="PCName", property="pcname", jdbcType=JdbcType.VARCHAR),
        @Result(column="OptTime", property="opttime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Optstatelog> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.898+08:00", comments="Source Table: OptStateLog")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.898+08:00", comments="Source Table: OptStateLog")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(optstatelog);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.898+08:00", comments="Source Table: OptStateLog")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, optstatelog);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.898+08:00", comments="Source Table: OptStateLog")
    default int insert(Optstatelog record) {
        return insert(SqlBuilder.insert(record)
                .into(optstatelog)
                .map(optcardno).toProperty("optcardno")
                .map(username).toProperty("username")
                .map(optmenu).toProperty("optmenu")
                .map(optcontent).toProperty("optcontent")
                .map(pcname).toProperty("pcname")
                .map(opttime).toProperty("opttime")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.898+08:00", comments="Source Table: OptStateLog")
    default int insertSelective(Optstatelog record) {
        return insert(SqlBuilder.insert(record)
                .into(optstatelog)
                .map(optcardno).toPropertyWhenPresent("optcardno", record::getOptcardno)
                .map(username).toPropertyWhenPresent("username", record::getUsername)
                .map(optmenu).toPropertyWhenPresent("optmenu", record::getOptmenu)
                .map(optcontent).toPropertyWhenPresent("optcontent", record::getOptcontent)
                .map(pcname).toPropertyWhenPresent("pcname", record::getPcname)
                .map(opttime).toPropertyWhenPresent("opttime", record::getOpttime)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.898+08:00", comments="Source Table: OptStateLog")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Optstatelog>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, optcardno, username, optmenu, optcontent, pcname, opttime)
                .from(optstatelog);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.898+08:00", comments="Source Table: OptStateLog")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Optstatelog>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, optcardno, username, optmenu, optcontent, pcname, opttime)
                .from(optstatelog);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.898+08:00", comments="Source Table: OptStateLog")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Optstatelog record) {
        return UpdateDSL.updateWithMapper(this::update, optstatelog)
                .set(optcardno).equalTo(record::getOptcardno)
                .set(username).equalTo(record::getUsername)
                .set(optmenu).equalTo(record::getOptmenu)
                .set(optcontent).equalTo(record::getOptcontent)
                .set(pcname).equalTo(record::getPcname)
                .set(opttime).equalTo(record::getOpttime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.899+08:00", comments="Source Table: OptStateLog")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Optstatelog record) {
        return UpdateDSL.updateWithMapper(this::update, optstatelog)
                .set(optcardno).equalToWhenPresent(record::getOptcardno)
                .set(username).equalToWhenPresent(record::getUsername)
                .set(optmenu).equalToWhenPresent(record::getOptmenu)
                .set(optcontent).equalToWhenPresent(record::getOptcontent)
                .set(pcname).equalToWhenPresent(record::getPcname)
                .set(opttime).equalToWhenPresent(record::getOpttime);
    }
}