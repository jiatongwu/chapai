package cn.xvkang.slavemapperdynamicsql;

import java.sql.JDBCType;
import java.util.Date;

import javax.annotation.Generated;

import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SignupDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.537+08:00", comments="Source Table: signup")
    public static final Signup signup = new Signup();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.537+08:00", comments="Source field: signup.id")
    public static final SqlColumn<Integer> id = signup.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.538+08:00", comments="Source field: signup.fixed_house")
    public static final SqlColumn<String> fixedHouse = signup.fixedHouse;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.538+08:00", comments="Source field: signup.name")
    public static final SqlColumn<String> name = signup.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.538+08:00", comments="Source field: signup.birthday")
    public static final SqlColumn<String> birthday = signup.birthday;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.538+08:00", comments="Source field: signup.census")
    public static final SqlColumn<String> census = signup.census;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.538+08:00", comments="Source field: signup.account_location")
    public static final SqlColumn<String> accountLocation = signup.accountLocation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.539+08:00", comments="Source field: signup.father")
    public static final SqlColumn<String> father = signup.father;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.539+08:00", comments="Source field: signup.mother")
    public static final SqlColumn<String> mother = signup.mother;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.539+08:00", comments="Source field: signup.father_workunit")
    public static final SqlColumn<String> fatherWorkunit = signup.fatherWorkunit;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.539+08:00", comments="Source field: signup.mother_workunit")
    public static final SqlColumn<String> motherWorkunit = signup.motherWorkunit;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.539+08:00", comments="Source field: signup.phone")
    public static final SqlColumn<String> phone = signup.phone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.539+08:00", comments="Source field: signup.address")
    public static final SqlColumn<String> address = signup.address;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.540+08:00", comments="Source field: signup.gender")
    public static final SqlColumn<String> gender = signup.gender;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.540+08:00", comments="Source field: signup.first_trial")
    public static final SqlColumn<Integer> firstTrial = signup.firstTrial;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.540+08:00", comments="Source field: signup.first_trial_information")
    public static final SqlColumn<String> firstTrialInformation = signup.firstTrialInformation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.540+08:00", comments="Source field: signup.census_image_files")
    public static final SqlColumn<String> censusImageFiles = signup.censusImageFiles;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.540+08:00", comments="Source field: signup.birth_certificate_image_files")
    public static final SqlColumn<String> birthCertificateImageFiles = signup.birthCertificateImageFiles;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.541+08:00", comments="Source field: signup.house_ceritificate_image_files")
    public static final SqlColumn<String> houseCeritificateImageFiles = signup.houseCeritificateImageFiles;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.541+08:00", comments="Source field: signup.idcard")
    public static final SqlColumn<String> idcard = signup.idcard;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.541+08:00", comments="Source field: signup.reg_code")
    public static final SqlColumn<Integer> regCode = signup.regCode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.541+08:00", comments="Source field: signup.first_trial_user_id")
    public static final SqlColumn<Integer> firstTrialUserId = signup.firstTrialUserId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.541+08:00", comments="Source field: signup.first_trial_datetime")
    public static final SqlColumn<Date> firstTrialDatetime = signup.firstTrialDatetime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.542+08:00", comments="Source field: signup.create_time")
    public static final SqlColumn<Date> createTime = signup.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.542+08:00", comments="Source field: signup.update_time")
    public static final SqlColumn<Date> updateTime = signup.updateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.542+08:00", comments="Source field: signup.birthday_date")
    public static final SqlColumn<Date> birthdayDate = signup.birthdayDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.542+08:00", comments="Source field: signup.empty_regcode_user_id")
    public static final SqlColumn<Integer> emptyRegcodeUserId = signup.emptyRegcodeUserId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.542+08:00", comments="Source field: signup.regenerator_regcode_user_id")
    public static final SqlColumn<Integer> regeneratorRegcodeUserId = signup.regeneratorRegcodeUserId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.537+08:00", comments="Source Table: signup")
    public static final class Signup extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> fixedHouse = column("fixed_house", JDBCType.VARCHAR);

        public final SqlColumn<String> name = column("`name`", JDBCType.VARCHAR);

        public final SqlColumn<String> birthday = column("birthday", JDBCType.VARCHAR);

        public final SqlColumn<String> census = column("census", JDBCType.VARCHAR);

        public final SqlColumn<String> accountLocation = column("account_location", JDBCType.VARCHAR);

        public final SqlColumn<String> father = column("father", JDBCType.VARCHAR);

        public final SqlColumn<String> mother = column("mother", JDBCType.VARCHAR);

        public final SqlColumn<String> fatherWorkunit = column("father_workunit", JDBCType.VARCHAR);

        public final SqlColumn<String> motherWorkunit = column("mother_workunit", JDBCType.VARCHAR);

        public final SqlColumn<String> phone = column("phone", JDBCType.VARCHAR);

        public final SqlColumn<String> address = column("address", JDBCType.VARCHAR);

        public final SqlColumn<String> gender = column("gender", JDBCType.VARCHAR);

        public final SqlColumn<Integer> firstTrial = column("first_trial", JDBCType.INTEGER);

        public final SqlColumn<String> firstTrialInformation = column("first_trial_information", JDBCType.VARCHAR);

        public final SqlColumn<String> censusImageFiles = column("census_image_files", JDBCType.VARCHAR);

        public final SqlColumn<String> birthCertificateImageFiles = column("birth_certificate_image_files", JDBCType.VARCHAR);

        public final SqlColumn<String> houseCeritificateImageFiles = column("house_ceritificate_image_files", JDBCType.VARCHAR);

        public final SqlColumn<String> idcard = column("idcard", JDBCType.VARCHAR);

        public final SqlColumn<Integer> regCode = column("reg_code", JDBCType.INTEGER);

        public final SqlColumn<Integer> firstTrialUserId = column("first_trial_user_id", JDBCType.INTEGER);

        public final SqlColumn<Date> firstTrialDatetime = column("first_trial_datetime", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> updateTime = column("update_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> birthdayDate = column("birthday_date", JDBCType.DATE);

        public final SqlColumn<Integer> emptyRegcodeUserId = column("empty_regcode_user_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> regeneratorRegcodeUserId = column("regenerator_regcode_user_id", JDBCType.INTEGER);

        public Signup() {
            super("signup");
        }
    }
}