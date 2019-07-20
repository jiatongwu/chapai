package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MytempissueDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.337+08:00", comments="Source Table: MYTEMPISSUE")
    public static final Mytempissue mytempissue = new Mytempissue();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.337+08:00", comments="Source field: MYTEMPISSUE.CardNO")
    public static final SqlColumn<String> cardno = mytempissue.cardno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.338+08:00", comments="Source field: MYTEMPISSUE.TempID")
    public static final SqlColumn<String> tempid = mytempissue.tempid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.338+08:00", comments="Source field: MYTEMPISSUE.CardState")
    public static final SqlColumn<String> cardstate = mytempissue.cardstate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.338+08:00", comments="Source field: MYTEMPISSUE.IssueDate")
    public static final SqlColumn<Date> issuedate = mytempissue.issuedate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.338+08:00", comments="Source field: MYTEMPISSUE.IssueUserCard")
    public static final SqlColumn<String> issueusercard = mytempissue.issueusercard;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.337+08:00", comments="Source Table: MYTEMPISSUE")
    public static final class Mytempissue extends SqlTable {
        public final SqlColumn<String> cardno = column("CardNO", JDBCType.VARCHAR);

        public final SqlColumn<String> tempid = column("TempID", JDBCType.VARCHAR);

        public final SqlColumn<String> cardstate = column("CardState", JDBCType.CHAR);

        public final SqlColumn<Date> issuedate = column("IssueDate", JDBCType.TIMESTAMP);

        public final SqlColumn<String> issueusercard = column("IssueUserCard", JDBCType.VARCHAR);

        public Mytempissue() {
            super("MYTEMPISSUE");
        }
    }
}