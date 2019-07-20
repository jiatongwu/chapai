package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MybumensetDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.Mybumenset;
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
public interface MybumensetDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.155+08:00", comments="Source Table: MYBUMENSET")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.155+08:00", comments="Source Table: MYBUMENSET")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.155+08:00", comments="Source Table: MYBUMENSET")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<Mybumenset> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.155+08:00", comments="Source Table: MYBUMENSET")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MybumensetResult")
    Mybumenset selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.155+08:00", comments="Source Table: MYBUMENSET")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MybumensetResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="DeptNO", property="deptno", jdbcType=JdbcType.VARCHAR),
        @Result(column="DeptName", property="deptname", jdbcType=JdbcType.VARCHAR),
        @Result(column="DeptSymbol", property="deptsymbol", jdbcType=JdbcType.VARCHAR),
        @Result(column="PID", property="pid", jdbcType=JdbcType.INTEGER)
    })
    List<Mybumenset> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.155+08:00", comments="Source Table: MYBUMENSET")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.155+08:00", comments="Source Table: MYBUMENSET")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(mybumenset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.155+08:00", comments="Source Table: MYBUMENSET")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, mybumenset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.155+08:00", comments="Source Table: MYBUMENSET")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, mybumenset)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.155+08:00", comments="Source Table: MYBUMENSET")
    default int insert(Mybumenset record) {
        return insert(SqlBuilder.insert(record)
                .into(mybumenset)
                .map(deptno).toProperty("deptno")
                .map(deptname).toProperty("deptname")
                .map(deptsymbol).toProperty("deptsymbol")
                .map(pid).toProperty("pid")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.155+08:00", comments="Source Table: MYBUMENSET")
    default int insertSelective(Mybumenset record) {
        return insert(SqlBuilder.insert(record)
                .into(mybumenset)
                .map(deptno).toPropertyWhenPresent("deptno", record::getDeptno)
                .map(deptname).toPropertyWhenPresent("deptname", record::getDeptname)
                .map(deptsymbol).toPropertyWhenPresent("deptsymbol", record::getDeptsymbol)
                .map(pid).toPropertyWhenPresent("pid", record::getPid)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.155+08:00", comments="Source Table: MYBUMENSET")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Mybumenset>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, deptno, deptname, deptsymbol, pid)
                .from(mybumenset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.155+08:00", comments="Source Table: MYBUMENSET")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Mybumenset>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, deptno, deptname, deptsymbol, pid)
                .from(mybumenset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.155+08:00", comments="Source Table: MYBUMENSET")
    default Mybumenset selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, deptno, deptname, deptsymbol, pid)
                .from(mybumenset)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.156+08:00", comments="Source Table: MYBUMENSET")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Mybumenset record) {
        return UpdateDSL.updateWithMapper(this::update, mybumenset)
                .set(deptno).equalTo(record::getDeptno)
                .set(deptname).equalTo(record::getDeptname)
                .set(deptsymbol).equalTo(record::getDeptsymbol)
                .set(pid).equalTo(record::getPid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.156+08:00", comments="Source Table: MYBUMENSET")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Mybumenset record) {
        return UpdateDSL.updateWithMapper(this::update, mybumenset)
                .set(deptno).equalToWhenPresent(record::getDeptno)
                .set(deptname).equalToWhenPresent(record::getDeptname)
                .set(deptsymbol).equalToWhenPresent(record::getDeptsymbol)
                .set(pid).equalToWhenPresent(record::getPid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.156+08:00", comments="Source Table: MYBUMENSET")
    default int updateByPrimaryKey(Mybumenset record) {
        return UpdateDSL.updateWithMapper(this::update, mybumenset)
                .set(deptno).equalTo(record::getDeptno)
                .set(deptname).equalTo(record::getDeptname)
                .set(deptsymbol).equalTo(record::getDeptsymbol)
                .set(pid).equalTo(record::getPid)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.156+08:00", comments="Source Table: MYBUMENSET")
    default int updateByPrimaryKeySelective(Mybumenset record) {
        return UpdateDSL.updateWithMapper(this::update, mybumenset)
                .set(deptno).equalToWhenPresent(record::getDeptno)
                .set(deptname).equalToWhenPresent(record::getDeptname)
                .set(deptsymbol).equalToWhenPresent(record::getDeptsymbol)
                .set(pid).equalToWhenPresent(record::getPid)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}