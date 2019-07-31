package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MyparkingrecoverDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.119+08:00", comments="Source Table: MyParkingRecover")
    public static final Myparkingrecover myparkingrecover = new Myparkingrecover();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.119+08:00", comments="Source field: MyParkingRecover.CtrlNumber")
    public static final SqlColumn<Integer> ctrlnumber = myparkingrecover.ctrlnumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.119+08:00", comments="Source field: MyParkingRecover.Instruct")
    public static final SqlColumn<String> instruct = myparkingrecover.instruct;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.119+08:00", comments="Source field: MyParkingRecover.Flag")
    public static final SqlColumn<String> flag = myparkingrecover.flag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.119+08:00", comments="Source Table: MyParkingRecover")
    public static final class Myparkingrecover extends SqlTable {
        public final SqlColumn<Integer> ctrlnumber = column("CtrlNumber", JDBCType.INTEGER);

        public final SqlColumn<String> instruct = column("Instruct", JDBCType.VARCHAR);

        public final SqlColumn<String> flag = column("Flag", JDBCType.VARCHAR);

        public Myparkingrecover() {
            super("MyParkingRecover");
        }
    }
}