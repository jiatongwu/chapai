package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MyautotempchangeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.459+08:00", comments="Source Table: MYAutoTempChange")
    public static final Myautotempchange myautotempchange = new Myautotempchange();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.459+08:00", comments="Source field: MYAutoTempChange.ID")
    public static final SqlColumn<Integer> id = myautotempchange.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.459+08:00", comments="Source field: MYAutoTempChange.CPH")
    public static final SqlColumn<String> cph = myautotempchange.cph;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.459+08:00", comments="Source field: MYAutoTempChange.CarCardType")
    public static final SqlColumn<String> carcardtype = myautotempchange.carcardtype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.459+08:00", comments="Source field: MYAutoTempChange.InTime")
    public static final SqlColumn<Date> intime = myautotempchange.intime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.459+08:00", comments="Source field: MYAutoTempChange.CarValidStartDate")
    public static final SqlColumn<Date> carvalidstartdate = myautotempchange.carvalidstartdate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.459+08:00", comments="Source field: MYAutoTempChange.CarValidEndDate")
    public static final SqlColumn<Date> carvalidenddate = myautotempchange.carvalidenddate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.460+08:00", comments="Source field: MYAutoTempChange.DownloadSignal")
    public static final SqlColumn<String> downloadsignal = myautotempchange.downloadsignal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.460+08:00", comments="Source field: MYAutoTempChange.InOut")
    public static final SqlColumn<Integer> inout = myautotempchange.inout;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.459+08:00", comments="Source Table: MYAutoTempChange")
    public static final class Myautotempchange extends SqlTable {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<String> cph = column("CPH", JDBCType.VARCHAR);

        public final SqlColumn<String> carcardtype = column("CarCardType", JDBCType.VARCHAR);

        public final SqlColumn<Date> intime = column("InTime", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> carvalidstartdate = column("CarValidStartDate", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> carvalidenddate = column("CarValidEndDate", JDBCType.TIMESTAMP);

        public final SqlColumn<String> downloadsignal = column("DownloadSignal", JDBCType.VARCHAR);

        public final SqlColumn<Integer> inout = column("InOut", JDBCType.INTEGER);

        public Myautotempchange() {
            super("MYAutoTempChange");
        }
    }
}