package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.SerRecordsDynamicSqlSupport.*;

import cn.xvkang.primaryentity.SerRecords;
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
public interface SerRecordsDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.869+08:00", comments="Source Table: Ser_Records")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.869+08:00", comments="Source Table: Ser_Records")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.869+08:00", comments="Source Table: Ser_Records")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<SerRecords> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.869+08:00", comments="Source Table: Ser_Records")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SerRecordsResult", value = {
        @Result(column="CardID", property="cardid", jdbcType=JdbcType.VARCHAR),
        @Result(column="UserNo", property="userno", jdbcType=JdbcType.VARCHAR),
        @Result(column="MachNo", property="machno", jdbcType=JdbcType.INTEGER),
        @Result(column="MachPlace", property="machplace", jdbcType=JdbcType.VARCHAR),
        @Result(column="DoorNo", property="doorno", jdbcType=JdbcType.INTEGER),
        @Result(column="DoorPlace", property="doorplace", jdbcType=JdbcType.VARCHAR),
        @Result(column="Events", property="events", jdbcType=JdbcType.VARCHAR),
        @Result(column="OpenTime", property="opentime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="Password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="PasswordType", property="passwordtype", jdbcType=JdbcType.VARCHAR)
    })
    List<SerRecords> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.869+08:00", comments="Source Table: Ser_Records")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.869+08:00", comments="Source Table: Ser_Records")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(serRecords);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.869+08:00", comments="Source Table: Ser_Records")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, serRecords);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.869+08:00", comments="Source Table: Ser_Records")
    default int insert(SerRecords record) {
        return insert(SqlBuilder.insert(record)
                .into(serRecords)
                .map(cardid).toProperty("cardid")
                .map(userno).toProperty("userno")
                .map(machno).toProperty("machno")
                .map(machplace).toProperty("machplace")
                .map(doorno).toProperty("doorno")
                .map(doorplace).toProperty("doorplace")
                .map(events).toProperty("events")
                .map(opentime).toProperty("opentime")
                .map(password).toProperty("password")
                .map(passwordtype).toProperty("passwordtype")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.869+08:00", comments="Source Table: Ser_Records")
    default int insertSelective(SerRecords record) {
        return insert(SqlBuilder.insert(record)
                .into(serRecords)
                .map(cardid).toPropertyWhenPresent("cardid", record::getCardid)
                .map(userno).toPropertyWhenPresent("userno", record::getUserno)
                .map(machno).toPropertyWhenPresent("machno", record::getMachno)
                .map(machplace).toPropertyWhenPresent("machplace", record::getMachplace)
                .map(doorno).toPropertyWhenPresent("doorno", record::getDoorno)
                .map(doorplace).toPropertyWhenPresent("doorplace", record::getDoorplace)
                .map(events).toPropertyWhenPresent("events", record::getEvents)
                .map(opentime).toPropertyWhenPresent("opentime", record::getOpentime)
                .map(password).toPropertyWhenPresent("password", record::getPassword)
                .map(passwordtype).toPropertyWhenPresent("passwordtype", record::getPasswordtype)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.869+08:00", comments="Source Table: Ser_Records")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<SerRecords>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, cardid, userno, machno, machplace, doorno, doorplace, events, opentime, password, passwordtype)
                .from(serRecords);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.869+08:00", comments="Source Table: Ser_Records")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<SerRecords>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, cardid, userno, machno, machplace, doorno, doorplace, events, opentime, password, passwordtype)
                .from(serRecords);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.870+08:00", comments="Source Table: Ser_Records")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(SerRecords record) {
        return UpdateDSL.updateWithMapper(this::update, serRecords)
                .set(cardid).equalTo(record::getCardid)
                .set(userno).equalTo(record::getUserno)
                .set(machno).equalTo(record::getMachno)
                .set(machplace).equalTo(record::getMachplace)
                .set(doorno).equalTo(record::getDoorno)
                .set(doorplace).equalTo(record::getDoorplace)
                .set(events).equalTo(record::getEvents)
                .set(opentime).equalTo(record::getOpentime)
                .set(password).equalTo(record::getPassword)
                .set(passwordtype).equalTo(record::getPasswordtype);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.870+08:00", comments="Source Table: Ser_Records")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(SerRecords record) {
        return UpdateDSL.updateWithMapper(this::update, serRecords)
                .set(cardid).equalToWhenPresent(record::getCardid)
                .set(userno).equalToWhenPresent(record::getUserno)
                .set(machno).equalToWhenPresent(record::getMachno)
                .set(machplace).equalToWhenPresent(record::getMachplace)
                .set(doorno).equalToWhenPresent(record::getDoorno)
                .set(doorplace).equalToWhenPresent(record::getDoorplace)
                .set(events).equalToWhenPresent(record::getEvents)
                .set(opentime).equalToWhenPresent(record::getOpentime)
                .set(password).equalToWhenPresent(record::getPassword)
                .set(passwordtype).equalToWhenPresent(record::getPasswordtype);
    }
}