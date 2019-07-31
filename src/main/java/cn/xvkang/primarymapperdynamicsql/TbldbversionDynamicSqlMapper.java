package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.TbldbversionDynamicSqlSupport.*;

import cn.xvkang.primaryentity.Tbldbversion;
import java.util.List;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
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
public interface TbldbversionDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.205+08:00", comments="Source Table: tblDBVersion")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.205+08:00", comments="Source Table: tblDBVersion")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.205+08:00", comments="Source Table: tblDBVersion")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Tbldbversion> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.205+08:00", comments="Source Table: tblDBVersion")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="TbldbversionResult", value = {
        @Result(column="DBVer", property="dbver", jdbcType=JdbcType.INTEGER),
        @Result(column="upd_Time", property="updTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Tbldbversion> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.205+08:00", comments="Source Table: tblDBVersion")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.205+08:00", comments="Source Table: tblDBVersion")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(tbldbversion);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.205+08:00", comments="Source Table: tblDBVersion")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, tbldbversion);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.205+08:00", comments="Source Table: tblDBVersion")
    default int insert(Tbldbversion record) {
        return insert(SqlBuilder.insert(record)
                .into(tbldbversion)
                .map(dbver).toProperty("dbver")
                .map(updTime).toProperty("updTime")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.205+08:00", comments="Source Table: tblDBVersion")
    default int insertSelective(Tbldbversion record) {
        return insert(SqlBuilder.insert(record)
                .into(tbldbversion)
                .map(dbver).toPropertyWhenPresent("dbver", record::getDbver)
                .map(updTime).toPropertyWhenPresent("updTime", record::getUpdTime)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.205+08:00", comments="Source Table: tblDBVersion")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Tbldbversion>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, dbver, updTime)
                .from(tbldbversion);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.205+08:00", comments="Source Table: tblDBVersion")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Tbldbversion>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, dbver, updTime)
                .from(tbldbversion);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.205+08:00", comments="Source Table: tblDBVersion")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Tbldbversion record) {
        return UpdateDSL.updateWithMapper(this::update, tbldbversion)
                .set(dbver).equalTo(record::getDbver)
                .set(updTime).equalTo(record::getUpdTime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.205+08:00", comments="Source Table: tblDBVersion")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Tbldbversion record) {
        return UpdateDSL.updateWithMapper(this::update, tbldbversion)
                .set(dbver).equalToWhenPresent(record::getDbver)
                .set(updTime).equalToWhenPresent(record::getUpdTime);
    }
}