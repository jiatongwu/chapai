package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SendSmsLogDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.233+08:00", comments="Source Table: send_sms_log")
    public static final SendSmsLog sendSmsLog = new SendSmsLog();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.233+08:00", comments="Source field: send_sms_log.id")
    public static final SqlColumn<Integer> id = sendSmsLog.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.233+08:00", comments="Source field: send_sms_log.user_id")
    public static final SqlColumn<Integer> userId = sendSmsLog.userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.233+08:00", comments="Source field: send_sms_log.createtime")
    public static final SqlColumn<Date> createtime = sendSmsLog.createtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.233+08:00", comments="Source field: send_sms_log.cph")
    public static final SqlColumn<String> cph = sendSmsLog.cph;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.233+08:00", comments="Source field: send_sms_log.phone")
    public static final SqlColumn<String> phone = sendSmsLog.phone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.233+08:00", comments="Source field: send_sms_log.sms_message")
    public static final SqlColumn<String> smsMessage = sendSmsLog.smsMessage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.233+08:00", comments="Source Table: send_sms_log")
    public static final class SendSmsLog extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> userId = column("user_id", JDBCType.INTEGER);

        public final SqlColumn<Date> createtime = column("createtime", JDBCType.TIMESTAMP);

        public final SqlColumn<String> cph = column("cph", JDBCType.VARCHAR);

        public final SqlColumn<String> phone = column("phone", JDBCType.VARCHAR);

        public final SqlColumn<String> smsMessage = column("sms_message", JDBCType.VARCHAR);

        public SendSmsLog() {
            super("send_sms_log");
        }
    }
}