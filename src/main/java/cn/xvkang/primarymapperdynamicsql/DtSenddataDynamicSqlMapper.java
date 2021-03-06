package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.DtSenddataDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.DtSenddata;
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
public interface DtSenddataDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.905+08:00", comments="Source Table: Dt_SendData")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.905+08:00", comments="Source Table: Dt_SendData")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.905+08:00", comments="Source Table: Dt_SendData")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<DtSenddata> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.905+08:00", comments="Source Table: Dt_SendData")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("DtSenddataResult")
    DtSenddata selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.905+08:00", comments="Source Table: Dt_SendData")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="DtSenddataResult", value = {
        @Result(column="Id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="DevcNum", property="devcnum", jdbcType=JdbcType.INTEGER),
        @Result(column="InseDate", property="insedate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="SendData", property="senddata", jdbcType=JdbcType.VARBINARY)
    })
    List<DtSenddata> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.906+08:00", comments="Source Table: Dt_SendData")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.906+08:00", comments="Source Table: Dt_SendData")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(dtSenddata);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.906+08:00", comments="Source Table: Dt_SendData")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, dtSenddata);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.906+08:00", comments="Source Table: Dt_SendData")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, dtSenddata)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.906+08:00", comments="Source Table: Dt_SendData")
    default int insert(DtSenddata record) {
        return insert(SqlBuilder.insert(record)
                .into(dtSenddata)
                .map(devcnum).toProperty("devcnum")
                .map(insedate).toProperty("insedate")
                .map(senddata).toProperty("senddata")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.906+08:00", comments="Source Table: Dt_SendData")
    default int insertSelective(DtSenddata record) {
        return insert(SqlBuilder.insert(record)
                .into(dtSenddata)
                .map(devcnum).toPropertyWhenPresent("devcnum", record::getDevcnum)
                .map(insedate).toPropertyWhenPresent("insedate", record::getInsedate)
                .map(senddata).toPropertyWhenPresent("senddata", record::getSenddata)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.906+08:00", comments="Source Table: Dt_SendData")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<DtSenddata>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, devcnum, insedate, senddata)
                .from(dtSenddata);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.906+08:00", comments="Source Table: Dt_SendData")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<DtSenddata>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, devcnum, insedate, senddata)
                .from(dtSenddata);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.906+08:00", comments="Source Table: Dt_SendData")
    default DtSenddata selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, devcnum, insedate, senddata)
                .from(dtSenddata)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.906+08:00", comments="Source Table: Dt_SendData")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(DtSenddata record) {
        return UpdateDSL.updateWithMapper(this::update, dtSenddata)
                .set(devcnum).equalTo(record::getDevcnum)
                .set(insedate).equalTo(record::getInsedate)
                .set(senddata).equalTo(record::getSenddata);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.906+08:00", comments="Source Table: Dt_SendData")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(DtSenddata record) {
        return UpdateDSL.updateWithMapper(this::update, dtSenddata)
                .set(devcnum).equalToWhenPresent(record::getDevcnum)
                .set(insedate).equalToWhenPresent(record::getInsedate)
                .set(senddata).equalToWhenPresent(record::getSenddata);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.906+08:00", comments="Source Table: Dt_SendData")
    default int updateByPrimaryKey(DtSenddata record) {
        return UpdateDSL.updateWithMapper(this::update, dtSenddata)
                .set(devcnum).equalTo(record::getDevcnum)
                .set(insedate).equalTo(record::getInsedate)
                .set(senddata).equalTo(record::getSenddata)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.906+08:00", comments="Source Table: Dt_SendData")
    default int updateByPrimaryKeySelective(DtSenddata record) {
        return UpdateDSL.updateWithMapper(this::update, dtSenddata)
                .set(devcnum).equalToWhenPresent(record::getDevcnum)
                .set(insedate).equalToWhenPresent(record::getInsedate)
                .set(senddata).equalToWhenPresent(record::getSenddata)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}