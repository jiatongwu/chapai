package cn.xvkang.primaryentity;

import java.io.Serializable;
import javax.annotation.Generated;

public class ZhSentrybox implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.224+08:00", comments="Source field: zh_SentryBox.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.224+08:00", comments="Source field: zh_SentryBox.sentrybox_No")
    private String sentryboxNo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.224+08:00", comments="Source field: zh_SentryBox.vehichlejson")
    private String vehichlejson;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.224+08:00", comments="Source field: zh_SentryBox.eidtTime")
    private String eidttime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.224+08:00", comments="Source field: zh_SentryBox.synflag")
    private Integer synflag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table zh_SentryBox
     *
     * @mbg.generated Wed Jul 31 15:28:01 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.224+08:00", comments="Source field: zh_SentryBox.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.224+08:00", comments="Source field: zh_SentryBox.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.224+08:00", comments="Source field: zh_SentryBox.sentrybox_No")
    public String getSentryboxNo() {
        return sentryboxNo;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.224+08:00", comments="Source field: zh_SentryBox.sentrybox_No")
    public void setSentryboxNo(String sentryboxNo) {
        this.sentryboxNo = sentryboxNo == null ? null : sentryboxNo.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.224+08:00", comments="Source field: zh_SentryBox.vehichlejson")
    public String getVehichlejson() {
        return vehichlejson;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.224+08:00", comments="Source field: zh_SentryBox.vehichlejson")
    public void setVehichlejson(String vehichlejson) {
        this.vehichlejson = vehichlejson == null ? null : vehichlejson.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.224+08:00", comments="Source field: zh_SentryBox.eidtTime")
    public String getEidttime() {
        return eidttime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.224+08:00", comments="Source field: zh_SentryBox.eidtTime")
    public void setEidttime(String eidttime) {
        this.eidttime = eidttime == null ? null : eidttime.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.224+08:00", comments="Source field: zh_SentryBox.synflag")
    public Integer getSynflag() {
        return synflag;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.224+08:00", comments="Source field: zh_SentryBox.synflag")
    public void setSynflag(Integer synflag) {
        this.synflag = synflag;
    }
}