package cn.xvkang.primaryentity;

import java.io.Serializable;
import javax.annotation.Generated;

public class ZhPerson implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.967+08:00", comments="Source field: zh_Person.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.967+08:00", comments="Source field: zh_Person.userNo")
    private String userno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.967+08:00", comments="Source field: zh_Person.userName")
    private String username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.967+08:00", comments="Source field: zh_Person.sex")
    private String sex;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.967+08:00", comments="Source field: zh_Person.homeAddress")
    private String homeaddress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.967+08:00", comments="Source field: zh_Person.mobNumber")
    private String mobnumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.967+08:00", comments="Source field: zh_Person.carSpalcesNum")
    private String carspalcesnum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.967+08:00", comments="Source field: zh_Person.synflag")
    private Integer synflag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table zh_Person
     *
     * @mbg.generated Sun Jul 14 17:27:27 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.967+08:00", comments="Source field: zh_Person.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.967+08:00", comments="Source field: zh_Person.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.967+08:00", comments="Source field: zh_Person.userNo")
    public String getUserno() {
        return userno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.967+08:00", comments="Source field: zh_Person.userNo")
    public void setUserno(String userno) {
        this.userno = userno == null ? null : userno.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.967+08:00", comments="Source field: zh_Person.userName")
    public String getUsername() {
        return username;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.967+08:00", comments="Source field: zh_Person.userName")
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.967+08:00", comments="Source field: zh_Person.sex")
    public String getSex() {
        return sex;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.967+08:00", comments="Source field: zh_Person.sex")
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.967+08:00", comments="Source field: zh_Person.homeAddress")
    public String getHomeaddress() {
        return homeaddress;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.967+08:00", comments="Source field: zh_Person.homeAddress")
    public void setHomeaddress(String homeaddress) {
        this.homeaddress = homeaddress == null ? null : homeaddress.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.967+08:00", comments="Source field: zh_Person.mobNumber")
    public String getMobnumber() {
        return mobnumber;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.967+08:00", comments="Source field: zh_Person.mobNumber")
    public void setMobnumber(String mobnumber) {
        this.mobnumber = mobnumber == null ? null : mobnumber.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.967+08:00", comments="Source field: zh_Person.carSpalcesNum")
    public String getCarspalcesnum() {
        return carspalcesnum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.967+08:00", comments="Source field: zh_Person.carSpalcesNum")
    public void setCarspalcesnum(String carspalcesnum) {
        this.carspalcesnum = carspalcesnum == null ? null : carspalcesnum.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.967+08:00", comments="Source field: zh_Person.synflag")
    public Integer getSynflag() {
        return synflag;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.968+08:00", comments="Source field: zh_Person.synflag")
    public void setSynflag(Integer synflag) {
        this.synflag = synflag;
    }
}