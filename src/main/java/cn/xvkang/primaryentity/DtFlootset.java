package cn.xvkang.primaryentity;

import java.io.Serializable;
import javax.annotation.Generated;

public class DtFlootset implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.889+08:00", comments="Source field: Dt_FlootSet.Floot")
    private Integer floot;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Dt_FlootSet
     *
     * @mbg.generated Wed Jul 31 15:28:00 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.889+08:00", comments="Source field: Dt_FlootSet.Floot")
    public Integer getFloot() {
        return floot;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.889+08:00", comments="Source field: Dt_FlootSet.Floot")
    public void setFloot(Integer floot) {
        this.floot = floot;
    }
}