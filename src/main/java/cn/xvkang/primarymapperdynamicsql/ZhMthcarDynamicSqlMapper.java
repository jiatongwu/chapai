package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.ZhMthcarDynamicSqlSupport.*;

import cn.xvkang.primaryentity.ZhMthcar;
import java.util.List;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
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
public interface ZhMthcarDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.544+08:00", comments="Source Table: zh_MthCar")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.544+08:00", comments="Source Table: zh_MthCar")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.544+08:00", comments="Source Table: zh_MthCar")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<ZhMthcar> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.544+08:00", comments="Source Table: zh_MthCar")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ZhMthcarResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER),
        @Result(column="carNo", property="carno", jdbcType=JdbcType.VARCHAR),
        @Result(column="carType", property="cartype", jdbcType=JdbcType.VARCHAR),
        @Result(column="beginTime", property="begintime", jdbcType=JdbcType.VARCHAR),
        @Result(column="endTime", property="endtime", jdbcType=JdbcType.VARCHAR),
        @Result(column="iusseTime", property="iussetime", jdbcType=JdbcType.VARCHAR),
        @Result(column="userNo", property="userno", jdbcType=JdbcType.VARCHAR),
        @Result(column="userName", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="homeAddress", property="homeaddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="mobNumber", property="mobnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="carSpalcesNum", property="carspalcesnum", jdbcType=JdbcType.VARCHAR),
        @Result(column="stuat", property="stuat", jdbcType=JdbcType.INTEGER),
        @Result(column="synflag", property="synflag", jdbcType=JdbcType.INTEGER)
    })
    List<ZhMthcar> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.544+08:00", comments="Source Table: zh_MthCar")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.544+08:00", comments="Source Table: zh_MthCar")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(zhMthcar);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.544+08:00", comments="Source Table: zh_MthCar")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, zhMthcar);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.544+08:00", comments="Source Table: zh_MthCar")
    default int insert(ZhMthcar record) {
        return insert(SqlBuilder.insert(record)
                .into(zhMthcar)
                .map(carno).toProperty("carno")
                .map(cartype).toProperty("cartype")
                .map(begintime).toProperty("begintime")
                .map(endtime).toProperty("endtime")
                .map(iussetime).toProperty("iussetime")
                .map(userno).toProperty("userno")
                .map(username).toProperty("username")
                .map(homeaddress).toProperty("homeaddress")
                .map(mobnumber).toProperty("mobnumber")
                .map(carspalcesnum).toProperty("carspalcesnum")
                .map(stuat).toProperty("stuat")
                .map(synflag).toProperty("synflag")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.544+08:00", comments="Source Table: zh_MthCar")
    default int insertSelective(ZhMthcar record) {
        return insert(SqlBuilder.insert(record)
                .into(zhMthcar)
                .map(carno).toPropertyWhenPresent("carno", record::getCarno)
                .map(cartype).toPropertyWhenPresent("cartype", record::getCartype)
                .map(begintime).toPropertyWhenPresent("begintime", record::getBegintime)
                .map(endtime).toPropertyWhenPresent("endtime", record::getEndtime)
                .map(iussetime).toPropertyWhenPresent("iussetime", record::getIussetime)
                .map(userno).toPropertyWhenPresent("userno", record::getUserno)
                .map(username).toPropertyWhenPresent("username", record::getUsername)
                .map(homeaddress).toPropertyWhenPresent("homeaddress", record::getHomeaddress)
                .map(mobnumber).toPropertyWhenPresent("mobnumber", record::getMobnumber)
                .map(carspalcesnum).toPropertyWhenPresent("carspalcesnum", record::getCarspalcesnum)
                .map(stuat).toPropertyWhenPresent("stuat", record::getStuat)
                .map(synflag).toPropertyWhenPresent("synflag", record::getSynflag)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.544+08:00", comments="Source Table: zh_MthCar")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ZhMthcar>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, carno, cartype, begintime, endtime, iussetime, userno, username, homeaddress, mobnumber, carspalcesnum, stuat, synflag)
                .from(zhMthcar);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.544+08:00", comments="Source Table: zh_MthCar")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ZhMthcar>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, carno, cartype, begintime, endtime, iussetime, userno, username, homeaddress, mobnumber, carspalcesnum, stuat, synflag)
                .from(zhMthcar);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.544+08:00", comments="Source Table: zh_MthCar")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(ZhMthcar record) {
        return UpdateDSL.updateWithMapper(this::update, zhMthcar)
                .set(carno).equalTo(record::getCarno)
                .set(cartype).equalTo(record::getCartype)
                .set(begintime).equalTo(record::getBegintime)
                .set(endtime).equalTo(record::getEndtime)
                .set(iussetime).equalTo(record::getIussetime)
                .set(userno).equalTo(record::getUserno)
                .set(username).equalTo(record::getUsername)
                .set(homeaddress).equalTo(record::getHomeaddress)
                .set(mobnumber).equalTo(record::getMobnumber)
                .set(carspalcesnum).equalTo(record::getCarspalcesnum)
                .set(stuat).equalTo(record::getStuat)
                .set(synflag).equalTo(record::getSynflag);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.544+08:00", comments="Source Table: zh_MthCar")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(ZhMthcar record) {
        return UpdateDSL.updateWithMapper(this::update, zhMthcar)
                .set(carno).equalToWhenPresent(record::getCarno)
                .set(cartype).equalToWhenPresent(record::getCartype)
                .set(begintime).equalToWhenPresent(record::getBegintime)
                .set(endtime).equalToWhenPresent(record::getEndtime)
                .set(iussetime).equalToWhenPresent(record::getIussetime)
                .set(userno).equalToWhenPresent(record::getUserno)
                .set(username).equalToWhenPresent(record::getUsername)
                .set(homeaddress).equalToWhenPresent(record::getHomeaddress)
                .set(mobnumber).equalToWhenPresent(record::getMobnumber)
                .set(carspalcesnum).equalToWhenPresent(record::getCarspalcesnum)
                .set(stuat).equalToWhenPresent(record::getStuat)
                .set(synflag).equalToWhenPresent(record::getSynflag);
    }
}