package cn.xvkang.primaryentity;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class UserPersonCreate implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.912+08:00", comments="Source field: user_person_create.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.912+08:00", comments="Source field: user_person_create.user_id")
    private Integer userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.912+08:00", comments="Source field: user_person_create.person_id")
    private Integer personId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.912+08:00", comments="Source field: user_person_create.createtime")
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_person_create
     *
     * @mbg.generated Thu Jul 18 14:55:17 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.912+08:00", comments="Source field: user_person_create.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.912+08:00", comments="Source field: user_person_create.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.912+08:00", comments="Source field: user_person_create.user_id")
    public Integer getUserId() {
        return userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.912+08:00", comments="Source field: user_person_create.user_id")
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.912+08:00", comments="Source field: user_person_create.person_id")
    public Integer getPersonId() {
        return personId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.912+08:00", comments="Source field: user_person_create.person_id")
    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.912+08:00", comments="Source field: user_person_create.createtime")
    public Date getCreatetime() {
        return createtime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.912+08:00", comments="Source field: user_person_create.createtime")
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}