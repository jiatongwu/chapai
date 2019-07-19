package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MynocphDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.Mynocph;
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
public interface MynocphDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.804+08:00", comments="Source Table: MyNoCPH")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.804+08:00", comments="Source Table: MyNoCPH")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.804+08:00", comments="Source Table: MyNoCPH")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<Mynocph> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.804+08:00", comments="Source Table: MyNoCPH")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MynocphResult")
    Mynocph selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.804+08:00", comments="Source Table: MyNoCPH")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MynocphResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="InTime", property="intime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="InPic", property="inpic", jdbcType=JdbcType.VARCHAR),
        @Result(column="InGateName", property="ingatename", jdbcType=JdbcType.VARCHAR)
    })
    List<Mynocph> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.805+08:00", comments="Source Table: MyNoCPH")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.805+08:00", comments="Source Table: MyNoCPH")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(mynocph);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.805+08:00", comments="Source Table: MyNoCPH")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, mynocph);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.805+08:00", comments="Source Table: MyNoCPH")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, mynocph)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.805+08:00", comments="Source Table: MyNoCPH")
    default int insert(Mynocph record) {
        return insert(SqlBuilder.insert(record)
                .into(mynocph)
                .map(intime).toProperty("intime")
                .map(inpic).toProperty("inpic")
                .map(ingatename).toProperty("ingatename")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.805+08:00", comments="Source Table: MyNoCPH")
    default int insertSelective(Mynocph record) {
        return insert(SqlBuilder.insert(record)
                .into(mynocph)
                .map(intime).toPropertyWhenPresent("intime", record::getIntime)
                .map(inpic).toPropertyWhenPresent("inpic", record::getInpic)
                .map(ingatename).toPropertyWhenPresent("ingatename", record::getIngatename)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.805+08:00", comments="Source Table: MyNoCPH")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Mynocph>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, intime, inpic, ingatename)
                .from(mynocph);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.805+08:00", comments="Source Table: MyNoCPH")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Mynocph>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, intime, inpic, ingatename)
                .from(mynocph);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.805+08:00", comments="Source Table: MyNoCPH")
    default Mynocph selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, intime, inpic, ingatename)
                .from(mynocph)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.805+08:00", comments="Source Table: MyNoCPH")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Mynocph record) {
        return UpdateDSL.updateWithMapper(this::update, mynocph)
                .set(intime).equalTo(record::getIntime)
                .set(inpic).equalTo(record::getInpic)
                .set(ingatename).equalTo(record::getIngatename);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.805+08:00", comments="Source Table: MyNoCPH")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Mynocph record) {
        return UpdateDSL.updateWithMapper(this::update, mynocph)
                .set(intime).equalToWhenPresent(record::getIntime)
                .set(inpic).equalToWhenPresent(record::getInpic)
                .set(ingatename).equalToWhenPresent(record::getIngatename);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.805+08:00", comments="Source Table: MyNoCPH")
    default int updateByPrimaryKey(Mynocph record) {
        return UpdateDSL.updateWithMapper(this::update, mynocph)
                .set(intime).equalTo(record::getIntime)
                .set(inpic).equalTo(record::getInpic)
                .set(ingatename).equalTo(record::getIngatename)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.805+08:00", comments="Source Table: MyNoCPH")
    default int updateByPrimaryKeySelective(Mynocph record) {
        return UpdateDSL.updateWithMapper(this::update, mynocph)
                .set(intime).equalToWhenPresent(record::getIntime)
                .set(inpic).equalToWhenPresent(record::getInpic)
                .set(ingatename).equalToWhenPresent(record::getIngatename)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}