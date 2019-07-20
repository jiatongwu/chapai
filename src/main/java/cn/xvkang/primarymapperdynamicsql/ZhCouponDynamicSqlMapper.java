package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.ZhCouponDynamicSqlSupport.*;

import cn.xvkang.primaryentity.ZhCoupon;
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
public interface ZhCouponDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.537+08:00", comments="Source Table: zh_Coupon")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.537+08:00", comments="Source Table: zh_Coupon")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.537+08:00", comments="Source Table: zh_Coupon")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<ZhCoupon> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.538+08:00", comments="Source Table: zh_Coupon")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ZhCouponResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER),
        @Result(column="orderNo", property="orderno", jdbcType=JdbcType.VARCHAR),
        @Result(column="carNo", property="carno", jdbcType=JdbcType.VARCHAR),
        @Result(column="couponType", property="coupontype", jdbcType=JdbcType.VARCHAR),
        @Result(column="couponValue", property="couponvalue", jdbcType=JdbcType.VARCHAR),
        @Result(column="invalidTime", property="invalidtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="couponId", property="couponid", jdbcType=JdbcType.VARCHAR),
        @Result(column="merchantId", property="merchantid", jdbcType=JdbcType.VARCHAR),
        @Result(column="merchantName", property="merchantname", jdbcType=JdbcType.VARCHAR),
        @Result(column="couponStatus", property="couponstatus", jdbcType=JdbcType.INTEGER),
        @Result(column="alterTime", property="altertime", jdbcType=JdbcType.VARCHAR)
    })
    List<ZhCoupon> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.538+08:00", comments="Source Table: zh_Coupon")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.538+08:00", comments="Source Table: zh_Coupon")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(zhCoupon);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.538+08:00", comments="Source Table: zh_Coupon")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, zhCoupon);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.538+08:00", comments="Source Table: zh_Coupon")
    default int insert(ZhCoupon record) {
        return insert(SqlBuilder.insert(record)
                .into(zhCoupon)
                .map(orderno).toProperty("orderno")
                .map(carno).toProperty("carno")
                .map(coupontype).toProperty("coupontype")
                .map(couponvalue).toProperty("couponvalue")
                .map(invalidtime).toProperty("invalidtime")
                .map(couponid).toProperty("couponid")
                .map(merchantid).toProperty("merchantid")
                .map(merchantname).toProperty("merchantname")
                .map(couponstatus).toProperty("couponstatus")
                .map(altertime).toProperty("altertime")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.538+08:00", comments="Source Table: zh_Coupon")
    default int insertSelective(ZhCoupon record) {
        return insert(SqlBuilder.insert(record)
                .into(zhCoupon)
                .map(orderno).toPropertyWhenPresent("orderno", record::getOrderno)
                .map(carno).toPropertyWhenPresent("carno", record::getCarno)
                .map(coupontype).toPropertyWhenPresent("coupontype", record::getCoupontype)
                .map(couponvalue).toPropertyWhenPresent("couponvalue", record::getCouponvalue)
                .map(invalidtime).toPropertyWhenPresent("invalidtime", record::getInvalidtime)
                .map(couponid).toPropertyWhenPresent("couponid", record::getCouponid)
                .map(merchantid).toPropertyWhenPresent("merchantid", record::getMerchantid)
                .map(merchantname).toPropertyWhenPresent("merchantname", record::getMerchantname)
                .map(couponstatus).toPropertyWhenPresent("couponstatus", record::getCouponstatus)
                .map(altertime).toPropertyWhenPresent("altertime", record::getAltertime)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.538+08:00", comments="Source Table: zh_Coupon")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ZhCoupon>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, orderno, carno, coupontype, couponvalue, invalidtime, couponid, merchantid, merchantname, couponstatus, altertime)
                .from(zhCoupon);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.538+08:00", comments="Source Table: zh_Coupon")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ZhCoupon>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, orderno, carno, coupontype, couponvalue, invalidtime, couponid, merchantid, merchantname, couponstatus, altertime)
                .from(zhCoupon);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.538+08:00", comments="Source Table: zh_Coupon")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(ZhCoupon record) {
        return UpdateDSL.updateWithMapper(this::update, zhCoupon)
                .set(orderno).equalTo(record::getOrderno)
                .set(carno).equalTo(record::getCarno)
                .set(coupontype).equalTo(record::getCoupontype)
                .set(couponvalue).equalTo(record::getCouponvalue)
                .set(invalidtime).equalTo(record::getInvalidtime)
                .set(couponid).equalTo(record::getCouponid)
                .set(merchantid).equalTo(record::getMerchantid)
                .set(merchantname).equalTo(record::getMerchantname)
                .set(couponstatus).equalTo(record::getCouponstatus)
                .set(altertime).equalTo(record::getAltertime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.538+08:00", comments="Source Table: zh_Coupon")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(ZhCoupon record) {
        return UpdateDSL.updateWithMapper(this::update, zhCoupon)
                .set(orderno).equalToWhenPresent(record::getOrderno)
                .set(carno).equalToWhenPresent(record::getCarno)
                .set(coupontype).equalToWhenPresent(record::getCoupontype)
                .set(couponvalue).equalToWhenPresent(record::getCouponvalue)
                .set(invalidtime).equalToWhenPresent(record::getInvalidtime)
                .set(couponid).equalToWhenPresent(record::getCouponid)
                .set(merchantid).equalToWhenPresent(record::getMerchantid)
                .set(merchantname).equalToWhenPresent(record::getMerchantname)
                .set(couponstatus).equalToWhenPresent(record::getCouponstatus)
                .set(altertime).equalToWhenPresent(record::getAltertime);
    }
}