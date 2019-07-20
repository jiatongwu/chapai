package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MyscancodepayDynamicSqlSupport.*;

import cn.xvkang.primaryentity.Myscancodepay;
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
public interface MyscancodepayDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.441+08:00", comments="Source Table: MyScanCodePay")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.441+08:00", comments="Source Table: MyScanCodePay")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.441+08:00", comments="Source Table: MyScanCodePay")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Myscancodepay> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.441+08:00", comments="Source Table: MyScanCodePay")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MyscancodepayResult", value = {
        @Result(column="SMPayment", property="smpayment", jdbcType=JdbcType.BIT),
        @Result(column="WXAppID", property="wxappid", jdbcType=JdbcType.VARCHAR),
        @Result(column="WXMCHID", property="wxmchid", jdbcType=JdbcType.VARCHAR),
        @Result(column="WXKEY", property="wxkey", jdbcType=JdbcType.VARCHAR),
        @Result(column="ZFBAppID", property="zfbappid", jdbcType=JdbcType.VARCHAR),
        @Result(column="ZFBPID", property="zfbpid", jdbcType=JdbcType.VARCHAR),
        @Result(column="StrTemp1", property="strtemp1", jdbcType=JdbcType.VARCHAR),
        @Result(column="StrTemp2", property="strtemp2", jdbcType=JdbcType.VARCHAR),
        @Result(column="StrTemp3", property="strtemp3", jdbcType=JdbcType.VARCHAR),
        @Result(column="StrTemp4", property="strtemp4", jdbcType=JdbcType.VARCHAR),
        @Result(column="StrTemp5", property="strtemp5", jdbcType=JdbcType.VARCHAR)
    })
    List<Myscancodepay> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.441+08:00", comments="Source Table: MyScanCodePay")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.441+08:00", comments="Source Table: MyScanCodePay")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(myscancodepay);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.441+08:00", comments="Source Table: MyScanCodePay")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, myscancodepay);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.441+08:00", comments="Source Table: MyScanCodePay")
    default int insert(Myscancodepay record) {
        return insert(SqlBuilder.insert(record)
                .into(myscancodepay)
                .map(smpayment).toProperty("smpayment")
                .map(wxappid).toProperty("wxappid")
                .map(wxmchid).toProperty("wxmchid")
                .map(wxkey).toProperty("wxkey")
                .map(zfbappid).toProperty("zfbappid")
                .map(zfbpid).toProperty("zfbpid")
                .map(strtemp1).toProperty("strtemp1")
                .map(strtemp2).toProperty("strtemp2")
                .map(strtemp3).toProperty("strtemp3")
                .map(strtemp4).toProperty("strtemp4")
                .map(strtemp5).toProperty("strtemp5")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.441+08:00", comments="Source Table: MyScanCodePay")
    default int insertSelective(Myscancodepay record) {
        return insert(SqlBuilder.insert(record)
                .into(myscancodepay)
                .map(smpayment).toPropertyWhenPresent("smpayment", record::getSmpayment)
                .map(wxappid).toPropertyWhenPresent("wxappid", record::getWxappid)
                .map(wxmchid).toPropertyWhenPresent("wxmchid", record::getWxmchid)
                .map(wxkey).toPropertyWhenPresent("wxkey", record::getWxkey)
                .map(zfbappid).toPropertyWhenPresent("zfbappid", record::getZfbappid)
                .map(zfbpid).toPropertyWhenPresent("zfbpid", record::getZfbpid)
                .map(strtemp1).toPropertyWhenPresent("strtemp1", record::getStrtemp1)
                .map(strtemp2).toPropertyWhenPresent("strtemp2", record::getStrtemp2)
                .map(strtemp3).toPropertyWhenPresent("strtemp3", record::getStrtemp3)
                .map(strtemp4).toPropertyWhenPresent("strtemp4", record::getStrtemp4)
                .map(strtemp5).toPropertyWhenPresent("strtemp5", record::getStrtemp5)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.441+08:00", comments="Source Table: MyScanCodePay")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myscancodepay>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, smpayment, wxappid, wxmchid, wxkey, zfbappid, zfbpid, strtemp1, strtemp2, strtemp3, strtemp4, strtemp5)
                .from(myscancodepay);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.441+08:00", comments="Source Table: MyScanCodePay")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myscancodepay>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, smpayment, wxappid, wxmchid, wxkey, zfbappid, zfbpid, strtemp1, strtemp2, strtemp3, strtemp4, strtemp5)
                .from(myscancodepay);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.441+08:00", comments="Source Table: MyScanCodePay")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Myscancodepay record) {
        return UpdateDSL.updateWithMapper(this::update, myscancodepay)
                .set(smpayment).equalTo(record::getSmpayment)
                .set(wxappid).equalTo(record::getWxappid)
                .set(wxmchid).equalTo(record::getWxmchid)
                .set(wxkey).equalTo(record::getWxkey)
                .set(zfbappid).equalTo(record::getZfbappid)
                .set(zfbpid).equalTo(record::getZfbpid)
                .set(strtemp1).equalTo(record::getStrtemp1)
                .set(strtemp2).equalTo(record::getStrtemp2)
                .set(strtemp3).equalTo(record::getStrtemp3)
                .set(strtemp4).equalTo(record::getStrtemp4)
                .set(strtemp5).equalTo(record::getStrtemp5);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.441+08:00", comments="Source Table: MyScanCodePay")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Myscancodepay record) {
        return UpdateDSL.updateWithMapper(this::update, myscancodepay)
                .set(smpayment).equalToWhenPresent(record::getSmpayment)
                .set(wxappid).equalToWhenPresent(record::getWxappid)
                .set(wxmchid).equalToWhenPresent(record::getWxmchid)
                .set(wxkey).equalToWhenPresent(record::getWxkey)
                .set(zfbappid).equalToWhenPresent(record::getZfbappid)
                .set(zfbpid).equalToWhenPresent(record::getZfbpid)
                .set(strtemp1).equalToWhenPresent(record::getStrtemp1)
                .set(strtemp2).equalToWhenPresent(record::getStrtemp2)
                .set(strtemp3).equalToWhenPresent(record::getStrtemp3)
                .set(strtemp4).equalToWhenPresent(record::getStrtemp4)
                .set(strtemp5).equalToWhenPresent(record::getStrtemp5);
    }
}