package cn.xvkang.primaryentity;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class DtFaxingssue implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.370+08:00", comments="Source field: Dt_FaxingSsue.ID")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.371+08:00", comments="Source field: Dt_FaxingSsue.CardNo")
    private String cardno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.371+08:00", comments="Source field: Dt_FaxingSsue.CardIDNO")
    private String cardidno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.371+08:00", comments="Source field: Dt_FaxingSsue.CardIdIcflag")
    private Integer cardidicflag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.371+08:00", comments="Source field: Dt_FaxingSsue.UserNo")
    private String userno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.371+08:00", comments="Source field: Dt_FaxingSsue.CardState")
    private Integer cardstate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.372+08:00", comments="Source field: Dt_FaxingSsue.IssDate")
    private Date issdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.372+08:00", comments="Source field: Dt_FaxingSsue.CardType")
    private Integer cardtype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.372+08:00", comments="Source field: Dt_FaxingSsue.TemNum")
    private Integer temnum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.372+08:00", comments="Source field: Dt_FaxingSsue.TimeTeam")
    private Integer timeteam;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.372+08:00", comments="Source field: Dt_FaxingSsue.EndDate")
    private Date enddate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.372+08:00", comments="Source field: Dt_FaxingSsue.PersonDevcID")
    private Integer persondevcid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.373+08:00", comments="Source field: Dt_FaxingSsue.PersonFoorid")
    private Integer personfoorid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.373+08:00", comments="Source field: Dt_FaxingSsue.Mark")
    private String mark;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.373+08:00", comments="Source field: Dt_FaxingSsue.Holiday")
    private String holiday;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.373+08:00", comments="Source field: Dt_FaxingSsue.visitsFloor")
    private String visitsfloor;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.373+08:00", comments="Source field: Dt_FaxingSsue.isitsFlag")
    private String isitsflag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.374+08:00", comments="Source field: Dt_FaxingSsue.CardExitflag")
    private Boolean cardexitflag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.374+08:00", comments="Source field: Dt_FaxingSsue.CardDownFlag")
    private Boolean carddownflag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.374+08:00", comments="Source field: Dt_FaxingSsue.SfMoeny")
    private Integer sfmoeny;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.374+08:00", comments="Source field: Dt_FaxingSsue.fxmode")
    private Integer fxmode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.374+08:00", comments="Source field: Dt_FaxingSsue.TineOnline")
    private String tineonline;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Dt_FaxingSsue
     *
     * @mbg.generated Fri Jul 05 20:12:44 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.370+08:00", comments="Source field: Dt_FaxingSsue.ID")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.370+08:00", comments="Source field: Dt_FaxingSsue.ID")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.371+08:00", comments="Source field: Dt_FaxingSsue.CardNo")
    public String getCardno() {
        return cardno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.371+08:00", comments="Source field: Dt_FaxingSsue.CardNo")
    public void setCardno(String cardno) {
        this.cardno = cardno == null ? null : cardno.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.371+08:00", comments="Source field: Dt_FaxingSsue.CardIDNO")
    public String getCardidno() {
        return cardidno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.371+08:00", comments="Source field: Dt_FaxingSsue.CardIDNO")
    public void setCardidno(String cardidno) {
        this.cardidno = cardidno == null ? null : cardidno.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.371+08:00", comments="Source field: Dt_FaxingSsue.CardIdIcflag")
    public Integer getCardidicflag() {
        return cardidicflag;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.371+08:00", comments="Source field: Dt_FaxingSsue.CardIdIcflag")
    public void setCardidicflag(Integer cardidicflag) {
        this.cardidicflag = cardidicflag;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.371+08:00", comments="Source field: Dt_FaxingSsue.UserNo")
    public String getUserno() {
        return userno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.371+08:00", comments="Source field: Dt_FaxingSsue.UserNo")
    public void setUserno(String userno) {
        this.userno = userno == null ? null : userno.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.371+08:00", comments="Source field: Dt_FaxingSsue.CardState")
    public Integer getCardstate() {
        return cardstate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.371+08:00", comments="Source field: Dt_FaxingSsue.CardState")
    public void setCardstate(Integer cardstate) {
        this.cardstate = cardstate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.372+08:00", comments="Source field: Dt_FaxingSsue.IssDate")
    public Date getIssdate() {
        return issdate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.372+08:00", comments="Source field: Dt_FaxingSsue.IssDate")
    public void setIssdate(Date issdate) {
        this.issdate = issdate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.372+08:00", comments="Source field: Dt_FaxingSsue.CardType")
    public Integer getCardtype() {
        return cardtype;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.372+08:00", comments="Source field: Dt_FaxingSsue.CardType")
    public void setCardtype(Integer cardtype) {
        this.cardtype = cardtype;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.372+08:00", comments="Source field: Dt_FaxingSsue.TemNum")
    public Integer getTemnum() {
        return temnum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.372+08:00", comments="Source field: Dt_FaxingSsue.TemNum")
    public void setTemnum(Integer temnum) {
        this.temnum = temnum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.372+08:00", comments="Source field: Dt_FaxingSsue.TimeTeam")
    public Integer getTimeteam() {
        return timeteam;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.372+08:00", comments="Source field: Dt_FaxingSsue.TimeTeam")
    public void setTimeteam(Integer timeteam) {
        this.timeteam = timeteam;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.372+08:00", comments="Source field: Dt_FaxingSsue.EndDate")
    public Date getEnddate() {
        return enddate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.372+08:00", comments="Source field: Dt_FaxingSsue.EndDate")
    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.373+08:00", comments="Source field: Dt_FaxingSsue.PersonDevcID")
    public Integer getPersondevcid() {
        return persondevcid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.373+08:00", comments="Source field: Dt_FaxingSsue.PersonDevcID")
    public void setPersondevcid(Integer persondevcid) {
        this.persondevcid = persondevcid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.373+08:00", comments="Source field: Dt_FaxingSsue.PersonFoorid")
    public Integer getPersonfoorid() {
        return personfoorid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.373+08:00", comments="Source field: Dt_FaxingSsue.PersonFoorid")
    public void setPersonfoorid(Integer personfoorid) {
        this.personfoorid = personfoorid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.373+08:00", comments="Source field: Dt_FaxingSsue.Mark")
    public String getMark() {
        return mark;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.373+08:00", comments="Source field: Dt_FaxingSsue.Mark")
    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.373+08:00", comments="Source field: Dt_FaxingSsue.Holiday")
    public String getHoliday() {
        return holiday;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.373+08:00", comments="Source field: Dt_FaxingSsue.Holiday")
    public void setHoliday(String holiday) {
        this.holiday = holiday == null ? null : holiday.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.373+08:00", comments="Source field: Dt_FaxingSsue.visitsFloor")
    public String getVisitsfloor() {
        return visitsfloor;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.373+08:00", comments="Source field: Dt_FaxingSsue.visitsFloor")
    public void setVisitsfloor(String visitsfloor) {
        this.visitsfloor = visitsfloor == null ? null : visitsfloor.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.373+08:00", comments="Source field: Dt_FaxingSsue.isitsFlag")
    public String getIsitsflag() {
        return isitsflag;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.373+08:00", comments="Source field: Dt_FaxingSsue.isitsFlag")
    public void setIsitsflag(String isitsflag) {
        this.isitsflag = isitsflag == null ? null : isitsflag.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.374+08:00", comments="Source field: Dt_FaxingSsue.CardExitflag")
    public Boolean getCardexitflag() {
        return cardexitflag;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.374+08:00", comments="Source field: Dt_FaxingSsue.CardExitflag")
    public void setCardexitflag(Boolean cardexitflag) {
        this.cardexitflag = cardexitflag;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.374+08:00", comments="Source field: Dt_FaxingSsue.CardDownFlag")
    public Boolean getCarddownflag() {
        return carddownflag;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.374+08:00", comments="Source field: Dt_FaxingSsue.CardDownFlag")
    public void setCarddownflag(Boolean carddownflag) {
        this.carddownflag = carddownflag;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.374+08:00", comments="Source field: Dt_FaxingSsue.SfMoeny")
    public Integer getSfmoeny() {
        return sfmoeny;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.374+08:00", comments="Source field: Dt_FaxingSsue.SfMoeny")
    public void setSfmoeny(Integer sfmoeny) {
        this.sfmoeny = sfmoeny;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.374+08:00", comments="Source field: Dt_FaxingSsue.fxmode")
    public Integer getFxmode() {
        return fxmode;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.374+08:00", comments="Source field: Dt_FaxingSsue.fxmode")
    public void setFxmode(Integer fxmode) {
        this.fxmode = fxmode;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.374+08:00", comments="Source field: Dt_FaxingSsue.TineOnline")
    public String getTineonline() {
        return tineonline;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.375+08:00", comments="Source field: Dt_FaxingSsue.TineOnline")
    public void setTineonline(String tineonline) {
        this.tineonline = tineonline == null ? null : tineonline.trim();
    }
}