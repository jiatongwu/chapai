package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MyparkinggreetingDynamicSqlSupport.*;

import cn.xvkang.primaryentity.Myparkinggreeting;
import java.util.List;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
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
public interface MyparkinggreetingDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.118+08:00", comments="Source Table: MyParkingGreeting")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.118+08:00", comments="Source Table: MyParkingGreeting")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.118+08:00", comments="Source Table: MyParkingGreeting")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Myparkinggreeting> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.118+08:00", comments="Source Table: MyParkingGreeting")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MyparkinggreetingResult", value = {
        @Result(column="CtrlNumber", property="ctrlnumber", jdbcType=JdbcType.INTEGER),
        @Result(column="Voice", property="voice", jdbcType=JdbcType.VARCHAR),
        @Result(column="StartTime", property="starttime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="EndTime", property="endtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="DredgeVoice", property="dredgevoice", jdbcType=JdbcType.BIT)
    })
    List<Myparkinggreeting> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.118+08:00", comments="Source Table: MyParkingGreeting")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.118+08:00", comments="Source Table: MyParkingGreeting")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(myparkinggreeting);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.118+08:00", comments="Source Table: MyParkingGreeting")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, myparkinggreeting);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.118+08:00", comments="Source Table: MyParkingGreeting")
    default int insert(Myparkinggreeting record) {
        return insert(SqlBuilder.insert(record)
                .into(myparkinggreeting)
                .map(ctrlnumber).toProperty("ctrlnumber")
                .map(voice).toProperty("voice")
                .map(starttime).toProperty("starttime")
                .map(endtime).toProperty("endtime")
                .map(dredgevoice).toProperty("dredgevoice")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.118+08:00", comments="Source Table: MyParkingGreeting")
    default int insertSelective(Myparkinggreeting record) {
        return insert(SqlBuilder.insert(record)
                .into(myparkinggreeting)
                .map(ctrlnumber).toPropertyWhenPresent("ctrlnumber", record::getCtrlnumber)
                .map(voice).toPropertyWhenPresent("voice", record::getVoice)
                .map(starttime).toPropertyWhenPresent("starttime", record::getStarttime)
                .map(endtime).toPropertyWhenPresent("endtime", record::getEndtime)
                .map(dredgevoice).toPropertyWhenPresent("dredgevoice", record::getDredgevoice)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.118+08:00", comments="Source Table: MyParkingGreeting")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myparkinggreeting>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, ctrlnumber, voice, starttime, endtime, dredgevoice)
                .from(myparkinggreeting);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.118+08:00", comments="Source Table: MyParkingGreeting")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myparkinggreeting>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, ctrlnumber, voice, starttime, endtime, dredgevoice)
                .from(myparkinggreeting);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.118+08:00", comments="Source Table: MyParkingGreeting")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Myparkinggreeting record) {
        return UpdateDSL.updateWithMapper(this::update, myparkinggreeting)
                .set(ctrlnumber).equalTo(record::getCtrlnumber)
                .set(voice).equalTo(record::getVoice)
                .set(starttime).equalTo(record::getStarttime)
                .set(endtime).equalTo(record::getEndtime)
                .set(dredgevoice).equalTo(record::getDredgevoice);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.118+08:00", comments="Source Table: MyParkingGreeting")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Myparkinggreeting record) {
        return UpdateDSL.updateWithMapper(this::update, myparkinggreeting)
                .set(ctrlnumber).equalToWhenPresent(record::getCtrlnumber)
                .set(voice).equalToWhenPresent(record::getVoice)
                .set(starttime).equalToWhenPresent(record::getStarttime)
                .set(endtime).equalToWhenPresent(record::getEndtime)
                .set(dredgevoice).equalToWhenPresent(record::getDredgevoice);
    }
}