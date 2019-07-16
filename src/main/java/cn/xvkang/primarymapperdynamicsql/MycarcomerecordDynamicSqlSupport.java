package cn.xvkang.primarymapperdynamicsql;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MycarcomerecordDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.652+08:00", comments="Source Table: MYCARCOMERECORD")
    public static final Mycarcomerecord mycarcomerecord = new Mycarcomerecord();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.652+08:00", comments="Source field: MYCARCOMERECORD.ID")
    public static final SqlColumn<Long> id = mycarcomerecord.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.652+08:00", comments="Source field: MYCARCOMERECORD.CardNO")
    public static final SqlColumn<String> cardno = mycarcomerecord.cardno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.653+08:00", comments="Source field: MYCARCOMERECORD.CPH")
    public static final SqlColumn<String> cph = mycarcomerecord.cph;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.653+08:00", comments="Source field: MYCARCOMERECORD.CardType")
    public static final SqlColumn<String> cardtype = mycarcomerecord.cardtype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.653+08:00", comments="Source field: MYCARCOMERECORD.InTime")
    public static final SqlColumn<Date> intime = mycarcomerecord.intime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.653+08:00", comments="Source field: MYCARCOMERECORD.OutTime")
    public static final SqlColumn<Date> outtime = mycarcomerecord.outtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.653+08:00", comments="Source field: MYCARCOMERECORD.InGateName")
    public static final SqlColumn<String> ingatename = mycarcomerecord.ingatename;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.653+08:00", comments="Source field: MYCARCOMERECORD.OutGateName")
    public static final SqlColumn<String> outgatename = mycarcomerecord.outgatename;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.653+08:00", comments="Source field: MYCARCOMERECORD.InOperatorCard")
    public static final SqlColumn<String> inoperatorcard = mycarcomerecord.inoperatorcard;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.653+08:00", comments="Source field: MYCARCOMERECORD.OutOperatorCard")
    public static final SqlColumn<String> outoperatorcard = mycarcomerecord.outoperatorcard;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.653+08:00", comments="Source field: MYCARCOMERECORD.InOperator")
    public static final SqlColumn<String> inoperator = mycarcomerecord.inoperator;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.653+08:00", comments="Source field: MYCARCOMERECORD.OutOperator")
    public static final SqlColumn<String> outoperator = mycarcomerecord.outoperator;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.653+08:00", comments="Source field: MYCARCOMERECORD.InPic")
    public static final SqlColumn<String> inpic = mycarcomerecord.inpic;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.653+08:00", comments="Source field: MYCARCOMERECORD.InUser")
    public static final SqlColumn<String> inuser = mycarcomerecord.inuser;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.653+08:00", comments="Source field: MYCARCOMERECORD.OutPic")
    public static final SqlColumn<String> outpic = mycarcomerecord.outpic;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.653+08:00", comments="Source field: MYCARCOMERECORD.OutUser")
    public static final SqlColumn<String> outuser = mycarcomerecord.outuser;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.654+08:00", comments="Source field: MYCARCOMERECORD.ZJPic")
    public static final SqlColumn<String> zjpic = mycarcomerecord.zjpic;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.654+08:00", comments="Source field: MYCARCOMERECORD.SFJE")
    public static final SqlColumn<BigDecimal> sfje = mycarcomerecord.sfje;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.654+08:00", comments="Source field: MYCARCOMERECORD.Balance")
    public static final SqlColumn<BigDecimal> balance = mycarcomerecord.balance;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.654+08:00", comments="Source field: MYCARCOMERECORD.YSJE")
    public static final SqlColumn<BigDecimal> ysje = mycarcomerecord.ysje;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.654+08:00", comments="Source field: MYCARCOMERECORD.SFTime")
    public static final SqlColumn<Date> sftime = mycarcomerecord.sftime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.654+08:00", comments="Source field: MYCARCOMERECORD.SFOperator")
    public static final SqlColumn<String> sfoperator = mycarcomerecord.sfoperator;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.654+08:00", comments="Source field: MYCARCOMERECORD.SFOperatorCard")
    public static final SqlColumn<String> sfoperatorcard = mycarcomerecord.sfoperatorcard;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.654+08:00", comments="Source field: MYCARCOMERECORD.SFGate")
    public static final SqlColumn<String> sfgate = mycarcomerecord.sfgate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.654+08:00", comments="Source field: MYCARCOMERECORD.OvertimeSymbol")
    public static final SqlColumn<String> overtimesymbol = mycarcomerecord.overtimesymbol;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.654+08:00", comments="Source field: MYCARCOMERECORD.OvertimeSFTime")
    public static final SqlColumn<Date> overtimesftime = mycarcomerecord.overtimesftime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.654+08:00", comments="Source field: MYCARCOMERECORD.OvertimeSFJE")
    public static final SqlColumn<BigDecimal> overtimesfje = mycarcomerecord.overtimesfje;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.655+08:00", comments="Source field: MYCARCOMERECORD.CarparkNO")
    public static final SqlColumn<Integer> carparkno = mycarcomerecord.carparkno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.655+08:00", comments="Source field: MYCARCOMERECORD.BigSmall")
    public static final SqlColumn<Integer> bigsmall = mycarcomerecord.bigsmall;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.655+08:00", comments="Source field: MYCARCOMERECORD.FreeReason")
    public static final SqlColumn<String> freereason = mycarcomerecord.freereason;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.655+08:00", comments="Source field: MYCARCOMERECORD.StayTime")
    public static final SqlColumn<String> staytime = mycarcomerecord.staytime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.655+08:00", comments="Source field: MYCARCOMERECORD.Temp1")
    public static final SqlColumn<String> temp1 = mycarcomerecord.temp1;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.655+08:00", comments="Source field: MYCARCOMERECORD.Temp2")
    public static final SqlColumn<String> temp2 = mycarcomerecord.temp2;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.655+08:00", comments="Source field: MYCARCOMERECORD.Temp3")
    public static final SqlColumn<String> temp3 = mycarcomerecord.temp3;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.655+08:00", comments="Source field: MYCARCOMERECORD.Temp4")
    public static final SqlColumn<String> temp4 = mycarcomerecord.temp4;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.655+08:00", comments="Source field: MYCARCOMERECORD.Temp5")
    public static final SqlColumn<String> temp5 = mycarcomerecord.temp5;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.655+08:00", comments="Source field: MYCARCOMERECORD.bMorePaingCar")
    public static final SqlColumn<Boolean> bmorepaingcar = mycarcomerecord.bmorepaingcar;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.655+08:00", comments="Source field: MYCARCOMERECORD.bDZ")
    public static final SqlColumn<Boolean> bdz = mycarcomerecord.bdz;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.655+08:00", comments="Source field: MYCARCOMERECORD.strDZ")
    public static final SqlColumn<String> strdz = mycarcomerecord.strdz;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.652+08:00", comments="Source Table: MYCARCOMERECORD")
    public static final class Mycarcomerecord extends SqlTable {
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

        public Mycarcomerecord() {
            super("MYCARCOMERECORD");
        }
    }
}