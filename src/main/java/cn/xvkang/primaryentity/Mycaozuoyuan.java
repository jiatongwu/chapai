package cn.xvkang.primaryentity;

import java.io.Serializable;
import javax.annotation.Generated;

public class Mycaozuoyuan implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.644+08:00", comments="Source field: MYCAOZUOYUAN.CardNO")
    private String cardno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.644+08:00", comments="Source field: MYCAOZUOYUAN.ID")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.644+08:00", comments="Source field: MYCAOZUOYUAN.CardType")
    private String cardtype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.644+08:00", comments="Source field: MYCAOZUOYUAN.UserNO")
    private String userno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.644+08:00", comments="Source field: MYCAOZUOYUAN.UserName")
    private String username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.644+08:00", comments="Source field: MYCAOZUOYUAN.DeptName")
    private String deptname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.644+08:00", comments="Source field: MYCAOZUOYUAN.Pwd")
    private String pwd;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.644+08:00", comments="Source field: MYCAOZUOYUAN.CardState")
    private Integer cardstate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.645+08:00", comments="Source field: MYCAOZUOYUAN.UserLevel")
    private Integer userlevel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table MYCAOZUOYUAN
     *
     * @mbg.generated Tue Jul 16 10:08:57 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.644+08:00", comments="Source field: MYCAOZUOYUAN.CardNO")
    public String getCardno() {
        return cardno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.644+08:00", comments="Source field: MYCAOZUOYUAN.CardNO")
    public void setCardno(String cardno) {
        this.cardno = cardno == null ? null : cardno.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.644+08:00", comments="Source field: MYCAOZUOYUAN.ID")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.644+08:00", comments="Source field: MYCAOZUOYUAN.ID")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.644+08:00", comments="Source field: MYCAOZUOYUAN.CardType")
    public String getCardtype() {
        return cardtype;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.644+08:00", comments="Source field: MYCAOZUOYUAN.CardType")
    public void setCardtype(String cardtype) {
        this.cardtype = cardtype == null ? null : cardtype.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.644+08:00", comments="Source field: MYCAOZUOYUAN.UserNO")
    public String getUserno() {
        return userno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.644+08:00", comments="Source field: MYCAOZUOYUAN.UserNO")
    public void setUserno(String userno) {
        this.userno = userno == null ? null : userno.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.644+08:00", comments="Source field: MYCAOZUOYUAN.UserName")
    public String getUsername() {
        return username;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.644+08:00", comments="Source field: MYCAOZUOYUAN.UserName")
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.644+08:00", comments="Source field: MYCAOZUOYUAN.DeptName")
    public String getDeptname() {
        return deptname;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.644+08:00", comments="Source field: MYCAOZUOYUAN.DeptName")
    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.644+08:00", comments="Source field: MYCAOZUOYUAN.Pwd")
    public String getPwd() {
        return pwd;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.644+08:00", comments="Source field: MYCAOZUOYUAN.Pwd")
    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.644+08:00", comments="Source field: MYCAOZUOYUAN.CardState")
    public Integer getCardstate() {
        return cardstate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.645+08:00", comments="Source field: MYCAOZUOYUAN.CardState")
    public void setCardstate(Integer cardstate) {
        this.cardstate = cardstate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.645+08:00", comments="Source field: MYCAOZUOYUAN.UserLevel")
    public Integer getUserlevel() {
        return userlevel;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.645+08:00", comments="Source field: MYCAOZUOYUAN.UserLevel")
    public void setUserlevel(Integer userlevel) {
        this.userlevel = userlevel;
    }
}