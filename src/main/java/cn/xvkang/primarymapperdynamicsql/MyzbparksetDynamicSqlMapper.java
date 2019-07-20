package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MyzbparksetDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.Myzbparkset;
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
public interface MyzbparksetDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.350+08:00", comments="Source Table: MYZBPARKSet")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.350+08:00", comments="Source Table: MYZBPARKSet")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.350+08:00", comments="Source Table: MYZBPARKSet")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<Myzbparkset> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.351+08:00", comments="Source Table: MYZBPARKSet")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MyzbparksetResult")
    Myzbparkset selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.351+08:00", comments="Source Table: MYZBPARKSet")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MyzbparksetResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="Address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="Favorable", property="favorable", jdbcType=JdbcType.DECIMAL),
        @Result(column="Manner", property="manner", jdbcType=JdbcType.VARCHAR),
        @Result(column="OutHour", property="outhour", jdbcType=JdbcType.DECIMAL),
        @Result(column="OutDayNo", property="outdayno", jdbcType=JdbcType.DECIMAL),
        @Result(column="PCName", property="pcname", jdbcType=JdbcType.VARCHAR)
    })
    List<Myzbparkset> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.351+08:00", comments="Source Table: MYZBPARKSet")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.351+08:00", comments="Source Table: MYZBPARKSet")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(myzbparkset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.351+08:00", comments="Source Table: MYZBPARKSet")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, myzbparkset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.351+08:00", comments="Source Table: MYZBPARKSet")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, myzbparkset)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.351+08:00", comments="Source Table: MYZBPARKSet")
    default int insert(Myzbparkset record) {
        return insert(SqlBuilder.insert(record)
                .into(myzbparkset)
                .map(address).toProperty("address")
                .map(favorable).toProperty("favorable")
                .map(manner).toProperty("manner")
                .map(outhour).toProperty("outhour")
                .map(outdayno).toProperty("outdayno")
                .map(pcname).toProperty("pcname")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.351+08:00", comments="Source Table: MYZBPARKSet")
    default int insertSelective(Myzbparkset record) {
        return insert(SqlBuilder.insert(record)
                .into(myzbparkset)
                .map(address).toPropertyWhenPresent("address", record::getAddress)
                .map(favorable).toPropertyWhenPresent("favorable", record::getFavorable)
                .map(manner).toPropertyWhenPresent("manner", record::getManner)
                .map(outhour).toPropertyWhenPresent("outhour", record::getOuthour)
                .map(outdayno).toPropertyWhenPresent("outdayno", record::getOutdayno)
                .map(pcname).toPropertyWhenPresent("pcname", record::getPcname)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.351+08:00", comments="Source Table: MYZBPARKSet")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myzbparkset>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, address, favorable, manner, outhour, outdayno, pcname)
                .from(myzbparkset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.352+08:00", comments="Source Table: MYZBPARKSet")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myzbparkset>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, address, favorable, manner, outhour, outdayno, pcname)
                .from(myzbparkset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.352+08:00", comments="Source Table: MYZBPARKSet")
    default Myzbparkset selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, address, favorable, manner, outhour, outdayno, pcname)
                .from(myzbparkset)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.352+08:00", comments="Source Table: MYZBPARKSet")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Myzbparkset record) {
        return UpdateDSL.updateWithMapper(this::update, myzbparkset)
                .set(address).equalTo(record::getAddress)
                .set(favorable).equalTo(record::getFavorable)
                .set(manner).equalTo(record::getManner)
                .set(outhour).equalTo(record::getOuthour)
                .set(outdayno).equalTo(record::getOutdayno)
                .set(pcname).equalTo(record::getPcname);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.352+08:00", comments="Source Table: MYZBPARKSet")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Myzbparkset record) {
        return UpdateDSL.updateWithMapper(this::update, myzbparkset)
                .set(address).equalToWhenPresent(record::getAddress)
                .set(favorable).equalToWhenPresent(record::getFavorable)
                .set(manner).equalToWhenPresent(record::getManner)
                .set(outhour).equalToWhenPresent(record::getOuthour)
                .set(outdayno).equalToWhenPresent(record::getOutdayno)
                .set(pcname).equalToWhenPresent(record::getPcname);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.352+08:00", comments="Source Table: MYZBPARKSet")
    default int updateByPrimaryKey(Myzbparkset record) {
        return UpdateDSL.updateWithMapper(this::update, myzbparkset)
                .set(address).equalTo(record::getAddress)
                .set(favorable).equalTo(record::getFavorable)
                .set(manner).equalTo(record::getManner)
                .set(outhour).equalTo(record::getOuthour)
                .set(outdayno).equalTo(record::getOutdayno)
                .set(pcname).equalTo(record::getPcname)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.352+08:00", comments="Source Table: MYZBPARKSet")
    default int updateByPrimaryKeySelective(Myzbparkset record) {
        return UpdateDSL.updateWithMapper(this::update, myzbparkset)
                .set(address).equalToWhenPresent(record::getAddress)
                .set(favorable).equalToWhenPresent(record::getFavorable)
                .set(manner).equalToWhenPresent(record::getManner)
                .set(outhour).equalToWhenPresent(record::getOuthour)
                .set(outdayno).equalToWhenPresent(record::getOutdayno)
                .set(pcname).equalToWhenPresent(record::getPcname)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}