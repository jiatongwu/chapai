package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class LogDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.975+08:00", comments="Source Table: log")
    public static final Log log = new Log();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.975+08:00", comments="Source field: log.id")
    public static final SqlColumn<Integer> id = log.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.975+08:00", comments="Source field: log.user_id")
    public static final SqlColumn<Integer> userId = log.userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.975+08:00", comments="Source field: log.option_name")
    public static final SqlColumn<String> optionName = log.optionName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.975+08:00", comments="Source field: log.createtime")
    public static final SqlColumn<Date> createtime = log.createtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.975+08:00", comments="Source field: log.user_agent")
    public static final SqlColumn<String> userAgent = log.userAgent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.975+08:00", comments="Source field: log.client_id")
    public static final SqlColumn<String> clientId = log.clientId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.975+08:00", comments="Source field: log.option_details")
    public static final SqlColumn<String> optionDetails = log.optionDetails;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.975+08:00", comments="Source Table: log")
    public static final class Log extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> userId = column("user_id", JDBCType.INTEGER);

        public final SqlColumn<String> optionName = column("option_name", JDBCType.VARCHAR);

        public final SqlColumn<Date> createtime = column("createtime", JDBCType.TIMESTAMP);

        public final SqlColumn<String> userAgent = column("user_agent", JDBCType.VARCHAR);

        public final SqlColumn<String> clientId = column("client_id", JDBCType.VARCHAR);

        public final SqlColumn<String> optionDetails = column("option_details", JDBCType.CLOB);

        public Log() {
            super("log");
        }
    }
}