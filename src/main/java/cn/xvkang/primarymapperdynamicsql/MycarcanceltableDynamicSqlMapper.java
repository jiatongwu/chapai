package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MycarcanceltableDynamicSqlSupport.*;

import cn.xvkang.primaryentity.Mycarcanceltable;
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
public interface MycarcanceltableDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.546+08:00", comments="Source Table: MYCarCancelTable")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.546+08:00", comments="Source Table: MYCarCancelTable")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.546+08:00", comments="Source Table: MYCarCancelTable")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Mycarcanceltable> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.546+08:00", comments="Source Table: MYCarCancelTable")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MycarcanceltableResult", value = {
        @Result(column="UserNO", property="userno", jdbcType=JdbcType.VARCHAR),
        @Result(column="CardNO", property="cardno", jdbcType=JdbcType.VARCHAR),
        @Result(column="UserName", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="Sex", property="sex", jdbcType=JdbcType.VARCHAR),
        @Result(column="HomeAddress", property="homeaddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="DeptName", property="deptname", jdbcType=JdbcType.VARCHAR),
        @Result(column="TelNumber", property="telnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="MobNumber", property="mobnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="IssueUserCard", property="issueusercard", jdbcType=JdbcType.VARCHAR),
        @Result(column="CPH", property="cph", jdbcType=JdbcType.VARCHAR),
        @Result(column="CarCardType", property="carcardtype", jdbcType=JdbcType.VARCHAR),
        @Result(column="CarIssueDate", property="carissuedate", jdbcType=JdbcType.VARCHAR),
        @Result(column="Balance", property="balance", jdbcType=JdbcType.DECIMAL),
        @Result(column="CarValidStartDate", property="carvalidstartdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CarValidEndDate", property="carvalidenddate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CancelCardNO", property="cancelcardno", jdbcType=JdbcType.VARCHAR),
        @Result(column="CancelTime", property="canceltime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CancelUserName", property="cancelusername", jdbcType=JdbcType.VARCHAR)
    })
    List<Mycarcanceltable> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.546+08:00", comments="Source Table: MYCarCancelTable")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.546+08:00", comments="Source Table: MYCarCancelTable")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(mycarcanceltable);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.547+08:00", comments="Source Table: MYCarCancelTable")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, mycarcanceltable);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.547+08:00", comments="Source Table: MYCarCancelTable")
    default int insert(Mycarcanceltable record) {
        return insert(SqlBuilder.insert(record)
                .into(mycarcanceltable)
                .map(userno).toProperty("userno")
                .map(cardno).toProperty("cardno")
                .map(username).toProperty("username")
                .map(sex).toProperty("sex")
                .map(homeaddress).toProperty("homeaddress")
                .map(deptname).toProperty("deptname")
                .map(telnumber).toProperty("telnumber")
                .map(mobnumber).toProperty("mobnumber")
                .map(issueusercard).toProperty("issueusercard")
                .map(cph).toProperty("cph")
                .map(carcardtype).toProperty("carcardtype")
                .map(carissuedate).toProperty("carissuedate")
                .map(balance).toProperty("balance")
                .map(carvalidstartdate).toProperty("carvalidstartdate")
                .map(carvalidenddate).toProperty("carvalidenddate")
                .map(cancelcardno).toProperty("cancelcardno")
                .map(canceltime).toProperty("canceltime")
                .map(cancelusername).toProperty("cancelusername")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.547+08:00", comments="Source Table: MYCarCancelTable")
    default int insertSelective(Mycarcanceltable record) {
        return insert(SqlBuilder.insert(record)
                .into(mycarcanceltable)
                .map(userno).toPropertyWhenPresent("userno", record::getUserno)
                .map(cardno).toPropertyWhenPresent("cardno", record::getCardno)
                .map(username).toPropertyWhenPresent("username", record::getUsername)
                .map(sex).toPropertyWhenPresent("sex", record::getSex)
                .map(homeaddress).toPropertyWhenPresent("homeaddress", record::getHomeaddress)
                .map(deptname).toPropertyWhenPresent("deptname", record::getDeptname)
                .map(telnumber).toPropertyWhenPresent("telnumber", record::getTelnumber)
                .map(mobnumber).toPropertyWhenPresent("mobnumber", record::getMobnumber)
                .map(issueusercard).toPropertyWhenPresent("issueusercard", record::getIssueusercard)
                .map(cph).toPropertyWhenPresent("cph", record::getCph)
                .map(carcardtype).toPropertyWhenPresent("carcardtype", record::getCarcardtype)
                .map(carissuedate).toPropertyWhenPresent("carissuedate", record::getCarissuedate)
                .map(balance).toPropertyWhenPresent("balance", record::getBalance)
                .map(carvalidstartdate).toPropertyWhenPresent("carvalidstartdate", record::getCarvalidstartdate)
                .map(carvalidenddate).toPropertyWhenPresent("carvalidenddate", record::getCarvalidenddate)
                .map(cancelcardno).toPropertyWhenPresent("cancelcardno", record::getCancelcardno)
                .map(canceltime).toPropertyWhenPresent("canceltime", record::getCanceltime)
                .map(cancelusername).toPropertyWhenPresent("cancelusername", record::getCancelusername)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.547+08:00", comments="Source Table: MYCarCancelTable")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Mycarcanceltable>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, userno, cardno, username, sex, homeaddress, deptname, telnumber, mobnumber, issueusercard, cph, carcardtype, carissuedate, balance, carvalidstartdate, carvalidenddate, cancelcardno, canceltime, cancelusername)
                .from(mycarcanceltable);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.547+08:00", comments="Source Table: MYCarCancelTable")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Mycarcanceltable>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, userno, cardno, username, sex, homeaddress, deptname, telnumber, mobnumber, issueusercard, cph, carcardtype, carissuedate, balance, carvalidstartdate, carvalidenddate, cancelcardno, canceltime, cancelusername)
                .from(mycarcanceltable);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.547+08:00", comments="Source Table: MYCarCancelTable")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Mycarcanceltable record) {
        return UpdateDSL.updateWithMapper(this::update, mycarcanceltable)
                .set(userno).equalTo(record::getUserno)
                .set(cardno).equalTo(record::getCardno)
                .set(username).equalTo(record::getUsername)
                .set(sex).equalTo(record::getSex)
                .set(homeaddress).equalTo(record::getHomeaddress)
                .set(deptname).equalTo(record::getDeptname)
                .set(telnumber).equalTo(record::getTelnumber)
                .set(mobnumber).equalTo(record::getMobnumber)
                .set(issueusercard).equalTo(record::getIssueusercard)
                .set(cph).equalTo(record::getCph)
                .set(carcardtype).equalTo(record::getCarcardtype)
                .set(carissuedate).equalTo(record::getCarissuedate)
                .set(balance).equalTo(record::getBalance)
                .set(carvalidstartdate).equalTo(record::getCarvalidstartdate)
                .set(carvalidenddate).equalTo(record::getCarvalidenddate)
                .set(cancelcardno).equalTo(record::getCancelcardno)
                .set(canceltime).equalTo(record::getCanceltime)
                .set(cancelusername).equalTo(record::getCancelusername);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.547+08:00", comments="Source Table: MYCarCancelTable")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Mycarcanceltable record) {
        return UpdateDSL.updateWithMapper(this::update, mycarcanceltable)
                .set(userno).equalToWhenPresent(record::getUserno)
                .set(cardno).equalToWhenPresent(record::getCardno)
                .set(username).equalToWhenPresent(record::getUsername)
                .set(sex).equalToWhenPresent(record::getSex)
                .set(homeaddress).equalToWhenPresent(record::getHomeaddress)
                .set(deptname).equalToWhenPresent(record::getDeptname)
                .set(telnumber).equalToWhenPresent(record::getTelnumber)
                .set(mobnumber).equalToWhenPresent(record::getMobnumber)
                .set(issueusercard).equalToWhenPresent(record::getIssueusercard)
                .set(cph).equalToWhenPresent(record::getCph)
                .set(carcardtype).equalToWhenPresent(record::getCarcardtype)
                .set(carissuedate).equalToWhenPresent(record::getCarissuedate)
                .set(balance).equalToWhenPresent(record::getBalance)
                .set(carvalidstartdate).equalToWhenPresent(record::getCarvalidstartdate)
                .set(carvalidenddate).equalToWhenPresent(record::getCarvalidenddate)
                .set(cancelcardno).equalToWhenPresent(record::getCancelcardno)
                .set(canceltime).equalToWhenPresent(record::getCanceltime)
                .set(cancelusername).equalToWhenPresent(record::getCancelusername);
    }
}