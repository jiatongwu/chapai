package cn.xvkang.primaryentity;

import java.io.Serializable;
import javax.annotation.Generated;

public class Mybumenset implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.969+08:00", comments="Source field: MYBUMENSET.ID")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.969+08:00", comments="Source field: MYBUMENSET.DeptNO")
    private String deptno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.969+08:00", comments="Source field: MYBUMENSET.DeptName")
    private String deptname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.969+08:00", comments="Source field: MYBUMENSET.DeptSymbol")
    private String deptsymbol;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.969+08:00", comments="Source field: MYBUMENSET.PID")
    private Integer pid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table MYBUMENSET
     *
     * @mbg.generated Wed Jul 31 15:28:00 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.969+08:00", comments="Source field: MYBUMENSET.ID")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.969+08:00", comments="Source field: MYBUMENSET.ID")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.969+08:00", comments="Source field: MYBUMENSET.DeptNO")
    public String getDeptno() {
        return deptno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.969+08:00", comments="Source field: MYBUMENSET.DeptNO")
    public void setDeptno(String deptno) {
        this.deptno = deptno == null ? null : deptno.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.969+08:00", comments="Source field: MYBUMENSET.DeptName")
    public String getDeptname() {
        return deptname;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.969+08:00", comments="Source field: MYBUMENSET.DeptName")
    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.969+08:00", comments="Source field: MYBUMENSET.DeptSymbol")
    public String getDeptsymbol() {
        return deptsymbol;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.969+08:00", comments="Source field: MYBUMENSET.DeptSymbol")
    public void setDeptsymbol(String deptsymbol) {
        this.deptsymbol = deptsymbol == null ? null : deptsymbol.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.969+08:00", comments="Source field: MYBUMENSET.PID")
    public Integer getPid() {
        return pid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.969+08:00", comments="Source field: MYBUMENSET.PID")
    public void setPid(Integer pid) {
        this.pid = pid;
    }
}