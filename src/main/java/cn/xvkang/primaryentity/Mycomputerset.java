package cn.xvkang.primaryentity;

import java.io.Serializable;
import javax.annotation.Generated;

public class Mycomputerset implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.011+08:00", comments="Source field: MYCOMPUTERSET.PCName")
    private String pcname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.011+08:00", comments="Source field: MYCOMPUTERSET.CtrlNumber")
    private Integer ctrlnumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table MYCOMPUTERSET
     *
     * @mbg.generated Wed Jul 31 15:28:01 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.011+08:00", comments="Source field: MYCOMPUTERSET.PCName")
    public String getPcname() {
        return pcname;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.011+08:00", comments="Source field: MYCOMPUTERSET.PCName")
    public void setPcname(String pcname) {
        this.pcname = pcname == null ? null : pcname.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.011+08:00", comments="Source field: MYCOMPUTERSET.CtrlNumber")
    public Integer getCtrlnumber() {
        return ctrlnumber;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.011+08:00", comments="Source field: MYCOMPUTERSET.CtrlNumber")
    public void setCtrlnumber(Integer ctrlnumber) {
        this.ctrlnumber = ctrlnumber;
    }
}