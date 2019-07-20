package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.QrFaxingssueDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.QrFaxingssue;
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
public interface QrFaxingssueDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.462+08:00", comments="Source Table: Qr_FaxingSsue")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.462+08:00", comments="Source Table: Qr_FaxingSsue")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.462+08:00", comments="Source Table: Qr_FaxingSsue")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<QrFaxingssue> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.462+08:00", comments="Source Table: Qr_FaxingSsue")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("QrFaxingssueResult")
    QrFaxingssue selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.462+08:00", comments="Source Table: Qr_FaxingSsue")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="QrFaxingssueResult", value = {
        @Result(column="Id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="Cardno", property="cardno", jdbcType=JdbcType.VARCHAR),
        @Result(column="Userno", property="userno", jdbcType=JdbcType.VARCHAR),
        @Result(column="Cardstuat", property="cardstuat", jdbcType=JdbcType.VARCHAR),
        @Result(column="Cardtype", property="cardtype", jdbcType=JdbcType.VARCHAR),
        @Result(column="Pasword", property="pasword", jdbcType=JdbcType.VARCHAR),
        @Result(column="EndTime", property="endtime", jdbcType=JdbcType.VARCHAR),
        @Result(column="StarHour", property="starhour", jdbcType=JdbcType.VARCHAR),
        @Result(column="EndHour", property="endhour", jdbcType=JdbcType.VARCHAR),
        @Result(column="CardExitflag", property="cardexitflag", jdbcType=JdbcType.VARCHAR),
        @Result(column="Mark", property="mark", jdbcType=JdbcType.VARCHAR),
        @Result(column="DevcInfo", property="devcinfo", jdbcType=JdbcType.VARCHAR),
        @Result(column="IssDate", property="issdate", jdbcType=JdbcType.VARCHAR)
    })
    List<QrFaxingssue> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.462+08:00", comments="Source Table: Qr_FaxingSsue")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.462+08:00", comments="Source Table: Qr_FaxingSsue")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(qrFaxingssue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.462+08:00", comments="Source Table: Qr_FaxingSsue")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, qrFaxingssue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.462+08:00", comments="Source Table: Qr_FaxingSsue")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, qrFaxingssue)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.462+08:00", comments="Source Table: Qr_FaxingSsue")
    default int insert(QrFaxingssue record) {
        return insert(SqlBuilder.insert(record)
                .into(qrFaxingssue)
                .map(cardno).toProperty("cardno")
                .map(userno).toProperty("userno")
                .map(cardstuat).toProperty("cardstuat")
                .map(cardtype).toProperty("cardtype")
                .map(pasword).toProperty("pasword")
                .map(endtime).toProperty("endtime")
                .map(starhour).toProperty("starhour")
                .map(endhour).toProperty("endhour")
                .map(cardexitflag).toProperty("cardexitflag")
                .map(mark).toProperty("mark")
                .map(devcinfo).toProperty("devcinfo")
                .map(issdate).toProperty("issdate")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.462+08:00", comments="Source Table: Qr_FaxingSsue")
    default int insertSelective(QrFaxingssue record) {
        return insert(SqlBuilder.insert(record)
                .into(qrFaxingssue)
                .map(cardno).toPropertyWhenPresent("cardno", record::getCardno)
                .map(userno).toPropertyWhenPresent("userno", record::getUserno)
                .map(cardstuat).toPropertyWhenPresent("cardstuat", record::getCardstuat)
                .map(cardtype).toPropertyWhenPresent("cardtype", record::getCardtype)
                .map(pasword).toPropertyWhenPresent("pasword", record::getPasword)
                .map(endtime).toPropertyWhenPresent("endtime", record::getEndtime)
                .map(starhour).toPropertyWhenPresent("starhour", record::getStarhour)
                .map(endhour).toPropertyWhenPresent("endhour", record::getEndhour)
                .map(cardexitflag).toPropertyWhenPresent("cardexitflag", record::getCardexitflag)
                .map(mark).toPropertyWhenPresent("mark", record::getMark)
                .map(devcinfo).toPropertyWhenPresent("devcinfo", record::getDevcinfo)
                .map(issdate).toPropertyWhenPresent("issdate", record::getIssdate)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.463+08:00", comments="Source Table: Qr_FaxingSsue")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<QrFaxingssue>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, cardno, userno, cardstuat, cardtype, pasword, endtime, starhour, endhour, cardexitflag, mark, devcinfo, issdate)
                .from(qrFaxingssue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.463+08:00", comments="Source Table: Qr_FaxingSsue")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<QrFaxingssue>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, cardno, userno, cardstuat, cardtype, pasword, endtime, starhour, endhour, cardexitflag, mark, devcinfo, issdate)
                .from(qrFaxingssue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.463+08:00", comments="Source Table: Qr_FaxingSsue")
    default QrFaxingssue selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, cardno, userno, cardstuat, cardtype, pasword, endtime, starhour, endhour, cardexitflag, mark, devcinfo, issdate)
                .from(qrFaxingssue)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.463+08:00", comments="Source Table: Qr_FaxingSsue")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(QrFaxingssue record) {
        return UpdateDSL.updateWithMapper(this::update, qrFaxingssue)
                .set(cardno).equalTo(record::getCardno)
                .set(userno).equalTo(record::getUserno)
                .set(cardstuat).equalTo(record::getCardstuat)
                .set(cardtype).equalTo(record::getCardtype)
                .set(pasword).equalTo(record::getPasword)
                .set(endtime).equalTo(record::getEndtime)
                .set(starhour).equalTo(record::getStarhour)
                .set(endhour).equalTo(record::getEndhour)
                .set(cardexitflag).equalTo(record::getCardexitflag)
                .set(mark).equalTo(record::getMark)
                .set(devcinfo).equalTo(record::getDevcinfo)
                .set(issdate).equalTo(record::getIssdate);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.463+08:00", comments="Source Table: Qr_FaxingSsue")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(QrFaxingssue record) {
        return UpdateDSL.updateWithMapper(this::update, qrFaxingssue)
                .set(cardno).equalToWhenPresent(record::getCardno)
                .set(userno).equalToWhenPresent(record::getUserno)
                .set(cardstuat).equalToWhenPresent(record::getCardstuat)
                .set(cardtype).equalToWhenPresent(record::getCardtype)
                .set(pasword).equalToWhenPresent(record::getPasword)
                .set(endtime).equalToWhenPresent(record::getEndtime)
                .set(starhour).equalToWhenPresent(record::getStarhour)
                .set(endhour).equalToWhenPresent(record::getEndhour)
                .set(cardexitflag).equalToWhenPresent(record::getCardexitflag)
                .set(mark).equalToWhenPresent(record::getMark)
                .set(devcinfo).equalToWhenPresent(record::getDevcinfo)
                .set(issdate).equalToWhenPresent(record::getIssdate);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.463+08:00", comments="Source Table: Qr_FaxingSsue")
    default int updateByPrimaryKey(QrFaxingssue record) {
        return UpdateDSL.updateWithMapper(this::update, qrFaxingssue)
                .set(cardno).equalTo(record::getCardno)
                .set(userno).equalTo(record::getUserno)
                .set(cardstuat).equalTo(record::getCardstuat)
                .set(cardtype).equalTo(record::getCardtype)
                .set(pasword).equalTo(record::getPasword)
                .set(endtime).equalTo(record::getEndtime)
                .set(starhour).equalTo(record::getStarhour)
                .set(endhour).equalTo(record::getEndhour)
                .set(cardexitflag).equalTo(record::getCardexitflag)
                .set(mark).equalTo(record::getMark)
                .set(devcinfo).equalTo(record::getDevcinfo)
                .set(issdate).equalTo(record::getIssdate)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.463+08:00", comments="Source Table: Qr_FaxingSsue")
    default int updateByPrimaryKeySelective(QrFaxingssue record) {
        return UpdateDSL.updateWithMapper(this::update, qrFaxingssue)
                .set(cardno).equalToWhenPresent(record::getCardno)
                .set(userno).equalToWhenPresent(record::getUserno)
                .set(cardstuat).equalToWhenPresent(record::getCardstuat)
                .set(cardtype).equalToWhenPresent(record::getCardtype)
                .set(pasword).equalToWhenPresent(record::getPasword)
                .set(endtime).equalToWhenPresent(record::getEndtime)
                .set(starhour).equalToWhenPresent(record::getStarhour)
                .set(endhour).equalToWhenPresent(record::getEndhour)
                .set(cardexitflag).equalToWhenPresent(record::getCardexitflag)
                .set(mark).equalToWhenPresent(record::getMark)
                .set(devcinfo).equalToWhenPresent(record::getDevcinfo)
                .set(issdate).equalToWhenPresent(record::getIssdate)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}