package cn.xvkang.primaryentity;

import java.io.Serializable;
import javax.annotation.Generated;

public class Tspecialcph implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.958+08:00", comments="Source field: tSpecialCPH.ID")
    private Long id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.958+08:00", comments="Source field: tSpecialCPH.Type")
    private Integer type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.958+08:00", comments="Source field: tSpecialCPH.CPH")
    private String cph;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.958+08:00", comments="Source field: tSpecialCPH.Mode")
    private String mode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.958+08:00", comments="Source field: tSpecialCPH.Show")
    private String show;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tSpecialCPH
     *
     * @mbg.generated Tue Jul 16 10:08:57 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.958+08:00", comments="Source field: tSpecialCPH.ID")
    public Long getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.958+08:00", comments="Source field: tSpecialCPH.ID")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.958+08:00", comments="Source field: tSpecialCPH.Type")
    public Integer getType() {
        return type;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.958+08:00", comments="Source field: tSpecialCPH.Type")
    public void setType(Integer type) {
        this.type = type;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.958+08:00", comments="Source field: tSpecialCPH.CPH")
    public String getCph() {
        return cph;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.958+08:00", comments="Source field: tSpecialCPH.CPH")
    public void setCph(String cph) {
        this.cph = cph == null ? null : cph.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.958+08:00", comments="Source field: tSpecialCPH.Mode")
    public String getMode() {
        return mode;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.958+08:00", comments="Source field: tSpecialCPH.Mode")
    public void setMode(String mode) {
        this.mode = mode == null ? null : mode.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.958+08:00", comments="Source field: tSpecialCPH.Show")
    public String getShow() {
        return show;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.958+08:00", comments="Source field: tSpecialCPH.Show")
    public void setShow(String show) {
        this.show = show == null ? null : show.trim();
    }
}