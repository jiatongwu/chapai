package cn.xvkang.primaryentity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.annotation.Generated;

public class ZhOutcar implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.964+08:00", comments="Source field: zh_OutCar.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.964+08:00", comments="Source field: zh_OutCar.orderNo")
    private String orderno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.964+08:00", comments="Source field: zh_OutCar.carNo")
    private String carno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.964+08:00", comments="Source field: zh_OutCar.carType")
    private String cartype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.964+08:00", comments="Source field: zh_OutCar.outTime")
    private String outtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.964+08:00", comments="Source field: zh_OutCar.gateName")
    private String gatename;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.964+08:00", comments="Source field: zh_OutCar.operatorName")
    private String operatorname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.964+08:00", comments="Source field: zh_OutCar.imgpath")
    private String imgpath;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.964+08:00", comments="Source field: zh_OutCar.totalAmount")
    private BigDecimal totalamount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.964+08:00", comments="Source field: zh_OutCar.couponId")
    private Integer couponid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.964+08:00", comments="Source field: zh_OutCar.couponMoney")
    private BigDecimal couponmoney;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.964+08:00", comments="Source field: zh_OutCar.walletPayMoney")
    private BigDecimal walletpaymoney;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.964+08:00", comments="Source field: zh_OutCar.ycflag")
    private Integer ycflag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.964+08:00", comments="Source field: zh_OutCar.imgflag")
    private Integer imgflag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.964+08:00", comments="Source field: zh_OutCar.synflag")
    private Integer synflag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.964+08:00", comments="Source field: zh_OutCar.freeReason")
    private String freereason;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table zh_OutCar
     *
     * @mbg.generated Sun Jul 14 17:27:27 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.964+08:00", comments="Source field: zh_OutCar.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.964+08:00", comments="Source field: zh_OutCar.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.964+08:00", comments="Source field: zh_OutCar.orderNo")
    public String getOrderno() {
        return orderno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.964+08:00", comments="Source field: zh_OutCar.orderNo")
    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.964+08:00", comments="Source field: zh_OutCar.carNo")
    public String getCarno() {
        return carno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.964+08:00", comments="Source field: zh_OutCar.carNo")
    public void setCarno(String carno) {
        this.carno = carno == null ? null : carno.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.964+08:00", comments="Source field: zh_OutCar.carType")
    public String getCartype() {
        return cartype;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.964+08:00", comments="Source field: zh_OutCar.carType")
    public void setCartype(String cartype) {
        this.cartype = cartype == null ? null : cartype.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.964+08:00", comments="Source field: zh_OutCar.outTime")
    public String getOuttime() {
        return outtime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.964+08:00", comments="Source field: zh_OutCar.outTime")
    public void setOuttime(String outtime) {
        this.outtime = outtime == null ? null : outtime.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.964+08:00", comments="Source field: zh_OutCar.gateName")
    public String getGatename() {
        return gatename;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.964+08:00", comments="Source field: zh_OutCar.gateName")
    public void setGatename(String gatename) {
        this.gatename = gatename == null ? null : gatename.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.964+08:00", comments="Source field: zh_OutCar.operatorName")
    public String getOperatorname() {
        return operatorname;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.964+08:00", comments="Source field: zh_OutCar.operatorName")
    public void setOperatorname(String operatorname) {
        this.operatorname = operatorname == null ? null : operatorname.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.964+08:00", comments="Source field: zh_OutCar.imgpath")
    public String getImgpath() {
        return imgpath;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.964+08:00", comments="Source field: zh_OutCar.imgpath")
    public void setImgpath(String imgpath) {
        this.imgpath = imgpath == null ? null : imgpath.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.964+08:00", comments="Source field: zh_OutCar.totalAmount")
    public BigDecimal getTotalamount() {
        return totalamount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.964+08:00", comments="Source field: zh_OutCar.totalAmount")
    public void setTotalamount(BigDecimal totalamount) {
        this.totalamount = totalamount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.964+08:00", comments="Source field: zh_OutCar.couponId")
    public Integer getCouponid() {
        return couponid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.964+08:00", comments="Source field: zh_OutCar.couponId")
    public void setCouponid(Integer couponid) {
        this.couponid = couponid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.964+08:00", comments="Source field: zh_OutCar.couponMoney")
    public BigDecimal getCouponmoney() {
        return couponmoney;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.964+08:00", comments="Source field: zh_OutCar.couponMoney")
    public void setCouponmoney(BigDecimal couponmoney) {
        this.couponmoney = couponmoney;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.964+08:00", comments="Source field: zh_OutCar.walletPayMoney")
    public BigDecimal getWalletpaymoney() {
        return walletpaymoney;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.964+08:00", comments="Source field: zh_OutCar.walletPayMoney")
    public void setWalletpaymoney(BigDecimal walletpaymoney) {
        this.walletpaymoney = walletpaymoney;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.964+08:00", comments="Source field: zh_OutCar.ycflag")
    public Integer getYcflag() {
        return ycflag;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.964+08:00", comments="Source field: zh_OutCar.ycflag")
    public void setYcflag(Integer ycflag) {
        this.ycflag = ycflag;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.964+08:00", comments="Source field: zh_OutCar.imgflag")
    public Integer getImgflag() {
        return imgflag;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.964+08:00", comments="Source field: zh_OutCar.imgflag")
    public void setImgflag(Integer imgflag) {
        this.imgflag = imgflag;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.964+08:00", comments="Source field: zh_OutCar.synflag")
    public Integer getSynflag() {
        return synflag;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.964+08:00", comments="Source field: zh_OutCar.synflag")
    public void setSynflag(Integer synflag) {
        this.synflag = synflag;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.964+08:00", comments="Source field: zh_OutCar.freeReason")
    public String getFreereason() {
        return freereason;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.964+08:00", comments="Source field: zh_OutCar.freeReason")
    public void setFreereason(String freereason) {
        this.freereason = freereason == null ? null : freereason.trim();
    }
}