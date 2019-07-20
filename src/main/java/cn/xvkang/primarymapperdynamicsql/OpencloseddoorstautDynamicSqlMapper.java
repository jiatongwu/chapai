package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.OpencloseddoorstautDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.Opencloseddoorstaut;
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
public interface OpencloseddoorstautDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.449+08:00", comments="Source Table: OpenClosedDoorStaut")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.449+08:00", comments="Source Table: OpenClosedDoorStaut")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.449+08:00", comments="Source Table: OpenClosedDoorStaut")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<Opencloseddoorstaut> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.449+08:00", comments="Source Table: OpenClosedDoorStaut")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("OpencloseddoorstautResult")
    Opencloseddoorstaut selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.449+08:00", comments="Source Table: OpenClosedDoorStaut")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="OpencloseddoorstautResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="DevcNo", property="devcno", jdbcType=JdbcType.INTEGER),
        @Result(column="Stuat", property="stuat", jdbcType=JdbcType.VARCHAR)
    })
    List<Opencloseddoorstaut> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.449+08:00", comments="Source Table: OpenClosedDoorStaut")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.449+08:00", comments="Source Table: OpenClosedDoorStaut")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(opencloseddoorstaut);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.449+08:00", comments="Source Table: OpenClosedDoorStaut")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, opencloseddoorstaut);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.449+08:00", comments="Source Table: OpenClosedDoorStaut")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, opencloseddoorstaut)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.449+08:00", comments="Source Table: OpenClosedDoorStaut")
    default int insert(Opencloseddoorstaut record) {
        return insert(SqlBuilder.insert(record)
                .into(opencloseddoorstaut)
                .map(devcno).toProperty("devcno")
                .map(stuat).toProperty("stuat")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.449+08:00", comments="Source Table: OpenClosedDoorStaut")
    default int insertSelective(Opencloseddoorstaut record) {
        return insert(SqlBuilder.insert(record)
                .into(opencloseddoorstaut)
                .map(devcno).toPropertyWhenPresent("devcno", record::getDevcno)
                .map(stuat).toPropertyWhenPresent("stuat", record::getStuat)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.449+08:00", comments="Source Table: OpenClosedDoorStaut")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Opencloseddoorstaut>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, devcno, stuat)
                .from(opencloseddoorstaut);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.449+08:00", comments="Source Table: OpenClosedDoorStaut")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Opencloseddoorstaut>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, devcno, stuat)
                .from(opencloseddoorstaut);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.449+08:00", comments="Source Table: OpenClosedDoorStaut")
    default Opencloseddoorstaut selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, devcno, stuat)
                .from(opencloseddoorstaut)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.449+08:00", comments="Source Table: OpenClosedDoorStaut")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Opencloseddoorstaut record) {
        return UpdateDSL.updateWithMapper(this::update, opencloseddoorstaut)
                .set(devcno).equalTo(record::getDevcno)
                .set(stuat).equalTo(record::getStuat);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.450+08:00", comments="Source Table: OpenClosedDoorStaut")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Opencloseddoorstaut record) {
        return UpdateDSL.updateWithMapper(this::update, opencloseddoorstaut)
                .set(devcno).equalToWhenPresent(record::getDevcno)
                .set(stuat).equalToWhenPresent(record::getStuat);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.450+08:00", comments="Source Table: OpenClosedDoorStaut")
    default int updateByPrimaryKey(Opencloseddoorstaut record) {
        return UpdateDSL.updateWithMapper(this::update, opencloseddoorstaut)
                .set(devcno).equalTo(record::getDevcno)
                .set(stuat).equalTo(record::getStuat)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.450+08:00", comments="Source Table: OpenClosedDoorStaut")
    default int updateByPrimaryKeySelective(Opencloseddoorstaut record) {
        return UpdateDSL.updateWithMapper(this::update, opencloseddoorstaut)
                .set(devcno).equalToWhenPresent(record::getDevcno)
                .set(stuat).equalToWhenPresent(record::getStuat)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}