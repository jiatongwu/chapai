package cn.xvkang.primaryentity;

import java.io.Serializable;
import javax.annotation.Generated;

public class MTimeoutset implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.418+08:00", comments="Source field: M_TimeOutSet.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.418+08:00", comments="Source field: M_TimeOutSet.DevcNum")
    private Integer devcnum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.418+08:00", comments="Source field: M_TimeOutSet.Doornum")
    private Integer doornum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.418+08:00", comments="Source field: M_TimeOutSet.Times")
    private Integer times;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table M_TimeOutSet
     *
     * @mbg.generated Fri Jul 19 09:31:22 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.418+08:00", comments="Source field: M_TimeOutSet.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.418+08:00", comments="Source field: M_TimeOutSet.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.418+08:00", comments="Source field: M_TimeOutSet.DevcNum")
    public Integer getDevcnum() {
        return devcnum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.418+08:00", comments="Source field: M_TimeOutSet.DevcNum")
    public void setDevcnum(Integer devcnum) {
        this.devcnum = devcnum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.418+08:00", comments="Source field: M_TimeOutSet.Doornum")
    public Integer getDoornum() {
        return doornum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.418+08:00", comments="Source field: M_TimeOutSet.Doornum")
    public void setDoornum(Integer doornum) {
        this.doornum = doornum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.418+08:00", comments="Source field: M_TimeOutSet.Times")
    public Integer getTimes() {
        return times;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.418+08:00", comments="Source field: M_TimeOutSet.Times")
    public void setTimes(Integer times) {
        this.times = times;
    }
}