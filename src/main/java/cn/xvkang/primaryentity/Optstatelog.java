package cn.xvkang.primaryentity;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class Optstatelog implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.783+08:00", comments="Source field: OptStateLog.OptCardNO")
    private String optcardno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.783+08:00", comments="Source field: OptStateLog.UserName")
    private String username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.783+08:00", comments="Source field: OptStateLog.OptMenu")
    private String optmenu;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.783+08:00", comments="Source field: OptStateLog.OptContent")
    private String optcontent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.783+08:00", comments="Source field: OptStateLog.PCName")
    private String pcname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.783+08:00", comments="Source field: OptStateLog.OptTime")
    private Date opttime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table OptStateLog
     *
     * @mbg.generated Fri Jul 05 20:12:44 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.783+08:00", comments="Source field: OptStateLog.OptCardNO")
    public String getOptcardno() {
        return optcardno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.783+08:00", comments="Source field: OptStateLog.OptCardNO")
    public void setOptcardno(String optcardno) {
        this.optcardno = optcardno == null ? null : optcardno.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.783+08:00", comments="Source field: OptStateLog.UserName")
    public String getUsername() {
        return username;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.783+08:00", comments="Source field: OptStateLog.UserName")
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.783+08:00", comments="Source field: OptStateLog.OptMenu")
    public String getOptmenu() {
        return optmenu;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.783+08:00", comments="Source field: OptStateLog.OptMenu")
    public void setOptmenu(String optmenu) {
        this.optmenu = optmenu == null ? null : optmenu.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.783+08:00", comments="Source field: OptStateLog.OptContent")
    public String getOptcontent() {
        return optcontent;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.783+08:00", comments="Source field: OptStateLog.OptContent")
    public void setOptcontent(String optcontent) {
        this.optcontent = optcontent == null ? null : optcontent.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.783+08:00", comments="Source field: OptStateLog.PCName")
    public String getPcname() {
        return pcname;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.783+08:00", comments="Source field: OptStateLog.PCName")
    public void setPcname(String pcname) {
        this.pcname = pcname == null ? null : pcname.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.783+08:00", comments="Source field: OptStateLog.OptTime")
    public Date getOpttime() {
        return opttime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.783+08:00", comments="Source field: OptStateLog.OptTime")
    public void setOpttime(Date opttime) {
        this.opttime = opttime;
    }
}