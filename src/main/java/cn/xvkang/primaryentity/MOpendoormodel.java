package cn.xvkang.primaryentity;

import java.io.Serializable;
import javax.annotation.Generated;

public class MOpendoormodel implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.092+08:00", comments="Source field: M_OpenDoorModel.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.092+08:00", comments="Source field: M_OpenDoorModel.devcnum")
    private Integer devcnum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.092+08:00", comments="Source field: M_OpenDoorModel.OpenMode")
    private Integer openmode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table M_OpenDoorModel
     *
     * @mbg.generated Wed Jul 31 15:28:01 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.092+08:00", comments="Source field: M_OpenDoorModel.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.092+08:00", comments="Source field: M_OpenDoorModel.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.092+08:00", comments="Source field: M_OpenDoorModel.devcnum")
    public Integer getDevcnum() {
        return devcnum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.092+08:00", comments="Source field: M_OpenDoorModel.devcnum")
    public void setDevcnum(Integer devcnum) {
        this.devcnum = devcnum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.093+08:00", comments="Source field: M_OpenDoorModel.OpenMode")
    public Integer getOpenmode() {
        return openmode;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.093+08:00", comments="Source field: M_OpenDoorModel.OpenMode")
    public void setOpenmode(Integer openmode) {
        this.openmode = openmode;
    }
}