package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MysqlnamepeizhiDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.Mysqlnamepeizhi;
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
public interface MysqlnamepeizhiDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.652+08:00", comments="Source Table: MYSQLNAMEPEIZHI")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.652+08:00", comments="Source Table: MYSQLNAMEPEIZHI")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.652+08:00", comments="Source Table: MYSQLNAMEPEIZHI")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<Mysqlnamepeizhi> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.652+08:00", comments="Source Table: MYSQLNAMEPEIZHI")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MysqlnamepeizhiResult")
    Mysqlnamepeizhi selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.652+08:00", comments="Source Table: MYSQLNAMEPEIZHI")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MysqlnamepeizhiResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="EN_Name", property="enName", jdbcType=JdbcType.VARCHAR),
        @Result(column="CH_Name", property="chName", jdbcType=JdbcType.VARCHAR),
        @Result(column="Type", property="type", jdbcType=JdbcType.VARCHAR)
    })
    List<Mysqlnamepeizhi> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.652+08:00", comments="Source Table: MYSQLNAMEPEIZHI")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.652+08:00", comments="Source Table: MYSQLNAMEPEIZHI")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(mysqlnamepeizhi);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.652+08:00", comments="Source Table: MYSQLNAMEPEIZHI")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, mysqlnamepeizhi);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.652+08:00", comments="Source Table: MYSQLNAMEPEIZHI")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, mysqlnamepeizhi)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.652+08:00", comments="Source Table: MYSQLNAMEPEIZHI")
    default int insert(Mysqlnamepeizhi record) {
        return insert(SqlBuilder.insert(record)
                .into(mysqlnamepeizhi)
                .map(enName).toProperty("enName")
                .map(chName).toProperty("chName")
                .map(type).toProperty("type")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.653+08:00", comments="Source Table: MYSQLNAMEPEIZHI")
    default int insertSelective(Mysqlnamepeizhi record) {
        return insert(SqlBuilder.insert(record)
                .into(mysqlnamepeizhi)
                .map(enName).toPropertyWhenPresent("enName", record::getEnName)
                .map(chName).toPropertyWhenPresent("chName", record::getChName)
                .map(type).toPropertyWhenPresent("type", record::getType)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.653+08:00", comments="Source Table: MYSQLNAMEPEIZHI")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Mysqlnamepeizhi>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, enName, chName, type)
                .from(mysqlnamepeizhi);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.653+08:00", comments="Source Table: MYSQLNAMEPEIZHI")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Mysqlnamepeizhi>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, enName, chName, type)
                .from(mysqlnamepeizhi);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.653+08:00", comments="Source Table: MYSQLNAMEPEIZHI")
    default Mysqlnamepeizhi selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, enName, chName, type)
                .from(mysqlnamepeizhi)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.653+08:00", comments="Source Table: MYSQLNAMEPEIZHI")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Mysqlnamepeizhi record) {
        return UpdateDSL.updateWithMapper(this::update, mysqlnamepeizhi)
                .set(enName).equalTo(record::getEnName)
                .set(chName).equalTo(record::getChName)
                .set(type).equalTo(record::getType);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.653+08:00", comments="Source Table: MYSQLNAMEPEIZHI")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Mysqlnamepeizhi record) {
        return UpdateDSL.updateWithMapper(this::update, mysqlnamepeizhi)
                .set(enName).equalToWhenPresent(record::getEnName)
                .set(chName).equalToWhenPresent(record::getChName)
                .set(type).equalToWhenPresent(record::getType);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.653+08:00", comments="Source Table: MYSQLNAMEPEIZHI")
    default int updateByPrimaryKey(Mysqlnamepeizhi record) {
        return UpdateDSL.updateWithMapper(this::update, mysqlnamepeizhi)
                .set(enName).equalTo(record::getEnName)
                .set(chName).equalTo(record::getChName)
                .set(type).equalTo(record::getType)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.653+08:00", comments="Source Table: MYSQLNAMEPEIZHI")
    default int updateByPrimaryKeySelective(Mysqlnamepeizhi record) {
        return UpdateDSL.updateWithMapper(this::update, mysqlnamepeizhi)
                .set(enName).equalToWhenPresent(record::getEnName)
                .set(chName).equalToWhenPresent(record::getChName)
                .set(type).equalToWhenPresent(record::getType)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}