package cn.xvkang.primaryentity;

import java.io.Serializable;
import javax.annotation.Generated;

public class Tblconstant implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.529+08:00", comments="Source field: tblConstant.Types")
    private String types;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.529+08:00", comments="Source field: tblConstant.OrderNO")
    private Short orderno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.529+08:00", comments="Source field: tblConstant.Keys")
    private String keys;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.529+08:00", comments="Source field: tblConstant.Value")
    private String value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.529+08:00", comments="Source field: tblConstant.Flag")
    private Byte flag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tblConstant
     *
     * @mbg.generated Fri Jul 19 09:31:22 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.529+08:00", comments="Source field: tblConstant.Types")
    public String getTypes() {
        return types;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.529+08:00", comments="Source field: tblConstant.Types")
    public void setTypes(String types) {
        this.types = types == null ? null : types.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.529+08:00", comments="Source field: tblConstant.OrderNO")
    public Short getOrderno() {
        return orderno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.529+08:00", comments="Source field: tblConstant.OrderNO")
    public void setOrderno(Short orderno) {
        this.orderno = orderno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.529+08:00", comments="Source field: tblConstant.Keys")
    public String getKeys() {
        return keys;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.529+08:00", comments="Source field: tblConstant.Keys")
    public void setKeys(String keys) {
        this.keys = keys == null ? null : keys.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.529+08:00", comments="Source field: tblConstant.Value")
    public String getValue() {
        return value;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.529+08:00", comments="Source field: tblConstant.Value")
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.529+08:00", comments="Source field: tblConstant.Flag")
    public Byte getFlag() {
        return flag;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.529+08:00", comments="Source field: tblConstant.Flag")
    public void setFlag(Byte flag) {
        this.flag = flag;
    }
}