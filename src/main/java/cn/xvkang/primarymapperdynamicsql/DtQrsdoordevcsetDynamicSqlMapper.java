package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.DtQrsdoordevcsetDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.DtQrsdoordevcset;
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
public interface DtQrsdoordevcsetDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.943+08:00", comments="Source Table: Dt_qrsDoorDevcSet")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.943+08:00", comments="Source Table: Dt_qrsDoorDevcSet")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.943+08:00", comments="Source Table: Dt_qrsDoorDevcSet")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.devcnum", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<DtQrsdoordevcset> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.943+08:00", comments="Source Table: Dt_qrsDoorDevcSet")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("DtQrsdoordevcsetResult")
    DtQrsdoordevcset selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.943+08:00", comments="Source Table: Dt_qrsDoorDevcSet")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="DtQrsdoordevcsetResult", value = {
        @Result(column="DevcNum", property="devcnum", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="DoorNum", property="doornum", jdbcType=JdbcType.INTEGER),
        @Result(column="DoorPace", property="doorpace", jdbcType=JdbcType.VARCHAR)
    })
    List<DtQrsdoordevcset> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.944+08:00", comments="Source Table: Dt_qrsDoorDevcSet")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.944+08:00", comments="Source Table: Dt_qrsDoorDevcSet")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(dtQrsdoordevcset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.944+08:00", comments="Source Table: Dt_qrsDoorDevcSet")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, dtQrsdoordevcset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.944+08:00", comments="Source Table: Dt_qrsDoorDevcSet")
    default int deleteByPrimaryKey(Integer devcnum_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, dtQrsdoordevcset)
                .where(devcnum, isEqualTo(devcnum_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.944+08:00", comments="Source Table: Dt_qrsDoorDevcSet")
    default int insert(DtQrsdoordevcset record) {
        return insert(SqlBuilder.insert(record)
                .into(dtQrsdoordevcset)
                .map(doornum).toProperty("doornum")
                .map(doorpace).toProperty("doorpace")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.944+08:00", comments="Source Table: Dt_qrsDoorDevcSet")
    default int insertSelective(DtQrsdoordevcset record) {
        return insert(SqlBuilder.insert(record)
                .into(dtQrsdoordevcset)
                .map(doornum).toPropertyWhenPresent("doornum", record::getDoornum)
                .map(doorpace).toPropertyWhenPresent("doorpace", record::getDoorpace)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.944+08:00", comments="Source Table: Dt_qrsDoorDevcSet")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<DtQrsdoordevcset>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, devcnum, doornum, doorpace)
                .from(dtQrsdoordevcset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.944+08:00", comments="Source Table: Dt_qrsDoorDevcSet")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<DtQrsdoordevcset>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, devcnum, doornum, doorpace)
                .from(dtQrsdoordevcset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.944+08:00", comments="Source Table: Dt_qrsDoorDevcSet")
    default DtQrsdoordevcset selectByPrimaryKey(Integer devcnum_) {
        return SelectDSL.selectWithMapper(this::selectOne, devcnum, doornum, doorpace)
                .from(dtQrsdoordevcset)
                .where(devcnum, isEqualTo(devcnum_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.944+08:00", comments="Source Table: Dt_qrsDoorDevcSet")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(DtQrsdoordevcset record) {
        return UpdateDSL.updateWithMapper(this::update, dtQrsdoordevcset)
                .set(doornum).equalTo(record::getDoornum)
                .set(doorpace).equalTo(record::getDoorpace);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.944+08:00", comments="Source Table: Dt_qrsDoorDevcSet")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(DtQrsdoordevcset record) {
        return UpdateDSL.updateWithMapper(this::update, dtQrsdoordevcset)
                .set(doornum).equalToWhenPresent(record::getDoornum)
                .set(doorpace).equalToWhenPresent(record::getDoorpace);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.944+08:00", comments="Source Table: Dt_qrsDoorDevcSet")
    default int updateByPrimaryKey(DtQrsdoordevcset record) {
        return UpdateDSL.updateWithMapper(this::update, dtQrsdoordevcset)
                .set(doornum).equalTo(record::getDoornum)
                .set(doorpace).equalTo(record::getDoorpace)
                .where(devcnum, isEqualTo(record::getDevcnum))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.944+08:00", comments="Source Table: Dt_qrsDoorDevcSet")
    default int updateByPrimaryKeySelective(DtQrsdoordevcset record) {
        return UpdateDSL.updateWithMapper(this::update, dtQrsdoordevcset)
                .set(doornum).equalToWhenPresent(record::getDoornum)
                .set(doorpace).equalToWhenPresent(record::getDoorpace)
                .where(devcnum, isEqualTo(record::getDevcnum))
                .build()
                .execute();
    }
}