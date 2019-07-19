package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MyautotempdownloadDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.637+08:00", comments="Source Table: MYAutoTempDownLoad")
    public static final Myautotempdownload myautotempdownload = new Myautotempdownload();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.637+08:00", comments="Source field: MYAutoTempDownLoad.ID")
    public static final SqlColumn<Integer> id = myautotempdownload.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.637+08:00", comments="Source field: MYAutoTempDownLoad.CPH")
    public static final SqlColumn<String> cph = myautotempdownload.cph;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.637+08:00", comments="Source field: MYAutoTempDownLoad.InTime")
    public static final SqlColumn<Date> intime = myautotempdownload.intime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.637+08:00", comments="Source field: MYAutoTempDownLoad.DownloadSignal")
    public static final SqlColumn<String> downloadsignal = myautotempdownload.downloadsignal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.638+08:00", comments="Source field: MYAutoTempDownLoad.InOut")
    public static final SqlColumn<Integer> inout = myautotempdownload.inout;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.638+08:00", comments="Source field: MYAutoTempDownLoad.iBigSmall")
    public static final SqlColumn<Integer> ibigsmall = myautotempdownload.ibigsmall;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.637+08:00", comments="Source Table: MYAutoTempDownLoad")
    public static final class Myautotempdownload extends SqlTable {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<String> cph = column("CPH", JDBCType.VARCHAR);

        public final SqlColumn<Date> intime = column("InTime", JDBCType.TIMESTAMP);

        public final SqlColumn<String> downloadsignal = column("DownloadSignal", JDBCType.VARCHAR);

        public final SqlColumn<Integer> inout = column("InOut", JDBCType.INTEGER);

        public final SqlColumn<Integer> ibigsmall = column("iBigSmall", JDBCType.INTEGER);

        public Myautotempdownload() {
            super("MYAutoTempDownLoad");
        }
    }
}