package cn.xvkang.primaryentity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;

public class Myrecordmemory implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.045+08:00", comments="Source field: MYRECORDMEMORY.ID")
    private Long id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.045+08:00", comments="Source field: MYRECORDMEMORY.CardNO")
    private String cardno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.045+08:00", comments="Source field: MYRECORDMEMORY.CPH")
    private String cph;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.045+08:00", comments="Source field: MYRECORDMEMORY.CardType")
    private String cardtype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.045+08:00", comments="Source field: MYRECORDMEMORY.InTime")
    private Date intime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.045+08:00", comments="Source field: MYRECORDMEMORY.OutTime")
    private Date outtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.045+08:00", comments="Source field: MYRECORDMEMORY.InGateName")
    private String ingatename;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.045+08:00", comments="Source field: MYRECORDMEMORY.OutGateName")
    private String outgatename;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.045+08:00", comments="Source field: MYRECORDMEMORY.InOperatorCard")
    private String inoperatorcard;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.045+08:00", comments="Source field: MYRECORDMEMORY.OutOperatorCard")
    private String outoperatorcard;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.045+08:00", comments="Source field: MYRECORDMEMORY.InOperator")
    private String inoperator;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.045+08:00", comments="Source field: MYRECORDMEMORY.OutOperator")
    private String outoperator;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.045+08:00", comments="Source field: MYRECORDMEMORY.InPic")
    private String inpic;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.045+08:00", comments="Source field: MYRECORDMEMORY.InUser")
    private String inuser;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.045+08:00", comments="Source field: MYRECORDMEMORY.OutPic")
    private String outpic;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.045+08:00", comments="Source field: MYRECORDMEMORY.OutUser")
    private String outuser;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.ZJPic")
    private String zjpic;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.SFJE")
    private BigDecimal sfje;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.Balance")
    private BigDecimal balance;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.YSJE")
    private BigDecimal ysje;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.SFTime")
    private Date sftime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.SFOperator")
    private String sfoperator;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.SFOperatorCard")
    private String sfoperatorcard;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.SFGate")
    private String sfgate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.OvertimeSymbol")
    private String overtimesymbol;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.OvertimeSFTime")
    private Date overtimesftime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.OvertimeSFJE")
    private BigDecimal overtimesfje;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.CarparkNO")
    private Integer carparkno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.BigSmall")
    private Integer bigsmall;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.FreeReason")
    private String freereason;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.StayTime")
    private String staytime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.Temp1")
    private String temp1;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.Temp2")
    private String temp2;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.Temp3")
    private String temp3;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.Temp4")
    private String temp4;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.Temp5")
    private String temp5;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.047+08:00", comments="Source field: MYRECORDMEMORY.bMorePaingCar")
    private Boolean bmorepaingcar;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.047+08:00", comments="Source field: MYRECORDMEMORY.bDZ")
    private Boolean bdz;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.047+08:00", comments="Source field: MYRECORDMEMORY.strDZ")
    private String strdz;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table MYRECORDMEMORY
     *
     * @mbg.generated Wed Jul 31 15:28:01 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.045+08:00", comments="Source field: MYRECORDMEMORY.ID")
    public Long getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.045+08:00", comments="Source field: MYRECORDMEMORY.ID")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.045+08:00", comments="Source field: MYRECORDMEMORY.CardNO")
    public String getCardno() {
        return cardno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.045+08:00", comments="Source field: MYRECORDMEMORY.CardNO")
    public void setCardno(String cardno) {
        this.cardno = cardno == null ? null : cardno.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.045+08:00", comments="Source field: MYRECORDMEMORY.CPH")
    public String getCph() {
        return cph;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.045+08:00", comments="Source field: MYRECORDMEMORY.CPH")
    public void setCph(String cph) {
        this.cph = cph == null ? null : cph.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.045+08:00", comments="Source field: MYRECORDMEMORY.CardType")
    public String getCardtype() {
        return cardtype;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.045+08:00", comments="Source field: MYRECORDMEMORY.CardType")
    public void setCardtype(String cardtype) {
        this.cardtype = cardtype == null ? null : cardtype.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.045+08:00", comments="Source field: MYRECORDMEMORY.InTime")
    public Date getIntime() {
        return intime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.045+08:00", comments="Source field: MYRECORDMEMORY.InTime")
    public void setIntime(Date intime) {
        this.intime = intime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.045+08:00", comments="Source field: MYRECORDMEMORY.OutTime")
    public Date getOuttime() {
        return outtime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.045+08:00", comments="Source field: MYRECORDMEMORY.OutTime")
    public void setOuttime(Date outtime) {
        this.outtime = outtime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.045+08:00", comments="Source field: MYRECORDMEMORY.InGateName")
    public String getIngatename() {
        return ingatename;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.045+08:00", comments="Source field: MYRECORDMEMORY.InGateName")
    public void setIngatename(String ingatename) {
        this.ingatename = ingatename == null ? null : ingatename.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.045+08:00", comments="Source field: MYRECORDMEMORY.OutGateName")
    public String getOutgatename() {
        return outgatename;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.045+08:00", comments="Source field: MYRECORDMEMORY.OutGateName")
    public void setOutgatename(String outgatename) {
        this.outgatename = outgatename == null ? null : outgatename.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.045+08:00", comments="Source field: MYRECORDMEMORY.InOperatorCard")
    public String getInoperatorcard() {
        return inoperatorcard;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.045+08:00", comments="Source field: MYRECORDMEMORY.InOperatorCard")
    public void setInoperatorcard(String inoperatorcard) {
        this.inoperatorcard = inoperatorcard == null ? null : inoperatorcard.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.045+08:00", comments="Source field: MYRECORDMEMORY.OutOperatorCard")
    public String getOutoperatorcard() {
        return outoperatorcard;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.045+08:00", comments="Source field: MYRECORDMEMORY.OutOperatorCard")
    public void setOutoperatorcard(String outoperatorcard) {
        this.outoperatorcard = outoperatorcard == null ? null : outoperatorcard.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.045+08:00", comments="Source field: MYRECORDMEMORY.InOperator")
    public String getInoperator() {
        return inoperator;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.045+08:00", comments="Source field: MYRECORDMEMORY.InOperator")
    public void setInoperator(String inoperator) {
        this.inoperator = inoperator == null ? null : inoperator.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.045+08:00", comments="Source field: MYRECORDMEMORY.OutOperator")
    public String getOutoperator() {
        return outoperator;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.045+08:00", comments="Source field: MYRECORDMEMORY.OutOperator")
    public void setOutoperator(String outoperator) {
        this.outoperator = outoperator == null ? null : outoperator.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.045+08:00", comments="Source field: MYRECORDMEMORY.InPic")
    public String getInpic() {
        return inpic;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.045+08:00", comments="Source field: MYRECORDMEMORY.InPic")
    public void setInpic(String inpic) {
        this.inpic = inpic == null ? null : inpic.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.045+08:00", comments="Source field: MYRECORDMEMORY.InUser")
    public String getInuser() {
        return inuser;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.045+08:00", comments="Source field: MYRECORDMEMORY.InUser")
    public void setInuser(String inuser) {
        this.inuser = inuser == null ? null : inuser.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.045+08:00", comments="Source field: MYRECORDMEMORY.OutPic")
    public String getOutpic() {
        return outpic;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.045+08:00", comments="Source field: MYRECORDMEMORY.OutPic")
    public void setOutpic(String outpic) {
        this.outpic = outpic == null ? null : outpic.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.045+08:00", comments="Source field: MYRECORDMEMORY.OutUser")
    public String getOutuser() {
        return outuser;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.OutUser")
    public void setOutuser(String outuser) {
        this.outuser = outuser == null ? null : outuser.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.ZJPic")
    public String getZjpic() {
        return zjpic;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.ZJPic")
    public void setZjpic(String zjpic) {
        this.zjpic = zjpic == null ? null : zjpic.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.SFJE")
    public BigDecimal getSfje() {
        return sfje;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.SFJE")
    public void setSfje(BigDecimal sfje) {
        this.sfje = sfje;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.Balance")
    public BigDecimal getBalance() {
        return balance;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.Balance")
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.YSJE")
    public BigDecimal getYsje() {
        return ysje;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.YSJE")
    public void setYsje(BigDecimal ysje) {
        this.ysje = ysje;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.SFTime")
    public Date getSftime() {
        return sftime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.SFTime")
    public void setSftime(Date sftime) {
        this.sftime = sftime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.SFOperator")
    public String getSfoperator() {
        return sfoperator;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.SFOperator")
    public void setSfoperator(String sfoperator) {
        this.sfoperator = sfoperator == null ? null : sfoperator.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.SFOperatorCard")
    public String getSfoperatorcard() {
        return sfoperatorcard;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.SFOperatorCard")
    public void setSfoperatorcard(String sfoperatorcard) {
        this.sfoperatorcard = sfoperatorcard == null ? null : sfoperatorcard.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.SFGate")
    public String getSfgate() {
        return sfgate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.SFGate")
    public void setSfgate(String sfgate) {
        this.sfgate = sfgate == null ? null : sfgate.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.OvertimeSymbol")
    public String getOvertimesymbol() {
        return overtimesymbol;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.OvertimeSymbol")
    public void setOvertimesymbol(String overtimesymbol) {
        this.overtimesymbol = overtimesymbol == null ? null : overtimesymbol.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.OvertimeSFTime")
    public Date getOvertimesftime() {
        return overtimesftime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.OvertimeSFTime")
    public void setOvertimesftime(Date overtimesftime) {
        this.overtimesftime = overtimesftime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.OvertimeSFJE")
    public BigDecimal getOvertimesfje() {
        return overtimesfje;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.OvertimeSFJE")
    public void setOvertimesfje(BigDecimal overtimesfje) {
        this.overtimesfje = overtimesfje;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.CarparkNO")
    public Integer getCarparkno() {
        return carparkno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.CarparkNO")
    public void setCarparkno(Integer carparkno) {
        this.carparkno = carparkno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.BigSmall")
    public Integer getBigsmall() {
        return bigsmall;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.BigSmall")
    public void setBigsmall(Integer bigsmall) {
        this.bigsmall = bigsmall;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.FreeReason")
    public String getFreereason() {
        return freereason;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.FreeReason")
    public void setFreereason(String freereason) {
        this.freereason = freereason == null ? null : freereason.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.StayTime")
    public String getStaytime() {
        return staytime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.StayTime")
    public void setStaytime(String staytime) {
        this.staytime = staytime == null ? null : staytime.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.Temp1")
    public String getTemp1() {
        return temp1;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.Temp1")
    public void setTemp1(String temp1) {
        this.temp1 = temp1 == null ? null : temp1.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.Temp2")
    public String getTemp2() {
        return temp2;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.Temp2")
    public void setTemp2(String temp2) {
        this.temp2 = temp2 == null ? null : temp2.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.Temp3")
    public String getTemp3() {
        return temp3;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.Temp3")
    public void setTemp3(String temp3) {
        this.temp3 = temp3 == null ? null : temp3.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.Temp4")
    public String getTemp4() {
        return temp4;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.Temp4")
    public void setTemp4(String temp4) {
        this.temp4 = temp4 == null ? null : temp4.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.046+08:00", comments="Source field: MYRECORDMEMORY.Temp5")
    public String getTemp5() {
        return temp5;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.047+08:00", comments="Source field: MYRECORDMEMORY.Temp5")
    public void setTemp5(String temp5) {
        this.temp5 = temp5 == null ? null : temp5.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.047+08:00", comments="Source field: MYRECORDMEMORY.bMorePaingCar")
    public Boolean getBmorepaingcar() {
        return bmorepaingcar;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.047+08:00", comments="Source field: MYRECORDMEMORY.bMorePaingCar")
    public void setBmorepaingcar(Boolean bmorepaingcar) {
        this.bmorepaingcar = bmorepaingcar;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.047+08:00", comments="Source field: MYRECORDMEMORY.bDZ")
    public Boolean getBdz() {
        return bdz;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.047+08:00", comments="Source field: MYRECORDMEMORY.bDZ")
    public void setBdz(Boolean bdz) {
        this.bdz = bdz;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.047+08:00", comments="Source field: MYRECORDMEMORY.strDZ")
    public String getStrdz() {
        return strdz;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.047+08:00", comments="Source field: MYRECORDMEMORY.strDZ")
    public void setStrdz(String strdz) {
        this.strdz = strdz == null ? null : strdz.trim();
    }
}