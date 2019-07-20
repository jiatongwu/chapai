package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MyvoicecardnosetDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.Myvoicecardnoset;
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
public interface MyvoicecardnosetDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.445+08:00", comments="Source Table: MyVoiceCardNOSET")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.445+08:00", comments="Source Table: MyVoiceCardNOSET")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.445+08:00", comments="Source Table: MyVoiceCardNOSET")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.ctrlnumber", before=true, resultType=Integer.class)
    int insert(InsertStatementProvider<Myvoicecardnoset> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.445+08:00", comments="Source Table: MyVoiceCardNOSET")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MyvoicecardnosetResult")
    Myvoicecardnoset selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.445+08:00", comments="Source Table: MyVoiceCardNOSET")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MyvoicecardnosetResult", value = {
        @Result(column="CtrlNumber", property="ctrlnumber", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="Voice", property="voice", jdbcType=JdbcType.VARCHAR)
    })
    List<Myvoicecardnoset> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.445+08:00", comments="Source Table: MyVoiceCardNOSET")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.445+08:00", comments="Source Table: MyVoiceCardNOSET")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(myvoicecardnoset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.445+08:00", comments="Source Table: MyVoiceCardNOSET")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, myvoicecardnoset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.445+08:00", comments="Source Table: MyVoiceCardNOSET")
    default int deleteByPrimaryKey(Integer ctrlnumber_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, myvoicecardnoset)
                .where(ctrlnumber, isEqualTo(ctrlnumber_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.445+08:00", comments="Source Table: MyVoiceCardNOSET")
    default int insert(Myvoicecardnoset record) {
        return insert(SqlBuilder.insert(record)
                .into(myvoicecardnoset)
                .map(ctrlnumber).toProperty("ctrlnumber")
                .map(voice).toProperty("voice")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.445+08:00", comments="Source Table: MyVoiceCardNOSET")
    default int insertSelective(Myvoicecardnoset record) {
        return insert(SqlBuilder.insert(record)
                .into(myvoicecardnoset)
                .map(ctrlnumber).toProperty("ctrlnumber")
                .map(voice).toPropertyWhenPresent("voice", record::getVoice)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.445+08:00", comments="Source Table: MyVoiceCardNOSET")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myvoicecardnoset>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, ctrlnumber, voice)
                .from(myvoicecardnoset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.445+08:00", comments="Source Table: MyVoiceCardNOSET")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myvoicecardnoset>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, ctrlnumber, voice)
                .from(myvoicecardnoset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.445+08:00", comments="Source Table: MyVoiceCardNOSET")
    default Myvoicecardnoset selectByPrimaryKey(Integer ctrlnumber_) {
        return SelectDSL.selectWithMapper(this::selectOne, ctrlnumber, voice)
                .from(myvoicecardnoset)
                .where(ctrlnumber, isEqualTo(ctrlnumber_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.445+08:00", comments="Source Table: MyVoiceCardNOSET")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Myvoicecardnoset record) {
        return UpdateDSL.updateWithMapper(this::update, myvoicecardnoset)
                .set(ctrlnumber).equalTo(record::getCtrlnumber)
                .set(voice).equalTo(record::getVoice);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.445+08:00", comments="Source Table: MyVoiceCardNOSET")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Myvoicecardnoset record) {
        return UpdateDSL.updateWithMapper(this::update, myvoicecardnoset)
                .set(ctrlnumber).equalToWhenPresent(record::getCtrlnumber)
                .set(voice).equalToWhenPresent(record::getVoice);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.445+08:00", comments="Source Table: MyVoiceCardNOSET")
    default int updateByPrimaryKey(Myvoicecardnoset record) {
        return UpdateDSL.updateWithMapper(this::update, myvoicecardnoset)
                .set(voice).equalTo(record::getVoice)
                .where(ctrlnumber, isEqualTo(record::getCtrlnumber))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.445+08:00", comments="Source Table: MyVoiceCardNOSET")
    default int updateByPrimaryKeySelective(Myvoicecardnoset record) {
        return UpdateDSL.updateWithMapper(this::update, myvoicecardnoset)
                .set(voice).equalToWhenPresent(record::getVoice)
                .where(ctrlnumber, isEqualTo(record::getCtrlnumber))
                .build()
                .execute();
    }
}