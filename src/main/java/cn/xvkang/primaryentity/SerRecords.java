package cn.xvkang.primaryentity;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class SerRecords implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.868+08:00", comments="Source field: Ser_Records.CardID")
    private String cardid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.868+08:00", comments="Source field: Ser_Records.UserNo")
    private String userno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.868+08:00", comments="Source field: Ser_Records.MachNo")
    private Integer machno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.868+08:00", comments="Source field: Ser_Records.MachPlace")
    private String machplace;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.868+08:00", comments="Source field: Ser_Records.DoorNo")
    private Integer doorno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.868+08:00", comments="Source field: Ser_Records.DoorPlace")
    private String doorplace;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.868+08:00", comments="Source field: Ser_Records.Events")
    private String events;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.868+08:00", comments="Source field: Ser_Records.OpenTime")
    private Date opentime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.868+08:00", comments="Source field: Ser_Records.Password")
    private String password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.869+08:00", comments="Source field: Ser_Records.PasswordType")
    private String passwordtype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Ser_Records
     *
     * @mbg.generated Thu Jul 18 14:55:17 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.868+08:00", comments="Source field: Ser_Records.CardID")
    public String getCardid() {
        return cardid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.868+08:00", comments="Source field: Ser_Records.CardID")
    public void setCardid(String cardid) {
        this.cardid = cardid == null ? null : cardid.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.868+08:00", comments="Source field: Ser_Records.UserNo")
    public String getUserno() {
        return userno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.868+08:00", comments="Source field: Ser_Records.UserNo")
    public void setUserno(String userno) {
        this.userno = userno == null ? null : userno.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.868+08:00", comments="Source field: Ser_Records.MachNo")
    public Integer getMachno() {
        return machno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.868+08:00", comments="Source field: Ser_Records.MachNo")
    public void setMachno(Integer machno) {
        this.machno = machno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.868+08:00", comments="Source field: Ser_Records.MachPlace")
    public String getMachplace() {
        return machplace;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.868+08:00", comments="Source field: Ser_Records.MachPlace")
    public void setMachplace(String machplace) {
        this.machplace = machplace == null ? null : machplace.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.868+08:00", comments="Source field: Ser_Records.DoorNo")
    public Integer getDoorno() {
        return doorno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.868+08:00", comments="Source field: Ser_Records.DoorNo")
    public void setDoorno(Integer doorno) {
        this.doorno = doorno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.868+08:00", comments="Source field: Ser_Records.DoorPlace")
    public String getDoorplace() {
        return doorplace;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.868+08:00", comments="Source field: Ser_Records.DoorPlace")
    public void setDoorplace(String doorplace) {
        this.doorplace = doorplace == null ? null : doorplace.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.868+08:00", comments="Source field: Ser_Records.Events")
    public String getEvents() {
        return events;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.868+08:00", comments="Source field: Ser_Records.Events")
    public void setEvents(String events) {
        this.events = events == null ? null : events.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.868+08:00", comments="Source field: Ser_Records.OpenTime")
    public Date getOpentime() {
        return opentime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.868+08:00", comments="Source field: Ser_Records.OpenTime")
    public void setOpentime(Date opentime) {
        this.opentime = opentime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.868+08:00", comments="Source field: Ser_Records.Password")
    public String getPassword() {
        return password;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.869+08:00", comments="Source field: Ser_Records.Password")
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.869+08:00", comments="Source field: Ser_Records.PasswordType")
    public String getPasswordtype() {
        return passwordtype;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.869+08:00", comments="Source field: Ser_Records.PasswordType")
    public void setPasswordtype(String passwordtype) {
        this.passwordtype = passwordtype == null ? null : passwordtype.trim();
    }
}