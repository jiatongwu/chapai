package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.DtBaojinsetDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.DtBaojinset;
import java.util.List;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
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
public interface DtBaojinsetDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.351+08:00", comments="Source Table: Dt_BaoJinSet")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.351+08:00", comments="Source Table: Dt_BaoJinSet")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.351+08:00", comments="Source Table: Dt_BaoJinSet")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<DtBaojinset> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.351+08:00", comments="Source Table: Dt_BaoJinSet")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("DtBaojinsetResult")
    DtBaojinset selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.352+08:00", comments="Source Table: Dt_BaoJinSet")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="DtBaojinsetResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="DevcNum", property="devcnum", jdbcType=JdbcType.INTEGER),
        @Result(column="BaoJin", property="baojin", jdbcType=JdbcType.INTEGER)
    })
    List<DtBaojinset> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.352+08:00", comments="Source Table: Dt_BaoJinSet")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.352+08:00", comments="Source Table: Dt_BaoJinSet")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(dtBaojinset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.352+08:00", comments="Source Table: Dt_BaoJinSet")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, dtBaojinset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.352+08:00", comments="Source Table: Dt_BaoJinSet")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, dtBaojinset)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.352+08:00", comments="Source Table: Dt_BaoJinSet")
    default int insert(DtBaojinset record) {
        return insert(SqlBuilder.insert(record)
                .into(dtBaojinset)
                .map(devcnum).toProperty("devcnum")
                .map(baojin).toProperty("baojin")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.352+08:00", comments="Source Table: Dt_BaoJinSet")
    default int insertSelective(DtBaojinset record) {
        return insert(SqlBuilder.insert(record)
                .into(dtBaojinset)
                .map(devcnum).toPropertyWhenPresent("devcnum", record::getDevcnum)
                .map(baojin).toPropertyWhenPresent("baojin", record::getBaojin)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.352+08:00", comments="Source Table: Dt_BaoJinSet")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<DtBaojinset>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, devcnum, baojin)
                .from(dtBaojinset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.355+08:00", comments="Source Table: Dt_BaoJinSet")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<DtBaojinset>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, devcnum, baojin)
                .from(dtBaojinset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.355+08:00", comments="Source Table: Dt_BaoJinSet")
    default DtBaojinset selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, devcnum, baojin)
                .from(dtBaojinset)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.355+08:00", comments="Source Table: Dt_BaoJinSet")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(DtBaojinset record) {
        return UpdateDSL.updateWithMapper(this::update, dtBaojinset)
                .set(devcnum).equalTo(record::getDevcnum)
                .set(baojin).equalTo(record::getBaojin);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.355+08:00", comments="Source Table: Dt_BaoJinSet")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(DtBaojinset record) {
        return UpdateDSL.updateWithMapper(this::update, dtBaojinset)
                .set(devcnum).equalToWhenPresent(record::getDevcnum)
                .set(baojin).equalToWhenPresent(record::getBaojin);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.355+08:00", comments="Source Table: Dt_BaoJinSet")
    default int updateByPrimaryKey(DtBaojinset record) {
        return UpdateDSL.updateWithMapper(this::update, dtBaojinset)
                .set(devcnum).equalTo(record::getDevcnum)
                .set(baojin).equalTo(record::getBaojin)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.356+08:00", comments="Source Table: Dt_BaoJinSet")
    default int updateByPrimaryKeySelective(DtBaojinset record) {
        return UpdateDSL.updateWithMapper(this::update, dtBaojinset)
                .set(devcnum).equalToWhenPresent(record::getDevcnum)
                .set(baojin).equalToWhenPresent(record::getBaojin)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}