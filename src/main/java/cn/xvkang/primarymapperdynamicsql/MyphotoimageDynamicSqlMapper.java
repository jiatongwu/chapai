package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MyphotoimageDynamicSqlSupport.*;

import cn.xvkang.primaryentity.Myphotoimage;
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
public interface MyphotoimageDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.042+08:00", comments="Source Table: MYPHOTOIMAGE")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.042+08:00", comments="Source Table: MYPHOTOIMAGE")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.042+08:00", comments="Source Table: MYPHOTOIMAGE")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Myphotoimage> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.042+08:00", comments="Source Table: MYPHOTOIMAGE")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MyphotoimageResult", value = {
        @Result(column="PicIndex", property="picindex", jdbcType=JdbcType.VARCHAR),
        @Result(column="PicTime", property="pictime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="PicContent", property="piccontent", jdbcType=JdbcType.BLOB)
    })
    List<Myphotoimage> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.042+08:00", comments="Source Table: MYPHOTOIMAGE")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.042+08:00", comments="Source Table: MYPHOTOIMAGE")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(myphotoimage);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.042+08:00", comments="Source Table: MYPHOTOIMAGE")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, myphotoimage);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.042+08:00", comments="Source Table: MYPHOTOIMAGE")
    default int insert(Myphotoimage record) {
        return insert(SqlBuilder.insert(record)
                .into(myphotoimage)
                .map(picindex).toProperty("picindex")
                .map(pictime).toProperty("pictime")
                .map(piccontent).toProperty("piccontent")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.042+08:00", comments="Source Table: MYPHOTOIMAGE")
    default int insertSelective(Myphotoimage record) {
        return insert(SqlBuilder.insert(record)
                .into(myphotoimage)
                .map(picindex).toPropertyWhenPresent("picindex", record::getPicindex)
                .map(pictime).toPropertyWhenPresent("pictime", record::getPictime)
                .map(piccontent).toPropertyWhenPresent("piccontent", record::getPiccontent)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.042+08:00", comments="Source Table: MYPHOTOIMAGE")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myphotoimage>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, picindex, pictime, piccontent)
                .from(myphotoimage);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.042+08:00", comments="Source Table: MYPHOTOIMAGE")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myphotoimage>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, picindex, pictime, piccontent)
                .from(myphotoimage);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.042+08:00", comments="Source Table: MYPHOTOIMAGE")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Myphotoimage record) {
        return UpdateDSL.updateWithMapper(this::update, myphotoimage)
                .set(picindex).equalTo(record::getPicindex)
                .set(pictime).equalTo(record::getPictime)
                .set(piccontent).equalTo(record::getPiccontent);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.042+08:00", comments="Source Table: MYPHOTOIMAGE")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Myphotoimage record) {
        return UpdateDSL.updateWithMapper(this::update, myphotoimage)
                .set(picindex).equalToWhenPresent(record::getPicindex)
                .set(pictime).equalToWhenPresent(record::getPictime)
                .set(piccontent).equalToWhenPresent(record::getPiccontent);
    }
}