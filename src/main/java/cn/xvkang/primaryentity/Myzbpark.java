package cn.xvkang.primaryentity;

import java.io.Serializable;
import javax.annotation.Generated;

public class Myzbpark implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.762+08:00", comments="Source field: MYZBPARK.CtrlNumber")
    private Integer ctrlnumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.762+08:00", comments="Source field: MYZBPARK.Location")
    private String location;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table MYZBPARK
     *
     * @mbg.generated Thu Jul 18 14:55:17 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.762+08:00", comments="Source field: MYZBPARK.CtrlNumber")
    public Integer getCtrlnumber() {
        return ctrlnumber;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.762+08:00", comments="Source field: MYZBPARK.CtrlNumber")
    public void setCtrlnumber(Integer ctrlnumber) {
        this.ctrlnumber = ctrlnumber;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.762+08:00", comments="Source field: MYZBPARK.Location")
    public String getLocation() {
        return location;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.762+08:00", comments="Source field: MYZBPARK.Location")
    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }
}