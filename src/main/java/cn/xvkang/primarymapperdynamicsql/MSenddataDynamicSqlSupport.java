package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MSenddataDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.870+08:00", comments="Source Table: M_SendData")
    public static final MSenddata MSenddata = new MSenddata();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.870+08:00", comments="Source field: M_SendData.Id")
    public static final SqlColumn<Integer> id = MSenddata.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.870+08:00", comments="Source field: M_SendData.DevcNum")
    public static final SqlColumn<Integer> devcnum = MSenddata.devcnum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.870+08:00", comments="Source field: M_SendData.InseDate")
    public static final SqlColumn<Date> insedate = MSenddata.insedate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.870+08:00", comments="Source field: M_SendData.SendData")
    public static final SqlColumn<byte[]> senddata = MSenddata.senddata;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.870+08:00", comments="Source Table: M_SendData")
    public static final class MSenddata extends SqlTable {
        public final SqlColumn<Integer> id = column("Id", JDBCType.INTEGER);

        public final SqlColumn<Integer> devcnum = column("DevcNum", JDBCType.INTEGER);

        public final SqlColumn<Date> insedate = column("InseDate", JDBCType.TIMESTAMP);

        public final SqlColumn<byte[]> senddata = column("SendData", JDBCType.VARBINARY);

        public MSenddata() {
            super("M_SendData");
        }
    }
}