package cn.xvkang.primaryentity;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class Myautotempchange implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.458+08:00", comments="Source field: MYAutoTempChange.ID")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.459+08:00", comments="Source field: MYAutoTempChange.CPH")
    private String cph;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.459+08:00", comments="Source field: MYAutoTempChange.CarCardType")
    private String carcardtype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.459+08:00", comments="Source field: MYAutoTempChange.InTime")
    private Date intime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.459+08:00", comments="Source field: MYAutoTempChange.CarValidStartDate")
    private Date carvalidstartdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.459+08:00", comments="Source field: MYAutoTempChange.CarValidEndDate")
    private Date carvalidenddate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.459+08:00", comments="Source field: MYAutoTempChange.DownloadSignal")
    private String downloadsignal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.459+08:00", comments="Source field: MYAutoTempChange.InOut")
    private Integer inout;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table MYAutoTempChange
     *
     * @mbg.generated Fri Jul 05 20:12:44 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.459+08:00", comments="Source field: MYAutoTempChange.ID")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.459+08:00", comments="Source field: MYAutoTempChange.ID")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.459+08:00", comments="Source field: MYAutoTempChange.CPH")
    public String getCph() {
        return cph;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.459+08:00", comments="Source field: MYAutoTempChange.CPH")
    public void setCph(String cph) {
        this.cph = cph == null ? null : cph.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.459+08:00", comments="Source field: MYAutoTempChange.CarCardType")
    public String getCarcardtype() {
        return carcardtype;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.459+08:00", comments="Source field: MYAutoTempChange.CarCardType")
    public void setCarcardtype(String carcardtype) {
        this.carcardtype = carcardtype == null ? null : carcardtype.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.459+08:00", comments="Source field: MYAutoTempChange.InTime")
    public Date getIntime() {
        return intime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.459+08:00", comments="Source field: MYAutoTempChange.InTime")
    public void setIntime(Date intime) {
        this.intime = intime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.459+08:00", comments="Source field: MYAutoTempChange.CarValidStartDate")
    public Date getCarvalidstartdate() {
        return carvalidstartdate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.459+08:00", comments="Source field: MYAutoTempChange.CarValidStartDate")
    public void setCarvalidstartdate(Date carvalidstartdate) {
        this.carvalidstartdate = carvalidstartdate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.459+08:00", comments="Source field: MYAutoTempChange.CarValidEndDate")
    public Date getCarvalidenddate() {
        return carvalidenddate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.459+08:00", comments="Source field: MYAutoTempChange.CarValidEndDate")
    public void setCarvalidenddate(Date carvalidenddate) {
        this.carvalidenddate = carvalidenddate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.459+08:00", comments="Source field: MYAutoTempChange.DownloadSignal")
    public String getDownloadsignal() {
        return downloadsignal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.459+08:00", comments="Source field: MYAutoTempChange.DownloadSignal")
    public void setDownloadsignal(String downloadsignal) {
        this.downloadsignal = downloadsignal == null ? null : downloadsignal.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.459+08:00", comments="Source field: MYAutoTempChange.InOut")
    public Integer getInout() {
        return inout;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.459+08:00", comments="Source field: MYAutoTempChange.InOut")
    public void setInout(Integer inout) {
        this.inout = inout;
    }
}