package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MyiclostDynamicSqlSupport.*;

import cn.xvkang.primaryentity.Myiclost;
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
public interface MyiclostDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.029+08:00", comments="Source Table: MYICLOST")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.029+08:00", comments="Source Table: MYICLOST")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.029+08:00", comments="Source Table: MYICLOST")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Myiclost> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.029+08:00", comments="Source Table: MYICLOST")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MyiclostResult", value = {
        @Result(column="CardNO", property="cardno", jdbcType=JdbcType.VARCHAR),
        @Result(column="LossregDate", property="lossregdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="OperatorCardNO", property="operatorcardno", jdbcType=JdbcType.VARCHAR),
        @Result(column="CardState", property="cardstate", jdbcType=JdbcType.CHAR),
        @Result(column="CarLostOKID", property="carlostokid", jdbcType=JdbcType.CHAR),
        @Result(column="CarLostOKNO", property="carlostokno", jdbcType=JdbcType.BIT),
        @Result(column="CarUnLostOKNO", property="carunlostokno", jdbcType=JdbcType.BIT),
        @Result(column="MJLostOKID", property="mjlostokid", jdbcType=JdbcType.CHAR),
        @Result(column="MJLostOKNO", property="mjlostokno", jdbcType=JdbcType.BIT),
        @Result(column="MJUnLostOKNO", property="mjunlostokno", jdbcType=JdbcType.BIT),
        @Result(column="CarOptCard", property="caroptcard", jdbcType=JdbcType.BIT)
    })
    List<Myiclost> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.029+08:00", comments="Source Table: MYICLOST")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.029+08:00", comments="Source Table: MYICLOST")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(myiclost);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.029+08:00", comments="Source Table: MYICLOST")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, myiclost);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.030+08:00", comments="Source Table: MYICLOST")
    default int insert(Myiclost record) {
        return insert(SqlBuilder.insert(record)
                .into(myiclost)
                .map(cardno).toProperty("cardno")
                .map(lossregdate).toProperty("lossregdate")
                .map(operatorcardno).toProperty("operatorcardno")
                .map(cardstate).toProperty("cardstate")
                .map(carlostokid).toProperty("carlostokid")
                .map(carlostokno).toProperty("carlostokno")
                .map(carunlostokno).toProperty("carunlostokno")
                .map(mjlostokid).toProperty("mjlostokid")
                .map(mjlostokno).toProperty("mjlostokno")
                .map(mjunlostokno).toProperty("mjunlostokno")
                .map(caroptcard).toProperty("caroptcard")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.030+08:00", comments="Source Table: MYICLOST")
    default int insertSelective(Myiclost record) {
        return insert(SqlBuilder.insert(record)
                .into(myiclost)
                .map(cardno).toPropertyWhenPresent("cardno", record::getCardno)
                .map(lossregdate).toPropertyWhenPresent("lossregdate", record::getLossregdate)
                .map(operatorcardno).toPropertyWhenPresent("operatorcardno", record::getOperatorcardno)
                .map(cardstate).toPropertyWhenPresent("cardstate", record::getCardstate)
                .map(carlostokid).toPropertyWhenPresent("carlostokid", record::getCarlostokid)
                .map(carlostokno).toPropertyWhenPresent("carlostokno", record::getCarlostokno)
                .map(carunlostokno).toPropertyWhenPresent("carunlostokno", record::getCarunlostokno)
                .map(mjlostokid).toPropertyWhenPresent("mjlostokid", record::getMjlostokid)
                .map(mjlostokno).toPropertyWhenPresent("mjlostokno", record::getMjlostokno)
                .map(mjunlostokno).toPropertyWhenPresent("mjunlostokno", record::getMjunlostokno)
                .map(caroptcard).toPropertyWhenPresent("caroptcard", record::getCaroptcard)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.030+08:00", comments="Source Table: MYICLOST")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myiclost>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, cardno, lossregdate, operatorcardno, cardstate, carlostokid, carlostokno, carunlostokno, mjlostokid, mjlostokno, mjunlostokno, caroptcard)
                .from(myiclost);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.030+08:00", comments="Source Table: MYICLOST")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myiclost>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, cardno, lossregdate, operatorcardno, cardstate, carlostokid, carlostokno, carunlostokno, mjlostokid, mjlostokno, mjunlostokno, caroptcard)
                .from(myiclost);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.030+08:00", comments="Source Table: MYICLOST")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Myiclost record) {
        return UpdateDSL.updateWithMapper(this::update, myiclost)
                .set(cardno).equalTo(record::getCardno)
                .set(lossregdate).equalTo(record::getLossregdate)
                .set(operatorcardno).equalTo(record::getOperatorcardno)
                .set(cardstate).equalTo(record::getCardstate)
                .set(carlostokid).equalTo(record::getCarlostokid)
                .set(carlostokno).equalTo(record::getCarlostokno)
                .set(carunlostokno).equalTo(record::getCarunlostokno)
                .set(mjlostokid).equalTo(record::getMjlostokid)
                .set(mjlostokno).equalTo(record::getMjlostokno)
                .set(mjunlostokno).equalTo(record::getMjunlostokno)
                .set(caroptcard).equalTo(record::getCaroptcard);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.030+08:00", comments="Source Table: MYICLOST")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Myiclost record) {
        return UpdateDSL.updateWithMapper(this::update, myiclost)
                .set(cardno).equalToWhenPresent(record::getCardno)
                .set(lossregdate).equalToWhenPresent(record::getLossregdate)
                .set(operatorcardno).equalToWhenPresent(record::getOperatorcardno)
                .set(cardstate).equalToWhenPresent(record::getCardstate)
                .set(carlostokid).equalToWhenPresent(record::getCarlostokid)
                .set(carlostokno).equalToWhenPresent(record::getCarlostokno)
                .set(carunlostokno).equalToWhenPresent(record::getCarunlostokno)
                .set(mjlostokid).equalToWhenPresent(record::getMjlostokid)
                .set(mjlostokno).equalToWhenPresent(record::getMjlostokno)
                .set(mjunlostokno).equalToWhenPresent(record::getMjunlostokno)
                .set(caroptcard).equalToWhenPresent(record::getCaroptcard);
    }
}