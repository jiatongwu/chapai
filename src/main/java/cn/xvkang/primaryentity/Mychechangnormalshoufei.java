package cn.xvkang.primaryentity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.annotation.Generated;

public class Mychechangnormalshoufei implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.724+08:00", comments="Source field: MYCHECHANGNORMALSHOUFEI.CardType")
    private String cardtype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.725+08:00", comments="Source field: MYCHECHANGNORMALSHOUFEI.FreeMinute")
    private Integer freeminute;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.725+08:00", comments="Source field: MYCHECHANGNORMALSHOUFEI.TopSF")
    private Integer topsf;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.725+08:00", comments="Source field: MYCHECHANGNORMALSHOUFEI.Hours")
    private Integer hours;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.725+08:00", comments="Source field: MYCHECHANGNORMALSHOUFEI.JE")
    private BigDecimal je;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table MYCHECHANGNORMALSHOUFEI
     *
     * @mbg.generated Sun Jul 14 17:27:27 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.725+08:00", comments="Source field: MYCHECHANGNORMALSHOUFEI.CardType")
    public String getCardtype() {
        return cardtype;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.725+08:00", comments="Source field: MYCHECHANGNORMALSHOUFEI.CardType")
    public void setCardtype(String cardtype) {
        this.cardtype = cardtype == null ? null : cardtype.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.725+08:00", comments="Source field: MYCHECHANGNORMALSHOUFEI.FreeMinute")
    public Integer getFreeminute() {
        return freeminute;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.725+08:00", comments="Source field: MYCHECHANGNORMALSHOUFEI.FreeMinute")
    public void setFreeminute(Integer freeminute) {
        this.freeminute = freeminute;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.725+08:00", comments="Source field: MYCHECHANGNORMALSHOUFEI.TopSF")
    public Integer getTopsf() {
        return topsf;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.725+08:00", comments="Source field: MYCHECHANGNORMALSHOUFEI.TopSF")
    public void setTopsf(Integer topsf) {
        this.topsf = topsf;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.725+08:00", comments="Source field: MYCHECHANGNORMALSHOUFEI.Hours")
    public Integer getHours() {
        return hours;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.725+08:00", comments="Source field: MYCHECHANGNORMALSHOUFEI.Hours")
    public void setHours(Integer hours) {
        this.hours = hours;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.725+08:00", comments="Source field: MYCHECHANGNORMALSHOUFEI.JE")
    public BigDecimal getJe() {
        return je;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.725+08:00", comments="Source field: MYCHECHANGNORMALSHOUFEI.JE")
    public void setJe(BigDecimal je) {
        this.je = je;
    }
}