package cn.xvkang.primaryentity;

import java.io.Serializable;
import javax.annotation.Generated;

public class ZhReservecar implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.984+08:00", comments="Source field: zh_ReserveCar.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.984+08:00", comments="Source field: zh_ReserveCar.orderNo")
    private String orderno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.984+08:00", comments="Source field: zh_ReserveCar.carNo")
    private String carno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.984+08:00", comments="Source field: zh_ReserveCar.expirationTime")
    private String expirationtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.984+08:00", comments="Source field: zh_ReserveCar.stuat")
    private Integer stuat;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.984+08:00", comments="Source field: zh_ReserveCar.alterTime")
    private String altertime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table zh_ReserveCar
     *
     * @mbg.generated Tue Jul 16 10:08:57 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.984+08:00", comments="Source field: zh_ReserveCar.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.984+08:00", comments="Source field: zh_ReserveCar.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.984+08:00", comments="Source field: zh_ReserveCar.orderNo")
    public String getOrderno() {
        return orderno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.984+08:00", comments="Source field: zh_ReserveCar.orderNo")
    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.984+08:00", comments="Source field: zh_ReserveCar.carNo")
    public String getCarno() {
        return carno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.984+08:00", comments="Source field: zh_ReserveCar.carNo")
    public void setCarno(String carno) {
        this.carno = carno == null ? null : carno.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.984+08:00", comments="Source field: zh_ReserveCar.expirationTime")
    public String getExpirationtime() {
        return expirationtime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.984+08:00", comments="Source field: zh_ReserveCar.expirationTime")
    public void setExpirationtime(String expirationtime) {
        this.expirationtime = expirationtime == null ? null : expirationtime.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.984+08:00", comments="Source field: zh_ReserveCar.stuat")
    public Integer getStuat() {
        return stuat;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.984+08:00", comments="Source field: zh_ReserveCar.stuat")
    public void setStuat(Integer stuat) {
        this.stuat = stuat;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.984+08:00", comments="Source field: zh_ReserveCar.alterTime")
    public String getAltertime() {
        return altertime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.984+08:00", comments="Source field: zh_ReserveCar.alterTime")
    public void setAltertime(String altertime) {
        this.altertime = altertime == null ? null : altertime.trim();
    }
}