package cn.xvkang.primaryentity;

import java.io.Serializable;
import javax.annotation.Generated;

public class Mysqlnamepeizhi implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.055+08:00", comments="Source field: MYSQLNAMEPEIZHI.ID")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.055+08:00", comments="Source field: MYSQLNAMEPEIZHI.EN_Name")
    private String enName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.055+08:00", comments="Source field: MYSQLNAMEPEIZHI.CH_Name")
    private String chName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.055+08:00", comments="Source field: MYSQLNAMEPEIZHI.Type")
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table MYSQLNAMEPEIZHI
     *
     * @mbg.generated Wed Jul 31 15:28:01 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.055+08:00", comments="Source field: MYSQLNAMEPEIZHI.ID")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.055+08:00", comments="Source field: MYSQLNAMEPEIZHI.ID")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.055+08:00", comments="Source field: MYSQLNAMEPEIZHI.EN_Name")
    public String getEnName() {
        return enName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.055+08:00", comments="Source field: MYSQLNAMEPEIZHI.EN_Name")
    public void setEnName(String enName) {
        this.enName = enName == null ? null : enName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.055+08:00", comments="Source field: MYSQLNAMEPEIZHI.CH_Name")
    public String getChName() {
        return chName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.055+08:00", comments="Source field: MYSQLNAMEPEIZHI.CH_Name")
    public void setChName(String chName) {
        this.chName = chName == null ? null : chName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.055+08:00", comments="Source field: MYSQLNAMEPEIZHI.Type")
    public String getType() {
        return type;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.055+08:00", comments="Source field: MYSQLNAMEPEIZHI.Type")
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}