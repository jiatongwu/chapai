package cn.xvkang.primaryentity;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;

public class Myholiday implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.768+08:00", comments="Source field: MyHoliday.Dates")
    private Date dates;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.768+08:00", comments="Source field: MyHoliday.Types")
    private String types;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table MyHoliday
     *
     * @mbg.generated Fri Jul 05 20:12:44 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.768+08:00", comments="Source field: MyHoliday.Dates")
    public Date getDates() {
        return dates;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.768+08:00", comments="Source field: MyHoliday.Dates")
    public void setDates(Date dates) {
        this.dates = dates;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.768+08:00", comments="Source field: MyHoliday.Types")
    public String getTypes() {
        return types;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.768+08:00", comments="Source field: MyHoliday.Types")
    public void setTypes(String types) {
        this.types = types == null ? null : types.trim();
    }
}