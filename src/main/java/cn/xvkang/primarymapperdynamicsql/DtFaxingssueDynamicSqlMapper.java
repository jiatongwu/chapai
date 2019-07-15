package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.DtFaxingssueDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.DtFaxingssue;
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
public interface DtFaxingssueDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.619+08:00", comments="Source Table: Dt_FaxingSsue")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.619+08:00", comments="Source Table: Dt_FaxingSsue")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.619+08:00", comments="Source Table: Dt_FaxingSsue")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<DtFaxingssue> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.619+08:00", comments="Source Table: Dt_FaxingSsue")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("DtFaxingssueResult")
    DtFaxingssue selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.620+08:00", comments="Source Table: Dt_FaxingSsue")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="DtFaxingssueResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CardNo", property="cardno", jdbcType=JdbcType.VARCHAR),
        @Result(column="CardIDNO", property="cardidno", jdbcType=JdbcType.VARCHAR),
        @Result(column="CardIdIcflag", property="cardidicflag", jdbcType=JdbcType.INTEGER),
        @Result(column="UserNo", property="userno", jdbcType=JdbcType.VARCHAR),
        @Result(column="CardState", property="cardstate", jdbcType=JdbcType.INTEGER),
        @Result(column="IssDate", property="issdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CardType", property="cardtype", jdbcType=JdbcType.INTEGER),
        @Result(column="TemNum", property="temnum", jdbcType=JdbcType.INTEGER),
        @Result(column="TimeTeam", property="timeteam", jdbcType=JdbcType.INTEGER),
        @Result(column="EndDate", property="enddate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="PersonDevcID", property="persondevcid", jdbcType=JdbcType.INTEGER),
        @Result(column="PersonFoorid", property="personfoorid", jdbcType=JdbcType.INTEGER),
        @Result(column="Mark", property="mark", jdbcType=JdbcType.VARCHAR),
        @Result(column="Holiday", property="holiday", jdbcType=JdbcType.VARCHAR),
        @Result(column="visitsFloor", property="visitsfloor", jdbcType=JdbcType.VARCHAR),
        @Result(column="isitsFlag", property="isitsflag", jdbcType=JdbcType.VARCHAR),
        @Result(column="CardExitflag", property="cardexitflag", jdbcType=JdbcType.BIT),
        @Result(column="CardDownFlag", property="carddownflag", jdbcType=JdbcType.BIT),
        @Result(column="SfMoeny", property="sfmoeny", jdbcType=JdbcType.INTEGER),
        @Result(column="fxmode", property="fxmode", jdbcType=JdbcType.INTEGER),
        @Result(column="TineOnline", property="tineonline", jdbcType=JdbcType.CLOB)
    })
    List<DtFaxingssue> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.620+08:00", comments="Source Table: Dt_FaxingSsue")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.620+08:00", comments="Source Table: Dt_FaxingSsue")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(dtFaxingssue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.620+08:00", comments="Source Table: Dt_FaxingSsue")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, dtFaxingssue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.620+08:00", comments="Source Table: Dt_FaxingSsue")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, dtFaxingssue)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.620+08:00", comments="Source Table: Dt_FaxingSsue")
    default int insert(DtFaxingssue record) {
        return insert(SqlBuilder.insert(record)
                .into(dtFaxingssue)
                .map(cardno).toProperty("cardno")
                .map(cardidno).toProperty("cardidno")
                .map(cardidicflag).toProperty("cardidicflag")
                .map(userno).toProperty("userno")
                .map(cardstate).toProperty("cardstate")
                .map(issdate).toProperty("issdate")
                .map(cardtype).toProperty("cardtype")
                .map(temnum).toProperty("temnum")
                .map(timeteam).toProperty("timeteam")
                .map(enddate).toProperty("enddate")
                .map(persondevcid).toProperty("persondevcid")
                .map(personfoorid).toProperty("personfoorid")
                .map(mark).toProperty("mark")
                .map(holiday).toProperty("holiday")
                .map(visitsfloor).toProperty("visitsfloor")
                .map(isitsflag).toProperty("isitsflag")
                .map(cardexitflag).toProperty("cardexitflag")
                .map(carddownflag).toProperty("carddownflag")
                .map(sfmoeny).toProperty("sfmoeny")
                .map(fxmode).toProperty("fxmode")
                .map(tineonline).toProperty("tineonline")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.620+08:00", comments="Source Table: Dt_FaxingSsue")
    default int insertSelective(DtFaxingssue record) {
        return insert(SqlBuilder.insert(record)
                .into(dtFaxingssue)
                .map(cardno).toPropertyWhenPresent("cardno", record::getCardno)
                .map(cardidno).toPropertyWhenPresent("cardidno", record::getCardidno)
                .map(cardidicflag).toPropertyWhenPresent("cardidicflag", record::getCardidicflag)
                .map(userno).toPropertyWhenPresent("userno", record::getUserno)
                .map(cardstate).toPropertyWhenPresent("cardstate", record::getCardstate)
                .map(issdate).toPropertyWhenPresent("issdate", record::getIssdate)
                .map(cardtype).toPropertyWhenPresent("cardtype", record::getCardtype)
                .map(temnum).toPropertyWhenPresent("temnum", record::getTemnum)
                .map(timeteam).toPropertyWhenPresent("timeteam", record::getTimeteam)
                .map(enddate).toPropertyWhenPresent("enddate", record::getEnddate)
                .map(persondevcid).toPropertyWhenPresent("persondevcid", record::getPersondevcid)
                .map(personfoorid).toPropertyWhenPresent("personfoorid", record::getPersonfoorid)
                .map(mark).toPropertyWhenPresent("mark", record::getMark)
                .map(holiday).toPropertyWhenPresent("holiday", record::getHoliday)
                .map(visitsfloor).toPropertyWhenPresent("visitsfloor", record::getVisitsfloor)
                .map(isitsflag).toPropertyWhenPresent("isitsflag", record::getIsitsflag)
                .map(cardexitflag).toPropertyWhenPresent("cardexitflag", record::getCardexitflag)
                .map(carddownflag).toPropertyWhenPresent("carddownflag", record::getCarddownflag)
                .map(sfmoeny).toPropertyWhenPresent("sfmoeny", record::getSfmoeny)
                .map(fxmode).toPropertyWhenPresent("fxmode", record::getFxmode)
                .map(tineonline).toPropertyWhenPresent("tineonline", record::getTineonline)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.620+08:00", comments="Source Table: Dt_FaxingSsue")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<DtFaxingssue>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, cardno, cardidno, cardidicflag, userno, cardstate, issdate, cardtype, temnum, timeteam, enddate, persondevcid, personfoorid, mark, holiday, visitsfloor, isitsflag, cardexitflag, carddownflag, sfmoeny, fxmode, tineonline)
                .from(dtFaxingssue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.620+08:00", comments="Source Table: Dt_FaxingSsue")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<DtFaxingssue>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, cardno, cardidno, cardidicflag, userno, cardstate, issdate, cardtype, temnum, timeteam, enddate, persondevcid, personfoorid, mark, holiday, visitsfloor, isitsflag, cardexitflag, carddownflag, sfmoeny, fxmode, tineonline)
                .from(dtFaxingssue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.620+08:00", comments="Source Table: Dt_FaxingSsue")
    default DtFaxingssue selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, cardno, cardidno, cardidicflag, userno, cardstate, issdate, cardtype, temnum, timeteam, enddate, persondevcid, personfoorid, mark, holiday, visitsfloor, isitsflag, cardexitflag, carddownflag, sfmoeny, fxmode, tineonline)
                .from(dtFaxingssue)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.620+08:00", comments="Source Table: Dt_FaxingSsue")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(DtFaxingssue record) {
        return UpdateDSL.updateWithMapper(this::update, dtFaxingssue)
                .set(cardno).equalTo(record::getCardno)
                .set(cardidno).equalTo(record::getCardidno)
                .set(cardidicflag).equalTo(record::getCardidicflag)
                .set(userno).equalTo(record::getUserno)
                .set(cardstate).equalTo(record::getCardstate)
                .set(issdate).equalTo(record::getIssdate)
                .set(cardtype).equalTo(record::getCardtype)
                .set(temnum).equalTo(record::getTemnum)
                .set(timeteam).equalTo(record::getTimeteam)
                .set(enddate).equalTo(record::getEnddate)
                .set(persondevcid).equalTo(record::getPersondevcid)
                .set(personfoorid).equalTo(record::getPersonfoorid)
                .set(mark).equalTo(record::getMark)
                .set(holiday).equalTo(record::getHoliday)
                .set(visitsfloor).equalTo(record::getVisitsfloor)
                .set(isitsflag).equalTo(record::getIsitsflag)
                .set(cardexitflag).equalTo(record::getCardexitflag)
                .set(carddownflag).equalTo(record::getCarddownflag)
                .set(sfmoeny).equalTo(record::getSfmoeny)
                .set(fxmode).equalTo(record::getFxmode)
                .set(tineonline).equalTo(record::getTineonline);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.621+08:00", comments="Source Table: Dt_FaxingSsue")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(DtFaxingssue record) {
        return UpdateDSL.updateWithMapper(this::update, dtFaxingssue)
                .set(cardno).equalToWhenPresent(record::getCardno)
                .set(cardidno).equalToWhenPresent(record::getCardidno)
                .set(cardidicflag).equalToWhenPresent(record::getCardidicflag)
                .set(userno).equalToWhenPresent(record::getUserno)
                .set(cardstate).equalToWhenPresent(record::getCardstate)
                .set(issdate).equalToWhenPresent(record::getIssdate)
                .set(cardtype).equalToWhenPresent(record::getCardtype)
                .set(temnum).equalToWhenPresent(record::getTemnum)
                .set(timeteam).equalToWhenPresent(record::getTimeteam)
                .set(enddate).equalToWhenPresent(record::getEnddate)
                .set(persondevcid).equalToWhenPresent(record::getPersondevcid)
                .set(personfoorid).equalToWhenPresent(record::getPersonfoorid)
                .set(mark).equalToWhenPresent(record::getMark)
                .set(holiday).equalToWhenPresent(record::getHoliday)
                .set(visitsfloor).equalToWhenPresent(record::getVisitsfloor)
                .set(isitsflag).equalToWhenPresent(record::getIsitsflag)
                .set(cardexitflag).equalToWhenPresent(record::getCardexitflag)
                .set(carddownflag).equalToWhenPresent(record::getCarddownflag)
                .set(sfmoeny).equalToWhenPresent(record::getSfmoeny)
                .set(fxmode).equalToWhenPresent(record::getFxmode)
                .set(tineonline).equalToWhenPresent(record::getTineonline);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.621+08:00", comments="Source Table: Dt_FaxingSsue")
    default int updateByPrimaryKey(DtFaxingssue record) {
        return UpdateDSL.updateWithMapper(this::update, dtFaxingssue)
                .set(cardno).equalTo(record::getCardno)
                .set(cardidno).equalTo(record::getCardidno)
                .set(cardidicflag).equalTo(record::getCardidicflag)
                .set(userno).equalTo(record::getUserno)
                .set(cardstate).equalTo(record::getCardstate)
                .set(issdate).equalTo(record::getIssdate)
                .set(cardtype).equalTo(record::getCardtype)
                .set(temnum).equalTo(record::getTemnum)
                .set(timeteam).equalTo(record::getTimeteam)
                .set(enddate).equalTo(record::getEnddate)
                .set(persondevcid).equalTo(record::getPersondevcid)
                .set(personfoorid).equalTo(record::getPersonfoorid)
                .set(mark).equalTo(record::getMark)
                .set(holiday).equalTo(record::getHoliday)
                .set(visitsfloor).equalTo(record::getVisitsfloor)
                .set(isitsflag).equalTo(record::getIsitsflag)
                .set(cardexitflag).equalTo(record::getCardexitflag)
                .set(carddownflag).equalTo(record::getCarddownflag)
                .set(sfmoeny).equalTo(record::getSfmoeny)
                .set(fxmode).equalTo(record::getFxmode)
                .set(tineonline).equalTo(record::getTineonline)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.621+08:00", comments="Source Table: Dt_FaxingSsue")
    default int updateByPrimaryKeySelective(DtFaxingssue record) {
        return UpdateDSL.updateWithMapper(this::update, dtFaxingssue)
                .set(cardno).equalToWhenPresent(record::getCardno)
                .set(cardidno).equalToWhenPresent(record::getCardidno)
                .set(cardidicflag).equalToWhenPresent(record::getCardidicflag)
                .set(userno).equalToWhenPresent(record::getUserno)
                .set(cardstate).equalToWhenPresent(record::getCardstate)
                .set(issdate).equalToWhenPresent(record::getIssdate)
                .set(cardtype).equalToWhenPresent(record::getCardtype)
                .set(temnum).equalToWhenPresent(record::getTemnum)
                .set(timeteam).equalToWhenPresent(record::getTimeteam)
                .set(enddate).equalToWhenPresent(record::getEnddate)
                .set(persondevcid).equalToWhenPresent(record::getPersondevcid)
                .set(personfoorid).equalToWhenPresent(record::getPersonfoorid)
                .set(mark).equalToWhenPresent(record::getMark)
                .set(holiday).equalToWhenPresent(record::getHoliday)
                .set(visitsfloor).equalToWhenPresent(record::getVisitsfloor)
                .set(isitsflag).equalToWhenPresent(record::getIsitsflag)
                .set(cardexitflag).equalToWhenPresent(record::getCardexitflag)
                .set(carddownflag).equalToWhenPresent(record::getCarddownflag)
                .set(sfmoeny).equalToWhenPresent(record::getSfmoeny)
                .set(fxmode).equalToWhenPresent(record::getFxmode)
                .set(tineonline).equalToWhenPresent(record::getTineonline)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}