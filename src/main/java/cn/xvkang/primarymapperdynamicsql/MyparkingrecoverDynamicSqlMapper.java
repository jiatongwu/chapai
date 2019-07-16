package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MyparkingrecoverDynamicSqlSupport.*;

import cn.xvkang.primaryentity.Myparkingrecover;
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
public interface MyparkingrecoverDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.878+08:00", comments="Source Table: MyParkingRecover")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.878+08:00", comments="Source Table: MyParkingRecover")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.878+08:00", comments="Source Table: MyParkingRecover")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Myparkingrecover> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.878+08:00", comments="Source Table: MyParkingRecover")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MyparkingrecoverResult", value = {
        @Result(column="CtrlNumber", property="ctrlnumber", jdbcType=JdbcType.INTEGER),
        @Result(column="Instruct", property="instruct", jdbcType=JdbcType.VARCHAR),
        @Result(column="Flag", property="flag", jdbcType=JdbcType.VARCHAR)
    })
    List<Myparkingrecover> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.879+08:00", comments="Source Table: MyParkingRecover")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.879+08:00", comments="Source Table: MyParkingRecover")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(myparkingrecover);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.879+08:00", comments="Source Table: MyParkingRecover")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, myparkingrecover);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.879+08:00", comments="Source Table: MyParkingRecover")
    default int insert(Myparkingrecover record) {
        return insert(SqlBuilder.insert(record)
                .into(myparkingrecover)
                .map(ctrlnumber).toProperty("ctrlnumber")
                .map(instruct).toProperty("instruct")
                .map(flag).toProperty("flag")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.879+08:00", comments="Source Table: MyParkingRecover")
    default int insertSelective(Myparkingrecover record) {
        return insert(SqlBuilder.insert(record)
                .into(myparkingrecover)
                .map(ctrlnumber).toPropertyWhenPresent("ctrlnumber", record::getCtrlnumber)
                .map(instruct).toPropertyWhenPresent("instruct", record::getInstruct)
                .map(flag).toPropertyWhenPresent("flag", record::getFlag)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.879+08:00", comments="Source Table: MyParkingRecover")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myparkingrecover>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, ctrlnumber, instruct, flag)
                .from(myparkingrecover);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.879+08:00", comments="Source Table: MyParkingRecover")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myparkingrecover>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, ctrlnumber, instruct, flag)
                .from(myparkingrecover);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.879+08:00", comments="Source Table: MyParkingRecover")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Myparkingrecover record) {
        return UpdateDSL.updateWithMapper(this::update, myparkingrecover)
                .set(ctrlnumber).equalTo(record::getCtrlnumber)
                .set(instruct).equalTo(record::getInstruct)
                .set(flag).equalTo(record::getFlag);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.879+08:00", comments="Source Table: MyParkingRecover")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Myparkingrecover record) {
        return UpdateDSL.updateWithMapper(this::update, myparkingrecover)
                .set(ctrlnumber).equalToWhenPresent(record::getCtrlnumber)
                .set(instruct).equalToWhenPresent(record::getInstruct)
                .set(flag).equalToWhenPresent(record::getFlag);
    }
}