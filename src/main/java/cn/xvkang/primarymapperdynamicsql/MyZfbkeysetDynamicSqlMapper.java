package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MyZfbkeysetDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.MyZfbkeyset;
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
public interface MyZfbkeysetDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.154+08:00", comments="Source Table: My_ZFBKeySet")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.154+08:00", comments="Source Table: My_ZFBKeySet")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.154+08:00", comments="Source Table: My_ZFBKeySet")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<MyZfbkeyset> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.154+08:00", comments="Source Table: My_ZFBKeySet")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MyZfbkeysetResult")
    MyZfbkeyset selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.154+08:00", comments="Source Table: My_ZFBKeySet")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MyZfbkeysetResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="alipay_rsa_public_key", property="alipayRsaPublicKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="rsa_private_key", property="rsaPrivateKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="Rs1", property="rs1", jdbcType=JdbcType.VARCHAR),
        @Result(column="Rs2", property="rs2", jdbcType=JdbcType.VARCHAR),
        @Result(column="Rs3", property="rs3", jdbcType=JdbcType.VARCHAR)
    })
    List<MyZfbkeyset> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.154+08:00", comments="Source Table: My_ZFBKeySet")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.154+08:00", comments="Source Table: My_ZFBKeySet")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(myZfbkeyset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.154+08:00", comments="Source Table: My_ZFBKeySet")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, myZfbkeyset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.154+08:00", comments="Source Table: My_ZFBKeySet")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, myZfbkeyset)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.154+08:00", comments="Source Table: My_ZFBKeySet")
    default int insert(MyZfbkeyset record) {
        return insert(SqlBuilder.insert(record)
                .into(myZfbkeyset)
                .map(alipayRsaPublicKey).toProperty("alipayRsaPublicKey")
                .map(rsaPrivateKey).toProperty("rsaPrivateKey")
                .map(rs1).toProperty("rs1")
                .map(rs2).toProperty("rs2")
                .map(rs3).toProperty("rs3")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.154+08:00", comments="Source Table: My_ZFBKeySet")
    default int insertSelective(MyZfbkeyset record) {
        return insert(SqlBuilder.insert(record)
                .into(myZfbkeyset)
                .map(alipayRsaPublicKey).toPropertyWhenPresent("alipayRsaPublicKey", record::getAlipayRsaPublicKey)
                .map(rsaPrivateKey).toPropertyWhenPresent("rsaPrivateKey", record::getRsaPrivateKey)
                .map(rs1).toPropertyWhenPresent("rs1", record::getRs1)
                .map(rs2).toPropertyWhenPresent("rs2", record::getRs2)
                .map(rs3).toPropertyWhenPresent("rs3", record::getRs3)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.154+08:00", comments="Source Table: My_ZFBKeySet")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<MyZfbkeyset>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, alipayRsaPublicKey, rsaPrivateKey, rs1, rs2, rs3)
                .from(myZfbkeyset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.154+08:00", comments="Source Table: My_ZFBKeySet")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<MyZfbkeyset>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, alipayRsaPublicKey, rsaPrivateKey, rs1, rs2, rs3)
                .from(myZfbkeyset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.154+08:00", comments="Source Table: My_ZFBKeySet")
    default MyZfbkeyset selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, alipayRsaPublicKey, rsaPrivateKey, rs1, rs2, rs3)
                .from(myZfbkeyset)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.154+08:00", comments="Source Table: My_ZFBKeySet")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(MyZfbkeyset record) {
        return UpdateDSL.updateWithMapper(this::update, myZfbkeyset)
                .set(alipayRsaPublicKey).equalTo(record::getAlipayRsaPublicKey)
                .set(rsaPrivateKey).equalTo(record::getRsaPrivateKey)
                .set(rs1).equalTo(record::getRs1)
                .set(rs2).equalTo(record::getRs2)
                .set(rs3).equalTo(record::getRs3);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.154+08:00", comments="Source Table: My_ZFBKeySet")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(MyZfbkeyset record) {
        return UpdateDSL.updateWithMapper(this::update, myZfbkeyset)
                .set(alipayRsaPublicKey).equalToWhenPresent(record::getAlipayRsaPublicKey)
                .set(rsaPrivateKey).equalToWhenPresent(record::getRsaPrivateKey)
                .set(rs1).equalToWhenPresent(record::getRs1)
                .set(rs2).equalToWhenPresent(record::getRs2)
                .set(rs3).equalToWhenPresent(record::getRs3);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.154+08:00", comments="Source Table: My_ZFBKeySet")
    default int updateByPrimaryKey(MyZfbkeyset record) {
        return UpdateDSL.updateWithMapper(this::update, myZfbkeyset)
                .set(alipayRsaPublicKey).equalTo(record::getAlipayRsaPublicKey)
                .set(rsaPrivateKey).equalTo(record::getRsaPrivateKey)
                .set(rs1).equalTo(record::getRs1)
                .set(rs2).equalTo(record::getRs2)
                .set(rs3).equalTo(record::getRs3)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.154+08:00", comments="Source Table: My_ZFBKeySet")
    default int updateByPrimaryKeySelective(MyZfbkeyset record) {
        return UpdateDSL.updateWithMapper(this::update, myZfbkeyset)
                .set(alipayRsaPublicKey).equalToWhenPresent(record::getAlipayRsaPublicKey)
                .set(rsaPrivateKey).equalToWhenPresent(record::getRsaPrivateKey)
                .set(rs1).equalToWhenPresent(record::getRs1)
                .set(rs2).equalToWhenPresent(record::getRs2)
                .set(rs3).equalToWhenPresent(record::getRs3)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}