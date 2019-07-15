package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TblqueryDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.951+08:00", comments="Source Table: tblQuery")
    public static final Tblquery tblquery = new Tblquery();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.951+08:00", comments="Source field: tblQuery.Window")
    public static final SqlColumn<String> window = tblquery.window;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.951+08:00", comments="Source field: tblQuery.SaveName")
    public static final SqlColumn<String> savename = tblquery.savename;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.951+08:00", comments="Source field: tblQuery.ShowField_CN")
    public static final SqlColumn<String> showfieldCn = tblquery.showfieldCn;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.951+08:00", comments="Source field: tblQuery.ShowField_EN")
    public static final SqlColumn<String> showfieldEn = tblquery.showfieldEn;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.951+08:00", comments="Source field: tblQuery.RealField")
    public static final SqlColumn<String> realfield = tblquery.realfield;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.951+08:00", comments="Source field: tblQuery.OP")
    public static final SqlColumn<String> op = tblquery.op;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.951+08:00", comments="Source field: tblQuery.SearchValue")
    public static final SqlColumn<String> searchvalue = tblquery.searchvalue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.951+08:00", comments="Source field: tblQuery.DataType")
    public static final SqlColumn<String> datatype = tblquery.datatype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.951+08:00", comments="Source field: tblQuery.Selected")
    public static final SqlColumn<Byte> selected = tblquery.selected;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.951+08:00", comments="Source field: tblQuery.CurrentShow")
    public static final SqlColumn<Byte> currentshow = tblquery.currentshow;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.951+08:00", comments="Source Table: tblQuery")
    public static final class Tblquery extends SqlTable {
        public final SqlColumn<String> window = column("Window", JDBCType.VARCHAR);

        public final SqlColumn<String> savename = column("SaveName", JDBCType.VARCHAR);

        public final SqlColumn<String> showfieldCn = column("ShowField_CN", JDBCType.VARCHAR);

        public final SqlColumn<String> showfieldEn = column("ShowField_EN", JDBCType.VARCHAR);

        public final SqlColumn<String> realfield = column("RealField", JDBCType.VARCHAR);

        public final SqlColumn<String> op = column("OP", JDBCType.VARCHAR);

        public final SqlColumn<String> searchvalue = column("SearchValue", JDBCType.VARCHAR);

        public final SqlColumn<String> datatype = column("DataType", JDBCType.VARCHAR);

        public final SqlColumn<Byte> selected = column("Selected", JDBCType.TINYINT);

        public final SqlColumn<Byte> currentshow = column("CurrentShow", JDBCType.TINYINT);

        public Tblquery() {
            super("tblQuery");
        }
    }
}