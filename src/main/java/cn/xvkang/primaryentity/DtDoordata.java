package cn.xvkang.primaryentity;

import java.io.Serializable;
import javax.annotation.Generated;

public class DtDoordata implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.874+08:00", comments="Source field: Dt_DoorData.DevcNo")
    private Integer devcno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.875+08:00", comments="Source field: Dt_DoorData.Place")
    private String place;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.875+08:00", comments="Source field: Dt_DoorData.DevcType")
    private Integer devctype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.875+08:00", comments="Source field: Dt_DoorData.DevcIpadress")
    private String devcipadress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.875+08:00", comments="Source field: Dt_DoorData.TxType")
    private Integer txtype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Dt_DoorData
     *
     * @mbg.generated Wed Jul 31 15:28:00 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.874+08:00", comments="Source field: Dt_DoorData.DevcNo")
    public Integer getDevcno() {
        return devcno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.875+08:00", comments="Source field: Dt_DoorData.DevcNo")
    public void setDevcno(Integer devcno) {
        this.devcno = devcno;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.875+08:00", comments="Source field: Dt_DoorData.Place")
    public String getPlace() {
        return place;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.875+08:00", comments="Source field: Dt_DoorData.Place")
    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.875+08:00", comments="Source field: Dt_DoorData.DevcType")
    public Integer getDevctype() {
        return devctype;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.875+08:00", comments="Source field: Dt_DoorData.DevcType")
    public void setDevctype(Integer devctype) {
        this.devctype = devctype;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.875+08:00", comments="Source field: Dt_DoorData.DevcIpadress")
    public String getDevcipadress() {
        return devcipadress;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.875+08:00", comments="Source field: Dt_DoorData.DevcIpadress")
    public void setDevcipadress(String devcipadress) {
        this.devcipadress = devcipadress == null ? null : devcipadress.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.875+08:00", comments="Source field: Dt_DoorData.TxType")
    public Integer getTxtype() {
        return txtype;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.875+08:00", comments="Source field: Dt_DoorData.TxType")
    public void setTxtype(Integer txtype) {
        this.txtype = txtype;
    }
}