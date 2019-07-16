package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MysurpluscarscreenDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.807+08:00", comments="Source Table: MYSurplusCarScreen")
    public static final Mysurpluscarscreen mysurpluscarscreen = new Mysurpluscarscreen();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.808+08:00", comments="Source field: MYSurplusCarScreen.ID")
    public static final SqlColumn<Integer> id = mysurpluscarscreen.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.808+08:00", comments="Source field: MYSurplusCarScreen.CtrID")
    public static final SqlColumn<Integer> ctrid = mysurpluscarscreen.ctrid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.808+08:00", comments="Source field: MYSurplusCarScreen.SurplusID")
    public static final SqlColumn<String> surplusid = mysurpluscarscreen.surplusid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.808+08:00", comments="Source field: MYSurplusCarScreen.Speed")
    public static final SqlColumn<String> speed = mysurpluscarscreen.speed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.808+08:00", comments="Source field: MYSurplusCarScreen.StopTime")
    public static final SqlColumn<String> stoptime = mysurpluscarscreen.stoptime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.808+08:00", comments="Source field: MYSurplusCarScreen.Color")
    public static final SqlColumn<String> color = mysurpluscarscreen.color;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.808+08:00", comments="Source field: MYSurplusCarScreen.SumTime")
    public static final SqlColumn<String> sumtime = mysurpluscarscreen.sumtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.808+08:00", comments="Source field: MYSurplusCarScreen.PCName")
    public static final SqlColumn<String> pcname = mysurpluscarscreen.pcname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.808+08:00", comments="Source field: MYSurplusCarScreen.CPHEndStr")
    public static final SqlColumn<String> cphendstr = mysurpluscarscreen.cphendstr;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.808+08:00", comments="Source field: MYSurplusCarScreen.ShowWay")
    public static final SqlColumn<String> showway = mysurpluscarscreen.showway;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.808+08:00", comments="Source field: MYSurplusCarScreen.Move")
    public static final SqlColumn<String> move = mysurpluscarscreen.move;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.808+08:00", comments="Source field: MYSurplusCarScreen.Pattern")
    public static final SqlColumn<String> pattern = mysurpluscarscreen.pattern;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.807+08:00", comments="Source Table: MYSurplusCarScreen")
    public static final class Mysurpluscarscreen extends SqlTable {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<Integer> ctrid = column("CtrID", JDBCType.INTEGER);

        public final SqlColumn<String> surplusid = column("SurplusID", JDBCType.VARCHAR);

        public final SqlColumn<String> speed = column("Speed", JDBCType.VARCHAR);

        public final SqlColumn<String> stoptime = column("StopTime", JDBCType.VARCHAR);

        public final SqlColumn<String> color = column("Color", JDBCType.VARCHAR);

        public final SqlColumn<String> sumtime = column("SumTime", JDBCType.VARCHAR);

        public final SqlColumn<String> pcname = column("PCName", JDBCType.VARCHAR);

        public final SqlColumn<String> cphendstr = column("CPHEndStr", JDBCType.VARCHAR);

        public final SqlColumn<String> showway = column("ShowWay", JDBCType.VARCHAR);

        public final SqlColumn<String> move = column("Move", JDBCType.VARCHAR);

        public final SqlColumn<String> pattern = column("Pattern", JDBCType.VARCHAR);

        public Mysurpluscarscreen() {
            super("MYSurplusCarScreen");
        }
    }
}