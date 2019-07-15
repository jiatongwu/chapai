package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MNormalopendoorsetDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.860+08:00", comments="Source Table: M_NormalOpenDoorSet")
    public static final MNormalopendoorset MNormalopendoorset = new MNormalopendoorset();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.860+08:00", comments="Source field: M_NormalOpenDoorSet.id")
    public static final SqlColumn<Integer> id = MNormalopendoorset.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.860+08:00", comments="Source field: M_NormalOpenDoorSet.DevcNum")
    public static final SqlColumn<Integer> devcnum = MNormalopendoorset.devcnum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.860+08:00", comments="Source field: M_NormalOpenDoorSet.DoorLeiBie")
    public static final SqlColumn<Integer> doorleibie = MNormalopendoorset.doorleibie;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.860+08:00", comments="Source field: M_NormalOpenDoorSet.NorMalSet")
    public static final SqlColumn<Integer> normalset = MNormalopendoorset.normalset;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.860+08:00", comments="Source field: M_NormalOpenDoorSet.stat1")
    public static final SqlColumn<String> stat1 = MNormalopendoorset.stat1;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.860+08:00", comments="Source field: M_NormalOpenDoorSet.End1")
    public static final SqlColumn<String> end1 = MNormalopendoorset.end1;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.860+08:00", comments="Source field: M_NormalOpenDoorSet.stat2")
    public static final SqlColumn<String> stat2 = MNormalopendoorset.stat2;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.860+08:00", comments="Source field: M_NormalOpenDoorSet.End2")
    public static final SqlColumn<String> end2 = MNormalopendoorset.end2;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.860+08:00", comments="Source field: M_NormalOpenDoorSet.stat3")
    public static final SqlColumn<String> stat3 = MNormalopendoorset.stat3;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.860+08:00", comments="Source field: M_NormalOpenDoorSet.End3")
    public static final SqlColumn<String> end3 = MNormalopendoorset.end3;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.860+08:00", comments="Source field: M_NormalOpenDoorSet.stat4")
    public static final SqlColumn<String> stat4 = MNormalopendoorset.stat4;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.860+08:00", comments="Source field: M_NormalOpenDoorSet.End4")
    public static final SqlColumn<String> end4 = MNormalopendoorset.end4;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.860+08:00", comments="Source Table: M_NormalOpenDoorSet")
    public static final class MNormalopendoorset extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> devcnum = column("DevcNum", JDBCType.INTEGER);

        public final SqlColumn<Integer> doorleibie = column("DoorLeiBie", JDBCType.INTEGER);

        public final SqlColumn<Integer> normalset = column("NorMalSet", JDBCType.INTEGER);

        public final SqlColumn<String> stat1 = column("stat1", JDBCType.VARCHAR);

        public final SqlColumn<String> end1 = column("End1", JDBCType.VARCHAR);

        public final SqlColumn<String> stat2 = column("stat2", JDBCType.VARCHAR);

        public final SqlColumn<String> end2 = column("End2", JDBCType.VARCHAR);

        public final SqlColumn<String> stat3 = column("stat3", JDBCType.VARCHAR);

        public final SqlColumn<String> end3 = column("End3", JDBCType.VARCHAR);

        public final SqlColumn<String> stat4 = column("stat4", JDBCType.VARCHAR);

        public final SqlColumn<String> end4 = column("End4", JDBCType.VARCHAR);

        public MNormalopendoorset() {
            super("M_NormalOpenDoorSet");
        }
    }
}