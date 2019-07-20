package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MyiclostDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.272+08:00", comments="Source Table: MYICLOST")
    public static final Myiclost myiclost = new Myiclost();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.272+08:00", comments="Source field: MYICLOST.CardNO")
    public static final SqlColumn<String> cardno = myiclost.cardno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.272+08:00", comments="Source field: MYICLOST.LossregDate")
    public static final SqlColumn<Date> lossregdate = myiclost.lossregdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.272+08:00", comments="Source field: MYICLOST.OperatorCardNO")
    public static final SqlColumn<String> operatorcardno = myiclost.operatorcardno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.272+08:00", comments="Source field: MYICLOST.CardState")
    public static final SqlColumn<String> cardstate = myiclost.cardstate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.272+08:00", comments="Source field: MYICLOST.CarLostOKID")
    public static final SqlColumn<String> carlostokid = myiclost.carlostokid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.272+08:00", comments="Source field: MYICLOST.CarLostOKNO")
    public static final SqlColumn<Boolean> carlostokno = myiclost.carlostokno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.272+08:00", comments="Source field: MYICLOST.CarUnLostOKNO")
    public static final SqlColumn<Boolean> carunlostokno = myiclost.carunlostokno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.272+08:00", comments="Source field: MYICLOST.MJLostOKID")
    public static final SqlColumn<String> mjlostokid = myiclost.mjlostokid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.272+08:00", comments="Source field: MYICLOST.MJLostOKNO")
    public static final SqlColumn<Boolean> mjlostokno = myiclost.mjlostokno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.272+08:00", comments="Source field: MYICLOST.MJUnLostOKNO")
    public static final SqlColumn<Boolean> mjunlostokno = myiclost.mjunlostokno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.272+08:00", comments="Source field: MYICLOST.CarOptCard")
    public static final SqlColumn<Boolean> caroptcard = myiclost.caroptcard;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.272+08:00", comments="Source Table: MYICLOST")
    public static final class Myiclost extends SqlTable {
        public final SqlColumn<String> cardno = column("CardNO", JDBCType.VARCHAR);

        public final SqlColumn<Date> lossregdate = column("LossregDate", JDBCType.TIMESTAMP);

        public final SqlColumn<String> operatorcardno = column("OperatorCardNO", JDBCType.VARCHAR);

        public final SqlColumn<String> cardstate = column("CardState", JDBCType.CHAR);

        public final SqlColumn<String> carlostokid = column("CarLostOKID", JDBCType.CHAR);

        public final SqlColumn<Boolean> carlostokno = column("CarLostOKNO", JDBCType.BIT);

        public final SqlColumn<Boolean> carunlostokno = column("CarUnLostOKNO", JDBCType.BIT);

        public final SqlColumn<String> mjlostokid = column("MJLostOKID", JDBCType.CHAR);

        public final SqlColumn<Boolean> mjlostokno = column("MJLostOKNO", JDBCType.BIT);

        public final SqlColumn<Boolean> mjunlostokno = column("MJUnLostOKNO", JDBCType.BIT);

        public final SqlColumn<Boolean> caroptcard = column("CarOptCard", JDBCType.BIT);

        public Myiclost() {
            super("MYICLOST");
        }
    }
}