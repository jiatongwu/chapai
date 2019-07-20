package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MyblacklistDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.156+08:00", comments="Source Table: MYBlacklist")
    public static final Myblacklist myblacklist = new Myblacklist();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.156+08:00", comments="Source field: MYBlacklist.ID")
    public static final SqlColumn<Integer> id = myblacklist.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.156+08:00", comments="Source field: MYBlacklist.CPH")
    public static final SqlColumn<String> cph = myblacklist.cph;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.157+08:00", comments="Source field: MYBlacklist.StartTime")
    public static final SqlColumn<Date> starttime = myblacklist.starttime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.157+08:00", comments="Source field: MYBlacklist.EndTime")
    public static final SqlColumn<Date> endtime = myblacklist.endtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.157+08:00", comments="Source field: MYBlacklist.Reason")
    public static final SqlColumn<String> reason = myblacklist.reason;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.157+08:00", comments="Source field: MYBlacklist.DownloadSignal")
    public static final SqlColumn<String> downloadsignal = myblacklist.downloadsignal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.163+08:00", comments="Source field: MYBlacklist.AddDelete")
    public static final SqlColumn<Integer> adddelete = myblacklist.adddelete;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.156+08:00", comments="Source Table: MYBlacklist")
    public static final class Myblacklist extends SqlTable {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<String> cph = column("CPH", JDBCType.VARCHAR);

        public final SqlColumn<Date> starttime = column("StartTime", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> endtime = column("EndTime", JDBCType.TIMESTAMP);

        public final SqlColumn<String> reason = column("Reason", JDBCType.VARCHAR);

        public final SqlColumn<String> downloadsignal = column("DownloadSignal", JDBCType.VARCHAR);

        public final SqlColumn<Integer> adddelete = column("AddDelete", JDBCType.INTEGER);

        public Myblacklist() {
            super("MYBlacklist");
        }
    }
}