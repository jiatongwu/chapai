package cn.xvkang.primaryentity;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class Tbldbversion implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.204+08:00", comments="Source field: tblDBVersion.DBVer")
    private Integer dbver;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.204+08:00", comments="Source field: tblDBVersion.upd_Time")
    private Date updTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tblDBVersion
     *
     * @mbg.generated Wed Jul 31 15:28:01 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.204+08:00", comments="Source field: tblDBVersion.DBVer")
    public Integer getDbver() {
        return dbver;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.204+08:00", comments="Source field: tblDBVersion.DBVer")
    public void setDbver(Integer dbver) {
        this.dbver = dbver;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.204+08:00", comments="Source field: tblDBVersion.upd_Time")
    public Date getUpdTime() {
        return updTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.204+08:00", comments="Source field: tblDBVersion.upd_Time")
    public void setUpdTime(Date updTime) {
        this.updTime = updTime;
    }
}