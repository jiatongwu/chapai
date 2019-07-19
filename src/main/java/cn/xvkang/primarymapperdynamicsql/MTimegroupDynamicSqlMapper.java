package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MTimegroupDynamicSqlSupport.*;

import cn.xvkang.primaryentity.MTimegroup;
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
public interface MTimegroupDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.795+08:00", comments="Source Table: M_TimeGroup")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.795+08:00", comments="Source Table: M_TimeGroup")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.795+08:00", comments="Source Table: M_TimeGroup")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MTimegroup> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.795+08:00", comments="Source Table: M_TimeGroup")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MTimegroupResult", value = {
        @Result(column="GroupID", property="groupid", jdbcType=JdbcType.INTEGER),
        @Result(column="GroupName", property="groupname", jdbcType=JdbcType.VARCHAR),
        @Result(column="week", property="week", jdbcType=JdbcType.INTEGER),
        @Result(column="FirstBeginTime", property="firstbegintime", jdbcType=JdbcType.VARCHAR),
        @Result(column="FirstEndTime", property="firstendtime", jdbcType=JdbcType.VARCHAR),
        @Result(column="OpenModel1", property="openmodel1", jdbcType=JdbcType.VARCHAR),
        @Result(column="Status1", property="status1", jdbcType=JdbcType.VARCHAR),
        @Result(column="SecondBeginTime", property="secondbegintime", jdbcType=JdbcType.VARCHAR),
        @Result(column="SecondEndTime", property="secondendtime", jdbcType=JdbcType.VARCHAR),
        @Result(column="OpenModel2", property="openmodel2", jdbcType=JdbcType.VARCHAR),
        @Result(column="Status2", property="status2", jdbcType=JdbcType.VARCHAR),
        @Result(column="ThirdBeginTime", property="thirdbegintime", jdbcType=JdbcType.VARCHAR),
        @Result(column="ThirdEndTime", property="thirdendtime", jdbcType=JdbcType.VARCHAR),
        @Result(column="OpenModel3", property="openmodel3", jdbcType=JdbcType.VARCHAR),
        @Result(column="Status3", property="status3", jdbcType=JdbcType.VARCHAR),
        @Result(column="FourBeginTime", property="fourbegintime", jdbcType=JdbcType.VARCHAR),
        @Result(column="FourEndTime", property="fourendtime", jdbcType=JdbcType.VARCHAR),
        @Result(column="OpenModel4", property="openmodel4", jdbcType=JdbcType.VARCHAR),
        @Result(column="Status4", property="status4", jdbcType=JdbcType.VARCHAR),
        @Result(column="FiveBeginTime", property="fivebegintime", jdbcType=JdbcType.VARCHAR),
        @Result(column="FiveEndTime", property="fiveendtime", jdbcType=JdbcType.VARCHAR),
        @Result(column="OpenModel5", property="openmodel5", jdbcType=JdbcType.VARCHAR),
        @Result(column="Status5", property="status5", jdbcType=JdbcType.VARCHAR),
        @Result(column="SixBeginTime", property="sixbegintime", jdbcType=JdbcType.VARCHAR),
        @Result(column="SixEndTime", property="sixendtime", jdbcType=JdbcType.VARCHAR),
        @Result(column="OpenModel6", property="openmodel6", jdbcType=JdbcType.VARCHAR),
        @Result(column="Status6", property="status6", jdbcType=JdbcType.VARCHAR),
        @Result(column="SevenBeginTime", property="sevenbegintime", jdbcType=JdbcType.VARCHAR),
        @Result(column="SevenEndTime", property="sevenendtime", jdbcType=JdbcType.VARCHAR),
        @Result(column="OpenModel7", property="openmodel7", jdbcType=JdbcType.VARCHAR),
        @Result(column="Status7", property="status7", jdbcType=JdbcType.VARCHAR),
        @Result(column="EightBeginTime", property="eightbegintime", jdbcType=JdbcType.VARCHAR),
        @Result(column="EightEndTime", property="eightendtime", jdbcType=JdbcType.VARCHAR),
        @Result(column="OpenModel8", property="openmodel8", jdbcType=JdbcType.VARCHAR),
        @Result(column="Status8", property="status8", jdbcType=JdbcType.VARCHAR),
        @Result(column="TimCount", property="timcount", jdbcType=JdbcType.VARCHAR)
    })
    List<MTimegroup> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.795+08:00", comments="Source Table: M_TimeGroup")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.795+08:00", comments="Source Table: M_TimeGroup")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(MTimegroup);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.795+08:00", comments="Source Table: M_TimeGroup")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, MTimegroup);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.795+08:00", comments="Source Table: M_TimeGroup")
    default int insert(MTimegroup record) {
        return insert(SqlBuilder.insert(record)
                .into(MTimegroup)
                .map(groupid).toProperty("groupid")
                .map(groupname).toProperty("groupname")
                .map(week).toProperty("week")
                .map(firstbegintime).toProperty("firstbegintime")
                .map(firstendtime).toProperty("firstendtime")
                .map(openmodel1).toProperty("openmodel1")
                .map(status1).toProperty("status1")
                .map(secondbegintime).toProperty("secondbegintime")
                .map(secondendtime).toProperty("secondendtime")
                .map(openmodel2).toProperty("openmodel2")
                .map(status2).toProperty("status2")
                .map(thirdbegintime).toProperty("thirdbegintime")
                .map(thirdendtime).toProperty("thirdendtime")
                .map(openmodel3).toProperty("openmodel3")
                .map(status3).toProperty("status3")
                .map(fourbegintime).toProperty("fourbegintime")
                .map(fourendtime).toProperty("fourendtime")
                .map(openmodel4).toProperty("openmodel4")
                .map(status4).toProperty("status4")
                .map(fivebegintime).toProperty("fivebegintime")
                .map(fiveendtime).toProperty("fiveendtime")
                .map(openmodel5).toProperty("openmodel5")
                .map(status5).toProperty("status5")
                .map(sixbegintime).toProperty("sixbegintime")
                .map(sixendtime).toProperty("sixendtime")
                .map(openmodel6).toProperty("openmodel6")
                .map(status6).toProperty("status6")
                .map(sevenbegintime).toProperty("sevenbegintime")
                .map(sevenendtime).toProperty("sevenendtime")
                .map(openmodel7).toProperty("openmodel7")
                .map(status7).toProperty("status7")
                .map(eightbegintime).toProperty("eightbegintime")
                .map(eightendtime).toProperty("eightendtime")
                .map(openmodel8).toProperty("openmodel8")
                .map(status8).toProperty("status8")
                .map(timcount).toProperty("timcount")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.795+08:00", comments="Source Table: M_TimeGroup")
    default int insertSelective(MTimegroup record) {
        return insert(SqlBuilder.insert(record)
                .into(MTimegroup)
                .map(groupid).toPropertyWhenPresent("groupid", record::getGroupid)
                .map(groupname).toPropertyWhenPresent("groupname", record::getGroupname)
                .map(week).toPropertyWhenPresent("week", record::getWeek)
                .map(firstbegintime).toPropertyWhenPresent("firstbegintime", record::getFirstbegintime)
                .map(firstendtime).toPropertyWhenPresent("firstendtime", record::getFirstendtime)
                .map(openmodel1).toPropertyWhenPresent("openmodel1", record::getOpenmodel1)
                .map(status1).toPropertyWhenPresent("status1", record::getStatus1)
                .map(secondbegintime).toPropertyWhenPresent("secondbegintime", record::getSecondbegintime)
                .map(secondendtime).toPropertyWhenPresent("secondendtime", record::getSecondendtime)
                .map(openmodel2).toPropertyWhenPresent("openmodel2", record::getOpenmodel2)
                .map(status2).toPropertyWhenPresent("status2", record::getStatus2)
                .map(thirdbegintime).toPropertyWhenPresent("thirdbegintime", record::getThirdbegintime)
                .map(thirdendtime).toPropertyWhenPresent("thirdendtime", record::getThirdendtime)
                .map(openmodel3).toPropertyWhenPresent("openmodel3", record::getOpenmodel3)
                .map(status3).toPropertyWhenPresent("status3", record::getStatus3)
                .map(fourbegintime).toPropertyWhenPresent("fourbegintime", record::getFourbegintime)
                .map(fourendtime).toPropertyWhenPresent("fourendtime", record::getFourendtime)
                .map(openmodel4).toPropertyWhenPresent("openmodel4", record::getOpenmodel4)
                .map(status4).toPropertyWhenPresent("status4", record::getStatus4)
                .map(fivebegintime).toPropertyWhenPresent("fivebegintime", record::getFivebegintime)
                .map(fiveendtime).toPropertyWhenPresent("fiveendtime", record::getFiveendtime)
                .map(openmodel5).toPropertyWhenPresent("openmodel5", record::getOpenmodel5)
                .map(status5).toPropertyWhenPresent("status5", record::getStatus5)
                .map(sixbegintime).toPropertyWhenPresent("sixbegintime", record::getSixbegintime)
                .map(sixendtime).toPropertyWhenPresent("sixendtime", record::getSixendtime)
                .map(openmodel6).toPropertyWhenPresent("openmodel6", record::getOpenmodel6)
                .map(status6).toPropertyWhenPresent("status6", record::getStatus6)
                .map(sevenbegintime).toPropertyWhenPresent("sevenbegintime", record::getSevenbegintime)
                .map(sevenendtime).toPropertyWhenPresent("sevenendtime", record::getSevenendtime)
                .map(openmodel7).toPropertyWhenPresent("openmodel7", record::getOpenmodel7)
                .map(status7).toPropertyWhenPresent("status7", record::getStatus7)
                .map(eightbegintime).toPropertyWhenPresent("eightbegintime", record::getEightbegintime)
                .map(eightendtime).toPropertyWhenPresent("eightendtime", record::getEightendtime)
                .map(openmodel8).toPropertyWhenPresent("openmodel8", record::getOpenmodel8)
                .map(status8).toPropertyWhenPresent("status8", record::getStatus8)
                .map(timcount).toPropertyWhenPresent("timcount", record::getTimcount)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.795+08:00", comments="Source Table: M_TimeGroup")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<MTimegroup>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, groupid, groupname, week, firstbegintime, firstendtime, openmodel1, status1, secondbegintime, secondendtime, openmodel2, status2, thirdbegintime, thirdendtime, openmodel3, status3, fourbegintime, fourendtime, openmodel4, status4, fivebegintime, fiveendtime, openmodel5, status5, sixbegintime, sixendtime, openmodel6, status6, sevenbegintime, sevenendtime, openmodel7, status7, eightbegintime, eightendtime, openmodel8, status8, timcount)
                .from(MTimegroup);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.795+08:00", comments="Source Table: M_TimeGroup")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<MTimegroup>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, groupid, groupname, week, firstbegintime, firstendtime, openmodel1, status1, secondbegintime, secondendtime, openmodel2, status2, thirdbegintime, thirdendtime, openmodel3, status3, fourbegintime, fourendtime, openmodel4, status4, fivebegintime, fiveendtime, openmodel5, status5, sixbegintime, sixendtime, openmodel6, status6, sevenbegintime, sevenendtime, openmodel7, status7, eightbegintime, eightendtime, openmodel8, status8, timcount)
                .from(MTimegroup);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.795+08:00", comments="Source Table: M_TimeGroup")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(MTimegroup record) {
        return UpdateDSL.updateWithMapper(this::update, MTimegroup)
                .set(groupid).equalTo(record::getGroupid)
                .set(groupname).equalTo(record::getGroupname)
                .set(week).equalTo(record::getWeek)
                .set(firstbegintime).equalTo(record::getFirstbegintime)
                .set(firstendtime).equalTo(record::getFirstendtime)
                .set(openmodel1).equalTo(record::getOpenmodel1)
                .set(status1).equalTo(record::getStatus1)
                .set(secondbegintime).equalTo(record::getSecondbegintime)
                .set(secondendtime).equalTo(record::getSecondendtime)
                .set(openmodel2).equalTo(record::getOpenmodel2)
                .set(status2).equalTo(record::getStatus2)
                .set(thirdbegintime).equalTo(record::getThirdbegintime)
                .set(thirdendtime).equalTo(record::getThirdendtime)
                .set(openmodel3).equalTo(record::getOpenmodel3)
                .set(status3).equalTo(record::getStatus3)
                .set(fourbegintime).equalTo(record::getFourbegintime)
                .set(fourendtime).equalTo(record::getFourendtime)
                .set(openmodel4).equalTo(record::getOpenmodel4)
                .set(status4).equalTo(record::getStatus4)
                .set(fivebegintime).equalTo(record::getFivebegintime)
                .set(fiveendtime).equalTo(record::getFiveendtime)
                .set(openmodel5).equalTo(record::getOpenmodel5)
                .set(status5).equalTo(record::getStatus5)
                .set(sixbegintime).equalTo(record::getSixbegintime)
                .set(sixendtime).equalTo(record::getSixendtime)
                .set(openmodel6).equalTo(record::getOpenmodel6)
                .set(status6).equalTo(record::getStatus6)
                .set(sevenbegintime).equalTo(record::getSevenbegintime)
                .set(sevenendtime).equalTo(record::getSevenendtime)
                .set(openmodel7).equalTo(record::getOpenmodel7)
                .set(status7).equalTo(record::getStatus7)
                .set(eightbegintime).equalTo(record::getEightbegintime)
                .set(eightendtime).equalTo(record::getEightendtime)
                .set(openmodel8).equalTo(record::getOpenmodel8)
                .set(status8).equalTo(record::getStatus8)
                .set(timcount).equalTo(record::getTimcount);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.795+08:00", comments="Source Table: M_TimeGroup")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(MTimegroup record) {
        return UpdateDSL.updateWithMapper(this::update, MTimegroup)
                .set(groupid).equalToWhenPresent(record::getGroupid)
                .set(groupname).equalToWhenPresent(record::getGroupname)
                .set(week).equalToWhenPresent(record::getWeek)
                .set(firstbegintime).equalToWhenPresent(record::getFirstbegintime)
                .set(firstendtime).equalToWhenPresent(record::getFirstendtime)
                .set(openmodel1).equalToWhenPresent(record::getOpenmodel1)
                .set(status1).equalToWhenPresent(record::getStatus1)
                .set(secondbegintime).equalToWhenPresent(record::getSecondbegintime)
                .set(secondendtime).equalToWhenPresent(record::getSecondendtime)
                .set(openmodel2).equalToWhenPresent(record::getOpenmodel2)
                .set(status2).equalToWhenPresent(record::getStatus2)
                .set(thirdbegintime).equalToWhenPresent(record::getThirdbegintime)
                .set(thirdendtime).equalToWhenPresent(record::getThirdendtime)
                .set(openmodel3).equalToWhenPresent(record::getOpenmodel3)
                .set(status3).equalToWhenPresent(record::getStatus3)
                .set(fourbegintime).equalToWhenPresent(record::getFourbegintime)
                .set(fourendtime).equalToWhenPresent(record::getFourendtime)
                .set(openmodel4).equalToWhenPresent(record::getOpenmodel4)
                .set(status4).equalToWhenPresent(record::getStatus4)
                .set(fivebegintime).equalToWhenPresent(record::getFivebegintime)
                .set(fiveendtime).equalToWhenPresent(record::getFiveendtime)
                .set(openmodel5).equalToWhenPresent(record::getOpenmodel5)
                .set(status5).equalToWhenPresent(record::getStatus5)
                .set(sixbegintime).equalToWhenPresent(record::getSixbegintime)
                .set(sixendtime).equalToWhenPresent(record::getSixendtime)
                .set(openmodel6).equalToWhenPresent(record::getOpenmodel6)
                .set(status6).equalToWhenPresent(record::getStatus6)
                .set(sevenbegintime).equalToWhenPresent(record::getSevenbegintime)
                .set(sevenendtime).equalToWhenPresent(record::getSevenendtime)
                .set(openmodel7).equalToWhenPresent(record::getOpenmodel7)
                .set(status7).equalToWhenPresent(record::getStatus7)
                .set(eightbegintime).equalToWhenPresent(record::getEightbegintime)
                .set(eightendtime).equalToWhenPresent(record::getEightendtime)
                .set(openmodel8).equalToWhenPresent(record::getOpenmodel8)
                .set(status8).equalToWhenPresent(record::getStatus8)
                .set(timcount).equalToWhenPresent(record::getTimcount);
    }
}