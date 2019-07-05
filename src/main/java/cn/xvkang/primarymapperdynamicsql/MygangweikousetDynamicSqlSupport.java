package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MygangweikousetDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.571+08:00", comments="Source Table: MYGANGWEIKOUSET")
    public static final Mygangweikouset mygangweikouset = new Mygangweikouset();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.571+08:00", comments="Source field: MYGANGWEIKOUSET.CarChannel")
    public static final SqlColumn<Integer> carchannel = mygangweikouset.carchannel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.571+08:00", comments="Source field: MYGANGWEIKOUSET.InOut")
    public static final SqlColumn<Integer> inout = mygangweikouset.inout;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.571+08:00", comments="Source field: MYGANGWEIKOUSET.InOutName")
    public static final SqlColumn<String> inoutname = mygangweikouset.inoutname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.571+08:00", comments="Source field: MYGANGWEIKOUSET.CtrlNumber")
    public static final SqlColumn<Integer> ctrlnumber = mygangweikouset.ctrlnumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.571+08:00", comments="Source field: MYGANGWEIKOUSET.OpenID")
    public static final SqlColumn<Integer> openid = mygangweikouset.openid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.571+08:00", comments="Source field: MYGANGWEIKOUSET.OpenType")
    public static final SqlColumn<Integer> opentype = mygangweikouset.opentype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.571+08:00", comments="Source field: MYGANGWEIKOUSET.VideoCardID")
    public static final SqlColumn<Integer> videocardid = mygangweikouset.videocardid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.571+08:00", comments="Source field: MYGANGWEIKOUSET.PersonVideo")
    public static final SqlColumn<Integer> personvideo = mygangweikouset.personvideo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.571+08:00", comments="Source field: MYGANGWEIKOUSET.BigSmall")
    public static final SqlColumn<Integer> bigsmall = mygangweikouset.bigsmall;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.572+08:00", comments="Source field: MYGANGWEIKOUSET.CheckPortID")
    public static final SqlColumn<Integer> checkportid = mygangweikouset.checkportid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.572+08:00", comments="Source field: MYGANGWEIKOUSET.TempIn")
    public static final SqlColumn<Integer> tempin = mygangweikouset.tempin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.572+08:00", comments="Source field: MYGANGWEIKOUSET.TempOut")
    public static final SqlColumn<Integer> tempout = mygangweikouset.tempout;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.572+08:00", comments="Source field: MYGANGWEIKOUSET.HasOutCard")
    public static final SqlColumn<Integer> hasoutcard = mygangweikouset.hasoutcard;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.572+08:00", comments="Source field: MYGANGWEIKOUSET.IdentifyAddress")
    public static final SqlColumn<String> identifyaddress = mygangweikouset.identifyaddress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.572+08:00", comments="Source field: MYGANGWEIKOUSET.IdentifySignal")
    public static final SqlColumn<Integer> identifysignal = mygangweikouset.identifysignal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.572+08:00", comments="Source field: MYGANGWEIKOUSET.SubJH")
    public static final SqlColumn<String> subjh = mygangweikouset.subjh;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.572+08:00", comments="Source field: MYGANGWEIKOUSET.XieYi")
    public static final SqlColumn<Integer> xieyi = mygangweikouset.xieyi;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.572+08:00", comments="Source field: MYGANGWEIKOUSET.IP")
    public static final SqlColumn<String> ip = mygangweikouset.ip;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.572+08:00", comments="Source field: MYGANGWEIKOUSET.PCName")
    public static final SqlColumn<String> pcname = mygangweikouset.pcname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.572+08:00", comments="Source field: MYGANGWEIKOUSET.AndroidIP")
    public static final SqlColumn<String> androidip = mygangweikouset.androidip;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.571+08:00", comments="Source Table: MYGANGWEIKOUSET")
    public static final class Mygangweikouset extends SqlTable {
        public final SqlColumn<Integer> carchannel = column("CarChannel", JDBCType.INTEGER);

        public final SqlColumn<Integer> inout = column("InOut", JDBCType.INTEGER);

        public final SqlColumn<String> inoutname = column("InOutName", JDBCType.VARCHAR);

        public final SqlColumn<Integer> ctrlnumber = column("CtrlNumber", JDBCType.INTEGER);

        public final SqlColumn<Integer> openid = column("OpenID", JDBCType.INTEGER);

        public final SqlColumn<Integer> opentype = column("OpenType", JDBCType.INTEGER);

        public final SqlColumn<Integer> videocardid = column("VideoCardID", JDBCType.INTEGER);

        public final SqlColumn<Integer> personvideo = column("PersonVideo", JDBCType.INTEGER);

        public final SqlColumn<Integer> bigsmall = column("BigSmall", JDBCType.INTEGER);

        public final SqlColumn<Integer> checkportid = column("CheckPortID", JDBCType.INTEGER);

        public final SqlColumn<Integer> tempin = column("TempIn", JDBCType.INTEGER);

        public final SqlColumn<Integer> tempout = column("TempOut", JDBCType.INTEGER);

        public final SqlColumn<Integer> hasoutcard = column("HasOutCard", JDBCType.INTEGER);

        public final SqlColumn<String> identifyaddress = column("IdentifyAddress", JDBCType.VARCHAR);

        public final SqlColumn<Integer> identifysignal = column("IdentifySignal", JDBCType.INTEGER);

        public final SqlColumn<String> subjh = column("SubJH", JDBCType.VARCHAR);

        public final SqlColumn<Integer> xieyi = column("XieYi", JDBCType.INTEGER);

        public final SqlColumn<String> ip = column("IP", JDBCType.VARCHAR);

        public final SqlColumn<String> pcname = column("PCName", JDBCType.VARCHAR);

        public final SqlColumn<String> androidip = column("AndroidIP", JDBCType.VARCHAR);

        public Mygangweikouset() {
            super("MYGANGWEIKOUSET");
        }
    }
}