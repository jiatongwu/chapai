package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MJurisdteamDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.MJurisdteam;
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
public interface MJurisdteamDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.839+08:00", comments="Source Table: M_JurisdTeam")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.839+08:00", comments="Source Table: M_JurisdTeam")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.839+08:00", comments="Source Table: M_JurisdTeam")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<MJurisdteam> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.839+08:00", comments="Source Table: M_JurisdTeam")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MJurisdteamResult")
    MJurisdteam selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.839+08:00", comments="Source Table: M_JurisdTeam")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MJurisdteamResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="JurName", property="jurname", jdbcType=JdbcType.VARCHAR),
        @Result(column="CardType", property="cardtype", jdbcType=JdbcType.VARCHAR),
        @Result(column="TempNumber", property="tempnumber", jdbcType=JdbcType.INTEGER),
        @Result(column="TeamName", property="teamname", jdbcType=JdbcType.VARCHAR),
        @Result(column="MJBeginDate", property="mjbegindate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MJEndDate", property="mjenddate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="mark", property="mark", jdbcType=JdbcType.VARCHAR),
        @Result(column="UserInfo", property="userinfo", jdbcType=JdbcType.VARCHAR),
        @Result(column="HolidayLimited", property="holidaylimited", jdbcType=JdbcType.VARCHAR),
        @Result(column="MjEnabSysHoliday", property="mjenabsysholiday", jdbcType=JdbcType.VARCHAR),
        @Result(column="MJValidMachine", property="mjvalidmachine", jdbcType=JdbcType.VARCHAR)
    })
    List<MJurisdteam> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.839+08:00", comments="Source Table: M_JurisdTeam")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.839+08:00", comments="Source Table: M_JurisdTeam")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(MJurisdteam);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.839+08:00", comments="Source Table: M_JurisdTeam")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, MJurisdteam);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.839+08:00", comments="Source Table: M_JurisdTeam")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, MJurisdteam)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.839+08:00", comments="Source Table: M_JurisdTeam")
    default int insert(MJurisdteam record) {
        return insert(SqlBuilder.insert(record)
                .into(MJurisdteam)
                .map(jurname).toProperty("jurname")
                .map(cardtype).toProperty("cardtype")
                .map(tempnumber).toProperty("tempnumber")
                .map(teamname).toProperty("teamname")
                .map(mjbegindate).toProperty("mjbegindate")
                .map(mjenddate).toProperty("mjenddate")
                .map(mark).toProperty("mark")
                .map(userinfo).toProperty("userinfo")
                .map(holidaylimited).toProperty("holidaylimited")
                .map(mjenabsysholiday).toProperty("mjenabsysholiday")
                .map(mjvalidmachine).toProperty("mjvalidmachine")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.840+08:00", comments="Source Table: M_JurisdTeam")
    default int insertSelective(MJurisdteam record) {
        return insert(SqlBuilder.insert(record)
                .into(MJurisdteam)
                .map(jurname).toPropertyWhenPresent("jurname", record::getJurname)
                .map(cardtype).toPropertyWhenPresent("cardtype", record::getCardtype)
                .map(tempnumber).toPropertyWhenPresent("tempnumber", record::getTempnumber)
                .map(teamname).toPropertyWhenPresent("teamname", record::getTeamname)
                .map(mjbegindate).toPropertyWhenPresent("mjbegindate", record::getMjbegindate)
                .map(mjenddate).toPropertyWhenPresent("mjenddate", record::getMjenddate)
                .map(mark).toPropertyWhenPresent("mark", record::getMark)
                .map(userinfo).toPropertyWhenPresent("userinfo", record::getUserinfo)
                .map(holidaylimited).toPropertyWhenPresent("holidaylimited", record::getHolidaylimited)
                .map(mjenabsysholiday).toPropertyWhenPresent("mjenabsysholiday", record::getMjenabsysholiday)
                .map(mjvalidmachine).toPropertyWhenPresent("mjvalidmachine", record::getMjvalidmachine)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.840+08:00", comments="Source Table: M_JurisdTeam")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<MJurisdteam>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, jurname, cardtype, tempnumber, teamname, mjbegindate, mjenddate, mark, userinfo, holidaylimited, mjenabsysholiday, mjvalidmachine)
                .from(MJurisdteam);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.840+08:00", comments="Source Table: M_JurisdTeam")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<MJurisdteam>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, jurname, cardtype, tempnumber, teamname, mjbegindate, mjenddate, mark, userinfo, holidaylimited, mjenabsysholiday, mjvalidmachine)
                .from(MJurisdteam);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.840+08:00", comments="Source Table: M_JurisdTeam")
    default MJurisdteam selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, jurname, cardtype, tempnumber, teamname, mjbegindate, mjenddate, mark, userinfo, holidaylimited, mjenabsysholiday, mjvalidmachine)
                .from(MJurisdteam)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.840+08:00", comments="Source Table: M_JurisdTeam")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(MJurisdteam record) {
        return UpdateDSL.updateWithMapper(this::update, MJurisdteam)
                .set(jurname).equalTo(record::getJurname)
                .set(cardtype).equalTo(record::getCardtype)
                .set(tempnumber).equalTo(record::getTempnumber)
                .set(teamname).equalTo(record::getTeamname)
                .set(mjbegindate).equalTo(record::getMjbegindate)
                .set(mjenddate).equalTo(record::getMjenddate)
                .set(mark).equalTo(record::getMark)
                .set(userinfo).equalTo(record::getUserinfo)
                .set(holidaylimited).equalTo(record::getHolidaylimited)
                .set(mjenabsysholiday).equalTo(record::getMjenabsysholiday)
                .set(mjvalidmachine).equalTo(record::getMjvalidmachine);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.840+08:00", comments="Source Table: M_JurisdTeam")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(MJurisdteam record) {
        return UpdateDSL.updateWithMapper(this::update, MJurisdteam)
                .set(jurname).equalToWhenPresent(record::getJurname)
                .set(cardtype).equalToWhenPresent(record::getCardtype)
                .set(tempnumber).equalToWhenPresent(record::getTempnumber)
                .set(teamname).equalToWhenPresent(record::getTeamname)
                .set(mjbegindate).equalToWhenPresent(record::getMjbegindate)
                .set(mjenddate).equalToWhenPresent(record::getMjenddate)
                .set(mark).equalToWhenPresent(record::getMark)
                .set(userinfo).equalToWhenPresent(record::getUserinfo)
                .set(holidaylimited).equalToWhenPresent(record::getHolidaylimited)
                .set(mjenabsysholiday).equalToWhenPresent(record::getMjenabsysholiday)
                .set(mjvalidmachine).equalToWhenPresent(record::getMjvalidmachine);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.840+08:00", comments="Source Table: M_JurisdTeam")
    default int updateByPrimaryKey(MJurisdteam record) {
        return UpdateDSL.updateWithMapper(this::update, MJurisdteam)
                .set(jurname).equalTo(record::getJurname)
                .set(cardtype).equalTo(record::getCardtype)
                .set(tempnumber).equalTo(record::getTempnumber)
                .set(teamname).equalTo(record::getTeamname)
                .set(mjbegindate).equalTo(record::getMjbegindate)
                .set(mjenddate).equalTo(record::getMjenddate)
                .set(mark).equalTo(record::getMark)
                .set(userinfo).equalTo(record::getUserinfo)
                .set(holidaylimited).equalTo(record::getHolidaylimited)
                .set(mjenabsysholiday).equalTo(record::getMjenabsysholiday)
                .set(mjvalidmachine).equalTo(record::getMjvalidmachine)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.840+08:00", comments="Source Table: M_JurisdTeam")
    default int updateByPrimaryKeySelective(MJurisdteam record) {
        return UpdateDSL.updateWithMapper(this::update, MJurisdteam)
                .set(jurname).equalToWhenPresent(record::getJurname)
                .set(cardtype).equalToWhenPresent(record::getCardtype)
                .set(tempnumber).equalToWhenPresent(record::getTempnumber)
                .set(teamname).equalToWhenPresent(record::getTeamname)
                .set(mjbegindate).equalToWhenPresent(record::getMjbegindate)
                .set(mjenddate).equalToWhenPresent(record::getMjenddate)
                .set(mark).equalToWhenPresent(record::getMark)
                .set(userinfo).equalToWhenPresent(record::getUserinfo)
                .set(holidaylimited).equalToWhenPresent(record::getHolidaylimited)
                .set(mjenabsysholiday).equalToWhenPresent(record::getMjenabsysholiday)
                .set(mjvalidmachine).equalToWhenPresent(record::getMjvalidmachine)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}