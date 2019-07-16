package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MyofflineDynamicSqlSupport.*;

import cn.xvkang.primaryentity.Myoffline;
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
public interface MyofflineDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.783+08:00", comments="Source Table: MYOffLine")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.783+08:00", comments="Source Table: MYOffLine")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.783+08:00", comments="Source Table: MYOffLine")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Myoffline> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.783+08:00", comments="Source Table: MYOffLine")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MyofflineResult", value = {
        @Result(column="CardNO", property="cardno", jdbcType=JdbcType.VARCHAR),
        @Result(column="CPHCardNO", property="cphcardno", jdbcType=JdbcType.VARCHAR),
        @Result(column="DownLoadTime", property="downloadtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="State", property="state", jdbcType=JdbcType.INTEGER)
    })
    List<Myoffline> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.783+08:00", comments="Source Table: MYOffLine")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.783+08:00", comments="Source Table: MYOffLine")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(myoffline);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.783+08:00", comments="Source Table: MYOffLine")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, myoffline);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.783+08:00", comments="Source Table: MYOffLine")
    default int insert(Myoffline record) {
        return insert(SqlBuilder.insert(record)
                .into(myoffline)
                .map(cardno).toProperty("cardno")
                .map(cphcardno).toProperty("cphcardno")
                .map(downloadtime).toProperty("downloadtime")
                .map(state).toProperty("state")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.783+08:00", comments="Source Table: MYOffLine")
    default int insertSelective(Myoffline record) {
        return insert(SqlBuilder.insert(record)
                .into(myoffline)
                .map(cardno).toPropertyWhenPresent("cardno", record::getCardno)
                .map(cphcardno).toPropertyWhenPresent("cphcardno", record::getCphcardno)
                .map(downloadtime).toPropertyWhenPresent("downloadtime", record::getDownloadtime)
                .map(state).toPropertyWhenPresent("state", record::getState)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.783+08:00", comments="Source Table: MYOffLine")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myoffline>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, cardno, cphcardno, downloadtime, state)
                .from(myoffline);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.783+08:00", comments="Source Table: MYOffLine")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myoffline>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, cardno, cphcardno, downloadtime, state)
                .from(myoffline);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.783+08:00", comments="Source Table: MYOffLine")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Myoffline record) {
        return UpdateDSL.updateWithMapper(this::update, myoffline)
                .set(cardno).equalTo(record::getCardno)
                .set(cphcardno).equalTo(record::getCphcardno)
                .set(downloadtime).equalTo(record::getDownloadtime)
                .set(state).equalTo(record::getState);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.783+08:00", comments="Source Table: MYOffLine")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Myoffline record) {
        return UpdateDSL.updateWithMapper(this::update, myoffline)
                .set(cardno).equalToWhenPresent(record::getCardno)
                .set(cphcardno).equalToWhenPresent(record::getCphcardno)
                .set(downloadtime).equalToWhenPresent(record::getDownloadtime)
                .set(state).equalToWhenPresent(record::getState);
    }
}