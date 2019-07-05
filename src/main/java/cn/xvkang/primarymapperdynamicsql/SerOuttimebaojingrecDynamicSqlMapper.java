package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.SerOuttimebaojingrecDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.SerOuttimebaojingrec;
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
public interface SerOuttimebaojingrecDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.855+08:00", comments="Source Table: Ser_OutTimeBaoJingRec")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.855+08:00", comments="Source Table: Ser_OutTimeBaoJingRec")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.855+08:00", comments="Source Table: Ser_OutTimeBaoJingRec")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<SerOuttimebaojingrec> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.855+08:00", comments="Source Table: Ser_OutTimeBaoJingRec")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SerOuttimebaojingrecResult")
    SerOuttimebaojingrec selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.855+08:00", comments="Source Table: Ser_OutTimeBaoJingRec")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SerOuttimebaojingrecResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="DevcNum", property="devcnum", jdbcType=JdbcType.INTEGER),
        @Result(column="Baojin", property="baojin", jdbcType=JdbcType.VARCHAR)
    })
    List<SerOuttimebaojingrec> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.855+08:00", comments="Source Table: Ser_OutTimeBaoJingRec")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.855+08:00", comments="Source Table: Ser_OutTimeBaoJingRec")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(serOuttimebaojingrec);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.855+08:00", comments="Source Table: Ser_OutTimeBaoJingRec")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, serOuttimebaojingrec);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.855+08:00", comments="Source Table: Ser_OutTimeBaoJingRec")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, serOuttimebaojingrec)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.855+08:00", comments="Source Table: Ser_OutTimeBaoJingRec")
    default int insert(SerOuttimebaojingrec record) {
        return insert(SqlBuilder.insert(record)
                .into(serOuttimebaojingrec)
                .map(devcnum).toProperty("devcnum")
                .map(baojin).toProperty("baojin")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.855+08:00", comments="Source Table: Ser_OutTimeBaoJingRec")
    default int insertSelective(SerOuttimebaojingrec record) {
        return insert(SqlBuilder.insert(record)
                .into(serOuttimebaojingrec)
                .map(devcnum).toPropertyWhenPresent("devcnum", record::getDevcnum)
                .map(baojin).toPropertyWhenPresent("baojin", record::getBaojin)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.855+08:00", comments="Source Table: Ser_OutTimeBaoJingRec")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<SerOuttimebaojingrec>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, devcnum, baojin)
                .from(serOuttimebaojingrec);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.855+08:00", comments="Source Table: Ser_OutTimeBaoJingRec")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<SerOuttimebaojingrec>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, devcnum, baojin)
                .from(serOuttimebaojingrec);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.855+08:00", comments="Source Table: Ser_OutTimeBaoJingRec")
    default SerOuttimebaojingrec selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, devcnum, baojin)
                .from(serOuttimebaojingrec)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.855+08:00", comments="Source Table: Ser_OutTimeBaoJingRec")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(SerOuttimebaojingrec record) {
        return UpdateDSL.updateWithMapper(this::update, serOuttimebaojingrec)
                .set(devcnum).equalTo(record::getDevcnum)
                .set(baojin).equalTo(record::getBaojin);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.855+08:00", comments="Source Table: Ser_OutTimeBaoJingRec")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(SerOuttimebaojingrec record) {
        return UpdateDSL.updateWithMapper(this::update, serOuttimebaojingrec)
                .set(devcnum).equalToWhenPresent(record::getDevcnum)
                .set(baojin).equalToWhenPresent(record::getBaojin);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.855+08:00", comments="Source Table: Ser_OutTimeBaoJingRec")
    default int updateByPrimaryKey(SerOuttimebaojingrec record) {
        return UpdateDSL.updateWithMapper(this::update, serOuttimebaojingrec)
                .set(devcnum).equalTo(record::getDevcnum)
                .set(baojin).equalTo(record::getBaojin)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.855+08:00", comments="Source Table: Ser_OutTimeBaoJingRec")
    default int updateByPrimaryKeySelective(SerOuttimebaojingrec record) {
        return UpdateDSL.updateWithMapper(this::update, serOuttimebaojingrec)
                .set(devcnum).equalToWhenPresent(record::getDevcnum)
                .set(baojin).equalToWhenPresent(record::getBaojin)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}