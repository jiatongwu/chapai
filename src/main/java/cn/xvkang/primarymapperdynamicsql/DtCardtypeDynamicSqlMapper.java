package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.DtCardtypeDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.DtCardtype;
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
public interface DtCardtypeDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.520+08:00", comments="Source Table: Dt_CardType")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.520+08:00", comments="Source Table: Dt_CardType")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.520+08:00", comments="Source Table: Dt_CardType")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<DtCardtype> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.520+08:00", comments="Source Table: Dt_CardType")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("DtCardtypeResult")
    DtCardtype selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.520+08:00", comments="Source Table: Dt_CardType")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="DtCardtypeResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CardCname", property="cardcname", jdbcType=JdbcType.VARCHAR),
        @Result(column="CardEname", property="cardename", jdbcType=JdbcType.VARCHAR),
        @Result(column="Mark", property="mark", jdbcType=JdbcType.VARCHAR)
    })
    List<DtCardtype> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.521+08:00", comments="Source Table: Dt_CardType")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.521+08:00", comments="Source Table: Dt_CardType")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(dtCardtype);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.521+08:00", comments="Source Table: Dt_CardType")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, dtCardtype);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.521+08:00", comments="Source Table: Dt_CardType")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, dtCardtype)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.521+08:00", comments="Source Table: Dt_CardType")
    default int insert(DtCardtype record) {
        return insert(SqlBuilder.insert(record)
                .into(dtCardtype)
                .map(cardcname).toProperty("cardcname")
                .map(cardename).toProperty("cardename")
                .map(mark).toProperty("mark")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.521+08:00", comments="Source Table: Dt_CardType")
    default int insertSelective(DtCardtype record) {
        return insert(SqlBuilder.insert(record)
                .into(dtCardtype)
                .map(cardcname).toPropertyWhenPresent("cardcname", record::getCardcname)
                .map(cardename).toPropertyWhenPresent("cardename", record::getCardename)
                .map(mark).toPropertyWhenPresent("mark", record::getMark)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.521+08:00", comments="Source Table: Dt_CardType")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<DtCardtype>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, cardcname, cardename, mark)
                .from(dtCardtype);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.521+08:00", comments="Source Table: Dt_CardType")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<DtCardtype>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, cardcname, cardename, mark)
                .from(dtCardtype);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.521+08:00", comments="Source Table: Dt_CardType")
    default DtCardtype selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, cardcname, cardename, mark)
                .from(dtCardtype)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.522+08:00", comments="Source Table: Dt_CardType")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(DtCardtype record) {
        return UpdateDSL.updateWithMapper(this::update, dtCardtype)
                .set(cardcname).equalTo(record::getCardcname)
                .set(cardename).equalTo(record::getCardename)
                .set(mark).equalTo(record::getMark);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.522+08:00", comments="Source Table: Dt_CardType")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(DtCardtype record) {
        return UpdateDSL.updateWithMapper(this::update, dtCardtype)
                .set(cardcname).equalToWhenPresent(record::getCardcname)
                .set(cardename).equalToWhenPresent(record::getCardename)
                .set(mark).equalToWhenPresent(record::getMark);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.522+08:00", comments="Source Table: Dt_CardType")
    default int updateByPrimaryKey(DtCardtype record) {
        return UpdateDSL.updateWithMapper(this::update, dtCardtype)
                .set(cardcname).equalTo(record::getCardcname)
                .set(cardename).equalTo(record::getCardename)
                .set(mark).equalTo(record::getMark)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.522+08:00", comments="Source Table: Dt_CardType")
    default int updateByPrimaryKeySelective(DtCardtype record) {
        return UpdateDSL.updateWithMapper(this::update, dtCardtype)
                .set(cardcname).equalToWhenPresent(record::getCardcname)
                .set(cardename).equalToWhenPresent(record::getCardename)
                .set(mark).equalToWhenPresent(record::getMark)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}