package cn.xvkang.primaryentity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.annotation.Generated;

public class Myzbparkset implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.072+08:00", comments="Source field: MYZBPARKSet.ID")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.072+08:00", comments="Source field: MYZBPARKSet.Address")
    private String address;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.072+08:00", comments="Source field: MYZBPARKSet.Favorable")
    private BigDecimal favorable;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.072+08:00", comments="Source field: MYZBPARKSet.Manner")
    private String manner;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.072+08:00", comments="Source field: MYZBPARKSet.OutHour")
    private BigDecimal outhour;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.072+08:00", comments="Source field: MYZBPARKSet.OutDayNo")
    private BigDecimal outdayno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.072+08:00", comments="Source field: MYZBPARKSet.PCName")
    private String pcname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table MYZBPARKSet
     *
     * @mbg.generated Wed Jul 31 15:28:01 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.072+08:00", comments="Source field: MYZBPARKSet.ID")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.072+08:00", comments="Source field: MYZBPARKSet.ID")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.072+08:00", comments="Source field: MYZBPARKSet.Address")
    public String getAddress() {
        return address;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.072+08:00", comments="Source field: MYZBPARKSet.Address")
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.072+08:00", comments="Source field: MYZBPARKSet.Favorable")
    public BigDecimal getFavorable() {
        return favorable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.072+08:00", comments="Source field: MYZBPARKSet.Favorable")
    public void setFavorable(BigDecimal favorable) {
        this.favorable = favorable;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.072+08:00", comments="Source field: MYZBPARKSet.Manner")
    public String getManner() {
        return manner;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.072+08:00", comments="Source field: MYZBPARKSet.Manner")
    public void setManner(String manner) {
        this.manner = manner == null ? null : manner.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.072+08:00", comments="Source field: MYZBPARKSet.OutHour")
    public BigDecimal getOuthour() {
        return outhour;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.072+08:00", comments="Source field: MYZBPARKSet.OutHour")
    public void setOuthour(BigDecimal outhour) {
        this.outhour = outhour;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.072+08:00", comments="Source field: MYZBPARKSet.OutDayNo")
    public BigDecimal getOutdayno() {
        return outdayno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.072+08:00", comments="Source field: MYZBPARKSet.OutDayNo")
    public void setOutdayno(BigDecimal outdayno) {
        this.outdayno = outdayno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.072+08:00", comments="Source field: MYZBPARKSet.PCName")
    public String getPcname() {
        return pcname;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.072+08:00", comments="Source field: MYZBPARKSet.PCName")
    public void setPcname(String pcname) {
        this.pcname = pcname == null ? null : pcname.trim();
    }
}