package cn.xvkang.primaryentity;

import java.io.Serializable;
import javax.annotation.Generated;

public class Role implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.199+08:00", comments="Source field: role.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.199+08:00", comments="Source field: role.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.199+08:00", comments="Source field: role.code")
    private String code;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.199+08:00", comments="Source field: role.describe")
    private String describe;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.199+08:00", comments="Source field: role.time")
    private String time;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.199+08:00", comments="Source field: role.state")
    private Integer state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table role
     *
     * @mbg.generated Wed Jul 31 15:28:01 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.199+08:00", comments="Source field: role.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.199+08:00", comments="Source field: role.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.199+08:00", comments="Source field: role.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.199+08:00", comments="Source field: role.name")
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.199+08:00", comments="Source field: role.code")
    public String getCode() {
        return code;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.199+08:00", comments="Source field: role.code")
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.199+08:00", comments="Source field: role.describe")
    public String getDescribe() {
        return describe;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.199+08:00", comments="Source field: role.describe")
    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.199+08:00", comments="Source field: role.time")
    public String getTime() {
        return time;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.199+08:00", comments="Source field: role.time")
    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.199+08:00", comments="Source field: role.state")
    public Integer getState() {
        return state;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.199+08:00", comments="Source field: role.state")
    public void setState(Integer state) {
        this.state = state;
    }
}