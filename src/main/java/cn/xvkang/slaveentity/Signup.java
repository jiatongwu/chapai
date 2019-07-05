package cn.xvkang.slaveentity;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.Generated;

public class Signup implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.530+08:00", comments="Source field: signup.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.530+08:00", comments="Source field: signup.fixed_house")
    private String fixedHouse;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.530+08:00", comments="Source field: signup.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.530+08:00", comments="Source field: signup.birthday")
    private String birthday;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.531+08:00", comments="Source field: signup.census")
    private String census;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.531+08:00", comments="Source field: signup.account_location")
    private String accountLocation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.531+08:00", comments="Source field: signup.father")
    private String father;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.531+08:00", comments="Source field: signup.mother")
    private String mother;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.531+08:00", comments="Source field: signup.father_workunit")
    private String fatherWorkunit;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.532+08:00", comments="Source field: signup.mother_workunit")
    private String motherWorkunit;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.532+08:00", comments="Source field: signup.phone")
    private String phone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.532+08:00", comments="Source field: signup.address")
    private String address;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.533+08:00", comments="Source field: signup.gender")
    private String gender;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.533+08:00", comments="Source field: signup.first_trial")
    private Integer firstTrial;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.533+08:00", comments="Source field: signup.first_trial_information")
    private String firstTrialInformation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.533+08:00", comments="Source field: signup.census_image_files")
    private String censusImageFiles;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.534+08:00", comments="Source field: signup.birth_certificate_image_files")
    private String birthCertificateImageFiles;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.534+08:00", comments="Source field: signup.house_ceritificate_image_files")
    private String houseCeritificateImageFiles;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.534+08:00", comments="Source field: signup.idcard")
    private String idcard;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.534+08:00", comments="Source field: signup.reg_code")
    private Integer regCode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.535+08:00", comments="Source field: signup.first_trial_user_id")
    private Integer firstTrialUserId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.535+08:00", comments="Source field: signup.first_trial_datetime")
    private Date firstTrialDatetime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.535+08:00", comments="Source field: signup.create_time")
    private Date createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.535+08:00", comments="Source field: signup.update_time")
    private Date updateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.536+08:00", comments="Source field: signup.birthday_date")
    private Date birthdayDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.536+08:00", comments="Source field: signup.empty_regcode_user_id")
    private Integer emptyRegcodeUserId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.536+08:00", comments="Source field: signup.regenerator_regcode_user_id")
    private Integer regeneratorRegcodeUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table signup
     *
     * @mbg.generated Fri Jul 05 19:11:32 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.530+08:00", comments="Source field: signup.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.530+08:00", comments="Source field: signup.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.530+08:00", comments="Source field: signup.fixed_house")
    public String getFixedHouse() {
        return fixedHouse;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.530+08:00", comments="Source field: signup.fixed_house")
    public void setFixedHouse(String fixedHouse) {
        this.fixedHouse = fixedHouse == null ? null : fixedHouse.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.530+08:00", comments="Source field: signup.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.530+08:00", comments="Source field: signup.name")
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.531+08:00", comments="Source field: signup.birthday")
    public String getBirthday() {
        return birthday;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.531+08:00", comments="Source field: signup.birthday")
    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.531+08:00", comments="Source field: signup.census")
    public String getCensus() {
        return census;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.531+08:00", comments="Source field: signup.census")
    public void setCensus(String census) {
        this.census = census == null ? null : census.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.531+08:00", comments="Source field: signup.account_location")
    public String getAccountLocation() {
        return accountLocation;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.531+08:00", comments="Source field: signup.account_location")
    public void setAccountLocation(String accountLocation) {
        this.accountLocation = accountLocation == null ? null : accountLocation.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.531+08:00", comments="Source field: signup.father")
    public String getFather() {
        return father;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.531+08:00", comments="Source field: signup.father")
    public void setFather(String father) {
        this.father = father == null ? null : father.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.531+08:00", comments="Source field: signup.mother")
    public String getMother() {
        return mother;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.531+08:00", comments="Source field: signup.mother")
    public void setMother(String mother) {
        this.mother = mother == null ? null : mother.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.531+08:00", comments="Source field: signup.father_workunit")
    public String getFatherWorkunit() {
        return fatherWorkunit;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.532+08:00", comments="Source field: signup.father_workunit")
    public void setFatherWorkunit(String fatherWorkunit) {
        this.fatherWorkunit = fatherWorkunit == null ? null : fatherWorkunit.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.532+08:00", comments="Source field: signup.mother_workunit")
    public String getMotherWorkunit() {
        return motherWorkunit;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.532+08:00", comments="Source field: signup.mother_workunit")
    public void setMotherWorkunit(String motherWorkunit) {
        this.motherWorkunit = motherWorkunit == null ? null : motherWorkunit.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.532+08:00", comments="Source field: signup.phone")
    public String getPhone() {
        return phone;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.532+08:00", comments="Source field: signup.phone")
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.532+08:00", comments="Source field: signup.address")
    public String getAddress() {
        return address;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.532+08:00", comments="Source field: signup.address")
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.533+08:00", comments="Source field: signup.gender")
    public String getGender() {
        return gender;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.533+08:00", comments="Source field: signup.gender")
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.533+08:00", comments="Source field: signup.first_trial")
    public Integer getFirstTrial() {
        return firstTrial;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.533+08:00", comments="Source field: signup.first_trial")
    public void setFirstTrial(Integer firstTrial) {
        this.firstTrial = firstTrial;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.533+08:00", comments="Source field: signup.first_trial_information")
    public String getFirstTrialInformation() {
        return firstTrialInformation;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.533+08:00", comments="Source field: signup.first_trial_information")
    public void setFirstTrialInformation(String firstTrialInformation) {
        this.firstTrialInformation = firstTrialInformation == null ? null : firstTrialInformation.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.534+08:00", comments="Source field: signup.census_image_files")
    public String getCensusImageFiles() {
        return censusImageFiles;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.534+08:00", comments="Source field: signup.census_image_files")
    public void setCensusImageFiles(String censusImageFiles) {
        this.censusImageFiles = censusImageFiles == null ? null : censusImageFiles.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.534+08:00", comments="Source field: signup.birth_certificate_image_files")
    public String getBirthCertificateImageFiles() {
        return birthCertificateImageFiles;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.534+08:00", comments="Source field: signup.birth_certificate_image_files")
    public void setBirthCertificateImageFiles(String birthCertificateImageFiles) {
        this.birthCertificateImageFiles = birthCertificateImageFiles == null ? null : birthCertificateImageFiles.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.534+08:00", comments="Source field: signup.house_ceritificate_image_files")
    public String getHouseCeritificateImageFiles() {
        return houseCeritificateImageFiles;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.534+08:00", comments="Source field: signup.house_ceritificate_image_files")
    public void setHouseCeritificateImageFiles(String houseCeritificateImageFiles) {
        this.houseCeritificateImageFiles = houseCeritificateImageFiles == null ? null : houseCeritificateImageFiles.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.534+08:00", comments="Source field: signup.idcard")
    public String getIdcard() {
        return idcard;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.534+08:00", comments="Source field: signup.idcard")
    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.535+08:00", comments="Source field: signup.reg_code")
    public Integer getRegCode() {
        return regCode;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.535+08:00", comments="Source field: signup.reg_code")
    public void setRegCode(Integer regCode) {
        this.regCode = regCode;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.535+08:00", comments="Source field: signup.first_trial_user_id")
    public Integer getFirstTrialUserId() {
        return firstTrialUserId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.535+08:00", comments="Source field: signup.first_trial_user_id")
    public void setFirstTrialUserId(Integer firstTrialUserId) {
        this.firstTrialUserId = firstTrialUserId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.535+08:00", comments="Source field: signup.first_trial_datetime")
    public Date getFirstTrialDatetime() {
        return firstTrialDatetime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.535+08:00", comments="Source field: signup.first_trial_datetime")
    public void setFirstTrialDatetime(Date firstTrialDatetime) {
        this.firstTrialDatetime = firstTrialDatetime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.535+08:00", comments="Source field: signup.create_time")
    public Date getCreateTime() {
        return createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.535+08:00", comments="Source field: signup.create_time")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.536+08:00", comments="Source field: signup.update_time")
    public Date getUpdateTime() {
        return updateTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.536+08:00", comments="Source field: signup.update_time")
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.536+08:00", comments="Source field: signup.birthday_date")
    public Date getBirthdayDate() {
        return birthdayDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.536+08:00", comments="Source field: signup.birthday_date")
    public void setBirthdayDate(Date birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.536+08:00", comments="Source field: signup.empty_regcode_user_id")
    public Integer getEmptyRegcodeUserId() {
        return emptyRegcodeUserId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.536+08:00", comments="Source field: signup.empty_regcode_user_id")
    public void setEmptyRegcodeUserId(Integer emptyRegcodeUserId) {
        this.emptyRegcodeUserId = emptyRegcodeUserId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.536+08:00", comments="Source field: signup.regenerator_regcode_user_id")
    public Integer getRegeneratorRegcodeUserId() {
        return regeneratorRegcodeUserId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.537+08:00", comments="Source field: signup.regenerator_regcode_user_id")
    public void setRegeneratorRegcodeUserId(Integer regeneratorRegcodeUserId) {
        this.regeneratorRegcodeUserId = regeneratorRegcodeUserId;
    }
}