package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MycargooutrecordreportDynamicSqlSupport.*;

import cn.xvkang.primaryentity.Mycargooutrecordreport;
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
public interface MycargooutrecordreportDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.994+08:00", comments="Source Table: MYCARGOOUTRECORDREPORT")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.994+08:00", comments="Source Table: MYCARGOOUTRECORDREPORT")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.994+08:00", comments="Source Table: MYCARGOOUTRECORDREPORT")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Mycargooutrecordreport> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.994+08:00", comments="Source Table: MYCARGOOUTRECORDREPORT")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MycargooutrecordreportResult", value = {
        @Result(column="CARDSNO", property="cardsno", jdbcType=JdbcType.VARCHAR),
        @Result(column="IMONTHA", property="imontha", jdbcType=JdbcType.INTEGER),
        @Result(column="IMONTHB", property="imonthb", jdbcType=JdbcType.INTEGER),
        @Result(column="IMONTHC", property="imonthc", jdbcType=JdbcType.INTEGER),
        @Result(column="IMONTHD", property="imonthd", jdbcType=JdbcType.INTEGER),
        @Result(column="ISUMMONTH", property="isummonth", jdbcType=JdbcType.INTEGER),
        @Result(column="IFREEA", property="ifreea", jdbcType=JdbcType.INTEGER),
        @Result(column="IFREEB", property="ifreeb", jdbcType=JdbcType.INTEGER),
        @Result(column="ISUMFREE", property="isumfree", jdbcType=JdbcType.INTEGER),
        @Result(column="ITEMPA", property="itempa", jdbcType=JdbcType.INTEGER),
        @Result(column="ITEMPB", property="itempb", jdbcType=JdbcType.INTEGER),
        @Result(column="ITEMPC", property="itempc", jdbcType=JdbcType.INTEGER),
        @Result(column="ITEMPD", property="itempd", jdbcType=JdbcType.INTEGER),
        @Result(column="ITEMPE", property="itempe", jdbcType=JdbcType.INTEGER),
        @Result(column="ITEMPF", property="itempf", jdbcType=JdbcType.INTEGER),
        @Result(column="ITEMPG", property="itempg", jdbcType=JdbcType.INTEGER),
        @Result(column="ITEMPH", property="itemph", jdbcType=JdbcType.INTEGER),
        @Result(column="ISUMTEMP", property="isumtemp", jdbcType=JdbcType.INTEGER),
        @Result(column="IMONEYA", property="imoneya", jdbcType=JdbcType.INTEGER),
        @Result(column="IMONEYB", property="imoneyb", jdbcType=JdbcType.INTEGER),
        @Result(column="IMONEYC", property="imoneyc", jdbcType=JdbcType.INTEGER),
        @Result(column="IMONEYD", property="imoneyd", jdbcType=JdbcType.INTEGER),
        @Result(column="ISUMMONEY", property="isummoney", jdbcType=JdbcType.INTEGER),
        @Result(column="IMONEY", property="imoney", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZSUMCAR", property="zsumcar", jdbcType=JdbcType.INTEGER),
        @Result(column="ZSUMMONEY", property="zsummoney", jdbcType=JdbcType.DECIMAL),
        @Result(column="ITEMPFREE", property="itempfree", jdbcType=JdbcType.INTEGER),
        @Result(column="ITEMPMONEY", property="itempmoney", jdbcType=JdbcType.DECIMAL),
        @Result(column="IMONTHE", property="imonthe", jdbcType=JdbcType.INTEGER),
        @Result(column="IMONTHF", property="imonthf", jdbcType=JdbcType.INTEGER),
        @Result(column="IMONTHG", property="imonthg", jdbcType=JdbcType.INTEGER),
        @Result(column="IMONTHH", property="imonthh", jdbcType=JdbcType.INTEGER),
        @Result(column="ZSumYSJE", property="zsumysje", jdbcType=JdbcType.DECIMAL),
        @Result(column="WXPay", property="wxpay", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZFBPay", property="zfbpay", jdbcType=JdbcType.DECIMAL),
        @Result(column="CashPay", property="cashpay", jdbcType=JdbcType.DECIMAL)
    })
    List<Mycargooutrecordreport> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.994+08:00", comments="Source Table: MYCARGOOUTRECORDREPORT")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.994+08:00", comments="Source Table: MYCARGOOUTRECORDREPORT")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(mycargooutrecordreport);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.994+08:00", comments="Source Table: MYCARGOOUTRECORDREPORT")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, mycargooutrecordreport);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.994+08:00", comments="Source Table: MYCARGOOUTRECORDREPORT")
    default int insert(Mycargooutrecordreport record) {
        return insert(SqlBuilder.insert(record)
                .into(mycargooutrecordreport)
                .map(cardsno).toProperty("cardsno")
                .map(imontha).toProperty("imontha")
                .map(imonthb).toProperty("imonthb")
                .map(imonthc).toProperty("imonthc")
                .map(imonthd).toProperty("imonthd")
                .map(isummonth).toProperty("isummonth")
                .map(ifreea).toProperty("ifreea")
                .map(ifreeb).toProperty("ifreeb")
                .map(isumfree).toProperty("isumfree")
                .map(itempa).toProperty("itempa")
                .map(itempb).toProperty("itempb")
                .map(itempc).toProperty("itempc")
                .map(itempd).toProperty("itempd")
                .map(itempe).toProperty("itempe")
                .map(itempf).toProperty("itempf")
                .map(itempg).toProperty("itempg")
                .map(itemph).toProperty("itemph")
                .map(isumtemp).toProperty("isumtemp")
                .map(imoneya).toProperty("imoneya")
                .map(imoneyb).toProperty("imoneyb")
                .map(imoneyc).toProperty("imoneyc")
                .map(imoneyd).toProperty("imoneyd")
                .map(isummoney).toProperty("isummoney")
                .map(imoney).toProperty("imoney")
                .map(zsumcar).toProperty("zsumcar")
                .map(zsummoney).toProperty("zsummoney")
                .map(itempfree).toProperty("itempfree")
                .map(itempmoney).toProperty("itempmoney")
                .map(imonthe).toProperty("imonthe")
                .map(imonthf).toProperty("imonthf")
                .map(imonthg).toProperty("imonthg")
                .map(imonthh).toProperty("imonthh")
                .map(zsumysje).toProperty("zsumysje")
                .map(wxpay).toProperty("wxpay")
                .map(zfbpay).toProperty("zfbpay")
                .map(cashpay).toProperty("cashpay")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.994+08:00", comments="Source Table: MYCARGOOUTRECORDREPORT")
    default int insertSelective(Mycargooutrecordreport record) {
        return insert(SqlBuilder.insert(record)
                .into(mycargooutrecordreport)
                .map(cardsno).toPropertyWhenPresent("cardsno", record::getCardsno)
                .map(imontha).toPropertyWhenPresent("imontha", record::getImontha)
                .map(imonthb).toPropertyWhenPresent("imonthb", record::getImonthb)
                .map(imonthc).toPropertyWhenPresent("imonthc", record::getImonthc)
                .map(imonthd).toPropertyWhenPresent("imonthd", record::getImonthd)
                .map(isummonth).toPropertyWhenPresent("isummonth", record::getIsummonth)
                .map(ifreea).toPropertyWhenPresent("ifreea", record::getIfreea)
                .map(ifreeb).toPropertyWhenPresent("ifreeb", record::getIfreeb)
                .map(isumfree).toPropertyWhenPresent("isumfree", record::getIsumfree)
                .map(itempa).toPropertyWhenPresent("itempa", record::getItempa)
                .map(itempb).toPropertyWhenPresent("itempb", record::getItempb)
                .map(itempc).toPropertyWhenPresent("itempc", record::getItempc)
                .map(itempd).toPropertyWhenPresent("itempd", record::getItempd)
                .map(itempe).toPropertyWhenPresent("itempe", record::getItempe)
                .map(itempf).toPropertyWhenPresent("itempf", record::getItempf)
                .map(itempg).toPropertyWhenPresent("itempg", record::getItempg)
                .map(itemph).toPropertyWhenPresent("itemph", record::getItemph)
                .map(isumtemp).toPropertyWhenPresent("isumtemp", record::getIsumtemp)
                .map(imoneya).toPropertyWhenPresent("imoneya", record::getImoneya)
                .map(imoneyb).toPropertyWhenPresent("imoneyb", record::getImoneyb)
                .map(imoneyc).toPropertyWhenPresent("imoneyc", record::getImoneyc)
                .map(imoneyd).toPropertyWhenPresent("imoneyd", record::getImoneyd)
                .map(isummoney).toPropertyWhenPresent("isummoney", record::getIsummoney)
                .map(imoney).toPropertyWhenPresent("imoney", record::getImoney)
                .map(zsumcar).toPropertyWhenPresent("zsumcar", record::getZsumcar)
                .map(zsummoney).toPropertyWhenPresent("zsummoney", record::getZsummoney)
                .map(itempfree).toPropertyWhenPresent("itempfree", record::getItempfree)
                .map(itempmoney).toPropertyWhenPresent("itempmoney", record::getItempmoney)
                .map(imonthe).toPropertyWhenPresent("imonthe", record::getImonthe)
                .map(imonthf).toPropertyWhenPresent("imonthf", record::getImonthf)
                .map(imonthg).toPropertyWhenPresent("imonthg", record::getImonthg)
                .map(imonthh).toPropertyWhenPresent("imonthh", record::getImonthh)
                .map(zsumysje).toPropertyWhenPresent("zsumysje", record::getZsumysje)
                .map(wxpay).toPropertyWhenPresent("wxpay", record::getWxpay)
                .map(zfbpay).toPropertyWhenPresent("zfbpay", record::getZfbpay)
                .map(cashpay).toPropertyWhenPresent("cashpay", record::getCashpay)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.994+08:00", comments="Source Table: MYCARGOOUTRECORDREPORT")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Mycargooutrecordreport>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, cardsno, imontha, imonthb, imonthc, imonthd, isummonth, ifreea, ifreeb, isumfree, itempa, itempb, itempc, itempd, itempe, itempf, itempg, itemph, isumtemp, imoneya, imoneyb, imoneyc, imoneyd, isummoney, imoney, zsumcar, zsummoney, itempfree, itempmoney, imonthe, imonthf, imonthg, imonthh, zsumysje, wxpay, zfbpay, cashpay)
                .from(mycargooutrecordreport);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.994+08:00", comments="Source Table: MYCARGOOUTRECORDREPORT")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Mycargooutrecordreport>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, cardsno, imontha, imonthb, imonthc, imonthd, isummonth, ifreea, ifreeb, isumfree, itempa, itempb, itempc, itempd, itempe, itempf, itempg, itemph, isumtemp, imoneya, imoneyb, imoneyc, imoneyd, isummoney, imoney, zsumcar, zsummoney, itempfree, itempmoney, imonthe, imonthf, imonthg, imonthh, zsumysje, wxpay, zfbpay, cashpay)
                .from(mycargooutrecordreport);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.994+08:00", comments="Source Table: MYCARGOOUTRECORDREPORT")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Mycargooutrecordreport record) {
        return UpdateDSL.updateWithMapper(this::update, mycargooutrecordreport)
                .set(cardsno).equalTo(record::getCardsno)
                .set(imontha).equalTo(record::getImontha)
                .set(imonthb).equalTo(record::getImonthb)
                .set(imonthc).equalTo(record::getImonthc)
                .set(imonthd).equalTo(record::getImonthd)
                .set(isummonth).equalTo(record::getIsummonth)
                .set(ifreea).equalTo(record::getIfreea)
                .set(ifreeb).equalTo(record::getIfreeb)
                .set(isumfree).equalTo(record::getIsumfree)
                .set(itempa).equalTo(record::getItempa)
                .set(itempb).equalTo(record::getItempb)
                .set(itempc).equalTo(record::getItempc)
                .set(itempd).equalTo(record::getItempd)
                .set(itempe).equalTo(record::getItempe)
                .set(itempf).equalTo(record::getItempf)
                .set(itempg).equalTo(record::getItempg)
                .set(itemph).equalTo(record::getItemph)
                .set(isumtemp).equalTo(record::getIsumtemp)
                .set(imoneya).equalTo(record::getImoneya)
                .set(imoneyb).equalTo(record::getImoneyb)
                .set(imoneyc).equalTo(record::getImoneyc)
                .set(imoneyd).equalTo(record::getImoneyd)
                .set(isummoney).equalTo(record::getIsummoney)
                .set(imoney).equalTo(record::getImoney)
                .set(zsumcar).equalTo(record::getZsumcar)
                .set(zsummoney).equalTo(record::getZsummoney)
                .set(itempfree).equalTo(record::getItempfree)
                .set(itempmoney).equalTo(record::getItempmoney)
                .set(imonthe).equalTo(record::getImonthe)
                .set(imonthf).equalTo(record::getImonthf)
                .set(imonthg).equalTo(record::getImonthg)
                .set(imonthh).equalTo(record::getImonthh)
                .set(zsumysje).equalTo(record::getZsumysje)
                .set(wxpay).equalTo(record::getWxpay)
                .set(zfbpay).equalTo(record::getZfbpay)
                .set(cashpay).equalTo(record::getCashpay);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.995+08:00", comments="Source Table: MYCARGOOUTRECORDREPORT")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Mycargooutrecordreport record) {
        return UpdateDSL.updateWithMapper(this::update, mycargooutrecordreport)
                .set(cardsno).equalToWhenPresent(record::getCardsno)
                .set(imontha).equalToWhenPresent(record::getImontha)
                .set(imonthb).equalToWhenPresent(record::getImonthb)
                .set(imonthc).equalToWhenPresent(record::getImonthc)
                .set(imonthd).equalToWhenPresent(record::getImonthd)
                .set(isummonth).equalToWhenPresent(record::getIsummonth)
                .set(ifreea).equalToWhenPresent(record::getIfreea)
                .set(ifreeb).equalToWhenPresent(record::getIfreeb)
                .set(isumfree).equalToWhenPresent(record::getIsumfree)
                .set(itempa).equalToWhenPresent(record::getItempa)
                .set(itempb).equalToWhenPresent(record::getItempb)
                .set(itempc).equalToWhenPresent(record::getItempc)
                .set(itempd).equalToWhenPresent(record::getItempd)
                .set(itempe).equalToWhenPresent(record::getItempe)
                .set(itempf).equalToWhenPresent(record::getItempf)
                .set(itempg).equalToWhenPresent(record::getItempg)
                .set(itemph).equalToWhenPresent(record::getItemph)
                .set(isumtemp).equalToWhenPresent(record::getIsumtemp)
                .set(imoneya).equalToWhenPresent(record::getImoneya)
                .set(imoneyb).equalToWhenPresent(record::getImoneyb)
                .set(imoneyc).equalToWhenPresent(record::getImoneyc)
                .set(imoneyd).equalToWhenPresent(record::getImoneyd)
                .set(isummoney).equalToWhenPresent(record::getIsummoney)
                .set(imoney).equalToWhenPresent(record::getImoney)
                .set(zsumcar).equalToWhenPresent(record::getZsumcar)
                .set(zsummoney).equalToWhenPresent(record::getZsummoney)
                .set(itempfree).equalToWhenPresent(record::getItempfree)
                .set(itempmoney).equalToWhenPresent(record::getItempmoney)
                .set(imonthe).equalToWhenPresent(record::getImonthe)
                .set(imonthf).equalToWhenPresent(record::getImonthf)
                .set(imonthg).equalToWhenPresent(record::getImonthg)
                .set(imonthh).equalToWhenPresent(record::getImonthh)
                .set(zsumysje).equalToWhenPresent(record::getZsumysje)
                .set(wxpay).equalToWhenPresent(record::getWxpay)
                .set(zfbpay).equalToWhenPresent(record::getZfbpay)
                .set(cashpay).equalToWhenPresent(record::getCashpay);
    }
}