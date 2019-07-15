package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.DtFooroutsetDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.DtFooroutset;
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
public interface DtFooroutsetDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.626+08:00", comments="Source Table: Dt_FoorOutSet")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.626+08:00", comments="Source Table: Dt_FoorOutSet")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.626+08:00", comments="Source Table: Dt_FoorOutSet")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<DtFooroutset> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.626+08:00", comments="Source Table: Dt_FoorOutSet")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("DtFooroutsetResult")
    DtFooroutset selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.626+08:00", comments="Source Table: Dt_FoorOutSet")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="DtFooroutsetResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="DevcNo", property="devcno", jdbcType=JdbcType.INTEGER),
        @Result(column="Holid", property="holid", jdbcType=JdbcType.BIT),
        @Result(column="Foorkzout", property="foorkzout", jdbcType=JdbcType.BIT),
        @Result(column="Foorhf", property="foorhf", jdbcType=JdbcType.BIT),
        @Result(column="BaoJin", property="baojin", jdbcType=JdbcType.BIT),
        @Result(column="RecCunchu", property="reccunchu", jdbcType=JdbcType.BIT),
        @Result(column="FoorInfo", property="foorinfo", jdbcType=JdbcType.VARCHAR)
    })
    List<DtFooroutset> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.626+08:00", comments="Source Table: Dt_FoorOutSet")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.626+08:00", comments="Source Table: Dt_FoorOutSet")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(dtFooroutset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.626+08:00", comments="Source Table: Dt_FoorOutSet")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, dtFooroutset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.626+08:00", comments="Source Table: Dt_FoorOutSet")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, dtFooroutset)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.626+08:00", comments="Source Table: Dt_FoorOutSet")
    default int insert(DtFooroutset record) {
        return insert(SqlBuilder.insert(record)
                .into(dtFooroutset)
                .map(devcno).toProperty("devcno")
                .map(holid).toProperty("holid")
                .map(foorkzout).toProperty("foorkzout")
                .map(foorhf).toProperty("foorhf")
                .map(baojin).toProperty("baojin")
                .map(reccunchu).toProperty("reccunchu")
                .map(foorinfo).toProperty("foorinfo")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.626+08:00", comments="Source Table: Dt_FoorOutSet")
    default int insertSelective(DtFooroutset record) {
        return insert(SqlBuilder.insert(record)
                .into(dtFooroutset)
                .map(devcno).toPropertyWhenPresent("devcno", record::getDevcno)
                .map(holid).toPropertyWhenPresent("holid", record::getHolid)
                .map(foorkzout).toPropertyWhenPresent("foorkzout", record::getFoorkzout)
                .map(foorhf).toPropertyWhenPresent("foorhf", record::getFoorhf)
                .map(baojin).toPropertyWhenPresent("baojin", record::getBaojin)
                .map(reccunchu).toPropertyWhenPresent("reccunchu", record::getReccunchu)
                .map(foorinfo).toPropertyWhenPresent("foorinfo", record::getFoorinfo)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.627+08:00", comments="Source Table: Dt_FoorOutSet")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<DtFooroutset>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, devcno, holid, foorkzout, foorhf, baojin, reccunchu, foorinfo)
                .from(dtFooroutset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.627+08:00", comments="Source Table: Dt_FoorOutSet")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<DtFooroutset>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, devcno, holid, foorkzout, foorhf, baojin, reccunchu, foorinfo)
                .from(dtFooroutset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.627+08:00", comments="Source Table: Dt_FoorOutSet")
    default DtFooroutset selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, devcno, holid, foorkzout, foorhf, baojin, reccunchu, foorinfo)
                .from(dtFooroutset)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.627+08:00", comments="Source Table: Dt_FoorOutSet")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(DtFooroutset record) {
        return UpdateDSL.updateWithMapper(this::update, dtFooroutset)
                .set(devcno).equalTo(record::getDevcno)
                .set(holid).equalTo(record::getHolid)
                .set(foorkzout).equalTo(record::getFoorkzout)
                .set(foorhf).equalTo(record::getFoorhf)
                .set(baojin).equalTo(record::getBaojin)
                .set(reccunchu).equalTo(record::getReccunchu)
                .set(foorinfo).equalTo(record::getFoorinfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.627+08:00", comments="Source Table: Dt_FoorOutSet")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(DtFooroutset record) {
        return UpdateDSL.updateWithMapper(this::update, dtFooroutset)
                .set(devcno).equalToWhenPresent(record::getDevcno)
                .set(holid).equalToWhenPresent(record::getHolid)
                .set(foorkzout).equalToWhenPresent(record::getFoorkzout)
                .set(foorhf).equalToWhenPresent(record::getFoorhf)
                .set(baojin).equalToWhenPresent(record::getBaojin)
                .set(reccunchu).equalToWhenPresent(record::getReccunchu)
                .set(foorinfo).equalToWhenPresent(record::getFoorinfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.627+08:00", comments="Source Table: Dt_FoorOutSet")
    default int updateByPrimaryKey(DtFooroutset record) {
        return UpdateDSL.updateWithMapper(this::update, dtFooroutset)
                .set(devcno).equalTo(record::getDevcno)
                .set(holid).equalTo(record::getHolid)
                .set(foorkzout).equalTo(record::getFoorkzout)
                .set(foorhf).equalTo(record::getFoorhf)
                .set(baojin).equalTo(record::getBaojin)
                .set(reccunchu).equalTo(record::getReccunchu)
                .set(foorinfo).equalTo(record::getFoorinfo)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.627+08:00", comments="Source Table: Dt_FoorOutSet")
    default int updateByPrimaryKeySelective(DtFooroutset record) {
        return UpdateDSL.updateWithMapper(this::update, dtFooroutset)
                .set(devcno).equalToWhenPresent(record::getDevcno)
                .set(holid).equalToWhenPresent(record::getHolid)
                .set(foorkzout).equalToWhenPresent(record::getFoorkzout)
                .set(foorhf).equalToWhenPresent(record::getFoorhf)
                .set(baojin).equalToWhenPresent(record::getBaojin)
                .set(reccunchu).equalToWhenPresent(record::getReccunchu)
                .set(foorinfo).equalToWhenPresent(record::getFoorinfo)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}