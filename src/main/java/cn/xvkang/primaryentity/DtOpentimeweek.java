package cn.xvkang.primaryentity;

import java.io.Serializable;
import javax.annotation.Generated;

public class DtOpentimeweek implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.390+08:00", comments="Source field: Dt_OpenTimeWeek.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.390+08:00", comments="Source field: Dt_OpenTimeWeek.DevcNum")
    private Integer devcnum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.390+08:00", comments="Source field: Dt_OpenTimeWeek.Week")
    private Integer week;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.390+08:00", comments="Source field: Dt_OpenTimeWeek.startime")
    private String startime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.390+08:00", comments="Source field: Dt_OpenTimeWeek.endtime")
    private String endtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Dt_OpenTimeWeek
     *
     * @mbg.generated Fri Jul 05 20:12:44 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.390+08:00", comments="Source field: Dt_OpenTimeWeek.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.390+08:00", comments="Source field: Dt_OpenTimeWeek.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.390+08:00", comments="Source field: Dt_OpenTimeWeek.DevcNum")
    public Integer getDevcnum() {
        return devcnum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.390+08:00", comments="Source field: Dt_OpenTimeWeek.DevcNum")
    public void setDevcnum(Integer devcnum) {
        this.devcnum = devcnum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.390+08:00", comments="Source field: Dt_OpenTimeWeek.Week")
    public Integer getWeek() {
        return week;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.390+08:00", comments="Source field: Dt_OpenTimeWeek.Week")
    public void setWeek(Integer week) {
        this.week = week;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.390+08:00", comments="Source field: Dt_OpenTimeWeek.startime")
    public String getStartime() {
        return startime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.390+08:00", comments="Source field: Dt_OpenTimeWeek.startime")
    public void setStartime(String startime) {
        this.startime = startime == null ? null : startime.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.390+08:00", comments="Source field: Dt_OpenTimeWeek.endtime")
    public String getEndtime() {
        return endtime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.391+08:00", comments="Source field: Dt_OpenTimeWeek.endtime")
    public void setEndtime(String endtime) {
        this.endtime = endtime == null ? null : endtime.trim();
    }
}