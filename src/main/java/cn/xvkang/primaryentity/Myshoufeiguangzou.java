package cn.xvkang.primaryentity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.annotation.Generated;

public class Myshoufeiguangzou implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.053+08:00", comments="Source field: MYSHOUFEIGUANGZOU.CardType")
    private String cardtype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.053+08:00", comments="Source field: MYSHOUFEIGUANGZOU.FreeMark")
    private Integer freemark;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.053+08:00", comments="Source field: MYSHOUFEIGUANGZOU.FreeTime")
    private Integer freetime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.054+08:00", comments="Source field: MYSHOUFEIGUANGZOU.SFCycle")
    private Integer sfcycle;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.054+08:00", comments="Source field: MYSHOUFEIGUANGZOU.TimePeriod")
    private Integer timeperiod;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.054+08:00", comments="Source field: MYSHOUFEIGUANGZOU.WithinPeriodSF")
    private BigDecimal withinperiodsf;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.054+08:00", comments="Source field: MYSHOUFEIGUANGZOU.WithoutPeriodSF")
    private BigDecimal withoutperiodsf;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table MYSHOUFEIGUANGZOU
     *
     * @mbg.generated Wed Jul 31 15:28:01 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.053+08:00", comments="Source field: MYSHOUFEIGUANGZOU.CardType")
    public String getCardtype() {
        return cardtype;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.053+08:00", comments="Source field: MYSHOUFEIGUANGZOU.CardType")
    public void setCardtype(String cardtype) {
        this.cardtype = cardtype == null ? null : cardtype.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.053+08:00", comments="Source field: MYSHOUFEIGUANGZOU.FreeMark")
    public Integer getFreemark() {
        return freemark;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.053+08:00", comments="Source field: MYSHOUFEIGUANGZOU.FreeMark")
    public void setFreemark(Integer freemark) {
        this.freemark = freemark;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.053+08:00", comments="Source field: MYSHOUFEIGUANGZOU.FreeTime")
    public Integer getFreetime() {
        return freetime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.054+08:00", comments="Source field: MYSHOUFEIGUANGZOU.FreeTime")
    public void setFreetime(Integer freetime) {
        this.freetime = freetime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.054+08:00", comments="Source field: MYSHOUFEIGUANGZOU.SFCycle")
    public Integer getSfcycle() {
        return sfcycle;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.054+08:00", comments="Source field: MYSHOUFEIGUANGZOU.SFCycle")
    public void setSfcycle(Integer sfcycle) {
        this.sfcycle = sfcycle;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.054+08:00", comments="Source field: MYSHOUFEIGUANGZOU.TimePeriod")
    public Integer getTimeperiod() {
        return timeperiod;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.054+08:00", comments="Source field: MYSHOUFEIGUANGZOU.TimePeriod")
    public void setTimeperiod(Integer timeperiod) {
        this.timeperiod = timeperiod;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.054+08:00", comments="Source field: MYSHOUFEIGUANGZOU.WithinPeriodSF")
    public BigDecimal getWithinperiodsf() {
        return withinperiodsf;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.054+08:00", comments="Source field: MYSHOUFEIGUANGZOU.WithinPeriodSF")
    public void setWithinperiodsf(BigDecimal withinperiodsf) {
        this.withinperiodsf = withinperiodsf;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.054+08:00", comments="Source field: MYSHOUFEIGUANGZOU.WithoutPeriodSF")
    public BigDecimal getWithoutperiodsf() {
        return withoutperiodsf;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.054+08:00", comments="Source field: MYSHOUFEIGUANGZOU.WithoutPeriodSF")
    public void setWithoutperiodsf(BigDecimal withoutperiodsf) {
        this.withoutperiodsf = withoutperiodsf;
    }
}