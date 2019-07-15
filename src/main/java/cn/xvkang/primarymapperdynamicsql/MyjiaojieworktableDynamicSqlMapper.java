package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MyjiaojieworktableDynamicSqlSupport.*;

import cn.xvkang.primaryentity.Myjiaojieworktable;
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
public interface MyjiaojieworktableDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.840+08:00", comments="Source Table: MYjiaojieWorkTable")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.841+08:00", comments="Source Table: MYjiaojieWorkTable")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.841+08:00", comments="Source Table: MYjiaojieWorkTable")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Myjiaojieworktable> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.841+08:00", comments="Source Table: MYjiaojieWorkTable")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MyjiaojieworktableResult", value = {
        @Result(column="JiaoWorkName", property="jiaoworkname", jdbcType=JdbcType.VARCHAR),
        @Result(column="JieWorkName", property="jieworkname", jdbcType=JdbcType.VARCHAR),
        @Result(column="GoWorkTime", property="goworktime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="AfterWorkTime", property="afterworktime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="StopYingSF", property="stopyingsf", jdbcType=JdbcType.DECIMAL),
        @Result(column="StopShiSF", property="stopshisf", jdbcType=JdbcType.DECIMAL),
        @Result(column="ValueCardDeduct", property="valuecarddeduct", jdbcType=JdbcType.DECIMAL),
        @Result(column="ATypeSF", property="atypesf", jdbcType=JdbcType.DECIMAL),
        @Result(column="BTypeSF", property="btypesf", jdbcType=JdbcType.DECIMAL),
        @Result(column="CTypeSF", property="ctypesf", jdbcType=JdbcType.DECIMAL),
        @Result(column="DTypeSF", property="dtypesf", jdbcType=JdbcType.DECIMAL),
        @Result(column="ETypeSF", property="etypesf", jdbcType=JdbcType.DECIMAL),
        @Result(column="FTypeSF", property="ftypesf", jdbcType=JdbcType.DECIMAL),
        @Result(column="GTypeSF", property="gtypesf", jdbcType=JdbcType.DECIMAL),
        @Result(column="HTypeSF", property="htypesf", jdbcType=JdbcType.DECIMAL),
        @Result(column="SendCard", property="sendcard", jdbcType=JdbcType.INTEGER),
        @Result(column="RetrieveCard", property="retrievecard", jdbcType=JdbcType.INTEGER),
        @Result(column="InZongNumber", property="inzongnumber", jdbcType=JdbcType.INTEGER),
        @Result(column="OutZongNumber", property="outzongnumber", jdbcType=JdbcType.INTEGER),
        @Result(column="ATypeCarNum", property="atypecarnum", jdbcType=JdbcType.INTEGER),
        @Result(column="BTypeCarNum", property="btypecarnum", jdbcType=JdbcType.INTEGER),
        @Result(column="CTypeCarNum", property="ctypecarnum", jdbcType=JdbcType.INTEGER),
        @Result(column="DTypeCarNum", property="dtypecarnum", jdbcType=JdbcType.INTEGER),
        @Result(column="ETypeCarNum", property="etypecarnum", jdbcType=JdbcType.INTEGER),
        @Result(column="FTypeCarNum", property="ftypecarnum", jdbcType=JdbcType.INTEGER),
        @Result(column="GTypeCarNum", property="gtypecarnum", jdbcType=JdbcType.INTEGER),
        @Result(column="HTypeCarNum", property="htypecarnum", jdbcType=JdbcType.INTEGER),
        @Result(column="RenGOpen", property="rengopen", jdbcType=JdbcType.INTEGER),
        @Result(column="ShouGOpen", property="shougopen", jdbcType=JdbcType.INTEGER),
        @Result(column="SFCarNum", property="sfcarnum", jdbcType=JdbcType.INTEGER),
        @Result(column="MFCarNum", property="mfcarnum", jdbcType=JdbcType.INTEGER),
        @Result(column="HappenSFCarNum", property="happensfcarnum", jdbcType=JdbcType.INTEGER),
        @Result(column="Remarks", property="remarks", jdbcType=JdbcType.VARCHAR)
    })
    List<Myjiaojieworktable> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.841+08:00", comments="Source Table: MYjiaojieWorkTable")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.841+08:00", comments="Source Table: MYjiaojieWorkTable")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(myjiaojieworktable);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.841+08:00", comments="Source Table: MYjiaojieWorkTable")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, myjiaojieworktable);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.841+08:00", comments="Source Table: MYjiaojieWorkTable")
    default int insert(Myjiaojieworktable record) {
        return insert(SqlBuilder.insert(record)
                .into(myjiaojieworktable)
                .map(jiaoworkname).toProperty("jiaoworkname")
                .map(jieworkname).toProperty("jieworkname")
                .map(goworktime).toProperty("goworktime")
                .map(afterworktime).toProperty("afterworktime")
                .map(stopyingsf).toProperty("stopyingsf")
                .map(stopshisf).toProperty("stopshisf")
                .map(valuecarddeduct).toProperty("valuecarddeduct")
                .map(atypesf).toProperty("atypesf")
                .map(btypesf).toProperty("btypesf")
                .map(ctypesf).toProperty("ctypesf")
                .map(dtypesf).toProperty("dtypesf")
                .map(etypesf).toProperty("etypesf")
                .map(ftypesf).toProperty("ftypesf")
                .map(gtypesf).toProperty("gtypesf")
                .map(htypesf).toProperty("htypesf")
                .map(sendcard).toProperty("sendcard")
                .map(retrievecard).toProperty("retrievecard")
                .map(inzongnumber).toProperty("inzongnumber")
                .map(outzongnumber).toProperty("outzongnumber")
                .map(atypecarnum).toProperty("atypecarnum")
                .map(btypecarnum).toProperty("btypecarnum")
                .map(ctypecarnum).toProperty("ctypecarnum")
                .map(dtypecarnum).toProperty("dtypecarnum")
                .map(etypecarnum).toProperty("etypecarnum")
                .map(ftypecarnum).toProperty("ftypecarnum")
                .map(gtypecarnum).toProperty("gtypecarnum")
                .map(htypecarnum).toProperty("htypecarnum")
                .map(rengopen).toProperty("rengopen")
                .map(shougopen).toProperty("shougopen")
                .map(sfcarnum).toProperty("sfcarnum")
                .map(mfcarnum).toProperty("mfcarnum")
                .map(happensfcarnum).toProperty("happensfcarnum")
                .map(remarks).toProperty("remarks")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.841+08:00", comments="Source Table: MYjiaojieWorkTable")
    default int insertSelective(Myjiaojieworktable record) {
        return insert(SqlBuilder.insert(record)
                .into(myjiaojieworktable)
                .map(jiaoworkname).toPropertyWhenPresent("jiaoworkname", record::getJiaoworkname)
                .map(jieworkname).toPropertyWhenPresent("jieworkname", record::getJieworkname)
                .map(goworktime).toPropertyWhenPresent("goworktime", record::getGoworktime)
                .map(afterworktime).toPropertyWhenPresent("afterworktime", record::getAfterworktime)
                .map(stopyingsf).toPropertyWhenPresent("stopyingsf", record::getStopyingsf)
                .map(stopshisf).toPropertyWhenPresent("stopshisf", record::getStopshisf)
                .map(valuecarddeduct).toPropertyWhenPresent("valuecarddeduct", record::getValuecarddeduct)
                .map(atypesf).toPropertyWhenPresent("atypesf", record::getAtypesf)
                .map(btypesf).toPropertyWhenPresent("btypesf", record::getBtypesf)
                .map(ctypesf).toPropertyWhenPresent("ctypesf", record::getCtypesf)
                .map(dtypesf).toPropertyWhenPresent("dtypesf", record::getDtypesf)
                .map(etypesf).toPropertyWhenPresent("etypesf", record::getEtypesf)
                .map(ftypesf).toPropertyWhenPresent("ftypesf", record::getFtypesf)
                .map(gtypesf).toPropertyWhenPresent("gtypesf", record::getGtypesf)
                .map(htypesf).toPropertyWhenPresent("htypesf", record::getHtypesf)
                .map(sendcard).toPropertyWhenPresent("sendcard", record::getSendcard)
                .map(retrievecard).toPropertyWhenPresent("retrievecard", record::getRetrievecard)
                .map(inzongnumber).toPropertyWhenPresent("inzongnumber", record::getInzongnumber)
                .map(outzongnumber).toPropertyWhenPresent("outzongnumber", record::getOutzongnumber)
                .map(atypecarnum).toPropertyWhenPresent("atypecarnum", record::getAtypecarnum)
                .map(btypecarnum).toPropertyWhenPresent("btypecarnum", record::getBtypecarnum)
                .map(ctypecarnum).toPropertyWhenPresent("ctypecarnum", record::getCtypecarnum)
                .map(dtypecarnum).toPropertyWhenPresent("dtypecarnum", record::getDtypecarnum)
                .map(etypecarnum).toPropertyWhenPresent("etypecarnum", record::getEtypecarnum)
                .map(ftypecarnum).toPropertyWhenPresent("ftypecarnum", record::getFtypecarnum)
                .map(gtypecarnum).toPropertyWhenPresent("gtypecarnum", record::getGtypecarnum)
                .map(htypecarnum).toPropertyWhenPresent("htypecarnum", record::getHtypecarnum)
                .map(rengopen).toPropertyWhenPresent("rengopen", record::getRengopen)
                .map(shougopen).toPropertyWhenPresent("shougopen", record::getShougopen)
                .map(sfcarnum).toPropertyWhenPresent("sfcarnum", record::getSfcarnum)
                .map(mfcarnum).toPropertyWhenPresent("mfcarnum", record::getMfcarnum)
                .map(happensfcarnum).toPropertyWhenPresent("happensfcarnum", record::getHappensfcarnum)
                .map(remarks).toPropertyWhenPresent("remarks", record::getRemarks)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.841+08:00", comments="Source Table: MYjiaojieWorkTable")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myjiaojieworktable>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, jiaoworkname, jieworkname, goworktime, afterworktime, stopyingsf, stopshisf, valuecarddeduct, atypesf, btypesf, ctypesf, dtypesf, etypesf, ftypesf, gtypesf, htypesf, sendcard, retrievecard, inzongnumber, outzongnumber, atypecarnum, btypecarnum, ctypecarnum, dtypecarnum, etypecarnum, ftypecarnum, gtypecarnum, htypecarnum, rengopen, shougopen, sfcarnum, mfcarnum, happensfcarnum, remarks)
                .from(myjiaojieworktable);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.841+08:00", comments="Source Table: MYjiaojieWorkTable")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myjiaojieworktable>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, jiaoworkname, jieworkname, goworktime, afterworktime, stopyingsf, stopshisf, valuecarddeduct, atypesf, btypesf, ctypesf, dtypesf, etypesf, ftypesf, gtypesf, htypesf, sendcard, retrievecard, inzongnumber, outzongnumber, atypecarnum, btypecarnum, ctypecarnum, dtypecarnum, etypecarnum, ftypecarnum, gtypecarnum, htypecarnum, rengopen, shougopen, sfcarnum, mfcarnum, happensfcarnum, remarks)
                .from(myjiaojieworktable);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.842+08:00", comments="Source Table: MYjiaojieWorkTable")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Myjiaojieworktable record) {
        return UpdateDSL.updateWithMapper(this::update, myjiaojieworktable)
                .set(jiaoworkname).equalTo(record::getJiaoworkname)
                .set(jieworkname).equalTo(record::getJieworkname)
                .set(goworktime).equalTo(record::getGoworktime)
                .set(afterworktime).equalTo(record::getAfterworktime)
                .set(stopyingsf).equalTo(record::getStopyingsf)
                .set(stopshisf).equalTo(record::getStopshisf)
                .set(valuecarddeduct).equalTo(record::getValuecarddeduct)
                .set(atypesf).equalTo(record::getAtypesf)
                .set(btypesf).equalTo(record::getBtypesf)
                .set(ctypesf).equalTo(record::getCtypesf)
                .set(dtypesf).equalTo(record::getDtypesf)
                .set(etypesf).equalTo(record::getEtypesf)
                .set(ftypesf).equalTo(record::getFtypesf)
                .set(gtypesf).equalTo(record::getGtypesf)
                .set(htypesf).equalTo(record::getHtypesf)
                .set(sendcard).equalTo(record::getSendcard)
                .set(retrievecard).equalTo(record::getRetrievecard)
                .set(inzongnumber).equalTo(record::getInzongnumber)
                .set(outzongnumber).equalTo(record::getOutzongnumber)
                .set(atypecarnum).equalTo(record::getAtypecarnum)
                .set(btypecarnum).equalTo(record::getBtypecarnum)
                .set(ctypecarnum).equalTo(record::getCtypecarnum)
                .set(dtypecarnum).equalTo(record::getDtypecarnum)
                .set(etypecarnum).equalTo(record::getEtypecarnum)
                .set(ftypecarnum).equalTo(record::getFtypecarnum)
                .set(gtypecarnum).equalTo(record::getGtypecarnum)
                .set(htypecarnum).equalTo(record::getHtypecarnum)
                .set(rengopen).equalTo(record::getRengopen)
                .set(shougopen).equalTo(record::getShougopen)
                .set(sfcarnum).equalTo(record::getSfcarnum)
                .set(mfcarnum).equalTo(record::getMfcarnum)
                .set(happensfcarnum).equalTo(record::getHappensfcarnum)
                .set(remarks).equalTo(record::getRemarks);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.842+08:00", comments="Source Table: MYjiaojieWorkTable")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Myjiaojieworktable record) {
        return UpdateDSL.updateWithMapper(this::update, myjiaojieworktable)
                .set(jiaoworkname).equalToWhenPresent(record::getJiaoworkname)
                .set(jieworkname).equalToWhenPresent(record::getJieworkname)
                .set(goworktime).equalToWhenPresent(record::getGoworktime)
                .set(afterworktime).equalToWhenPresent(record::getAfterworktime)
                .set(stopyingsf).equalToWhenPresent(record::getStopyingsf)
                .set(stopshisf).equalToWhenPresent(record::getStopshisf)
                .set(valuecarddeduct).equalToWhenPresent(record::getValuecarddeduct)
                .set(atypesf).equalToWhenPresent(record::getAtypesf)
                .set(btypesf).equalToWhenPresent(record::getBtypesf)
                .set(ctypesf).equalToWhenPresent(record::getCtypesf)
                .set(dtypesf).equalToWhenPresent(record::getDtypesf)
                .set(etypesf).equalToWhenPresent(record::getEtypesf)
                .set(ftypesf).equalToWhenPresent(record::getFtypesf)
                .set(gtypesf).equalToWhenPresent(record::getGtypesf)
                .set(htypesf).equalToWhenPresent(record::getHtypesf)
                .set(sendcard).equalToWhenPresent(record::getSendcard)
                .set(retrievecard).equalToWhenPresent(record::getRetrievecard)
                .set(inzongnumber).equalToWhenPresent(record::getInzongnumber)
                .set(outzongnumber).equalToWhenPresent(record::getOutzongnumber)
                .set(atypecarnum).equalToWhenPresent(record::getAtypecarnum)
                .set(btypecarnum).equalToWhenPresent(record::getBtypecarnum)
                .set(ctypecarnum).equalToWhenPresent(record::getCtypecarnum)
                .set(dtypecarnum).equalToWhenPresent(record::getDtypecarnum)
                .set(etypecarnum).equalToWhenPresent(record::getEtypecarnum)
                .set(ftypecarnum).equalToWhenPresent(record::getFtypecarnum)
                .set(gtypecarnum).equalToWhenPresent(record::getGtypecarnum)
                .set(htypecarnum).equalToWhenPresent(record::getHtypecarnum)
                .set(rengopen).equalToWhenPresent(record::getRengopen)
                .set(shougopen).equalToWhenPresent(record::getShougopen)
                .set(sfcarnum).equalToWhenPresent(record::getSfcarnum)
                .set(mfcarnum).equalToWhenPresent(record::getMfcarnum)
                .set(happensfcarnum).equalToWhenPresent(record::getHappensfcarnum)
                .set(remarks).equalToWhenPresent(record::getRemarks);
    }
}