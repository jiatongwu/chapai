package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class LogDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.916+08:00", comments="Source Table: log")
    public static final Log log = new Log();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.916+08:00", comments="Source field: log.id")
    public static final SqlColumn<Integer> id = log.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.916+08:00", comments="Source field: log.user_id")
    public static final SqlColumn<Integer> userId = log.userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.916+08:00", comments="Source field: log.operate_name")
    public static final SqlColumn<String> operateName = log.operateName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.917+08:00", comments="Source field: log.createtime")
    public static final SqlColumn<Date> createtime = log.createtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.917+08:00", comments="Source field: log.user_agent")
    public static final SqlColumn<String> userAgent = log.userAgent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.917+08:00", comments="Source field: log.client_ip")
    public static final SqlColumn<String> clientIp = log.clientIp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.917+08:00", comments="Source field: log.operate_username")
    public static final SqlColumn<String> operateUsername = log.operateUsername;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.917+08:00", comments="Source field: log.operate_user_phone")
    public static final SqlColumn<String> operateUserPhone = log.operateUserPhone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.917+08:00", comments="Source field: log.operate_cph")
    public static final SqlColumn<String> operateCph = log.operateCph;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.917+08:00", comments="Source field: log.validEnd")
    public static final SqlColumn<Date> validend = log.validend;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.916+08:00", comments="Source Table: log")
    public static final class Log extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> userId = column("user_id", JDBCType.INTEGER);

        public final SqlColumn<String> operateName = column("operate_name", JDBCType.VARCHAR);

        public final SqlColumn<Date> createtime = column("createtime", JDBCType.TIMESTAMP);

        public final SqlColumn<String> userAgent = column("user_agent", JDBCType.VARCHAR);

        public final SqlColumn<String> clientIp = column("client_ip", JDBCType.VARCHAR);

        public final SqlColumn<String> operateUsername = column("operate_username", JDBCType.VARCHAR);

        public final SqlColumn<String> operateUserPhone = column("operate_user_phone", JDBCType.VARCHAR);

        public final SqlColumn<String> operateCph = column("operate_cph", JDBCType.VARCHAR);

        public final SqlColumn<Date> validend = column("validEnd", JDBCType.TIMESTAMP);

        public Log() {
            super("log");
        }
    }
}