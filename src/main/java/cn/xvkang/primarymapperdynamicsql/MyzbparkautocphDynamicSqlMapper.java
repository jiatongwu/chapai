package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MyzbparkautocphDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.Myzbparkautocph;
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
public interface MyzbparkautocphDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.684+08:00", comments="Source Table: MYZBPARKAutoCPH")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.684+08:00", comments="Source Table: MYZBPARKAutoCPH")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.684+08:00", comments="Source Table: MYZBPARKAutoCPH")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<Myzbparkautocph> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.684+08:00", comments="Source Table: MYZBPARKAutoCPH")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MyzbparkautocphResult")
    Myzbparkautocph selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.684+08:00", comments="Source Table: MYZBPARKAutoCPH")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MyzbparkautocphResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CPH", property="cph", jdbcType=JdbcType.VARCHAR),
        @Result(column="Address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="Favorable", property="favorable", jdbcType=JdbcType.DECIMAL),
        @Result(column="Manner", property="manner", jdbcType=JdbcType.VARCHAR),
        @Result(column="OutHour", property="outhour", jdbcType=JdbcType.DECIMAL),
        @Result(column="OutDayNo", property="outdayno", jdbcType=JdbcType.DECIMAL),
        @Result(column="Enable", property="enable", jdbcType=JdbcType.BIT),
        @Result(column="PCName", property="pcname", jdbcType=JdbcType.VARCHAR),
        @Result(column="OptTime", property="opttime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="Operator", property="operator", jdbcType=JdbcType.VARCHAR)
    })
    List<Myzbparkautocph> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.684+08:00", comments="Source Table: MYZBPARKAutoCPH")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.684+08:00", comments="Source Table: MYZBPARKAutoCPH")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(myzbparkautocph);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.684+08:00", comments="Source Table: MYZBPARKAutoCPH")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, myzbparkautocph);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.684+08:00", comments="Source Table: MYZBPARKAutoCPH")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, myzbparkautocph)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.684+08:00", comments="Source Table: MYZBPARKAutoCPH")
    default int insert(Myzbparkautocph record) {
        return insert(SqlBuilder.insert(record)
                .into(myzbparkautocph)
                .map(cph).toProperty("cph")
                .map(address).toProperty("address")
                .map(favorable).toProperty("favorable")
                .map(manner).toProperty("manner")
                .map(outhour).toProperty("outhour")
                .map(outdayno).toProperty("outdayno")
                .map(enable).toProperty("enable")
                .map(pcname).toProperty("pcname")
                .map(opttime).toProperty("opttime")
                .map(operator).toProperty("operator")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.685+08:00", comments="Source Table: MYZBPARKAutoCPH")
    default int insertSelective(Myzbparkautocph record) {
        return insert(SqlBuilder.insert(record)
                .into(myzbparkautocph)
                .map(cph).toPropertyWhenPresent("cph", record::getCph)
                .map(address).toPropertyWhenPresent("address", record::getAddress)
                .map(favorable).toPropertyWhenPresent("favorable", record::getFavorable)
                .map(manner).toPropertyWhenPresent("manner", record::getManner)
                .map(outhour).toPropertyWhenPresent("outhour", record::getOuthour)
                .map(outdayno).toPropertyWhenPresent("outdayno", record::getOutdayno)
                .map(enable).toPropertyWhenPresent("enable", record::getEnable)
                .map(pcname).toPropertyWhenPresent("pcname", record::getPcname)
                .map(opttime).toPropertyWhenPresent("opttime", record::getOpttime)
                .map(operator).toPropertyWhenPresent("operator", record::getOperator)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.685+08:00", comments="Source Table: MYZBPARKAutoCPH")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myzbparkautocph>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, cph, address, favorable, manner, outhour, outdayno, enable, pcname, opttime, operator)
                .from(myzbparkautocph);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.685+08:00", comments="Source Table: MYZBPARKAutoCPH")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myzbparkautocph>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, cph, address, favorable, manner, outhour, outdayno, enable, pcname, opttime, operator)
                .from(myzbparkautocph);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.686+08:00", comments="Source Table: MYZBPARKAutoCPH")
    default Myzbparkautocph selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, cph, address, favorable, manner, outhour, outdayno, enable, pcname, opttime, operator)
                .from(myzbparkautocph)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.689+08:00", comments="Source Table: MYZBPARKAutoCPH")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Myzbparkautocph record) {
        return UpdateDSL.updateWithMapper(this::update, myzbparkautocph)
                .set(cph).equalTo(record::getCph)
                .set(address).equalTo(record::getAddress)
                .set(favorable).equalTo(record::getFavorable)
                .set(manner).equalTo(record::getManner)
                .set(outhour).equalTo(record::getOuthour)
                .set(outdayno).equalTo(record::getOutdayno)
                .set(enable).equalTo(record::getEnable)
                .set(pcname).equalTo(record::getPcname)
                .set(opttime).equalTo(record::getOpttime)
                .set(operator).equalTo(record::getOperator);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.689+08:00", comments="Source Table: MYZBPARKAutoCPH")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Myzbparkautocph record) {
        return UpdateDSL.updateWithMapper(this::update, myzbparkautocph)
                .set(cph).equalToWhenPresent(record::getCph)
                .set(address).equalToWhenPresent(record::getAddress)
                .set(favorable).equalToWhenPresent(record::getFavorable)
                .set(manner).equalToWhenPresent(record::getManner)
                .set(outhour).equalToWhenPresent(record::getOuthour)
                .set(outdayno).equalToWhenPresent(record::getOutdayno)
                .set(enable).equalToWhenPresent(record::getEnable)
                .set(pcname).equalToWhenPresent(record::getPcname)
                .set(opttime).equalToWhenPresent(record::getOpttime)
                .set(operator).equalToWhenPresent(record::getOperator);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.690+08:00", comments="Source Table: MYZBPARKAutoCPH")
    default int updateByPrimaryKey(Myzbparkautocph record) {
        return UpdateDSL.updateWithMapper(this::update, myzbparkautocph)
                .set(cph).equalTo(record::getCph)
                .set(address).equalTo(record::getAddress)
                .set(favorable).equalTo(record::getFavorable)
                .set(manner).equalTo(record::getManner)
                .set(outhour).equalTo(record::getOuthour)
                .set(outdayno).equalTo(record::getOutdayno)
                .set(enable).equalTo(record::getEnable)
                .set(pcname).equalTo(record::getPcname)
                .set(opttime).equalTo(record::getOpttime)
                .set(operator).equalTo(record::getOperator)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.690+08:00", comments="Source Table: MYZBPARKAutoCPH")
    default int updateByPrimaryKeySelective(Myzbparkautocph record) {
        return UpdateDSL.updateWithMapper(this::update, myzbparkautocph)
                .set(cph).equalToWhenPresent(record::getCph)
                .set(address).equalToWhenPresent(record::getAddress)
                .set(favorable).equalToWhenPresent(record::getFavorable)
                .set(manner).equalToWhenPresent(record::getManner)
                .set(outhour).equalToWhenPresent(record::getOuthour)
                .set(outdayno).equalToWhenPresent(record::getOutdayno)
                .set(enable).equalToWhenPresent(record::getEnable)
                .set(pcname).equalToWhenPresent(record::getPcname)
                .set(opttime).equalToWhenPresent(record::getOpttime)
                .set(operator).equalToWhenPresent(record::getOperator)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}