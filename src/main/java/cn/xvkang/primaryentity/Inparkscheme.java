package cn.xvkang.primaryentity;

import java.io.Serializable;
import javax.annotation.Generated;

public class Inparkscheme implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.947+08:00", comments="Source field: InParkScheme.SchId")
    private Integer schid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.947+08:00", comments="Source field: InParkScheme.SchName")
    private String schname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.947+08:00", comments="Source field: InParkScheme.FieldName")
    private String fieldname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.947+08:00", comments="Source field: InParkScheme.Operators")
    private String operators;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.947+08:00", comments="Source field: InParkScheme.Selectvalues")
    private String selectvalues;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.947+08:00", comments="Source field: InParkScheme.startime")
    private String startime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.948+08:00", comments="Source field: InParkScheme.endtime")
    private String endtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table InParkScheme
     *
     * @mbg.generated Wed Jul 31 15:28:00 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.947+08:00", comments="Source field: InParkScheme.SchId")
    public Integer getSchid() {
        return schid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.947+08:00", comments="Source field: InParkScheme.SchId")
    public void setSchid(Integer schid) {
        this.schid = schid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.947+08:00", comments="Source field: InParkScheme.SchName")
    public String getSchname() {
        return schname;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.947+08:00", comments="Source field: InParkScheme.SchName")
    public void setSchname(String schname) {
        this.schname = schname == null ? null : schname.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.947+08:00", comments="Source field: InParkScheme.FieldName")
    public String getFieldname() {
        return fieldname;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.947+08:00", comments="Source field: InParkScheme.FieldName")
    public void setFieldname(String fieldname) {
        this.fieldname = fieldname == null ? null : fieldname.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.947+08:00", comments="Source field: InParkScheme.Operators")
    public String getOperators() {
        return operators;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.947+08:00", comments="Source field: InParkScheme.Operators")
    public void setOperators(String operators) {
        this.operators = operators == null ? null : operators.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.947+08:00", comments="Source field: InParkScheme.Selectvalues")
    public String getSelectvalues() {
        return selectvalues;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.947+08:00", comments="Source field: InParkScheme.Selectvalues")
    public void setSelectvalues(String selectvalues) {
        this.selectvalues = selectvalues == null ? null : selectvalues.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.947+08:00", comments="Source field: InParkScheme.startime")
    public String getStartime() {
        return startime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.948+08:00", comments="Source field: InParkScheme.startime")
    public void setStartime(String startime) {
        this.startime = startime == null ? null : startime.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.948+08:00", comments="Source field: InParkScheme.endtime")
    public String getEndtime() {
        return endtime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.948+08:00", comments="Source field: InParkScheme.endtime")
    public void setEndtime(String endtime) {
        this.endtime = endtime == null ? null : endtime.trim();
    }
}