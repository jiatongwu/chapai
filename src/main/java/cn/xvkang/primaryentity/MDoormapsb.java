package cn.xvkang.primaryentity;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class MDoormapsb implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.083+08:00", comments="Source field: M_DoorMapsB.Mapid")
    private Integer mapid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.083+08:00", comments="Source field: M_DoorMapsB.MapName")
    private String mapname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.083+08:00", comments="Source field: M_DoorMapsB.AltDate")
    private Date altdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.083+08:00", comments="Source field: M_DoorMapsB.MapLiu")
    private byte[] mapliu;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table M_DoorMapsB
     *
     * @mbg.generated Wed Jul 31 15:28:01 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.083+08:00", comments="Source field: M_DoorMapsB.Mapid")
    public Integer getMapid() {
        return mapid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.083+08:00", comments="Source field: M_DoorMapsB.Mapid")
    public void setMapid(Integer mapid) {
        this.mapid = mapid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.083+08:00", comments="Source field: M_DoorMapsB.MapName")
    public String getMapname() {
        return mapname;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.083+08:00", comments="Source field: M_DoorMapsB.MapName")
    public void setMapname(String mapname) {
        this.mapname = mapname == null ? null : mapname.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.083+08:00", comments="Source field: M_DoorMapsB.AltDate")
    public Date getAltdate() {
        return altdate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.083+08:00", comments="Source field: M_DoorMapsB.AltDate")
    public void setAltdate(Date altdate) {
        this.altdate = altdate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.083+08:00", comments="Source field: M_DoorMapsB.MapLiu")
    public byte[] getMapliu() {
        return mapliu;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.083+08:00", comments="Source field: M_DoorMapsB.MapLiu")
    public void setMapliu(byte[] mapliu) {
        this.mapliu = mapliu;
    }
}