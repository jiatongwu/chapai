package cn.xvkang.primaryentity;

import java.io.Serializable;
import javax.annotation.Generated;

public class Qrselectscheme implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.789+08:00", comments="Source field: QrSelectScheme.SchId")
    private Integer schid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.789+08:00", comments="Source field: QrSelectScheme.SchName")
    private String schname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.789+08:00", comments="Source field: QrSelectScheme.FieldName")
    private String fieldname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.789+08:00", comments="Source field: QrSelectScheme.Operators")
    private String operators;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.789+08:00", comments="Source field: QrSelectScheme.Selectvalues")
    private String selectvalues;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.789+08:00", comments="Source field: QrSelectScheme.startime")
    private String startime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.789+08:00", comments="Source field: QrSelectScheme.endtime")
    private String endtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table QrSelectScheme
     *
     * @mbg.generated Fri Jul 05 20:12:44 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.789+08:00", comments="Source field: QrSelectScheme.SchId")
    public Integer getSchid() {
        return schid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.789+08:00", comments="Source field: QrSelectScheme.SchId")
    public void setSchid(Integer schid) {
        this.schid = schid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.789+08:00", comments="Source field: QrSelectScheme.SchName")
    public String getSchname() {
        return schname;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.789+08:00", comments="Source field: QrSelectScheme.SchName")
    public void setSchname(String schname) {
        this.schname = schname == null ? null : schname.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.789+08:00", comments="Source field: QrSelectScheme.FieldName")
    public String getFieldname() {
        return fieldname;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.789+08:00", comments="Source field: QrSelectScheme.FieldName")
    public void setFieldname(String fieldname) {
        this.fieldname = fieldname == null ? null : fieldname.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.789+08:00", comments="Source field: QrSelectScheme.Operators")
    public String getOperators() {
        return operators;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.789+08:00", comments="Source field: QrSelectScheme.Operators")
    public void setOperators(String operators) {
        this.operators = operators == null ? null : operators.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.789+08:00", comments="Source field: QrSelectScheme.Selectvalues")
    public String getSelectvalues() {
        return selectvalues;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.789+08:00", comments="Source field: QrSelectScheme.Selectvalues")
    public void setSelectvalues(String selectvalues) {
        this.selectvalues = selectvalues == null ? null : selectvalues.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.789+08:00", comments="Source field: QrSelectScheme.startime")
    public String getStartime() {
        return startime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.789+08:00", comments="Source field: QrSelectScheme.startime")
    public void setStartime(String startime) {
        this.startime = startime == null ? null : startime.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.789+08:00", comments="Source field: QrSelectScheme.endtime")
    public String getEndtime() {
        return endtime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.789+08:00", comments="Source field: QrSelectScheme.endtime")
    public void setEndtime(String endtime) {
        this.endtime = endtime == null ? null : endtime.trim();
    }
}