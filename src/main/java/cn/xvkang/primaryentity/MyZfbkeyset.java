package cn.xvkang.primaryentity;

import java.io.Serializable;
import javax.annotation.Generated;

public class MyZfbkeyset implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.779+08:00", comments="Source field: My_ZFBKeySet.ID")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.779+08:00", comments="Source field: My_ZFBKeySet.alipay_rsa_public_key")
    private String alipayRsaPublicKey;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.779+08:00", comments="Source field: My_ZFBKeySet.rsa_private_key")
    private String rsaPrivateKey;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.780+08:00", comments="Source field: My_ZFBKeySet.Rs1")
    private String rs1;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.780+08:00", comments="Source field: My_ZFBKeySet.Rs2")
    private String rs2;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.780+08:00", comments="Source field: My_ZFBKeySet.Rs3")
    private String rs3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table My_ZFBKeySet
     *
     * @mbg.generated Fri Jul 05 20:12:44 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.779+08:00", comments="Source field: My_ZFBKeySet.ID")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.779+08:00", comments="Source field: My_ZFBKeySet.ID")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.779+08:00", comments="Source field: My_ZFBKeySet.alipay_rsa_public_key")
    public String getAlipayRsaPublicKey() {
        return alipayRsaPublicKey;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.779+08:00", comments="Source field: My_ZFBKeySet.alipay_rsa_public_key")
    public void setAlipayRsaPublicKey(String alipayRsaPublicKey) {
        this.alipayRsaPublicKey = alipayRsaPublicKey == null ? null : alipayRsaPublicKey.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.780+08:00", comments="Source field: My_ZFBKeySet.rsa_private_key")
    public String getRsaPrivateKey() {
        return rsaPrivateKey;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.780+08:00", comments="Source field: My_ZFBKeySet.rsa_private_key")
    public void setRsaPrivateKey(String rsaPrivateKey) {
        this.rsaPrivateKey = rsaPrivateKey == null ? null : rsaPrivateKey.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.780+08:00", comments="Source field: My_ZFBKeySet.Rs1")
    public String getRs1() {
        return rs1;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.780+08:00", comments="Source field: My_ZFBKeySet.Rs1")
    public void setRs1(String rs1) {
        this.rs1 = rs1 == null ? null : rs1.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.780+08:00", comments="Source field: My_ZFBKeySet.Rs2")
    public String getRs2() {
        return rs2;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.780+08:00", comments="Source field: My_ZFBKeySet.Rs2")
    public void setRs2(String rs2) {
        this.rs2 = rs2 == null ? null : rs2.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.780+08:00", comments="Source field: My_ZFBKeySet.Rs3")
    public String getRs3() {
        return rs3;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.780+08:00", comments="Source field: My_ZFBKeySet.Rs3")
    public void setRs3(String rs3) {
        this.rs3 = rs3 == null ? null : rs3.trim();
    }
}