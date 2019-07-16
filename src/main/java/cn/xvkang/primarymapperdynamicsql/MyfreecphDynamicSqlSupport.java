package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MyfreecphDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.871+08:00", comments="Source Table: MyFreeCPH")
    public static final Myfreecph myfreecph = new Myfreecph();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.871+08:00", comments="Source field: MyFreeCPH.ID")
    public static final SqlColumn<Long> id = myfreecph.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.871+08:00", comments="Source field: MyFreeCPH.CPH")
    public static final SqlColumn<String> cph = myfreecph.cph;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.871+08:00", comments="Source field: MyFreeCPH.FreeStartTime")
    public static final SqlColumn<Date> freestarttime = myfreecph.freestarttime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.871+08:00", comments="Source field: MyFreeCPH.Sign")
    public static final SqlColumn<Short> sign = myfreecph.sign;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.871+08:00", comments="Source field: MyFreeCPH.Remarks")
    public static final SqlColumn<String> remarks = myfreecph.remarks;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.871+08:00", comments="Source field: MyFreeCPH.FreeEndTime")
    public static final SqlColumn<Date> freeendtime = myfreecph.freeendtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.871+08:00", comments="Source field: MyFreeCPH.AddTime")
    public static final SqlColumn<Date> addtime = myfreecph.addtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.871+08:00", comments="Source field: MyFreeCPH.Operator")
    public static final SqlColumn<String> operator = myfreecph.operator;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.871+08:00", comments="Source field: MyFreeCPH.PCName")
    public static final SqlColumn<String> pcname = myfreecph.pcname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.871+08:00", comments="Source Table: MyFreeCPH")
    public static final class Myfreecph extends SqlTable {
        public final SqlColumn<Long> id = column("ID", JDBCType.BIGINT);

        public final SqlColumn<String> cph = column("CPH", JDBCType.VARCHAR);

        public final SqlColumn<Date> freestarttime = column("FreeStartTime", JDBCType.TIMESTAMP);

        public final SqlColumn<Short> sign = column("Sign", JDBCType.SMALLINT);

        public final SqlColumn<String> remarks = column("Remarks", JDBCType.VARCHAR);

        public final SqlColumn<Date> freeendtime = column("FreeEndTime", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> addtime = column("AddTime", JDBCType.TIMESTAMP);

        public final SqlColumn<String> operator = column("Operator", JDBCType.VARCHAR);

        public final SqlColumn<String> pcname = column("PCName", JDBCType.VARCHAR);

        public Myfreecph() {
            super("MyFreeCPH");
        }
    }
}