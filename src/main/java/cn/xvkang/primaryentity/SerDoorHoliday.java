package cn.xvkang.primaryentity;

import java.io.Serializable;
import javax.annotation.Generated;

public class SerDoorHoliday implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.507+08:00", comments="Source field: Ser_Door_Holiday.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.507+08:00", comments="Source field: Ser_Door_Holiday.sDate")
    private String sdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.507+08:00", comments="Source field: Ser_Door_Holiday.DevcNum")
    private Integer devcnum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.507+08:00", comments="Source field: Ser_Door_Holiday.Doorid")
    private Integer doorid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Ser_Door_Holiday
     *
     * @mbg.generated Fri Jul 19 09:31:22 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.507+08:00", comments="Source field: Ser_Door_Holiday.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.507+08:00", comments="Source field: Ser_Door_Holiday.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.507+08:00", comments="Source field: Ser_Door_Holiday.sDate")
    public String getSdate() {
        return sdate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.507+08:00", comments="Source field: Ser_Door_Holiday.sDate")
    public void setSdate(String sdate) {
        this.sdate = sdate == null ? null : sdate.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.507+08:00", comments="Source field: Ser_Door_Holiday.DevcNum")
    public Integer getDevcnum() {
        return devcnum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.507+08:00", comments="Source field: Ser_Door_Holiday.DevcNum")
    public void setDevcnum(Integer devcnum) {
        this.devcnum = devcnum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.507+08:00", comments="Source field: Ser_Door_Holiday.Doorid")
    public Integer getDoorid() {
        return doorid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.507+08:00", comments="Source field: Ser_Door_Holiday.Doorid")
    public void setDoorid(Integer doorid) {
        this.doorid = doorid;
    }
}