package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MRecordDynamicSqlSupport.*;

import cn.xvkang.primaryentity.MRecord;
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
public interface MRecordDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.746+08:00", comments="Source Table: M_Record")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.746+08:00", comments="Source Table: M_Record")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.746+08:00", comments="Source Table: M_Record")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MRecord> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.746+08:00", comments="Source Table: M_Record")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MRecordResult", value = {
        @Result(column="CardID", property="cardid", jdbcType=JdbcType.VARCHAR),
        @Result(column="CardType", property="cardtype", jdbcType=JdbcType.VARCHAR),
        @Result(column="UserNo", property="userno", jdbcType=JdbcType.VARCHAR),
        @Result(column="UserName", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="Dept", property="dept", jdbcType=JdbcType.VARCHAR),
        @Result(column="MachNo", property="machno", jdbcType=JdbcType.INTEGER),
        @Result(column="MachPlace", property="machplace", jdbcType=JdbcType.VARCHAR),
        @Result(column="DoorNo", property="doorno", jdbcType=JdbcType.INTEGER),
        @Result(column="DoorPlace", property="doorplace", jdbcType=JdbcType.VARCHAR),
        @Result(column="Events", property="events", jdbcType=JdbcType.VARCHAR),
        @Result(column="OpenTime", property="opentime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ControlType", property="controltype", jdbcType=JdbcType.CHAR)
    })
    List<MRecord> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.747+08:00", comments="Source Table: M_Record")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.747+08:00", comments="Source Table: M_Record")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(MRecord);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.747+08:00", comments="Source Table: M_Record")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, MRecord);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.747+08:00", comments="Source Table: M_Record")
    default int insert(MRecord record) {
        return insert(SqlBuilder.insert(record)
                .into(MRecord)
                .map(cardid).toProperty("cardid")
                .map(cardtype).toProperty("cardtype")
                .map(userno).toProperty("userno")
                .map(username).toProperty("username")
                .map(dept).toProperty("dept")
                .map(machno).toProperty("machno")
                .map(machplace).toProperty("machplace")
                .map(doorno).toProperty("doorno")
                .map(doorplace).toProperty("doorplace")
                .map(events).toProperty("events")
                .map(opentime).toProperty("opentime")
                .map(controltype).toProperty("controltype")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.747+08:00", comments="Source Table: M_Record")
    default int insertSelective(MRecord record) {
        return insert(SqlBuilder.insert(record)
                .into(MRecord)
                .map(cardid).toPropertyWhenPresent("cardid", record::getCardid)
                .map(cardtype).toPropertyWhenPresent("cardtype", record::getCardtype)
                .map(userno).toPropertyWhenPresent("userno", record::getUserno)
                .map(username).toPropertyWhenPresent("username", record::getUsername)
                .map(dept).toPropertyWhenPresent("dept", record::getDept)
                .map(machno).toPropertyWhenPresent("machno", record::getMachno)
                .map(machplace).toPropertyWhenPresent("machplace", record::getMachplace)
                .map(doorno).toPropertyWhenPresent("doorno", record::getDoorno)
                .map(doorplace).toPropertyWhenPresent("doorplace", record::getDoorplace)
                .map(events).toPropertyWhenPresent("events", record::getEvents)
                .map(opentime).toPropertyWhenPresent("opentime", record::getOpentime)
                .map(controltype).toPropertyWhenPresent("controltype", record::getControltype)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.747+08:00", comments="Source Table: M_Record")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<MRecord>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, cardid, cardtype, userno, username, dept, machno, machplace, doorno, doorplace, events, opentime, controltype)
                .from(MRecord);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.747+08:00", comments="Source Table: M_Record")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<MRecord>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, cardid, cardtype, userno, username, dept, machno, machplace, doorno, doorplace, events, opentime, controltype)
                .from(MRecord);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.747+08:00", comments="Source Table: M_Record")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(MRecord record) {
        return UpdateDSL.updateWithMapper(this::update, MRecord)
                .set(cardid).equalTo(record::getCardid)
                .set(cardtype).equalTo(record::getCardtype)
                .set(userno).equalTo(record::getUserno)
                .set(username).equalTo(record::getUsername)
                .set(dept).equalTo(record::getDept)
                .set(machno).equalTo(record::getMachno)
                .set(machplace).equalTo(record::getMachplace)
                .set(doorno).equalTo(record::getDoorno)
                .set(doorplace).equalTo(record::getDoorplace)
                .set(events).equalTo(record::getEvents)
                .set(opentime).equalTo(record::getOpentime)
                .set(controltype).equalTo(record::getControltype);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.747+08:00", comments="Source Table: M_Record")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(MRecord record) {
        return UpdateDSL.updateWithMapper(this::update, MRecord)
                .set(cardid).equalToWhenPresent(record::getCardid)
                .set(cardtype).equalToWhenPresent(record::getCardtype)
                .set(userno).equalToWhenPresent(record::getUserno)
                .set(username).equalToWhenPresent(record::getUsername)
                .set(dept).equalToWhenPresent(record::getDept)
                .set(machno).equalToWhenPresent(record::getMachno)
                .set(machplace).equalToWhenPresent(record::getMachplace)
                .set(doorno).equalToWhenPresent(record::getDoorno)
                .set(doorplace).equalToWhenPresent(record::getDoorplace)
                .set(events).equalToWhenPresent(record::getEvents)
                .set(opentime).equalToWhenPresent(record::getOpentime)
                .set(controltype).equalToWhenPresent(record::getControltype);
    }
}