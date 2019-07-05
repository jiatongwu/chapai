package cn.xvkang.slavemapperdynamicsql;

import static cn.xvkang.slavemapperdynamicsql.SignupDynamicSqlSupport.accountLocation;
import static cn.xvkang.slavemapperdynamicsql.SignupDynamicSqlSupport.address;
import static cn.xvkang.slavemapperdynamicsql.SignupDynamicSqlSupport.birthCertificateImageFiles;
import static cn.xvkang.slavemapperdynamicsql.SignupDynamicSqlSupport.birthday;
import static cn.xvkang.slavemapperdynamicsql.SignupDynamicSqlSupport.birthdayDate;
import static cn.xvkang.slavemapperdynamicsql.SignupDynamicSqlSupport.census;
import static cn.xvkang.slavemapperdynamicsql.SignupDynamicSqlSupport.censusImageFiles;
import static cn.xvkang.slavemapperdynamicsql.SignupDynamicSqlSupport.createTime;
import static cn.xvkang.slavemapperdynamicsql.SignupDynamicSqlSupport.emptyRegcodeUserId;
import static cn.xvkang.slavemapperdynamicsql.SignupDynamicSqlSupport.father;
import static cn.xvkang.slavemapperdynamicsql.SignupDynamicSqlSupport.fatherWorkunit;
import static cn.xvkang.slavemapperdynamicsql.SignupDynamicSqlSupport.firstTrial;
import static cn.xvkang.slavemapperdynamicsql.SignupDynamicSqlSupport.firstTrialDatetime;
import static cn.xvkang.slavemapperdynamicsql.SignupDynamicSqlSupport.firstTrialInformation;
import static cn.xvkang.slavemapperdynamicsql.SignupDynamicSqlSupport.firstTrialUserId;
import static cn.xvkang.slavemapperdynamicsql.SignupDynamicSqlSupport.fixedHouse;
import static cn.xvkang.slavemapperdynamicsql.SignupDynamicSqlSupport.gender;
import static cn.xvkang.slavemapperdynamicsql.SignupDynamicSqlSupport.houseCeritificateImageFiles;
import static cn.xvkang.slavemapperdynamicsql.SignupDynamicSqlSupport.id;
import static cn.xvkang.slavemapperdynamicsql.SignupDynamicSqlSupport.idcard;
import static cn.xvkang.slavemapperdynamicsql.SignupDynamicSqlSupport.mother;
import static cn.xvkang.slavemapperdynamicsql.SignupDynamicSqlSupport.motherWorkunit;
import static cn.xvkang.slavemapperdynamicsql.SignupDynamicSqlSupport.name;
import static cn.xvkang.slavemapperdynamicsql.SignupDynamicSqlSupport.phone;
import static cn.xvkang.slavemapperdynamicsql.SignupDynamicSqlSupport.regCode;
import static cn.xvkang.slavemapperdynamicsql.SignupDynamicSqlSupport.regeneratorRegcodeUserId;
import static cn.xvkang.slavemapperdynamicsql.SignupDynamicSqlSupport.signup;
import static cn.xvkang.slavemapperdynamicsql.SignupDynamicSqlSupport.updateTime;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

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

import cn.xvkang.slaveentity.Signup;

