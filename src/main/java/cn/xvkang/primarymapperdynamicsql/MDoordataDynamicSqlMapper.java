package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MDoordataDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.MDoordata;
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
public interface MDoordataDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.082+08:00", comments="Source Table: M_DoorData")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.082+08:00", comments="Source Table: M_DoorData")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.082+08:00", comments="Source Table: M_DoorData")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.machno", before=true, resultType=Integer.class)
    int insert(InsertStatementProvider<MDoordata> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.082+08:00", comments="Source Table: M_DoorData")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MDoordataResult")
    MDoordata selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.082+08:00", comments="Source Table: M_DoorData")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MDoordataResult", value = {
        @Result(column="MachNo", property="machno", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="Place", property="place", jdbcType=JdbcType.VARCHAR),
        @Result(column="BaudRate", property="baudrate", jdbcType=JdbcType.INTEGER),
        @Result(column="ControlType", property="controltype", jdbcType=JdbcType.INTEGER),
        @Result(column="IPadress", property="ipadress", jdbcType=JdbcType.VARCHAR),
        @Result(column="DoorNumber", property="doornumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="DoorName", property="doorname", jdbcType=JdbcType.VARCHAR),
        @Result(column="DoorNumber1", property="doornumber1", jdbcType=JdbcType.VARCHAR),
        @Result(column="DoorName1", property="doorname1", jdbcType=JdbcType.VARCHAR),
        @Result(column="DoorNumber2", property="doornumber2", jdbcType=JdbcType.VARCHAR),
        @Result(column="DoorName2", property="doorname2", jdbcType=JdbcType.VARCHAR),
        @Result(column="DoorNumber3", property="doornumber3", jdbcType=JdbcType.VARCHAR),
        @Result(column="DoorName3", property="doorname3", jdbcType=JdbcType.VARCHAR),
        @Result(column="DoorNumber4", property="doornumber4", jdbcType=JdbcType.VARCHAR),
        @Result(column="DoorName4", property="doorname4", jdbcType=JdbcType.VARCHAR),
        @Result(column="DoorLeibie", property="doorleibie", jdbcType=JdbcType.VARCHAR),
        @Result(column="DoorLeibie1", property="doorleibie1", jdbcType=JdbcType.VARCHAR),
        @Result(column="DoorLeibie2", property="doorleibie2", jdbcType=JdbcType.VARCHAR),
        @Result(column="DoorLeibie3", property="doorleibie3", jdbcType=JdbcType.VARCHAR),
        @Result(column="DoorLeibie4", property="doorleibie4", jdbcType=JdbcType.VARCHAR)
    })
    List<MDoordata> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.082+08:00", comments="Source Table: M_DoorData")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.083+08:00", comments="Source Table: M_DoorData")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(MDoordata);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.083+08:00", comments="Source Table: M_DoorData")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, MDoordata);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.083+08:00", comments="Source Table: M_DoorData")
    default int deleteByPrimaryKey(Integer machno_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, MDoordata)
                .where(machno, isEqualTo(machno_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.083+08:00", comments="Source Table: M_DoorData")
    default int insert(MDoordata record) {
        return insert(SqlBuilder.insert(record)
                .into(MDoordata)
                .map(machno).toProperty("machno")
                .map(place).toProperty("place")
                .map(baudrate).toProperty("baudrate")
                .map(controltype).toProperty("controltype")
                .map(ipadress).toProperty("ipadress")
                .map(doornumber).toProperty("doornumber")
                .map(doorname).toProperty("doorname")
                .map(doornumber1).toProperty("doornumber1")
                .map(doorname1).toProperty("doorname1")
                .map(doornumber2).toProperty("doornumber2")
                .map(doorname2).toProperty("doorname2")
                .map(doornumber3).toProperty("doornumber3")
                .map(doorname3).toProperty("doorname3")
                .map(doornumber4).toProperty("doornumber4")
                .map(doorname4).toProperty("doorname4")
                .map(doorleibie).toProperty("doorleibie")
                .map(doorleibie1).toProperty("doorleibie1")
                .map(doorleibie2).toProperty("doorleibie2")
                .map(doorleibie3).toProperty("doorleibie3")
                .map(doorleibie4).toProperty("doorleibie4")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.083+08:00", comments="Source Table: M_DoorData")
    default int insertSelective(MDoordata record) {
        return insert(SqlBuilder.insert(record)
                .into(MDoordata)
                .map(machno).toProperty("machno")
                .map(place).toPropertyWhenPresent("place", record::getPlace)
                .map(baudrate).toPropertyWhenPresent("baudrate", record::getBaudrate)
                .map(controltype).toPropertyWhenPresent("controltype", record::getControltype)
                .map(ipadress).toPropertyWhenPresent("ipadress", record::getIpadress)
                .map(doornumber).toPropertyWhenPresent("doornumber", record::getDoornumber)
                .map(doorname).toPropertyWhenPresent("doorname", record::getDoorname)
                .map(doornumber1).toPropertyWhenPresent("doornumber1", record::getDoornumber1)
                .map(doorname1).toPropertyWhenPresent("doorname1", record::getDoorname1)
                .map(doornumber2).toPropertyWhenPresent("doornumber2", record::getDoornumber2)
                .map(doorname2).toPropertyWhenPresent("doorname2", record::getDoorname2)
                .map(doornumber3).toPropertyWhenPresent("doornumber3", record::getDoornumber3)
                .map(doorname3).toPropertyWhenPresent("doorname3", record::getDoorname3)
                .map(doornumber4).toPropertyWhenPresent("doornumber4", record::getDoornumber4)
                .map(doorname4).toPropertyWhenPresent("doorname4", record::getDoorname4)
                .map(doorleibie).toPropertyWhenPresent("doorleibie", record::getDoorleibie)
                .map(doorleibie1).toPropertyWhenPresent("doorleibie1", record::getDoorleibie1)
                .map(doorleibie2).toPropertyWhenPresent("doorleibie2", record::getDoorleibie2)
                .map(doorleibie3).toPropertyWhenPresent("doorleibie3", record::getDoorleibie3)
                .map(doorleibie4).toPropertyWhenPresent("doorleibie4", record::getDoorleibie4)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.083+08:00", comments="Source Table: M_DoorData")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<MDoordata>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, machno, place, baudrate, controltype, ipadress, doornumber, doorname, doornumber1, doorname1, doornumber2, doorname2, doornumber3, doorname3, doornumber4, doorname4, doorleibie, doorleibie1, doorleibie2, doorleibie3, doorleibie4)
                .from(MDoordata);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.083+08:00", comments="Source Table: M_DoorData")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<MDoordata>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, machno, place, baudrate, controltype, ipadress, doornumber, doorname, doornumber1, doorname1, doornumber2, doorname2, doornumber3, doorname3, doornumber4, doorname4, doorleibie, doorleibie1, doorleibie2, doorleibie3, doorleibie4)
                .from(MDoordata);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.083+08:00", comments="Source Table: M_DoorData")
    default MDoordata selectByPrimaryKey(Integer machno_) {
        return SelectDSL.selectWithMapper(this::selectOne, machno, place, baudrate, controltype, ipadress, doornumber, doorname, doornumber1, doorname1, doornumber2, doorname2, doornumber3, doorname3, doornumber4, doorname4, doorleibie, doorleibie1, doorleibie2, doorleibie3, doorleibie4)
                .from(MDoordata)
                .where(machno, isEqualTo(machno_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.083+08:00", comments="Source Table: M_DoorData")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(MDoordata record) {
        return UpdateDSL.updateWithMapper(this::update, MDoordata)
                .set(machno).equalTo(record::getMachno)
                .set(place).equalTo(record::getPlace)
                .set(baudrate).equalTo(record::getBaudrate)
                .set(controltype).equalTo(record::getControltype)
                .set(ipadress).equalTo(record::getIpadress)
                .set(doornumber).equalTo(record::getDoornumber)
                .set(doorname).equalTo(record::getDoorname)
                .set(doornumber1).equalTo(record::getDoornumber1)
                .set(doorname1).equalTo(record::getDoorname1)
                .set(doornumber2).equalTo(record::getDoornumber2)
                .set(doorname2).equalTo(record::getDoorname2)
                .set(doornumber3).equalTo(record::getDoornumber3)
                .set(doorname3).equalTo(record::getDoorname3)
                .set(doornumber4).equalTo(record::getDoornumber4)
                .set(doorname4).equalTo(record::getDoorname4)
                .set(doorleibie).equalTo(record::getDoorleibie)
                .set(doorleibie1).equalTo(record::getDoorleibie1)
                .set(doorleibie2).equalTo(record::getDoorleibie2)
                .set(doorleibie3).equalTo(record::getDoorleibie3)
                .set(doorleibie4).equalTo(record::getDoorleibie4);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.083+08:00", comments="Source Table: M_DoorData")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(MDoordata record) {
        return UpdateDSL.updateWithMapper(this::update, MDoordata)
                .set(machno).equalToWhenPresent(record::getMachno)
                .set(place).equalToWhenPresent(record::getPlace)
                .set(baudrate).equalToWhenPresent(record::getBaudrate)
                .set(controltype).equalToWhenPresent(record::getControltype)
                .set(ipadress).equalToWhenPresent(record::getIpadress)
                .set(doornumber).equalToWhenPresent(record::getDoornumber)
                .set(doorname).equalToWhenPresent(record::getDoorname)
                .set(doornumber1).equalToWhenPresent(record::getDoornumber1)
                .set(doorname1).equalToWhenPresent(record::getDoorname1)
                .set(doornumber2).equalToWhenPresent(record::getDoornumber2)
                .set(doorname2).equalToWhenPresent(record::getDoorname2)
                .set(doornumber3).equalToWhenPresent(record::getDoornumber3)
                .set(doorname3).equalToWhenPresent(record::getDoorname3)
                .set(doornumber4).equalToWhenPresent(record::getDoornumber4)
                .set(doorname4).equalToWhenPresent(record::getDoorname4)
                .set(doorleibie).equalToWhenPresent(record::getDoorleibie)
                .set(doorleibie1).equalToWhenPresent(record::getDoorleibie1)
                .set(doorleibie2).equalToWhenPresent(record::getDoorleibie2)
                .set(doorleibie3).equalToWhenPresent(record::getDoorleibie3)
                .set(doorleibie4).equalToWhenPresent(record::getDoorleibie4);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.083+08:00", comments="Source Table: M_DoorData")
    default int updateByPrimaryKey(MDoordata record) {
        return UpdateDSL.updateWithMapper(this::update, MDoordata)
                .set(place).equalTo(record::getPlace)
                .set(baudrate).equalTo(record::getBaudrate)
                .set(controltype).equalTo(record::getControltype)
                .set(ipadress).equalTo(record::getIpadress)
                .set(doornumber).equalTo(record::getDoornumber)
                .set(doorname).equalTo(record::getDoorname)
                .set(doornumber1).equalTo(record::getDoornumber1)
                .set(doorname1).equalTo(record::getDoorname1)
                .set(doornumber2).equalTo(record::getDoornumber2)
                .set(doorname2).equalTo(record::getDoorname2)
                .set(doornumber3).equalTo(record::getDoornumber3)
                .set(doorname3).equalTo(record::getDoorname3)
                .set(doornumber4).equalTo(record::getDoornumber4)
                .set(doorname4).equalTo(record::getDoorname4)
                .set(doorleibie).equalTo(record::getDoorleibie)
                .set(doorleibie1).equalTo(record::getDoorleibie1)
                .set(doorleibie2).equalTo(record::getDoorleibie2)
                .set(doorleibie3).equalTo(record::getDoorleibie3)
                .set(doorleibie4).equalTo(record::getDoorleibie4)
                .where(machno, isEqualTo(record::getMachno))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.083+08:00", comments="Source Table: M_DoorData")
    default int updateByPrimaryKeySelective(MDoordata record) {
        return UpdateDSL.updateWithMapper(this::update, MDoordata)
                .set(place).equalToWhenPresent(record::getPlace)
                .set(baudrate).equalToWhenPresent(record::getBaudrate)
                .set(controltype).equalToWhenPresent(record::getControltype)
                .set(ipadress).equalToWhenPresent(record::getIpadress)
                .set(doornumber).equalToWhenPresent(record::getDoornumber)
                .set(doorname).equalToWhenPresent(record::getDoorname)
                .set(doornumber1).equalToWhenPresent(record::getDoornumber1)
                .set(doorname1).equalToWhenPresent(record::getDoorname1)
                .set(doornumber2).equalToWhenPresent(record::getDoornumber2)
                .set(doorname2).equalToWhenPresent(record::getDoorname2)
                .set(doornumber3).equalToWhenPresent(record::getDoornumber3)
                .set(doorname3).equalToWhenPresent(record::getDoorname3)
                .set(doornumber4).equalToWhenPresent(record::getDoornumber4)
                .set(doorname4).equalToWhenPresent(record::getDoorname4)
                .set(doorleibie).equalToWhenPresent(record::getDoorleibie)
                .set(doorleibie1).equalToWhenPresent(record::getDoorleibie1)
                .set(doorleibie2).equalToWhenPresent(record::getDoorleibie2)
                .set(doorleibie3).equalToWhenPresent(record::getDoorleibie3)
                .set(doorleibie4).equalToWhenPresent(record::getDoorleibie4)
                .where(machno, isEqualTo(record::getMachno))
                .build()
                .execute();
    }
}