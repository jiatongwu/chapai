package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MyscancodepayDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.440+08:00", comments="Source Table: MyScanCodePay")
    public static final Myscancodepay myscancodepay = new Myscancodepay();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.440+08:00", comments="Source field: MyScanCodePay.SMPayment")
    public static final SqlColumn<Boolean> smpayment = myscancodepay.smpayment;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.440+08:00", comments="Source field: MyScanCodePay.WXAppID")
    public static final SqlColumn<String> wxappid = myscancodepay.wxappid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.440+08:00", comments="Source field: MyScanCodePay.WXMCHID")
    public static final SqlColumn<String> wxmchid = myscancodepay.wxmchid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.440+08:00", comments="Source field: MyScanCodePay.WXKEY")
    public static final SqlColumn<String> wxkey = myscancodepay.wxkey;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.440+08:00", comments="Source field: MyScanCodePay.ZFBAppID")
    public static final SqlColumn<String> zfbappid = myscancodepay.zfbappid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.440+08:00", comments="Source field: MyScanCodePay.ZFBPID")
    public static final SqlColumn<String> zfbpid = myscancodepay.zfbpid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.441+08:00", comments="Source field: MyScanCodePay.StrTemp1")
    public static final SqlColumn<String> strtemp1 = myscancodepay.strtemp1;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.441+08:00", comments="Source field: MyScanCodePay.StrTemp2")
    public static final SqlColumn<String> strtemp2 = myscancodepay.strtemp2;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.441+08:00", comments="Source field: MyScanCodePay.StrTemp3")
    public static final SqlColumn<String> strtemp3 = myscancodepay.strtemp3;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.441+08:00", comments="Source field: MyScanCodePay.StrTemp4")
    public static final SqlColumn<String> strtemp4 = myscancodepay.strtemp4;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.441+08:00", comments="Source field: MyScanCodePay.StrTemp5")
    public static final SqlColumn<String> strtemp5 = myscancodepay.strtemp5;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.440+08:00", comments="Source Table: MyScanCodePay")
    public static final class Myscancodepay extends SqlTable {
        public final SqlColumn<Boolean> smpayment = column("SMPayment", JDBCType.BIT);

        public final SqlColumn<String> wxappid = column("WXAppID", JDBCType.VARCHAR);

        public final SqlColumn<String> wxmchid = column("WXMCHID", JDBCType.VARCHAR);

        public final SqlColumn<String> wxkey = column("WXKEY", JDBCType.VARCHAR);

        public final SqlColumn<String> zfbappid = column("ZFBAppID", JDBCType.VARCHAR);

        public final SqlColumn<String> zfbpid = column("ZFBPID", JDBCType.VARCHAR);

        public final SqlColumn<String> strtemp1 = column("StrTemp1", JDBCType.VARCHAR);

        public final SqlColumn<String> strtemp2 = column("StrTemp2", JDBCType.VARCHAR);

        public final SqlColumn<String> strtemp3 = column("StrTemp3", JDBCType.VARCHAR);

        public final SqlColumn<String> strtemp4 = column("StrTemp4", JDBCType.VARCHAR);

        public final SqlColumn<String> strtemp5 = column("StrTemp5", JDBCType.VARCHAR);

        public Myscancodepay() {
            super("MyScanCodePay");
        }
    }
}