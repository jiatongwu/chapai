package cn.xvkang.primaryentity;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class MRecord implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.095+08:00", comments="Source field: M_Record.CardID")
    private String cardid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.095+08:00", comments="Source field: M_Record.CardType")
    private String cardtype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.095+08:00", comments="Source field: M_Record.UserNo")
    private String userno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.095+08:00", comments="Source field: M_Record.UserName")
    private String username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.095+08:00", comments="Source field: M_Record.Dept")
    private String dept;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.095+08:00", comments="Source field: M_Record.MachNo")
    private Integer machno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.095+08:00", comments="Source field: M_Record.MachPlace")
    private String machplace;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.095+08:00", comments="Source field: M_Record.DoorNo")
    private Integer doorno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.095+08:00", comments="Source field: M_Record.DoorPlace")
    private String doorplace;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.095+08:00", comments="Source field: M_Record.Events")
    private String events;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.095+08:00", comments="Source field: M_Record.OpenTime")
    private Date opentime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.095+08:00", comments="Source field: M_Record.ControlType")
    private String controltype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table M_Record
     *
     * @mbg.generated Wed Jul 31 15:28:01 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.095+08:00", comments="Source field: M_Record.CardID")
    public String getCardid() {
        return cardid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.095+08:00", comments="Source field: M_Record.CardID")
    public void setCardid(String cardid) {
        this.cardid = cardid == null ? null : cardid.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.095+08:00", comments="Source field: M_Record.CardType")
    public String getCardtype() {
        return cardtype;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.095+08:00", comments="Source field: M_Record.CardType")
    public void setCardtype(String cardtype) {
        this.cardtype = cardtype == null ? null : cardtype.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.095+08:00", comments="Source field: M_Record.UserNo")
    public String getUserno() {
        return userno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.095+08:00", comments="Source field: M_Record.UserNo")
    public void setUserno(String userno) {
        this.userno = userno == null ? null : userno.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.095+08:00", comments="Source field: M_Record.UserName")
    public String getUsername() {
        return username;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.095+08:00", comments="Source field: M_Record.UserName")
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.095+08:00", comments="Source field: M_Record.Dept")
    public String getDept() {
        return dept;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.095+08:00", comments="Source field: M_Record.Dept")
    public void setDept(String dept) {
        this.dept = dept == null ? null : dept.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.095+08:00", comments="Source field: M_Record.MachNo")
    public Integer getMachno() {
        return machno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.095+08:00", comments="Source field: M_Record.MachNo")
    public void setMachno(Integer machno) {
        this.machno = machno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.095+08:00", comments="Source field: M_Record.MachPlace")
    public String getMachplace() {
        return machplace;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.095+08:00", comments="Source field: M_Record.MachPlace")
    public void setMachplace(String machplace) {
        this.machplace = machplace == null ? null : machplace.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.095+08:00", comments="Source field: M_Record.DoorNo")
    public Integer getDoorno() {
        return doorno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.095+08:00", comments="Source field: M_Record.DoorNo")
    public void setDoorno(Integer doorno) {
        this.doorno = doorno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.095+08:00", comments="Source field: M_Record.DoorPlace")
    public String getDoorplace() {
        return doorplace;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.095+08:00", comments="Source field: M_Record.DoorPlace")
    public void setDoorplace(String doorplace) {
        this.doorplace = doorplace == null ? null : doorplace.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.095+08:00", comments="Source field: M_Record.Events")
    public String getEvents() {
        return events;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.095+08:00", comments="Source field: M_Record.Events")
    public void setEvents(String events) {
        this.events = events == null ? null : events.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.095+08:00", comments="Source field: M_Record.OpenTime")
    public Date getOpentime() {
        return opentime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.095+08:00", comments="Source field: M_Record.OpenTime")
    public void setOpentime(Date opentime) {
        this.opentime = opentime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.095+08:00", comments="Source field: M_Record.ControlType")
    public String getControltype() {
        return controltype;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.095+08:00", comments="Source field: M_Record.ControlType")
    public void setControltype(String controltype) {
        this.controltype = controltype == null ? null : controltype.trim();
    }
}