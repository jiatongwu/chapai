package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MyworkstationsetDynamicSqlSupport.*;

import cn.xvkang.primaryentity.Myworkstationset;
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
public interface MyworkstationsetDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.065+08:00", comments="Source Table: MYWORKSTATIONSET")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.065+08:00", comments="Source Table: MYWORKSTATIONSET")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.065+08:00", comments="Source Table: MYWORKSTATIONSET")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Myworkstationset> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.065+08:00", comments="Source Table: MYWORKSTATIONSET")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MyworkstationsetResult", value = {
        @Result(column="CompanyName", property="companyname", jdbcType=JdbcType.VARCHAR),
        @Result(column="ComPort", property="comport", jdbcType=JdbcType.SMALLINT),
        @Result(column="CarparkZone", property="carparkzone", jdbcType=JdbcType.INTEGER),
        @Result(column="MJZone", property="mjzone", jdbcType=JdbcType.INTEGER),
        @Result(column="ParkSectorEnable", property="parksectorenable", jdbcType=JdbcType.TINYINT),
        @Result(column="DoorSectorEnable", property="doorsectorenable", jdbcType=JdbcType.TINYINT),
        @Result(column="MJType", property="mjtype", jdbcType=JdbcType.INTEGER),
        @Result(column="SysConfig", property="sysconfig", jdbcType=JdbcType.VARCHAR),
        @Result(column="SysSize", property="syssize", jdbcType=JdbcType.SMALLINT),
        @Result(column="LoginType", property="logintype", jdbcType=JdbcType.SMALLINT),
        @Result(column="PersonPicCatch", property="personpiccatch", jdbcType=JdbcType.TINYINT),
        @Result(column="FXMachine", property="fxmachine", jdbcType=JdbcType.TINYINT),
        @Result(column="FXMachineID", property="fxmachineid", jdbcType=JdbcType.TINYINT),
        @Result(column="PCName", property="pcname", jdbcType=JdbcType.VARCHAR),
        @Result(column="CtrIP", property="ctrip", jdbcType=JdbcType.VARCHAR),
        @Result(column="Language", property="language", jdbcType=JdbcType.VARCHAR),
        @Result(column="ComParkPort", property="comparkport", jdbcType=JdbcType.SMALLINT),
        @Result(column="MJPort", property="mjport", jdbcType=JdbcType.SMALLINT),
        @Result(column="ComMode", property="commode", jdbcType=JdbcType.INTEGER),
        @Result(column="AutotoCheMointor", property="autotochemointor", jdbcType=JdbcType.BIT),
        @Result(column="Helpflag", property="helpflag", jdbcType=JdbcType.BIT),
        @Result(column="DtZone", property="dtzone", jdbcType=JdbcType.INTEGER),
        @Result(column="DtSectorEnable", property="dtsectorenable", jdbcType=JdbcType.BIT),
        @Result(column="FsectorEnable", property="fsectorenable", jdbcType=JdbcType.BIT),
        @Result(column="DoorfZone", property="doorfzone", jdbcType=JdbcType.INTEGER),
        @Result(column="AppEnable", property="appenable", jdbcType=JdbcType.BIT),
        @Result(column="TXXieYi", property="txxieyi", jdbcType=JdbcType.VARCHAR),
        @Result(column="SystemModel", property="systemmodel", jdbcType=JdbcType.BIT),
        @Result(column="TraditionReport", property="traditionreport", jdbcType=JdbcType.BIT),
        @Result(column="Res1", property="res1", jdbcType=JdbcType.VARCHAR),
        @Result(column="Res2", property="res2", jdbcType=JdbcType.VARCHAR),
        @Result(column="Res3", property="res3", jdbcType=JdbcType.VARCHAR),
        @Result(column="CouldPark", property="couldpark", jdbcType=JdbcType.BIT)
    })
    List<Myworkstationset> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.065+08:00", comments="Source Table: MYWORKSTATIONSET")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.066+08:00", comments="Source Table: MYWORKSTATIONSET")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(myworkstationset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.066+08:00", comments="Source Table: MYWORKSTATIONSET")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, myworkstationset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.066+08:00", comments="Source Table: MYWORKSTATIONSET")
    default int insert(Myworkstationset record) {
        return insert(SqlBuilder.insert(record)
                .into(myworkstationset)
                .map(companyname).toProperty("companyname")
                .map(comport).toProperty("comport")
                .map(carparkzone).toProperty("carparkzone")
                .map(mjzone).toProperty("mjzone")
                .map(parksectorenable).toProperty("parksectorenable")
                .map(doorsectorenable).toProperty("doorsectorenable")
                .map(mjtype).toProperty("mjtype")
                .map(sysconfig).toProperty("sysconfig")
                .map(syssize).toProperty("syssize")
                .map(logintype).toProperty("logintype")
                .map(personpiccatch).toProperty("personpiccatch")
                .map(fxmachine).toProperty("fxmachine")
                .map(fxmachineid).toProperty("fxmachineid")
                .map(pcname).toProperty("pcname")
                .map(ctrip).toProperty("ctrip")
                .map(language).toProperty("language")
                .map(comparkport).toProperty("comparkport")
                .map(mjport).toProperty("mjport")
                .map(commode).toProperty("commode")
                .map(autotochemointor).toProperty("autotochemointor")
                .map(helpflag).toProperty("helpflag")
                .map(dtzone).toProperty("dtzone")
                .map(dtsectorenable).toProperty("dtsectorenable")
                .map(fsectorenable).toProperty("fsectorenable")
                .map(doorfzone).toProperty("doorfzone")
                .map(appenable).toProperty("appenable")
                .map(txxieyi).toProperty("txxieyi")
                .map(systemmodel).toProperty("systemmodel")
                .map(traditionreport).toProperty("traditionreport")
                .map(res1).toProperty("res1")
                .map(res2).toProperty("res2")
                .map(res3).toProperty("res3")
                .map(couldpark).toProperty("couldpark")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.066+08:00", comments="Source Table: MYWORKSTATIONSET")
    default int insertSelective(Myworkstationset record) {
        return insert(SqlBuilder.insert(record)
                .into(myworkstationset)
                .map(companyname).toPropertyWhenPresent("companyname", record::getCompanyname)
                .map(comport).toPropertyWhenPresent("comport", record::getComport)
                .map(carparkzone).toPropertyWhenPresent("carparkzone", record::getCarparkzone)
                .map(mjzone).toPropertyWhenPresent("mjzone", record::getMjzone)
                .map(parksectorenable).toPropertyWhenPresent("parksectorenable", record::getParksectorenable)
                .map(doorsectorenable).toPropertyWhenPresent("doorsectorenable", record::getDoorsectorenable)
                .map(mjtype).toPropertyWhenPresent("mjtype", record::getMjtype)
                .map(sysconfig).toPropertyWhenPresent("sysconfig", record::getSysconfig)
                .map(syssize).toPropertyWhenPresent("syssize", record::getSyssize)
                .map(logintype).toPropertyWhenPresent("logintype", record::getLogintype)
                .map(personpiccatch).toPropertyWhenPresent("personpiccatch", record::getPersonpiccatch)
                .map(fxmachine).toPropertyWhenPresent("fxmachine", record::getFxmachine)
                .map(fxmachineid).toPropertyWhenPresent("fxmachineid", record::getFxmachineid)
                .map(pcname).toPropertyWhenPresent("pcname", record::getPcname)
                .map(ctrip).toPropertyWhenPresent("ctrip", record::getCtrip)
                .map(language).toPropertyWhenPresent("language", record::getLanguage)
                .map(comparkport).toPropertyWhenPresent("comparkport", record::getComparkport)
                .map(mjport).toPropertyWhenPresent("mjport", record::getMjport)
                .map(commode).toPropertyWhenPresent("commode", record::getCommode)
                .map(autotochemointor).toPropertyWhenPresent("autotochemointor", record::getAutotochemointor)
                .map(helpflag).toPropertyWhenPresent("helpflag", record::getHelpflag)
                .map(dtzone).toPropertyWhenPresent("dtzone", record::getDtzone)
                .map(dtsectorenable).toPropertyWhenPresent("dtsectorenable", record::getDtsectorenable)
                .map(fsectorenable).toPropertyWhenPresent("fsectorenable", record::getFsectorenable)
                .map(doorfzone).toPropertyWhenPresent("doorfzone", record::getDoorfzone)
                .map(appenable).toPropertyWhenPresent("appenable", record::getAppenable)
                .map(txxieyi).toPropertyWhenPresent("txxieyi", record::getTxxieyi)
                .map(systemmodel).toPropertyWhenPresent("systemmodel", record::getSystemmodel)
                .map(traditionreport).toPropertyWhenPresent("traditionreport", record::getTraditionreport)
                .map(res1).toPropertyWhenPresent("res1", record::getRes1)
                .map(res2).toPropertyWhenPresent("res2", record::getRes2)
                .map(res3).toPropertyWhenPresent("res3", record::getRes3)
                .map(couldpark).toPropertyWhenPresent("couldpark", record::getCouldpark)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.066+08:00", comments="Source Table: MYWORKSTATIONSET")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myworkstationset>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, companyname, comport, carparkzone, mjzone, parksectorenable, doorsectorenable, mjtype, sysconfig, syssize, logintype, personpiccatch, fxmachine, fxmachineid, pcname, ctrip, language, comparkport, mjport, commode, autotochemointor, helpflag, dtzone, dtsectorenable, fsectorenable, doorfzone, appenable, txxieyi, systemmodel, traditionreport, res1, res2, res3, couldpark)
                .from(myworkstationset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.066+08:00", comments="Source Table: MYWORKSTATIONSET")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myworkstationset>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, companyname, comport, carparkzone, mjzone, parksectorenable, doorsectorenable, mjtype, sysconfig, syssize, logintype, personpiccatch, fxmachine, fxmachineid, pcname, ctrip, language, comparkport, mjport, commode, autotochemointor, helpflag, dtzone, dtsectorenable, fsectorenable, doorfzone, appenable, txxieyi, systemmodel, traditionreport, res1, res2, res3, couldpark)
                .from(myworkstationset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.066+08:00", comments="Source Table: MYWORKSTATIONSET")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Myworkstationset record) {
        return UpdateDSL.updateWithMapper(this::update, myworkstationset)
                .set(companyname).equalTo(record::getCompanyname)
                .set(comport).equalTo(record::getComport)
                .set(carparkzone).equalTo(record::getCarparkzone)
                .set(mjzone).equalTo(record::getMjzone)
                .set(parksectorenable).equalTo(record::getParksectorenable)
                .set(doorsectorenable).equalTo(record::getDoorsectorenable)
                .set(mjtype).equalTo(record::getMjtype)
                .set(sysconfig).equalTo(record::getSysconfig)
                .set(syssize).equalTo(record::getSyssize)
                .set(logintype).equalTo(record::getLogintype)
                .set(personpiccatch).equalTo(record::getPersonpiccatch)
                .set(fxmachine).equalTo(record::getFxmachine)
                .set(fxmachineid).equalTo(record::getFxmachineid)
                .set(pcname).equalTo(record::getPcname)
                .set(ctrip).equalTo(record::getCtrip)
                .set(language).equalTo(record::getLanguage)
                .set(comparkport).equalTo(record::getComparkport)
                .set(mjport).equalTo(record::getMjport)
                .set(commode).equalTo(record::getCommode)
                .set(autotochemointor).equalTo(record::getAutotochemointor)
                .set(helpflag).equalTo(record::getHelpflag)
                .set(dtzone).equalTo(record::getDtzone)
                .set(dtsectorenable).equalTo(record::getDtsectorenable)
                .set(fsectorenable).equalTo(record::getFsectorenable)
                .set(doorfzone).equalTo(record::getDoorfzone)
                .set(appenable).equalTo(record::getAppenable)
                .set(txxieyi).equalTo(record::getTxxieyi)
                .set(systemmodel).equalTo(record::getSystemmodel)
                .set(traditionreport).equalTo(record::getTraditionreport)
                .set(res1).equalTo(record::getRes1)
                .set(res2).equalTo(record::getRes2)
                .set(res3).equalTo(record::getRes3)
                .set(couldpark).equalTo(record::getCouldpark);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.066+08:00", comments="Source Table: MYWORKSTATIONSET")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Myworkstationset record) {
        return UpdateDSL.updateWithMapper(this::update, myworkstationset)
                .set(companyname).equalToWhenPresent(record::getCompanyname)
                .set(comport).equalToWhenPresent(record::getComport)
                .set(carparkzone).equalToWhenPresent(record::getCarparkzone)
                .set(mjzone).equalToWhenPresent(record::getMjzone)
                .set(parksectorenable).equalToWhenPresent(record::getParksectorenable)
                .set(doorsectorenable).equalToWhenPresent(record::getDoorsectorenable)
                .set(mjtype).equalToWhenPresent(record::getMjtype)
                .set(sysconfig).equalToWhenPresent(record::getSysconfig)
                .set(syssize).equalToWhenPresent(record::getSyssize)
                .set(logintype).equalToWhenPresent(record::getLogintype)
                .set(personpiccatch).equalToWhenPresent(record::getPersonpiccatch)
                .set(fxmachine).equalToWhenPresent(record::getFxmachine)
                .set(fxmachineid).equalToWhenPresent(record::getFxmachineid)
                .set(pcname).equalToWhenPresent(record::getPcname)
                .set(ctrip).equalToWhenPresent(record::getCtrip)
                .set(language).equalToWhenPresent(record::getLanguage)
                .set(comparkport).equalToWhenPresent(record::getComparkport)
                .set(mjport).equalToWhenPresent(record::getMjport)
                .set(commode).equalToWhenPresent(record::getCommode)
                .set(autotochemointor).equalToWhenPresent(record::getAutotochemointor)
                .set(helpflag).equalToWhenPresent(record::getHelpflag)
                .set(dtzone).equalToWhenPresent(record::getDtzone)
                .set(dtsectorenable).equalToWhenPresent(record::getDtsectorenable)
                .set(fsectorenable).equalToWhenPresent(record::getFsectorenable)
                .set(doorfzone).equalToWhenPresent(record::getDoorfzone)
                .set(appenable).equalToWhenPresent(record::getAppenable)
                .set(txxieyi).equalToWhenPresent(record::getTxxieyi)
                .set(systemmodel).equalToWhenPresent(record::getSystemmodel)
                .set(traditionreport).equalToWhenPresent(record::getTraditionreport)
                .set(res1).equalToWhenPresent(record::getRes1)
                .set(res2).equalToWhenPresent(record::getRes2)
                .set(res3).equalToWhenPresent(record::getRes3)
                .set(couldpark).equalToWhenPresent(record::getCouldpark);
    }
}