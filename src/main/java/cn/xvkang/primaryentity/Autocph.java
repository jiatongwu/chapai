package cn.xvkang.primaryentity;

import java.io.Serializable;
import javax.annotation.Generated;

public class Autocph implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.813+08:00", comments="Source field: AutoCPH.CPH")
    private String cph;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table AutoCPH
     *
     * @mbg.generated Wed Jul 31 15:28:00 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.821+08:00", comments="Source field: AutoCPH.CPH")
    public String getCph() {
        return cph;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.822+08:00", comments="Source field: AutoCPH.CPH")
    public void setCph(String cph) {
        this.cph = cph == null ? null : cph.trim();
    }
}