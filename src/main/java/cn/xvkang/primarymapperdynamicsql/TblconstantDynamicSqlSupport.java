package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TblconstantDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.529+08:00", comments="Source Table: tblConstant")
    public static final Tblconstant tblconstant = new Tblconstant();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.529+08:00", comments="Source field: tblConstant.Types")
    public static final SqlColumn<String> types = tblconstant.types;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.530+08:00", comments="Source field: tblConstant.OrderNO")
    public static final SqlColumn<Short> orderno = tblconstant.orderno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.530+08:00", comments="Source field: tblConstant.Keys")
    public static final SqlColumn<String> keys = tblconstant.keys;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.530+08:00", comments="Source field: tblConstant.Value")
    public static final SqlColumn<String> value = tblconstant.value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.530+08:00", comments="Source field: tblConstant.Flag")
    public static final SqlColumn<Byte> flag = tblconstant.flag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.529+08:00", comments="Source Table: tblConstant")
    public static final class Tblconstant extends SqlTable {
        public final SqlColumn<String> types = column("Types", JDBCType.VARCHAR);

        public final SqlColumn<Short> orderno = column("OrderNO", JDBCType.SMALLINT);

        public final SqlColumn<String> keys = column("Keys", JDBCType.VARCHAR);

        public final SqlColumn<String> value = column("Value", JDBCType.VARCHAR);

        public final SqlColumn<Byte> flag = column("Flag", JDBCType.TINYINT);

        public Tblconstant() {
            super("tblConstant");
        }
    }
}