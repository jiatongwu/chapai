package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SmsTemplateDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.232+08:00", comments="Source Table: sms_template")
    public static final SmsTemplate smsTemplate = new SmsTemplate();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.232+08:00", comments="Source field: sms_template.id")
    public static final SqlColumn<Integer> id = smsTemplate.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.232+08:00", comments="Source field: sms_template.name")
    public static final SqlColumn<String> name = smsTemplate.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.232+08:00", comments="Source field: sms_template.content")
    public static final SqlColumn<String> content = smsTemplate.content;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.232+08:00", comments="Source field: sms_template.createtime")
    public static final SqlColumn<Date> createtime = smsTemplate.createtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.232+08:00", comments="Source Table: sms_template")
    public static final class SmsTemplate extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> content = column("content", JDBCType.VARCHAR);

        public final SqlColumn<Date> createtime = column("createtime", JDBCType.TIMESTAMP);

        public SmsTemplate() {
            super("sms_template");
        }
    }
}