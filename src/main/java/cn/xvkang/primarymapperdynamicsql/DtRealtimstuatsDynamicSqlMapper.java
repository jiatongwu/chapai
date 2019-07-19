package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.DtRealtimstuatsDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.DtRealtimstuats;
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
public interface DtRealtimstuatsDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.572+08:00", comments="Source Table: Dt_RealTimStuats")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.572+08:00", comments="Source Table: Dt_RealTimStuats")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.572+08:00", comments="Source Table: Dt_RealTimStuats")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<DtRealtimstuats> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.572+08:00", comments="Source Table: Dt_RealTimStuats")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("DtRealtimstuatsResult")
    DtRealtimstuats selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.572+08:00", comments="Source Table: Dt_RealTimStuats")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="DtRealtimstuatsResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="DevcName", property="devcname", jdbcType=JdbcType.VARCHAR)
    })
    List<DtRealtimstuats> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.572+08:00", comments="Source Table: Dt_RealTimStuats")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.572+08:00", comments="Source Table: Dt_RealTimStuats")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(dtRealtimstuats);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.572+08:00", comments="Source Table: Dt_RealTimStuats")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, dtRealtimstuats);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.572+08:00", comments="Source Table: Dt_RealTimStuats")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, dtRealtimstuats)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.572+08:00", comments="Source Table: Dt_RealTimStuats")
    default int insert(DtRealtimstuats record) {
        return insert(SqlBuilder.insert(record)
                .into(dtRealtimstuats)
                .map(devcname).toProperty("devcname")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.572+08:00", comments="Source Table: Dt_RealTimStuats")
    default int insertSelective(DtRealtimstuats record) {
        return insert(SqlBuilder.insert(record)
                .into(dtRealtimstuats)
                .map(devcname).toPropertyWhenPresent("devcname", record::getDevcname)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.573+08:00", comments="Source Table: Dt_RealTimStuats")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<DtRealtimstuats>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, devcname)
                .from(dtRealtimstuats);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.573+08:00", comments="Source Table: Dt_RealTimStuats")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<DtRealtimstuats>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, devcname)
                .from(dtRealtimstuats);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.573+08:00", comments="Source Table: Dt_RealTimStuats")
    default DtRealtimstuats selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, devcname)
                .from(dtRealtimstuats)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.573+08:00", comments="Source Table: Dt_RealTimStuats")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(DtRealtimstuats record) {
        return UpdateDSL.updateWithMapper(this::update, dtRealtimstuats)
                .set(devcname).equalTo(record::getDevcname);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.573+08:00", comments="Source Table: Dt_RealTimStuats")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(DtRealtimstuats record) {
        return UpdateDSL.updateWithMapper(this::update, dtRealtimstuats)
                .set(devcname).equalToWhenPresent(record::getDevcname);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.573+08:00", comments="Source Table: Dt_RealTimStuats")
    default int updateByPrimaryKey(DtRealtimstuats record) {
        return UpdateDSL.updateWithMapper(this::update, dtRealtimstuats)
                .set(devcname).equalTo(record::getDevcname)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.573+08:00", comments="Source Table: Dt_RealTimStuats")
    default int updateByPrimaryKeySelective(DtRealtimstuats record) {
        return UpdateDSL.updateWithMapper(this::update, dtRealtimstuats)
                .set(devcname).equalToWhenPresent(record::getDevcname)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}