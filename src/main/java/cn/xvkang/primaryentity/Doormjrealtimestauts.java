package cn.xvkang.primaryentity;

import java.io.Serializable;
import javax.annotation.Generated;

public class Doormjrealtimestauts implements Serializable {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.587+08:00", comments="Source field: DoorMjRealTimeStauts.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.587+08:00", comments="Source field: DoorMjRealTimeStauts.DoorName")
    private String doorname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table DoorMjRealTimeStauts
     *
     * @mbg.generated Sun Jul 14 17:27:27 CST 2019
     */
    private static final long serialVersionUID = 1L;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.587+08:00", comments="Source field: DoorMjRealTimeStauts.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.587+08:00", comments="Source field: DoorMjRealTimeStauts.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.587+08:00", comments="Source field: DoorMjRealTimeStauts.DoorName")
    public String getDoorname() {
        return doorname;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.587+08:00", comments="Source field: DoorMjRealTimeStauts.DoorName")
    public void setDoorname(String doorname) {
        this.doorname = doorname == null ? null : doorname.trim();
    }
}