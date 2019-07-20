package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class WeiguijiluDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.557+08:00", comments="Source Table: weiguijilu")
    public static final Weiguijilu weiguijilu = new Weiguijilu();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.557+08:00", comments="Source field: weiguijilu.id")
    public static final SqlColumn<Integer> id = weiguijilu.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.557+08:00", comments="Source field: weiguijilu.user_id")
    public static final SqlColumn<Integer> userId = weiguijilu.userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.557+08:00", comments="Source field: weiguijilu.remark")
    public static final SqlColumn<String> remark = weiguijilu.remark;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.557+08:00", comments="Source field: weiguijilu.cph")
    public static final SqlColumn<String> cph = weiguijilu.cph;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.557+08:00", comments="Source field: weiguijilu.createtime")
    public static final SqlColumn<Date> createtime = weiguijilu.createtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.557+08:00", comments="Source field: weiguijilu.base64image")
    public static final SqlColumn<String> base64image = weiguijilu.base64image;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.557+08:00", comments="Source Table: weiguijilu")
    public static final class Weiguijilu extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> userId = column("user_id", JDBCType.INTEGER);

        public final SqlColumn<String> remark = column("remark", JDBCType.VARCHAR);

        public final SqlColumn<String> cph = column("cph", JDBCType.VARCHAR);

        public final SqlColumn<Date> createtime = column("createtime", JDBCType.TIMESTAMP);

        public final SqlColumn<String> base64image = column("base64image", JDBCType.CLOB);

        public Weiguijilu() {
            super("weiguijilu");
        }
    }
}