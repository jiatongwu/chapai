package cn.xvkang.primaryentity;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class MSenddata implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.752+08:00", comments="Source field: M_SendData.Id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.752+08:00", comments="Source field: M_SendData.DevcNum")
    private Integer devcnum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.752+08:00", comments="Source field: M_SendData.InseDate")
    private Date insedate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.752+08:00", comments="Source field: M_SendData.SendData")
    private byte[] senddata;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table M_SendData
     *
     * @mbg.generated Fri Jul 05 20:12:44 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.752+08:00", comments="Source field: M_SendData.Id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.752+08:00", comments="Source field: M_SendData.Id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.752+08:00", comments="Source field: M_SendData.DevcNum")
    public Integer getDevcnum() {
        return devcnum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.752+08:00", comments="Source field: M_SendData.DevcNum")
    public void setDevcnum(Integer devcnum) {
        this.devcnum = devcnum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.752+08:00", comments="Source field: M_SendData.InseDate")
    public Date getInsedate() {
        return insedate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.752+08:00", comments="Source field: M_SendData.InseDate")
    public void setInsedate(Date insedate) {
        this.insedate = insedate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.752+08:00", comments="Source field: M_SendData.SendData")
    public byte[] getSenddata() {
        return senddata;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.752+08:00", comments="Source field: M_SendData.SendData")
    public void setSenddata(byte[] senddata) {
        this.senddata = senddata;
    }
}