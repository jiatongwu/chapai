package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MycargooutrecordDynamicSqlSupport.*;

import cn.xvkang.primaryentity.Mycargooutrecord;
import java.util.List;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
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
public interface MycargooutrecordDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.188+08:00", comments="Source Table: MYCARGOOUTRECORD")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.188+08:00", comments="Source Table: MYCARGOOUTRECORD")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.188+08:00", comments="Source Table: MYCARGOOUTRECORD")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Long.class)
    int insert(InsertStatementProvider<Mycargooutrecord> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.188+08:00", comments="Source Table: MYCARGOOUTRECORD")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MycargooutrecordResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.BIGINT),
        @Result(column="CardNO", property="cardno", jdbcType=JdbcType.VARCHAR),
        @Result(column="CPH", property="cph", jdbcType=JdbcType.VARCHAR),
        @Result(column="CardType", property="cardtype", jdbcType=JdbcType.VARCHAR),
        @Result(column="InTime", property="intime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="OutTime", property="outtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="InGateName", property="ingatename", jdbcType=JdbcType.VARCHAR),
        @Result(column="OutGateName", property="outgatename", jdbcType=JdbcType.VARCHAR),
        @Result(column="InOperatorCard", property="inoperatorcard", jdbcType=JdbcType.VARCHAR),
        @Result(column="OutOperatorCard", property="outoperatorcard", jdbcType=JdbcType.VARCHAR),
        @Result(column="InOperator", property="inoperator", jdbcType=JdbcType.VARCHAR),
        @Result(column="OutOperator", property="outoperator", jdbcType=JdbcType.VARCHAR),
        @Result(column="InPic", property="inpic", jdbcType=JdbcType.VARCHAR),
        @Result(column="InUser", property="inuser", jdbcType=JdbcType.VARCHAR),
        @Result(column="OutPic", property="outpic", jdbcType=JdbcType.VARCHAR),
        @Result(column="OutUser", property="outuser", jdbcType=JdbcType.VARCHAR),
        @Result(column="ZJPic", property="zjpic", jdbcType=JdbcType.VARCHAR),
        @Result(column="SFJE", property="sfje", jdbcType=JdbcType.DECIMAL),
        @Result(column="Balance", property="balance", jdbcType=JdbcType.DECIMAL),
        @Result(column="YSJE", property="ysje", jdbcType=JdbcType.DECIMAL),
        @Result(column="SFTime", property="sftime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="SFOperator", property="sfoperator", jdbcType=JdbcType.VARCHAR),
        @Result(column="SFOperatorCard", property="sfoperatorcard", jdbcType=JdbcType.VARCHAR),
        @Result(column="SFGate", property="sfgate", jdbcType=JdbcType.VARCHAR),
        @Result(column="OvertimeSymbol", property="overtimesymbol", jdbcType=JdbcType.VARCHAR),
        @Result(column="OvertimeSFTime", property="overtimesftime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="OvertimeSFJE", property="overtimesfje", jdbcType=JdbcType.DECIMAL),
        @Result(column="CarparkNO", property="carparkno", jdbcType=JdbcType.INTEGER),
        @Result(column="BigSmall", property="bigsmall", jdbcType=JdbcType.INTEGER),
        @Result(column="FreeReason", property="freereason", jdbcType=JdbcType.VARCHAR),
        @Result(column="StayTime", property="staytime", jdbcType=JdbcType.VARCHAR),
        @Result(column="Temp1", property="temp1", jdbcType=JdbcType.VARCHAR),
        @Result(column="Temp2", property="temp2", jdbcType=JdbcType.VARCHAR),
        @Result(column="Temp3", property="temp3", jdbcType=JdbcType.VARCHAR),
        @Result(column="Temp4", property="temp4", jdbcType=JdbcType.VARCHAR),
        @Result(column="Temp5", property="temp5", jdbcType=JdbcType.VARCHAR),
        @Result(column="bMorePaingCar", property="bmorepaingcar", jdbcType=JdbcType.BIT),
        @Result(column="bDZ", property="bdz", jdbcType=JdbcType.BIT),
        @Result(column="strDZ", property="strdz", jdbcType=JdbcType.VARCHAR)
    })
    List<Mycargooutrecord> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.188+08:00", comments="Source Table: MYCARGOOUTRECORD")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.188+08:00", comments="Source Table: MYCARGOOUTRECORD")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(mycargooutrecord);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.188+08:00", comments="Source Table: MYCARGOOUTRECORD")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, mycargooutrecord);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.188+08:00", comments="Source Table: MYCARGOOUTRECORD")
    default int insert(Mycargooutrecord record) {
        return insert(SqlBuilder.insert(record)
                .into(mycargooutrecord)
                .map(cardno).toProperty("cardno")
                .map(cph).toProperty("cph")
                .map(cardtype).toProperty("cardtype")
                .map(intime).toProperty("intime")
                .map(outtime).toProperty("outtime")
                .map(ingatename).toProperty("ingatename")
                .map(outgatename).toProperty("outgatename")
                .map(inoperatorcard).toProperty("inoperatorcard")
                .map(outoperatorcard).toProperty("outoperatorcard")
                .map(inoperator).toProperty("inoperator")
                .map(outoperator).toProperty("outoperator")
                .map(inpic).toProperty("inpic")
                .map(inuser).toProperty("inuser")
                .map(outpic).toProperty("outpic")
                .map(outuser).toProperty("outuser")
                .map(zjpic).toProperty("zjpic")
                .map(sfje).toProperty("sfje")
                .map(balance).toProperty("balance")
                .map(ysje).toProperty("ysje")
                .map(sftime).toProperty("sftime")
                .map(sfoperator).toProperty("sfoperator")
                .map(sfoperatorcard).toProperty("sfoperatorcard")
                .map(sfgate).toProperty("sfgate")
                .map(overtimesymbol).toProperty("overtimesymbol")
                .map(overtimesftime).toProperty("overtimesftime")
                .map(overtimesfje).toProperty("overtimesfje")
                .map(carparkno).toProperty("carparkno")
                .map(bigsmall).toProperty("bigsmall")
                .map(freereason).toProperty("freereason")
                .map(staytime).toProperty("staytime")
                .map(temp1).toProperty("temp1")
                .map(temp2).toProperty("temp2")
                .map(temp3).toProperty("temp3")
                .map(temp4).toProperty("temp4")
                .map(temp5).toProperty("temp5")
                .map(bmorepaingcar).toProperty("bmorepaingcar")
                .map(bdz).toProperty("bdz")
                .map(strdz).toProperty("strdz")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.188+08:00", comments="Source Table: MYCARGOOUTRECORD")
    default int insertSelective(Mycargooutrecord record) {
        return insert(SqlBuilder.insert(record)
                .into(mycargooutrecord)
                .map(cardno).toPropertyWhenPresent("cardno", record::getCardno)
                .map(cph).toPropertyWhenPresent("cph", record::getCph)
                .map(cardtype).toPropertyWhenPresent("cardtype", record::getCardtype)
                .map(intime).toPropertyWhenPresent("intime", record::getIntime)
                .map(outtime).toPropertyWhenPresent("outtime", record::getOuttime)
                .map(ingatename).toPropertyWhenPresent("ingatename", record::getIngatename)
                .map(outgatename).toPropertyWhenPresent("outgatename", record::getOutgatename)
                .map(inoperatorcard).toPropertyWhenPresent("inoperatorcard", record::getInoperatorcard)
                .map(outoperatorcard).toPropertyWhenPresent("outoperatorcard", record::getOutoperatorcard)
                .map(inoperator).toPropertyWhenPresent("inoperator", record::getInoperator)
                .map(outoperator).toPropertyWhenPresent("outoperator", record::getOutoperator)
                .map(inpic).toPropertyWhenPresent("inpic", record::getInpic)
                .map(inuser).toPropertyWhenPresent("inuser", record::getInuser)
                .map(outpic).toPropertyWhenPresent("outpic", record::getOutpic)
                .map(outuser).toPropertyWhenPresent("outuser", record::getOutuser)
                .map(zjpic).toPropertyWhenPresent("zjpic", record::getZjpic)
                .map(sfje).toPropertyWhenPresent("sfje", record::getSfje)
                .map(balance).toPropertyWhenPresent("balance", record::getBalance)
                .map(ysje).toPropertyWhenPresent("ysje", record::getYsje)
                .map(sftime).toPropertyWhenPresent("sftime", record::getSftime)
                .map(sfoperator).toPropertyWhenPresent("sfoperator", record::getSfoperator)
                .map(sfoperatorcard).toPropertyWhenPresent("sfoperatorcard", record::getSfoperatorcard)
                .map(sfgate).toPropertyWhenPresent("sfgate", record::getSfgate)
                .map(overtimesymbol).toPropertyWhenPresent("overtimesymbol", record::getOvertimesymbol)
                .map(overtimesftime).toPropertyWhenPresent("overtimesftime", record::getOvertimesftime)
                .map(overtimesfje).toPropertyWhenPresent("overtimesfje", record::getOvertimesfje)
                .map(carparkno).toPropertyWhenPresent("carparkno", record::getCarparkno)
                .map(bigsmall).toPropertyWhenPresent("bigsmall", record::getBigsmall)
                .map(freereason).toPropertyWhenPresent("freereason", record::getFreereason)
                .map(staytime).toPropertyWhenPresent("staytime", record::getStaytime)
                .map(temp1).toPropertyWhenPresent("temp1", record::getTemp1)
                .map(temp2).toPropertyWhenPresent("temp2", record::getTemp2)
                .map(temp3).toPropertyWhenPresent("temp3", record::getTemp3)
                .map(temp4).toPropertyWhenPresent("temp4", record::getTemp4)
                .map(temp5).toPropertyWhenPresent("temp5", record::getTemp5)
                .map(bmorepaingcar).toPropertyWhenPresent("bmorepaingcar", record::getBmorepaingcar)
                .map(bdz).toPropertyWhenPresent("bdz", record::getBdz)
                .map(strdz).toPropertyWhenPresent("strdz", record::getStrdz)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.188+08:00", comments="Source Table: MYCARGOOUTRECORD")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Mycargooutrecord>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, cardno, cph, cardtype, intime, outtime, ingatename, outgatename, inoperatorcard, outoperatorcard, inoperator, outoperator, inpic, inuser, outpic, outuser, zjpic, sfje, balance, ysje, sftime, sfoperator, sfoperatorcard, sfgate, overtimesymbol, overtimesftime, overtimesfje, carparkno, bigsmall, freereason, staytime, temp1, temp2, temp3, temp4, temp5, bmorepaingcar, bdz, strdz)
                .from(mycargooutrecord);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.188+08:00", comments="Source Table: MYCARGOOUTRECORD")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Mycargooutrecord>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, cardno, cph, cardtype, intime, outtime, ingatename, outgatename, inoperatorcard, outoperatorcard, inoperator, outoperator, inpic, inuser, outpic, outuser, zjpic, sfje, balance, ysje, sftime, sfoperator, sfoperatorcard, sfgate, overtimesymbol, overtimesftime, overtimesfje, carparkno, bigsmall, freereason, staytime, temp1, temp2, temp3, temp4, temp5, bmorepaingcar, bdz, strdz)
                .from(mycargooutrecord);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.188+08:00", comments="Source Table: MYCARGOOUTRECORD")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Mycargooutrecord record) {
        return UpdateDSL.updateWithMapper(this::update, mycargooutrecord)
                .set(cardno).equalTo(record::getCardno)
                .set(cph).equalTo(record::getCph)
                .set(cardtype).equalTo(record::getCardtype)
                .set(intime).equalTo(record::getIntime)
                .set(outtime).equalTo(record::getOuttime)
                .set(ingatename).equalTo(record::getIngatename)
                .set(outgatename).equalTo(record::getOutgatename)
                .set(inoperatorcard).equalTo(record::getInoperatorcard)
                .set(outoperatorcard).equalTo(record::getOutoperatorcard)
                .set(inoperator).equalTo(record::getInoperator)
                .set(outoperator).equalTo(record::getOutoperator)
                .set(inpic).equalTo(record::getInpic)
                .set(inuser).equalTo(record::getInuser)
                .set(outpic).equalTo(record::getOutpic)
                .set(outuser).equalTo(record::getOutuser)
                .set(zjpic).equalTo(record::getZjpic)
                .set(sfje).equalTo(record::getSfje)
                .set(balance).equalTo(record::getBalance)
                .set(ysje).equalTo(record::getYsje)
                .set(sftime).equalTo(record::getSftime)
                .set(sfoperator).equalTo(record::getSfoperator)
                .set(sfoperatorcard).equalTo(record::getSfoperatorcard)
                .set(sfgate).equalTo(record::getSfgate)
                .set(overtimesymbol).equalTo(record::getOvertimesymbol)
                .set(overtimesftime).equalTo(record::getOvertimesftime)
                .set(overtimesfje).equalTo(record::getOvertimesfje)
                .set(carparkno).equalTo(record::getCarparkno)
                .set(bigsmall).equalTo(record::getBigsmall)
                .set(freereason).equalTo(record::getFreereason)
                .set(staytime).equalTo(record::getStaytime)
                .set(temp1).equalTo(record::getTemp1)
                .set(temp2).equalTo(record::getTemp2)
                .set(temp3).equalTo(record::getTemp3)
                .set(temp4).equalTo(record::getTemp4)
                .set(temp5).equalTo(record::getTemp5)
                .set(bmorepaingcar).equalTo(record::getBmorepaingcar)
                .set(bdz).equalTo(record::getBdz)
                .set(strdz).equalTo(record::getStrdz);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.189+08:00", comments="Source Table: MYCARGOOUTRECORD")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Mycargooutrecord record) {
        return UpdateDSL.updateWithMapper(this::update, mycargooutrecord)
                .set(cardno).equalToWhenPresent(record::getCardno)
                .set(cph).equalToWhenPresent(record::getCph)
                .set(cardtype).equalToWhenPresent(record::getCardtype)
                .set(intime).equalToWhenPresent(record::getIntime)
                .set(outtime).equalToWhenPresent(record::getOuttime)
                .set(ingatename).equalToWhenPresent(record::getIngatename)
                .set(outgatename).equalToWhenPresent(record::getOutgatename)
                .set(inoperatorcard).equalToWhenPresent(record::getInoperatorcard)
                .set(outoperatorcard).equalToWhenPresent(record::getOutoperatorcard)
                .set(inoperator).equalToWhenPresent(record::getInoperator)
                .set(outoperator).equalToWhenPresent(record::getOutoperator)
                .set(inpic).equalToWhenPresent(record::getInpic)
                .set(inuser).equalToWhenPresent(record::getInuser)
                .set(outpic).equalToWhenPresent(record::getOutpic)
                .set(outuser).equalToWhenPresent(record::getOutuser)
                .set(zjpic).equalToWhenPresent(record::getZjpic)
                .set(sfje).equalToWhenPresent(record::getSfje)
                .set(balance).equalToWhenPresent(record::getBalance)
                .set(ysje).equalToWhenPresent(record::getYsje)
                .set(sftime).equalToWhenPresent(record::getSftime)
                .set(sfoperator).equalToWhenPresent(record::getSfoperator)
                .set(sfoperatorcard).equalToWhenPresent(record::getSfoperatorcard)
                .set(sfgate).equalToWhenPresent(record::getSfgate)
                .set(overtimesymbol).equalToWhenPresent(record::getOvertimesymbol)
                .set(overtimesftime).equalToWhenPresent(record::getOvertimesftime)
                .set(overtimesfje).equalToWhenPresent(record::getOvertimesfje)
                .set(carparkno).equalToWhenPresent(record::getCarparkno)
                .set(bigsmall).equalToWhenPresent(record::getBigsmall)
                .set(freereason).equalToWhenPresent(record::getFreereason)
                .set(staytime).equalToWhenPresent(record::getStaytime)
                .set(temp1).equalToWhenPresent(record::getTemp1)
                .set(temp2).equalToWhenPresent(record::getTemp2)
                .set(temp3).equalToWhenPresent(record::getTemp3)
                .set(temp4).equalToWhenPresent(record::getTemp4)
                .set(temp5).equalToWhenPresent(record::getTemp5)
                .set(bmorepaingcar).equalToWhenPresent(record::getBmorepaingcar)
                .set(bdz).equalToWhenPresent(record::getBdz)
                .set(strdz).equalToWhenPresent(record::getStrdz);
    }
}