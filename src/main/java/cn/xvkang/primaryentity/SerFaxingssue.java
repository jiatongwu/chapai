package cn.xvkang.primaryentity;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class SerFaxingssue implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.ID")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.CardNo")
    private String cardno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.CardIDNo")
    private String cardidno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.UserNo")
    private String userno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.CardState")
    private Integer cardstate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.IssDate")
    private Date issdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.CardType")
    private Integer cardtype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.TemNum")
    private Integer temnum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.TimeTeam")
    private Integer timeteam;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.CaseCade")
    private Integer casecade;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.EndDate")
    private Date enddate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.DoorMark")
    private String doormark;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.DoorPerInfo")
    private String doorperinfo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.Holiday")
    private String holiday;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.SysHoliday")
    private String sysholiday;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.DevcNum")
    private String devcnum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.DoorNum")
    private String doornum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.CardDownFlag")
    private Integer carddownflag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Ser_FaxingSsue
     *
     * @mbg.generated Tue Jul 16 10:08:57 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.ID")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.ID")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.CardNo")
    public String getCardno() {
        return cardno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.CardNo")
    public void setCardno(String cardno) {
        this.cardno = cardno == null ? null : cardno.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.CardIDNo")
    public String getCardidno() {
        return cardidno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.CardIDNo")
    public void setCardidno(String cardidno) {
        this.cardidno = cardidno == null ? null : cardidno.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.UserNo")
    public String getUserno() {
        return userno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.UserNo")
    public void setUserno(String userno) {
        this.userno = userno == null ? null : userno.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.CardState")
    public Integer getCardstate() {
        return cardstate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.CardState")
    public void setCardstate(Integer cardstate) {
        this.cardstate = cardstate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.IssDate")
    public Date getIssdate() {
        return issdate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.IssDate")
    public void setIssdate(Date issdate) {
        this.issdate = issdate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.CardType")
    public Integer getCardtype() {
        return cardtype;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.CardType")
    public void setCardtype(Integer cardtype) {
        this.cardtype = cardtype;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.TemNum")
    public Integer getTemnum() {
        return temnum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.TemNum")
    public void setTemnum(Integer temnum) {
        this.temnum = temnum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.TimeTeam")
    public Integer getTimeteam() {
        return timeteam;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.TimeTeam")
    public void setTimeteam(Integer timeteam) {
        this.timeteam = timeteam;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.CaseCade")
    public Integer getCasecade() {
        return casecade;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.CaseCade")
    public void setCasecade(Integer casecade) {
        this.casecade = casecade;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.EndDate")
    public Date getEnddate() {
        return enddate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.EndDate")
    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.DoorMark")
    public String getDoormark() {
        return doormark;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.DoorMark")
    public void setDoormark(String doormark) {
        this.doormark = doormark == null ? null : doormark.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.DoorPerInfo")
    public String getDoorperinfo() {
        return doorperinfo;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.DoorPerInfo")
    public void setDoorperinfo(String doorperinfo) {
        this.doorperinfo = doorperinfo == null ? null : doorperinfo.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.Holiday")
    public String getHoliday() {
        return holiday;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.Holiday")
    public void setHoliday(String holiday) {
        this.holiday = holiday == null ? null : holiday.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.SysHoliday")
    public String getSysholiday() {
        return sysholiday;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.SysHoliday")
    public void setSysholiday(String sysholiday) {
        this.sysholiday = sysholiday == null ? null : sysholiday.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.DevcNum")
    public String getDevcnum() {
        return devcnum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.DevcNum")
    public void setDevcnum(String devcnum) {
        this.devcnum = devcnum == null ? null : devcnum.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.DoorNum")
    public String getDoornum() {
        return doornum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.DoorNum")
    public void setDoornum(String doornum) {
        this.doornum = doornum == null ? null : doornum.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.CardDownFlag")
    public Integer getCarddownflag() {
        return carddownflag;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.937+08:00", comments="Source field: Ser_FaxingSsue.CardDownFlag")
    public void setCarddownflag(Integer carddownflag) {
        this.carddownflag = carddownflag;
    }
}