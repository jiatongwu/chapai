package cn.xvkang.primaryentity;

import java.io.Serializable;
import javax.annotation.Generated;

public class DtQrsdoordevcset implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.103+08:00", comments="Source field: Dt_qrsDoorDevcSet.DevcNum")
    private Integer devcnum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.103+08:00", comments="Source field: Dt_qrsDoorDevcSet.DoorNum")
    private Integer doornum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.104+08:00", comments="Source field: Dt_qrsDoorDevcSet.DoorPace")
    private String doorpace;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Dt_qrsDoorDevcSet
     *
     * @mbg.generated Fri Jul 19 09:31:22 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.103+08:00", comments="Source field: Dt_qrsDoorDevcSet.DevcNum")
    public Integer getDevcnum() {
        return devcnum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.103+08:00", comments="Source field: Dt_qrsDoorDevcSet.DevcNum")
    public void setDevcnum(Integer devcnum) {
        this.devcnum = devcnum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.103+08:00", comments="Source field: Dt_qrsDoorDevcSet.DoorNum")
    public Integer getDoornum() {
        return doornum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.103+08:00", comments="Source field: Dt_qrsDoorDevcSet.DoorNum")
    public void setDoornum(Integer doornum) {
        this.doornum = doornum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.104+08:00", comments="Source field: Dt_qrsDoorDevcSet.DoorPace")
    public String getDoorpace() {
        return doorpace;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.104+08:00", comments="Source field: Dt_qrsDoorDevcSet.DoorPace")
    public void setDoorpace(String doorpace) {
        this.doorpace = doorpace == null ? null : doorpace.trim();
    }
}