package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MyvoicecardnoDynamicSqlSupport.*;

import cn.xvkang.primaryentity.Myvoicecardno;
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
public interface MyvoicecardnoDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.777+08:00", comments="Source Table: MyVoiceCardNO")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.777+08:00", comments="Source Table: MyVoiceCardNO")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.777+08:00", comments="Source Table: MyVoiceCardNO")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Myvoicecardno> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.777+08:00", comments="Source Table: MyVoiceCardNO")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MyvoicecardnoResult", value = {
        @Result(column="VoiceCardNO", property="voicecardno", jdbcType=JdbcType.VARCHAR),
        @Result(column="CtrlNumber", property="ctrlnumber", jdbcType=JdbcType.INTEGER)
    })
    List<Myvoicecardno> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.777+08:00", comments="Source Table: MyVoiceCardNO")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.777+08:00", comments="Source Table: MyVoiceCardNO")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(myvoicecardno);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.777+08:00", comments="Source Table: MyVoiceCardNO")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, myvoicecardno);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.777+08:00", comments="Source Table: MyVoiceCardNO")
    default int insert(Myvoicecardno record) {
        return insert(SqlBuilder.insert(record)
                .into(myvoicecardno)
                .map(voicecardno).toProperty("voicecardno")
                .map(ctrlnumber).toProperty("ctrlnumber")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.777+08:00", comments="Source Table: MyVoiceCardNO")
    default int insertSelective(Myvoicecardno record) {
        return insert(SqlBuilder.insert(record)
                .into(myvoicecardno)
                .map(voicecardno).toPropertyWhenPresent("voicecardno", record::getVoicecardno)
                .map(ctrlnumber).toPropertyWhenPresent("ctrlnumber", record::getCtrlnumber)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.777+08:00", comments="Source Table: MyVoiceCardNO")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myvoicecardno>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, voicecardno, ctrlnumber)
                .from(myvoicecardno);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.777+08:00", comments="Source Table: MyVoiceCardNO")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myvoicecardno>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, voicecardno, ctrlnumber)
                .from(myvoicecardno);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.777+08:00", comments="Source Table: MyVoiceCardNO")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Myvoicecardno record) {
        return UpdateDSL.updateWithMapper(this::update, myvoicecardno)
                .set(voicecardno).equalTo(record::getVoicecardno)
                .set(ctrlnumber).equalTo(record::getCtrlnumber);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.777+08:00", comments="Source Table: MyVoiceCardNO")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Myvoicecardno record) {
        return UpdateDSL.updateWithMapper(this::update, myvoicecardno)
                .set(voicecardno).equalToWhenPresent(record::getVoicecardno)
                .set(ctrlnumber).equalToWhenPresent(record::getCtrlnumber);
    }
}