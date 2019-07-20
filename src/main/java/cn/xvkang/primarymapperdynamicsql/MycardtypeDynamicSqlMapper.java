package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MycardtypeDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.Mycardtype;
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
public interface MycardtypeDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.249+08:00", comments="Source Table: MYCardType")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.249+08:00", comments="Source Table: MYCardType")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.249+08:00", comments="Source Table: MYCardType")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<Mycardtype> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.249+08:00", comments="Source Table: MYCardType")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MycardtypeResult")
    Mycardtype selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.250+08:00", comments="Source Table: MYCardType")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MycardtypeResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CardType", property="cardtype", jdbcType=JdbcType.VARCHAR),
        @Result(column="Identifying", property="identifying", jdbcType=JdbcType.VARCHAR),
        @Result(column="Enabled", property="enabled", jdbcType=JdbcType.BIT),
        @Result(column="Reamrks", property="reamrks", jdbcType=JdbcType.VARCHAR)
    })
    List<Mycardtype> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.250+08:00", comments="Source Table: MYCardType")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.250+08:00", comments="Source Table: MYCardType")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(mycardtype);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.250+08:00", comments="Source Table: MYCardType")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, mycardtype);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.250+08:00", comments="Source Table: MYCardType")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, mycardtype)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.250+08:00", comments="Source Table: MYCardType")
    default int insert(Mycardtype record) {
        return insert(SqlBuilder.insert(record)
                .into(mycardtype)
                .map(cardtype).toProperty("cardtype")
                .map(identifying).toProperty("identifying")
                .map(enabled).toProperty("enabled")
                .map(reamrks).toProperty("reamrks")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.250+08:00", comments="Source Table: MYCardType")
    default int insertSelective(Mycardtype record) {
        return insert(SqlBuilder.insert(record)
                .into(mycardtype)
                .map(cardtype).toPropertyWhenPresent("cardtype", record::getCardtype)
                .map(identifying).toPropertyWhenPresent("identifying", record::getIdentifying)
                .map(enabled).toPropertyWhenPresent("enabled", record::getEnabled)
                .map(reamrks).toPropertyWhenPresent("reamrks", record::getReamrks)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.250+08:00", comments="Source Table: MYCardType")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Mycardtype>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, cardtype, identifying, enabled, reamrks)
                .from(mycardtype);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.250+08:00", comments="Source Table: MYCardType")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Mycardtype>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, cardtype, identifying, enabled, reamrks)
                .from(mycardtype);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.250+08:00", comments="Source Table: MYCardType")
    default Mycardtype selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, cardtype, identifying, enabled, reamrks)
                .from(mycardtype)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.250+08:00", comments="Source Table: MYCardType")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Mycardtype record) {
        return UpdateDSL.updateWithMapper(this::update, mycardtype)
                .set(cardtype).equalTo(record::getCardtype)
                .set(identifying).equalTo(record::getIdentifying)
                .set(enabled).equalTo(record::getEnabled)
                .set(reamrks).equalTo(record::getReamrks);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.250+08:00", comments="Source Table: MYCardType")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Mycardtype record) {
        return UpdateDSL.updateWithMapper(this::update, mycardtype)
                .set(cardtype).equalToWhenPresent(record::getCardtype)
                .set(identifying).equalToWhenPresent(record::getIdentifying)
                .set(enabled).equalToWhenPresent(record::getEnabled)
                .set(reamrks).equalToWhenPresent(record::getReamrks);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.250+08:00", comments="Source Table: MYCardType")
    default int updateByPrimaryKey(Mycardtype record) {
        return UpdateDSL.updateWithMapper(this::update, mycardtype)
                .set(cardtype).equalTo(record::getCardtype)
                .set(identifying).equalTo(record::getIdentifying)
                .set(enabled).equalTo(record::getEnabled)
                .set(reamrks).equalTo(record::getReamrks)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.250+08:00", comments="Source Table: MYCardType")
    default int updateByPrimaryKeySelective(Mycardtype record) {
        return UpdateDSL.updateWithMapper(this::update, mycardtype)
                .set(cardtype).equalToWhenPresent(record::getCardtype)
                .set(identifying).equalToWhenPresent(record::getIdentifying)
                .set(enabled).equalToWhenPresent(record::getEnabled)
                .set(reamrks).equalToWhenPresent(record::getReamrks)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}