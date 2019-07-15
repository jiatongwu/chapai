package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MyautocphsetDynamicSqlSupport.*;

import cn.xvkang.primaryentity.Myautocphset;
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
public interface MyautocphsetDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.879+08:00", comments="Source Table: MyAutoCPHSet")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.879+08:00", comments="Source Table: MyAutoCPHSet")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.879+08:00", comments="Source Table: MyAutoCPHSet")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Myautocphset> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.879+08:00", comments="Source Table: MyAutoCPHSet")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MyautocphsetResult", value = {
        @Result(column="AutoPlateEn", property="autoplateen", jdbcType=JdbcType.BIT),
        @Result(column="AutoPlateDBJD", property="autoplatedbjd", jdbcType=JdbcType.INTEGER),
        @Result(column="InAutoOpenModel", property="inautoopenmodel", jdbcType=JdbcType.INTEGER),
        @Result(column="OutAutoOpenModel", property="outautoopenmodel", jdbcType=JdbcType.INTEGER),
        @Result(column="CphDelay", property="cphdelay", jdbcType=JdbcType.VARCHAR),
        @Result(column="SameCphDelay", property="samecphdelay", jdbcType=JdbcType.VARCHAR),
        @Result(column="AutoSetMinutes", property="autosetminutes", jdbcType=JdbcType.INTEGER),
        @Result(column="AutoMinutes", property="autominutes", jdbcType=JdbcType.BIT),
        @Result(column="AutoColorSet", property="autocolorset", jdbcType=JdbcType.INTEGER),
        @Result(column="AutoDeleteImg", property="autodeleteimg", jdbcType=JdbcType.INTEGER),
        @Result(column="AutoPattern", property="autopattern", jdbcType=JdbcType.INTEGER),
        @Result(column="AutoKZ", property="autokz", jdbcType=JdbcType.BIT),
        @Result(column="AutoYTime", property="autoytime", jdbcType=JdbcType.INTEGER),
        @Result(column="ReadCardTime", property="readcardtime", jdbcType=JdbcType.INTEGER),
        @Result(column="MaxPlateWidth", property="maxplatewidth", jdbcType=JdbcType.INTEGER),
        @Result(column="MinPlateWidth", property="minplatewidth", jdbcType=JdbcType.INTEGER),
        @Result(column="OnlyLocation", property="onlylocation", jdbcType=JdbcType.BIT),
        @Result(column="Darmpolice", property="darmpolice", jdbcType=JdbcType.BIT),
        @Result(column="Embassy", property="embassy", jdbcType=JdbcType.BIT),
        @Result(column="OnlyDyellow", property="onlydyellow", jdbcType=JdbcType.BIT),
        @Result(column="Tractor", property="tractor", jdbcType=JdbcType.BIT),
        @Result(column="Army2", property="army2", jdbcType=JdbcType.BIT),
        @Result(column="ArmPol", property="armpol", jdbcType=JdbcType.BIT),
        @Result(column="Indivi", property="indivi", jdbcType=JdbcType.BIT),
        @Result(column="Yellow2", property="yellow2", jdbcType=JdbcType.BIT),
        @Result(column="PCName", property="pcname", jdbcType=JdbcType.VARCHAR),
        @Result(column="LocalProvince", property="localprovince", jdbcType=JdbcType.VARCHAR),
        @Result(column="YImageSave", property="yimagesave", jdbcType=JdbcType.VARCHAR),
        @Result(column="Night", property="night", jdbcType=JdbcType.BIT),
        @Result(column="InMothOpenModel", property="inmothopenmodel", jdbcType=JdbcType.INTEGER),
        @Result(column="OutMothOpenModel", property="outmothopenmodel", jdbcType=JdbcType.INTEGER),
        @Result(column="InOutConfirm", property="inoutconfirm", jdbcType=JdbcType.BIT),
        @Result(column="OutConfirm", property="outconfirm", jdbcType=JdbcType.BIT),
        @Result(column="CarInGate", property="caringate", jdbcType=JdbcType.BIT),
        @Result(column="CarOutGate", property="caroutgate", jdbcType=JdbcType.BIT),
        @Result(column="CarYellowTmp", property="caryellowtmp", jdbcType=JdbcType.BIT),
        @Result(column="CarYellowTmpType", property="caryellowtmptype", jdbcType=JdbcType.VARCHAR)
    })
    List<Myautocphset> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.879+08:00", comments="Source Table: MyAutoCPHSet")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.879+08:00", comments="Source Table: MyAutoCPHSet")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(myautocphset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.879+08:00", comments="Source Table: MyAutoCPHSet")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, myautocphset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.879+08:00", comments="Source Table: MyAutoCPHSet")
    default int insert(Myautocphset record) {
        return insert(SqlBuilder.insert(record)
                .into(myautocphset)
                .map(autoplateen).toProperty("autoplateen")
                .map(autoplatedbjd).toProperty("autoplatedbjd")
                .map(inautoopenmodel).toProperty("inautoopenmodel")
                .map(outautoopenmodel).toProperty("outautoopenmodel")
                .map(cphdelay).toProperty("cphdelay")
                .map(samecphdelay).toProperty("samecphdelay")
                .map(autosetminutes).toProperty("autosetminutes")
                .map(autominutes).toProperty("autominutes")
                .map(autocolorset).toProperty("autocolorset")
                .map(autodeleteimg).toProperty("autodeleteimg")
                .map(autopattern).toProperty("autopattern")
                .map(autokz).toProperty("autokz")
                .map(autoytime).toProperty("autoytime")
                .map(readcardtime).toProperty("readcardtime")
                .map(maxplatewidth).toProperty("maxplatewidth")
                .map(minplatewidth).toProperty("minplatewidth")
                .map(onlylocation).toProperty("onlylocation")
                .map(darmpolice).toProperty("darmpolice")
                .map(embassy).toProperty("embassy")
                .map(onlydyellow).toProperty("onlydyellow")
                .map(tractor).toProperty("tractor")
                .map(army2).toProperty("army2")
                .map(armpol).toProperty("armpol")
                .map(indivi).toProperty("indivi")
                .map(yellow2).toProperty("yellow2")
                .map(pcname).toProperty("pcname")
                .map(localprovince).toProperty("localprovince")
                .map(yimagesave).toProperty("yimagesave")
                .map(night).toProperty("night")
                .map(inmothopenmodel).toProperty("inmothopenmodel")
                .map(outmothopenmodel).toProperty("outmothopenmodel")
                .map(inoutconfirm).toProperty("inoutconfirm")
                .map(outconfirm).toProperty("outconfirm")
                .map(caringate).toProperty("caringate")
                .map(caroutgate).toProperty("caroutgate")
                .map(caryellowtmp).toProperty("caryellowtmp")
                .map(caryellowtmptype).toProperty("caryellowtmptype")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.879+08:00", comments="Source Table: MyAutoCPHSet")
    default int insertSelective(Myautocphset record) {
        return insert(SqlBuilder.insert(record)
                .into(myautocphset)
                .map(autoplateen).toPropertyWhenPresent("autoplateen", record::getAutoplateen)
                .map(autoplatedbjd).toPropertyWhenPresent("autoplatedbjd", record::getAutoplatedbjd)
                .map(inautoopenmodel).toPropertyWhenPresent("inautoopenmodel", record::getInautoopenmodel)
                .map(outautoopenmodel).toPropertyWhenPresent("outautoopenmodel", record::getOutautoopenmodel)
                .map(cphdelay).toPropertyWhenPresent("cphdelay", record::getCphdelay)
                .map(samecphdelay).toPropertyWhenPresent("samecphdelay", record::getSamecphdelay)
                .map(autosetminutes).toPropertyWhenPresent("autosetminutes", record::getAutosetminutes)
                .map(autominutes).toPropertyWhenPresent("autominutes", record::getAutominutes)
                .map(autocolorset).toPropertyWhenPresent("autocolorset", record::getAutocolorset)
                .map(autodeleteimg).toPropertyWhenPresent("autodeleteimg", record::getAutodeleteimg)
                .map(autopattern).toPropertyWhenPresent("autopattern", record::getAutopattern)
                .map(autokz).toPropertyWhenPresent("autokz", record::getAutokz)
                .map(autoytime).toPropertyWhenPresent("autoytime", record::getAutoytime)
                .map(readcardtime).toPropertyWhenPresent("readcardtime", record::getReadcardtime)
                .map(maxplatewidth).toPropertyWhenPresent("maxplatewidth", record::getMaxplatewidth)
                .map(minplatewidth).toPropertyWhenPresent("minplatewidth", record::getMinplatewidth)
                .map(onlylocation).toPropertyWhenPresent("onlylocation", record::getOnlylocation)
                .map(darmpolice).toPropertyWhenPresent("darmpolice", record::getDarmpolice)
                .map(embassy).toPropertyWhenPresent("embassy", record::getEmbassy)
                .map(onlydyellow).toPropertyWhenPresent("onlydyellow", record::getOnlydyellow)
                .map(tractor).toPropertyWhenPresent("tractor", record::getTractor)
                .map(army2).toPropertyWhenPresent("army2", record::getArmy2)
                .map(armpol).toPropertyWhenPresent("armpol", record::getArmpol)
                .map(indivi).toPropertyWhenPresent("indivi", record::getIndivi)
                .map(yellow2).toPropertyWhenPresent("yellow2", record::getYellow2)
                .map(pcname).toPropertyWhenPresent("pcname", record::getPcname)
                .map(localprovince).toPropertyWhenPresent("localprovince", record::getLocalprovince)
                .map(yimagesave).toPropertyWhenPresent("yimagesave", record::getYimagesave)
                .map(night).toPropertyWhenPresent("night", record::getNight)
                .map(inmothopenmodel).toPropertyWhenPresent("inmothopenmodel", record::getInmothopenmodel)
                .map(outmothopenmodel).toPropertyWhenPresent("outmothopenmodel", record::getOutmothopenmodel)
                .map(inoutconfirm).toPropertyWhenPresent("inoutconfirm", record::getInoutconfirm)
                .map(outconfirm).toPropertyWhenPresent("outconfirm", record::getOutconfirm)
                .map(caringate).toPropertyWhenPresent("caringate", record::getCaringate)
                .map(caroutgate).toPropertyWhenPresent("caroutgate", record::getCaroutgate)
                .map(caryellowtmp).toPropertyWhenPresent("caryellowtmp", record::getCaryellowtmp)
                .map(caryellowtmptype).toPropertyWhenPresent("caryellowtmptype", record::getCaryellowtmptype)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.879+08:00", comments="Source Table: MyAutoCPHSet")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myautocphset>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, autoplateen, autoplatedbjd, inautoopenmodel, outautoopenmodel, cphdelay, samecphdelay, autosetminutes, autominutes, autocolorset, autodeleteimg, autopattern, autokz, autoytime, readcardtime, maxplatewidth, minplatewidth, onlylocation, darmpolice, embassy, onlydyellow, tractor, army2, armpol, indivi, yellow2, pcname, localprovince, yimagesave, night, inmothopenmodel, outmothopenmodel, inoutconfirm, outconfirm, caringate, caroutgate, caryellowtmp, caryellowtmptype)
                .from(myautocphset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.879+08:00", comments="Source Table: MyAutoCPHSet")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myautocphset>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, autoplateen, autoplatedbjd, inautoopenmodel, outautoopenmodel, cphdelay, samecphdelay, autosetminutes, autominutes, autocolorset, autodeleteimg, autopattern, autokz, autoytime, readcardtime, maxplatewidth, minplatewidth, onlylocation, darmpolice, embassy, onlydyellow, tractor, army2, armpol, indivi, yellow2, pcname, localprovince, yimagesave, night, inmothopenmodel, outmothopenmodel, inoutconfirm, outconfirm, caringate, caroutgate, caryellowtmp, caryellowtmptype)
                .from(myautocphset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.879+08:00", comments="Source Table: MyAutoCPHSet")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Myautocphset record) {
        return UpdateDSL.updateWithMapper(this::update, myautocphset)
                .set(autoplateen).equalTo(record::getAutoplateen)
                .set(autoplatedbjd).equalTo(record::getAutoplatedbjd)
                .set(inautoopenmodel).equalTo(record::getInautoopenmodel)
                .set(outautoopenmodel).equalTo(record::getOutautoopenmodel)
                .set(cphdelay).equalTo(record::getCphdelay)
                .set(samecphdelay).equalTo(record::getSamecphdelay)
                .set(autosetminutes).equalTo(record::getAutosetminutes)
                .set(autominutes).equalTo(record::getAutominutes)
                .set(autocolorset).equalTo(record::getAutocolorset)
                .set(autodeleteimg).equalTo(record::getAutodeleteimg)
                .set(autopattern).equalTo(record::getAutopattern)
                .set(autokz).equalTo(record::getAutokz)
                .set(autoytime).equalTo(record::getAutoytime)
                .set(readcardtime).equalTo(record::getReadcardtime)
                .set(maxplatewidth).equalTo(record::getMaxplatewidth)
                .set(minplatewidth).equalTo(record::getMinplatewidth)
                .set(onlylocation).equalTo(record::getOnlylocation)
                .set(darmpolice).equalTo(record::getDarmpolice)
                .set(embassy).equalTo(record::getEmbassy)
                .set(onlydyellow).equalTo(record::getOnlydyellow)
                .set(tractor).equalTo(record::getTractor)
                .set(army2).equalTo(record::getArmy2)
                .set(armpol).equalTo(record::getArmpol)
                .set(indivi).equalTo(record::getIndivi)
                .set(yellow2).equalTo(record::getYellow2)
                .set(pcname).equalTo(record::getPcname)
                .set(localprovince).equalTo(record::getLocalprovince)
                .set(yimagesave).equalTo(record::getYimagesave)
                .set(night).equalTo(record::getNight)
                .set(inmothopenmodel).equalTo(record::getInmothopenmodel)
                .set(outmothopenmodel).equalTo(record::getOutmothopenmodel)
                .set(inoutconfirm).equalTo(record::getInoutconfirm)
                .set(outconfirm).equalTo(record::getOutconfirm)
                .set(caringate).equalTo(record::getCaringate)
                .set(caroutgate).equalTo(record::getCaroutgate)
                .set(caryellowtmp).equalTo(record::getCaryellowtmp)
                .set(caryellowtmptype).equalTo(record::getCaryellowtmptype);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.880+08:00", comments="Source Table: MyAutoCPHSet")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Myautocphset record) {
        return UpdateDSL.updateWithMapper(this::update, myautocphset)
                .set(autoplateen).equalToWhenPresent(record::getAutoplateen)
                .set(autoplatedbjd).equalToWhenPresent(record::getAutoplatedbjd)
                .set(inautoopenmodel).equalToWhenPresent(record::getInautoopenmodel)
                .set(outautoopenmodel).equalToWhenPresent(record::getOutautoopenmodel)
                .set(cphdelay).equalToWhenPresent(record::getCphdelay)
                .set(samecphdelay).equalToWhenPresent(record::getSamecphdelay)
                .set(autosetminutes).equalToWhenPresent(record::getAutosetminutes)
                .set(autominutes).equalToWhenPresent(record::getAutominutes)
                .set(autocolorset).equalToWhenPresent(record::getAutocolorset)
                .set(autodeleteimg).equalToWhenPresent(record::getAutodeleteimg)
                .set(autopattern).equalToWhenPresent(record::getAutopattern)
                .set(autokz).equalToWhenPresent(record::getAutokz)
                .set(autoytime).equalToWhenPresent(record::getAutoytime)
                .set(readcardtime).equalToWhenPresent(record::getReadcardtime)
                .set(maxplatewidth).equalToWhenPresent(record::getMaxplatewidth)
                .set(minplatewidth).equalToWhenPresent(record::getMinplatewidth)
                .set(onlylocation).equalToWhenPresent(record::getOnlylocation)
                .set(darmpolice).equalToWhenPresent(record::getDarmpolice)
                .set(embassy).equalToWhenPresent(record::getEmbassy)
                .set(onlydyellow).equalToWhenPresent(record::getOnlydyellow)
                .set(tractor).equalToWhenPresent(record::getTractor)
                .set(army2).equalToWhenPresent(record::getArmy2)
                .set(armpol).equalToWhenPresent(record::getArmpol)
                .set(indivi).equalToWhenPresent(record::getIndivi)
                .set(yellow2).equalToWhenPresent(record::getYellow2)
                .set(pcname).equalToWhenPresent(record::getPcname)
                .set(localprovince).equalToWhenPresent(record::getLocalprovince)
                .set(yimagesave).equalToWhenPresent(record::getYimagesave)
                .set(night).equalToWhenPresent(record::getNight)
                .set(inmothopenmodel).equalToWhenPresent(record::getInmothopenmodel)
                .set(outmothopenmodel).equalToWhenPresent(record::getOutmothopenmodel)
                .set(inoutconfirm).equalToWhenPresent(record::getInoutconfirm)
                .set(outconfirm).equalToWhenPresent(record::getOutconfirm)
                .set(caringate).equalToWhenPresent(record::getCaringate)
                .set(caroutgate).equalToWhenPresent(record::getCaroutgate)
                .set(caryellowtmp).equalToWhenPresent(record::getCaryellowtmp)
                .set(caryellowtmptype).equalToWhenPresent(record::getCaryellowtmptype);
    }
}