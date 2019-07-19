package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class QrcodecontrolDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.819+08:00", comments="Source Table: QRCodeControl")
    public static final Qrcodecontrol qrcodecontrol = new Qrcodecontrol();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.819+08:00", comments="Source field: QRCodeControl.ID")
    public static final SqlColumn<Integer> id = qrcodecontrol.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.819+08:00", comments="Source field: QRCodeControl.MachineNo")
    public static final SqlColumn<String> machineno = qrcodecontrol.machineno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.819+08:00", comments="Source field: QRCodeControl.ControlIP")
    public static final SqlColumn<String> controlip = qrcodecontrol.controlip;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.819+08:00", comments="Source field: QRCodeControl.HostIP")
    public static final SqlColumn<String> hostip = qrcodecontrol.hostip;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.819+08:00", comments="Source field: QRCodeControl.InOutFlag")
    public static final SqlColumn<String> inoutflag = qrcodecontrol.inoutflag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.819+08:00", comments="Source field: QRCodeControl.BoundedControlID")
    public static final SqlColumn<String> boundedcontrolid = qrcodecontrol.boundedcontrolid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.819+08:00", comments="Source Table: QRCodeControl")
    public static final class Qrcodecontrol extends SqlTable {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<String> machineno = column("MachineNo", JDBCType.VARCHAR);

        public final SqlColumn<String> controlip = column("ControlIP", JDBCType.VARCHAR);

        public final SqlColumn<String> hostip = column("HostIP", JDBCType.VARCHAR);

        public final SqlColumn<String> inoutflag = column("InOutFlag", JDBCType.VARCHAR);

        public final SqlColumn<String> boundedcontrolid = column("BoundedControlID", JDBCType.VARCHAR);

        public Qrcodecontrol() {
            super("QRCodeControl");
        }
    }
}