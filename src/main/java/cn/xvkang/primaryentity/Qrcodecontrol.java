package cn.xvkang.primaryentity;

import java.io.Serializable;
import javax.annotation.Generated;

public class Qrcodecontrol implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.892+08:00", comments="Source field: QRCodeControl.ID")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.892+08:00", comments="Source field: QRCodeControl.MachineNo")
    private String machineno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.892+08:00", comments="Source field: QRCodeControl.ControlIP")
    private String controlip;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.892+08:00", comments="Source field: QRCodeControl.HostIP")
    private String hostip;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.892+08:00", comments="Source field: QRCodeControl.InOutFlag")
    private String inoutflag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.892+08:00", comments="Source field: QRCodeControl.BoundedControlID")
    private String boundedcontrolid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table QRCodeControl
     *
     * @mbg.generated Tue Jul 16 10:08:57 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.892+08:00", comments="Source field: QRCodeControl.ID")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.892+08:00", comments="Source field: QRCodeControl.ID")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.892+08:00", comments="Source field: QRCodeControl.MachineNo")
    public String getMachineno() {
        return machineno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.892+08:00", comments="Source field: QRCodeControl.MachineNo")
    public void setMachineno(String machineno) {
        this.machineno = machineno == null ? null : machineno.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.892+08:00", comments="Source field: QRCodeControl.ControlIP")
    public String getControlip() {
        return controlip;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.892+08:00", comments="Source field: QRCodeControl.ControlIP")
    public void setControlip(String controlip) {
        this.controlip = controlip == null ? null : controlip.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.892+08:00", comments="Source field: QRCodeControl.HostIP")
    public String getHostip() {
        return hostip;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.892+08:00", comments="Source field: QRCodeControl.HostIP")
    public void setHostip(String hostip) {
        this.hostip = hostip == null ? null : hostip.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.892+08:00", comments="Source field: QRCodeControl.InOutFlag")
    public String getInoutflag() {
        return inoutflag;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.892+08:00", comments="Source field: QRCodeControl.InOutFlag")
    public void setInoutflag(String inoutflag) {
        this.inoutflag = inoutflag == null ? null : inoutflag.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.892+08:00", comments="Source field: QRCodeControl.BoundedControlID")
    public String getBoundedcontrolid() {
        return boundedcontrolid;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.892+08:00", comments="Source field: QRCodeControl.BoundedControlID")
    public void setBoundedcontrolid(String boundedcontrolid) {
        this.boundedcontrolid = boundedcontrolid == null ? null : boundedcontrolid.trim();
    }
}