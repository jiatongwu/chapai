package cn.xvkang.primaryentity;

import java.io.Serializable;
import javax.annotation.Generated;

public class SerOpendoormode implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.853+08:00", comments="Source field: Ser_OpenDoorMode.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.853+08:00", comments="Source field: Ser_OpenDoorMode.Devcid")
    private Integer devcid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.853+08:00", comments="Source field: Ser_OpenDoorMode.Doorid")
    private Integer doorid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.853+08:00", comments="Source field: Ser_OpenDoorMode.DoorJl")
    private String doorjl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Ser_OpenDoorMode
     *
     * @mbg.generated Fri Jul 05 20:12:44 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.853+08:00", comments="Source field: Ser_OpenDoorMode.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.853+08:00", comments="Source field: Ser_OpenDoorMode.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.853+08:00", comments="Source field: Ser_OpenDoorMode.Devcid")
    public Integer getDevcid() {
        return devcid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.853+08:00", comments="Source field: Ser_OpenDoorMode.Devcid")
    public void setDevcid(Integer devcid) {
        this.devcid = devcid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.853+08:00", comments="Source field: Ser_OpenDoorMode.Doorid")
    public Integer getDoorid() {
        return doorid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.853+08:00", comments="Source field: Ser_OpenDoorMode.Doorid")
    public void setDoorid(Integer doorid) {
        this.doorid = doorid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.853+08:00", comments="Source field: Ser_OpenDoorMode.DoorJl")
    public String getDoorjl() {
        return doorjl;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.853+08:00", comments="Source field: Ser_OpenDoorMode.DoorJl")
    public void setDoorjl(String doorjl) {
        this.doorjl = doorjl == null ? null : doorjl.trim();
    }
}