package cn.xvkang.primaryentity;

import java.io.Serializable;
import javax.annotation.Generated;

public class DtFoortb implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.424+08:00", comments="Source field: Dt_foorTb.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.424+08:00", comments="Source field: Dt_foorTb.foorid")
    private Integer foorid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.424+08:00", comments="Source field: Dt_foorTb.FoorName")
    private String foorname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.424+08:00", comments="Source field: Dt_foorTb.devcNo")
    private Integer devcno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.424+08:00", comments="Source field: Dt_foorTb.FoorNo")
    private Integer foorno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Dt_foorTb
     *
     * @mbg.generated Fri Jul 05 20:12:44 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.424+08:00", comments="Source field: Dt_foorTb.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.424+08:00", comments="Source field: Dt_foorTb.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.424+08:00", comments="Source field: Dt_foorTb.foorid")
    public Integer getFoorid() {
        return foorid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.424+08:00", comments="Source field: Dt_foorTb.foorid")
    public void setFoorid(Integer foorid) {
        this.foorid = foorid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.424+08:00", comments="Source field: Dt_foorTb.FoorName")
    public String getFoorname() {
        return foorname;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.424+08:00", comments="Source field: Dt_foorTb.FoorName")
    public void setFoorname(String foorname) {
        this.foorname = foorname == null ? null : foorname.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.424+08:00", comments="Source field: Dt_foorTb.devcNo")
    public Integer getDevcno() {
        return devcno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.424+08:00", comments="Source field: Dt_foorTb.devcNo")
    public void setDevcno(Integer devcno) {
        this.devcno = devcno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.424+08:00", comments="Source field: Dt_foorTb.FoorNo")
    public Integer getFoorno() {
        return foorno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.424+08:00", comments="Source field: Dt_foorTb.FoorNo")
    public void setFoorno(Integer foorno) {
        this.foorno = foorno;
    }
}