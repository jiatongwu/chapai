package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.ZhPersonDynamicSqlSupport.*;

import cn.xvkang.primaryentity.ZhPerson;
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
public interface ZhPersonDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.968+08:00", comments="Source Table: zh_Person")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.968+08:00", comments="Source Table: zh_Person")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.968+08:00", comments="Source Table: zh_Person")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<ZhPerson> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.968+08:00", comments="Source Table: zh_Person")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ZhPersonResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER),
        @Result(column="userNo", property="userno", jdbcType=JdbcType.VARCHAR),
        @Result(column="userName", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType=JdbcType.VARCHAR),
        @Result(column="homeAddress", property="homeaddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="mobNumber", property="mobnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="carSpalcesNum", property="carspalcesnum", jdbcType=JdbcType.VARCHAR),
        @Result(column="synflag", property="synflag", jdbcType=JdbcType.INTEGER)
    })
    List<ZhPerson> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.968+08:00", comments="Source Table: zh_Person")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.968+08:00", comments="Source Table: zh_Person")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(zhPerson);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.968+08:00", comments="Source Table: zh_Person")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, zhPerson);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.968+08:00", comments="Source Table: zh_Person")
    default int insert(ZhPerson record) {
        return insert(SqlBuilder.insert(record)
                .into(zhPerson)
                .map(userno).toProperty("userno")
                .map(username).toProperty("username")
                .map(sex).toProperty("sex")
                .map(homeaddress).toProperty("homeaddress")
                .map(mobnumber).toProperty("mobnumber")
                .map(carspalcesnum).toProperty("carspalcesnum")
                .map(synflag).toProperty("synflag")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.968+08:00", comments="Source Table: zh_Person")
    default int insertSelective(ZhPerson record) {
        return insert(SqlBuilder.insert(record)
                .into(zhPerson)
                .map(userno).toPropertyWhenPresent("userno", record::getUserno)
                .map(username).toPropertyWhenPresent("username", record::getUsername)
                .map(sex).toPropertyWhenPresent("sex", record::getSex)
                .map(homeaddress).toPropertyWhenPresent("homeaddress", record::getHomeaddress)
                .map(mobnumber).toPropertyWhenPresent("mobnumber", record::getMobnumber)
                .map(carspalcesnum).toPropertyWhenPresent("carspalcesnum", record::getCarspalcesnum)
                .map(synflag).toPropertyWhenPresent("synflag", record::getSynflag)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.968+08:00", comments="Source Table: zh_Person")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ZhPerson>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, userno, username, sex, homeaddress, mobnumber, carspalcesnum, synflag)
                .from(zhPerson);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.968+08:00", comments="Source Table: zh_Person")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ZhPerson>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, userno, username, sex, homeaddress, mobnumber, carspalcesnum, synflag)
                .from(zhPerson);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.968+08:00", comments="Source Table: zh_Person")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(ZhPerson record) {
        return UpdateDSL.updateWithMapper(this::update, zhPerson)
                .set(userno).equalTo(record::getUserno)
                .set(username).equalTo(record::getUsername)
                .set(sex).equalTo(record::getSex)
                .set(homeaddress).equalTo(record::getHomeaddress)
                .set(mobnumber).equalTo(record::getMobnumber)
                .set(carspalcesnum).equalTo(record::getCarspalcesnum)
                .set(synflag).equalTo(record::getSynflag);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.968+08:00", comments="Source Table: zh_Person")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(ZhPerson record) {
        return UpdateDSL.updateWithMapper(this::update, zhPerson)
                .set(userno).equalToWhenPresent(record::getUserno)
                .set(username).equalToWhenPresent(record::getUsername)
                .set(sex).equalToWhenPresent(record::getSex)
                .set(homeaddress).equalToWhenPresent(record::getHomeaddress)
                .set(mobnumber).equalToWhenPresent(record::getMobnumber)
                .set(carspalcesnum).equalToWhenPresent(record::getCarspalcesnum)
                .set(synflag).equalToWhenPresent(record::getSynflag);
    }
}