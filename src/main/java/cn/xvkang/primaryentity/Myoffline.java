package cn.xvkang.primaryentity;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class Myoffline implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.296+08:00", comments="Source field: MYOffLine.CardNO")
    private String cardno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.296+08:00", comments="Source field: MYOffLine.CPHCardNO")
    private String cphcardno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.296+08:00", comments="Source field: MYOffLine.DownLoadTime")
    private Date downloadtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.296+08:00", comments="Source field: MYOffLine.State")
    private Integer state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table MYOffLine
     *
     * @mbg.generated Fri Jul 19 09:31:22 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.296+08:00", comments="Source field: MYOffLine.CardNO")
    public String getCardno() {
        return cardno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.296+08:00", comments="Source field: MYOffLine.CardNO")
    public void setCardno(String cardno) {
        this.cardno = cardno == null ? null : cardno.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.296+08:00", comments="Source field: MYOffLine.CPHCardNO")
    public String getCphcardno() {
        return cphcardno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.296+08:00", comments="Source field: MYOffLine.CPHCardNO")
    public void setCphcardno(String cphcardno) {
        this.cphcardno = cphcardno == null ? null : cphcardno.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.296+08:00", comments="Source field: MYOffLine.DownLoadTime")
    public Date getDownloadtime() {
        return downloadtime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.296+08:00", comments="Source field: MYOffLine.DownLoadTime")
    public void setDownloadtime(Date downloadtime) {
        this.downloadtime = downloadtime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.296+08:00", comments="Source field: MYOffLine.State")
    public Integer getState() {
        return state;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.296+08:00", comments="Source field: MYOffLine.State")
    public void setState(Integer state) {
        this.state = state;
    }
}