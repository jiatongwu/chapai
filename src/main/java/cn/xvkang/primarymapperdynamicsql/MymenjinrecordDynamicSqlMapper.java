package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MymenjinrecordDynamicSqlSupport.*;

import cn.xvkang.primaryentity.Mymenjinrecord;
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
public interface MymenjinrecordDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.294+08:00", comments="Source Table: MYMENJINRECORD")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.294+08:00", comments="Source Table: MYMENJINRECORD")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.294+08:00", comments="Source Table: MYMENJINRECORD")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Mymenjinrecord> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.294+08:00", comments="Source Table: MYMENJINRECORD")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MymenjinrecordResult", value = {
        @Result(column="CtrlNumber", property="ctrlnumber", jdbcType=JdbcType.INTEGER),
        @Result(column="CardNO", property="cardno", jdbcType=JdbcType.VARCHAR),
        @Result(column="OpenDoorTime", property="opendoortime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CardType", property="cardtype", jdbcType=JdbcType.VARCHAR)
    })
    List<Mymenjinrecord> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.294+08:00", comments="Source Table: MYMENJINRECORD")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.294+08:00", comments="Source Table: MYMENJINRECORD")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(mymenjinrecord);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.294+08:00", comments="Source Table: MYMENJINRECORD")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, mymenjinrecord);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.294+08:00", comments="Source Table: MYMENJINRECORD")
    default int insert(Mymenjinrecord record) {
        return insert(SqlBuilder.insert(record)
                .into(mymenjinrecord)
                .map(ctrlnumber).toProperty("ctrlnumber")
                .map(cardno).toProperty("cardno")
                .map(opendoortime).toProperty("opendoortime")
                .map(cardtype).toProperty("cardtype")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.294+08:00", comments="Source Table: MYMENJINRECORD")
    default int insertSelective(Mymenjinrecord record) {
        return insert(SqlBuilder.insert(record)
                .into(mymenjinrecord)
                .map(ctrlnumber).toPropertyWhenPresent("ctrlnumber", record::getCtrlnumber)
                .map(cardno).toPropertyWhenPresent("cardno", record::getCardno)
                .map(opendoortime).toPropertyWhenPresent("opendoortime", record::getOpendoortime)
                .map(cardtype).toPropertyWhenPresent("cardtype", record::getCardtype)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.295+08:00", comments="Source Table: MYMENJINRECORD")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Mymenjinrecord>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, ctrlnumber, cardno, opendoortime, cardtype)
                .from(mymenjinrecord);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.295+08:00", comments="Source Table: MYMENJINRECORD")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Mymenjinrecord>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, ctrlnumber, cardno, opendoortime, cardtype)
                .from(mymenjinrecord);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.295+08:00", comments="Source Table: MYMENJINRECORD")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Mymenjinrecord record) {
        return UpdateDSL.updateWithMapper(this::update, mymenjinrecord)
                .set(ctrlnumber).equalTo(record::getCtrlnumber)
                .set(cardno).equalTo(record::getCardno)
                .set(opendoortime).equalTo(record::getOpendoortime)
                .set(cardtype).equalTo(record::getCardtype);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.295+08:00", comments="Source Table: MYMENJINRECORD")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Mymenjinrecord record) {
        return UpdateDSL.updateWithMapper(this::update, mymenjinrecord)
                .set(ctrlnumber).equalToWhenPresent(record::getCtrlnumber)
                .set(cardno).equalToWhenPresent(record::getCardno)
                .set(opendoortime).equalToWhenPresent(record::getOpendoortime)
                .set(cardtype).equalToWhenPresent(record::getCardtype);
    }
}