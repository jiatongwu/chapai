package cn.xvkang.primaryentity;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class UserCarCreate implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.989+08:00", comments="Source field: user_car_create.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.989+08:00", comments="Source field: user_car_create.user_id")
    private Integer userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.989+08:00", comments="Source field: user_car_create.car_id")
    private Integer carId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.989+08:00", comments="Source field: user_car_create.createtime")
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_car_create
     *
     * @mbg.generated Tue Jul 16 10:08:57 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.989+08:00", comments="Source field: user_car_create.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.989+08:00", comments="Source field: user_car_create.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.989+08:00", comments="Source field: user_car_create.user_id")
    public Integer getUserId() {
        return userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.989+08:00", comments="Source field: user_car_create.user_id")
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.989+08:00", comments="Source field: user_car_create.car_id")
    public Integer getCarId() {
        return carId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.989+08:00", comments="Source field: user_car_create.car_id")
    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.989+08:00", comments="Source field: user_car_create.createtime")
    public Date getCreatetime() {
        return createtime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.989+08:00", comments="Source field: user_car_create.createtime")
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}