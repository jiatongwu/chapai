package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MyvoiceDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.Myvoice;
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
public interface MyvoiceDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.150+08:00", comments="Source Table: MyVoice")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.150+08:00", comments="Source Table: MyVoice")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.150+08:00", comments="Source Table: MyVoice")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.number", before=true, resultType=Integer.class)
    int insert(InsertStatementProvider<Myvoice> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.150+08:00", comments="Source Table: MyVoice")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MyvoiceResult")
    Myvoice selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.150+08:00", comments="Source Table: MyVoice")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MyvoiceResult", value = {
        @Result(column="Number", property="number", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CardNO", property="cardno", jdbcType=JdbcType.VARCHAR),
        @Result(column="StartTime", property="starttime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="EndTime", property="endtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="InVoice", property="invoice", jdbcType=JdbcType.VARCHAR),
        @Result(column="OutVoice", property="outvoice", jdbcType=JdbcType.VARCHAR)
    })
    List<Myvoice> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.150+08:00", comments="Source Table: MyVoice")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.150+08:00", comments="Source Table: MyVoice")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(myvoice);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.150+08:00", comments="Source Table: MyVoice")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, myvoice);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.150+08:00", comments="Source Table: MyVoice")
    default int deleteByPrimaryKey(Integer number_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, myvoice)
                .where(number, isEqualTo(number_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.150+08:00", comments="Source Table: MyVoice")
    default int insert(Myvoice record) {
        return insert(SqlBuilder.insert(record)
                .into(myvoice)
                .map(number).toProperty("number")
                .map(cardno).toProperty("cardno")
                .map(starttime).toProperty("starttime")
                .map(endtime).toProperty("endtime")
                .map(invoice).toProperty("invoice")
                .map(outvoice).toProperty("outvoice")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.150+08:00", comments="Source Table: MyVoice")
    default int insertSelective(Myvoice record) {
        return insert(SqlBuilder.insert(record)
                .into(myvoice)
                .map(number).toProperty("number")
                .map(cardno).toPropertyWhenPresent("cardno", record::getCardno)
                .map(starttime).toPropertyWhenPresent("starttime", record::getStarttime)
                .map(endtime).toPropertyWhenPresent("endtime", record::getEndtime)
                .map(invoice).toPropertyWhenPresent("invoice", record::getInvoice)
                .map(outvoice).toPropertyWhenPresent("outvoice", record::getOutvoice)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.150+08:00", comments="Source Table: MyVoice")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myvoice>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, number, cardno, starttime, endtime, invoice, outvoice)
                .from(myvoice);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.150+08:00", comments="Source Table: MyVoice")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myvoice>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, number, cardno, starttime, endtime, invoice, outvoice)
                .from(myvoice);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.150+08:00", comments="Source Table: MyVoice")
    default Myvoice selectByPrimaryKey(Integer number_) {
        return SelectDSL.selectWithMapper(this::selectOne, number, cardno, starttime, endtime, invoice, outvoice)
                .from(myvoice)
                .where(number, isEqualTo(number_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.150+08:00", comments="Source Table: MyVoice")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Myvoice record) {
        return UpdateDSL.updateWithMapper(this::update, myvoice)
                .set(number).equalTo(record::getNumber)
                .set(cardno).equalTo(record::getCardno)
                .set(starttime).equalTo(record::getStarttime)
                .set(endtime).equalTo(record::getEndtime)
                .set(invoice).equalTo(record::getInvoice)
                .set(outvoice).equalTo(record::getOutvoice);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.150+08:00", comments="Source Table: MyVoice")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Myvoice record) {
        return UpdateDSL.updateWithMapper(this::update, myvoice)
                .set(number).equalToWhenPresent(record::getNumber)
                .set(cardno).equalToWhenPresent(record::getCardno)
                .set(starttime).equalToWhenPresent(record::getStarttime)
                .set(endtime).equalToWhenPresent(record::getEndtime)
                .set(invoice).equalToWhenPresent(record::getInvoice)
                .set(outvoice).equalToWhenPresent(record::getOutvoice);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.150+08:00", comments="Source Table: MyVoice")
    default int updateByPrimaryKey(Myvoice record) {
        return UpdateDSL.updateWithMapper(this::update, myvoice)
                .set(cardno).equalTo(record::getCardno)
                .set(starttime).equalTo(record::getStarttime)
                .set(endtime).equalTo(record::getEndtime)
                .set(invoice).equalTo(record::getInvoice)
                .set(outvoice).equalTo(record::getOutvoice)
                .where(number, isEqualTo(record::getNumber))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.150+08:00", comments="Source Table: MyVoice")
    default int updateByPrimaryKeySelective(Myvoice record) {
        return UpdateDSL.updateWithMapper(this::update, myvoice)
                .set(cardno).equalToWhenPresent(record::getCardno)
                .set(starttime).equalToWhenPresent(record::getStarttime)
                .set(endtime).equalToWhenPresent(record::getEndtime)
                .set(invoice).equalToWhenPresent(record::getInvoice)
                .set(outvoice).equalToWhenPresent(record::getOutvoice)
                .where(number, isEqualTo(record::getNumber))
                .build()
                .execute();
    }
}