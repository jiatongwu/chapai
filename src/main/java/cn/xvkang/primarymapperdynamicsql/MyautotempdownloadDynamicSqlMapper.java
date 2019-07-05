package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MyautotempdownloadDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.Myautotempdownload;
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
public interface MyautotempdownloadDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.462+08:00", comments="Source Table: MYAutoTempDownLoad")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.462+08:00", comments="Source Table: MYAutoTempDownLoad")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.463+08:00", comments="Source Table: MYAutoTempDownLoad")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<Myautotempdownload> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.463+08:00", comments="Source Table: MYAutoTempDownLoad")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MyautotempdownloadResult")
    Myautotempdownload selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.463+08:00", comments="Source Table: MYAutoTempDownLoad")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MyautotempdownloadResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CPH", property="cph", jdbcType=JdbcType.VARCHAR),
        @Result(column="InTime", property="intime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="DownloadSignal", property="downloadsignal", jdbcType=JdbcType.VARCHAR),
        @Result(column="InOut", property="inout", jdbcType=JdbcType.INTEGER),
        @Result(column="iBigSmall", property="ibigsmall", jdbcType=JdbcType.INTEGER)
    })
    List<Myautotempdownload> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.463+08:00", comments="Source Table: MYAutoTempDownLoad")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.463+08:00", comments="Source Table: MYAutoTempDownLoad")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(myautotempdownload);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.463+08:00", comments="Source Table: MYAutoTempDownLoad")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, myautotempdownload);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.463+08:00", comments="Source Table: MYAutoTempDownLoad")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, myautotempdownload)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.463+08:00", comments="Source Table: MYAutoTempDownLoad")
    default int insert(Myautotempdownload record) {
        return insert(SqlBuilder.insert(record)
                .into(myautotempdownload)
                .map(cph).toProperty("cph")
                .map(intime).toProperty("intime")
                .map(downloadsignal).toProperty("downloadsignal")
                .map(inout).toProperty("inout")
                .map(ibigsmall).toProperty("ibigsmall")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.463+08:00", comments="Source Table: MYAutoTempDownLoad")
    default int insertSelective(Myautotempdownload record) {
        return insert(SqlBuilder.insert(record)
                .into(myautotempdownload)
                .map(cph).toPropertyWhenPresent("cph", record::getCph)
                .map(intime).toPropertyWhenPresent("intime", record::getIntime)
                .map(downloadsignal).toPropertyWhenPresent("downloadsignal", record::getDownloadsignal)
                .map(inout).toPropertyWhenPresent("inout", record::getInout)
                .map(ibigsmall).toPropertyWhenPresent("ibigsmall", record::getIbigsmall)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.463+08:00", comments="Source Table: MYAutoTempDownLoad")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myautotempdownload>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, cph, intime, downloadsignal, inout, ibigsmall)
                .from(myautotempdownload);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.463+08:00", comments="Source Table: MYAutoTempDownLoad")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myautotempdownload>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, cph, intime, downloadsignal, inout, ibigsmall)
                .from(myautotempdownload);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.463+08:00", comments="Source Table: MYAutoTempDownLoad")
    default Myautotempdownload selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, cph, intime, downloadsignal, inout, ibigsmall)
                .from(myautotempdownload)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.463+08:00", comments="Source Table: MYAutoTempDownLoad")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Myautotempdownload record) {
        return UpdateDSL.updateWithMapper(this::update, myautotempdownload)
                .set(cph).equalTo(record::getCph)
                .set(intime).equalTo(record::getIntime)
                .set(downloadsignal).equalTo(record::getDownloadsignal)
                .set(inout).equalTo(record::getInout)
                .set(ibigsmall).equalTo(record::getIbigsmall);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.463+08:00", comments="Source Table: MYAutoTempDownLoad")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Myautotempdownload record) {
        return UpdateDSL.updateWithMapper(this::update, myautotempdownload)
                .set(cph).equalToWhenPresent(record::getCph)
                .set(intime).equalToWhenPresent(record::getIntime)
                .set(downloadsignal).equalToWhenPresent(record::getDownloadsignal)
                .set(inout).equalToWhenPresent(record::getInout)
                .set(ibigsmall).equalToWhenPresent(record::getIbigsmall);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.463+08:00", comments="Source Table: MYAutoTempDownLoad")
    default int updateByPrimaryKey(Myautotempdownload record) {
        return UpdateDSL.updateWithMapper(this::update, myautotempdownload)
                .set(cph).equalTo(record::getCph)
                .set(intime).equalTo(record::getIntime)
                .set(downloadsignal).equalTo(record::getDownloadsignal)
                .set(inout).equalTo(record::getInout)
                .set(ibigsmall).equalTo(record::getIbigsmall)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.464+08:00", comments="Source Table: MYAutoTempDownLoad")
    default int updateByPrimaryKeySelective(Myautotempdownload record) {
        return UpdateDSL.updateWithMapper(this::update, myautotempdownload)
                .set(cph).equalToWhenPresent(record::getCph)
                .set(intime).equalToWhenPresent(record::getIntime)
                .set(downloadsignal).equalToWhenPresent(record::getDownloadsignal)
                .set(inout).equalToWhenPresent(record::getInout)
                .set(ibigsmall).equalToWhenPresent(record::getIbigsmall)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}