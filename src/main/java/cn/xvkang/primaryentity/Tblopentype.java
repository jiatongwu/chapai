package cn.xvkang.primaryentity;

import java.io.Serializable;
import javax.annotation.Generated;

public class Tblopentype implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.205+08:00", comments="Source field: tblOpenType.ID")
    private Short id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.205+08:00", comments="Source field: tblOpenType.OpenType")
    private String opentype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tblOpenType
     *
     * @mbg.generated Wed Jul 31 15:28:01 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.205+08:00", comments="Source field: tblOpenType.ID")
    public Short getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.205+08:00", comments="Source field: tblOpenType.ID")
    public void setId(Short id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.205+08:00", comments="Source field: tblOpenType.OpenType")
    public String getOpentype() {
        return opentype;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.205+08:00", comments="Source field: tblOpenType.OpenType")
    public void setOpentype(String opentype) {
        this.opentype = opentype == null ? null : opentype.trim();
    }
}