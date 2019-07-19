package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.QrcodecontrolDynamicSqlSupport.*;

import cn.xvkang.primaryentity.Qrcodecontrol;
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
public interface QrcodecontrolDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.819+08:00", comments="Source Table: QRCodeControl")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.819+08:00", comments="Source Table: QRCodeControl")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.819+08:00", comments="Source Table: QRCodeControl")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Qrcodecontrol> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.820+08:00", comments="Source Table: QRCodeControl")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="QrcodecontrolResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER),
        @Result(column="MachineNo", property="machineno", jdbcType=JdbcType.VARCHAR),
        @Result(column="ControlIP", property="controlip", jdbcType=JdbcType.VARCHAR),
        @Result(column="HostIP", property="hostip", jdbcType=JdbcType.VARCHAR),
        @Result(column="InOutFlag", property="inoutflag", jdbcType=JdbcType.VARCHAR),
        @Result(column="BoundedControlID", property="boundedcontrolid", jdbcType=JdbcType.VARCHAR)
    })
    List<Qrcodecontrol> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.820+08:00", comments="Source Table: QRCodeControl")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.820+08:00", comments="Source Table: QRCodeControl")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(qrcodecontrol);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.820+08:00", comments="Source Table: QRCodeControl")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, qrcodecontrol);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.820+08:00", comments="Source Table: QRCodeControl")
    default int insert(Qrcodecontrol record) {
        return insert(SqlBuilder.insert(record)
                .into(qrcodecontrol)
                .map(id).toProperty("id")
                .map(machineno).toProperty("machineno")
                .map(controlip).toProperty("controlip")
                .map(hostip).toProperty("hostip")
                .map(inoutflag).toProperty("inoutflag")
                .map(boundedcontrolid).toProperty("boundedcontrolid")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.820+08:00", comments="Source Table: QRCodeControl")
    default int insertSelective(Qrcodecontrol record) {
        return insert(SqlBuilder.insert(record)
                .into(qrcodecontrol)
                .map(id).toPropertyWhenPresent("id", record::getId)
                .map(machineno).toPropertyWhenPresent("machineno", record::getMachineno)
                .map(controlip).toPropertyWhenPresent("controlip", record::getControlip)
                .map(hostip).toPropertyWhenPresent("hostip", record::getHostip)
                .map(inoutflag).toPropertyWhenPresent("inoutflag", record::getInoutflag)
                .map(boundedcontrolid).toPropertyWhenPresent("boundedcontrolid", record::getBoundedcontrolid)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.820+08:00", comments="Source Table: QRCodeControl")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Qrcodecontrol>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, machineno, controlip, hostip, inoutflag, boundedcontrolid)
                .from(qrcodecontrol);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.820+08:00", comments="Source Table: QRCodeControl")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Qrcodecontrol>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, machineno, controlip, hostip, inoutflag, boundedcontrolid)
                .from(qrcodecontrol);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.820+08:00", comments="Source Table: QRCodeControl")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Qrcodecontrol record) {
        return UpdateDSL.updateWithMapper(this::update, qrcodecontrol)
                .set(id).equalTo(record::getId)
                .set(machineno).equalTo(record::getMachineno)
                .set(controlip).equalTo(record::getControlip)
                .set(hostip).equalTo(record::getHostip)
                .set(inoutflag).equalTo(record::getInoutflag)
                .set(boundedcontrolid).equalTo(record::getBoundedcontrolid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.820+08:00", comments="Source Table: QRCodeControl")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Qrcodecontrol record) {
        return UpdateDSL.updateWithMapper(this::update, qrcodecontrol)
                .set(id).equalToWhenPresent(record::getId)
                .set(machineno).equalToWhenPresent(record::getMachineno)
                .set(controlip).equalToWhenPresent(record::getControlip)
                .set(hostip).equalToWhenPresent(record::getHostip)
                .set(inoutflag).equalToWhenPresent(record::getInoutflag)
                .set(boundedcontrolid).equalToWhenPresent(record::getBoundedcontrolid);
    }
}