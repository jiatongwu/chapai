package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MytbmeishuosetDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.Mytbmeishuoset;
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
public interface MytbmeishuosetDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.810+08:00", comments="Source Table: MYTBMEISHUOSET")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.810+08:00", comments="Source Table: MYTBMEISHUOSET")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.810+08:00", comments="Source Table: MYTBMEISHUOSET")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.ctrlnumber", before=true, resultType=Integer.class)
    int insert(InsertStatementProvider<Mytbmeishuoset> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.810+08:00", comments="Source Table: MYTBMEISHUOSET")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MytbmeishuosetResult")
    Mytbmeishuoset selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.810+08:00", comments="Source Table: MYTBMEISHUOSET")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MytbmeishuosetResult", value = {
        @Result(column="CtrlNumber", property="ctrlnumber", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="LockLocation", property="locklocation", jdbcType=JdbcType.VARCHAR),
        @Result(column="DeptName", property="deptname", jdbcType=JdbcType.VARCHAR),
        @Result(column="DoorID", property="doorid", jdbcType=JdbcType.VARCHAR),
        @Result(column="PCName", property="pcname", jdbcType=JdbcType.VARCHAR),
        @Result(column="ProduceIndex", property="produceindex", jdbcType=JdbcType.VARCHAR),
        @Result(column="CtrlType", property="ctrltype", jdbcType=JdbcType.VARCHAR)
    })
    List<Mytbmeishuoset> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.810+08:00", comments="Source Table: MYTBMEISHUOSET")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.810+08:00", comments="Source Table: MYTBMEISHUOSET")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(mytbmeishuoset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.810+08:00", comments="Source Table: MYTBMEISHUOSET")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, mytbmeishuoset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.810+08:00", comments="Source Table: MYTBMEISHUOSET")
    default int deleteByPrimaryKey(Integer ctrlnumber_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, mytbmeishuoset)
                .where(ctrlnumber, isEqualTo(ctrlnumber_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.810+08:00", comments="Source Table: MYTBMEISHUOSET")
    default int insert(Mytbmeishuoset record) {
        return insert(SqlBuilder.insert(record)
                .into(mytbmeishuoset)
                .map(ctrlnumber).toProperty("ctrlnumber")
                .map(locklocation).toProperty("locklocation")
                .map(deptname).toProperty("deptname")
                .map(doorid).toProperty("doorid")
                .map(pcname).toProperty("pcname")
                .map(produceindex).toProperty("produceindex")
                .map(ctrltype).toProperty("ctrltype")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.810+08:00", comments="Source Table: MYTBMEISHUOSET")
    default int insertSelective(Mytbmeishuoset record) {
        return insert(SqlBuilder.insert(record)
                .into(mytbmeishuoset)
                .map(ctrlnumber).toProperty("ctrlnumber")
                .map(locklocation).toPropertyWhenPresent("locklocation", record::getLocklocation)
                .map(deptname).toPropertyWhenPresent("deptname", record::getDeptname)
                .map(doorid).toPropertyWhenPresent("doorid", record::getDoorid)
                .map(pcname).toPropertyWhenPresent("pcname", record::getPcname)
                .map(produceindex).toPropertyWhenPresent("produceindex", record::getProduceindex)
                .map(ctrltype).toPropertyWhenPresent("ctrltype", record::getCtrltype)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.810+08:00", comments="Source Table: MYTBMEISHUOSET")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Mytbmeishuoset>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, ctrlnumber, locklocation, deptname, doorid, pcname, produceindex, ctrltype)
                .from(mytbmeishuoset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.810+08:00", comments="Source Table: MYTBMEISHUOSET")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Mytbmeishuoset>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, ctrlnumber, locklocation, deptname, doorid, pcname, produceindex, ctrltype)
                .from(mytbmeishuoset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.810+08:00", comments="Source Table: MYTBMEISHUOSET")
    default Mytbmeishuoset selectByPrimaryKey(Integer ctrlnumber_) {
        return SelectDSL.selectWithMapper(this::selectOne, ctrlnumber, locklocation, deptname, doorid, pcname, produceindex, ctrltype)
                .from(mytbmeishuoset)
                .where(ctrlnumber, isEqualTo(ctrlnumber_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.810+08:00", comments="Source Table: MYTBMEISHUOSET")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Mytbmeishuoset record) {
        return UpdateDSL.updateWithMapper(this::update, mytbmeishuoset)
                .set(ctrlnumber).equalTo(record::getCtrlnumber)
                .set(locklocation).equalTo(record::getLocklocation)
                .set(deptname).equalTo(record::getDeptname)
                .set(doorid).equalTo(record::getDoorid)
                .set(pcname).equalTo(record::getPcname)
                .set(produceindex).equalTo(record::getProduceindex)
                .set(ctrltype).equalTo(record::getCtrltype);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.810+08:00", comments="Source Table: MYTBMEISHUOSET")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Mytbmeishuoset record) {
        return UpdateDSL.updateWithMapper(this::update, mytbmeishuoset)
                .set(ctrlnumber).equalToWhenPresent(record::getCtrlnumber)
                .set(locklocation).equalToWhenPresent(record::getLocklocation)
                .set(deptname).equalToWhenPresent(record::getDeptname)
                .set(doorid).equalToWhenPresent(record::getDoorid)
                .set(pcname).equalToWhenPresent(record::getPcname)
                .set(produceindex).equalToWhenPresent(record::getProduceindex)
                .set(ctrltype).equalToWhenPresent(record::getCtrltype);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.810+08:00", comments="Source Table: MYTBMEISHUOSET")
    default int updateByPrimaryKey(Mytbmeishuoset record) {
        return UpdateDSL.updateWithMapper(this::update, mytbmeishuoset)
                .set(locklocation).equalTo(record::getLocklocation)
                .set(deptname).equalTo(record::getDeptname)
                .set(doorid).equalTo(record::getDoorid)
                .set(pcname).equalTo(record::getPcname)
                .set(produceindex).equalTo(record::getProduceindex)
                .set(ctrltype).equalTo(record::getCtrltype)
                .where(ctrlnumber, isEqualTo(record::getCtrlnumber))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.810+08:00", comments="Source Table: MYTBMEISHUOSET")
    default int updateByPrimaryKeySelective(Mytbmeishuoset record) {
        return UpdateDSL.updateWithMapper(this::update, mytbmeishuoset)
                .set(locklocation).equalToWhenPresent(record::getLocklocation)
                .set(deptname).equalToWhenPresent(record::getDeptname)
                .set(doorid).equalToWhenPresent(record::getDoorid)
                .set(pcname).equalToWhenPresent(record::getPcname)
                .set(produceindex).equalToWhenPresent(record::getProduceindex)
                .set(ctrltype).equalToWhenPresent(record::getCtrltype)
                .where(ctrlnumber, isEqualTo(record::getCtrlnumber))
                .build()
                .execute();
    }
}