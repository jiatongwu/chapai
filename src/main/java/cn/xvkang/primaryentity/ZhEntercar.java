package cn.xvkang.primaryentity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.annotation.Generated;

public class ZhEntercar implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.969+08:00", comments="Source field: zh_EnterCar.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.969+08:00", comments="Source field: zh_EnterCar.orderNo")
    private String orderno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.969+08:00", comments="Source field: zh_EnterCar.carNo")
    private String carno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.969+08:00", comments="Source field: zh_EnterCar.carType")
    private String cartype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.969+08:00", comments="Source field: zh_EnterCar.enterTime")
    private String entertime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.969+08:00", comments="Source field: zh_EnterCar.gateName")
    private String gatename;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.969+08:00", comments="Source field: zh_EnterCar.operatorName")
    private String operatorname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.969+08:00", comments="Source field: zh_EnterCar.reserveOrderNo")
    private String reserveorderno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.969+08:00", comments="Source field: zh_EnterCar.imgpath")
    private String imgpath;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.969+08:00", comments="Source field: zh_EnterCar.lockstuat")
    private Integer lockstuat;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.969+08:00", comments="Source field: zh_EnterCar.walletTotalMoney")
    private BigDecimal wallettotalmoney;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.969+08:00", comments="Source field: zh_EnterCar.imgflag")
    private Integer imgflag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.969+08:00", comments="Source field: zh_EnterCar.synflag")
    private Integer synflag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table zh_EnterCar
     *
     * @mbg.generated Tue Jul 16 10:08:57 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.969+08:00", comments="Source field: zh_EnterCar.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.969+08:00", comments="Source field: zh_EnterCar.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.969+08:00", comments="Source field: zh_EnterCar.orderNo")
    public String getOrderno() {
        return orderno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.969+08:00", comments="Source field: zh_EnterCar.orderNo")
    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.969+08:00", comments="Source field: zh_EnterCar.carNo")
    public String getCarno() {
        return carno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.969+08:00", comments="Source field: zh_EnterCar.carNo")
    public void setCarno(String carno) {
        this.carno = carno == null ? null : carno.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.969+08:00", comments="Source field: zh_EnterCar.carType")
    public String getCartype() {
        return cartype;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.969+08:00", comments="Source field: zh_EnterCar.carType")
    public void setCartype(String cartype) {
        this.cartype = cartype == null ? null : cartype.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.969+08:00", comments="Source field: zh_EnterCar.enterTime")
    public String getEntertime() {
        return entertime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.969+08:00", comments="Source field: zh_EnterCar.enterTime")
    public void setEntertime(String entertime) {
        this.entertime = entertime == null ? null : entertime.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.969+08:00", comments="Source field: zh_EnterCar.gateName")
    public String getGatename() {
        return gatename;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.969+08:00", comments="Source field: zh_EnterCar.gateName")
    public void setGatename(String gatename) {
        this.gatename = gatename == null ? null : gatename.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.969+08:00", comments="Source field: zh_EnterCar.operatorName")
    public String getOperatorname() {
        return operatorname;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.969+08:00", comments="Source field: zh_EnterCar.operatorName")
    public void setOperatorname(String operatorname) {
        this.operatorname = operatorname == null ? null : operatorname.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.969+08:00", comments="Source field: zh_EnterCar.reserveOrderNo")
    public String getReserveorderno() {
        return reserveorderno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.969+08:00", comments="Source field: zh_EnterCar.reserveOrderNo")
    public void setReserveorderno(String reserveorderno) {
        this.reserveorderno = reserveorderno == null ? null : reserveorderno.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.969+08:00", comments="Source field: zh_EnterCar.imgpath")
    public String getImgpath() {
        return imgpath;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.969+08:00", comments="Source field: zh_EnterCar.imgpath")
    public void setImgpath(String imgpath) {
        this.imgpath = imgpath == null ? null : imgpath.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.969+08:00", comments="Source field: zh_EnterCar.lockstuat")
    public Integer getLockstuat() {
        return lockstuat;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.969+08:00", comments="Source field: zh_EnterCar.lockstuat")
    public void setLockstuat(Integer lockstuat) {
        this.lockstuat = lockstuat;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.969+08:00", comments="Source field: zh_EnterCar.walletTotalMoney")
    public BigDecimal getWallettotalmoney() {
        return wallettotalmoney;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.969+08:00", comments="Source field: zh_EnterCar.walletTotalMoney")
    public void setWallettotalmoney(BigDecimal wallettotalmoney) {
        this.wallettotalmoney = wallettotalmoney;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.969+08:00", comments="Source field: zh_EnterCar.imgflag")
    public Integer getImgflag() {
        return imgflag;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.969+08:00", comments="Source field: zh_EnterCar.imgflag")
    public void setImgflag(Integer imgflag) {
        this.imgflag = imgflag;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.969+08:00", comments="Source field: zh_EnterCar.synflag")
    public Integer getSynflag() {
        return synflag;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.969+08:00", comments="Source field: zh_EnterCar.synflag")
    public void setSynflag(Integer synflag) {
        this.synflag = synflag;
    }
}