package cn.xvkang.primaryentity;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class Myautotempdownload implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.461+08:00", comments="Source field: MYAutoTempDownLoad.ID")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.461+08:00", comments="Source field: MYAutoTempDownLoad.CPH")
    private String cph;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.461+08:00", comments="Source field: MYAutoTempDownLoad.InTime")
    private Date intime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.461+08:00", comments="Source field: MYAutoTempDownLoad.DownloadSignal")
    private String downloadsignal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.461+08:00", comments="Source field: MYAutoTempDownLoad.InOut")
    private Integer inout;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.461+08:00", comments="Source field: MYAutoTempDownLoad.iBigSmall")
    private Integer ibigsmall;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table MYAutoTempDownLoad
     *
     * @mbg.generated Fri Jul 05 20:12:44 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.461+08:00", comments="Source field: MYAutoTempDownLoad.ID")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.461+08:00", comments="Source field: MYAutoTempDownLoad.ID")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.461+08:00", comments="Source field: MYAutoTempDownLoad.CPH")
    public String getCph() {
        return cph;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.461+08:00", comments="Source field: MYAutoTempDownLoad.CPH")
    public void setCph(String cph) {
        this.cph = cph == null ? null : cph.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.461+08:00", comments="Source field: MYAutoTempDownLoad.InTime")
    public Date getIntime() {
        return intime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.461+08:00", comments="Source field: MYAutoTempDownLoad.InTime")
    public void setIntime(Date intime) {
        this.intime = intime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.461+08:00", comments="Source field: MYAutoTempDownLoad.DownloadSignal")
    public String getDownloadsignal() {
        return downloadsignal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.461+08:00", comments="Source field: MYAutoTempDownLoad.DownloadSignal")
    public void setDownloadsignal(String downloadsignal) {
        this.downloadsignal = downloadsignal == null ? null : downloadsignal.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.461+08:00", comments="Source field: MYAutoTempDownLoad.InOut")
    public Integer getInout() {
        return inout;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.461+08:00", comments="Source field: MYAutoTempDownLoad.InOut")
    public void setInout(Integer inout) {
        this.inout = inout;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.462+08:00", comments="Source field: MYAutoTempDownLoad.iBigSmall")
    public Integer getIbigsmall() {
        return ibigsmall;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.462+08:00", comments="Source field: MYAutoTempDownLoad.iBigSmall")
    public void setIbigsmall(Integer ibigsmall) {
        this.ibigsmall = ibigsmall;
    }
}