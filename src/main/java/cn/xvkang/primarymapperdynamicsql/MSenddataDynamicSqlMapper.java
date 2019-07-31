package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MSenddataDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.MSenddata;
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
public interface MSenddataDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.100+08:00", comments="Source Table: M_SendData")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.100+08:00", comments="Source Table: M_SendData")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.100+08:00", comments="Source Table: M_SendData")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<MSenddata> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.100+08:00", comments="Source Table: M_SendData")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MSenddataResult")
    MSenddata selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.100+08:00", comments="Source Table: M_SendData")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MSenddataResult", value = {
        @Result(column="Id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="DevcNum", property="devcnum", jdbcType=JdbcType.INTEGER),
        @Result(column="InseDate", property="insedate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="SendData", property="senddata", jdbcType=JdbcType.VARBINARY)
    })
    List<MSenddata> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.100+08:00", comments="Source Table: M_SendData")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.100+08:00", comments="Source Table: M_SendData")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(MSenddata);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.100+08:00", comments="Source Table: M_SendData")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, MSenddata);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.101+08:00", comments="Source Table: M_SendData")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, MSenddata)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.101+08:00", comments="Source Table: M_SendData")
    default int insert(MSenddata record) {
        return insert(SqlBuilder.insert(record)
                .into(MSenddata)
                .map(devcnum).toProperty("devcnum")
                .map(insedate).toProperty("insedate")
                .map(senddata).toProperty("senddata")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.101+08:00", comments="Source Table: M_SendData")
    default int insertSelective(MSenddata record) {
        return insert(SqlBuilder.insert(record)
                .into(MSenddata)
                .map(devcnum).toPropertyWhenPresent("devcnum", record::getDevcnum)
                .map(insedate).toPropertyWhenPresent("insedate", record::getInsedate)
                .map(senddata).toPropertyWhenPresent("senddata", record::getSenddata)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.101+08:00", comments="Source Table: M_SendData")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<MSenddata>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, devcnum, insedate, senddata)
                .from(MSenddata);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.101+08:00", comments="Source Table: M_SendData")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<MSenddata>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, devcnum, insedate, senddata)
                .from(MSenddata);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.101+08:00", comments="Source Table: M_SendData")
    default MSenddata selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, devcnum, insedate, senddata)
                .from(MSenddata)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.101+08:00", comments="Source Table: M_SendData")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(MSenddata record) {
        return UpdateDSL.updateWithMapper(this::update, MSenddata)
                .set(devcnum).equalTo(record::getDevcnum)
                .set(insedate).equalTo(record::getInsedate)
                .set(senddata).equalTo(record::getSenddata);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.101+08:00", comments="Source Table: M_SendData")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(MSenddata record) {
        return UpdateDSL.updateWithMapper(this::update, MSenddata)
                .set(devcnum).equalToWhenPresent(record::getDevcnum)
                .set(insedate).equalToWhenPresent(record::getInsedate)
                .set(senddata).equalToWhenPresent(record::getSenddata);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.101+08:00", comments="Source Table: M_SendData")
    default int updateByPrimaryKey(MSenddata record) {
        return UpdateDSL.updateWithMapper(this::update, MSenddata)
                .set(devcnum).equalTo(record::getDevcnum)
                .set(insedate).equalTo(record::getInsedate)
                .set(senddata).equalTo(record::getSenddata)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.101+08:00", comments="Source Table: M_SendData")
    default int updateByPrimaryKeySelective(MSenddata record) {
        return UpdateDSL.updateWithMapper(this::update, MSenddata)
                .set(devcnum).equalToWhenPresent(record::getDevcnum)
                .set(insedate).equalToWhenPresent(record::getInsedate)
                .set(senddata).equalToWhenPresent(record::getSenddata)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}