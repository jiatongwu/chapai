package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MCardtypeDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.MCardtype;
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
public interface MCardtypeDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.713+08:00", comments="Source Table: M_CardType")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.713+08:00", comments="Source Table: M_CardType")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.713+08:00", comments="Source Table: M_CardType")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.carid", before=true, resultType=Integer.class)
    int insert(InsertStatementProvider<MCardtype> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.713+08:00", comments="Source Table: M_CardType")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MCardtypeResult")
    MCardtype selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.713+08:00", comments="Source Table: M_CardType")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MCardtypeResult", value = {
        @Result(column="carid", property="carid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="carCname", property="carcname", jdbcType=JdbcType.VARCHAR),
        @Result(column="carEname", property="carename", jdbcType=JdbcType.VARCHAR),
        @Result(column="carMark", property="carmark", jdbcType=JdbcType.VARCHAR)
    })
    List<MCardtype> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.713+08:00", comments="Source Table: M_CardType")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.713+08:00", comments="Source Table: M_CardType")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(MCardtype);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.713+08:00", comments="Source Table: M_CardType")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, MCardtype);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.713+08:00", comments="Source Table: M_CardType")
    default int deleteByPrimaryKey(Integer carid_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, MCardtype)
                .where(carid, isEqualTo(carid_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.714+08:00", comments="Source Table: M_CardType")
    default int insert(MCardtype record) {
        return insert(SqlBuilder.insert(record)
                .into(MCardtype)
                .map(carid).toProperty("carid")
                .map(carcname).toProperty("carcname")
                .map(carename).toProperty("carename")
                .map(carmark).toProperty("carmark")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.714+08:00", comments="Source Table: M_CardType")
    default int insertSelective(MCardtype record) {
        return insert(SqlBuilder.insert(record)
                .into(MCardtype)
                .map(carid).toProperty("carid")
                .map(carcname).toPropertyWhenPresent("carcname", record::getCarcname)
                .map(carename).toPropertyWhenPresent("carename", record::getCarename)
                .map(carmark).toPropertyWhenPresent("carmark", record::getCarmark)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.714+08:00", comments="Source Table: M_CardType")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<MCardtype>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, carid, carcname, carename, carmark)
                .from(MCardtype);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.714+08:00", comments="Source Table: M_CardType")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<MCardtype>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, carid, carcname, carename, carmark)
                .from(MCardtype);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.714+08:00", comments="Source Table: M_CardType")
    default MCardtype selectByPrimaryKey(Integer carid_) {
        return SelectDSL.selectWithMapper(this::selectOne, carid, carcname, carename, carmark)
                .from(MCardtype)
                .where(carid, isEqualTo(carid_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.714+08:00", comments="Source Table: M_CardType")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(MCardtype record) {
        return UpdateDSL.updateWithMapper(this::update, MCardtype)
                .set(carid).equalTo(record::getCarid)
                .set(carcname).equalTo(record::getCarcname)
                .set(carename).equalTo(record::getCarename)
                .set(carmark).equalTo(record::getCarmark);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.714+08:00", comments="Source Table: M_CardType")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(MCardtype record) {
        return UpdateDSL.updateWithMapper(this::update, MCardtype)
                .set(carid).equalToWhenPresent(record::getCarid)
                .set(carcname).equalToWhenPresent(record::getCarcname)
                .set(carename).equalToWhenPresent(record::getCarename)
                .set(carmark).equalToWhenPresent(record::getCarmark);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.714+08:00", comments="Source Table: M_CardType")
    default int updateByPrimaryKey(MCardtype record) {
        return UpdateDSL.updateWithMapper(this::update, MCardtype)
                .set(carcname).equalTo(record::getCarcname)
                .set(carename).equalTo(record::getCarename)
                .set(carmark).equalTo(record::getCarmark)
                .where(carid, isEqualTo(record::getCarid))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.714+08:00", comments="Source Table: M_CardType")
    default int updateByPrimaryKeySelective(MCardtype record) {
        return UpdateDSL.updateWithMapper(this::update, MCardtype)
                .set(carcname).equalToWhenPresent(record::getCarcname)
                .set(carename).equalToWhenPresent(record::getCarename)
                .set(carmark).equalToWhenPresent(record::getCarmark)
                .where(carid, isEqualTo(record::getCarid))
                .build()
                .execute();
    }
}