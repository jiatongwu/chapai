package cn.xvkang.primaryentity;

import java.io.Serializable;
import javax.annotation.Generated;

public class DtFooroutset implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.383+08:00", comments="Source field: Dt_FoorOutSet.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.383+08:00", comments="Source field: Dt_FoorOutSet.DevcNo")
    private Integer devcno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.383+08:00", comments="Source field: Dt_FoorOutSet.Holid")
    private Boolean holid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.383+08:00", comments="Source field: Dt_FoorOutSet.Foorkzout")
    private Boolean foorkzout;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.383+08:00", comments="Source field: Dt_FoorOutSet.Foorhf")
    private Boolean foorhf;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.384+08:00", comments="Source field: Dt_FoorOutSet.BaoJin")
    private Boolean baojin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.384+08:00", comments="Source field: Dt_FoorOutSet.RecCunchu")
    private Boolean reccunchu;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.384+08:00", comments="Source field: Dt_FoorOutSet.FoorInfo")
    private String foorinfo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Dt_FoorOutSet
     *
     * @mbg.generated Fri Jul 05 20:12:44 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.383+08:00", comments="Source field: Dt_FoorOutSet.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.383+08:00", comments="Source field: Dt_FoorOutSet.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.383+08:00", comments="Source field: Dt_FoorOutSet.DevcNo")
    public Integer getDevcno() {
        return devcno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.383+08:00", comments="Source field: Dt_FoorOutSet.DevcNo")
    public void setDevcno(Integer devcno) {
        this.devcno = devcno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.383+08:00", comments="Source field: Dt_FoorOutSet.Holid")
    public Boolean getHolid() {
        return holid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.383+08:00", comments="Source field: Dt_FoorOutSet.Holid")
    public void setHolid(Boolean holid) {
        this.holid = holid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.383+08:00", comments="Source field: Dt_FoorOutSet.Foorkzout")
    public Boolean getFoorkzout() {
        return foorkzout;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.383+08:00", comments="Source field: Dt_FoorOutSet.Foorkzout")
    public void setFoorkzout(Boolean foorkzout) {
        this.foorkzout = foorkzout;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.384+08:00", comments="Source field: Dt_FoorOutSet.Foorhf")
    public Boolean getFoorhf() {
        return foorhf;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.384+08:00", comments="Source field: Dt_FoorOutSet.Foorhf")
    public void setFoorhf(Boolean foorhf) {
        this.foorhf = foorhf;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.384+08:00", comments="Source field: Dt_FoorOutSet.BaoJin")
    public Boolean getBaojin() {
        return baojin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.384+08:00", comments="Source field: Dt_FoorOutSet.BaoJin")
    public void setBaojin(Boolean baojin) {
        this.baojin = baojin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.384+08:00", comments="Source field: Dt_FoorOutSet.RecCunchu")
    public Boolean getReccunchu() {
        return reccunchu;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.384+08:00", comments="Source field: Dt_FoorOutSet.RecCunchu")
    public void setReccunchu(Boolean reccunchu) {
        this.reccunchu = reccunchu;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.384+08:00", comments="Source field: Dt_FoorOutSet.FoorInfo")
    public String getFoorinfo() {
        return foorinfo;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.384+08:00", comments="Source field: Dt_FoorOutSet.FoorInfo")
    public void setFoorinfo(String foorinfo) {
        this.foorinfo = foorinfo == null ? null : foorinfo.trim();
    }
}