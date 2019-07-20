package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MyvideosetDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.Myvideoset;
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
public interface MyvideosetDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.339+08:00", comments="Source Table: MYVideoSet")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.339+08:00", comments="Source Table: MYVideoSet")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.339+08:00", comments="Source Table: MYVideoSet")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<Myvideoset> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.339+08:00", comments="Source Table: MYVideoSet")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MyvideosetResult")
    Myvideoset selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.339+08:00", comments="Source Table: MYVideoSet")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MyvideosetResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="VideoIP", property="videoip", jdbcType=JdbcType.VARCHAR),
        @Result(column="VideoPort", property="videoport", jdbcType=JdbcType.VARCHAR),
        @Result(column="VideoUserName", property="videousername", jdbcType=JdbcType.VARCHAR),
        @Result(column="VideoPassWord", property="videopassword", jdbcType=JdbcType.VARCHAR),
        @Result(column="PCName", property="pcname", jdbcType=JdbcType.VARCHAR),
        @Result(column="VideoType", property="videotype", jdbcType=JdbcType.VARCHAR)
    })
    List<Myvideoset> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.339+08:00", comments="Source Table: MYVideoSet")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.339+08:00", comments="Source Table: MYVideoSet")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(myvideoset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.339+08:00", comments="Source Table: MYVideoSet")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, myvideoset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.339+08:00", comments="Source Table: MYVideoSet")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, myvideoset)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.339+08:00", comments="Source Table: MYVideoSet")
    default int insert(Myvideoset record) {
        return insert(SqlBuilder.insert(record)
                .into(myvideoset)
                .map(videoip).toProperty("videoip")
                .map(videoport).toProperty("videoport")
                .map(videousername).toProperty("videousername")
                .map(videopassword).toProperty("videopassword")
                .map(pcname).toProperty("pcname")
                .map(videotype).toProperty("videotype")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.339+08:00", comments="Source Table: MYVideoSet")
    default int insertSelective(Myvideoset record) {
        return insert(SqlBuilder.insert(record)
                .into(myvideoset)
                .map(videoip).toPropertyWhenPresent("videoip", record::getVideoip)
                .map(videoport).toPropertyWhenPresent("videoport", record::getVideoport)
                .map(videousername).toPropertyWhenPresent("videousername", record::getVideousername)
                .map(videopassword).toPropertyWhenPresent("videopassword", record::getVideopassword)
                .map(pcname).toPropertyWhenPresent("pcname", record::getPcname)
                .map(videotype).toPropertyWhenPresent("videotype", record::getVideotype)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.339+08:00", comments="Source Table: MYVideoSet")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myvideoset>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, videoip, videoport, videousername, videopassword, pcname, videotype)
                .from(myvideoset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.340+08:00", comments="Source Table: MYVideoSet")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myvideoset>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, videoip, videoport, videousername, videopassword, pcname, videotype)
                .from(myvideoset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.340+08:00", comments="Source Table: MYVideoSet")
    default Myvideoset selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, videoip, videoport, videousername, videopassword, pcname, videotype)
                .from(myvideoset)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.340+08:00", comments="Source Table: MYVideoSet")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Myvideoset record) {
        return UpdateDSL.updateWithMapper(this::update, myvideoset)
                .set(videoip).equalTo(record::getVideoip)
                .set(videoport).equalTo(record::getVideoport)
                .set(videousername).equalTo(record::getVideousername)
                .set(videopassword).equalTo(record::getVideopassword)
                .set(pcname).equalTo(record::getPcname)
                .set(videotype).equalTo(record::getVideotype);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.340+08:00", comments="Source Table: MYVideoSet")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Myvideoset record) {
        return UpdateDSL.updateWithMapper(this::update, myvideoset)
                .set(videoip).equalToWhenPresent(record::getVideoip)
                .set(videoport).equalToWhenPresent(record::getVideoport)
                .set(videousername).equalToWhenPresent(record::getVideousername)
                .set(videopassword).equalToWhenPresent(record::getVideopassword)
                .set(pcname).equalToWhenPresent(record::getPcname)
                .set(videotype).equalToWhenPresent(record::getVideotype);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.340+08:00", comments="Source Table: MYVideoSet")
    default int updateByPrimaryKey(Myvideoset record) {
        return UpdateDSL.updateWithMapper(this::update, myvideoset)
                .set(videoip).equalTo(record::getVideoip)
                .set(videoport).equalTo(record::getVideoport)
                .set(videousername).equalTo(record::getVideousername)
                .set(videopassword).equalTo(record::getVideopassword)
                .set(pcname).equalTo(record::getPcname)
                .set(videotype).equalTo(record::getVideotype)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.340+08:00", comments="Source Table: MYVideoSet")
    default int updateByPrimaryKeySelective(Myvideoset record) {
        return UpdateDSL.updateWithMapper(this::update, myvideoset)
                .set(videoip).equalToWhenPresent(record::getVideoip)
                .set(videoport).equalToWhenPresent(record::getVideoport)
                .set(videousername).equalToWhenPresent(record::getVideousername)
                .set(videopassword).equalToWhenPresent(record::getVideopassword)
                .set(pcname).equalToWhenPresent(record::getPcname)
                .set(videotype).equalToWhenPresent(record::getVideotype)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}