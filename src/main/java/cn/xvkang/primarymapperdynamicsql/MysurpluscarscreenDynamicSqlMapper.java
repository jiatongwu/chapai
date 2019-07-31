package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MysurpluscarscreenDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.Mysurpluscarscreen;
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
public interface MysurpluscarscreenDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.058+08:00", comments="Source Table: MYSurplusCarScreen")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.058+08:00", comments="Source Table: MYSurplusCarScreen")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.058+08:00", comments="Source Table: MYSurplusCarScreen")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<Mysurpluscarscreen> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.058+08:00", comments="Source Table: MYSurplusCarScreen")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MysurpluscarscreenResult")
    Mysurpluscarscreen selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.058+08:00", comments="Source Table: MYSurplusCarScreen")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MysurpluscarscreenResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CtrID", property="ctrid", jdbcType=JdbcType.INTEGER),
        @Result(column="SurplusID", property="surplusid", jdbcType=JdbcType.VARCHAR),
        @Result(column="Speed", property="speed", jdbcType=JdbcType.VARCHAR),
        @Result(column="StopTime", property="stoptime", jdbcType=JdbcType.VARCHAR),
        @Result(column="Color", property="color", jdbcType=JdbcType.VARCHAR),
        @Result(column="SumTime", property="sumtime", jdbcType=JdbcType.VARCHAR),
        @Result(column="PCName", property="pcname", jdbcType=JdbcType.VARCHAR),
        @Result(column="CPHEndStr", property="cphendstr", jdbcType=JdbcType.VARCHAR),
        @Result(column="ShowWay", property="showway", jdbcType=JdbcType.VARCHAR),
        @Result(column="Move", property="move", jdbcType=JdbcType.VARCHAR),
        @Result(column="Pattern", property="pattern", jdbcType=JdbcType.VARCHAR)
    })
    List<Mysurpluscarscreen> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.058+08:00", comments="Source Table: MYSurplusCarScreen")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.058+08:00", comments="Source Table: MYSurplusCarScreen")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(mysurpluscarscreen);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.058+08:00", comments="Source Table: MYSurplusCarScreen")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, mysurpluscarscreen);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.058+08:00", comments="Source Table: MYSurplusCarScreen")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, mysurpluscarscreen)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.058+08:00", comments="Source Table: MYSurplusCarScreen")
    default int insert(Mysurpluscarscreen record) {
        return insert(SqlBuilder.insert(record)
                .into(mysurpluscarscreen)
                .map(ctrid).toProperty("ctrid")
                .map(surplusid).toProperty("surplusid")
                .map(speed).toProperty("speed")
                .map(stoptime).toProperty("stoptime")
                .map(color).toProperty("color")
                .map(sumtime).toProperty("sumtime")
                .map(pcname).toProperty("pcname")
                .map(cphendstr).toProperty("cphendstr")
                .map(showway).toProperty("showway")
                .map(move).toProperty("move")
                .map(pattern).toProperty("pattern")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.058+08:00", comments="Source Table: MYSurplusCarScreen")
    default int insertSelective(Mysurpluscarscreen record) {
        return insert(SqlBuilder.insert(record)
                .into(mysurpluscarscreen)
                .map(ctrid).toPropertyWhenPresent("ctrid", record::getCtrid)
                .map(surplusid).toPropertyWhenPresent("surplusid", record::getSurplusid)
                .map(speed).toPropertyWhenPresent("speed", record::getSpeed)
                .map(stoptime).toPropertyWhenPresent("stoptime", record::getStoptime)
                .map(color).toPropertyWhenPresent("color", record::getColor)
                .map(sumtime).toPropertyWhenPresent("sumtime", record::getSumtime)
                .map(pcname).toPropertyWhenPresent("pcname", record::getPcname)
                .map(cphendstr).toPropertyWhenPresent("cphendstr", record::getCphendstr)
                .map(showway).toPropertyWhenPresent("showway", record::getShowway)
                .map(move).toPropertyWhenPresent("move", record::getMove)
                .map(pattern).toPropertyWhenPresent("pattern", record::getPattern)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.058+08:00", comments="Source Table: MYSurplusCarScreen")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Mysurpluscarscreen>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, ctrid, surplusid, speed, stoptime, color, sumtime, pcname, cphendstr, showway, move, pattern)
                .from(mysurpluscarscreen);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.058+08:00", comments="Source Table: MYSurplusCarScreen")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Mysurpluscarscreen>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, ctrid, surplusid, speed, stoptime, color, sumtime, pcname, cphendstr, showway, move, pattern)
                .from(mysurpluscarscreen);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.058+08:00", comments="Source Table: MYSurplusCarScreen")
    default Mysurpluscarscreen selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, ctrid, surplusid, speed, stoptime, color, sumtime, pcname, cphendstr, showway, move, pattern)
                .from(mysurpluscarscreen)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.058+08:00", comments="Source Table: MYSurplusCarScreen")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Mysurpluscarscreen record) {
        return UpdateDSL.updateWithMapper(this::update, mysurpluscarscreen)
                .set(ctrid).equalTo(record::getCtrid)
                .set(surplusid).equalTo(record::getSurplusid)
                .set(speed).equalTo(record::getSpeed)
                .set(stoptime).equalTo(record::getStoptime)
                .set(color).equalTo(record::getColor)
                .set(sumtime).equalTo(record::getSumtime)
                .set(pcname).equalTo(record::getPcname)
                .set(cphendstr).equalTo(record::getCphendstr)
                .set(showway).equalTo(record::getShowway)
                .set(move).equalTo(record::getMove)
                .set(pattern).equalTo(record::getPattern);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.058+08:00", comments="Source Table: MYSurplusCarScreen")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Mysurpluscarscreen record) {
        return UpdateDSL.updateWithMapper(this::update, mysurpluscarscreen)
                .set(ctrid).equalToWhenPresent(record::getCtrid)
                .set(surplusid).equalToWhenPresent(record::getSurplusid)
                .set(speed).equalToWhenPresent(record::getSpeed)
                .set(stoptime).equalToWhenPresent(record::getStoptime)
                .set(color).equalToWhenPresent(record::getColor)
                .set(sumtime).equalToWhenPresent(record::getSumtime)
                .set(pcname).equalToWhenPresent(record::getPcname)
                .set(cphendstr).equalToWhenPresent(record::getCphendstr)
                .set(showway).equalToWhenPresent(record::getShowway)
                .set(move).equalToWhenPresent(record::getMove)
                .set(pattern).equalToWhenPresent(record::getPattern);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.058+08:00", comments="Source Table: MYSurplusCarScreen")
    default int updateByPrimaryKey(Mysurpluscarscreen record) {
        return UpdateDSL.updateWithMapper(this::update, mysurpluscarscreen)
                .set(ctrid).equalTo(record::getCtrid)
                .set(surplusid).equalTo(record::getSurplusid)
                .set(speed).equalTo(record::getSpeed)
                .set(stoptime).equalTo(record::getStoptime)
                .set(color).equalTo(record::getColor)
                .set(sumtime).equalTo(record::getSumtime)
                .set(pcname).equalTo(record::getPcname)
                .set(cphendstr).equalTo(record::getCphendstr)
                .set(showway).equalTo(record::getShowway)
                .set(move).equalTo(record::getMove)
                .set(pattern).equalTo(record::getPattern)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.058+08:00", comments="Source Table: MYSurplusCarScreen")
    default int updateByPrimaryKeySelective(Mysurpluscarscreen record) {
        return UpdateDSL.updateWithMapper(this::update, mysurpluscarscreen)
                .set(ctrid).equalToWhenPresent(record::getCtrid)
                .set(surplusid).equalToWhenPresent(record::getSurplusid)
                .set(speed).equalToWhenPresent(record::getSpeed)
                .set(stoptime).equalToWhenPresent(record::getStoptime)
                .set(color).equalToWhenPresent(record::getColor)
                .set(sumtime).equalToWhenPresent(record::getSumtime)
                .set(pcname).equalToWhenPresent(record::getPcname)
                .set(cphendstr).equalToWhenPresent(record::getCphendstr)
                .set(showway).equalToWhenPresent(record::getShowway)
                .set(move).equalToWhenPresent(record::getMove)
                .set(pattern).equalToWhenPresent(record::getPattern)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}