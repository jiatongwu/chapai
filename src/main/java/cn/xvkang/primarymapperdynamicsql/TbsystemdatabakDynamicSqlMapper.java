package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.TbsystemdatabakDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.Tbsystemdatabak;
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
public interface TbsystemdatabakDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.959+08:00", comments="Source Table: tbSystemDataBak")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.959+08:00", comments="Source Table: tbSystemDataBak")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.959+08:00", comments="Source Table: tbSystemDataBak")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<Tbsystemdatabak> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.959+08:00", comments="Source Table: tbSystemDataBak")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("TbsystemdatabakResult")
    Tbsystemdatabak selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.959+08:00", comments="Source Table: tbSystemDataBak")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="TbsystemdatabakResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="IsEnld", property="isenld", jdbcType=JdbcType.BIT),
        @Result(column="LoadRoute", property="loadroute", jdbcType=JdbcType.VARCHAR),
        @Result(column="BakTime", property="baktime", jdbcType=JdbcType.VARCHAR)
    })
    List<Tbsystemdatabak> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.959+08:00", comments="Source Table: tbSystemDataBak")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.959+08:00", comments="Source Table: tbSystemDataBak")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(tbsystemdatabak);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.959+08:00", comments="Source Table: tbSystemDataBak")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, tbsystemdatabak);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.959+08:00", comments="Source Table: tbSystemDataBak")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, tbsystemdatabak)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.960+08:00", comments="Source Table: tbSystemDataBak")
    default int insert(Tbsystemdatabak record) {
        return insert(SqlBuilder.insert(record)
                .into(tbsystemdatabak)
                .map(isenld).toProperty("isenld")
                .map(loadroute).toProperty("loadroute")
                .map(baktime).toProperty("baktime")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.960+08:00", comments="Source Table: tbSystemDataBak")
    default int insertSelective(Tbsystemdatabak record) {
        return insert(SqlBuilder.insert(record)
                .into(tbsystemdatabak)
                .map(isenld).toPropertyWhenPresent("isenld", record::getIsenld)
                .map(loadroute).toPropertyWhenPresent("loadroute", record::getLoadroute)
                .map(baktime).toPropertyWhenPresent("baktime", record::getBaktime)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.960+08:00", comments="Source Table: tbSystemDataBak")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Tbsystemdatabak>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, isenld, loadroute, baktime)
                .from(tbsystemdatabak);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.960+08:00", comments="Source Table: tbSystemDataBak")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Tbsystemdatabak>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, isenld, loadroute, baktime)
                .from(tbsystemdatabak);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.960+08:00", comments="Source Table: tbSystemDataBak")
    default Tbsystemdatabak selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, isenld, loadroute, baktime)
                .from(tbsystemdatabak)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.960+08:00", comments="Source Table: tbSystemDataBak")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Tbsystemdatabak record) {
        return UpdateDSL.updateWithMapper(this::update, tbsystemdatabak)
                .set(isenld).equalTo(record::getIsenld)
                .set(loadroute).equalTo(record::getLoadroute)
                .set(baktime).equalTo(record::getBaktime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.960+08:00", comments="Source Table: tbSystemDataBak")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Tbsystemdatabak record) {
        return UpdateDSL.updateWithMapper(this::update, tbsystemdatabak)
                .set(isenld).equalToWhenPresent(record::getIsenld)
                .set(loadroute).equalToWhenPresent(record::getLoadroute)
                .set(baktime).equalToWhenPresent(record::getBaktime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.960+08:00", comments="Source Table: tbSystemDataBak")
    default int updateByPrimaryKey(Tbsystemdatabak record) {
        return UpdateDSL.updateWithMapper(this::update, tbsystemdatabak)
                .set(isenld).equalTo(record::getIsenld)
                .set(loadroute).equalTo(record::getLoadroute)
                .set(baktime).equalTo(record::getBaktime)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.960+08:00", comments="Source Table: tbSystemDataBak")
    default int updateByPrimaryKeySelective(Tbsystemdatabak record) {
        return UpdateDSL.updateWithMapper(this::update, tbsystemdatabak)
                .set(isenld).equalToWhenPresent(record::getIsenld)
                .set(loadroute).equalToWhenPresent(record::getLoadroute)
                .set(baktime).equalToWhenPresent(record::getBaktime)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}