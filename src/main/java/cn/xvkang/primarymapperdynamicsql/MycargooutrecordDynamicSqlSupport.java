package cn.xvkang.primarymapperdynamicsql;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MycargooutrecordDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.184+08:00", comments="Source Table: MYCARGOOUTRECORD")
    public static final Mycargooutrecord mycargooutrecord = new Mycargooutrecord();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.184+08:00", comments="Source field: MYCARGOOUTRECORD.ID")
    public static final SqlColumn<Long> id = mycargooutrecord.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.184+08:00", comments="Source field: MYCARGOOUTRECORD.CardNO")
    public static final SqlColumn<String> cardno = mycargooutrecord.cardno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.185+08:00", comments="Source field: MYCARGOOUTRECORD.CPH")
    public static final SqlColumn<String> cph = mycargooutrecord.cph;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.185+08:00", comments="Source field: MYCARGOOUTRECORD.CardType")
    public static final SqlColumn<String> cardtype = mycargooutrecord.cardtype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.185+08:00", comments="Source field: MYCARGOOUTRECORD.InTime")
    public static final SqlColumn<Date> intime = mycargooutrecord.intime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.185+08:00", comments="Source field: MYCARGOOUTRECORD.OutTime")
    public static final SqlColumn<Date> outtime = mycargooutrecord.outtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.185+08:00", comments="Source field: MYCARGOOUTRECORD.InGateName")
    public static final SqlColumn<String> ingatename = mycargooutrecord.ingatename;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.185+08:00", comments="Source field: MYCARGOOUTRECORD.OutGateName")
    public static final SqlColumn<String> outgatename = mycargooutrecord.outgatename;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.185+08:00", comments="Source field: MYCARGOOUTRECORD.InOperatorCard")
    public static final SqlColumn<String> inoperatorcard = mycargooutrecord.inoperatorcard;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.185+08:00", comments="Source field: MYCARGOOUTRECORD.OutOperatorCard")
    public static final SqlColumn<String> outoperatorcard = mycargooutrecord.outoperatorcard;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.185+08:00", comments="Source field: MYCARGOOUTRECORD.InOperator")
    public static final SqlColumn<String> inoperator = mycargooutrecord.inoperator;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.185+08:00", comments="Source field: MYCARGOOUTRECORD.OutOperator")
    public static final SqlColumn<String> outoperator = mycargooutrecord.outoperator;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.185+08:00", comments="Source field: MYCARGOOUTRECORD.InPic")
    public static final SqlColumn<String> inpic = mycargooutrecord.inpic;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.185+08:00", comments="Source field: MYCARGOOUTRECORD.InUser")
    public static final SqlColumn<String> inuser = mycargooutrecord.inuser;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.185+08:00", comments="Source field: MYCARGOOUTRECORD.OutPic")
    public static final SqlColumn<String> outpic = mycargooutrecord.outpic;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.185+08:00", comments="Source field: MYCARGOOUTRECORD.OutUser")
    public static final SqlColumn<String> outuser = mycargooutrecord.outuser;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.185+08:00", comments="Source field: MYCARGOOUTRECORD.ZJPic")
    public static final SqlColumn<String> zjpic = mycargooutrecord.zjpic;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.185+08:00", comments="Source field: MYCARGOOUTRECORD.SFJE")
    public static final SqlColumn<BigDecimal> sfje = mycargooutrecord.sfje;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.185+08:00", comments="Source field: MYCARGOOUTRECORD.Balance")
    public static final SqlColumn<BigDecimal> balance = mycargooutrecord.balance;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.185+08:00", comments="Source field: MYCARGOOUTRECORD.YSJE")
    public static final SqlColumn<BigDecimal> ysje = mycargooutrecord.ysje;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.185+08:00", comments="Source field: MYCARGOOUTRECORD.SFTime")
    public static final SqlColumn<Date> sftime = mycargooutrecord.sftime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.186+08:00", comments="Source field: MYCARGOOUTRECORD.SFOperator")
    public static final SqlColumn<String> sfoperator = mycargooutrecord.sfoperator;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.186+08:00", comments="Source field: MYCARGOOUTRECORD.SFOperatorCard")
    public static final SqlColumn<String> sfoperatorcard = mycargooutrecord.sfoperatorcard;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.186+08:00", comments="Source field: MYCARGOOUTRECORD.SFGate")
    public static final SqlColumn<String> sfgate = mycargooutrecord.sfgate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.186+08:00", comments="Source field: MYCARGOOUTRECORD.OvertimeSymbol")
    public static final SqlColumn<String> overtimesymbol = mycargooutrecord.overtimesymbol;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.186+08:00", comments="Source field: MYCARGOOUTRECORD.OvertimeSFTime")
    public static final SqlColumn<Date> overtimesftime = mycargooutrecord.overtimesftime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.187+08:00", comments="Source field: MYCARGOOUTRECORD.OvertimeSFJE")
    public static final SqlColumn<BigDecimal> overtimesfje = mycargooutrecord.overtimesfje;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.187+08:00", comments="Source field: MYCARGOOUTRECORD.CarparkNO")
    public static final SqlColumn<Integer> carparkno = mycargooutrecord.carparkno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.187+08:00", comments="Source field: MYCARGOOUTRECORD.BigSmall")
    public static final SqlColumn<Integer> bigsmall = mycargooutrecord.bigsmall;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.187+08:00", comments="Source field: MYCARGOOUTRECORD.FreeReason")
    public static final SqlColumn<String> freereason = mycargooutrecord.freereason;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.187+08:00", comments="Source field: MYCARGOOUTRECORD.StayTime")
    public static final SqlColumn<String> staytime = mycargooutrecord.staytime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.187+08:00", comments="Source field: MYCARGOOUTRECORD.Temp1")
    public static final SqlColumn<String> temp1 = mycargooutrecord.temp1;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.187+08:00", comments="Source field: MYCARGOOUTRECORD.Temp2")
    public static final SqlColumn<String> temp2 = mycargooutrecord.temp2;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.188+08:00", comments="Source field: MYCARGOOUTRECORD.Temp3")
    public static final SqlColumn<String> temp3 = mycargooutrecord.temp3;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.188+08:00", comments="Source field: MYCARGOOUTRECORD.Temp4")
    public static final SqlColumn<String> temp4 = mycargooutrecord.temp4;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.188+08:00", comments="Source field: MYCARGOOUTRECORD.Temp5")
    public static final SqlColumn<String> temp5 = mycargooutrecord.temp5;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.188+08:00", comments="Source field: MYCARGOOUTRECORD.bMorePaingCar")
    public static final SqlColumn<Boolean> bmorepaingcar = mycargooutrecord.bmorepaingcar;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.188+08:00", comments="Source field: MYCARGOOUTRECORD.bDZ")
    public static final SqlColumn<Boolean> bdz = mycargooutrecord.bdz;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.188+08:00", comments="Source field: MYCARGOOUTRECORD.strDZ")
    public static final SqlColumn<String> strdz = mycargooutrecord.strdz;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.184+08:00", comments="Source Table: MYCARGOOUTRECORD")
    public static final class Mycargooutrecord extends SqlTable {
        public final SqlColumn<Long> id = column("ID", JDBCType.BIGINT);

        public final SqlColumn<String> cardno = column("CardNO", JDBCType.VARCHAR);

        public final SqlColumn<String> cph = column("CPH", JDBCType.VARCHAR);

        public final SqlColumn<String> cardtype = column("CardType", JDBCType.VARCHAR);

        public final SqlColumn<Date> intime = column("InTime", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> outtime = column("OutTime", JDBCType.TIMESTAMP);

        public final SqlColumn<String> ingatename = column("InGateName", JDBCType.VARCHAR);

        public final SqlColumn<String> outgatename = column("OutGateName", JDBCType.VARCHAR);

        public final SqlColumn<String> inoperatorcard = column("InOperatorCard", JDBCType.VARCHAR);

        public final SqlColumn<String> outoperatorcard = column("OutOperatorCard", JDBCType.VARCHAR);

        public final SqlColumn<String> inoperator = column("InOperator", JDBCType.VARCHAR);

        public final SqlColumn<String> outoperator = column("OutOperator", JDBCType.VARCHAR);

        public final SqlColumn<String> inpic = column("InPic", JDBCType.VARCHAR);

        public final SqlColumn<String> inuser = column("InUser", JDBCType.VARCHAR);

        public final SqlColumn<String> outpic = column("OutPic", JDBCType.VARCHAR);

        public final SqlColumn<String> outuser = column("OutUser", JDBCType.VARCHAR);

        public final SqlColumn<String> zjpic = column("ZJPic", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> sfje = column("SFJE", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> balance = column("Balance", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> ysje = column("YSJE", JDBCType.DECIMAL);

        public final SqlColumn<Date> sftime = column("SFTime", JDBCType.TIMESTAMP);

        public final SqlColumn<String> sfoperator = column("SFOperator", JDBCType.VARCHAR);

        public final SqlColumn<String> sfoperatorcard = column("SFOperatorCard", JDBCType.VARCHAR);

        public final SqlColumn<String> sfgate = column("SFGate", JDBCType.VARCHAR);

        public final SqlColumn<String> overtimesymbol = column("OvertimeSymbol", JDBCType.VARCHAR);

        public final SqlColumn<Date> overtimesftime = column("OvertimeSFTime", JDBCType.TIMESTAMP);

        public final SqlColumn<BigDecimal> overtimesfje = column("OvertimeSFJE", JDBCType.DECIMAL);

        public final SqlColumn<Integer> carparkno = column("CarparkNO", JDBCType.INTEGER);

        public final SqlColumn<Integer> bigsmall = column("BigSmall", JDBCType.INTEGER);

        public final SqlColumn<String> freereason = column("FreeReason", JDBCType.VARCHAR);

        public final SqlColumn<String> staytime = column("StayTime", JDBCType.VARCHAR);

        public final SqlColumn<String> temp1 = column("Temp1", JDBCType.VARCHAR);

        public final SqlColumn<String> temp2 = column("Temp2", JDBCType.VARCHAR);

        public final SqlColumn<String> temp3 = column("Temp3", JDBCType.VARCHAR);

        public final SqlColumn<String> temp4 = column("Temp4", JDBCType.VARCHAR);

        public final SqlColumn<String> temp5 = column("Temp5", JDBCType.VARCHAR);

        public final SqlColumn<Boolean> bmorepaingcar = column("bMorePaingCar", JDBCType.BIT);

        public final SqlColumn<Boolean> bdz = column("bDZ", JDBCType.BIT);

        public final SqlColumn<String> strdz = column("strDZ", JDBCType.VARCHAR);

        public Mycargooutrecord() {
            super("MYCARGOOUTRECORD");
        }
    }
}