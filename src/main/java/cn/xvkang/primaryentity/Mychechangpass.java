package cn.xvkang.primaryentity;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class Mychechangpass implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.685+08:00", comments="Source field: MYCHECHANGPASS.Pwd")
    private String pwd;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.685+08:00", comments="Source field: MYCHECHANGPASS.PCName")
    private String pcname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.686+08:00", comments="Source field: MYCHECHANGPASS.BakeupTime")
    private Date bakeuptime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table MYCHECHANGPASS
     *
     * @mbg.generated Thu Jul 18 14:55:17 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.685+08:00", comments="Source field: MYCHECHANGPASS.Pwd")
    public String getPwd() {
        return pwd;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.685+08:00", comments="Source field: MYCHECHANGPASS.Pwd")
    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.685+08:00", comments="Source field: MYCHECHANGPASS.PCName")
    public String getPcname() {
        return pcname;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.685+08:00", comments="Source field: MYCHECHANGPASS.PCName")
    public void setPcname(String pcname) {
        this.pcname = pcname == null ? null : pcname.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.686+08:00", comments="Source field: MYCHECHANGPASS.BakeupTime")
    public Date getBakeuptime() {
        return bakeuptime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.686+08:00", comments="Source field: MYCHECHANGPASS.BakeupTime")
    public void setBakeuptime(Date bakeuptime) {
        this.bakeuptime = bakeuptime;
    }
}