package cn.xvkang.primarymapperdynamicsql;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MycarcanceltableDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.013+08:00", comments="Source Table: MYCarCancelTable")
    public static final Mycarcanceltable mycarcanceltable = new Mycarcanceltable();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.013+08:00", comments="Source field: MYCarCancelTable.UserNO")
    public static final SqlColumn<String> userno = mycarcanceltable.userno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.013+08:00", comments="Source field: MYCarCancelTable.CardNO")
    public static final SqlColumn<String> cardno = mycarcanceltable.cardno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.013+08:00", comments="Source field: MYCarCancelTable.UserName")
    public static final SqlColumn<String> username = mycarcanceltable.username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.013+08:00", comments="Source field: MYCarCancelTable.Sex")
    public static final SqlColumn<String> sex = mycarcanceltable.sex;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.013+08:00", comments="Source field: MYCarCancelTable.HomeAddress")
    public static final SqlColumn<String> homeaddress = mycarcanceltable.homeaddress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.013+08:00", comments="Source field: MYCarCancelTable.DeptName")
    public static final SqlColumn<String> deptname = mycarcanceltable.deptname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.013+08:00", comments="Source field: MYCarCancelTable.TelNumber")
    public static final SqlColumn<String> telnumber = mycarcanceltable.telnumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.013+08:00", comments="Source field: MYCarCancelTable.MobNumber")
    public static final SqlColumn<String> mobnumber = mycarcanceltable.mobnumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.013+08:00", comments="Source field: MYCarCancelTable.IssueUserCard")
    public static final SqlColumn<String> issueusercard = mycarcanceltable.issueusercard;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.013+08:00", comments="Source field: MYCarCancelTable.CPH")
    public static final SqlColumn<String> cph = mycarcanceltable.cph;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.014+08:00", comments="Source field: MYCarCancelTable.CarCardType")
    public static final SqlColumn<String> carcardtype = mycarcanceltable.carcardtype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.014+08:00", comments="Source field: MYCarCancelTable.CarIssueDate")
    public static final SqlColumn<String> carissuedate = mycarcanceltable.carissuedate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.014+08:00", comments="Source field: MYCarCancelTable.Balance")
    public static final SqlColumn<BigDecimal> balance = mycarcanceltable.balance;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.014+08:00", comments="Source field: MYCarCancelTable.CarValidStartDate")
    public static final SqlColumn<Date> carvalidstartdate = mycarcanceltable.carvalidstartdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.014+08:00", comments="Source field: MYCarCancelTable.CarValidEndDate")
    public static final SqlColumn<Date> carvalidenddate = mycarcanceltable.carvalidenddate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.014+08:00", comments="Source field: MYCarCancelTable.CancelCardNO")
    public static final SqlColumn<String> cancelcardno = mycarcanceltable.cancelcardno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.014+08:00", comments="Source field: MYCarCancelTable.CancelTime")
    public static final SqlColumn<Date> canceltime = mycarcanceltable.canceltime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.014+08:00", comments="Source field: MYCarCancelTable.CancelUserName")
    public static final SqlColumn<String> cancelusername = mycarcanceltable.cancelusername;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.013+08:00", comments="Source Table: MYCarCancelTable")
    public static final class Mycarcanceltable extends SqlTable {
        public final SqlColumn<String> userno = column("UserNO", JDBCType.VARCHAR);

        public final SqlColumn<String> cardno = column("CardNO", JDBCType.VARCHAR);

        public final SqlColumn<String> username = column("UserName", JDBCType.VARCHAR);

        public final SqlColumn<String> sex = column("Sex", JDBCType.VARCHAR);

        public final SqlColumn<String> homeaddress = column("HomeAddress", JDBCType.VARCHAR);

        public final SqlColumn<String> deptname = column("DeptName", JDBCType.VARCHAR);

        public final SqlColumn<String> telnumber = column("TelNumber", JDBCType.VARCHAR);

        public final SqlColumn<String> mobnumber = column("MobNumber", JDBCType.VARCHAR);

        public final SqlColumn<String> issueusercard = column("IssueUserCard", JDBCType.VARCHAR);

        public final SqlColumn<String> cph = column("CPH", JDBCType.VARCHAR);

        public final SqlColumn<String> carcardtype = column("CarCardType", JDBCType.VARCHAR);

        public final SqlColumn<String> carissuedate = column("CarIssueDate", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> balance = column("Balance", JDBCType.DECIMAL);

        public final SqlColumn<Date> carvalidstartdate = column("CarValidStartDate", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> carvalidenddate = column("CarValidEndDate", JDBCType.TIMESTAMP);

        public final SqlColumn<String> cancelcardno = column("CancelCardNO", JDBCType.VARCHAR);

        public final SqlColumn<Date> canceltime = column("CancelTime", JDBCType.TIMESTAMP);

        public final SqlColumn<String> cancelusername = column("CancelUserName", JDBCType.VARCHAR);

        public Mycarcanceltable() {
            super("MYCarCancelTable");
        }
    }
}