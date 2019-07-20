package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.SerTequanmodeDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.SerTequanmode;
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
public interface SerTequanmodeDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.515+08:00", comments="Source Table: Ser_TeQuanMode")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.515+08:00", comments="Source Table: Ser_TeQuanMode")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.515+08:00", comments="Source Table: Ser_TeQuanMode")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<SerTequanmode> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.515+08:00", comments="Source Table: Ser_TeQuanMode")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SerTequanmodeResult")
    SerTequanmode selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.515+08:00", comments="Source Table: Ser_TeQuanMode")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SerTequanmodeResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="Devcid", property="devcid", jdbcType=JdbcType.INTEGER),
        @Result(column="Doorid", property="doorid", jdbcType=JdbcType.INTEGER),
        @Result(column="DoorMode", property="doormode", jdbcType=JdbcType.VARCHAR)
    })
    List<SerTequanmode> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.515+08:00", comments="Source Table: Ser_TeQuanMode")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.515+08:00", comments="Source Table: Ser_TeQuanMode")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(serTequanmode);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.515+08:00", comments="Source Table: Ser_TeQuanMode")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, serTequanmode);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.515+08:00", comments="Source Table: Ser_TeQuanMode")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, serTequanmode)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.515+08:00", comments="Source Table: Ser_TeQuanMode")
    default int insert(SerTequanmode record) {
        return insert(SqlBuilder.insert(record)
                .into(serTequanmode)
                .map(devcid).toProperty("devcid")
                .map(doorid).toProperty("doorid")
                .map(doormode).toProperty("doormode")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.515+08:00", comments="Source Table: Ser_TeQuanMode")
    default int insertSelective(SerTequanmode record) {
        return insert(SqlBuilder.insert(record)
                .into(serTequanmode)
                .map(devcid).toPropertyWhenPresent("devcid", record::getDevcid)
                .map(doorid).toPropertyWhenPresent("doorid", record::getDoorid)
                .map(doormode).toPropertyWhenPresent("doormode", record::getDoormode)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.515+08:00", comments="Source Table: Ser_TeQuanMode")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<SerTequanmode>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, devcid, doorid, doormode)
                .from(serTequanmode);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.515+08:00", comments="Source Table: Ser_TeQuanMode")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<SerTequanmode>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, devcid, doorid, doormode)
                .from(serTequanmode);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.515+08:00", comments="Source Table: Ser_TeQuanMode")
    default SerTequanmode selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, devcid, doorid, doormode)
                .from(serTequanmode)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.516+08:00", comments="Source Table: Ser_TeQuanMode")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(SerTequanmode record) {
        return UpdateDSL.updateWithMapper(this::update, serTequanmode)
                .set(devcid).equalTo(record::getDevcid)
                .set(doorid).equalTo(record::getDoorid)
                .set(doormode).equalTo(record::getDoormode);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.516+08:00", comments="Source Table: Ser_TeQuanMode")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(SerTequanmode record) {
        return UpdateDSL.updateWithMapper(this::update, serTequanmode)
                .set(devcid).equalToWhenPresent(record::getDevcid)
                .set(doorid).equalToWhenPresent(record::getDoorid)
                .set(doormode).equalToWhenPresent(record::getDoormode);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.516+08:00", comments="Source Table: Ser_TeQuanMode")
    default int updateByPrimaryKey(SerTequanmode record) {
        return UpdateDSL.updateWithMapper(this::update, serTequanmode)
                .set(devcid).equalTo(record::getDevcid)
                .set(doorid).equalTo(record::getDoorid)
                .set(doormode).equalTo(record::getDoormode)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.516+08:00", comments="Source Table: Ser_TeQuanMode")
    default int updateByPrimaryKeySelective(SerTequanmode record) {
        return UpdateDSL.updateWithMapper(this::update, serTequanmode)
                .set(devcid).equalToWhenPresent(record::getDevcid)
                .set(doorid).equalToWhenPresent(record::getDoorid)
                .set(doormode).equalToWhenPresent(record::getDoormode)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}