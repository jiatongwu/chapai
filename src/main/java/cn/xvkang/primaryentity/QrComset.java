package cn.xvkang.primaryentity;

import java.io.Serializable;
import javax.annotation.Generated;

public class QrComset implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.897+08:00", comments="Source field: Qr_ComSet.com")
    private Integer com;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Qr_ComSet
     *
     * @mbg.generated Tue Jul 16 10:08:57 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.897+08:00", comments="Source field: Qr_ComSet.com")
    public Integer getCom() {
        return com;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.897+08:00", comments="Source field: Qr_ComSet.com")
    public void setCom(Integer com) {
        this.com = com;
    }
}