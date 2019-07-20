package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MyblacklistDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.Myblacklist;
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
public interface MyblacklistDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.164+08:00", comments="Source Table: MYBlacklist")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.164+08:00", comments="Source Table: MYBlacklist")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.164+08:00", comments="Source Table: MYBlacklist")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<Myblacklist> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.164+08:00", comments="Source Table: MYBlacklist")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MyblacklistResult")
    Myblacklist selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.164+08:00", comments="Source Table: MYBlacklist")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MyblacklistResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CPH", property="cph", jdbcType=JdbcType.VARCHAR),
        @Result(column="StartTime", property="starttime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="EndTime", property="endtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="Reason", property="reason", jdbcType=JdbcType.VARCHAR),
        @Result(column="DownloadSignal", property="downloadsignal", jdbcType=JdbcType.VARCHAR),
        @Result(column="AddDelete", property="adddelete", jdbcType=JdbcType.INTEGER)
    })
    List<Myblacklist> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.164+08:00", comments="Source Table: MYBlacklist")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.164+08:00", comments="Source Table: MYBlacklist")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(myblacklist);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.164+08:00", comments="Source Table: MYBlacklist")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, myblacklist);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.164+08:00", comments="Source Table: MYBlacklist")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, myblacklist)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.164+08:00", comments="Source Table: MYBlacklist")
    default int insert(Myblacklist record) {
        return insert(SqlBuilder.insert(record)
                .into(myblacklist)
                .map(cph).toProperty("cph")
                .map(starttime).toProperty("starttime")
                .map(endtime).toProperty("endtime")
                .map(reason).toProperty("reason")
                .map(downloadsignal).toProperty("downloadsignal")
                .map(adddelete).toProperty("adddelete")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.164+08:00", comments="Source Table: MYBlacklist")
    default int insertSelective(Myblacklist record) {
        return insert(SqlBuilder.insert(record)
                .into(myblacklist)
                .map(cph).toPropertyWhenPresent("cph", record::getCph)
                .map(starttime).toPropertyWhenPresent("starttime", record::getStarttime)
                .map(endtime).toPropertyWhenPresent("endtime", record::getEndtime)
                .map(reason).toPropertyWhenPresent("reason", record::getReason)
                .map(downloadsignal).toPropertyWhenPresent("downloadsignal", record::getDownloadsignal)
                .map(adddelete).toPropertyWhenPresent("adddelete", record::getAdddelete)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.164+08:00", comments="Source Table: MYBlacklist")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myblacklist>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, cph, starttime, endtime, reason, downloadsignal, adddelete)
                .from(myblacklist);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.164+08:00", comments="Source Table: MYBlacklist")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myblacklist>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, cph, starttime, endtime, reason, downloadsignal, adddelete)
                .from(myblacklist);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.164+08:00", comments="Source Table: MYBlacklist")
    default Myblacklist selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, cph, starttime, endtime, reason, downloadsignal, adddelete)
                .from(myblacklist)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.164+08:00", comments="Source Table: MYBlacklist")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Myblacklist record) {
        return UpdateDSL.updateWithMapper(this::update, myblacklist)
                .set(cph).equalTo(record::getCph)
                .set(starttime).equalTo(record::getStarttime)
                .set(endtime).equalTo(record::getEndtime)
                .set(reason).equalTo(record::getReason)
                .set(downloadsignal).equalTo(record::getDownloadsignal)
                .set(adddelete).equalTo(record::getAdddelete);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.164+08:00", comments="Source Table: MYBlacklist")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Myblacklist record) {
        return UpdateDSL.updateWithMapper(this::update, myblacklist)
                .set(cph).equalToWhenPresent(record::getCph)
                .set(starttime).equalToWhenPresent(record::getStarttime)
                .set(endtime).equalToWhenPresent(record::getEndtime)
                .set(reason).equalToWhenPresent(record::getReason)
                .set(downloadsignal).equalToWhenPresent(record::getDownloadsignal)
                .set(adddelete).equalToWhenPresent(record::getAdddelete);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.164+08:00", comments="Source Table: MYBlacklist")
    default int updateByPrimaryKey(Myblacklist record) {
        return UpdateDSL.updateWithMapper(this::update, myblacklist)
                .set(cph).equalTo(record::getCph)
                .set(starttime).equalTo(record::getStarttime)
                .set(endtime).equalTo(record::getEndtime)
                .set(reason).equalTo(record::getReason)
                .set(downloadsignal).equalTo(record::getDownloadsignal)
                .set(adddelete).equalTo(record::getAdddelete)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.164+08:00", comments="Source Table: MYBlacklist")
    default int updateByPrimaryKeySelective(Myblacklist record) {
        return UpdateDSL.updateWithMapper(this::update, myblacklist)
                .set(cph).equalToWhenPresent(record::getCph)
                .set(starttime).equalToWhenPresent(record::getStarttime)
                .set(endtime).equalToWhenPresent(record::getEndtime)
                .set(reason).equalToWhenPresent(record::getReason)
                .set(downloadsignal).equalToWhenPresent(record::getDownloadsignal)
                .set(adddelete).equalToWhenPresent(record::getAdddelete)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}