@Mapper
public interface SignupDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.543+08:00", comments="Source Table: signup")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.543+08:00", comments="Source Table: signup")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.543+08:00", comments="Source Table: signup")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<Signup> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.543+08:00", comments="Source Table: signup")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SignupResult")
    Signup selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.543+08:00", comments="Source Table: signup")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SignupResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="fixed_house", property="fixedHouse", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="birthday", property="birthday", jdbcType=JdbcType.VARCHAR),
        @Result(column="census", property="census", jdbcType=JdbcType.VARCHAR),
        @Result(column="account_location", property="accountLocation", jdbcType=JdbcType.VARCHAR),
        @Result(column="father", property="father", jdbcType=JdbcType.VARCHAR),
        @Result(column="mother", property="mother", jdbcType=JdbcType.VARCHAR),
        @Result(column="father_workunit", property="fatherWorkunit", jdbcType=JdbcType.VARCHAR),
        @Result(column="mother_workunit", property="motherWorkunit", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="gender", property="gender", jdbcType=JdbcType.VARCHAR),
        @Result(column="first_trial", property="firstTrial", jdbcType=JdbcType.INTEGER),
        @Result(column="first_trial_information", property="firstTrialInformation", jdbcType=JdbcType.VARCHAR),
        @Result(column="census_image_files", property="censusImageFiles", jdbcType=JdbcType.VARCHAR),
        @Result(column="birth_certificate_image_files", property="birthCertificateImageFiles", jdbcType=JdbcType.VARCHAR),
        @Result(column="house_ceritificate_image_files", property="houseCeritificateImageFiles", jdbcType=JdbcType.VARCHAR),
        @Result(column="idcard", property="idcard", jdbcType=JdbcType.VARCHAR),
        @Result(column="reg_code", property="regCode", jdbcType=JdbcType.INTEGER),
        @Result(column="first_trial_user_id", property="firstTrialUserId", jdbcType=JdbcType.INTEGER),
        @Result(column="first_trial_datetime", property="firstTrialDatetime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="birthday_date", property="birthdayDate", jdbcType=JdbcType.DATE),
        @Result(column="empty_regcode_user_id", property="emptyRegcodeUserId", jdbcType=JdbcType.INTEGER),
        @Result(column="regenerator_regcode_user_id", property="regeneratorRegcodeUserId", jdbcType=JdbcType.INTEGER)
    })
    List<Signup> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.543+08:00", comments="Source Table: signup")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.543+08:00", comments="Source Table: signup")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(signup);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.544+08:00", comments="Source Table: signup")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, signup);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.544+08:00", comments="Source Table: signup")
    default int deleteByPrimaryKey(Integer id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, signup)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.544+08:00", comments="Source Table: signup")
    default int insert(Signup record) {
        return insert(SqlBuilder.insert(record)
                .into(signup)
                .map(fixedHouse).toProperty("fixedHouse")
                .map(name).toProperty("name")
                .map(birthday).toProperty("birthday")
                .map(census).toProperty("census")
                .map(accountLocation).toProperty("accountLocation")
                .map(father).toProperty("father")
                .map(mother).toProperty("mother")
                .map(fatherWorkunit).toProperty("fatherWorkunit")
                .map(motherWorkunit).toProperty("motherWorkunit")
                .map(phone).toProperty("phone")
                .map(address).toProperty("address")
                .map(gender).toProperty("gender")
                .map(firstTrial).toProperty("firstTrial")
                .map(firstTrialInformation).toProperty("firstTrialInformation")
                .map(censusImageFiles).toProperty("censusImageFiles")
                .map(birthCertificateImageFiles).toProperty("birthCertificateImageFiles")
                .map(houseCeritificateImageFiles).toProperty("houseCeritificateImageFiles")
                .map(idcard).toProperty("idcard")
                .map(regCode).toProperty("regCode")
                .map(firstTrialUserId).toProperty("firstTrialUserId")
                .map(firstTrialDatetime).toProperty("firstTrialDatetime")
                .map(createTime).toProperty("createTime")
                .map(updateTime).toProperty("updateTime")
                .map(birthdayDate).toProperty("birthdayDate")
                .map(emptyRegcodeUserId).toProperty("emptyRegcodeUserId")
                .map(regeneratorRegcodeUserId).toProperty("regeneratorRegcodeUserId")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.544+08:00", comments="Source Table: signup")
    default int insertSelective(Signup record) {
        return insert(SqlBuilder.insert(record)
                .into(signup)
                .map(fixedHouse).toPropertyWhenPresent("fixedHouse", record::getFixedHouse)
                .map(name).toPropertyWhenPresent("name", record::getName)
                .map(birthday).toPropertyWhenPresent("birthday", record::getBirthday)
                .map(census).toPropertyWhenPresent("census", record::getCensus)
                .map(accountLocation).toPropertyWhenPresent("accountLocation", record::getAccountLocation)
                .map(father).toPropertyWhenPresent("father", record::getFather)
                .map(mother).toPropertyWhenPresent("mother", record::getMother)
                .map(fatherWorkunit).toPropertyWhenPresent("fatherWorkunit", record::getFatherWorkunit)
                .map(motherWorkunit).toPropertyWhenPresent("motherWorkunit", record::getMotherWorkunit)
                .map(phone).toPropertyWhenPresent("phone", record::getPhone)
                .map(address).toPropertyWhenPresent("address", record::getAddress)
                .map(gender).toPropertyWhenPresent("gender", record::getGender)
                .map(firstTrial).toPropertyWhenPresent("firstTrial", record::getFirstTrial)
                .map(firstTrialInformation).toPropertyWhenPresent("firstTrialInformation", record::getFirstTrialInformation)
                .map(censusImageFiles).toPropertyWhenPresent("censusImageFiles", record::getCensusImageFiles)
                .map(birthCertificateImageFiles).toPropertyWhenPresent("birthCertificateImageFiles", record::getBirthCertificateImageFiles)
                .map(houseCeritificateImageFiles).toPropertyWhenPresent("houseCeritificateImageFiles", record::getHouseCeritificateImageFiles)
                .map(idcard).toPropertyWhenPresent("idcard", record::getIdcard)
                .map(regCode).toPropertyWhenPresent("regCode", record::getRegCode)
                .map(firstTrialUserId).toPropertyWhenPresent("firstTrialUserId", record::getFirstTrialUserId)
                .map(firstTrialDatetime).toPropertyWhenPresent("firstTrialDatetime", record::getFirstTrialDatetime)
                .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
                .map(updateTime).toPropertyWhenPresent("updateTime", record::getUpdateTime)
                .map(birthdayDate).toPropertyWhenPresent("birthdayDate", record::getBirthdayDate)
                .map(emptyRegcodeUserId).toPropertyWhenPresent("emptyRegcodeUserId", record::getEmptyRegcodeUserId)
                .map(regeneratorRegcodeUserId).toPropertyWhenPresent("regeneratorRegcodeUserId", record::getRegeneratorRegcodeUserId)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.544+08:00", comments="Source Table: signup")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Signup>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, fixedHouse, name, birthday, census, accountLocation, father, mother, fatherWorkunit, motherWorkunit, phone, address, gender, firstTrial, firstTrialInformation, censusImageFiles, birthCertificateImageFiles, houseCeritificateImageFiles, idcard, regCode, firstTrialUserId, firstTrialDatetime, createTime, updateTime, birthdayDate, emptyRegcodeUserId, regeneratorRegcodeUserId)
                .from(signup);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.544+08:00", comments="Source Table: signup")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Signup>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, fixedHouse, name, birthday, census, accountLocation, father, mother, fatherWorkunit, motherWorkunit, phone, address, gender, firstTrial, firstTrialInformation, censusImageFiles, birthCertificateImageFiles, houseCeritificateImageFiles, idcard, regCode, firstTrialUserId, firstTrialDatetime, createTime, updateTime, birthdayDate, emptyRegcodeUserId, regeneratorRegcodeUserId)
                .from(signup);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.544+08:00", comments="Source Table: signup")
    default Signup selectByPrimaryKey(Integer id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, fixedHouse, name, birthday, census, accountLocation, father, mother, fatherWorkunit, motherWorkunit, phone, address, gender, firstTrial, firstTrialInformation, censusImageFiles, birthCertificateImageFiles, houseCeritificateImageFiles, idcard, regCode, firstTrialUserId, firstTrialDatetime, createTime, updateTime, birthdayDate, emptyRegcodeUserId, regeneratorRegcodeUserId)
                .from(signup)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.545+08:00", comments="Source Table: signup")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Signup record) {
        return UpdateDSL.updateWithMapper(this::update, signup)
                .set(fixedHouse).equalTo(record::getFixedHouse)
                .set(name).equalTo(record::getName)
                .set(birthday).equalTo(record::getBirthday)
                .set(census).equalTo(record::getCensus)
                .set(accountLocation).equalTo(record::getAccountLocation)
                .set(father).equalTo(record::getFather)
                .set(mother).equalTo(record::getMother)
                .set(fatherWorkunit).equalTo(record::getFatherWorkunit)
                .set(motherWorkunit).equalTo(record::getMotherWorkunit)
                .set(phone).equalTo(record::getPhone)
                .set(address).equalTo(record::getAddress)
                .set(gender).equalTo(record::getGender)
                .set(firstTrial).equalTo(record::getFirstTrial)
                .set(firstTrialInformation).equalTo(record::getFirstTrialInformation)
                .set(censusImageFiles).equalTo(record::getCensusImageFiles)
                .set(birthCertificateImageFiles).equalTo(record::getBirthCertificateImageFiles)
                .set(houseCeritificateImageFiles).equalTo(record::getHouseCeritificateImageFiles)
                .set(idcard).equalTo(record::getIdcard)
                .set(regCode).equalTo(record::getRegCode)
                .set(firstTrialUserId).equalTo(record::getFirstTrialUserId)
                .set(firstTrialDatetime).equalTo(record::getFirstTrialDatetime)
                .set(createTime).equalTo(record::getCreateTime)
                .set(updateTime).equalTo(record::getUpdateTime)
                .set(birthdayDate).equalTo(record::getBirthdayDate)
                .set(emptyRegcodeUserId).equalTo(record::getEmptyRegcodeUserId)
                .set(regeneratorRegcodeUserId).equalTo(record::getRegeneratorRegcodeUserId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.545+08:00", comments="Source Table: signup")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Signup record) {
        return UpdateDSL.updateWithMapper(this::update, signup)
                .set(fixedHouse).equalToWhenPresent(record::getFixedHouse)
                .set(name).equalToWhenPresent(record::getName)
                .set(birthday).equalToWhenPresent(record::getBirthday)
                .set(census).equalToWhenPresent(record::getCensus)
                .set(accountLocation).equalToWhenPresent(record::getAccountLocation)
                .set(father).equalToWhenPresent(record::getFather)
                .set(mother).equalToWhenPresent(record::getMother)
                .set(fatherWorkunit).equalToWhenPresent(record::getFatherWorkunit)
                .set(motherWorkunit).equalToWhenPresent(record::getMotherWorkunit)
                .set(phone).equalToWhenPresent(record::getPhone)
                .set(address).equalToWhenPresent(record::getAddress)
                .set(gender).equalToWhenPresent(record::getGender)
                .set(firstTrial).equalToWhenPresent(record::getFirstTrial)
                .set(firstTrialInformation).equalToWhenPresent(record::getFirstTrialInformation)
                .set(censusImageFiles).equalToWhenPresent(record::getCensusImageFiles)
                .set(birthCertificateImageFiles).equalToWhenPresent(record::getBirthCertificateImageFiles)
                .set(houseCeritificateImageFiles).equalToWhenPresent(record::getHouseCeritificateImageFiles)
                .set(idcard).equalToWhenPresent(record::getIdcard)
                .set(regCode).equalToWhenPresent(record::getRegCode)
                .set(firstTrialUserId).equalToWhenPresent(record::getFirstTrialUserId)
                .set(firstTrialDatetime).equalToWhenPresent(record::getFirstTrialDatetime)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(updateTime).equalToWhenPresent(record::getUpdateTime)
                .set(birthdayDate).equalToWhenPresent(record::getBirthdayDate)
                .set(emptyRegcodeUserId).equalToWhenPresent(record::getEmptyRegcodeUserId)
                .set(regeneratorRegcodeUserId).equalToWhenPresent(record::getRegeneratorRegcodeUserId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.545+08:00", comments="Source Table: signup")
    default int updateByPrimaryKey(Signup record) {
        return UpdateDSL.updateWithMapper(this::update, signup)
                .set(fixedHouse).equalTo(record::getFixedHouse)
                .set(name).equalTo(record::getName)
                .set(birthday).equalTo(record::getBirthday)
                .set(census).equalTo(record::getCensus)
                .set(accountLocation).equalTo(record::getAccountLocation)
                .set(father).equalTo(record::getFather)
                .set(mother).equalTo(record::getMother)
                .set(fatherWorkunit).equalTo(record::getFatherWorkunit)
                .set(motherWorkunit).equalTo(record::getMotherWorkunit)
                .set(phone).equalTo(record::getPhone)
                .set(address).equalTo(record::getAddress)
                .set(gender).equalTo(record::getGender)
                .set(firstTrial).equalTo(record::getFirstTrial)
                .set(firstTrialInformation).equalTo(record::getFirstTrialInformation)
                .set(censusImageFiles).equalTo(record::getCensusImageFiles)
                .set(birthCertificateImageFiles).equalTo(record::getBirthCertificateImageFiles)
                .set(houseCeritificateImageFiles).equalTo(record::getHouseCeritificateImageFiles)
                .set(idcard).equalTo(record::getIdcard)
                .set(regCode).equalTo(record::getRegCode)
                .set(firstTrialUserId).equalTo(record::getFirstTrialUserId)
                .set(firstTrialDatetime).equalTo(record::getFirstTrialDatetime)
                .set(createTime).equalTo(record::getCreateTime)
                .set(updateTime).equalTo(record::getUpdateTime)
                .set(birthdayDate).equalTo(record::getBirthdayDate)
                .set(emptyRegcodeUserId).equalTo(record::getEmptyRegcodeUserId)
                .set(regeneratorRegcodeUserId).equalTo(record::getRegeneratorRegcodeUserId)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.545+08:00", comments="Source Table: signup")
    default int updateByPrimaryKeySelective(Signup record) {
        return UpdateDSL.updateWithMapper(this::update, signup)
                .set(fixedHouse).equalToWhenPresent(record::getFixedHouse)
                .set(name).equalToWhenPresent(record::getName)
                .set(birthday).equalToWhenPresent(record::getBirthday)
                .set(census).equalToWhenPresent(record::getCensus)
                .set(accountLocation).equalToWhenPresent(record::getAccountLocation)
                .set(father).equalToWhenPresent(record::getFather)
                .set(mother).equalToWhenPresent(record::getMother)
                .set(fatherWorkunit).equalToWhenPresent(record::getFatherWorkunit)
                .set(motherWorkunit).equalToWhenPresent(record::getMotherWorkunit)
                .set(phone).equalToWhenPresent(record::getPhone)
                .set(address).equalToWhenPresent(record::getAddress)
                .set(gender).equalToWhenPresent(record::getGender)
                .set(firstTrial).equalToWhenPresent(record::getFirstTrial)
                .set(firstTrialInformation).equalToWhenPresent(record::getFirstTrialInformation)
                .set(censusImageFiles).equalToWhenPresent(record::getCensusImageFiles)
                .set(birthCertificateImageFiles).equalToWhenPresent(record::getBirthCertificateImageFiles)
                .set(houseCeritificateImageFiles).equalToWhenPresent(record::getHouseCeritificateImageFiles)
                .set(idcard).equalToWhenPresent(record::getIdcard)
                .set(regCode).equalToWhenPresent(record::getRegCode)
                .set(firstTrialUserId).equalToWhenPresent(record::getFirstTrialUserId)
                .set(firstTrialDatetime).equalToWhenPresent(record::getFirstTrialDatetime)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(updateTime).equalToWhenPresent(record::getUpdateTime)
                .set(birthdayDate).equalToWhenPresent(record::getBirthdayDate)
                .set(emptyRegcodeUserId).equalToWhenPresent(record::getEmptyRegcodeUserId)
                .set(regeneratorRegcodeUserId).equalToWhenPresent(record::getRegeneratorRegcodeUserId)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}