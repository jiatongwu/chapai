package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MytempissueDynamicSqlSupport.*;

import cn.xvkang.primaryentity.Mytempissue;
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
public interface MytempissueDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.757+08:00", comments="Source Table: MYTEMPISSUE")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.757+08:00", comments="Source Table: MYTEMPISSUE")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.757+08:00", comments="Source Table: MYTEMPISSUE")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Mytempissue> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.757+08:00", comments="Source Table: MYTEMPISSUE")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MytempissueResult", value = {
        @Result(column="CardNO", property="cardno", jdbcType=JdbcType.VARCHAR),
        @Result(column="TempID", property="tempid", jdbcType=JdbcType.VARCHAR),
        @Result(column="CardState", property="cardstate", jdbcType=JdbcType.CHAR),
        @Result(column="IssueDate", property="issuedate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="IssueUserCard", property="issueusercard", jdbcType=JdbcType.VARCHAR)
    })
    List<Mytempissue> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.757+08:00", comments="Source Table: MYTEMPISSUE")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.757+08:00", comments="Source Table: MYTEMPISSUE")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(mytempissue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.757+08:00", comments="Source Table: MYTEMPISSUE")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, mytempissue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.757+08:00", comments="Source Table: MYTEMPISSUE")
    default int insert(Mytempissue record) {
        return insert(SqlBuilder.insert(record)
                .into(mytempissue)
                .map(cardno).toProperty("cardno")
                .map(tempid).toProperty("tempid")
                .map(cardstate).toProperty("cardstate")
                .map(issuedate).toProperty("issuedate")
                .map(issueusercard).toProperty("issueusercard")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.757+08:00", comments="Source Table: MYTEMPISSUE")
    default int insertSelective(Mytempissue record) {
        return insert(SqlBuilder.insert(record)
                .into(mytempissue)
                .map(cardno).toPropertyWhenPresent("cardno", record::getCardno)
                .map(tempid).toPropertyWhenPresent("tempid", record::getTempid)
                .map(cardstate).toPropertyWhenPresent("cardstate", record::getCardstate)
                .map(issuedate).toPropertyWhenPresent("issuedate", record::getIssuedate)
                .map(issueusercard).toPropertyWhenPresent("issueusercard", record::getIssueusercard)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.757+08:00", comments="Source Table: MYTEMPISSUE")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Mytempissue>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, cardno, tempid, cardstate, issuedate, issueusercard)
                .from(mytempissue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.757+08:00", comments="Source Table: MYTEMPISSUE")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Mytempissue>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, cardno, tempid, cardstate, issuedate, issueusercard)
                .from(mytempissue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.757+08:00", comments="Source Table: MYTEMPISSUE")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Mytempissue record) {
        return UpdateDSL.updateWithMapper(this::update, mytempissue)
                .set(cardno).equalTo(record::getCardno)
                .set(tempid).equalTo(record::getTempid)
                .set(cardstate).equalTo(record::getCardstate)
                .set(issuedate).equalTo(record::getIssuedate)
                .set(issueusercard).equalTo(record::getIssueusercard);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.757+08:00", comments="Source Table: MYTEMPISSUE")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Mytempissue record) {
        return UpdateDSL.updateWithMapper(this::update, mytempissue)
                .set(cardno).equalToWhenPresent(record::getCardno)
                .set(tempid).equalToWhenPresent(record::getTempid)
                .set(cardstate).equalToWhenPresent(record::getCardstate)
                .set(issuedate).equalToWhenPresent(record::getIssuedate)
                .set(issueusercard).equalToWhenPresent(record::getIssueusercard);
    }
}