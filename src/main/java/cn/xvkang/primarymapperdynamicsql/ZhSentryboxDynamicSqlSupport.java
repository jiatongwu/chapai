package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ZhSentryboxDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.225+08:00", comments="Source Table: zh_SentryBox")
    public static final ZhSentrybox zhSentrybox = new ZhSentrybox();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.225+08:00", comments="Source field: zh_SentryBox.id")
    public static final SqlColumn<Integer> id = zhSentrybox.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.225+08:00", comments="Source field: zh_SentryBox.sentrybox_No")
    public static final SqlColumn<String> sentryboxNo = zhSentrybox.sentryboxNo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.225+08:00", comments="Source field: zh_SentryBox.vehichlejson")
    public static final SqlColumn<String> vehichlejson = zhSentrybox.vehichlejson;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.225+08:00", comments="Source field: zh_SentryBox.eidtTime")
    public static final SqlColumn<String> eidttime = zhSentrybox.eidttime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.225+08:00", comments="Source field: zh_SentryBox.synflag")
    public static final SqlColumn<Integer> synflag = zhSentrybox.synflag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.225+08:00", comments="Source Table: zh_SentryBox")
    public static final class ZhSentrybox extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> sentryboxNo = column("sentrybox_No", JDBCType.VARCHAR);

        public final SqlColumn<String> vehichlejson = column("vehichlejson", JDBCType.VARCHAR);

        public final SqlColumn<String> eidttime = column("eidtTime", JDBCType.VARCHAR);

        public final SqlColumn<Integer> synflag = column("synflag", JDBCType.INTEGER);

        public ZhSentrybox() {
            super("zh_SentryBox");
        }
    }
}