package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.QrYantimesetDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.QrYantimeset;
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
public interface QrYantimesetDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.467+08:00", comments="Source Table: Qr_YanTimeSet")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.467+08:00", comments="Source Table: Qr_YanTimeSet")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.467+08:00", comments="Source Table: Qr_YanTimeSet")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<QrYantimeset> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.467+08:00", comments="Source Table: Qr_YanTimeSet")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("QrYantimesetResult")
    QrYantimeset selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.467+08:00", comments="Source Table: Qr_YanTimeSet")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="QrYantimesetResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="DevcNum", property="devcnum", jdbcType=JdbcType.INTEGER),
        @Result(column="Yanshi", property="yanshi", jdbcType=JdbcType.VARCHAR)
    })
    List<QrYantimeset> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.468+08:00", comments="Source Table: Qr_YanTimeSet")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.468+08:00", comments="Source Table: Qr_YanTimeSet")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(qrYantimeset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.468+08:00", comments="Source Table: Qr_YanTimeSet")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, qrYantimeset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.468+08:00", comments="Source Table: Qr_YanTimeSet")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, qrYantimeset)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.468+08:00", comments="Source Table: Qr_YanTimeSet")
    default int insert(QrYantimeset record) {
        return insert(SqlBuilder.insert(record)
                .into(qrYantimeset)
                .map(devcnum).toProperty("devcnum")
                .map(yanshi).toProperty("yanshi")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.468+08:00", comments="Source Table: Qr_YanTimeSet")
    default int insertSelective(QrYantimeset record) {
        return insert(SqlBuilder.insert(record)
                .into(qrYantimeset)
                .map(devcnum).toPropertyWhenPresent("devcnum", record::getDevcnum)
                .map(yanshi).toPropertyWhenPresent("yanshi", record::getYanshi)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.468+08:00", comments="Source Table: Qr_YanTimeSet")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<QrYantimeset>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, devcnum, yanshi)
                .from(qrYantimeset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.468+08:00", comments="Source Table: Qr_YanTimeSet")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<QrYantimeset>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, devcnum, yanshi)
                .from(qrYantimeset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.468+08:00", comments="Source Table: Qr_YanTimeSet")
    default QrYantimeset selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, devcnum, yanshi)
                .from(qrYantimeset)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.468+08:00", comments="Source Table: Qr_YanTimeSet")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(QrYantimeset record) {
        return UpdateDSL.updateWithMapper(this::update, qrYantimeset)
                .set(devcnum).equalTo(record::getDevcnum)
                .set(yanshi).equalTo(record::getYanshi);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.468+08:00", comments="Source Table: Qr_YanTimeSet")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(QrYantimeset record) {
        return UpdateDSL.updateWithMapper(this::update, qrYantimeset)
                .set(devcnum).equalToWhenPresent(record::getDevcnum)
                .set(yanshi).equalToWhenPresent(record::getYanshi);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.468+08:00", comments="Source Table: Qr_YanTimeSet")
    default int updateByPrimaryKey(QrYantimeset record) {
        return UpdateDSL.updateWithMapper(this::update, qrYantimeset)
                .set(devcnum).equalTo(record::getDevcnum)
                .set(yanshi).equalTo(record::getYanshi)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.468+08:00", comments="Source Table: Qr_YanTimeSet")
    default int updateByPrimaryKeySelective(QrYantimeset record) {
        return UpdateDSL.updateWithMapper(this::update, qrYantimeset)
                .set(devcnum).equalToWhenPresent(record::getDevcnum)
                .set(yanshi).equalToWhenPresent(record::getYanshi)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}