package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SerTimingopenDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.195+08:00", comments="Source Table: Ser_TimingOpen")
    public static final SerTimingopen serTimingopen = new SerTimingopen();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.195+08:00", comments="Source field: Ser_TimingOpen.id")
    public static final SqlColumn<Integer> id = serTimingopen.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.195+08:00", comments="Source field: Ser_TimingOpen.DevcNum")
    public static final SqlColumn<Integer> devcnum = serTimingopen.devcnum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.195+08:00", comments="Source field: Ser_TimingOpen.DoorId")
    public static final SqlColumn<Integer> doorid = serTimingopen.doorid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.195+08:00", comments="Source field: Ser_TimingOpen.NoMalSet")
    public static final SqlColumn<Integer> nomalset = serTimingopen.nomalset;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.195+08:00", comments="Source field: Ser_TimingOpen.Week")
    public static final SqlColumn<Integer> week = serTimingopen.week;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.195+08:00", comments="Source field: Ser_TimingOpen.star1")
    public static final SqlColumn<String> star1 = serTimingopen.star1;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.195+08:00", comments="Source field: Ser_TimingOpen.end1")
    public static final SqlColumn<String> end1 = serTimingopen.end1;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.195+08:00", comments="Source field: Ser_TimingOpen.star2")
    public static final SqlColumn<String> star2 = serTimingopen.star2;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.195+08:00", comments="Source field: Ser_TimingOpen.end2")
    public static final SqlColumn<String> end2 = serTimingopen.end2;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.195+08:00", comments="Source field: Ser_TimingOpen.star3")
    public static final SqlColumn<String> star3 = serTimingopen.star3;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.195+08:00", comments="Source field: Ser_TimingOpen.end3")
    public static final SqlColumn<String> end3 = serTimingopen.end3;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.195+08:00", comments="Source field: Ser_TimingOpen.star4")
    public static final SqlColumn<String> star4 = serTimingopen.star4;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.195+08:00", comments="Source field: Ser_TimingOpen.end4")
    public static final SqlColumn<String> end4 = serTimingopen.end4;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.195+08:00", comments="Source Table: Ser_TimingOpen")
    public static final class SerTimingopen extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> devcnum = column("DevcNum", JDBCType.INTEGER);

        public final SqlColumn<Integer> doorid = column("DoorId", JDBCType.INTEGER);

        public final SqlColumn<Integer> nomalset = column("NoMalSet", JDBCType.INTEGER);

        public final SqlColumn<Integer> week = column("Week", JDBCType.INTEGER);

        public final SqlColumn<String> star1 = column("star1", JDBCType.VARCHAR);

        public final SqlColumn<String> end1 = column("end1", JDBCType.VARCHAR);

        public final SqlColumn<String> star2 = column("star2", JDBCType.VARCHAR);

        public final SqlColumn<String> end2 = column("end2", JDBCType.VARCHAR);

        public final SqlColumn<String> star3 = column("star3", JDBCType.VARCHAR);

        public final SqlColumn<String> end3 = column("end3", JDBCType.VARCHAR);

        public final SqlColumn<String> star4 = column("star4", JDBCType.VARCHAR);

        public final SqlColumn<String> end4 = column("end4", JDBCType.VARCHAR);

        public SerTimingopen() {
            super("Ser_TimingOpen");
        }
    }
}