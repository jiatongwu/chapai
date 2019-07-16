package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TblopentypeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.962+08:00", comments="Source Table: tblOpenType")
    public static final Tblopentype tblopentype = new Tblopentype();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.962+08:00", comments="Source field: tblOpenType.ID")
    public static final SqlColumn<Short> id = tblopentype.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.962+08:00", comments="Source field: tblOpenType.OpenType")
    public static final SqlColumn<String> opentype = tblopentype.opentype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.962+08:00", comments="Source Table: tblOpenType")
    public static final class Tblopentype extends SqlTable {
        public final SqlColumn<Short> id = column("ID", JDBCType.SMALLINT);

        public final SqlColumn<String> opentype = column("OpenType", JDBCType.VARCHAR);

        public Tblopentype() {
            super("tblOpenType");
        }
    }
}