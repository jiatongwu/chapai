package cn.xvkang.primaryentity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;

public class Mycarcanceltable implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.012+08:00", comments="Source field: MYCarCancelTable.UserNO")
    private String userno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.012+08:00", comments="Source field: MYCarCancelTable.CardNO")
    private String cardno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.012+08:00", comments="Source field: MYCarCancelTable.UserName")
    private String username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.012+08:00", comments="Source field: MYCarCancelTable.Sex")
    private String sex;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.012+08:00", comments="Source field: MYCarCancelTable.HomeAddress")
    private String homeaddress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.012+08:00", comments="Source field: MYCarCancelTable.DeptName")
    private String deptname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.012+08:00", comments="Source field: MYCarCancelTable.TelNumber")
    private String telnumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.012+08:00", comments="Source field: MYCarCancelTable.MobNumber")
    private String mobnumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.012+08:00", comments="Source field: MYCarCancelTable.IssueUserCard")
    private String issueusercard;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.012+08:00", comments="Source field: MYCarCancelTable.CPH")
    private String cph;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.013+08:00", comments="Source field: MYCarCancelTable.CarCardType")
    private String carcardtype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.013+08:00", comments="Source field: MYCarCancelTable.CarIssueDate")
    private String carissuedate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.013+08:00", comments="Source field: MYCarCancelTable.Balance")
    private BigDecimal balance;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.013+08:00", comments="Source field: MYCarCancelTable.CarValidStartDate")
    private Date carvalidstartdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.013+08:00", comments="Source field: MYCarCancelTable.CarValidEndDate")
    private Date carvalidenddate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.013+08:00", comments="Source field: MYCarCancelTable.CancelCardNO")
    private String cancelcardno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.013+08:00", comments="Source field: MYCarCancelTable.CancelTime")
    private Date canceltime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.013+08:00", comments="Source field: MYCarCancelTable.CancelUserName")
    private String cancelusername;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table MYCarCancelTable
     *
     * @mbg.generated Wed Jul 31 15:28:01 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.012+08:00", comments="Source field: MYCarCancelTable.UserNO")
    public String getUserno() {
        return userno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.012+08:00", comments="Source field: MYCarCancelTable.UserNO")
    public void setUserno(String userno) {
        this.userno = userno == null ? null : userno.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.012+08:00", comments="Source field: MYCarCancelTable.CardNO")
    public String getCardno() {
        return cardno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.012+08:00", comments="Source field: MYCarCancelTable.CardNO")
    public void setCardno(String cardno) {
        this.cardno = cardno == null ? null : cardno.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.012+08:00", comments="Source field: MYCarCancelTable.UserName")
    public String getUsername() {
        return username;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.012+08:00", comments="Source field: MYCarCancelTable.UserName")
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.012+08:00", comments="Source field: MYCarCancelTable.Sex")
    public String getSex() {
        return sex;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.012+08:00", comments="Source field: MYCarCancelTable.Sex")
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.012+08:00", comments="Source field: MYCarCancelTable.HomeAddress")
    public String getHomeaddress() {
        return homeaddress;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.012+08:00", comments="Source field: MYCarCancelTable.HomeAddress")
    public void setHomeaddress(String homeaddress) {
        this.homeaddress = homeaddress == null ? null : homeaddress.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.012+08:00", comments="Source field: MYCarCancelTable.DeptName")
    public String getDeptname() {
        return deptname;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.012+08:00", comments="Source field: MYCarCancelTable.DeptName")
    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.012+08:00", comments="Source field: MYCarCancelTable.TelNumber")
    public String getTelnumber() {
        return telnumber;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.012+08:00", comments="Source field: MYCarCancelTable.TelNumber")
    public void setTelnumber(String telnumber) {
        this.telnumber = telnumber == null ? null : telnumber.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.012+08:00", comments="Source field: MYCarCancelTable.MobNumber")
    public String getMobnumber() {
        return mobnumber;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.012+08:00", comments="Source field: MYCarCancelTable.MobNumber")
    public void setMobnumber(String mobnumber) {
        this.mobnumber = mobnumber == null ? null : mobnumber.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.012+08:00", comments="Source field: MYCarCancelTable.IssueUserCard")
    public String getIssueusercard() {
        return issueusercard;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.012+08:00", comments="Source field: MYCarCancelTable.IssueUserCard")
    public void setIssueusercard(String issueusercard) {
        this.issueusercard = issueusercard == null ? null : issueusercard.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.012+08:00", comments="Source field: MYCarCancelTable.CPH")
    public String getCph() {
        return cph;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.013+08:00", comments="Source field: MYCarCancelTable.CPH")
    public void setCph(String cph) {
        this.cph = cph == null ? null : cph.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.013+08:00", comments="Source field: MYCarCancelTable.CarCardType")
    public String getCarcardtype() {
        return carcardtype;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.013+08:00", comments="Source field: MYCarCancelTable.CarCardType")
    public void setCarcardtype(String carcardtype) {
        this.carcardtype = carcardtype == null ? null : carcardtype.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.013+08:00", comments="Source field: MYCarCancelTable.CarIssueDate")
    public String getCarissuedate() {
        return carissuedate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.013+08:00", comments="Source field: MYCarCancelTable.CarIssueDate")
    public void setCarissuedate(String carissuedate) {
        this.carissuedate = carissuedate == null ? null : carissuedate.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.013+08:00", comments="Source field: MYCarCancelTable.Balance")
    public BigDecimal getBalance() {
        return balance;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.013+08:00", comments="Source field: MYCarCancelTable.Balance")
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.013+08:00", comments="Source field: MYCarCancelTable.CarValidStartDate")
    public Date getCarvalidstartdate() {
        return carvalidstartdate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.013+08:00", comments="Source field: MYCarCancelTable.CarValidStartDate")
    public void setCarvalidstartdate(Date carvalidstartdate) {
        this.carvalidstartdate = carvalidstartdate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.013+08:00", comments="Source field: MYCarCancelTable.CarValidEndDate")
    public Date getCarvalidenddate() {
        return carvalidenddate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.013+08:00", comments="Source field: MYCarCancelTable.CarValidEndDate")
    public void setCarvalidenddate(Date carvalidenddate) {
        this.carvalidenddate = carvalidenddate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.013+08:00", comments="Source field: MYCarCancelTable.CancelCardNO")
    public String getCancelcardno() {
        return cancelcardno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.013+08:00", comments="Source field: MYCarCancelTable.CancelCardNO")
    public void setCancelcardno(String cancelcardno) {
        this.cancelcardno = cancelcardno == null ? null : cancelcardno.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.013+08:00", comments="Source field: MYCarCancelTable.CancelTime")
    public Date getCanceltime() {
        return canceltime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.013+08:00", comments="Source field: MYCarCancelTable.CancelTime")
    public void setCanceltime(Date canceltime) {
        this.canceltime = canceltime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.013+08:00", comments="Source field: MYCarCancelTable.CancelUserName")
    public String getCancelusername() {
        return cancelusername;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.013+08:00", comments="Source field: MYCarCancelTable.CancelUserName")
    public void setCancelusername(String cancelusername) {
        this.cancelusername = cancelusername == null ? null : cancelusername.trim();
    }
}