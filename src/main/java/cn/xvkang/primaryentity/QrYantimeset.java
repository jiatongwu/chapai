package cn.xvkang.primaryentity;

import java.io.Serializable;
import javax.annotation.Generated;

public class QrYantimeset implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.828+08:00", comments="Source field: Qr_YanTimeSet.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.828+08:00", comments="Source field: Qr_YanTimeSet.DevcNum")
    private Integer devcnum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.828+08:00", comments="Source field: Qr_YanTimeSet.Yanshi")
    private String yanshi;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Qr_YanTimeSet
     *
     * @mbg.generated Thu Jul 18 14:55:17 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.828+08:00", comments="Source field: Qr_YanTimeSet.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.828+08:00", comments="Source field: Qr_YanTimeSet.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.828+08:00", comments="Source field: Qr_YanTimeSet.DevcNum")
    public Integer getDevcnum() {
        return devcnum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.828+08:00", comments="Source field: Qr_YanTimeSet.DevcNum")
    public void setDevcnum(Integer devcnum) {
        this.devcnum = devcnum;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.828+08:00", comments="Source field: Qr_YanTimeSet.Yanshi")
    public String getYanshi() {
        return yanshi;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.828+08:00", comments="Source field: Qr_YanTimeSet.Yanshi")
    public void setYanshi(String yanshi) {
        this.yanshi = yanshi == null ? null : yanshi.trim();
    }
}