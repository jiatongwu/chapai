package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MycaozuoyuanDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.Mycaozuoyuan;
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
public interface MycaozuoyuanDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.702+08:00", comments="Source Table: MYCAOZUOYUAN")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.702+08:00", comments="Source Table: MYCAOZUOYUAN")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.702+08:00", comments="Source Table: MYCAOZUOYUAN")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.cardno", before=false, resultType=String.class)
    int insert(InsertStatementProvider<Mycaozuoyuan> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.702+08:00", comments="Source Table: MYCAOZUOYUAN")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MycaozuoyuanResult")
    Mycaozuoyuan selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.702+08:00", comments="Source Table: MYCAOZUOYUAN")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MycaozuoyuanResult", value = {
        @Result(column="CardNO", property="cardno", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER),
        @Result(column="CardType", property="cardtype", jdbcType=JdbcType.VARCHAR),
        @Result(column="UserNO", property="userno", jdbcType=JdbcType.VARCHAR),
        @Result(column="UserName", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="DeptName", property="deptname", jdbcType=JdbcType.VARCHAR),
        @Result(column="Pwd", property="pwd", jdbcType=JdbcType.VARCHAR),
        @Result(column="CardState", property="cardstate", jdbcType=JdbcType.INTEGER),
        @Result(column="UserLevel", property="userlevel", jdbcType=JdbcType.INTEGER)
    })
    List<Mycaozuoyuan> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.702+08:00", comments="Source Table: MYCAOZUOYUAN")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.702+08:00", comments="Source Table: MYCAOZUOYUAN")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(mycaozuoyuan);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.702+08:00", comments="Source Table: MYCAOZUOYUAN")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, mycaozuoyuan);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.702+08:00", comments="Source Table: MYCAOZUOYUAN")
    default int deleteByPrimaryKey(String cardno_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, mycaozuoyuan)
                .where(cardno, isEqualTo(cardno_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.702+08:00", comments="Source Table: MYCAOZUOYUAN")
    default int insert(Mycaozuoyuan record) {
        return insert(SqlBuilder.insert(record)
                .into(mycaozuoyuan)
                .map(id).toProperty("id")
                .map(cardtype).toProperty("cardtype")
                .map(userno).toProperty("userno")
                .map(username).toProperty("username")
                .map(deptname).toProperty("deptname")
                .map(pwd).toProperty("pwd")
                .map(cardstate).toProperty("cardstate")
                .map(userlevel).toProperty("userlevel")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.702+08:00", comments="Source Table: MYCAOZUOYUAN")
    default int insertSelective(Mycaozuoyuan record) {
        return insert(SqlBuilder.insert(record)
                .into(mycaozuoyuan)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(cardtype).toPropertyWhenPresent("cardtype", record::getCardtype)
                .map(userno).toPropertyWhenPresent("userno", record::getUserno)
                .map(username).toPropertyWhenPresent("username", record::getUsername)
                .map(deptname).toPropertyWhenPresent("deptname", record::getDeptname)
                .map(pwd).toPropertyWhenPresent("pwd", record::getPwd)
                .map(cardstate).toPropertyWhenPresent("cardstate", record::getCardstate)
                .map(userlevel).toPropertyWhenPresent("userlevel", record::getUserlevel)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.702+08:00", comments="Source Table: MYCAOZUOYUAN")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Mycaozuoyuan>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, cardno, id, cardtype, userno, username, deptname, pwd, cardstate, userlevel)
                .from(mycaozuoyuan);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.702+08:00", comments="Source Table: MYCAOZUOYUAN")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Mycaozuoyuan>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, cardno, id, cardtype, userno, username, deptname, pwd, cardstate, userlevel)
                .from(mycaozuoyuan);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.703+08:00", comments="Source Table: MYCAOZUOYUAN")
    default Mycaozuoyuan selectByPrimaryKey(String cardno_) {
        return SelectDSL.selectWithMapper(this::selectOne, cardno, id, cardtype, userno, username, deptname, pwd, cardstate, userlevel)
                .from(mycaozuoyuan)
                .where(cardno, isEqualTo(cardno_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.703+08:00", comments="Source Table: MYCAOZUOYUAN")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Mycaozuoyuan record) {
        return UpdateDSL.updateWithMapper(this::update, mycaozuoyuan)
                .set(id).equalTo(record::getId)
                .set(cardtype).equalTo(record::getCardtype)
                .set(userno).equalTo(record::getUserno)
                .set(username).equalTo(record::getUsername)
                .set(deptname).equalTo(record::getDeptname)
                .set(pwd).equalTo(record::getPwd)
                .set(cardstate).equalTo(record::getCardstate)
                .set(userlevel).equalTo(record::getUserlevel);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.703+08:00", comments="Source Table: MYCAOZUOYUAN")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Mycaozuoyuan record) {
        return UpdateDSL.updateWithMapper(this::update, mycaozuoyuan)
                .set(id).equalToWhenPresent(record::getId)
                .set(cardtype).equalToWhenPresent(record::getCardtype)
                .set(userno).equalToWhenPresent(record::getUserno)
                .set(username).equalToWhenPresent(record::getUsername)
                .set(deptname).equalToWhenPresent(record::getDeptname)
                .set(pwd).equalToWhenPresent(record::getPwd)
                .set(cardstate).equalToWhenPresent(record::getCardstate)
                .set(userlevel).equalToWhenPresent(record::getUserlevel);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.703+08:00", comments="Source Table: MYCAOZUOYUAN")
    default int updateByPrimaryKey(Mycaozuoyuan record) {
        return UpdateDSL.updateWithMapper(this::update, mycaozuoyuan)
                .set(id).equalTo(record::getId)
                .set(cardtype).equalTo(record::getCardtype)
                .set(userno).equalTo(record::getUserno)
                .set(username).equalTo(record::getUsername)
                .set(deptname).equalTo(record::getDeptname)
                .set(pwd).equalTo(record::getPwd)
                .set(cardstate).equalTo(record::getCardstate)
                .set(userlevel).equalTo(record::getUserlevel)
                .where(cardno, isEqualTo(record::getCardno))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.703+08:00", comments="Source Table: MYCAOZUOYUAN")
    default int updateByPrimaryKeySelective(Mycaozuoyuan record) {
        return UpdateDSL.updateWithMapper(this::update, mycaozuoyuan)
                .set(id).equalToWhenPresent(record::getId)
                .set(cardtype).equalToWhenPresent(record::getCardtype)
                .set(userno).equalToWhenPresent(record::getUserno)
                .set(username).equalToWhenPresent(record::getUsername)
                .set(deptname).equalToWhenPresent(record::getDeptname)
                .set(pwd).equalToWhenPresent(record::getPwd)
                .set(cardstate).equalToWhenPresent(record::getCardstate)
                .set(userlevel).equalToWhenPresent(record::getUserlevel)
                .where(cardno, isEqualTo(record::getCardno))
                .build()
                .execute();
    }
}