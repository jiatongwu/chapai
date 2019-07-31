package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OptlogDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.156+08:00", comments="Source Table: OptLog")
    public static final Optlog optlog = new Optlog();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.156+08:00", comments="Source field: OptLog.OptCardNO")
    public static final SqlColumn<String> optcardno = optlog.optcardno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.156+08:00", comments="Source field: OptLog.UserName")
    public static final SqlColumn<String> username = optlog.username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.156+08:00", comments="Source field: OptLog.OptMenu")
    public static final SqlColumn<String> optmenu = optlog.optmenu;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.156+08:00", comments="Source field: OptLog.OptContent")
    public static final SqlColumn<String> optcontent = optlog.optcontent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.156+08:00", comments="Source field: OptLog.PCName")
    public static final SqlColumn<String> pcname = optlog.pcname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.156+08:00", comments="Source field: OptLog.OptTime")
    public static final SqlColumn<Date> opttime = optlog.opttime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.156+08:00", comments="Source Table: OptLog")
    public static final class Optlog extends SqlTable {
        public final SqlColumn<String> optcardno = column("OptCardNO", JDBCType.VARCHAR);

        public final SqlColumn<String> username = column("UserName", JDBCType.VARCHAR);

        public final SqlColumn<String> optmenu = column("OptMenu", JDBCType.VARCHAR);

        public final SqlColumn<String> optcontent = column("OptContent", JDBCType.VARCHAR);

        public final SqlColumn<String> pcname = column("PCName", JDBCType.VARCHAR);

        public final SqlColumn<Date> opttime = column("OptTime", JDBCType.TIMESTAMP);

        public Optlog() {
            super("OptLog");
        }
    }
}