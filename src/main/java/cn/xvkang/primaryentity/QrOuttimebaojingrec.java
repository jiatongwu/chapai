package cn.xvkang.primaryentity;

import java.io.Serializable;
import javax.annotation.Generated;

public class QrOuttimebaojingrec implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.463+08:00", comments="Source field: Qr_OutTimeBaoJingRec.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.463+08:00", comments="Source field: Qr_OutTimeBaoJingRec.DevcNum")
    private Integer devcnum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.463+08:00", comments="Source field: Qr_OutTimeBaoJingRec.Baojin")
    private String baojin;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Qr_OutTimeBaoJingRec
     *
     * @mbg.generated Fri Jul 19 09:31:22 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.463+08:00", comments="Source field: Qr_OutTimeBaoJingRec.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.463+08:00", comments="Source field: Qr_OutTimeBaoJingRec.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.463+08:00", comments="Source field: Qr_OutTimeBaoJingRec.DevcNum")
    public Integer getDevcnum() {
        return devcnum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.463+08:00", comments="Source field: Qr_OutTimeBaoJingRec.DevcNum")
    public void setDevcnum(Integer devcnum) {
        this.devcnum = devcnum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.463+08:00", comments="Source field: Qr_OutTimeBaoJingRec.Baojin")
    public String getBaojin() {
        return baojin;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.463+08:00", comments="Source field: Qr_OutTimeBaoJingRec.Baojin")
    public void setBaojin(String baojin) {
        this.baojin = baojin == null ? null : baojin.trim();
    }
}