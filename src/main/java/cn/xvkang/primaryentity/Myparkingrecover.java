package cn.xvkang.primaryentity;

import java.io.Serializable;
import javax.annotation.Generated;

public class Myparkingrecover implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.773+08:00", comments="Source field: MyParkingRecover.CtrlNumber")
    private Integer ctrlnumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.773+08:00", comments="Source field: MyParkingRecover.Instruct")
    private String instruct;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.773+08:00", comments="Source field: MyParkingRecover.Flag")
    private String flag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table MyParkingRecover
     *
     * @mbg.generated Fri Jul 05 20:12:44 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.773+08:00", comments="Source field: MyParkingRecover.CtrlNumber")
    public Integer getCtrlnumber() {
        return ctrlnumber;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.773+08:00", comments="Source field: MyParkingRecover.CtrlNumber")
    public void setCtrlnumber(Integer ctrlnumber) {
        this.ctrlnumber = ctrlnumber;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.773+08:00", comments="Source field: MyParkingRecover.Instruct")
    public String getInstruct() {
        return instruct;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.773+08:00", comments="Source field: MyParkingRecover.Instruct")
    public void setInstruct(String instruct) {
        this.instruct = instruct == null ? null : instruct.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.773+08:00", comments="Source field: MyParkingRecover.Flag")
    public String getFlag() {
        return flag;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.773+08:00", comments="Source field: MyParkingRecover.Flag")
    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }
}