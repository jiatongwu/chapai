package cn.xvkang.primaryentity;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class Myiclost implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.574+08:00", comments="Source field: MYICLOST.CardNO")
    private String cardno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.574+08:00", comments="Source field: MYICLOST.LossregDate")
    private Date lossregdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.574+08:00", comments="Source field: MYICLOST.OperatorCardNO")
    private String operatorcardno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.574+08:00", comments="Source field: MYICLOST.CardState")
    private String cardstate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.574+08:00", comments="Source field: MYICLOST.CarLostOKID")
    private String carlostokid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.574+08:00", comments="Source field: MYICLOST.CarLostOKNO")
    private Boolean carlostokno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.574+08:00", comments="Source field: MYICLOST.CarUnLostOKNO")
    private Boolean carunlostokno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.574+08:00", comments="Source field: MYICLOST.MJLostOKID")
    private String mjlostokid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.574+08:00", comments="Source field: MYICLOST.MJLostOKNO")
    private Boolean mjlostokno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.575+08:00", comments="Source field: MYICLOST.MJUnLostOKNO")
    private Boolean mjunlostokno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.575+08:00", comments="Source field: MYICLOST.CarOptCard")
    private Boolean caroptcard;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table MYICLOST
     *
     * @mbg.generated Fri Jul 05 20:12:44 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.574+08:00", comments="Source field: MYICLOST.CardNO")
    public String getCardno() {
        return cardno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.574+08:00", comments="Source field: MYICLOST.CardNO")
    public void setCardno(String cardno) {
        this.cardno = cardno == null ? null : cardno.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.574+08:00", comments="Source field: MYICLOST.LossregDate")
    public Date getLossregdate() {
        return lossregdate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.574+08:00", comments="Source field: MYICLOST.LossregDate")
    public void setLossregdate(Date lossregdate) {
        this.lossregdate = lossregdate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.574+08:00", comments="Source field: MYICLOST.OperatorCardNO")
    public String getOperatorcardno() {
        return operatorcardno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.574+08:00", comments="Source field: MYICLOST.OperatorCardNO")
    public void setOperatorcardno(String operatorcardno) {
        this.operatorcardno = operatorcardno == null ? null : operatorcardno.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.574+08:00", comments="Source field: MYICLOST.CardState")
    public String getCardstate() {
        return cardstate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.574+08:00", comments="Source field: MYICLOST.CardState")
    public void setCardstate(String cardstate) {
        this.cardstate = cardstate == null ? null : cardstate.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.574+08:00", comments="Source field: MYICLOST.CarLostOKID")
    public String getCarlostokid() {
        return carlostokid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.574+08:00", comments="Source field: MYICLOST.CarLostOKID")
    public void setCarlostokid(String carlostokid) {
        this.carlostokid = carlostokid == null ? null : carlostokid.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.574+08:00", comments="Source field: MYICLOST.CarLostOKNO")
    public Boolean getCarlostokno() {
        return carlostokno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.574+08:00", comments="Source field: MYICLOST.CarLostOKNO")
    public void setCarlostokno(Boolean carlostokno) {
        this.carlostokno = carlostokno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.574+08:00", comments="Source field: MYICLOST.CarUnLostOKNO")
    public Boolean getCarunlostokno() {
        return carunlostokno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.574+08:00", comments="Source field: MYICLOST.CarUnLostOKNO")
    public void setCarunlostokno(Boolean carunlostokno) {
        this.carunlostokno = carunlostokno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.574+08:00", comments="Source field: MYICLOST.MJLostOKID")
    public String getMjlostokid() {
        return mjlostokid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.574+08:00", comments="Source field: MYICLOST.MJLostOKID")
    public void setMjlostokid(String mjlostokid) {
        this.mjlostokid = mjlostokid == null ? null : mjlostokid.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.575+08:00", comments="Source field: MYICLOST.MJLostOKNO")
    public Boolean getMjlostokno() {
        return mjlostokno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.575+08:00", comments="Source field: MYICLOST.MJLostOKNO")
    public void setMjlostokno(Boolean mjlostokno) {
        this.mjlostokno = mjlostokno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.575+08:00", comments="Source field: MYICLOST.MJUnLostOKNO")
    public Boolean getMjunlostokno() {
        return mjunlostokno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.575+08:00", comments="Source field: MYICLOST.MJUnLostOKNO")
    public void setMjunlostokno(Boolean mjunlostokno) {
        this.mjunlostokno = mjunlostokno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.575+08:00", comments="Source field: MYICLOST.CarOptCard")
    public Boolean getCaroptcard() {
        return caroptcard;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.575+08:00", comments="Source field: MYICLOST.CarOptCard")
    public void setCaroptcard(Boolean caroptcard) {
        this.caroptcard = caroptcard;
    }
}