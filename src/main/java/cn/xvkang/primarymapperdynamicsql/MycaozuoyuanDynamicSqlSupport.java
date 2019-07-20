package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MycaozuoyuanDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.165+08:00", comments="Source Table: MYCAOZUOYUAN")
    public static final Mycaozuoyuan mycaozuoyuan = new Mycaozuoyuan();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.165+08:00", comments="Source field: MYCAOZUOYUAN.CardNO")
    public static final SqlColumn<String> cardno = mycaozuoyuan.cardno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.165+08:00", comments="Source field: MYCAOZUOYUAN.ID")
    public static final SqlColumn<Integer> id = mycaozuoyuan.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.165+08:00", comments="Source field: MYCAOZUOYUAN.CardType")
    public static final SqlColumn<String> cardtype = mycaozuoyuan.cardtype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.165+08:00", comments="Source field: MYCAOZUOYUAN.UserNO")
    public static final SqlColumn<String> userno = mycaozuoyuan.userno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.166+08:00", comments="Source field: MYCAOZUOYUAN.UserName")
    public static final SqlColumn<String> username = mycaozuoyuan.username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.166+08:00", comments="Source field: MYCAOZUOYUAN.DeptName")
    public static final SqlColumn<String> deptname = mycaozuoyuan.deptname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.166+08:00", comments="Source field: MYCAOZUOYUAN.Pwd")
    public static final SqlColumn<String> pwd = mycaozuoyuan.pwd;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.166+08:00", comments="Source field: MYCAOZUOYUAN.CardState")
    public static final SqlColumn<Integer> cardstate = mycaozuoyuan.cardstate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.166+08:00", comments="Source field: MYCAOZUOYUAN.UserLevel")
    public static final SqlColumn<Integer> userlevel = mycaozuoyuan.userlevel;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.165+08:00", comments="Source Table: MYCAOZUOYUAN")
    public static final class Mycaozuoyuan extends SqlTable {
        public final SqlColumn<String> cardno = column("CardNO", JDBCType.VARCHAR);

        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<String> cardtype = column("CardType", JDBCType.VARCHAR);

        public final SqlColumn<String> userno = column("UserNO", JDBCType.VARCHAR);

        public final SqlColumn<String> username = column("UserName", JDBCType.VARCHAR);

        public final SqlColumn<String> deptname = column("DeptName", JDBCType.VARCHAR);

        public final SqlColumn<String> pwd = column("Pwd", JDBCType.VARCHAR);

        public final SqlColumn<Integer> cardstate = column("CardState", JDBCType.INTEGER);

        public final SqlColumn<Integer> userlevel = column("UserLevel", JDBCType.INTEGER);

        public Mycaozuoyuan() {
            super("MYCAOZUOYUAN");
        }
    }
}