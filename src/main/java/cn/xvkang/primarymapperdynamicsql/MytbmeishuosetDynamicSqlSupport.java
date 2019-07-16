package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MytbmeishuosetDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.809+08:00", comments="Source Table: MYTBMEISHUOSET")
    public static final Mytbmeishuoset mytbmeishuoset = new Mytbmeishuoset();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.809+08:00", comments="Source field: MYTBMEISHUOSET.CtrlNumber")
    public static final SqlColumn<Integer> ctrlnumber = mytbmeishuoset.ctrlnumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.809+08:00", comments="Source field: MYTBMEISHUOSET.LockLocation")
    public static final SqlColumn<String> locklocation = mytbmeishuoset.locklocation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.809+08:00", comments="Source field: MYTBMEISHUOSET.DeptName")
    public static final SqlColumn<String> deptname = mytbmeishuoset.deptname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.809+08:00", comments="Source field: MYTBMEISHUOSET.DoorID")
    public static final SqlColumn<String> doorid = mytbmeishuoset.doorid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.809+08:00", comments="Source field: MYTBMEISHUOSET.PCName")
    public static final SqlColumn<String> pcname = mytbmeishuoset.pcname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.809+08:00", comments="Source field: MYTBMEISHUOSET.ProduceIndex")
    public static final SqlColumn<String> produceindex = mytbmeishuoset.produceindex;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.809+08:00", comments="Source field: MYTBMEISHUOSET.CtrlType")
    public static final SqlColumn<String> ctrltype = mytbmeishuoset.ctrltype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.809+08:00", comments="Source Table: MYTBMEISHUOSET")
    public static final class Mytbmeishuoset extends SqlTable {
        public final SqlColumn<Integer> ctrlnumber = column("CtrlNumber", JDBCType.INTEGER);

        public final SqlColumn<String> locklocation = column("LockLocation", JDBCType.VARCHAR);

        public final SqlColumn<String> deptname = column("DeptName", JDBCType.VARCHAR);

        public final SqlColumn<String> doorid = column("DoorID", JDBCType.VARCHAR);

        public final SqlColumn<String> pcname = column("PCName", JDBCType.VARCHAR);

        public final SqlColumn<String> produceindex = column("ProduceIndex", JDBCType.VARCHAR);

        public final SqlColumn<String> ctrltype = column("CtrlType", JDBCType.VARCHAR);

        public Mytbmeishuoset() {
            super("MYTBMEISHUOSET");
        }
    }
}