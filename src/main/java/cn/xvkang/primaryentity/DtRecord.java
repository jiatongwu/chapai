package cn.xvkang.primaryentity;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class DtRecord implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.397+08:00", comments="Source field: Dt_Record.CardNo")
    private String cardno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.397+08:00", comments="Source field: Dt_Record.CardFlag")
    private String cardflag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.397+08:00", comments="Source field: Dt_Record.OpenTime")
    private Date opentime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.397+08:00", comments="Source field: Dt_Record.DevcNo")
    private Integer devcno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.397+08:00", comments="Source field: Dt_Record.Foorflag")
    private String foorflag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.397+08:00", comments="Source field: Dt_Record.Eventss")
    private String eventss;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Dt_Record
     *
     * @mbg.generated Fri Jul 05 20:12:44 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.397+08:00", comments="Source field: Dt_Record.CardNo")
    public String getCardno() {
        return cardno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.397+08:00", comments="Source field: Dt_Record.CardNo")
    public void setCardno(String cardno) {
        this.cardno = cardno == null ? null : cardno.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.397+08:00", comments="Source field: Dt_Record.CardFlag")
    public String getCardflag() {
        return cardflag;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.397+08:00", comments="Source field: Dt_Record.CardFlag")
    public void setCardflag(String cardflag) {
        this.cardflag = cardflag == null ? null : cardflag.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.397+08:00", comments="Source field: Dt_Record.OpenTime")
    public Date getOpentime() {
        return opentime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.397+08:00", comments="Source field: Dt_Record.OpenTime")
    public void setOpentime(Date opentime) {
        this.opentime = opentime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.397+08:00", comments="Source field: Dt_Record.DevcNo")
    public Integer getDevcno() {
        return devcno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.397+08:00", comments="Source field: Dt_Record.DevcNo")
    public void setDevcno(Integer devcno) {
        this.devcno = devcno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.397+08:00", comments="Source field: Dt_Record.Foorflag")
    public String getFoorflag() {
        return foorflag;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.397+08:00", comments="Source field: Dt_Record.Foorflag")
    public void setFoorflag(String foorflag) {
        this.foorflag = foorflag == null ? null : foorflag.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.397+08:00", comments="Source field: Dt_Record.Eventss")
    public String getEventss() {
        return eventss;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.397+08:00", comments="Source field: Dt_Record.Eventss")
    public void setEventss(String eventss) {
        this.eventss = eventss == null ? null : eventss.trim();
    }
}