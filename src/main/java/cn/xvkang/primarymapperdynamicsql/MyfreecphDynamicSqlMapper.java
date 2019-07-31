package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MyfreecphDynamicSqlSupport.*;

import cn.xvkang.primaryentity.Myfreecph;
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
public interface MyfreecphDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.113+08:00", comments="Source Table: MyFreeCPH")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.113+08:00", comments="Source Table: MyFreeCPH")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.113+08:00", comments="Source Table: MyFreeCPH")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Myfreecph> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.114+08:00", comments="Source Table: MyFreeCPH")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MyfreecphResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.BIGINT),
        @Result(column="CPH", property="cph", jdbcType=JdbcType.VARCHAR),
        @Result(column="FreeStartTime", property="freestarttime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="Sign", property="sign", jdbcType=JdbcType.SMALLINT),
        @Result(column="Remarks", property="remarks", jdbcType=JdbcType.VARCHAR),
        @Result(column="FreeEndTime", property="freeendtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="AddTime", property="addtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="Operator", property="operator", jdbcType=JdbcType.VARCHAR),
        @Result(column="PCName", property="pcname", jdbcType=JdbcType.VARCHAR)
    })
    List<Myfreecph> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.114+08:00", comments="Source Table: MyFreeCPH")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.114+08:00", comments="Source Table: MyFreeCPH")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(myfreecph);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.114+08:00", comments="Source Table: MyFreeCPH")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, myfreecph);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.114+08:00", comments="Source Table: MyFreeCPH")
    default int insert(Myfreecph record) {
        return insert(SqlBuilder.insert(record)
                .into(myfreecph)
                .map(id).toProperty("id")
                .map(cph).toProperty("cph")
                .map(freestarttime).toProperty("freestarttime")
                .map(sign).toProperty("sign")
                .map(remarks).toProperty("remarks")
                .map(freeendtime).toProperty("freeendtime")
                .map(addtime).toProperty("addtime")
                .map(operator).toProperty("operator")
                .map(pcname).toProperty("pcname")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.114+08:00", comments="Source Table: MyFreeCPH")
    default int insertSelective(Myfreecph record) {
        return insert(SqlBuilder.insert(record)
                .into(myfreecph)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(cph).toPropertyWhenPresent("cph", record::getCph)
                .map(freestarttime).toPropertyWhenPresent("freestarttime", record::getFreestarttime)
                .map(sign).toPropertyWhenPresent("sign", record::getSign)
                .map(remarks).toPropertyWhenPresent("remarks", record::getRemarks)
                .map(freeendtime).toPropertyWhenPresent("freeendtime", record::getFreeendtime)
                .map(addtime).toPropertyWhenPresent("addtime", record::getAddtime)
                .map(operator).toPropertyWhenPresent("operator", record::getOperator)
                .map(pcname).toPropertyWhenPresent("pcname", record::getPcname)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.114+08:00", comments="Source Table: MyFreeCPH")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myfreecph>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, cph, freestarttime, sign, remarks, freeendtime, addtime, operator, pcname)
                .from(myfreecph);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.114+08:00", comments="Source Table: MyFreeCPH")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myfreecph>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, cph, freestarttime, sign, remarks, freeendtime, addtime, operator, pcname)
                .from(myfreecph);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.114+08:00", comments="Source Table: MyFreeCPH")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Myfreecph record) {
        return UpdateDSL.updateWithMapper(this::update, myfreecph)
                .set(id).equalTo(record::getId)
                .set(cph).equalTo(record::getCph)
                .set(freestarttime).equalTo(record::getFreestarttime)
                .set(sign).equalTo(record::getSign)
                .set(remarks).equalTo(record::getRemarks)
                .set(freeendtime).equalTo(record::getFreeendtime)
                .set(addtime).equalTo(record::getAddtime)
                .set(operator).equalTo(record::getOperator)
                .set(pcname).equalTo(record::getPcname);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.114+08:00", comments="Source Table: MyFreeCPH")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Myfreecph record) {
        return UpdateDSL.updateWithMapper(this::update, myfreecph)
                .set(id).equalToWhenPresent(record::getId)
                .set(cph).equalToWhenPresent(record::getCph)
                .set(freestarttime).equalToWhenPresent(record::getFreestarttime)
                .set(sign).equalToWhenPresent(record::getSign)
                .set(remarks).equalToWhenPresent(record::getRemarks)
                .set(freeendtime).equalToWhenPresent(record::getFreeendtime)
                .set(addtime).equalToWhenPresent(record::getAddtime)
                .set(operator).equalToWhenPresent(record::getOperator)
                .set(pcname).equalToWhenPresent(record::getPcname);
    }
}