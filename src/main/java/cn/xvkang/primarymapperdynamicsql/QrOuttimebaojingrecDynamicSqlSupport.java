package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class QrOuttimebaojingrecDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.825+08:00", comments="Source Table: Qr_OutTimeBaoJingRec")
    public static final QrOuttimebaojingrec qrOuttimebaojingrec = new QrOuttimebaojingrec();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.825+08:00", comments="Source field: Qr_OutTimeBaoJingRec.id")
    public static final SqlColumn<Integer> id = qrOuttimebaojingrec.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.825+08:00", comments="Source field: Qr_OutTimeBaoJingRec.DevcNum")
    public static final SqlColumn<Integer> devcnum = qrOuttimebaojingrec.devcnum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.825+08:00", comments="Source field: Qr_OutTimeBaoJingRec.Baojin")
    public static final SqlColumn<String> baojin = qrOuttimebaojingrec.baojin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.825+08:00", comments="Source Table: Qr_OutTimeBaoJingRec")
    public static final class QrOuttimebaojingrec extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> devcnum = column("DevcNum", JDBCType.INTEGER);

        public final SqlColumn<String> baojin = column("Baojin", JDBCType.VARCHAR);

        public QrOuttimebaojingrec() {
            super("Qr_OutTimeBaoJingRec");
        }
    }
}