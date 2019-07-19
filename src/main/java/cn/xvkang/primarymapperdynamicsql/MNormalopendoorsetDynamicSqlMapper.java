package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MNormalopendoorsetDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.MNormalopendoorset;
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
public interface MNormalopendoorsetDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.783+08:00", comments="Source Table: M_NormalOpenDoorSet")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.783+08:00", comments="Source Table: M_NormalOpenDoorSet")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.783+08:00", comments="Source Table: M_NormalOpenDoorSet")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<MNormalopendoorset> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.784+08:00", comments="Source Table: M_NormalOpenDoorSet")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MNormalopendoorsetResult")
    MNormalopendoorset selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.784+08:00", comments="Source Table: M_NormalOpenDoorSet")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MNormalopendoorsetResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="DevcNum", property="devcnum", jdbcType=JdbcType.INTEGER),
        @Result(column="DoorLeiBie", property="doorleibie", jdbcType=JdbcType.INTEGER),
        @Result(column="NorMalSet", property="normalset", jdbcType=JdbcType.INTEGER),
        @Result(column="stat1", property="stat1", jdbcType=JdbcType.VARCHAR),
        @Result(column="End1", property="end1", jdbcType=JdbcType.VARCHAR),
        @Result(column="stat2", property="stat2", jdbcType=JdbcType.VARCHAR),
        @Result(column="End2", property="end2", jdbcType=JdbcType.VARCHAR),
        @Result(column="stat3", property="stat3", jdbcType=JdbcType.VARCHAR),
        @Result(column="End3", property="end3", jdbcType=JdbcType.VARCHAR),
        @Result(column="stat4", property="stat4", jdbcType=JdbcType.VARCHAR),
        @Result(column="End4", property="end4", jdbcType=JdbcType.VARCHAR)
    })
    List<MNormalopendoorset> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.784+08:00", comments="Source Table: M_NormalOpenDoorSet")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.784+08:00", comments="Source Table: M_NormalOpenDoorSet")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(MNormalopendoorset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.784+08:00", comments="Source Table: M_NormalOpenDoorSet")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, MNormalopendoorset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.784+08:00", comments="Source Table: M_NormalOpenDoorSet")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, MNormalopendoorset)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.784+08:00", comments="Source Table: M_NormalOpenDoorSet")
    default int insert(MNormalopendoorset record) {
        return insert(SqlBuilder.insert(record)
                .into(MNormalopendoorset)
                .map(devcnum).toProperty("devcnum")
                .map(doorleibie).toProperty("doorleibie")
                .map(normalset).toProperty("normalset")
                .map(stat1).toProperty("stat1")
                .map(end1).toProperty("end1")
                .map(stat2).toProperty("stat2")
                .map(end2).toProperty("end2")
                .map(stat3).toProperty("stat3")
                .map(end3).toProperty("end3")
                .map(stat4).toProperty("stat4")
                .map(end4).toProperty("end4")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.784+08:00", comments="Source Table: M_NormalOpenDoorSet")
    default int insertSelective(MNormalopendoorset record) {
        return insert(SqlBuilder.insert(record)
                .into(MNormalopendoorset)
                .map(devcnum).toPropertyWhenPresent("devcnum", record::getDevcnum)
                .map(doorleibie).toPropertyWhenPresent("doorleibie", record::getDoorleibie)
                .map(normalset).toPropertyWhenPresent("normalset", record::getNormalset)
                .map(stat1).toPropertyWhenPresent("stat1", record::getStat1)
                .map(end1).toPropertyWhenPresent("end1", record::getEnd1)
                .map(stat2).toPropertyWhenPresent("stat2", record::getStat2)
                .map(end2).toPropertyWhenPresent("end2", record::getEnd2)
                .map(stat3).toPropertyWhenPresent("stat3", record::getStat3)
                .map(end3).toPropertyWhenPresent("end3", record::getEnd3)
                .map(stat4).toPropertyWhenPresent("stat4", record::getStat4)
                .map(end4).toPropertyWhenPresent("end4", record::getEnd4)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.784+08:00", comments="Source Table: M_NormalOpenDoorSet")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<MNormalopendoorset>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, devcnum, doorleibie, normalset, stat1, end1, stat2, end2, stat3, end3, stat4, end4)
                .from(MNormalopendoorset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.784+08:00", comments="Source Table: M_NormalOpenDoorSet")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<MNormalopendoorset>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, devcnum, doorleibie, normalset, stat1, end1, stat2, end2, stat3, end3, stat4, end4)
                .from(MNormalopendoorset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.784+08:00", comments="Source Table: M_NormalOpenDoorSet")
    default MNormalopendoorset selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, devcnum, doorleibie, normalset, stat1, end1, stat2, end2, stat3, end3, stat4, end4)
                .from(MNormalopendoorset)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.784+08:00", comments="Source Table: M_NormalOpenDoorSet")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(MNormalopendoorset record) {
        return UpdateDSL.updateWithMapper(this::update, MNormalopendoorset)
                .set(devcnum).equalTo(record::getDevcnum)
                .set(doorleibie).equalTo(record::getDoorleibie)
                .set(normalset).equalTo(record::getNormalset)
                .set(stat1).equalTo(record::getStat1)
                .set(end1).equalTo(record::getEnd1)
                .set(stat2).equalTo(record::getStat2)
                .set(end2).equalTo(record::getEnd2)
                .set(stat3).equalTo(record::getStat3)
                .set(end3).equalTo(record::getEnd3)
                .set(stat4).equalTo(record::getStat4)
                .set(end4).equalTo(record::getEnd4);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.784+08:00", comments="Source Table: M_NormalOpenDoorSet")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(MNormalopendoorset record) {
        return UpdateDSL.updateWithMapper(this::update, MNormalopendoorset)
                .set(devcnum).equalToWhenPresent(record::getDevcnum)
                .set(doorleibie).equalToWhenPresent(record::getDoorleibie)
                .set(normalset).equalToWhenPresent(record::getNormalset)
                .set(stat1).equalToWhenPresent(record::getStat1)
                .set(end1).equalToWhenPresent(record::getEnd1)
                .set(stat2).equalToWhenPresent(record::getStat2)
                .set(end2).equalToWhenPresent(record::getEnd2)
                .set(stat3).equalToWhenPresent(record::getStat3)
                .set(end3).equalToWhenPresent(record::getEnd3)
                .set(stat4).equalToWhenPresent(record::getStat4)
                .set(end4).equalToWhenPresent(record::getEnd4);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.784+08:00", comments="Source Table: M_NormalOpenDoorSet")
    default int updateByPrimaryKey(MNormalopendoorset record) {
        return UpdateDSL.updateWithMapper(this::update, MNormalopendoorset)
                .set(devcnum).equalTo(record::getDevcnum)
                .set(doorleibie).equalTo(record::getDoorleibie)
                .set(normalset).equalTo(record::getNormalset)
                .set(stat1).equalTo(record::getStat1)
                .set(end1).equalTo(record::getEnd1)
                .set(stat2).equalTo(record::getStat2)
                .set(end2).equalTo(record::getEnd2)
                .set(stat3).equalTo(record::getStat3)
                .set(end3).equalTo(record::getEnd3)
                .set(stat4).equalTo(record::getStat4)
                .set(end4).equalTo(record::getEnd4)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.784+08:00", comments="Source Table: M_NormalOpenDoorSet")
    default int updateByPrimaryKeySelective(MNormalopendoorset record) {
        return UpdateDSL.updateWithMapper(this::update, MNormalopendoorset)
                .set(devcnum).equalToWhenPresent(record::getDevcnum)
                .set(doorleibie).equalToWhenPresent(record::getDoorleibie)
                .set(normalset).equalToWhenPresent(record::getNormalset)
                .set(stat1).equalToWhenPresent(record::getStat1)
                .set(end1).equalToWhenPresent(record::getEnd1)
                .set(stat2).equalToWhenPresent(record::getStat2)
                .set(end2).equalToWhenPresent(record::getEnd2)
                .set(stat3).equalToWhenPresent(record::getStat3)
                .set(end3).equalToWhenPresent(record::getEnd3)
                .set(stat4).equalToWhenPresent(record::getStat4)
                .set(end4).equalToWhenPresent(record::getEnd4)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}