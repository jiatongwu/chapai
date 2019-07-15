package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MyjibenziliaoDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.Myjibenziliao;
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
public interface MyjibenziliaoDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.774+08:00", comments="Source Table: MYJIBENZILIAO")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.774+08:00", comments="Source Table: MYJIBENZILIAO")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.774+08:00", comments="Source Table: MYJIBENZILIAO")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<Myjibenziliao> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.774+08:00", comments="Source Table: MYJIBENZILIAO")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MyjibenziliaoResult")
    Myjibenziliao selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.774+08:00", comments="Source Table: MYJIBENZILIAO")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MyjibenziliaoResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="UserNO", property="userno", jdbcType=JdbcType.VARCHAR),
        @Result(column="UserName", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="Sex", property="sex", jdbcType=JdbcType.VARCHAR),
        @Result(column="HomeAddress", property="homeaddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="DeptName", property="deptname", jdbcType=JdbcType.VARCHAR),
        @Result(column="Job", property="job", jdbcType=JdbcType.VARCHAR),
        @Result(column="WorkTime", property="worktime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="BirthDate", property="birthdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="IDCard", property="idcard", jdbcType=JdbcType.VARCHAR),
        @Result(column="MaritalStatus", property="maritalstatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="HighestDegree", property="highestdegree", jdbcType=JdbcType.VARCHAR),
        @Result(column="PoliticalStatus", property="politicalstatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="PicPath", property="picpath", jdbcType=JdbcType.VARCHAR),
        @Result(column="School", property="school", jdbcType=JdbcType.VARCHAR),
        @Result(column="Speciality", property="speciality", jdbcType=JdbcType.VARCHAR),
        @Result(column="ForeignLanguage", property="foreignlanguage", jdbcType=JdbcType.VARCHAR),
        @Result(column="Skill", property="skill", jdbcType=JdbcType.VARCHAR),
        @Result(column="TelNumber", property="telnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="MobNumber", property="mobnumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="ZipCode", property="zipcode", jdbcType=JdbcType.VARCHAR),
        @Result(column="NativePlace", property="nativeplace", jdbcType=JdbcType.VARCHAR),
        @Result(column="CPH", property="cph", jdbcType=JdbcType.VARCHAR),
        @Result(column="CarType", property="cartype", jdbcType=JdbcType.VARCHAR),
        @Result(column="CarColor", property="carcolor", jdbcType=JdbcType.VARCHAR),
        @Result(column="CarPic", property="carpic", jdbcType=JdbcType.VARCHAR),
        @Result(column="CarPlace", property="carplace", jdbcType=JdbcType.VARCHAR),
        @Result(column="PersonPhoto", property="personphoto", jdbcType=JdbcType.BLOB),
        @Result(column="CarPhoto", property="carphoto", jdbcType=JdbcType.BLOB)
    })
    List<Myjibenziliao> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.775+08:00", comments="Source Table: MYJIBENZILIAO")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.775+08:00", comments="Source Table: MYJIBENZILIAO")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(myjibenziliao);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.775+08:00", comments="Source Table: MYJIBENZILIAO")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, myjibenziliao);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.775+08:00", comments="Source Table: MYJIBENZILIAO")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, myjibenziliao)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.775+08:00", comments="Source Table: MYJIBENZILIAO")
    default int insert(Myjibenziliao record) {
        return insert(SqlBuilder.insert(record)
                .into(myjibenziliao)
                .map(userno).toProperty("userno")
                .map(username).toProperty("username")
                .map(sex).toProperty("sex")
                .map(homeaddress).toProperty("homeaddress")
                .map(deptname).toProperty("deptname")
                .map(job).toProperty("job")
                .map(worktime).toProperty("worktime")
                .map(birthdate).toProperty("birthdate")
                .map(idcard).toProperty("idcard")
                .map(maritalstatus).toProperty("maritalstatus")
                .map(highestdegree).toProperty("highestdegree")
                .map(politicalstatus).toProperty("politicalstatus")
                .map(picpath).toProperty("picpath")
                .map(school).toProperty("school")
                .map(speciality).toProperty("speciality")
                .map(foreignlanguage).toProperty("foreignlanguage")
                .map(skill).toProperty("skill")
                .map(telnumber).toProperty("telnumber")
                .map(mobnumber).toProperty("mobnumber")
                .map(zipcode).toProperty("zipcode")
                .map(nativeplace).toProperty("nativeplace")
                .map(cph).toProperty("cph")
                .map(cartype).toProperty("cartype")
                .map(carcolor).toProperty("carcolor")
                .map(carpic).toProperty("carpic")
                .map(carplace).toProperty("carplace")
                .map(personphoto).toProperty("personphoto")
                .map(carphoto).toProperty("carphoto")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.775+08:00", comments="Source Table: MYJIBENZILIAO")
    default int insertSelective(Myjibenziliao record) {
        return insert(SqlBuilder.insert(record)
                .into(myjibenziliao)
                .map(userno).toPropertyWhenPresent("userno", record::getUserno)
                .map(username).toPropertyWhenPresent("username", record::getUsername)
                .map(sex).toPropertyWhenPresent("sex", record::getSex)
                .map(homeaddress).toPropertyWhenPresent("homeaddress", record::getHomeaddress)
                .map(deptname).toPropertyWhenPresent("deptname", record::getDeptname)
                .map(job).toPropertyWhenPresent("job", record::getJob)
                .map(worktime).toPropertyWhenPresent("worktime", record::getWorktime)
                .map(birthdate).toPropertyWhenPresent("birthdate", record::getBirthdate)
                .map(idcard).toPropertyWhenPresent("idcard", record::getIdcard)
                .map(maritalstatus).toPropertyWhenPresent("maritalstatus", record::getMaritalstatus)
                .map(highestdegree).toPropertyWhenPresent("highestdegree", record::getHighestdegree)
                .map(politicalstatus).toPropertyWhenPresent("politicalstatus", record::getPoliticalstatus)
                .map(picpath).toPropertyWhenPresent("picpath", record::getPicpath)
                .map(school).toPropertyWhenPresent("school", record::getSchool)
                .map(speciality).toPropertyWhenPresent("speciality", record::getSpeciality)
                .map(foreignlanguage).toPropertyWhenPresent("foreignlanguage", record::getForeignlanguage)
                .map(skill).toPropertyWhenPresent("skill", record::getSkill)
                .map(telnumber).toPropertyWhenPresent("telnumber", record::getTelnumber)
                .map(mobnumber).toPropertyWhenPresent("mobnumber", record::getMobnumber)
                .map(zipcode).toPropertyWhenPresent("zipcode", record::getZipcode)
                .map(nativeplace).toPropertyWhenPresent("nativeplace", record::getNativeplace)
                .map(cph).toPropertyWhenPresent("cph", record::getCph)
                .map(cartype).toPropertyWhenPresent("cartype", record::getCartype)
                .map(carcolor).toPropertyWhenPresent("carcolor", record::getCarcolor)
                .map(carpic).toPropertyWhenPresent("carpic", record::getCarpic)
                .map(carplace).toPropertyWhenPresent("carplace", record::getCarplace)
                .map(personphoto).toPropertyWhenPresent("personphoto", record::getPersonphoto)
                .map(carphoto).toPropertyWhenPresent("carphoto", record::getCarphoto)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.775+08:00", comments="Source Table: MYJIBENZILIAO")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myjibenziliao>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, userno, username, sex, homeaddress, deptname, job, worktime, birthdate, idcard, maritalstatus, highestdegree, politicalstatus, picpath, school, speciality, foreignlanguage, skill, telnumber, mobnumber, zipcode, nativeplace, cph, cartype, carcolor, carpic, carplace, personphoto, carphoto)
                .from(myjibenziliao);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.775+08:00", comments="Source Table: MYJIBENZILIAO")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myjibenziliao>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, userno, username, sex, homeaddress, deptname, job, worktime, birthdate, idcard, maritalstatus, highestdegree, politicalstatus, picpath, school, speciality, foreignlanguage, skill, telnumber, mobnumber, zipcode, nativeplace, cph, cartype, carcolor, carpic, carplace, personphoto, carphoto)
                .from(myjibenziliao);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.775+08:00", comments="Source Table: MYJIBENZILIAO")
    default Myjibenziliao selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, userno, username, sex, homeaddress, deptname, job, worktime, birthdate, idcard, maritalstatus, highestdegree, politicalstatus, picpath, school, speciality, foreignlanguage, skill, telnumber, mobnumber, zipcode, nativeplace, cph, cartype, carcolor, carpic, carplace, personphoto, carphoto)
                .from(myjibenziliao)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.775+08:00", comments="Source Table: MYJIBENZILIAO")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Myjibenziliao record) {
        return UpdateDSL.updateWithMapper(this::update, myjibenziliao)
                .set(userno).equalTo(record::getUserno)
                .set(username).equalTo(record::getUsername)
                .set(sex).equalTo(record::getSex)
                .set(homeaddress).equalTo(record::getHomeaddress)
                .set(deptname).equalTo(record::getDeptname)
                .set(job).equalTo(record::getJob)
                .set(worktime).equalTo(record::getWorktime)
                .set(birthdate).equalTo(record::getBirthdate)
                .set(idcard).equalTo(record::getIdcard)
                .set(maritalstatus).equalTo(record::getMaritalstatus)
                .set(highestdegree).equalTo(record::getHighestdegree)
                .set(politicalstatus).equalTo(record::getPoliticalstatus)
                .set(picpath).equalTo(record::getPicpath)
                .set(school).equalTo(record::getSchool)
                .set(speciality).equalTo(record::getSpeciality)
                .set(foreignlanguage).equalTo(record::getForeignlanguage)
                .set(skill).equalTo(record::getSkill)
                .set(telnumber).equalTo(record::getTelnumber)
                .set(mobnumber).equalTo(record::getMobnumber)
                .set(zipcode).equalTo(record::getZipcode)
                .set(nativeplace).equalTo(record::getNativeplace)
                .set(cph).equalTo(record::getCph)
                .set(cartype).equalTo(record::getCartype)
                .set(carcolor).equalTo(record::getCarcolor)
                .set(carpic).equalTo(record::getCarpic)
                .set(carplace).equalTo(record::getCarplace)
                .set(personphoto).equalTo(record::getPersonphoto)
                .set(carphoto).equalTo(record::getCarphoto);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.775+08:00", comments="Source Table: MYJIBENZILIAO")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Myjibenziliao record) {
        return UpdateDSL.updateWithMapper(this::update, myjibenziliao)
                .set(userno).equalToWhenPresent(record::getUserno)
                .set(username).equalToWhenPresent(record::getUsername)
                .set(sex).equalToWhenPresent(record::getSex)
                .set(homeaddress).equalToWhenPresent(record::getHomeaddress)
                .set(deptname).equalToWhenPresent(record::getDeptname)
                .set(job).equalToWhenPresent(record::getJob)
                .set(worktime).equalToWhenPresent(record::getWorktime)
                .set(birthdate).equalToWhenPresent(record::getBirthdate)
                .set(idcard).equalToWhenPresent(record::getIdcard)
                .set(maritalstatus).equalToWhenPresent(record::getMaritalstatus)
                .set(highestdegree).equalToWhenPresent(record::getHighestdegree)
                .set(politicalstatus).equalToWhenPresent(record::getPoliticalstatus)
                .set(picpath).equalToWhenPresent(record::getPicpath)
                .set(school).equalToWhenPresent(record::getSchool)
                .set(speciality).equalToWhenPresent(record::getSpeciality)
                .set(foreignlanguage).equalToWhenPresent(record::getForeignlanguage)
                .set(skill).equalToWhenPresent(record::getSkill)
                .set(telnumber).equalToWhenPresent(record::getTelnumber)
                .set(mobnumber).equalToWhenPresent(record::getMobnumber)
                .set(zipcode).equalToWhenPresent(record::getZipcode)
                .set(nativeplace).equalToWhenPresent(record::getNativeplace)
                .set(cph).equalToWhenPresent(record::getCph)
                .set(cartype).equalToWhenPresent(record::getCartype)
                .set(carcolor).equalToWhenPresent(record::getCarcolor)
                .set(carpic).equalToWhenPresent(record::getCarpic)
                .set(carplace).equalToWhenPresent(record::getCarplace)
                .set(personphoto).equalToWhenPresent(record::getPersonphoto)
                .set(carphoto).equalToWhenPresent(record::getCarphoto);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.775+08:00", comments="Source Table: MYJIBENZILIAO")
    default int updateByPrimaryKey(Myjibenziliao record) {
        return UpdateDSL.updateWithMapper(this::update, myjibenziliao)
                .set(userno).equalTo(record::getUserno)
                .set(username).equalTo(record::getUsername)
                .set(sex).equalTo(record::getSex)
                .set(homeaddress).equalTo(record::getHomeaddress)
                .set(deptname).equalTo(record::getDeptname)
                .set(job).equalTo(record::getJob)
                .set(worktime).equalTo(record::getWorktime)
                .set(birthdate).equalTo(record::getBirthdate)
                .set(idcard).equalTo(record::getIdcard)
                .set(maritalstatus).equalTo(record::getMaritalstatus)
                .set(highestdegree).equalTo(record::getHighestdegree)
                .set(politicalstatus).equalTo(record::getPoliticalstatus)
                .set(picpath).equalTo(record::getPicpath)
                .set(school).equalTo(record::getSchool)
                .set(speciality).equalTo(record::getSpeciality)
                .set(foreignlanguage).equalTo(record::getForeignlanguage)
                .set(skill).equalTo(record::getSkill)
                .set(telnumber).equalTo(record::getTelnumber)
                .set(mobnumber).equalTo(record::getMobnumber)
                .set(zipcode).equalTo(record::getZipcode)
                .set(nativeplace).equalTo(record::getNativeplace)
                .set(cph).equalTo(record::getCph)
                .set(cartype).equalTo(record::getCartype)
                .set(carcolor).equalTo(record::getCarcolor)
                .set(carpic).equalTo(record::getCarpic)
                .set(carplace).equalTo(record::getCarplace)
                .set(personphoto).equalTo(record::getPersonphoto)
                .set(carphoto).equalTo(record::getCarphoto)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.775+08:00", comments="Source Table: MYJIBENZILIAO")
    default int updateByPrimaryKeySelective(Myjibenziliao record) {
        return UpdateDSL.updateWithMapper(this::update, myjibenziliao)
                .set(userno).equalToWhenPresent(record::getUserno)
                .set(username).equalToWhenPresent(record::getUsername)
                .set(sex).equalToWhenPresent(record::getSex)
                .set(homeaddress).equalToWhenPresent(record::getHomeaddress)
                .set(deptname).equalToWhenPresent(record::getDeptname)
                .set(job).equalToWhenPresent(record::getJob)
                .set(worktime).equalToWhenPresent(record::getWorktime)
                .set(birthdate).equalToWhenPresent(record::getBirthdate)
                .set(idcard).equalToWhenPresent(record::getIdcard)
                .set(maritalstatus).equalToWhenPresent(record::getMaritalstatus)
                .set(highestdegree).equalToWhenPresent(record::getHighestdegree)
                .set(politicalstatus).equalToWhenPresent(record::getPoliticalstatus)
                .set(picpath).equalToWhenPresent(record::getPicpath)
                .set(school).equalToWhenPresent(record::getSchool)
                .set(speciality).equalToWhenPresent(record::getSpeciality)
                .set(foreignlanguage).equalToWhenPresent(record::getForeignlanguage)
                .set(skill).equalToWhenPresent(record::getSkill)
                .set(telnumber).equalToWhenPresent(record::getTelnumber)
                .set(mobnumber).equalToWhenPresent(record::getMobnumber)
                .set(zipcode).equalToWhenPresent(record::getZipcode)
                .set(nativeplace).equalToWhenPresent(record::getNativeplace)
                .set(cph).equalToWhenPresent(record::getCph)
                .set(cartype).equalToWhenPresent(record::getCartype)
                .set(carcolor).equalToWhenPresent(record::getCarcolor)
                .set(carpic).equalToWhenPresent(record::getCarpic)
                .set(carplace).equalToWhenPresent(record::getCarplace)
                .set(personphoto).equalToWhenPresent(record::getPersonphoto)
                .set(carphoto).equalToWhenPresent(record::getCarphoto)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}