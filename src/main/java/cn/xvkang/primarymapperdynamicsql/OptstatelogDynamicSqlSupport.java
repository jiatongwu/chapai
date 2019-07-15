package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OptstatelogDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.898+08:00", comments="Source Table: OptStateLog")
    public static final Optstatelog optstatelog = new Optstatelog();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.898+08:00", comments="Source field: OptStateLog.OptCardNO")
    public static final SqlColumn<String> optcardno = optstatelog.optcardno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.898+08:00", comments="Source field: OptStateLog.UserName")
    public static final SqlColumn<String> username = optstatelog.username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.898+08:00", comments="Source field: OptStateLog.OptMenu")
    public static final SqlColumn<String> optmenu = optstatelog.optmenu;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.898+08:00", comments="Source field: OptStateLog.OptContent")
    public static final SqlColumn<String> optcontent = optstatelog.optcontent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.898+08:00", comments="Source field: OptStateLog.PCName")
    public static final SqlColumn<String> pcname = optstatelog.pcname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.898+08:00", comments="Source field: OptStateLog.OptTime")
    public static final SqlColumn<Date> opttime = optstatelog.opttime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.898+08:00", comments="Source Table: OptStateLog")
    public static final class Optstatelog extends SqlTable {
        public final SqlColumn<String> optcardno = column("OptCardNO", JDBCType.VARCHAR);

        public final SqlColumn<String> username = column("UserName", JDBCType.VARCHAR);

        public final SqlColumn<String> optmenu = column("OptMenu", JDBCType.VARCHAR);

        public final SqlColumn<String> optcontent = column("OptContent", JDBCType.VARCHAR);

        public final SqlColumn<String> pcname = column("PCName", JDBCType.VARCHAR);

        public final SqlColumn<Date> opttime = column("OptTime", JDBCType.TIMESTAMP);

        public Optstatelog() {
            super("OptStateLog");
        }
    }
}