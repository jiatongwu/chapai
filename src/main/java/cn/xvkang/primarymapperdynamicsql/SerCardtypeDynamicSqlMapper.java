package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.SerCardtypeDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.SerCardtype;
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
public interface SerCardtypeDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.916+08:00", comments="Source Table: Ser_CardType")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.916+08:00", comments="Source Table: Ser_CardType")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.916+08:00", comments="Source Table: Ser_CardType")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<SerCardtype> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.916+08:00", comments="Source Table: Ser_CardType")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SerCardtypeResult")
    SerCardtype selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.916+08:00", comments="Source Table: Ser_CardType")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SerCardtypeResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CardCname", property="cardcname", jdbcType=JdbcType.VARCHAR),
        @Result(column="CardEname", property="cardename", jdbcType=JdbcType.VARCHAR),
        @Result(column="Mark", property="mark", jdbcType=JdbcType.VARCHAR)
    })
    List<SerCardtype> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.916+08:00", comments="Source Table: Ser_CardType")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.917+08:00", comments="Source Table: Ser_CardType")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(serCardtype);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.917+08:00", comments="Source Table: Ser_CardType")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, serCardtype);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.917+08:00", comments="Source Table: Ser_CardType")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, serCardtype)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.917+08:00", comments="Source Table: Ser_CardType")
    default int insert(SerCardtype record) {
        return insert(SqlBuilder.insert(record)
                .into(serCardtype)
                .map(cardcname).toProperty("cardcname")
                .map(cardename).toProperty("cardename")
                .map(mark).toProperty("mark")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.917+08:00", comments="Source Table: Ser_CardType")
    default int insertSelective(SerCardtype record) {
        return insert(SqlBuilder.insert(record)
                .into(serCardtype)
                .map(cardcname).toPropertyWhenPresent("cardcname", record::getCardcname)
                .map(cardename).toPropertyWhenPresent("cardename", record::getCardename)
                .map(mark).toPropertyWhenPresent("mark", record::getMark)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.917+08:00", comments="Source Table: Ser_CardType")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<SerCardtype>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, cardcname, cardename, mark)
                .from(serCardtype);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.917+08:00", comments="Source Table: Ser_CardType")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<SerCardtype>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, cardcname, cardename, mark)
                .from(serCardtype);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.917+08:00", comments="Source Table: Ser_CardType")
    default SerCardtype selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, cardcname, cardename, mark)
                .from(serCardtype)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.917+08:00", comments="Source Table: Ser_CardType")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(SerCardtype record) {
        return UpdateDSL.updateWithMapper(this::update, serCardtype)
                .set(cardcname).equalTo(record::getCardcname)
                .set(cardename).equalTo(record::getCardename)
                .set(mark).equalTo(record::getMark);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.917+08:00", comments="Source Table: Ser_CardType")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(SerCardtype record) {
        return UpdateDSL.updateWithMapper(this::update, serCardtype)
                .set(cardcname).equalToWhenPresent(record::getCardcname)
                .set(cardename).equalToWhenPresent(record::getCardename)
                .set(mark).equalToWhenPresent(record::getMark);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.917+08:00", comments="Source Table: Ser_CardType")
    default int updateByPrimaryKey(SerCardtype record) {
        return UpdateDSL.updateWithMapper(this::update, serCardtype)
                .set(cardcname).equalTo(record::getCardcname)
                .set(cardename).equalTo(record::getCardename)
                .set(mark).equalTo(record::getMark)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.917+08:00", comments="Source Table: Ser_CardType")
    default int updateByPrimaryKeySelective(SerCardtype record) {
        return UpdateDSL.updateWithMapper(this::update, serCardtype)
                .set(cardcname).equalToWhenPresent(record::getCardcname)
                .set(cardename).equalToWhenPresent(record::getCardename)
                .set(mark).equalToWhenPresent(record::getMark)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}