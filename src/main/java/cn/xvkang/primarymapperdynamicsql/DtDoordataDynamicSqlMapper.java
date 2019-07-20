package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.DtDoordataDynamicSqlSupport.*;

import cn.xvkang.primaryentity.DtDoordata;
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
public interface DtDoordataDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.972+08:00", comments="Source Table: Dt_DoorData")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.972+08:00", comments="Source Table: Dt_DoorData")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.972+08:00", comments="Source Table: Dt_DoorData")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<DtDoordata> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.972+08:00", comments="Source Table: Dt_DoorData")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="DtDoordataResult", value = {
        @Result(column="DevcNo", property="devcno", jdbcType=JdbcType.INTEGER),
        @Result(column="Place", property="place", jdbcType=JdbcType.VARCHAR),
        @Result(column="DevcType", property="devctype", jdbcType=JdbcType.INTEGER),
        @Result(column="DevcIpadress", property="devcipadress", jdbcType=JdbcType.VARCHAR),
        @Result(column="TxType", property="txtype", jdbcType=JdbcType.INTEGER)
    })
    List<DtDoordata> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.972+08:00", comments="Source Table: Dt_DoorData")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.972+08:00", comments="Source Table: Dt_DoorData")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(dtDoordata);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.972+08:00", comments="Source Table: Dt_DoorData")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, dtDoordata);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.972+08:00", comments="Source Table: Dt_DoorData")
    default int insert(DtDoordata record) {
        return insert(SqlBuilder.insert(record)
                .into(dtDoordata)
                .map(devcno).toProperty("devcno")
                .map(place).toProperty("place")
                .map(devctype).toProperty("devctype")
                .map(devcipadress).toProperty("devcipadress")
                .map(txtype).toProperty("txtype")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.972+08:00", comments="Source Table: Dt_DoorData")
    default int insertSelective(DtDoordata record) {
        return insert(SqlBuilder.insert(record)
                .into(dtDoordata)
                .map(devcno).toPropertyWhenPresent("devcno", record::getDevcno)
                .map(place).toPropertyWhenPresent("place", record::getPlace)
                .map(devctype).toPropertyWhenPresent("devctype", record::getDevctype)
                .map(devcipadress).toPropertyWhenPresent("devcipadress", record::getDevcipadress)
                .map(txtype).toPropertyWhenPresent("txtype", record::getTxtype)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.973+08:00", comments="Source Table: Dt_DoorData")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<DtDoordata>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, devcno, place, devctype, devcipadress, txtype)
                .from(dtDoordata);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.973+08:00", comments="Source Table: Dt_DoorData")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<DtDoordata>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, devcno, place, devctype, devcipadress, txtype)
                .from(dtDoordata);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.973+08:00", comments="Source Table: Dt_DoorData")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(DtDoordata record) {
        return UpdateDSL.updateWithMapper(this::update, dtDoordata)
                .set(devcno).equalTo(record::getDevcno)
                .set(place).equalTo(record::getPlace)
                .set(devctype).equalTo(record::getDevctype)
                .set(devcipadress).equalTo(record::getDevcipadress)
                .set(txtype).equalTo(record::getTxtype);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:21.973+08:00", comments="Source Table: Dt_DoorData")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(DtDoordata record) {
        return UpdateDSL.updateWithMapper(this::update, dtDoordata)
                .set(devcno).equalToWhenPresent(record::getDevcno)
                .set(place).equalToWhenPresent(record::getPlace)
                .set(devctype).equalToWhenPresent(record::getDevctype)
                .set(devcipadress).equalToWhenPresent(record::getDevcipadress)
                .set(txtype).equalToWhenPresent(record::getTxtype);
    }
}