package cn.xvkang.primarymapperdynamicsql;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MyrecordmemoryDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.310+08:00", comments="Source Table: MYRECORDMEMORY")
    public static final Myrecordmemory myrecordmemory = new Myrecordmemory();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.310+08:00", comments="Source field: MYRECORDMEMORY.ID")
    public static final SqlColumn<Long> id = myrecordmemory.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.310+08:00", comments="Source field: MYRECORDMEMORY.CardNO")
    public static final SqlColumn<String> cardno = myrecordmemory.cardno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.310+08:00", comments="Source field: MYRECORDMEMORY.CPH")
    public static final SqlColumn<String> cph = myrecordmemory.cph;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.310+08:00", comments="Source field: MYRECORDMEMORY.CardType")
    public static final SqlColumn<String> cardtype = myrecordmemory.cardtype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.310+08:00", comments="Source field: MYRECORDMEMORY.InTime")
    public static final SqlColumn<Date> intime = myrecordmemory.intime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.310+08:00", comments="Source field: MYRECORDMEMORY.OutTime")
    public static final SqlColumn<Date> outtime = myrecordmemory.outtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.310+08:00", comments="Source field: MYRECORDMEMORY.InGateName")
    public static final SqlColumn<String> ingatename = myrecordmemory.ingatename;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.311+08:00", comments="Source field: MYRECORDMEMORY.OutGateName")
    public static final SqlColumn<String> outgatename = myrecordmemory.outgatename;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.311+08:00", comments="Source field: MYRECORDMEMORY.InOperatorCard")
    public static final SqlColumn<String> inoperatorcard = myrecordmemory.inoperatorcard;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.311+08:00", comments="Source field: MYRECORDMEMORY.OutOperatorCard")
    public static final SqlColumn<String> outoperatorcard = myrecordmemory.outoperatorcard;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.311+08:00", comments="Source field: MYRECORDMEMORY.InOperator")
    public static final SqlColumn<String> inoperator = myrecordmemory.inoperator;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.311+08:00", comments="Source field: MYRECORDMEMORY.OutOperator")
    public static final SqlColumn<String> outoperator = myrecordmemory.outoperator;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.311+08:00", comments="Source field: MYRECORDMEMORY.InPic")
    public static final SqlColumn<String> inpic = myrecordmemory.inpic;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.311+08:00", comments="Source field: MYRECORDMEMORY.InUser")
    public static final SqlColumn<String> inuser = myrecordmemory.inuser;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.311+08:00", comments="Source field: MYRECORDMEMORY.OutPic")
    public static final SqlColumn<String> outpic = myrecordmemory.outpic;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.311+08:00", comments="Source field: MYRECORDMEMORY.OutUser")
    public static final SqlColumn<String> outuser = myrecordmemory.outuser;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.311+08:00", comments="Source field: MYRECORDMEMORY.ZJPic")
    public static final SqlColumn<String> zjpic = myrecordmemory.zjpic;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.311+08:00", comments="Source field: MYRECORDMEMORY.SFJE")
    public static final SqlColumn<BigDecimal> sfje = myrecordmemory.sfje;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.311+08:00", comments="Source field: MYRECORDMEMORY.Balance")
    public static final SqlColumn<BigDecimal> balance = myrecordmemory.balance;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.311+08:00", comments="Source field: MYRECORDMEMORY.YSJE")
    public static final SqlColumn<BigDecimal> ysje = myrecordmemory.ysje;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.311+08:00", comments="Source field: MYRECORDMEMORY.SFTime")
    public static final SqlColumn<Date> sftime = myrecordmemory.sftime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.311+08:00", comments="Source field: MYRECORDMEMORY.SFOperator")
    public static final SqlColumn<String> sfoperator = myrecordmemory.sfoperator;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.311+08:00", comments="Source field: MYRECORDMEMORY.SFOperatorCard")
    public static final SqlColumn<String> sfoperatorcard = myrecordmemory.sfoperatorcard;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.311+08:00", comments="Source field: MYRECORDMEMORY.SFGate")
    public static final SqlColumn<String> sfgate = myrecordmemory.sfgate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.311+08:00", comments="Source field: MYRECORDMEMORY.OvertimeSymbol")
    public static final SqlColumn<String> overtimesymbol = myrecordmemory.overtimesymbol;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.311+08:00", comments="Source field: MYRECORDMEMORY.OvertimeSFTime")
    public static final SqlColumn<Date> overtimesftime = myrecordmemory.overtimesftime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.311+08:00", comments="Source field: MYRECORDMEMORY.OvertimeSFJE")
    public static final SqlColumn<BigDecimal> overtimesfje = myrecordmemory.overtimesfje;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.311+08:00", comments="Source field: MYRECORDMEMORY.CarparkNO")
    public static final SqlColumn<Integer> carparkno = myrecordmemory.carparkno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.311+08:00", comments="Source field: MYRECORDMEMORY.BigSmall")
    public static final SqlColumn<Integer> bigsmall = myrecordmemory.bigsmall;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.311+08:00", comments="Source field: MYRECORDMEMORY.FreeReason")
    public static final SqlColumn<String> freereason = myrecordmemory.freereason;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.311+08:00", comments="Source field: MYRECORDMEMORY.StayTime")
    public static final SqlColumn<String> staytime = myrecordmemory.staytime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.311+08:00", comments="Source field: MYRECORDMEMORY.Temp1")
    public static final SqlColumn<String> temp1 = myrecordmemory.temp1;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.311+08:00", comments="Source field: MYRECORDMEMORY.Temp2")
    public static final SqlColumn<String> temp2 = myrecordmemory.temp2;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.311+08:00", comments="Source field: MYRECORDMEMORY.Temp3")
    public static final SqlColumn<String> temp3 = myrecordmemory.temp3;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.311+08:00", comments="Source field: MYRECORDMEMORY.Temp4")
    public static final SqlColumn<String> temp4 = myrecordmemory.temp4;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.311+08:00", comments="Source field: MYRECORDMEMORY.Temp5")
    public static final SqlColumn<String> temp5 = myrecordmemory.temp5;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.311+08:00", comments="Source field: MYRECORDMEMORY.bMorePaingCar")
    public static final SqlColumn<Boolean> bmorepaingcar = myrecordmemory.bmorepaingcar;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.311+08:00", comments="Source field: MYRECORDMEMORY.bDZ")
    public static final SqlColumn<Boolean> bdz = myrecordmemory.bdz;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.311+08:00", comments="Source field: MYRECORDMEMORY.strDZ")
    public static final SqlColumn<String> strdz = myrecordmemory.strdz;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.310+08:00", comments="Source Table: MYRECORDMEMORY")
    public static final class Myrecordmemory extends SqlTable {
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

        public Myrecordmemory() {
            super("MYRECORDMEMORY");
        }
    }
}