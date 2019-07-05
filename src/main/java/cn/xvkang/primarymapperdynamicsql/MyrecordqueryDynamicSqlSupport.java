package cn.xvkang.primarymapperdynamicsql;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MyrecordqueryDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.632+08:00", comments="Source Table: MYRECORDQUERY")
    public static final Myrecordquery myrecordquery = new Myrecordquery();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.632+08:00", comments="Source field: MYRECORDQUERY.ID")
    public static final SqlColumn<Long> id = myrecordquery.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.632+08:00", comments="Source field: MYRECORDQUERY.CardNO")
    public static final SqlColumn<String> cardno = myrecordquery.cardno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.632+08:00", comments="Source field: MYRECORDQUERY.CPH")
    public static final SqlColumn<String> cph = myrecordquery.cph;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.632+08:00", comments="Source field: MYRECORDQUERY.CardType")
    public static final SqlColumn<String> cardtype = myrecordquery.cardtype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.632+08:00", comments="Source field: MYRECORDQUERY.InTime")
    public static final SqlColumn<Date> intime = myrecordquery.intime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.632+08:00", comments="Source field: MYRECORDQUERY.OutTime")
    public static final SqlColumn<Date> outtime = myrecordquery.outtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.632+08:00", comments="Source field: MYRECORDQUERY.InGateName")
    public static final SqlColumn<String> ingatename = myrecordquery.ingatename;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.632+08:00", comments="Source field: MYRECORDQUERY.OutGateName")
    public static final SqlColumn<String> outgatename = myrecordquery.outgatename;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.633+08:00", comments="Source field: MYRECORDQUERY.InOperatorCard")
    public static final SqlColumn<String> inoperatorcard = myrecordquery.inoperatorcard;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.633+08:00", comments="Source field: MYRECORDQUERY.OutOperatorCard")
    public static final SqlColumn<String> outoperatorcard = myrecordquery.outoperatorcard;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.634+08:00", comments="Source field: MYRECORDQUERY.InOperator")
    public static final SqlColumn<String> inoperator = myrecordquery.inoperator;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.634+08:00", comments="Source field: MYRECORDQUERY.OutOperator")
    public static final SqlColumn<String> outoperator = myrecordquery.outoperator;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.634+08:00", comments="Source field: MYRECORDQUERY.InPic")
    public static final SqlColumn<String> inpic = myrecordquery.inpic;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.634+08:00", comments="Source field: MYRECORDQUERY.InUser")
    public static final SqlColumn<String> inuser = myrecordquery.inuser;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.634+08:00", comments="Source field: MYRECORDQUERY.OutPic")
    public static final SqlColumn<String> outpic = myrecordquery.outpic;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.634+08:00", comments="Source field: MYRECORDQUERY.OutUser")
    public static final SqlColumn<String> outuser = myrecordquery.outuser;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.634+08:00", comments="Source field: MYRECORDQUERY.ZJPic")
    public static final SqlColumn<String> zjpic = myrecordquery.zjpic;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.634+08:00", comments="Source field: MYRECORDQUERY.SFJE")
    public static final SqlColumn<BigDecimal> sfje = myrecordquery.sfje;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.634+08:00", comments="Source field: MYRECORDQUERY.Balance")
    public static final SqlColumn<BigDecimal> balance = myrecordquery.balance;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.634+08:00", comments="Source field: MYRECORDQUERY.YSJE")
    public static final SqlColumn<BigDecimal> ysje = myrecordquery.ysje;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.634+08:00", comments="Source field: MYRECORDQUERY.SFTime")
    public static final SqlColumn<Date> sftime = myrecordquery.sftime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.634+08:00", comments="Source field: MYRECORDQUERY.SFOperator")
    public static final SqlColumn<String> sfoperator = myrecordquery.sfoperator;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.634+08:00", comments="Source field: MYRECORDQUERY.SFOperatorCard")
    public static final SqlColumn<String> sfoperatorcard = myrecordquery.sfoperatorcard;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.634+08:00", comments="Source field: MYRECORDQUERY.SFGate")
    public static final SqlColumn<String> sfgate = myrecordquery.sfgate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.634+08:00", comments="Source field: MYRECORDQUERY.OvertimeSymbol")
    public static final SqlColumn<String> overtimesymbol = myrecordquery.overtimesymbol;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.634+08:00", comments="Source field: MYRECORDQUERY.OvertimeSFTime")
    public static final SqlColumn<Date> overtimesftime = myrecordquery.overtimesftime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.634+08:00", comments="Source field: MYRECORDQUERY.OvertimeSFJE")
    public static final SqlColumn<BigDecimal> overtimesfje = myrecordquery.overtimesfje;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.634+08:00", comments="Source field: MYRECORDQUERY.CarparkNO")
    public static final SqlColumn<Integer> carparkno = myrecordquery.carparkno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.634+08:00", comments="Source field: MYRECORDQUERY.BigSmall")
    public static final SqlColumn<Integer> bigsmall = myrecordquery.bigsmall;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.634+08:00", comments="Source field: MYRECORDQUERY.FreeReason")
    public static final SqlColumn<String> freereason = myrecordquery.freereason;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.634+08:00", comments="Source field: MYRECORDQUERY.StayTime")
    public static final SqlColumn<String> staytime = myrecordquery.staytime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.634+08:00", comments="Source field: MYRECORDQUERY.Temp1")
    public static final SqlColumn<String> temp1 = myrecordquery.temp1;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.634+08:00", comments="Source field: MYRECORDQUERY.Temp2")
    public static final SqlColumn<String> temp2 = myrecordquery.temp2;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.634+08:00", comments="Source field: MYRECORDQUERY.Temp3")
    public static final SqlColumn<String> temp3 = myrecordquery.temp3;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.634+08:00", comments="Source field: MYRECORDQUERY.Temp4")
    public static final SqlColumn<String> temp4 = myrecordquery.temp4;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.634+08:00", comments="Source field: MYRECORDQUERY.Temp5")
    public static final SqlColumn<String> temp5 = myrecordquery.temp5;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.634+08:00", comments="Source field: MYRECORDQUERY.bMorePaingCar")
    public static final SqlColumn<Boolean> bmorepaingcar = myrecordquery.bmorepaingcar;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.635+08:00", comments="Source field: MYRECORDQUERY.bDZ")
    public static final SqlColumn<Boolean> bdz = myrecordquery.bdz;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.636+08:00", comments="Source field: MYRECORDQUERY.strDZ")
    public static final SqlColumn<String> strdz = myrecordquery.strdz;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.632+08:00", comments="Source Table: MYRECORDQUERY")
    public static final class Myrecordquery extends SqlTable {
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

        public Myrecordquery() {
            super("MYRECORDQUERY");
        }
    }
}