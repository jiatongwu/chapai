package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.Myzbpark2DynamicSqlSupport.*;

import cn.xvkang.primaryentity.Myzbpark2;
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
public interface Myzbpark2DynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.764+08:00", comments="Source Table: MYZBPARK2")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.764+08:00", comments="Source Table: MYZBPARK2")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.764+08:00", comments="Source Table: MYZBPARK2")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Myzbpark2> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.764+08:00", comments="Source Table: MYZBPARK2")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Myzbpark2Result", value = {
        @Result(column="CtrlNumber", property="ctrlnumber", jdbcType=JdbcType.INTEGER),
        @Result(column="Address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="Favorable", property="favorable", jdbcType=JdbcType.DECIMAL),
        @Result(column="Manner", property="manner", jdbcType=JdbcType.VARCHAR),
        @Result(column="OutHour", property="outhour", jdbcType=JdbcType.DECIMAL),
        @Result(column="OutDayNo", property="outdayno", jdbcType=JdbcType.DECIMAL)
    })
    List<Myzbpark2> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.764+08:00", comments="Source Table: MYZBPARK2")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.764+08:00", comments="Source Table: MYZBPARK2")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(myzbpark2);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.764+08:00", comments="Source Table: MYZBPARK2")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, myzbpark2);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.764+08:00", comments="Source Table: MYZBPARK2")
    default int insert(Myzbpark2 record) {
        return insert(SqlBuilder.insert(record)
                .into(myzbpark2)
                .map(ctrlnumber).toProperty("ctrlnumber")
                .map(address).toProperty("address")
                .map(favorable).toProperty("favorable")
                .map(manner).toProperty("manner")
                .map(outhour).toProperty("outhour")
                .map(outdayno).toProperty("outdayno")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.764+08:00", comments="Source Table: MYZBPARK2")
    default int insertSelective(Myzbpark2 record) {
        return insert(SqlBuilder.insert(record)
                .into(myzbpark2)
                .map(ctrlnumber).toPropertyWhenPresent("ctrlnumber", record::getCtrlnumber)
                .map(address).toPropertyWhenPresent("address", record::getAddress)
                .map(favorable).toPropertyWhenPresent("favorable", record::getFavorable)
                .map(manner).toPropertyWhenPresent("manner", record::getManner)
                .map(outhour).toPropertyWhenPresent("outhour", record::getOuthour)
                .map(outdayno).toPropertyWhenPresent("outdayno", record::getOutdayno)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.764+08:00", comments="Source Table: MYZBPARK2")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myzbpark2>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, ctrlnumber, address, favorable, manner, outhour, outdayno)
                .from(myzbpark2);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.764+08:00", comments="Source Table: MYZBPARK2")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myzbpark2>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, ctrlnumber, address, favorable, manner, outhour, outdayno)
                .from(myzbpark2);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.764+08:00", comments="Source Table: MYZBPARK2")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Myzbpark2 record) {
        return UpdateDSL.updateWithMapper(this::update, myzbpark2)
                .set(ctrlnumber).equalTo(record::getCtrlnumber)
                .set(address).equalTo(record::getAddress)
                .set(favorable).equalTo(record::getFavorable)
                .set(manner).equalTo(record::getManner)
                .set(outhour).equalTo(record::getOuthour)
                .set(outdayno).equalTo(record::getOutdayno);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.764+08:00", comments="Source Table: MYZBPARK2")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Myzbpark2 record) {
        return UpdateDSL.updateWithMapper(this::update, myzbpark2)
                .set(ctrlnumber).equalToWhenPresent(record::getCtrlnumber)
                .set(address).equalToWhenPresent(record::getAddress)
                .set(favorable).equalToWhenPresent(record::getFavorable)
                .set(manner).equalToWhenPresent(record::getManner)
                .set(outhour).equalToWhenPresent(record::getOuthour)
                .set(outdayno).equalToWhenPresent(record::getOutdayno);
    }
}