package cn.xvkang.primaryentity;

import java.io.Serializable;
import javax.annotation.Generated;

public class ZhUpdatecar implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.910+08:00", comments="Source field: zh_UpdateCar.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.910+08:00", comments="Source field: zh_UpdateCar.orderNo")
    private String orderno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.910+08:00", comments="Source field: zh_UpdateCar.carNo")
    private String carno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.910+08:00", comments="Source field: zh_UpdateCar.synflag")
    private Integer synflag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table zh_UpdateCar
     *
     * @mbg.generated Thu Jul 18 14:55:17 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.910+08:00", comments="Source field: zh_UpdateCar.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.910+08:00", comments="Source field: zh_UpdateCar.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.910+08:00", comments="Source field: zh_UpdateCar.orderNo")
    public String getOrderno() {
        return orderno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.910+08:00", comments="Source field: zh_UpdateCar.orderNo")
    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.910+08:00", comments="Source field: zh_UpdateCar.carNo")
    public String getCarno() {
        return carno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.910+08:00", comments="Source field: zh_UpdateCar.carNo")
    public void setCarno(String carno) {
        this.carno = carno == null ? null : carno.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.911+08:00", comments="Source field: zh_UpdateCar.synflag")
    public Integer getSynflag() {
        return synflag;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.911+08:00", comments="Source field: zh_UpdateCar.synflag")
    public void setSynflag(Integer synflag) {
        this.synflag = synflag;
    }
}