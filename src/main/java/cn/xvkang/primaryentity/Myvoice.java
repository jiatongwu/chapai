package cn.xvkang.primaryentity;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class Myvoice implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.442+08:00", comments="Source field: MyVoice.Number")
    private Integer number;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.442+08:00", comments="Source field: MyVoice.CardNO")
    private String cardno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.442+08:00", comments="Source field: MyVoice.StartTime")
    private Date starttime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.442+08:00", comments="Source field: MyVoice.EndTime")
    private Date endtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.442+08:00", comments="Source field: MyVoice.InVoice")
    private String invoice;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.442+08:00", comments="Source field: MyVoice.OutVoice")
    private String outvoice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table MyVoice
     *
     * @mbg.generated Fri Jul 19 09:31:22 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.442+08:00", comments="Source field: MyVoice.Number")
    public Integer getNumber() {
        return number;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.442+08:00", comments="Source field: MyVoice.Number")
    public void setNumber(Integer number) {
        this.number = number;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.442+08:00", comments="Source field: MyVoice.CardNO")
    public String getCardno() {
        return cardno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.442+08:00", comments="Source field: MyVoice.CardNO")
    public void setCardno(String cardno) {
        this.cardno = cardno == null ? null : cardno.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.442+08:00", comments="Source field: MyVoice.StartTime")
    public Date getStarttime() {
        return starttime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.442+08:00", comments="Source field: MyVoice.StartTime")
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.442+08:00", comments="Source field: MyVoice.EndTime")
    public Date getEndtime() {
        return endtime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.442+08:00", comments="Source field: MyVoice.EndTime")
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.442+08:00", comments="Source field: MyVoice.InVoice")
    public String getInvoice() {
        return invoice;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.442+08:00", comments="Source field: MyVoice.InVoice")
    public void setInvoice(String invoice) {
        this.invoice = invoice == null ? null : invoice.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.442+08:00", comments="Source field: MyVoice.OutVoice")
    public String getOutvoice() {
        return outvoice;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.442+08:00", comments="Source field: MyVoice.OutVoice")
    public void setOutvoice(String outvoice) {
        this.outvoice = outvoice == null ? null : outvoice.trim();
    }
}