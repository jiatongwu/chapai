package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MycaozuoyuangroupDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.977+08:00", comments="Source Table: MYCAOZUOYUANGROUP")
    public static final Mycaozuoyuangroup mycaozuoyuangroup = new Mycaozuoyuangroup();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.977+08:00", comments="Source field: MYCAOZUOYUANGROUP.GroupNo")
    public static final SqlColumn<Integer> groupno = mycaozuoyuangroup.groupno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.977+08:00", comments="Source field: MYCAOZUOYUANGROUP.GroupName")
    public static final SqlColumn<String> groupname = mycaozuoyuangroup.groupname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.977+08:00", comments="Source field: MYCAOZUOYUANGROUP.Remarks")
    public static final SqlColumn<String> remarks = mycaozuoyuangroup.remarks;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.977+08:00", comments="Source Table: MYCAOZUOYUANGROUP")
    public static final class Mycaozuoyuangroup extends SqlTable {
        public final SqlColumn<Integer> groupno = column("GroupNo", JDBCType.INTEGER);

        public final SqlColumn<String> groupname = column("GroupName", JDBCType.VARCHAR);

        public final SqlColumn<String> remarks = column("Remarks", JDBCType.VARCHAR);

        public Mycaozuoyuangroup() {
            super("MYCAOZUOYUANGROUP");
        }
    }
}