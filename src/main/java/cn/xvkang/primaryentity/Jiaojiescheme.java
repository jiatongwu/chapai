package cn.xvkang.primaryentity;

import java.io.Serializable;
import javax.annotation.Generated;

public class Jiaojiescheme implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.681+08:00", comments="Source field: JiaoJieScheme.SchId")
    private Integer schid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.681+08:00", comments="Source field: JiaoJieScheme.SchName")
    private String schname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.681+08:00", comments="Source field: JiaoJieScheme.FieldName")
    private String fieldname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.681+08:00", comments="Source field: JiaoJieScheme.Operators")
    private String operators;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.681+08:00", comments="Source field: JiaoJieScheme.Selectvalues")
    private String selectvalues;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.682+08:00", comments="Source field: JiaoJieScheme.startime")
    private String startime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.682+08:00", comments="Source field: JiaoJieScheme.endtime")
    private String endtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table JiaoJieScheme
     *
     * @mbg.generated Sun Jul 14 17:27:27 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.681+08:00", comments="Source field: JiaoJieScheme.SchId")
    public Integer getSchid() {
        return schid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.681+08:00", comments="Source field: JiaoJieScheme.SchId")
    public void setSchid(Integer schid) {
        this.schid = schid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.681+08:00", comments="Source field: JiaoJieScheme.SchName")
    public String getSchname() {
        return schname;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.681+08:00", comments="Source field: JiaoJieScheme.SchName")
    public void setSchname(String schname) {
        this.schname = schname == null ? null : schname.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.681+08:00", comments="Source field: JiaoJieScheme.FieldName")
    public String getFieldname() {
        return fieldname;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.681+08:00", comments="Source field: JiaoJieScheme.FieldName")
    public void setFieldname(String fieldname) {
        this.fieldname = fieldname == null ? null : fieldname.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.681+08:00", comments="Source field: JiaoJieScheme.Operators")
    public String getOperators() {
        return operators;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.681+08:00", comments="Source field: JiaoJieScheme.Operators")
    public void setOperators(String operators) {
        this.operators = operators == null ? null : operators.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.682+08:00", comments="Source field: JiaoJieScheme.Selectvalues")
    public String getSelectvalues() {
        return selectvalues;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.682+08:00", comments="Source field: JiaoJieScheme.Selectvalues")
    public void setSelectvalues(String selectvalues) {
        this.selectvalues = selectvalues == null ? null : selectvalues.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.682+08:00", comments="Source field: JiaoJieScheme.startime")
    public String getStartime() {
        return startime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.682+08:00", comments="Source field: JiaoJieScheme.startime")
    public void setStartime(String startime) {
        this.startime = startime == null ? null : startime.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.682+08:00", comments="Source field: JiaoJieScheme.endtime")
    public String getEndtime() {
        return endtime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.682+08:00", comments="Source field: JiaoJieScheme.endtime")
    public void setEndtime(String endtime) {
        this.endtime = endtime == null ? null : endtime.trim();
    }
}