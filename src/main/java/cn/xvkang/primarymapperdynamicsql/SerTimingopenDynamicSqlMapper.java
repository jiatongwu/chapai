package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.SerTimingopenDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.SerTimingopen;
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
public interface SerTimingopenDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.195+08:00", comments="Source Table: Ser_TimingOpen")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.195+08:00", comments="Source Table: Ser_TimingOpen")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.195+08:00", comments="Source Table: Ser_TimingOpen")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<SerTimingopen> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.195+08:00", comments="Source Table: Ser_TimingOpen")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SerTimingopenResult")
    SerTimingopen selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.195+08:00", comments="Source Table: Ser_TimingOpen")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SerTimingopenResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="DevcNum", property="devcnum", jdbcType=JdbcType.INTEGER),
        @Result(column="DoorId", property="doorid", jdbcType=JdbcType.INTEGER),
        @Result(column="NoMalSet", property="nomalset", jdbcType=JdbcType.INTEGER),
        @Result(column="Week", property="week", jdbcType=JdbcType.INTEGER),
        @Result(column="star1", property="star1", jdbcType=JdbcType.VARCHAR),
        @Result(column="end1", property="end1", jdbcType=JdbcType.VARCHAR),
        @Result(column="star2", property="star2", jdbcType=JdbcType.VARCHAR),
        @Result(column="end2", property="end2", jdbcType=JdbcType.VARCHAR),
        @Result(column="star3", property="star3", jdbcType=JdbcType.VARCHAR),
        @Result(column="end3", property="end3", jdbcType=JdbcType.VARCHAR),
        @Result(column="star4", property="star4", jdbcType=JdbcType.VARCHAR),
        @Result(column="end4", property="end4", jdbcType=JdbcType.VARCHAR)
    })
    List<SerTimingopen> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.195+08:00", comments="Source Table: Ser_TimingOpen")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.195+08:00", comments="Source Table: Ser_TimingOpen")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(serTimingopen);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.195+08:00", comments="Source Table: Ser_TimingOpen")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, serTimingopen);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.195+08:00", comments="Source Table: Ser_TimingOpen")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, serTimingopen)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.195+08:00", comments="Source Table: Ser_TimingOpen")
    default int insert(SerTimingopen record) {
        return insert(SqlBuilder.insert(record)
                .into(serTimingopen)
                .map(devcnum).toProperty("devcnum")
                .map(doorid).toProperty("doorid")
                .map(nomalset).toProperty("nomalset")
                .map(week).toProperty("week")
                .map(star1).toProperty("star1")
                .map(end1).toProperty("end1")
                .map(star2).toProperty("star2")
                .map(end2).toProperty("end2")
                .map(star3).toProperty("star3")
                .map(end3).toProperty("end3")
                .map(star4).toProperty("star4")
                .map(end4).toProperty("end4")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.196+08:00", comments="Source Table: Ser_TimingOpen")
    default int insertSelective(SerTimingopen record) {
        return insert(SqlBuilder.insert(record)
                .into(serTimingopen)
                .map(devcnum).toPropertyWhenPresent("devcnum", record::getDevcnum)
                .map(doorid).toPropertyWhenPresent("doorid", record::getDoorid)
                .map(nomalset).toPropertyWhenPresent("nomalset", record::getNomalset)
                .map(week).toPropertyWhenPresent("week", record::getWeek)
                .map(star1).toPropertyWhenPresent("star1", record::getStar1)
                .map(end1).toPropertyWhenPresent("end1", record::getEnd1)
                .map(star2).toPropertyWhenPresent("star2", record::getStar2)
                .map(end2).toPropertyWhenPresent("end2", record::getEnd2)
                .map(star3).toPropertyWhenPresent("star3", record::getStar3)
                .map(end3).toPropertyWhenPresent("end3", record::getEnd3)
                .map(star4).toPropertyWhenPresent("star4", record::getStar4)
                .map(end4).toPropertyWhenPresent("end4", record::getEnd4)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.196+08:00", comments="Source Table: Ser_TimingOpen")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<SerTimingopen>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, devcnum, doorid, nomalset, week, star1, end1, star2, end2, star3, end3, star4, end4)
                .from(serTimingopen);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.196+08:00", comments="Source Table: Ser_TimingOpen")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<SerTimingopen>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, devcnum, doorid, nomalset, week, star1, end1, star2, end2, star3, end3, star4, end4)
                .from(serTimingopen);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.196+08:00", comments="Source Table: Ser_TimingOpen")
    default SerTimingopen selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, devcnum, doorid, nomalset, week, star1, end1, star2, end2, star3, end3, star4, end4)
                .from(serTimingopen)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.196+08:00", comments="Source Table: Ser_TimingOpen")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(SerTimingopen record) {
        return UpdateDSL.updateWithMapper(this::update, serTimingopen)
                .set(devcnum).equalTo(record::getDevcnum)
                .set(doorid).equalTo(record::getDoorid)
                .set(nomalset).equalTo(record::getNomalset)
                .set(week).equalTo(record::getWeek)
                .set(star1).equalTo(record::getStar1)
                .set(end1).equalTo(record::getEnd1)
                .set(star2).equalTo(record::getStar2)
                .set(end2).equalTo(record::getEnd2)
                .set(star3).equalTo(record::getStar3)
                .set(end3).equalTo(record::getEnd3)
                .set(star4).equalTo(record::getStar4)
                .set(end4).equalTo(record::getEnd4);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.196+08:00", comments="Source Table: Ser_TimingOpen")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(SerTimingopen record) {
        return UpdateDSL.updateWithMapper(this::update, serTimingopen)
                .set(devcnum).equalToWhenPresent(record::getDevcnum)
                .set(doorid).equalToWhenPresent(record::getDoorid)
                .set(nomalset).equalToWhenPresent(record::getNomalset)
                .set(week).equalToWhenPresent(record::getWeek)
                .set(star1).equalToWhenPresent(record::getStar1)
                .set(end1).equalToWhenPresent(record::getEnd1)
                .set(star2).equalToWhenPresent(record::getStar2)
                .set(end2).equalToWhenPresent(record::getEnd2)
                .set(star3).equalToWhenPresent(record::getStar3)
                .set(end3).equalToWhenPresent(record::getEnd3)
                .set(star4).equalToWhenPresent(record::getStar4)
                .set(end4).equalToWhenPresent(record::getEnd4);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.196+08:00", comments="Source Table: Ser_TimingOpen")
    default int updateByPrimaryKey(SerTimingopen record) {
        return UpdateDSL.updateWithMapper(this::update, serTimingopen)
                .set(devcnum).equalTo(record::getDevcnum)
                .set(doorid).equalTo(record::getDoorid)
                .set(nomalset).equalTo(record::getNomalset)
                .set(week).equalTo(record::getWeek)
                .set(star1).equalTo(record::getStar1)
                .set(end1).equalTo(record::getEnd1)
                .set(star2).equalTo(record::getStar2)
                .set(end2).equalTo(record::getEnd2)
                .set(star3).equalTo(record::getStar3)
                .set(end3).equalTo(record::getEnd3)
                .set(star4).equalTo(record::getStar4)
                .set(end4).equalTo(record::getEnd4)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.196+08:00", comments="Source Table: Ser_TimingOpen")
    default int updateByPrimaryKeySelective(SerTimingopen record) {
        return UpdateDSL.updateWithMapper(this::update, serTimingopen)
                .set(devcnum).equalToWhenPresent(record::getDevcnum)
                .set(doorid).equalToWhenPresent(record::getDoorid)
                .set(nomalset).equalToWhenPresent(record::getNomalset)
                .set(week).equalToWhenPresent(record::getWeek)
                .set(star1).equalToWhenPresent(record::getStar1)
                .set(end1).equalToWhenPresent(record::getEnd1)
                .set(star2).equalToWhenPresent(record::getStar2)
                .set(end2).equalToWhenPresent(record::getEnd2)
                .set(star3).equalToWhenPresent(record::getStar3)
                .set(end3).equalToWhenPresent(record::getEnd3)
                .set(star4).equalToWhenPresent(record::getStar4)
                .set(end4).equalToWhenPresent(record::getEnd4)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}