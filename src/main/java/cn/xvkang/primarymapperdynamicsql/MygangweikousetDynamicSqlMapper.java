package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MygangweikousetDynamicSqlSupport.*;

import cn.xvkang.primaryentity.Mygangweikouset;
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
public interface MygangweikousetDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.763+08:00", comments="Source Table: MYGANGWEIKOUSET")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.763+08:00", comments="Source Table: MYGANGWEIKOUSET")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.763+08:00", comments="Source Table: MYGANGWEIKOUSET")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Mygangweikouset> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.763+08:00", comments="Source Table: MYGANGWEIKOUSET")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MygangweikousetResult", value = {
        @Result(column="CarChannel", property="carchannel", jdbcType=JdbcType.INTEGER),
        @Result(column="InOut", property="inout", jdbcType=JdbcType.INTEGER),
        @Result(column="InOutName", property="inoutname", jdbcType=JdbcType.VARCHAR),
        @Result(column="CtrlNumber", property="ctrlnumber", jdbcType=JdbcType.INTEGER),
        @Result(column="OpenID", property="openid", jdbcType=JdbcType.INTEGER),
        @Result(column="OpenType", property="opentype", jdbcType=JdbcType.INTEGER),
        @Result(column="VideoCardID", property="videocardid", jdbcType=JdbcType.INTEGER),
        @Result(column="PersonVideo", property="personvideo", jdbcType=JdbcType.INTEGER),
        @Result(column="BigSmall", property="bigsmall", jdbcType=JdbcType.INTEGER),
        @Result(column="CheckPortID", property="checkportid", jdbcType=JdbcType.INTEGER),
        @Result(column="TempIn", property="tempin", jdbcType=JdbcType.INTEGER),
        @Result(column="TempOut", property="tempout", jdbcType=JdbcType.INTEGER),
        @Result(column="HasOutCard", property="hasoutcard", jdbcType=JdbcType.INTEGER),
        @Result(column="IdentifyAddress", property="identifyaddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="IdentifySignal", property="identifysignal", jdbcType=JdbcType.INTEGER),
        @Result(column="SubJH", property="subjh", jdbcType=JdbcType.VARCHAR),
        @Result(column="XieYi", property="xieyi", jdbcType=JdbcType.INTEGER),
        @Result(column="IP", property="ip", jdbcType=JdbcType.VARCHAR),
        @Result(column="PCName", property="pcname", jdbcType=JdbcType.VARCHAR),
        @Result(column="AndroidIP", property="androidip", jdbcType=JdbcType.VARCHAR)
    })
    List<Mygangweikouset> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.763+08:00", comments="Source Table: MYGANGWEIKOUSET")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.763+08:00", comments="Source Table: MYGANGWEIKOUSET")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(mygangweikouset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.763+08:00", comments="Source Table: MYGANGWEIKOUSET")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, mygangweikouset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.763+08:00", comments="Source Table: MYGANGWEIKOUSET")
    default int insert(Mygangweikouset record) {
        return insert(SqlBuilder.insert(record)
                .into(mygangweikouset)
                .map(carchannel).toProperty("carchannel")
                .map(inout).toProperty("inout")
                .map(inoutname).toProperty("inoutname")
                .map(ctrlnumber).toProperty("ctrlnumber")
                .map(openid).toProperty("openid")
                .map(opentype).toProperty("opentype")
                .map(videocardid).toProperty("videocardid")
                .map(personvideo).toProperty("personvideo")
                .map(bigsmall).toProperty("bigsmall")
                .map(checkportid).toProperty("checkportid")
                .map(tempin).toProperty("tempin")
                .map(tempout).toProperty("tempout")
                .map(hasoutcard).toProperty("hasoutcard")
                .map(identifyaddress).toProperty("identifyaddress")
                .map(identifysignal).toProperty("identifysignal")
                .map(subjh).toProperty("subjh")
                .map(xieyi).toProperty("xieyi")
                .map(ip).toProperty("ip")
                .map(pcname).toProperty("pcname")
                .map(androidip).toProperty("androidip")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.763+08:00", comments="Source Table: MYGANGWEIKOUSET")
    default int insertSelective(Mygangweikouset record) {
        return insert(SqlBuilder.insert(record)
                .into(mygangweikouset)
                .map(carchannel).toPropertyWhenPresent("carchannel", record::getCarchannel)
                .map(inout).toPropertyWhenPresent("inout", record::getInout)
                .map(inoutname).toPropertyWhenPresent("inoutname", record::getInoutname)
                .map(ctrlnumber).toPropertyWhenPresent("ctrlnumber", record::getCtrlnumber)
                .map(openid).toPropertyWhenPresent("openid", record::getOpenid)
                .map(opentype).toPropertyWhenPresent("opentype", record::getOpentype)
                .map(videocardid).toPropertyWhenPresent("videocardid", record::getVideocardid)
                .map(personvideo).toPropertyWhenPresent("personvideo", record::getPersonvideo)
                .map(bigsmall).toPropertyWhenPresent("bigsmall", record::getBigsmall)
                .map(checkportid).toPropertyWhenPresent("checkportid", record::getCheckportid)
                .map(tempin).toPropertyWhenPresent("tempin", record::getTempin)
                .map(tempout).toPropertyWhenPresent("tempout", record::getTempout)
                .map(hasoutcard).toPropertyWhenPresent("hasoutcard", record::getHasoutcard)
                .map(identifyaddress).toPropertyWhenPresent("identifyaddress", record::getIdentifyaddress)
                .map(identifysignal).toPropertyWhenPresent("identifysignal", record::getIdentifysignal)
                .map(subjh).toPropertyWhenPresent("subjh", record::getSubjh)
                .map(xieyi).toPropertyWhenPresent("xieyi", record::getXieyi)
                .map(ip).toPropertyWhenPresent("ip", record::getIp)
                .map(pcname).toPropertyWhenPresent("pcname", record::getPcname)
                .map(androidip).toPropertyWhenPresent("androidip", record::getAndroidip)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.763+08:00", comments="Source Table: MYGANGWEIKOUSET")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Mygangweikouset>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, carchannel, inout, inoutname, ctrlnumber, openid, opentype, videocardid, personvideo, bigsmall, checkportid, tempin, tempout, hasoutcard, identifyaddress, identifysignal, subjh, xieyi, ip, pcname, androidip)
                .from(mygangweikouset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.763+08:00", comments="Source Table: MYGANGWEIKOUSET")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Mygangweikouset>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, carchannel, inout, inoutname, ctrlnumber, openid, opentype, videocardid, personvideo, bigsmall, checkportid, tempin, tempout, hasoutcard, identifyaddress, identifysignal, subjh, xieyi, ip, pcname, androidip)
                .from(mygangweikouset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.763+08:00", comments="Source Table: MYGANGWEIKOUSET")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Mygangweikouset record) {
        return UpdateDSL.updateWithMapper(this::update, mygangweikouset)
                .set(carchannel).equalTo(record::getCarchannel)
                .set(inout).equalTo(record::getInout)
                .set(inoutname).equalTo(record::getInoutname)
                .set(ctrlnumber).equalTo(record::getCtrlnumber)
                .set(openid).equalTo(record::getOpenid)
                .set(opentype).equalTo(record::getOpentype)
                .set(videocardid).equalTo(record::getVideocardid)
                .set(personvideo).equalTo(record::getPersonvideo)
                .set(bigsmall).equalTo(record::getBigsmall)
                .set(checkportid).equalTo(record::getCheckportid)
                .set(tempin).equalTo(record::getTempin)
                .set(tempout).equalTo(record::getTempout)
                .set(hasoutcard).equalTo(record::getHasoutcard)
                .set(identifyaddress).equalTo(record::getIdentifyaddress)
                .set(identifysignal).equalTo(record::getIdentifysignal)
                .set(subjh).equalTo(record::getSubjh)
                .set(xieyi).equalTo(record::getXieyi)
                .set(ip).equalTo(record::getIp)
                .set(pcname).equalTo(record::getPcname)
                .set(androidip).equalTo(record::getAndroidip);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.763+08:00", comments="Source Table: MYGANGWEIKOUSET")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Mygangweikouset record) {
        return UpdateDSL.updateWithMapper(this::update, mygangweikouset)
                .set(carchannel).equalToWhenPresent(record::getCarchannel)
                .set(inout).equalToWhenPresent(record::getInout)
                .set(inoutname).equalToWhenPresent(record::getInoutname)
                .set(ctrlnumber).equalToWhenPresent(record::getCtrlnumber)
                .set(openid).equalToWhenPresent(record::getOpenid)
                .set(opentype).equalToWhenPresent(record::getOpentype)
                .set(videocardid).equalToWhenPresent(record::getVideocardid)
                .set(personvideo).equalToWhenPresent(record::getPersonvideo)
                .set(bigsmall).equalToWhenPresent(record::getBigsmall)
                .set(checkportid).equalToWhenPresent(record::getCheckportid)
                .set(tempin).equalToWhenPresent(record::getTempin)
                .set(tempout).equalToWhenPresent(record::getTempout)
                .set(hasoutcard).equalToWhenPresent(record::getHasoutcard)
                .set(identifyaddress).equalToWhenPresent(record::getIdentifyaddress)
                .set(identifysignal).equalToWhenPresent(record::getIdentifysignal)
                .set(subjh).equalToWhenPresent(record::getSubjh)
                .set(xieyi).equalToWhenPresent(record::getXieyi)
                .set(ip).equalToWhenPresent(record::getIp)
                .set(pcname).equalToWhenPresent(record::getPcname)
                .set(androidip).equalToWhenPresent(record::getAndroidip);
    }
}