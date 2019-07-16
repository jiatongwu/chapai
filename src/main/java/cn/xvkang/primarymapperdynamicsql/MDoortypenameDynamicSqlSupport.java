package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MDoortypenameDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.836+08:00", comments="Source Table: M_DoorTypeName")
    public static final MDoortypename MDoortypename = new MDoortypename();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.836+08:00", comments="Source field: M_DoorTypeName.DoorID")
    public static final SqlColumn<Integer> doorid = MDoortypename.doorid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.836+08:00", comments="Source field: M_DoorTypeName.DoorTypeC")
    public static final SqlColumn<String> doortypec = MDoortypename.doortypec;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.836+08:00", comments="Source field: M_DoorTypeName.DoorTypeE")
    public static final SqlColumn<String> doortypee = MDoortypename.doortypee;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.836+08:00", comments="Source field: M_DoorTypeName.DoorMark")
    public static final SqlColumn<String> doormark = MDoortypename.doormark;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.836+08:00", comments="Source Table: M_DoorTypeName")
    public static final class MDoortypename extends SqlTable {
        public final SqlColumn<Integer> doorid = column("DoorID", JDBCType.INTEGER);

        public final SqlColumn<String> doortypec = column("DoorTypeC", JDBCType.VARCHAR);

        public final SqlColumn<String> doortypee = column("DoorTypeE", JDBCType.VARCHAR);

        public final SqlColumn<String> doormark = column("DoorMark", JDBCType.VARCHAR);

        public MDoortypename() {
            super("M_DoorTypeName");
        }
    }
}