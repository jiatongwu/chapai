package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class QrRecordDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.909+08:00", comments="Source Table: Qr_Record")
    public static final QrRecord qrRecord = new QrRecord();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.909+08:00", comments="Source field: Qr_Record.Cardid")
    public static final SqlColumn<String> cardid = qrRecord.cardid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.909+08:00", comments="Source field: Qr_Record.Cardtype")
    public static final SqlColumn<String> cardtype = qrRecord.cardtype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.909+08:00", comments="Source field: Qr_Record.Userno")
    public static final SqlColumn<String> userno = qrRecord.userno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.909+08:00", comments="Source field: Qr_Record.UserName")
    public static final SqlColumn<String> username = qrRecord.username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.909+08:00", comments="Source field: Qr_Record.Department")
    public static final SqlColumn<String> department = qrRecord.department;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.909+08:00", comments="Source field: Qr_Record.Machno")
    public static final SqlColumn<String> machno = qrRecord.machno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.909+08:00", comments="Source field: Qr_Record.Machplace")
    public static final SqlColumn<String> machplace = qrRecord.machplace;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.909+08:00", comments="Source field: Qr_Record.Doorno")
    public static final SqlColumn<String> doorno = qrRecord.doorno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.909+08:00", comments="Source field: Qr_Record.Opentime")
    public static final SqlColumn<String> opentime = qrRecord.opentime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.909+08:00", comments="Source Table: Qr_Record")
    public static final class QrRecord extends SqlTable {
        public final SqlColumn<String> cardid = column("Cardid", JDBCType.VARCHAR);

        public final SqlColumn<String> cardtype = column("Cardtype", JDBCType.VARCHAR);

        public final SqlColumn<String> userno = column("Userno", JDBCType.VARCHAR);

        public final SqlColumn<String> username = column("UserName", JDBCType.VARCHAR);

        public final SqlColumn<String> department = column("Department", JDBCType.VARCHAR);

        public final SqlColumn<String> machno = column("Machno", JDBCType.VARCHAR);

        public final SqlColumn<String> machplace = column("Machplace", JDBCType.VARCHAR);

        public final SqlColumn<String> doorno = column("Doorno", JDBCType.VARCHAR);

        public final SqlColumn<String> opentime = column("Opentime", JDBCType.VARCHAR);

        public QrRecord() {
            super("Qr_Record");
        }
    }
}