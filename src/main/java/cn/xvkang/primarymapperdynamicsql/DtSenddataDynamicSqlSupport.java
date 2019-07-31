package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DtSenddataDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.905+08:00", comments="Source Table: Dt_SendData")
    public static final DtSenddata dtSenddata = new DtSenddata();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.905+08:00", comments="Source field: Dt_SendData.Id")
    public static final SqlColumn<Integer> id = dtSenddata.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.905+08:00", comments="Source field: Dt_SendData.DevcNum")
    public static final SqlColumn<Integer> devcnum = dtSenddata.devcnum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.905+08:00", comments="Source field: Dt_SendData.InseDate")
    public static final SqlColumn<Date> insedate = dtSenddata.insedate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.905+08:00", comments="Source field: Dt_SendData.SendData")
    public static final SqlColumn<byte[]> senddata = dtSenddata.senddata;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.905+08:00", comments="Source Table: Dt_SendData")
    public static final class DtSenddata extends SqlTable {
        public final SqlColumn<Integer> id = column("Id", JDBCType.INTEGER);

        public final SqlColumn<Integer> devcnum = column("DevcNum", JDBCType.INTEGER);

        public final SqlColumn<Date> insedate = column("InseDate", JDBCType.TIMESTAMP);

        public final SqlColumn<byte[]> senddata = column("SendData", JDBCType.VARBINARY);

        public DtSenddata() {
            super("Dt_SendData");
        }
    }
}