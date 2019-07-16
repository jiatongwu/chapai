package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MyquanxiansetDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.786+08:00", comments="Source Table: MYQUANXIANSET")
    public static final Myquanxianset myquanxianset = new Myquanxianset();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.786+08:00", comments="Source field: MYQUANXIANSET.FormName")
    public static final SqlColumn<String> formname = myquanxianset.formname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.786+08:00", comments="Source field: MYQUANXIANSET.MenuName")
    public static final SqlColumn<String> menuname = myquanxianset.menuname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.786+08:00", comments="Source field: MYQUANXIANSET.MenuText")
    public static final SqlColumn<String> menutext = myquanxianset.menutext;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.786+08:00", comments="Source field: MYQUANXIANSET.ValidMark")
    public static final SqlColumn<String> validmark = myquanxianset.validmark;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.786+08:00", comments="Source field: MYQUANXIANSET.KEYVALUE")
    public static final SqlColumn<String> keyvalue = myquanxianset.keyvalue;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.786+08:00", comments="Source Table: MYQUANXIANSET")
    public static final class Myquanxianset extends SqlTable {
        public final SqlColumn<String> formname = column("FormName", JDBCType.VARCHAR);

        public final SqlColumn<String> menuname = column("MenuName", JDBCType.VARCHAR);

        public final SqlColumn<String> menutext = column("MenuText", JDBCType.VARCHAR);

        public final SqlColumn<String> validmark = column("ValidMark", JDBCType.VARCHAR);

        public final SqlColumn<String> keyvalue = column("KEYVALUE", JDBCType.VARCHAR);

        public Myquanxianset() {
            super("MYQUANXIANSET");
        }
    }
}