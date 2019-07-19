package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.ZhOutcarDynamicSqlSupport.*;

import cn.xvkang.primaryentity.ZhOutcar;
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
public interface ZhOutcarDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.904+08:00", comments="Source Table: zh_OutCar")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.904+08:00", comments="Source Table: zh_OutCar")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.904+08:00", comments="Source Table: zh_OutCar")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<ZhOutcar> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.904+08:00", comments="Source Table: zh_OutCar")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ZhOutcarResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER),
        @Result(column="orderNo", property="orderno", jdbcType=JdbcType.VARCHAR),
        @Result(column="carNo", property="carno", jdbcType=JdbcType.VARCHAR),
        @Result(column="carType", property="cartype", jdbcType=JdbcType.VARCHAR),
        @Result(column="outTime", property="outtime", jdbcType=JdbcType.VARCHAR),
        @Result(column="gateName", property="gatename", jdbcType=JdbcType.VARCHAR),
        @Result(column="operatorName", property="operatorname", jdbcType=JdbcType.VARCHAR),
        @Result(column="imgpath", property="imgpath", jdbcType=JdbcType.VARCHAR),
        @Result(column="totalAmount", property="totalamount", jdbcType=JdbcType.DECIMAL),
        @Result(column="couponId", property="couponid", jdbcType=JdbcType.INTEGER),
        @Result(column="couponMoney", property="couponmoney", jdbcType=JdbcType.DECIMAL),
        @Result(column="walletPayMoney", property="walletpaymoney", jdbcType=JdbcType.DECIMAL),
        @Result(column="ycflag", property="ycflag", jdbcType=JdbcType.INTEGER),
        @Result(column="imgflag", property="imgflag", jdbcType=JdbcType.INTEGER),
        @Result(column="synflag", property="synflag", jdbcType=JdbcType.INTEGER),
        @Result(column="freeReason", property="freereason", jdbcType=JdbcType.VARCHAR)
    })
    List<ZhOutcar> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.904+08:00", comments="Source Table: zh_OutCar")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.904+08:00", comments="Source Table: zh_OutCar")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(zhOutcar);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.904+08:00", comments="Source Table: zh_OutCar")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, zhOutcar);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.904+08:00", comments="Source Table: zh_OutCar")
    default int insert(ZhOutcar record) {
        return insert(SqlBuilder.insert(record)
                .into(zhOutcar)
                .map(orderno).toProperty("orderno")
                .map(carno).toProperty("carno")
                .map(cartype).toProperty("cartype")
                .map(outtime).toProperty("outtime")
                .map(gatename).toProperty("gatename")
                .map(operatorname).toProperty("operatorname")
                .map(imgpath).toProperty("imgpath")
                .map(totalamount).toProperty("totalamount")
                .map(couponid).toProperty("couponid")
                .map(couponmoney).toProperty("couponmoney")
                .map(walletpaymoney).toProperty("walletpaymoney")
                .map(ycflag).toProperty("ycflag")
                .map(imgflag).toProperty("imgflag")
                .map(synflag).toProperty("synflag")
                .map(freereason).toProperty("freereason")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.904+08:00", comments="Source Table: zh_OutCar")
    default int insertSelective(ZhOutcar record) {
        return insert(SqlBuilder.insert(record)
                .into(zhOutcar)
                .map(orderno).toPropertyWhenPresent("orderno", record::getOrderno)
                .map(carno).toPropertyWhenPresent("carno", record::getCarno)
                .map(cartype).toPropertyWhenPresent("cartype", record::getCartype)
                .map(outtime).toPropertyWhenPresent("outtime", record::getOuttime)
                .map(gatename).toPropertyWhenPresent("gatename", record::getGatename)
                .map(operatorname).toPropertyWhenPresent("operatorname", record::getOperatorname)
                .map(imgpath).toPropertyWhenPresent("imgpath", record::getImgpath)
                .map(totalamount).toPropertyWhenPresent("totalamount", record::getTotalamount)
                .map(couponid).toPropertyWhenPresent("couponid", record::getCouponid)
                .map(couponmoney).toPropertyWhenPresent("couponmoney", record::getCouponmoney)
                .map(walletpaymoney).toPropertyWhenPresent("walletpaymoney", record::getWalletpaymoney)
                .map(ycflag).toPropertyWhenPresent("ycflag", record::getYcflag)
                .map(imgflag).toPropertyWhenPresent("imgflag", record::getImgflag)
                .map(synflag).toPropertyWhenPresent("synflag", record::getSynflag)
                .map(freereason).toPropertyWhenPresent("freereason", record::getFreereason)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.904+08:00", comments="Source Table: zh_OutCar")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ZhOutcar>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, orderno, carno, cartype, outtime, gatename, operatorname, imgpath, totalamount, couponid, couponmoney, walletpaymoney, ycflag, imgflag, synflag, freereason)
                .from(zhOutcar);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.904+08:00", comments="Source Table: zh_OutCar")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ZhOutcar>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, orderno, carno, cartype, outtime, gatename, operatorname, imgpath, totalamount, couponid, couponmoney, walletpaymoney, ycflag, imgflag, synflag, freereason)
                .from(zhOutcar);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.904+08:00", comments="Source Table: zh_OutCar")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(ZhOutcar record) {
        return UpdateDSL.updateWithMapper(this::update, zhOutcar)
                .set(orderno).equalTo(record::getOrderno)
                .set(carno).equalTo(record::getCarno)
                .set(cartype).equalTo(record::getCartype)
                .set(outtime).equalTo(record::getOuttime)
                .set(gatename).equalTo(record::getGatename)
                .set(operatorname).equalTo(record::getOperatorname)
                .set(imgpath).equalTo(record::getImgpath)
                .set(totalamount).equalTo(record::getTotalamount)
                .set(couponid).equalTo(record::getCouponid)
                .set(couponmoney).equalTo(record::getCouponmoney)
                .set(walletpaymoney).equalTo(record::getWalletpaymoney)
                .set(ycflag).equalTo(record::getYcflag)
                .set(imgflag).equalTo(record::getImgflag)
                .set(synflag).equalTo(record::getSynflag)
                .set(freereason).equalTo(record::getFreereason);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.904+08:00", comments="Source Table: zh_OutCar")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(ZhOutcar record) {
        return UpdateDSL.updateWithMapper(this::update, zhOutcar)
                .set(orderno).equalToWhenPresent(record::getOrderno)
                .set(carno).equalToWhenPresent(record::getCarno)
                .set(cartype).equalToWhenPresent(record::getCartype)
                .set(outtime).equalToWhenPresent(record::getOuttime)
                .set(gatename).equalToWhenPresent(record::getGatename)
                .set(operatorname).equalToWhenPresent(record::getOperatorname)
                .set(imgpath).equalToWhenPresent(record::getImgpath)
                .set(totalamount).equalToWhenPresent(record::getTotalamount)
                .set(couponid).equalToWhenPresent(record::getCouponid)
                .set(couponmoney).equalToWhenPresent(record::getCouponmoney)
                .set(walletpaymoney).equalToWhenPresent(record::getWalletpaymoney)
                .set(ycflag).equalToWhenPresent(record::getYcflag)
                .set(imgflag).equalToWhenPresent(record::getImgflag)
                .set(synflag).equalToWhenPresent(record::getSynflag)
                .set(freereason).equalToWhenPresent(record::getFreereason);
    }
}