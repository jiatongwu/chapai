package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MyautotempchangeDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.Myautotempchange;
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
public interface MyautotempchangeDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.635+08:00", comments="Source Table: MYAutoTempChange")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.635+08:00", comments="Source Table: MYAutoTempChange")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.635+08:00", comments="Source Table: MYAutoTempChange")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<Myautotempchange> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.635+08:00", comments="Source Table: MYAutoTempChange")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MyautotempchangeResult")
    Myautotempchange selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.635+08:00", comments="Source Table: MYAutoTempChange")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MyautotempchangeResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CPH", property="cph", jdbcType=JdbcType.VARCHAR),
        @Result(column="CarCardType", property="carcardtype", jdbcType=JdbcType.VARCHAR),
        @Result(column="InTime", property="intime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CarValidStartDate", property="carvalidstartdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CarValidEndDate", property="carvalidenddate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="DownloadSignal", property="downloadsignal", jdbcType=JdbcType.VARCHAR),
        @Result(column="InOut", property="inout", jdbcType=JdbcType.INTEGER)
    })
    List<Myautotempchange> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.635+08:00", comments="Source Table: MYAutoTempChange")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.635+08:00", comments="Source Table: MYAutoTempChange")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(myautotempchange);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.635+08:00", comments="Source Table: MYAutoTempChange")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, myautotempchange);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.635+08:00", comments="Source Table: MYAutoTempChange")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, myautotempchange)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.635+08:00", comments="Source Table: MYAutoTempChange")
    default int insert(Myautotempchange record) {
        return insert(SqlBuilder.insert(record)
                .into(myautotempchange)
                .map(cph).toProperty("cph")
                .map(carcardtype).toProperty("carcardtype")
                .map(intime).toProperty("intime")
                .map(carvalidstartdate).toProperty("carvalidstartdate")
                .map(carvalidenddate).toProperty("carvalidenddate")
                .map(downloadsignal).toProperty("downloadsignal")
                .map(inout).toProperty("inout")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.635+08:00", comments="Source Table: MYAutoTempChange")
    default int insertSelective(Myautotempchange record) {
        return insert(SqlBuilder.insert(record)
                .into(myautotempchange)
                .map(cph).toPropertyWhenPresent("cph", record::getCph)
                .map(carcardtype).toPropertyWhenPresent("carcardtype", record::getCarcardtype)
                .map(intime).toPropertyWhenPresent("intime", record::getIntime)
                .map(carvalidstartdate).toPropertyWhenPresent("carvalidstartdate", record::getCarvalidstartdate)
                .map(carvalidenddate).toPropertyWhenPresent("carvalidenddate", record::getCarvalidenddate)
                .map(downloadsignal).toPropertyWhenPresent("downloadsignal", record::getDownloadsignal)
                .map(inout).toPropertyWhenPresent("inout", record::getInout)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.635+08:00", comments="Source Table: MYAutoTempChange")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myautotempchange>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, cph, carcardtype, intime, carvalidstartdate, carvalidenddate, downloadsignal, inout)
                .from(myautotempchange);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.635+08:00", comments="Source Table: MYAutoTempChange")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myautotempchange>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, cph, carcardtype, intime, carvalidstartdate, carvalidenddate, downloadsignal, inout)
                .from(myautotempchange);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.636+08:00", comments="Source Table: MYAutoTempChange")
    default Myautotempchange selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, cph, carcardtype, intime, carvalidstartdate, carvalidenddate, downloadsignal, inout)
                .from(myautotempchange)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.636+08:00", comments="Source Table: MYAutoTempChange")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Myautotempchange record) {
        return UpdateDSL.updateWithMapper(this::update, myautotempchange)
                .set(cph).equalTo(record::getCph)
                .set(carcardtype).equalTo(record::getCarcardtype)
                .set(intime).equalTo(record::getIntime)
                .set(carvalidstartdate).equalTo(record::getCarvalidstartdate)
                .set(carvalidenddate).equalTo(record::getCarvalidenddate)
                .set(downloadsignal).equalTo(record::getDownloadsignal)
                .set(inout).equalTo(record::getInout);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.636+08:00", comments="Source Table: MYAutoTempChange")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Myautotempchange record) {
        return UpdateDSL.updateWithMapper(this::update, myautotempchange)
                .set(cph).equalToWhenPresent(record::getCph)
                .set(carcardtype).equalToWhenPresent(record::getCarcardtype)
                .set(intime).equalToWhenPresent(record::getIntime)
                .set(carvalidstartdate).equalToWhenPresent(record::getCarvalidstartdate)
                .set(carvalidenddate).equalToWhenPresent(record::getCarvalidenddate)
                .set(downloadsignal).equalToWhenPresent(record::getDownloadsignal)
                .set(inout).equalToWhenPresent(record::getInout);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.636+08:00", comments="Source Table: MYAutoTempChange")
    default int updateByPrimaryKey(Myautotempchange record) {
        return UpdateDSL.updateWithMapper(this::update, myautotempchange)
                .set(cph).equalTo(record::getCph)
                .set(carcardtype).equalTo(record::getCarcardtype)
                .set(intime).equalTo(record::getIntime)
                .set(carvalidstartdate).equalTo(record::getCarvalidstartdate)
                .set(carvalidenddate).equalTo(record::getCarvalidenddate)
                .set(downloadsignal).equalTo(record::getDownloadsignal)
                .set(inout).equalTo(record::getInout)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.636+08:00", comments="Source Table: MYAutoTempChange")
    default int updateByPrimaryKeySelective(Myautotempchange record) {
        return UpdateDSL.updateWithMapper(this::update, myautotempchange)
                .set(cph).equalToWhenPresent(record::getCph)
                .set(carcardtype).equalToWhenPresent(record::getCarcardtype)
                .set(intime).equalToWhenPresent(record::getIntime)
                .set(carvalidstartdate).equalToWhenPresent(record::getCarvalidstartdate)
                .set(carvalidenddate).equalToWhenPresent(record::getCarvalidenddate)
                .set(downloadsignal).equalToWhenPresent(record::getDownloadsignal)
                .set(inout).equalToWhenPresent(record::getInout)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}