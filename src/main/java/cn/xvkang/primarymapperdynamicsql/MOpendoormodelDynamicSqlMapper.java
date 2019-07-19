package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MOpendoormodelDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.MOpendoormodel;
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
public interface MOpendoormodelDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.784+08:00", comments="Source Table: M_OpenDoorModel")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.784+08:00", comments="Source Table: M_OpenDoorModel")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.784+08:00", comments="Source Table: M_OpenDoorModel")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<MOpendoormodel> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.784+08:00", comments="Source Table: M_OpenDoorModel")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MOpendoormodelResult")
    MOpendoormodel selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.784+08:00", comments="Source Table: M_OpenDoorModel")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MOpendoormodelResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="devcnum", property="devcnum", jdbcType=JdbcType.INTEGER),
        @Result(column="OpenMode", property="openmode", jdbcType=JdbcType.INTEGER)
    })
    List<MOpendoormodel> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.784+08:00", comments="Source Table: M_OpenDoorModel")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.784+08:00", comments="Source Table: M_OpenDoorModel")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(MOpendoormodel);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.784+08:00", comments="Source Table: M_OpenDoorModel")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, MOpendoormodel);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.784+08:00", comments="Source Table: M_OpenDoorModel")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, MOpendoormodel)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.785+08:00", comments="Source Table: M_OpenDoorModel")
    default int insert(MOpendoormodel record) {
        return insert(SqlBuilder.insert(record)
                .into(MOpendoormodel)
                .map(devcnum).toProperty("devcnum")
                .map(openmode).toProperty("openmode")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.785+08:00", comments="Source Table: M_OpenDoorModel")
    default int insertSelective(MOpendoormodel record) {
        return insert(SqlBuilder.insert(record)
                .into(MOpendoormodel)
                .map(devcnum).toPropertyWhenPresent("devcnum", record::getDevcnum)
                .map(openmode).toPropertyWhenPresent("openmode", record::getOpenmode)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.785+08:00", comments="Source Table: M_OpenDoorModel")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<MOpendoormodel>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, devcnum, openmode)
                .from(MOpendoormodel);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.785+08:00", comments="Source Table: M_OpenDoorModel")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<MOpendoormodel>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, devcnum, openmode)
                .from(MOpendoormodel);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.785+08:00", comments="Source Table: M_OpenDoorModel")
    default MOpendoormodel selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, devcnum, openmode)
                .from(MOpendoormodel)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.785+08:00", comments="Source Table: M_OpenDoorModel")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(MOpendoormodel record) {
        return UpdateDSL.updateWithMapper(this::update, MOpendoormodel)
                .set(devcnum).equalTo(record::getDevcnum)
                .set(openmode).equalTo(record::getOpenmode);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.785+08:00", comments="Source Table: M_OpenDoorModel")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(MOpendoormodel record) {
        return UpdateDSL.updateWithMapper(this::update, MOpendoormodel)
                .set(devcnum).equalToWhenPresent(record::getDevcnum)
                .set(openmode).equalToWhenPresent(record::getOpenmode);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.785+08:00", comments="Source Table: M_OpenDoorModel")
    default int updateByPrimaryKey(MOpendoormodel record) {
        return UpdateDSL.updateWithMapper(this::update, MOpendoormodel)
                .set(devcnum).equalTo(record::getDevcnum)
                .set(openmode).equalTo(record::getOpenmode)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.785+08:00", comments="Source Table: M_OpenDoorModel")
    default int updateByPrimaryKeySelective(MOpendoormodel record) {
        return UpdateDSL.updateWithMapper(this::update, MOpendoormodel)
                .set(devcnum).equalToWhenPresent(record::getDevcnum)
                .set(openmode).equalToWhenPresent(record::getOpenmode)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}