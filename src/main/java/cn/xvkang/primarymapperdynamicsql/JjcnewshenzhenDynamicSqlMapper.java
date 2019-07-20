package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.JjcnewshenzhenDynamicSqlSupport.*;

import cn.xvkang.primaryentity.Jjcnewshenzhen;
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
public interface JjcnewshenzhenDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.127+08:00", comments="Source Table: JJCNEWSHENZHEN")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.127+08:00", comments="Source Table: JJCNEWSHENZHEN")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.127+08:00", comments="Source Table: JJCNEWSHENZHEN")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Jjcnewshenzhen> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.127+08:00", comments="Source Table: JJCNEWSHENZHEN")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="JjcnewshenzhenResult", value = {
        @Result(column="CardType", property="cardtype", jdbcType=JdbcType.VARCHAR),
        @Result(column="FirstChargeTimeHour", property="firstchargetimehour", jdbcType=JdbcType.INTEGER),
        @Result(column="FirstChargeTimeMinute", property="firstchargetimeminute", jdbcType=JdbcType.INTEGER),
        @Result(column="CarParkType", property="carparktype", jdbcType=JdbcType.INTEGER),
        @Result(column="ChargeByDay", property="chargebyday", jdbcType=JdbcType.DECIMAL),
        @Result(column="FreeMinute", property="freeminute", jdbcType=JdbcType.INTEGER),
        @Result(column="PeakStartHour", property="peakstarthour", jdbcType=JdbcType.INTEGER),
        @Result(column="PeakStartMinute", property="peakstartminute", jdbcType=JdbcType.INTEGER),
        @Result(column="PeakEndHour", property="peakendhour", jdbcType=JdbcType.INTEGER),
        @Result(column="PeakEndMinute", property="peakendminute", jdbcType=JdbcType.INTEGER),
        @Result(column="HolidayOneStartMonth", property="holidayonestartmonth", jdbcType=JdbcType.INTEGER),
        @Result(column="HolidayOneStartDay", property="holidayonestartday", jdbcType=JdbcType.INTEGER),
        @Result(column="HolidayOneEndMonth", property="holidayoneendmonth", jdbcType=JdbcType.INTEGER),
        @Result(column="HolidayOneEndDay", property="holidayoneendday", jdbcType=JdbcType.INTEGER),
        @Result(column="HolidayTwoStartMonth", property="holidaytwostartmonth", jdbcType=JdbcType.INTEGER),
        @Result(column="HolidayTwoStartDay", property="holidaytwostartday", jdbcType=JdbcType.INTEGER),
        @Result(column="HolidayTwoEndMonth", property="holidaytwoendmonth", jdbcType=JdbcType.INTEGER),
        @Result(column="HolidayTwoEndDay", property="holidaytwoendday", jdbcType=JdbcType.INTEGER),
        @Result(column="PeakChargeHour", property="peakchargehour", jdbcType=JdbcType.INTEGER),
        @Result(column="PeakChargeMinute", property="peakchargeminute", jdbcType=JdbcType.INTEGER),
        @Result(column="NoPeakChargeHour", property="nopeakchargehour", jdbcType=JdbcType.INTEGER),
        @Result(column="NoPeakChargeMinute", property="nopeakchargeminute", jdbcType=JdbcType.INTEGER),
        @Result(column="HolidayChargeHour", property="holidaychargehour", jdbcType=JdbcType.INTEGER),
        @Result(column="HolidayChargeMinute", property="holidaychargeminute", jdbcType=JdbcType.INTEGER),
        @Result(column="PeakMoney", property="peakmoney", jdbcType=JdbcType.DECIMAL),
        @Result(column="NoPeakMoney", property="nopeakmoney", jdbcType=JdbcType.DECIMAL),
        @Result(column="HolidayMoney", property="holidaymoney", jdbcType=JdbcType.DECIMAL),
        @Result(column="WorkdayFirstHourMoney", property="workdayfirsthourmoney", jdbcType=JdbcType.DECIMAL),
        @Result(column="HolidayFirstHourMoney", property="holidayfirsthourmoney", jdbcType=JdbcType.DECIMAL),
        @Result(column="AllDayTopMoney", property="alldaytopmoney", jdbcType=JdbcType.DECIMAL),
        @Result(column="YesNoFreeTime", property="yesnofreetime", jdbcType=JdbcType.INTEGER)
    })
    List<Jjcnewshenzhen> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.127+08:00", comments="Source Table: JJCNEWSHENZHEN")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.127+08:00", comments="Source Table: JJCNEWSHENZHEN")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(jjcnewshenzhen);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.127+08:00", comments="Source Table: JJCNEWSHENZHEN")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, jjcnewshenzhen);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.127+08:00", comments="Source Table: JJCNEWSHENZHEN")
    default int insert(Jjcnewshenzhen record) {
        return insert(SqlBuilder.insert(record)
                .into(jjcnewshenzhen)
                .map(cardtype).toProperty("cardtype")
                .map(firstchargetimehour).toProperty("firstchargetimehour")
                .map(firstchargetimeminute).toProperty("firstchargetimeminute")
                .map(carparktype).toProperty("carparktype")
                .map(chargebyday).toProperty("chargebyday")
                .map(freeminute).toProperty("freeminute")
                .map(peakstarthour).toProperty("peakstarthour")
                .map(peakstartminute).toProperty("peakstartminute")
                .map(peakendhour).toProperty("peakendhour")
                .map(peakendminute).toProperty("peakendminute")
                .map(holidayonestartmonth).toProperty("holidayonestartmonth")
                .map(holidayonestartday).toProperty("holidayonestartday")
                .map(holidayoneendmonth).toProperty("holidayoneendmonth")
                .map(holidayoneendday).toProperty("holidayoneendday")
                .map(holidaytwostartmonth).toProperty("holidaytwostartmonth")
                .map(holidaytwostartday).toProperty("holidaytwostartday")
                .map(holidaytwoendmonth).toProperty("holidaytwoendmonth")
                .map(holidaytwoendday).toProperty("holidaytwoendday")
                .map(peakchargehour).toProperty("peakchargehour")
                .map(peakchargeminute).toProperty("peakchargeminute")
                .map(nopeakchargehour).toProperty("nopeakchargehour")
                .map(nopeakchargeminute).toProperty("nopeakchargeminute")
                .map(holidaychargehour).toProperty("holidaychargehour")
                .map(holidaychargeminute).toProperty("holidaychargeminute")
                .map(peakmoney).toProperty("peakmoney")
                .map(nopeakmoney).toProperty("nopeakmoney")
                .map(holidaymoney).toProperty("holidaymoney")
                .map(workdayfirsthourmoney).toProperty("workdayfirsthourmoney")
                .map(holidayfirsthourmoney).toProperty("holidayfirsthourmoney")
                .map(alldaytopmoney).toProperty("alldaytopmoney")
                .map(yesnofreetime).toProperty("yesnofreetime")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.127+08:00", comments="Source Table: JJCNEWSHENZHEN")
    default int insertSelective(Jjcnewshenzhen record) {
        return insert(SqlBuilder.insert(record)
                .into(jjcnewshenzhen)
                .map(cardtype).toPropertyWhenPresent("cardtype", record::getCardtype)
                .map(firstchargetimehour).toPropertyWhenPresent("firstchargetimehour", record::getFirstchargetimehour)
                .map(firstchargetimeminute).toPropertyWhenPresent("firstchargetimeminute", record::getFirstchargetimeminute)
                .map(carparktype).toPropertyWhenPresent("carparktype", record::getCarparktype)
                .map(chargebyday).toPropertyWhenPresent("chargebyday", record::getChargebyday)
                .map(freeminute).toPropertyWhenPresent("freeminute", record::getFreeminute)
                .map(peakstarthour).toPropertyWhenPresent("peakstarthour", record::getPeakstarthour)
                .map(peakstartminute).toPropertyWhenPresent("peakstartminute", record::getPeakstartminute)
                .map(peakendhour).toPropertyWhenPresent("peakendhour", record::getPeakendhour)
                .map(peakendminute).toPropertyWhenPresent("peakendminute", record::getPeakendminute)
                .map(holidayonestartmonth).toPropertyWhenPresent("holidayonestartmonth", record::getHolidayonestartmonth)
                .map(holidayonestartday).toPropertyWhenPresent("holidayonestartday", record::getHolidayonestartday)
                .map(holidayoneendmonth).toPropertyWhenPresent("holidayoneendmonth", record::getHolidayoneendmonth)
                .map(holidayoneendday).toPropertyWhenPresent("holidayoneendday", record::getHolidayoneendday)
                .map(holidaytwostartmonth).toPropertyWhenPresent("holidaytwostartmonth", record::getHolidaytwostartmonth)
                .map(holidaytwostartday).toPropertyWhenPresent("holidaytwostartday", record::getHolidaytwostartday)
                .map(holidaytwoendmonth).toPropertyWhenPresent("holidaytwoendmonth", record::getHolidaytwoendmonth)
                .map(holidaytwoendday).toPropertyWhenPresent("holidaytwoendday", record::getHolidaytwoendday)
                .map(peakchargehour).toPropertyWhenPresent("peakchargehour", record::getPeakchargehour)
                .map(peakchargeminute).toPropertyWhenPresent("peakchargeminute", record::getPeakchargeminute)
                .map(nopeakchargehour).toPropertyWhenPresent("nopeakchargehour", record::getNopeakchargehour)
                .map(nopeakchargeminute).toPropertyWhenPresent("nopeakchargeminute", record::getNopeakchargeminute)
                .map(holidaychargehour).toPropertyWhenPresent("holidaychargehour", record::getHolidaychargehour)
                .map(holidaychargeminute).toPropertyWhenPresent("holidaychargeminute", record::getHolidaychargeminute)
                .map(peakmoney).toPropertyWhenPresent("peakmoney", record::getPeakmoney)
                .map(nopeakmoney).toPropertyWhenPresent("nopeakmoney", record::getNopeakmoney)
                .map(holidaymoney).toPropertyWhenPresent("holidaymoney", record::getHolidaymoney)
                .map(workdayfirsthourmoney).toPropertyWhenPresent("workdayfirsthourmoney", record::getWorkdayfirsthourmoney)
                .map(holidayfirsthourmoney).toPropertyWhenPresent("holidayfirsthourmoney", record::getHolidayfirsthourmoney)
                .map(alldaytopmoney).toPropertyWhenPresent("alldaytopmoney", record::getAlldaytopmoney)
                .map(yesnofreetime).toPropertyWhenPresent("yesnofreetime", record::getYesnofreetime)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.128+08:00", comments="Source Table: JJCNEWSHENZHEN")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Jjcnewshenzhen>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, cardtype, firstchargetimehour, firstchargetimeminute, carparktype, chargebyday, freeminute, peakstarthour, peakstartminute, peakendhour, peakendminute, holidayonestartmonth, holidayonestartday, holidayoneendmonth, holidayoneendday, holidaytwostartmonth, holidaytwostartday, holidaytwoendmonth, holidaytwoendday, peakchargehour, peakchargeminute, nopeakchargehour, nopeakchargeminute, holidaychargehour, holidaychargeminute, peakmoney, nopeakmoney, holidaymoney, workdayfirsthourmoney, holidayfirsthourmoney, alldaytopmoney, yesnofreetime)
                .from(jjcnewshenzhen);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.128+08:00", comments="Source Table: JJCNEWSHENZHEN")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Jjcnewshenzhen>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, cardtype, firstchargetimehour, firstchargetimeminute, carparktype, chargebyday, freeminute, peakstarthour, peakstartminute, peakendhour, peakendminute, holidayonestartmonth, holidayonestartday, holidayoneendmonth, holidayoneendday, holidaytwostartmonth, holidaytwostartday, holidaytwoendmonth, holidaytwoendday, peakchargehour, peakchargeminute, nopeakchargehour, nopeakchargeminute, holidaychargehour, holidaychargeminute, peakmoney, nopeakmoney, holidaymoney, workdayfirsthourmoney, holidayfirsthourmoney, alldaytopmoney, yesnofreetime)
                .from(jjcnewshenzhen);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.128+08:00", comments="Source Table: JJCNEWSHENZHEN")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Jjcnewshenzhen record) {
        return UpdateDSL.updateWithMapper(this::update, jjcnewshenzhen)
                .set(cardtype).equalTo(record::getCardtype)
                .set(firstchargetimehour).equalTo(record::getFirstchargetimehour)
                .set(firstchargetimeminute).equalTo(record::getFirstchargetimeminute)
                .set(carparktype).equalTo(record::getCarparktype)
                .set(chargebyday).equalTo(record::getChargebyday)
                .set(freeminute).equalTo(record::getFreeminute)
                .set(peakstarthour).equalTo(record::getPeakstarthour)
                .set(peakstartminute).equalTo(record::getPeakstartminute)
                .set(peakendhour).equalTo(record::getPeakendhour)
                .set(peakendminute).equalTo(record::getPeakendminute)
                .set(holidayonestartmonth).equalTo(record::getHolidayonestartmonth)
                .set(holidayonestartday).equalTo(record::getHolidayonestartday)
                .set(holidayoneendmonth).equalTo(record::getHolidayoneendmonth)
                .set(holidayoneendday).equalTo(record::getHolidayoneendday)
                .set(holidaytwostartmonth).equalTo(record::getHolidaytwostartmonth)
                .set(holidaytwostartday).equalTo(record::getHolidaytwostartday)
                .set(holidaytwoendmonth).equalTo(record::getHolidaytwoendmonth)
                .set(holidaytwoendday).equalTo(record::getHolidaytwoendday)
                .set(peakchargehour).equalTo(record::getPeakchargehour)
                .set(peakchargeminute).equalTo(record::getPeakchargeminute)
                .set(nopeakchargehour).equalTo(record::getNopeakchargehour)
                .set(nopeakchargeminute).equalTo(record::getNopeakchargeminute)
                .set(holidaychargehour).equalTo(record::getHolidaychargehour)
                .set(holidaychargeminute).equalTo(record::getHolidaychargeminute)
                .set(peakmoney).equalTo(record::getPeakmoney)
                .set(nopeakmoney).equalTo(record::getNopeakmoney)
                .set(holidaymoney).equalTo(record::getHolidaymoney)
                .set(workdayfirsthourmoney).equalTo(record::getWorkdayfirsthourmoney)
                .set(holidayfirsthourmoney).equalTo(record::getHolidayfirsthourmoney)
                .set(alldaytopmoney).equalTo(record::getAlldaytopmoney)
                .set(yesnofreetime).equalTo(record::getYesnofreetime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.128+08:00", comments="Source Table: JJCNEWSHENZHEN")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Jjcnewshenzhen record) {
        return UpdateDSL.updateWithMapper(this::update, jjcnewshenzhen)
                .set(cardtype).equalToWhenPresent(record::getCardtype)
                .set(firstchargetimehour).equalToWhenPresent(record::getFirstchargetimehour)
                .set(firstchargetimeminute).equalToWhenPresent(record::getFirstchargetimeminute)
                .set(carparktype).equalToWhenPresent(record::getCarparktype)
                .set(chargebyday).equalToWhenPresent(record::getChargebyday)
                .set(freeminute).equalToWhenPresent(record::getFreeminute)
                .set(peakstarthour).equalToWhenPresent(record::getPeakstarthour)
                .set(peakstartminute).equalToWhenPresent(record::getPeakstartminute)
                .set(peakendhour).equalToWhenPresent(record::getPeakendhour)
                .set(peakendminute).equalToWhenPresent(record::getPeakendminute)
                .set(holidayonestartmonth).equalToWhenPresent(record::getHolidayonestartmonth)
                .set(holidayonestartday).equalToWhenPresent(record::getHolidayonestartday)
                .set(holidayoneendmonth).equalToWhenPresent(record::getHolidayoneendmonth)
                .set(holidayoneendday).equalToWhenPresent(record::getHolidayoneendday)
                .set(holidaytwostartmonth).equalToWhenPresent(record::getHolidaytwostartmonth)
                .set(holidaytwostartday).equalToWhenPresent(record::getHolidaytwostartday)
                .set(holidaytwoendmonth).equalToWhenPresent(record::getHolidaytwoendmonth)
                .set(holidaytwoendday).equalToWhenPresent(record::getHolidaytwoendday)
                .set(peakchargehour).equalToWhenPresent(record::getPeakchargehour)
                .set(peakchargeminute).equalToWhenPresent(record::getPeakchargeminute)
                .set(nopeakchargehour).equalToWhenPresent(record::getNopeakchargehour)
                .set(nopeakchargeminute).equalToWhenPresent(record::getNopeakchargeminute)
                .set(holidaychargehour).equalToWhenPresent(record::getHolidaychargehour)
                .set(holidaychargeminute).equalToWhenPresent(record::getHolidaychargeminute)
                .set(peakmoney).equalToWhenPresent(record::getPeakmoney)
                .set(nopeakmoney).equalToWhenPresent(record::getNopeakmoney)
                .set(holidaymoney).equalToWhenPresent(record::getHolidaymoney)
                .set(workdayfirsthourmoney).equalToWhenPresent(record::getWorkdayfirsthourmoney)
                .set(holidayfirsthourmoney).equalToWhenPresent(record::getHolidayfirsthourmoney)
                .set(alldaytopmoney).equalToWhenPresent(record::getAlldaytopmoney)
                .set(yesnofreetime).equalToWhenPresent(record::getYesnofreetime);
    }
}