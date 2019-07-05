package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.SerFaxingssueDynamicSqlSupport.*;

import cn.xvkang.primaryentity.SerFaxingssue;
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
public interface SerFaxingssueDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.852+08:00", comments="Source Table: Ser_FaxingSsue")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.852+08:00", comments="Source Table: Ser_FaxingSsue")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.853+08:00", comments="Source Table: Ser_FaxingSsue")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SerFaxingssue> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.853+08:00", comments="Source Table: Ser_FaxingSsue")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SerFaxingssueResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER),
        @Result(column="CardNo", property="cardno", jdbcType=JdbcType.VARCHAR),
        @Result(column="CardIDNo", property="cardidno", jdbcType=JdbcType.VARCHAR),
        @Result(column="UserNo", property="userno", jdbcType=JdbcType.VARCHAR),
        @Result(column="CardState", property="cardstate", jdbcType=JdbcType.INTEGER),
        @Result(column="IssDate", property="issdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CardType", property="cardtype", jdbcType=JdbcType.INTEGER),
        @Result(column="TemNum", property="temnum", jdbcType=JdbcType.INTEGER),
        @Result(column="TimeTeam", property="timeteam", jdbcType=JdbcType.INTEGER),
        @Result(column="CaseCade", property="casecade", jdbcType=JdbcType.INTEGER),
        @Result(column="EndDate", property="enddate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="DoorMark", property="doormark", jdbcType=JdbcType.VARCHAR),
        @Result(column="DoorPerInfo", property="doorperinfo", jdbcType=JdbcType.VARCHAR),
        @Result(column="Holiday", property="holiday", jdbcType=JdbcType.VARCHAR),
        @Result(column="SysHoliday", property="sysholiday", jdbcType=JdbcType.VARCHAR),
        @Result(column="DevcNum", property="devcnum", jdbcType=JdbcType.VARCHAR),
        @Result(column="DoorNum", property="doornum", jdbcType=JdbcType.VARCHAR),
        @Result(column="CardDownFlag", property="carddownflag", jdbcType=JdbcType.INTEGER)
    })
    List<SerFaxingssue> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.853+08:00", comments="Source Table: Ser_FaxingSsue")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.853+08:00", comments="Source Table: Ser_FaxingSsue")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(serFaxingssue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.853+08:00", comments="Source Table: Ser_FaxingSsue")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, serFaxingssue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.853+08:00", comments="Source Table: Ser_FaxingSsue")
    default int insert(SerFaxingssue record) {
        return insert(SqlBuilder.insert(record)
                .into(serFaxingssue)
                .map(id).toProperty("id")
                .map(cardno).toProperty("cardno")
                .map(cardidno).toProperty("cardidno")
                .map(userno).toProperty("userno")
                .map(cardstate).toProperty("cardstate")
                .map(issdate).toProperty("issdate")
                .map(cardtype).toProperty("cardtype")
                .map(temnum).toProperty("temnum")
                .map(timeteam).toProperty("timeteam")
                .map(casecade).toProperty("casecade")
                .map(enddate).toProperty("enddate")
                .map(doormark).toProperty("doormark")
                .map(doorperinfo).toProperty("doorperinfo")
                .map(holiday).toProperty("holiday")
                .map(sysholiday).toProperty("sysholiday")
                .map(devcnum).toProperty("devcnum")
                .map(doornum).toProperty("doornum")
                .map(carddownflag).toProperty("carddownflag")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.853+08:00", comments="Source Table: Ser_FaxingSsue")
    default int insertSelective(SerFaxingssue record) {
        return insert(SqlBuilder.insert(record)
                .into(serFaxingssue)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(cardno).toPropertyWhenPresent("cardno", record::getCardno)
                .map(cardidno).toPropertyWhenPresent("cardidno", record::getCardidno)
                .map(userno).toPropertyWhenPresent("userno", record::getUserno)
                .map(cardstate).toPropertyWhenPresent("cardstate", record::getCardstate)
                .map(issdate).toPropertyWhenPresent("issdate", record::getIssdate)
                .map(cardtype).toPropertyWhenPresent("cardtype", record::getCardtype)
                .map(temnum).toPropertyWhenPresent("temnum", record::getTemnum)
                .map(timeteam).toPropertyWhenPresent("timeteam", record::getTimeteam)
                .map(casecade).toPropertyWhenPresent("casecade", record::getCasecade)
                .map(enddate).toPropertyWhenPresent("enddate", record::getEnddate)
                .map(doormark).toPropertyWhenPresent("doormark", record::getDoormark)
                .map(doorperinfo).toPropertyWhenPresent("doorperinfo", record::getDoorperinfo)
                .map(holiday).toPropertyWhenPresent("holiday", record::getHoliday)
                .map(sysholiday).toPropertyWhenPresent("sysholiday", record::getSysholiday)
                .map(devcnum).toPropertyWhenPresent("devcnum", record::getDevcnum)
                .map(doornum).toPropertyWhenPresent("doornum", record::getDoornum)
                .map(carddownflag).toPropertyWhenPresent("carddownflag", record::getCarddownflag)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.853+08:00", comments="Source Table: Ser_FaxingSsue")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<SerFaxingssue>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, cardno, cardidno, userno, cardstate, issdate, cardtype, temnum, timeteam, casecade, enddate, doormark, doorperinfo, holiday, sysholiday, devcnum, doornum, carddownflag)
                .from(serFaxingssue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.853+08:00", comments="Source Table: Ser_FaxingSsue")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<SerFaxingssue>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, cardno, cardidno, userno, cardstate, issdate, cardtype, temnum, timeteam, casecade, enddate, doormark, doorperinfo, holiday, sysholiday, devcnum, doornum, carddownflag)
                .from(serFaxingssue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.853+08:00", comments="Source Table: Ser_FaxingSsue")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(SerFaxingssue record) {
        return UpdateDSL.updateWithMapper(this::update, serFaxingssue)
                .set(id).equalTo(record::getId)
                .set(cardno).equalTo(record::getCardno)
                .set(cardidno).equalTo(record::getCardidno)
                .set(userno).equalTo(record::getUserno)
                .set(cardstate).equalTo(record::getCardstate)
                .set(issdate).equalTo(record::getIssdate)
                .set(cardtype).equalTo(record::getCardtype)
                .set(temnum).equalTo(record::getTemnum)
                .set(timeteam).equalTo(record::getTimeteam)
                .set(casecade).equalTo(record::getCasecade)
                .set(enddate).equalTo(record::getEnddate)
                .set(doormark).equalTo(record::getDoormark)
                .set(doorperinfo).equalTo(record::getDoorperinfo)
                .set(holiday).equalTo(record::getHoliday)
                .set(sysholiday).equalTo(record::getSysholiday)
                .set(devcnum).equalTo(record::getDevcnum)
                .set(doornum).equalTo(record::getDoornum)
                .set(carddownflag).equalTo(record::getCarddownflag);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.853+08:00", comments="Source Table: Ser_FaxingSsue")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(SerFaxingssue record) {
        return UpdateDSL.updateWithMapper(this::update, serFaxingssue)
                .set(id).equalToWhenPresent(record::getId)
                .set(cardno).equalToWhenPresent(record::getCardno)
                .set(cardidno).equalToWhenPresent(record::getCardidno)
                .set(userno).equalToWhenPresent(record::getUserno)
                .set(cardstate).equalToWhenPresent(record::getCardstate)
                .set(issdate).equalToWhenPresent(record::getIssdate)
                .set(cardtype).equalToWhenPresent(record::getCardtype)
                .set(temnum).equalToWhenPresent(record::getTemnum)
                .set(timeteam).equalToWhenPresent(record::getTimeteam)
                .set(casecade).equalToWhenPresent(record::getCasecade)
                .set(enddate).equalToWhenPresent(record::getEnddate)
                .set(doormark).equalToWhenPresent(record::getDoormark)
                .set(doorperinfo).equalToWhenPresent(record::getDoorperinfo)
                .set(holiday).equalToWhenPresent(record::getHoliday)
                .set(sysholiday).equalToWhenPresent(record::getSysholiday)
                .set(devcnum).equalToWhenPresent(record::getDevcnum)
                .set(doornum).equalToWhenPresent(record::getDoornum)
                .set(carddownflag).equalToWhenPresent(record::getCarddownflag);
    }
}