package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.DtLdtimesDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.DtLdtimes;
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
public interface DtLdtimesDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.428+08:00", comments="Source Table: Dt_ldTimes")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.428+08:00", comments="Source Table: Dt_ldTimes")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.428+08:00", comments="Source Table: Dt_ldTimes")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<DtLdtimes> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.428+08:00", comments="Source Table: Dt_ldTimes")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("DtLdtimesResult")
    DtLdtimes selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.428+08:00", comments="Source Table: Dt_ldTimes")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="DtLdtimesResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="DevcNo", property="devcno", jdbcType=JdbcType.INTEGER),
        @Result(column="times", property="times", jdbcType=JdbcType.VARCHAR)
    })
    List<DtLdtimes> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.428+08:00", comments="Source Table: Dt_ldTimes")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.428+08:00", comments="Source Table: Dt_ldTimes")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(dtLdtimes);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.428+08:00", comments="Source Table: Dt_ldTimes")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, dtLdtimes);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.428+08:00", comments="Source Table: Dt_ldTimes")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, dtLdtimes)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.429+08:00", comments="Source Table: Dt_ldTimes")
    default int insert(DtLdtimes record) {
        return insert(SqlBuilder.insert(record)
                .into(dtLdtimes)
                .map(devcno).toProperty("devcno")
                .map(times).toProperty("times")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.429+08:00", comments="Source Table: Dt_ldTimes")
    default int insertSelective(DtLdtimes record) {
        return insert(SqlBuilder.insert(record)
                .into(dtLdtimes)
                .map(devcno).toPropertyWhenPresent("devcno", record::getDevcno)
                .map(times).toPropertyWhenPresent("times", record::getTimes)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.429+08:00", comments="Source Table: Dt_ldTimes")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<DtLdtimes>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, devcno, times)
                .from(dtLdtimes);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.429+08:00", comments="Source Table: Dt_ldTimes")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<DtLdtimes>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, devcno, times)
                .from(dtLdtimes);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.429+08:00", comments="Source Table: Dt_ldTimes")
    default DtLdtimes selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, devcno, times)
                .from(dtLdtimes)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.429+08:00", comments="Source Table: Dt_ldTimes")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(DtLdtimes record) {
        return UpdateDSL.updateWithMapper(this::update, dtLdtimes)
                .set(devcno).equalTo(record::getDevcno)
                .set(times).equalTo(record::getTimes);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.429+08:00", comments="Source Table: Dt_ldTimes")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(DtLdtimes record) {
        return UpdateDSL.updateWithMapper(this::update, dtLdtimes)
                .set(devcno).equalToWhenPresent(record::getDevcno)
                .set(times).equalToWhenPresent(record::getTimes);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.429+08:00", comments="Source Table: Dt_ldTimes")
    default int updateByPrimaryKey(DtLdtimes record) {
        return UpdateDSL.updateWithMapper(this::update, dtLdtimes)
                .set(devcno).equalTo(record::getDevcno)
                .set(times).equalTo(record::getTimes)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.429+08:00", comments="Source Table: Dt_ldTimes")
    default int updateByPrimaryKeySelective(DtLdtimes record) {
        return UpdateDSL.updateWithMapper(this::update, dtLdtimes)
                .set(devcno).equalToWhenPresent(record::getDevcno)
                .set(times).equalToWhenPresent(record::getTimes)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}