package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.QrRecordDynamicSqlSupport.*;

import cn.xvkang.primaryentity.QrRecord;
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
public interface QrRecordDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.827+08:00", comments="Source Table: Qr_Record")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.827+08:00", comments="Source Table: Qr_Record")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.827+08:00", comments="Source Table: Qr_Record")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<QrRecord> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.827+08:00", comments="Source Table: Qr_Record")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="QrRecordResult", value = {
        @Result(column="Cardid", property="cardid", jdbcType=JdbcType.VARCHAR),
        @Result(column="Cardtype", property="cardtype", jdbcType=JdbcType.VARCHAR),
        @Result(column="Userno", property="userno", jdbcType=JdbcType.VARCHAR),
        @Result(column="UserName", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="Department", property="department", jdbcType=JdbcType.VARCHAR),
        @Result(column="Machno", property="machno", jdbcType=JdbcType.VARCHAR),
        @Result(column="Machplace", property="machplace", jdbcType=JdbcType.VARCHAR),
        @Result(column="Doorno", property="doorno", jdbcType=JdbcType.VARCHAR),
        @Result(column="Opentime", property="opentime", jdbcType=JdbcType.VARCHAR)
    })
    List<QrRecord> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.827+08:00", comments="Source Table: Qr_Record")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.827+08:00", comments="Source Table: Qr_Record")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(qrRecord);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.827+08:00", comments="Source Table: Qr_Record")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, qrRecord);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.827+08:00", comments="Source Table: Qr_Record")
    default int insert(QrRecord record) {
        return insert(SqlBuilder.insert(record)
                .into(qrRecord)
                .map(cardid).toProperty("cardid")
                .map(cardtype).toProperty("cardtype")
                .map(userno).toProperty("userno")
                .map(username).toProperty("username")
                .map(department).toProperty("department")
                .map(machno).toProperty("machno")
                .map(machplace).toProperty("machplace")
                .map(doorno).toProperty("doorno")
                .map(opentime).toProperty("opentime")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.827+08:00", comments="Source Table: Qr_Record")
    default int insertSelective(QrRecord record) {
        return insert(SqlBuilder.insert(record)
                .into(qrRecord)
                .map(cardid).toPropertyWhenPresent("cardid", record::getCardid)
                .map(cardtype).toPropertyWhenPresent("cardtype", record::getCardtype)
                .map(userno).toPropertyWhenPresent("userno", record::getUserno)
                .map(username).toPropertyWhenPresent("username", record::getUsername)
                .map(department).toPropertyWhenPresent("department", record::getDepartment)
                .map(machno).toPropertyWhenPresent("machno", record::getMachno)
                .map(machplace).toPropertyWhenPresent("machplace", record::getMachplace)
                .map(doorno).toPropertyWhenPresent("doorno", record::getDoorno)
                .map(opentime).toPropertyWhenPresent("opentime", record::getOpentime)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.827+08:00", comments="Source Table: Qr_Record")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<QrRecord>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, cardid, cardtype, userno, username, department, machno, machplace, doorno, opentime)
                .from(qrRecord);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.827+08:00", comments="Source Table: Qr_Record")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<QrRecord>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, cardid, cardtype, userno, username, department, machno, machplace, doorno, opentime)
                .from(qrRecord);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.827+08:00", comments="Source Table: Qr_Record")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(QrRecord record) {
        return UpdateDSL.updateWithMapper(this::update, qrRecord)
                .set(cardid).equalTo(record::getCardid)
                .set(cardtype).equalTo(record::getCardtype)
                .set(userno).equalTo(record::getUserno)
                .set(username).equalTo(record::getUsername)
                .set(department).equalTo(record::getDepartment)
                .set(machno).equalTo(record::getMachno)
                .set(machplace).equalTo(record::getMachplace)
                .set(doorno).equalTo(record::getDoorno)
                .set(opentime).equalTo(record::getOpentime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.827+08:00", comments="Source Table: Qr_Record")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(QrRecord record) {
        return UpdateDSL.updateWithMapper(this::update, qrRecord)
                .set(cardid).equalToWhenPresent(record::getCardid)
                .set(cardtype).equalToWhenPresent(record::getCardtype)
                .set(userno).equalToWhenPresent(record::getUserno)
                .set(username).equalToWhenPresent(record::getUsername)
                .set(department).equalToWhenPresent(record::getDepartment)
                .set(machno).equalToWhenPresent(record::getMachno)
                .set(machplace).equalToWhenPresent(record::getMachplace)
                .set(doorno).equalToWhenPresent(record::getDoorno)
                .set(opentime).equalToWhenPresent(record::getOpentime);
    }
}