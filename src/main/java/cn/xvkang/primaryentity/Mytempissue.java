package cn.xvkang.primaryentity;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class Mytempissue implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.060+08:00", comments="Source field: MYTEMPISSUE.CardNO")
    private String cardno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.060+08:00", comments="Source field: MYTEMPISSUE.TempID")
    private String tempid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.060+08:00", comments="Source field: MYTEMPISSUE.CardState")
    private String cardstate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.060+08:00", comments="Source field: MYTEMPISSUE.IssueDate")
    private Date issuedate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.060+08:00", comments="Source field: MYTEMPISSUE.IssueUserCard")
    private String issueusercard;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table MYTEMPISSUE
     *
     * @mbg.generated Wed Jul 31 15:28:01 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.060+08:00", comments="Source field: MYTEMPISSUE.CardNO")
    public String getCardno() {
        return cardno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.060+08:00", comments="Source field: MYTEMPISSUE.CardNO")
    public void setCardno(String cardno) {
        this.cardno = cardno == null ? null : cardno.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.060+08:00", comments="Source field: MYTEMPISSUE.TempID")
    public String getTempid() {
        return tempid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.060+08:00", comments="Source field: MYTEMPISSUE.TempID")
    public void setTempid(String tempid) {
        this.tempid = tempid == null ? null : tempid.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.060+08:00", comments="Source field: MYTEMPISSUE.CardState")
    public String getCardstate() {
        return cardstate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.060+08:00", comments="Source field: MYTEMPISSUE.CardState")
    public void setCardstate(String cardstate) {
        this.cardstate = cardstate == null ? null : cardstate.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.060+08:00", comments="Source field: MYTEMPISSUE.IssueDate")
    public Date getIssuedate() {
        return issuedate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.060+08:00", comments="Source field: MYTEMPISSUE.IssueDate")
    public void setIssuedate(Date issuedate) {
        this.issuedate = issuedate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.060+08:00", comments="Source field: MYTEMPISSUE.IssueUserCard")
    public String getIssueusercard() {
        return issueusercard;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.060+08:00", comments="Source field: MYTEMPISSUE.IssueUserCard")
    public void setIssueusercard(String issueusercard) {
        this.issueusercard = issueusercard == null ? null : issueusercard.trim();
    }
}