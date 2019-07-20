package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.DtFoortbDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.DtFoortb;
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
public interface DtFoortbDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.092+08:00", comments="Source Table: Dt_foorTb")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.092+08:00", comments="Source Table: Dt_foorTb")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.092+08:00", comments="Source Table: Dt_foorTb")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<DtFoortb> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.092+08:00", comments="Source Table: Dt_foorTb")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("DtFoortbResult")
    DtFoortb selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.092+08:00", comments="Source Table: Dt_foorTb")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="DtFoortbResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="foorid", property="foorid", jdbcType=JdbcType.INTEGER),
        @Result(column="FoorName", property="foorname", jdbcType=JdbcType.VARCHAR),
        @Result(column="devcNo", property="devcno", jdbcType=JdbcType.INTEGER),
        @Result(column="FoorNo", property="foorno", jdbcType=JdbcType.INTEGER)
    })
    List<DtFoortb> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.092+08:00", comments="Source Table: Dt_foorTb")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.092+08:00", comments="Source Table: Dt_foorTb")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(dtFoortb);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.092+08:00", comments="Source Table: Dt_foorTb")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, dtFoortb);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.092+08:00", comments="Source Table: Dt_foorTb")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, dtFoortb)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.092+08:00", comments="Source Table: Dt_foorTb")
    default int insert(DtFoortb record) {
        return insert(SqlBuilder.insert(record)
                .into(dtFoortb)
                .map(foorid).toProperty("foorid")
                .map(foorname).toProperty("foorname")
                .map(devcno).toProperty("devcno")
                .map(foorno).toProperty("foorno")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.092+08:00", comments="Source Table: Dt_foorTb")
    default int insertSelective(DtFoortb record) {
        return insert(SqlBuilder.insert(record)
                .into(dtFoortb)
                .map(foorid).toPropertyWhenPresent("foorid", record::getFoorid)
                .map(foorname).toPropertyWhenPresent("foorname", record::getFoorname)
                .map(devcno).toPropertyWhenPresent("devcno", record::getDevcno)
                .map(foorno).toPropertyWhenPresent("foorno", record::getFoorno)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.097+08:00", comments="Source Table: Dt_foorTb")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<DtFoortb>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, foorid, foorname, devcno, foorno)
                .from(dtFoortb);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.098+08:00", comments="Source Table: Dt_foorTb")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<DtFoortb>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, foorid, foorname, devcno, foorno)
                .from(dtFoortb);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.098+08:00", comments="Source Table: Dt_foorTb")
    default DtFoortb selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, foorid, foorname, devcno, foorno)
                .from(dtFoortb)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.098+08:00", comments="Source Table: Dt_foorTb")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(DtFoortb record) {
        return UpdateDSL.updateWithMapper(this::update, dtFoortb)
                .set(foorid).equalTo(record::getFoorid)
                .set(foorname).equalTo(record::getFoorname)
                .set(devcno).equalTo(record::getDevcno)
                .set(foorno).equalTo(record::getFoorno);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.098+08:00", comments="Source Table: Dt_foorTb")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(DtFoortb record) {
        return UpdateDSL.updateWithMapper(this::update, dtFoortb)
                .set(foorid).equalToWhenPresent(record::getFoorid)
                .set(foorname).equalToWhenPresent(record::getFoorname)
                .set(devcno).equalToWhenPresent(record::getDevcno)
                .set(foorno).equalToWhenPresent(record::getFoorno);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.099+08:00", comments="Source Table: Dt_foorTb")
    default int updateByPrimaryKey(DtFoortb record) {
        return UpdateDSL.updateWithMapper(this::update, dtFoortb)
                .set(foorid).equalTo(record::getFoorid)
                .set(foorname).equalTo(record::getFoorname)
                .set(devcno).equalTo(record::getDevcno)
                .set(foorno).equalTo(record::getFoorno)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.100+08:00", comments="Source Table: Dt_foorTb")
    default int updateByPrimaryKeySelective(DtFoortb record) {
        return UpdateDSL.updateWithMapper(this::update, dtFoortb)
                .set(foorid).equalToWhenPresent(record::getFoorid)
                .set(foorname).equalToWhenPresent(record::getFoorname)
                .set(devcno).equalToWhenPresent(record::getDevcno)
                .set(foorno).equalToWhenPresent(record::getFoorno)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}