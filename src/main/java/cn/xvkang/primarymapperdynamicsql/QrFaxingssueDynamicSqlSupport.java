package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class QrFaxingssueDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.899+08:00", comments="Source Table: Qr_FaxingSsue")
    public static final QrFaxingssue qrFaxingssue = new QrFaxingssue();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.899+08:00", comments="Source field: Qr_FaxingSsue.Id")
    public static final SqlColumn<Integer> id = qrFaxingssue.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.899+08:00", comments="Source field: Qr_FaxingSsue.Cardno")
    public static final SqlColumn<String> cardno = qrFaxingssue.cardno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.899+08:00", comments="Source field: Qr_FaxingSsue.Userno")
    public static final SqlColumn<String> userno = qrFaxingssue.userno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.899+08:00", comments="Source field: Qr_FaxingSsue.Cardstuat")
    public static final SqlColumn<String> cardstuat = qrFaxingssue.cardstuat;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.899+08:00", comments="Source field: Qr_FaxingSsue.Cardtype")
    public static final SqlColumn<String> cardtype = qrFaxingssue.cardtype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.899+08:00", comments="Source field: Qr_FaxingSsue.Pasword")
    public static final SqlColumn<String> pasword = qrFaxingssue.pasword;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.899+08:00", comments="Source field: Qr_FaxingSsue.EndTime")
    public static final SqlColumn<String> endtime = qrFaxingssue.endtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.899+08:00", comments="Source field: Qr_FaxingSsue.StarHour")
    public static final SqlColumn<String> starhour = qrFaxingssue.starhour;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.899+08:00", comments="Source field: Qr_FaxingSsue.EndHour")
    public static final SqlColumn<String> endhour = qrFaxingssue.endhour;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.899+08:00", comments="Source field: Qr_FaxingSsue.CardExitflag")
    public static final SqlColumn<String> cardexitflag = qrFaxingssue.cardexitflag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.899+08:00", comments="Source field: Qr_FaxingSsue.Mark")
    public static final SqlColumn<String> mark = qrFaxingssue.mark;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.899+08:00", comments="Source field: Qr_FaxingSsue.DevcInfo")
    public static final SqlColumn<String> devcinfo = qrFaxingssue.devcinfo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.899+08:00", comments="Source field: Qr_FaxingSsue.IssDate")
    public static final SqlColumn<String> issdate = qrFaxingssue.issdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.899+08:00", comments="Source Table: Qr_FaxingSsue")
    public static final class QrFaxingssue extends SqlTable {
        public final SqlColumn<Integer> id = column("Id", JDBCType.INTEGER);

        public final SqlColumn<String> cardno = column("Cardno", JDBCType.VARCHAR);

        public final SqlColumn<String> userno = column("Userno", JDBCType.VARCHAR);

        public final SqlColumn<String> cardstuat = column("Cardstuat", JDBCType.VARCHAR);

        public final SqlColumn<String> cardtype = column("Cardtype", JDBCType.VARCHAR);

        public final SqlColumn<String> pasword = column("Pasword", JDBCType.VARCHAR);

        public final SqlColumn<String> endtime = column("EndTime", JDBCType.VARCHAR);

        public final SqlColumn<String> starhour = column("StarHour", JDBCType.VARCHAR);

        public final SqlColumn<String> endhour = column("EndHour", JDBCType.VARCHAR);

        public final SqlColumn<String> cardexitflag = column("CardExitflag", JDBCType.VARCHAR);

        public final SqlColumn<String> mark = column("Mark", JDBCType.VARCHAR);

        public final SqlColumn<String> devcinfo = column("DevcInfo", JDBCType.VARCHAR);

        public final SqlColumn<String> issdate = column("IssDate", JDBCType.VARCHAR);

        public QrFaxingssue() {
            super("Qr_FaxingSsue");
        }
    }
}