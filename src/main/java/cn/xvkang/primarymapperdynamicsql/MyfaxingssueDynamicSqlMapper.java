package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MyfaxingssueDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.Myfaxingssue;
import java.util.List;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
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
public interface MyfaxingssueDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.022+08:00", comments="Source Table: MYFAXINGSSUE")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.022+08:00", comments="Source Table: MYFAXINGSSUE")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.022+08:00", comments="Source Table: MYFAXINGSSUE")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @Options(useGeneratedKeys=true,keyProperty="record.id")
    int insert(InsertStatementProvider<Myfaxingssue> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.023+08:00", comments="Source Table: MYFAXINGSSUE")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MyfaxingssueResult")
    Myfaxingssue selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.023+08:00", comments="Source Table: MYFAXINGSSUE")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MyfaxingssueResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CardNO", property="cardno", jdbcType=JdbcType.VARCHAR),
        @Result(column="UserNO", property="userno", jdbcType=JdbcType.VARCHAR),
        @Result(column="CardState", property="cardstate", jdbcType=JdbcType.CHAR),
        @Result(column="CardYJ", property="cardyj", jdbcType=JdbcType.DECIMAL),
        @Result(column="SubSystem", property="subsystem", jdbcType=JdbcType.VARCHAR),
        @Result(column="CarCardType", property="carcardtype", jdbcType=JdbcType.VARCHAR),
        @Result(column="CarIssueDate", property="carissuedate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CarIssueUserCard", property="carissueusercard", jdbcType=JdbcType.VARCHAR),
        @Result(column="Balance", property="balance", jdbcType=JdbcType.DECIMAL),
        @Result(column="CarValidStartDate", property="carvalidstartdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CarValidEndDate", property="carvalidenddate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CPH", property="cph", jdbcType=JdbcType.VARCHAR),
        @Result(column="CarColor", property="carcolor", jdbcType=JdbcType.VARCHAR),
        @Result(column="CarType", property="cartype", jdbcType=JdbcType.VARCHAR),
        @Result(column="CarPlace", property="carplace", jdbcType=JdbcType.VARCHAR),
        @Result(column="CarWithdrawCardDate", property="carwithdrawcarddate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CarWithdrawOptCard", property="carwithdrawoptcard", jdbcType=JdbcType.VARCHAR),
        @Result(column="CarValidMachine", property="carvalidmachine", jdbcType=JdbcType.VARCHAR),
        @Result(column="CarValidZone", property="carvalidzone", jdbcType=JdbcType.VARCHAR),
        @Result(column="CarMemo", property="carmemo", jdbcType=JdbcType.VARCHAR),
        @Result(column="MJCardType", property="mjcardtype", jdbcType=JdbcType.VARCHAR),
        @Result(column="MJIssueDate", property="mjissuedate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MJIssueUserCard", property="mjissueusercard", jdbcType=JdbcType.VARCHAR),
        @Result(column="MJEndDate", property="mjenddate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MJValidStartTime", property="mjvalidstarttime", jdbcType=JdbcType.CHAR),
        @Result(column="MJValidEndTime", property="mjvalidendtime", jdbcType=JdbcType.CHAR),
        @Result(column="MJValidMachine", property="mjvalidmachine", jdbcType=JdbcType.VARCHAR),
        @Result(column="MJWithdrawCardDate", property="mjwithdrawcarddate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MJWithdrawOptCard", property="mjwithdrawoptcard", jdbcType=JdbcType.VARCHAR),
        @Result(column="MJMemo", property="mjmemo", jdbcType=JdbcType.VARCHAR),
        @Result(column="IssueDate", property="issuedate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="WithdrawDate", property="withdrawdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="IssueUserCard", property="issueusercard", jdbcType=JdbcType.VARCHAR),
        @Result(column="WithdrawUserCard", property="withdrawusercard", jdbcType=JdbcType.VARCHAR),
        @Result(column="LossregDate", property="lossregdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LossregUserCard", property="lossregusercard", jdbcType=JdbcType.VARCHAR),
        @Result(column="CardIDNO", property="cardidno", jdbcType=JdbcType.VARCHAR),
        @Result(column="DownloadSignal", property="downloadsignal", jdbcType=JdbcType.VARCHAR),
        @Result(column="CarPic", property="carpic", jdbcType=JdbcType.VARCHAR),
        @Result(column="Tempnumber", property="tempnumber", jdbcType=JdbcType.INTEGER),
        @Result(column="TimeTeam", property="timeteam", jdbcType=JdbcType.VARCHAR),
        @Result(column="HolidayLimited", property="holidaylimited", jdbcType=JdbcType.VARCHAR),
        @Result(column="UserInfo", property="userinfo", jdbcType=JdbcType.VARCHAR),
        @Result(column="BackCardNum", property="backcardnum", jdbcType=JdbcType.VARCHAR),
        @Result(column="CardIdLossState", property="cardidlossstate", jdbcType=JdbcType.CHAR),
        @Result(column="CardIdUnLossState", property="cardidunlossstate", jdbcType=JdbcType.VARCHAR),
        @Result(column="UnLossDate", property="unlossdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UnLossUer", property="unlossuer", jdbcType=JdbcType.VARCHAR),
        @Result(column="MJBeginDate", property="mjbegindate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CarFailID", property="carfailid", jdbcType=JdbcType.VARCHAR),
        @Result(column="CaRFailOKNO", property="carfailokno", jdbcType=JdbcType.CHAR),
        @Result(column="DownLoadState", property="downloadstate", jdbcType=JdbcType.CHAR),
        @Result(column="CardLossMachine", property="cardlossmachine", jdbcType=JdbcType.VARCHAR),
        @Result(column="MjPassword", property="mjpassword", jdbcType=JdbcType.VARCHAR),
        @Result(column="MjEnabSysHoliday", property="mjenabsysholiday", jdbcType=JdbcType.VARCHAR),
        @Result(column="MJJureTeam", property="mjjureteam", jdbcType=JdbcType.VARCHAR),
        @Result(column="MJTCard", property="mjtcard", jdbcType=JdbcType.BIT),
        @Result(column="MonthType", property="monthtype", jdbcType=JdbcType.INTEGER),
        @Result(column="CPHDownloadSignal", property="cphdownloadsignal", jdbcType=JdbcType.VARCHAR),
        @Result(column="Res1", property="res1", jdbcType=JdbcType.VARCHAR),
        @Result(column="Res2", property="res2", jdbcType=JdbcType.VARCHAR),
        @Result(column="CarPhoto", property="carphoto", jdbcType=JdbcType.BLOB)
    })
    List<Myfaxingssue> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.023+08:00", comments="Source Table: MYFAXINGSSUE")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.023+08:00", comments="Source Table: MYFAXINGSSUE")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(myfaxingssue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.023+08:00", comments="Source Table: MYFAXINGSSUE")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, myfaxingssue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.023+08:00", comments="Source Table: MYFAXINGSSUE")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, myfaxingssue)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.023+08:00", comments="Source Table: MYFAXINGSSUE")
    default int insert(Myfaxingssue record) {
        return insert(SqlBuilder.insert(record)
                .into(myfaxingssue)
                .map(cardno).toProperty("cardno")
                .map(userno).toProperty("userno")
                .map(cardstate).toProperty("cardstate")
                .map(cardyj).toProperty("cardyj")
                .map(subsystem).toProperty("subsystem")
                .map(carcardtype).toProperty("carcardtype")
                .map(carissuedate).toProperty("carissuedate")
                .map(carissueusercard).toProperty("carissueusercard")
                .map(balance).toProperty("balance")
                .map(carvalidstartdate).toProperty("carvalidstartdate")
                .map(carvalidenddate).toProperty("carvalidenddate")
                .map(cph).toProperty("cph")
                .map(carcolor).toProperty("carcolor")
                .map(cartype).toProperty("cartype")
                .map(carplace).toProperty("carplace")
                .map(carwithdrawcarddate).toProperty("carwithdrawcarddate")
                .map(carwithdrawoptcard).toProperty("carwithdrawoptcard")
                .map(carvalidmachine).toProperty("carvalidmachine")
                .map(carvalidzone).toProperty("carvalidzone")
                .map(carmemo).toProperty("carmemo")
                .map(mjcardtype).toProperty("mjcardtype")
                .map(mjissuedate).toProperty("mjissuedate")
                .map(mjissueusercard).toProperty("mjissueusercard")
                .map(mjenddate).toProperty("mjenddate")
                .map(mjvalidstarttime).toProperty("mjvalidstarttime")
                .map(mjvalidendtime).toProperty("mjvalidendtime")
                .map(mjvalidmachine).toProperty("mjvalidmachine")
                .map(mjwithdrawcarddate).toProperty("mjwithdrawcarddate")
                .map(mjwithdrawoptcard).toProperty("mjwithdrawoptcard")
                .map(mjmemo).toProperty("mjmemo")
                .map(issuedate).toProperty("issuedate")
                .map(withdrawdate).toProperty("withdrawdate")
                .map(issueusercard).toProperty("issueusercard")
                .map(withdrawusercard).toProperty("withdrawusercard")
                .map(lossregdate).toProperty("lossregdate")
                .map(lossregusercard).toProperty("lossregusercard")
                .map(cardidno).toProperty("cardidno")
                .map(downloadsignal).toProperty("downloadsignal")
                .map(carpic).toProperty("carpic")
                .map(tempnumber).toProperty("tempnumber")
                .map(timeteam).toProperty("timeteam")
                .map(holidaylimited).toProperty("holidaylimited")
                .map(userinfo).toProperty("userinfo")
                .map(backcardnum).toProperty("backcardnum")
                .map(cardidlossstate).toProperty("cardidlossstate")
                .map(cardidunlossstate).toProperty("cardidunlossstate")
                .map(unlossdate).toProperty("unlossdate")
                .map(unlossuer).toProperty("unlossuer")
                .map(mjbegindate).toProperty("mjbegindate")
                .map(carfailid).toProperty("carfailid")
                .map(carfailokno).toProperty("carfailokno")
                .map(downloadstate).toProperty("downloadstate")
                .map(cardlossmachine).toProperty("cardlossmachine")
                .map(mjpassword).toProperty("mjpassword")
                .map(mjenabsysholiday).toProperty("mjenabsysholiday")
                .map(mjjureteam).toProperty("mjjureteam")
                .map(mjtcard).toProperty("mjtcard")
                .map(monthtype).toProperty("monthtype")
                .map(cphdownloadsignal).toProperty("cphdownloadsignal")
                .map(res1).toProperty("res1")
                .map(res2).toProperty("res2")
                .map(carphoto).toProperty("carphoto")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.023+08:00", comments="Source Table: MYFAXINGSSUE")
    default int insertSelective(Myfaxingssue record) {
        return insert(SqlBuilder.insert(record)
                .into(myfaxingssue)
                .map(cardno).toPropertyWhenPresent("cardno", record::getCardno)
                .map(userno).toPropertyWhenPresent("userno", record::getUserno)
                .map(cardstate).toPropertyWhenPresent("cardstate", record::getCardstate)
                .map(cardyj).toPropertyWhenPresent("cardyj", record::getCardyj)
                .map(subsystem).toPropertyWhenPresent("subsystem", record::getSubsystem)
                .map(carcardtype).toPropertyWhenPresent("carcardtype", record::getCarcardtype)
                .map(carissuedate).toPropertyWhenPresent("carissuedate", record::getCarissuedate)
                .map(carissueusercard).toPropertyWhenPresent("carissueusercard", record::getCarissueusercard)
                .map(balance).toPropertyWhenPresent("balance", record::getBalance)
                .map(carvalidstartdate).toPropertyWhenPresent("carvalidstartdate", record::getCarvalidstartdate)
                .map(carvalidenddate).toPropertyWhenPresent("carvalidenddate", record::getCarvalidenddate)
                .map(cph).toPropertyWhenPresent("cph", record::getCph)
                .map(carcolor).toPropertyWhenPresent("carcolor", record::getCarcolor)
                .map(cartype).toPropertyWhenPresent("cartype", record::getCartype)
                .map(carplace).toPropertyWhenPresent("carplace", record::getCarplace)
                .map(carwithdrawcarddate).toPropertyWhenPresent("carwithdrawcarddate", record::getCarwithdrawcarddate)
                .map(carwithdrawoptcard).toPropertyWhenPresent("carwithdrawoptcard", record::getCarwithdrawoptcard)
                .map(carvalidmachine).toPropertyWhenPresent("carvalidmachine", record::getCarvalidmachine)
                .map(carvalidzone).toPropertyWhenPresent("carvalidzone", record::getCarvalidzone)
                .map(carmemo).toPropertyWhenPresent("carmemo", record::getCarmemo)
                .map(mjcardtype).toPropertyWhenPresent("mjcardtype", record::getMjcardtype)
                .map(mjissuedate).toPropertyWhenPresent("mjissuedate", record::getMjissuedate)
                .map(mjissueusercard).toPropertyWhenPresent("mjissueusercard", record::getMjissueusercard)
                .map(mjenddate).toPropertyWhenPresent("mjenddate", record::getMjenddate)
                .map(mjvalidstarttime).toPropertyWhenPresent("mjvalidstarttime", record::getMjvalidstarttime)
                .map(mjvalidendtime).toPropertyWhenPresent("mjvalidendtime", record::getMjvalidendtime)
                .map(mjvalidmachine).toPropertyWhenPresent("mjvalidmachine", record::getMjvalidmachine)
                .map(mjwithdrawcarddate).toPropertyWhenPresent("mjwithdrawcarddate", record::getMjwithdrawcarddate)
                .map(mjwithdrawoptcard).toPropertyWhenPresent("mjwithdrawoptcard", record::getMjwithdrawoptcard)
                .map(mjmemo).toPropertyWhenPresent("mjmemo", record::getMjmemo)
                .map(issuedate).toPropertyWhenPresent("issuedate", record::getIssuedate)
                .map(withdrawdate).toPropertyWhenPresent("withdrawdate", record::getWithdrawdate)
                .map(issueusercard).toPropertyWhenPresent("issueusercard", record::getIssueusercard)
                .map(withdrawusercard).toPropertyWhenPresent("withdrawusercard", record::getWithdrawusercard)
                .map(lossregdate).toPropertyWhenPresent("lossregdate", record::getLossregdate)
                .map(lossregusercard).toPropertyWhenPresent("lossregusercard", record::getLossregusercard)
                .map(cardidno).toPropertyWhenPresent("cardidno", record::getCardidno)
                .map(downloadsignal).toPropertyWhenPresent("downloadsignal", record::getDownloadsignal)
                .map(carpic).toPropertyWhenPresent("carpic", record::getCarpic)
                .map(tempnumber).toPropertyWhenPresent("tempnumber", record::getTempnumber)
                .map(timeteam).toPropertyWhenPresent("timeteam", record::getTimeteam)
                .map(holidaylimited).toPropertyWhenPresent("holidaylimited", record::getHolidaylimited)
                .map(userinfo).toPropertyWhenPresent("userinfo", record::getUserinfo)
                .map(backcardnum).toPropertyWhenPresent("backcardnum", record::getBackcardnum)
                .map(cardidlossstate).toPropertyWhenPresent("cardidlossstate", record::getCardidlossstate)
                .map(cardidunlossstate).toPropertyWhenPresent("cardidunlossstate", record::getCardidunlossstate)
                .map(unlossdate).toPropertyWhenPresent("unlossdate", record::getUnlossdate)
                .map(unlossuer).toPropertyWhenPresent("unlossuer", record::getUnlossuer)
                .map(mjbegindate).toPropertyWhenPresent("mjbegindate", record::getMjbegindate)
                .map(carfailid).toPropertyWhenPresent("carfailid", record::getCarfailid)
                .map(carfailokno).toPropertyWhenPresent("carfailokno", record::getCarfailokno)
                .map(downloadstate).toPropertyWhenPresent("downloadstate", record::getDownloadstate)
                .map(cardlossmachine).toPropertyWhenPresent("cardlossmachine", record::getCardlossmachine)
                .map(mjpassword).toPropertyWhenPresent("mjpassword", record::getMjpassword)
                .map(mjenabsysholiday).toPropertyWhenPresent("mjenabsysholiday", record::getMjenabsysholiday)
                .map(mjjureteam).toPropertyWhenPresent("mjjureteam", record::getMjjureteam)
                .map(mjtcard).toPropertyWhenPresent("mjtcard", record::getMjtcard)
                .map(monthtype).toPropertyWhenPresent("monthtype", record::getMonthtype)
                .map(cphdownloadsignal).toPropertyWhenPresent("cphdownloadsignal", record::getCphdownloadsignal)
                .map(res1).toPropertyWhenPresent("res1", record::getRes1)
                .map(res2).toPropertyWhenPresent("res2", record::getRes2)
                .map(carphoto).toPropertyWhenPresent("carphoto", record::getCarphoto)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.023+08:00", comments="Source Table: MYFAXINGSSUE")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myfaxingssue>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, cardno, userno, cardstate, cardyj, subsystem, carcardtype, carissuedate, carissueusercard, balance, carvalidstartdate, carvalidenddate, cph, carcolor, cartype, carplace, carwithdrawcarddate, carwithdrawoptcard, carvalidmachine, carvalidzone, carmemo, mjcardtype, mjissuedate, mjissueusercard, mjenddate, mjvalidstarttime, mjvalidendtime, mjvalidmachine, mjwithdrawcarddate, mjwithdrawoptcard, mjmemo, issuedate, withdrawdate, issueusercard, withdrawusercard, lossregdate, lossregusercard, cardidno, downloadsignal, carpic, tempnumber, timeteam, holidaylimited, userinfo, backcardnum, cardidlossstate, cardidunlossstate, unlossdate, unlossuer, mjbegindate, carfailid, carfailokno, downloadstate, cardlossmachine, mjpassword, mjenabsysholiday, mjjureteam, mjtcard, monthtype, cphdownloadsignal, res1, res2, carphoto)
                .from(myfaxingssue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.023+08:00", comments="Source Table: MYFAXINGSSUE")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myfaxingssue>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, cardno, userno, cardstate, cardyj, subsystem, carcardtype, carissuedate, carissueusercard, balance, carvalidstartdate, carvalidenddate, cph, carcolor, cartype, carplace, carwithdrawcarddate, carwithdrawoptcard, carvalidmachine, carvalidzone, carmemo, mjcardtype, mjissuedate, mjissueusercard, mjenddate, mjvalidstarttime, mjvalidendtime, mjvalidmachine, mjwithdrawcarddate, mjwithdrawoptcard, mjmemo, issuedate, withdrawdate, issueusercard, withdrawusercard, lossregdate, lossregusercard, cardidno, downloadsignal, carpic, tempnumber, timeteam, holidaylimited, userinfo, backcardnum, cardidlossstate, cardidunlossstate, unlossdate, unlossuer, mjbegindate, carfailid, carfailokno, downloadstate, cardlossmachine, mjpassword, mjenabsysholiday, mjjureteam, mjtcard, monthtype, cphdownloadsignal, res1, res2, carphoto)
                .from(myfaxingssue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.023+08:00", comments="Source Table: MYFAXINGSSUE")
    default Myfaxingssue selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, cardno, userno, cardstate, cardyj, subsystem, carcardtype, carissuedate, carissueusercard, balance, carvalidstartdate, carvalidenddate, cph, carcolor, cartype, carplace, carwithdrawcarddate, carwithdrawoptcard, carvalidmachine, carvalidzone, carmemo, mjcardtype, mjissuedate, mjissueusercard, mjenddate, mjvalidstarttime, mjvalidendtime, mjvalidmachine, mjwithdrawcarddate, mjwithdrawoptcard, mjmemo, issuedate, withdrawdate, issueusercard, withdrawusercard, lossregdate, lossregusercard, cardidno, downloadsignal, carpic, tempnumber, timeteam, holidaylimited, userinfo, backcardnum, cardidlossstate, cardidunlossstate, unlossdate, unlossuer, mjbegindate, carfailid, carfailokno, downloadstate, cardlossmachine, mjpassword, mjenabsysholiday, mjjureteam, mjtcard, monthtype, cphdownloadsignal, res1, res2, carphoto)
                .from(myfaxingssue)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.023+08:00", comments="Source Table: MYFAXINGSSUE")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Myfaxingssue record) {
        return UpdateDSL.updateWithMapper(this::update, myfaxingssue)
                .set(cardno).equalTo(record::getCardno)
                .set(userno).equalTo(record::getUserno)
                .set(cardstate).equalTo(record::getCardstate)
                .set(cardyj).equalTo(record::getCardyj)
                .set(subsystem).equalTo(record::getSubsystem)
                .set(carcardtype).equalTo(record::getCarcardtype)
                .set(carissuedate).equalTo(record::getCarissuedate)
                .set(carissueusercard).equalTo(record::getCarissueusercard)
                .set(balance).equalTo(record::getBalance)
                .set(carvalidstartdate).equalTo(record::getCarvalidstartdate)
                .set(carvalidenddate).equalTo(record::getCarvalidenddate)
                .set(cph).equalTo(record::getCph)
                .set(carcolor).equalTo(record::getCarcolor)
                .set(cartype).equalTo(record::getCartype)
                .set(carplace).equalTo(record::getCarplace)
                .set(carwithdrawcarddate).equalTo(record::getCarwithdrawcarddate)
                .set(carwithdrawoptcard).equalTo(record::getCarwithdrawoptcard)
                .set(carvalidmachine).equalTo(record::getCarvalidmachine)
                .set(carvalidzone).equalTo(record::getCarvalidzone)
                .set(carmemo).equalTo(record::getCarmemo)
                .set(mjcardtype).equalTo(record::getMjcardtype)
                .set(mjissuedate).equalTo(record::getMjissuedate)
                .set(mjissueusercard).equalTo(record::getMjissueusercard)
                .set(mjenddate).equalTo(record::getMjenddate)
                .set(mjvalidstarttime).equalTo(record::getMjvalidstarttime)
                .set(mjvalidendtime).equalTo(record::getMjvalidendtime)
                .set(mjvalidmachine).equalTo(record::getMjvalidmachine)
                .set(mjwithdrawcarddate).equalTo(record::getMjwithdrawcarddate)
                .set(mjwithdrawoptcard).equalTo(record::getMjwithdrawoptcard)
                .set(mjmemo).equalTo(record::getMjmemo)
                .set(issuedate).equalTo(record::getIssuedate)
                .set(withdrawdate).equalTo(record::getWithdrawdate)
                .set(issueusercard).equalTo(record::getIssueusercard)
                .set(withdrawusercard).equalTo(record::getWithdrawusercard)
                .set(lossregdate).equalTo(record::getLossregdate)
                .set(lossregusercard).equalTo(record::getLossregusercard)
                .set(cardidno).equalTo(record::getCardidno)
                .set(downloadsignal).equalTo(record::getDownloadsignal)
                .set(carpic).equalTo(record::getCarpic)
                .set(tempnumber).equalTo(record::getTempnumber)
                .set(timeteam).equalTo(record::getTimeteam)
                .set(holidaylimited).equalTo(record::getHolidaylimited)
                .set(userinfo).equalTo(record::getUserinfo)
                .set(backcardnum).equalTo(record::getBackcardnum)
                .set(cardidlossstate).equalTo(record::getCardidlossstate)
                .set(cardidunlossstate).equalTo(record::getCardidunlossstate)
                .set(unlossdate).equalTo(record::getUnlossdate)
                .set(unlossuer).equalTo(record::getUnlossuer)
                .set(mjbegindate).equalTo(record::getMjbegindate)
                .set(carfailid).equalTo(record::getCarfailid)
                .set(carfailokno).equalTo(record::getCarfailokno)
                .set(downloadstate).equalTo(record::getDownloadstate)
                .set(cardlossmachine).equalTo(record::getCardlossmachine)
                .set(mjpassword).equalTo(record::getMjpassword)
                .set(mjenabsysholiday).equalTo(record::getMjenabsysholiday)
                .set(mjjureteam).equalTo(record::getMjjureteam)
                .set(mjtcard).equalTo(record::getMjtcard)
                .set(monthtype).equalTo(record::getMonthtype)
                .set(cphdownloadsignal).equalTo(record::getCphdownloadsignal)
                .set(res1).equalTo(record::getRes1)
                .set(res2).equalTo(record::getRes2)
                .set(carphoto).equalTo(record::getCarphoto);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.023+08:00", comments="Source Table: MYFAXINGSSUE")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Myfaxingssue record) {
        return UpdateDSL.updateWithMapper(this::update, myfaxingssue)
                .set(cardno).equalToWhenPresent(record::getCardno)
                .set(userno).equalToWhenPresent(record::getUserno)
                .set(cardstate).equalToWhenPresent(record::getCardstate)
                .set(cardyj).equalToWhenPresent(record::getCardyj)
                .set(subsystem).equalToWhenPresent(record::getSubsystem)
                .set(carcardtype).equalToWhenPresent(record::getCarcardtype)
                .set(carissuedate).equalToWhenPresent(record::getCarissuedate)
                .set(carissueusercard).equalToWhenPresent(record::getCarissueusercard)
                .set(balance).equalToWhenPresent(record::getBalance)
                .set(carvalidstartdate).equalToWhenPresent(record::getCarvalidstartdate)
                .set(carvalidenddate).equalToWhenPresent(record::getCarvalidenddate)
                .set(cph).equalToWhenPresent(record::getCph)
                .set(carcolor).equalToWhenPresent(record::getCarcolor)
                .set(cartype).equalToWhenPresent(record::getCartype)
                .set(carplace).equalToWhenPresent(record::getCarplace)
                .set(carwithdrawcarddate).equalToWhenPresent(record::getCarwithdrawcarddate)
                .set(carwithdrawoptcard).equalToWhenPresent(record::getCarwithdrawoptcard)
                .set(carvalidmachine).equalToWhenPresent(record::getCarvalidmachine)
                .set(carvalidzone).equalToWhenPresent(record::getCarvalidzone)
                .set(carmemo).equalToWhenPresent(record::getCarmemo)
                .set(mjcardtype).equalToWhenPresent(record::getMjcardtype)
                .set(mjissuedate).equalToWhenPresent(record::getMjissuedate)
                .set(mjissueusercard).equalToWhenPresent(record::getMjissueusercard)
                .set(mjenddate).equalToWhenPresent(record::getMjenddate)
                .set(mjvalidstarttime).equalToWhenPresent(record::getMjvalidstarttime)
                .set(mjvalidendtime).equalToWhenPresent(record::getMjvalidendtime)
                .set(mjvalidmachine).equalToWhenPresent(record::getMjvalidmachine)
                .set(mjwithdrawcarddate).equalToWhenPresent(record::getMjwithdrawcarddate)
                .set(mjwithdrawoptcard).equalToWhenPresent(record::getMjwithdrawoptcard)
                .set(mjmemo).equalToWhenPresent(record::getMjmemo)
                .set(issuedate).equalToWhenPresent(record::getIssuedate)
                .set(withdrawdate).equalToWhenPresent(record::getWithdrawdate)
                .set(issueusercard).equalToWhenPresent(record::getIssueusercard)
                .set(withdrawusercard).equalToWhenPresent(record::getWithdrawusercard)
                .set(lossregdate).equalToWhenPresent(record::getLossregdate)
                .set(lossregusercard).equalToWhenPresent(record::getLossregusercard)
                .set(cardidno).equalToWhenPresent(record::getCardidno)
                .set(downloadsignal).equalToWhenPresent(record::getDownloadsignal)
                .set(carpic).equalToWhenPresent(record::getCarpic)
                .set(tempnumber).equalToWhenPresent(record::getTempnumber)
                .set(timeteam).equalToWhenPresent(record::getTimeteam)
                .set(holidaylimited).equalToWhenPresent(record::getHolidaylimited)
                .set(userinfo).equalToWhenPresent(record::getUserinfo)
                .set(backcardnum).equalToWhenPresent(record::getBackcardnum)
                .set(cardidlossstate).equalToWhenPresent(record::getCardidlossstate)
                .set(cardidunlossstate).equalToWhenPresent(record::getCardidunlossstate)
                .set(unlossdate).equalToWhenPresent(record::getUnlossdate)
                .set(unlossuer).equalToWhenPresent(record::getUnlossuer)
                .set(mjbegindate).equalToWhenPresent(record::getMjbegindate)
                .set(carfailid).equalToWhenPresent(record::getCarfailid)
                .set(carfailokno).equalToWhenPresent(record::getCarfailokno)
                .set(downloadstate).equalToWhenPresent(record::getDownloadstate)
                .set(cardlossmachine).equalToWhenPresent(record::getCardlossmachine)
                .set(mjpassword).equalToWhenPresent(record::getMjpassword)
                .set(mjenabsysholiday).equalToWhenPresent(record::getMjenabsysholiday)
                .set(mjjureteam).equalToWhenPresent(record::getMjjureteam)
                .set(mjtcard).equalToWhenPresent(record::getMjtcard)
                .set(monthtype).equalToWhenPresent(record::getMonthtype)
                .set(cphdownloadsignal).equalToWhenPresent(record::getCphdownloadsignal)
                .set(res1).equalToWhenPresent(record::getRes1)
                .set(res2).equalToWhenPresent(record::getRes2)
                .set(carphoto).equalToWhenPresent(record::getCarphoto);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.024+08:00", comments="Source Table: MYFAXINGSSUE")
    default int updateByPrimaryKey(Myfaxingssue record) {
        return UpdateDSL.updateWithMapper(this::update, myfaxingssue)
                .set(cardno).equalTo(record::getCardno)
                .set(userno).equalTo(record::getUserno)
                .set(cardstate).equalTo(record::getCardstate)
                .set(cardyj).equalTo(record::getCardyj)
                .set(subsystem).equalTo(record::getSubsystem)
                .set(carcardtype).equalTo(record::getCarcardtype)
                .set(carissuedate).equalTo(record::getCarissuedate)
                .set(carissueusercard).equalTo(record::getCarissueusercard)
                .set(balance).equalTo(record::getBalance)
                .set(carvalidstartdate).equalTo(record::getCarvalidstartdate)
                .set(carvalidenddate).equalTo(record::getCarvalidenddate)
                .set(cph).equalTo(record::getCph)
                .set(carcolor).equalTo(record::getCarcolor)
                .set(cartype).equalTo(record::getCartype)
                .set(carplace).equalTo(record::getCarplace)
                .set(carwithdrawcarddate).equalTo(record::getCarwithdrawcarddate)
                .set(carwithdrawoptcard).equalTo(record::getCarwithdrawoptcard)
                .set(carvalidmachine).equalTo(record::getCarvalidmachine)
                .set(carvalidzone).equalTo(record::getCarvalidzone)
                .set(carmemo).equalTo(record::getCarmemo)
                .set(mjcardtype).equalTo(record::getMjcardtype)
                .set(mjissuedate).equalTo(record::getMjissuedate)
                .set(mjissueusercard).equalTo(record::getMjissueusercard)
                .set(mjenddate).equalTo(record::getMjenddate)
                .set(mjvalidstarttime).equalTo(record::getMjvalidstarttime)
                .set(mjvalidendtime).equalTo(record::getMjvalidendtime)
                .set(mjvalidmachine).equalTo(record::getMjvalidmachine)
                .set(mjwithdrawcarddate).equalTo(record::getMjwithdrawcarddate)
                .set(mjwithdrawoptcard).equalTo(record::getMjwithdrawoptcard)
                .set(mjmemo).equalTo(record::getMjmemo)
                .set(issuedate).equalTo(record::getIssuedate)
                .set(withdrawdate).equalTo(record::getWithdrawdate)
                .set(issueusercard).equalTo(record::getIssueusercard)
                .set(withdrawusercard).equalTo(record::getWithdrawusercard)
                .set(lossregdate).equalTo(record::getLossregdate)
                .set(lossregusercard).equalTo(record::getLossregusercard)
                .set(cardidno).equalTo(record::getCardidno)
                .set(downloadsignal).equalTo(record::getDownloadsignal)
                .set(carpic).equalTo(record::getCarpic)
                .set(tempnumber).equalTo(record::getTempnumber)
                .set(timeteam).equalTo(record::getTimeteam)
                .set(holidaylimited).equalTo(record::getHolidaylimited)
                .set(userinfo).equalTo(record::getUserinfo)
                .set(backcardnum).equalTo(record::getBackcardnum)
                .set(cardidlossstate).equalTo(record::getCardidlossstate)
                .set(cardidunlossstate).equalTo(record::getCardidunlossstate)
                .set(unlossdate).equalTo(record::getUnlossdate)
                .set(unlossuer).equalTo(record::getUnlossuer)
                .set(mjbegindate).equalTo(record::getMjbegindate)
                .set(carfailid).equalTo(record::getCarfailid)
                .set(carfailokno).equalTo(record::getCarfailokno)
                .set(downloadstate).equalTo(record::getDownloadstate)
                .set(cardlossmachine).equalTo(record::getCardlossmachine)
                .set(mjpassword).equalTo(record::getMjpassword)
                .set(mjenabsysholiday).equalTo(record::getMjenabsysholiday)
                .set(mjjureteam).equalTo(record::getMjjureteam)
                .set(mjtcard).equalTo(record::getMjtcard)
                .set(monthtype).equalTo(record::getMonthtype)
                .set(cphdownloadsignal).equalTo(record::getCphdownloadsignal)
                .set(res1).equalTo(record::getRes1)
                .set(res2).equalTo(record::getRes2)
                .set(carphoto).equalTo(record::getCarphoto)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.024+08:00", comments="Source Table: MYFAXINGSSUE")
    default int updateByPrimaryKeySelective(Myfaxingssue record) {
        return UpdateDSL.updateWithMapper(this::update, myfaxingssue)
                .set(cardno).equalToWhenPresent(record::getCardno)
                .set(userno).equalToWhenPresent(record::getUserno)
                .set(cardstate).equalToWhenPresent(record::getCardstate)
                .set(cardyj).equalToWhenPresent(record::getCardyj)
                .set(subsystem).equalToWhenPresent(record::getSubsystem)
                .set(carcardtype).equalToWhenPresent(record::getCarcardtype)
                .set(carissuedate).equalToWhenPresent(record::getCarissuedate)
                .set(carissueusercard).equalToWhenPresent(record::getCarissueusercard)
                .set(balance).equalToWhenPresent(record::getBalance)
                .set(carvalidstartdate).equalToWhenPresent(record::getCarvalidstartdate)
                .set(carvalidenddate).equalToWhenPresent(record::getCarvalidenddate)
                .set(cph).equalToWhenPresent(record::getCph)
                .set(carcolor).equalToWhenPresent(record::getCarcolor)
                .set(cartype).equalToWhenPresent(record::getCartype)
                .set(carplace).equalToWhenPresent(record::getCarplace)
                .set(carwithdrawcarddate).equalToWhenPresent(record::getCarwithdrawcarddate)
                .set(carwithdrawoptcard).equalToWhenPresent(record::getCarwithdrawoptcard)
                .set(carvalidmachine).equalToWhenPresent(record::getCarvalidmachine)
                .set(carvalidzone).equalToWhenPresent(record::getCarvalidzone)
                .set(carmemo).equalToWhenPresent(record::getCarmemo)
                .set(mjcardtype).equalToWhenPresent(record::getMjcardtype)
                .set(mjissuedate).equalToWhenPresent(record::getMjissuedate)
                .set(mjissueusercard).equalToWhenPresent(record::getMjissueusercard)
                .set(mjenddate).equalToWhenPresent(record::getMjenddate)
                .set(mjvalidstarttime).equalToWhenPresent(record::getMjvalidstarttime)
                .set(mjvalidendtime).equalToWhenPresent(record::getMjvalidendtime)
                .set(mjvalidmachine).equalToWhenPresent(record::getMjvalidmachine)
                .set(mjwithdrawcarddate).equalToWhenPresent(record::getMjwithdrawcarddate)
                .set(mjwithdrawoptcard).equalToWhenPresent(record::getMjwithdrawoptcard)
                .set(mjmemo).equalToWhenPresent(record::getMjmemo)
                .set(issuedate).equalToWhenPresent(record::getIssuedate)
                .set(withdrawdate).equalToWhenPresent(record::getWithdrawdate)
                .set(issueusercard).equalToWhenPresent(record::getIssueusercard)
                .set(withdrawusercard).equalToWhenPresent(record::getWithdrawusercard)
                .set(lossregdate).equalToWhenPresent(record::getLossregdate)
                .set(lossregusercard).equalToWhenPresent(record::getLossregusercard)
                .set(cardidno).equalToWhenPresent(record::getCardidno)
                .set(downloadsignal).equalToWhenPresent(record::getDownloadsignal)
                .set(carpic).equalToWhenPresent(record::getCarpic)
                .set(tempnumber).equalToWhenPresent(record::getTempnumber)
                .set(timeteam).equalToWhenPresent(record::getTimeteam)
                .set(holidaylimited).equalToWhenPresent(record::getHolidaylimited)
                .set(userinfo).equalToWhenPresent(record::getUserinfo)
                .set(backcardnum).equalToWhenPresent(record::getBackcardnum)
                .set(cardidlossstate).equalToWhenPresent(record::getCardidlossstate)
                .set(cardidunlossstate).equalToWhenPresent(record::getCardidunlossstate)
                .set(unlossdate).equalToWhenPresent(record::getUnlossdate)
                .set(unlossuer).equalToWhenPresent(record::getUnlossuer)
                .set(mjbegindate).equalToWhenPresent(record::getMjbegindate)
                .set(carfailid).equalToWhenPresent(record::getCarfailid)
                .set(carfailokno).equalToWhenPresent(record::getCarfailokno)
                .set(downloadstate).equalToWhenPresent(record::getDownloadstate)
                .set(cardlossmachine).equalToWhenPresent(record::getCardlossmachine)
                .set(mjpassword).equalToWhenPresent(record::getMjpassword)
                .set(mjenabsysholiday).equalToWhenPresent(record::getMjenabsysholiday)
                .set(mjjureteam).equalToWhenPresent(record::getMjjureteam)
                .set(mjtcard).equalToWhenPresent(record::getMjtcard)
                .set(monthtype).equalToWhenPresent(record::getMonthtype)
                .set(cphdownloadsignal).equalToWhenPresent(record::getCphdownloadsignal)
                .set(res1).equalToWhenPresent(record::getRes1)
                .set(res2).equalToWhenPresent(record::getRes2)
                .set(carphoto).equalToWhenPresent(record::getCarphoto)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}