package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.ZhEntercarDynamicSqlSupport.*;

import cn.xvkang.primaryentity.ZhEntercar;
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
public interface ZhEntercarDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.539+08:00", comments="Source Table: zh_EnterCar")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.539+08:00", comments="Source Table: zh_EnterCar")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.539+08:00", comments="Source Table: zh_EnterCar")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<ZhEntercar> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.539+08:00", comments="Source Table: zh_EnterCar")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ZhEntercarResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER),
        @Result(column="orderNo", property="orderno", jdbcType=JdbcType.VARCHAR),
        @Result(column="carNo", property="carno", jdbcType=JdbcType.VARCHAR),
        @Result(column="carType", property="cartype", jdbcType=JdbcType.VARCHAR),
        @Result(column="enterTime", property="entertime", jdbcType=JdbcType.VARCHAR),
        @Result(column="gateName", property="gatename", jdbcType=JdbcType.VARCHAR),
        @Result(column="operatorName", property="operatorname", jdbcType=JdbcType.VARCHAR),
        @Result(column="reserveOrderNo", property="reserveorderno", jdbcType=JdbcType.VARCHAR),
        @Result(column="imgpath", property="imgpath", jdbcType=JdbcType.VARCHAR),
        @Result(column="lockstuat", property="lockstuat", jdbcType=JdbcType.INTEGER),
        @Result(column="walletTotalMoney", property="wallettotalmoney", jdbcType=JdbcType.DECIMAL),
        @Result(column="imgflag", property="imgflag", jdbcType=JdbcType.INTEGER),
        @Result(column="synflag", property="synflag", jdbcType=JdbcType.INTEGER)
    })
    List<ZhEntercar> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.540+08:00", comments="Source Table: zh_EnterCar")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.540+08:00", comments="Source Table: zh_EnterCar")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(zhEntercar);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.540+08:00", comments="Source Table: zh_EnterCar")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, zhEntercar);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.540+08:00", comments="Source Table: zh_EnterCar")
    default int insert(ZhEntercar record) {
        return insert(SqlBuilder.insert(record)
                .into(zhEntercar)
                .map(orderno).toProperty("orderno")
                .map(carno).toProperty("carno")
                .map(cartype).toProperty("cartype")
                .map(entertime).toProperty("entertime")
                .map(gatename).toProperty("gatename")
                .map(operatorname).toProperty("operatorname")
                .map(reserveorderno).toProperty("reserveorderno")
                .map(imgpath).toProperty("imgpath")
                .map(lockstuat).toProperty("lockstuat")
                .map(wallettotalmoney).toProperty("wallettotalmoney")
                .map(imgflag).toProperty("imgflag")
                .map(synflag).toProperty("synflag")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.540+08:00", comments="Source Table: zh_EnterCar")
    default int insertSelective(ZhEntercar record) {
        return insert(SqlBuilder.insert(record)
                .into(zhEntercar)
                .map(orderno).toPropertyWhenPresent("orderno", record::getOrderno)
                .map(carno).toPropertyWhenPresent("carno", record::getCarno)
                .map(cartype).toPropertyWhenPresent("cartype", record::getCartype)
                .map(entertime).toPropertyWhenPresent("entertime", record::getEntertime)
                .map(gatename).toPropertyWhenPresent("gatename", record::getGatename)
                .map(operatorname).toPropertyWhenPresent("operatorname", record::getOperatorname)
                .map(reserveorderno).toPropertyWhenPresent("reserveorderno", record::getReserveorderno)
                .map(imgpath).toPropertyWhenPresent("imgpath", record::getImgpath)
                .map(lockstuat).toPropertyWhenPresent("lockstuat", record::getLockstuat)
                .map(wallettotalmoney).toPropertyWhenPresent("wallettotalmoney", record::getWallettotalmoney)
                .map(imgflag).toPropertyWhenPresent("imgflag", record::getImgflag)
                .map(synflag).toPropertyWhenPresent("synflag", record::getSynflag)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.540+08:00", comments="Source Table: zh_EnterCar")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ZhEntercar>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, orderno, carno, cartype, entertime, gatename, operatorname, reserveorderno, imgpath, lockstuat, wallettotalmoney, imgflag, synflag)
                .from(zhEntercar);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.540+08:00", comments="Source Table: zh_EnterCar")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ZhEntercar>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, orderno, carno, cartype, entertime, gatename, operatorname, reserveorderno, imgpath, lockstuat, wallettotalmoney, imgflag, synflag)
                .from(zhEntercar);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.540+08:00", comments="Source Table: zh_EnterCar")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(ZhEntercar record) {
        return UpdateDSL.updateWithMapper(this::update, zhEntercar)
                .set(orderno).equalTo(record::getOrderno)
                .set(carno).equalTo(record::getCarno)
                .set(cartype).equalTo(record::getCartype)
                .set(entertime).equalTo(record::getEntertime)
                .set(gatename).equalTo(record::getGatename)
                .set(operatorname).equalTo(record::getOperatorname)
                .set(reserveorderno).equalTo(record::getReserveorderno)
                .set(imgpath).equalTo(record::getImgpath)
                .set(lockstuat).equalTo(record::getLockstuat)
                .set(wallettotalmoney).equalTo(record::getWallettotalmoney)
                .set(imgflag).equalTo(record::getImgflag)
                .set(synflag).equalTo(record::getSynflag);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.540+08:00", comments="Source Table: zh_EnterCar")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(ZhEntercar record) {
        return UpdateDSL.updateWithMapper(this::update, zhEntercar)
                .set(orderno).equalToWhenPresent(record::getOrderno)
                .set(carno).equalToWhenPresent(record::getCarno)
                .set(cartype).equalToWhenPresent(record::getCartype)
                .set(entertime).equalToWhenPresent(record::getEntertime)
                .set(gatename).equalToWhenPresent(record::getGatename)
                .set(operatorname).equalToWhenPresent(record::getOperatorname)
                .set(reserveorderno).equalToWhenPresent(record::getReserveorderno)
                .set(imgpath).equalToWhenPresent(record::getImgpath)
                .set(lockstuat).equalToWhenPresent(record::getLockstuat)
                .set(wallettotalmoney).equalToWhenPresent(record::getWallettotalmoney)
                .set(imgflag).equalToWhenPresent(record::getImgflag)
                .set(synflag).equalToWhenPresent(record::getSynflag);
    }
}