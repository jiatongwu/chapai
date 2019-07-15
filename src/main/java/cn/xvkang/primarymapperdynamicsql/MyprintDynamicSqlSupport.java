package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MyprintDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.780+08:00", comments="Source Table: MYPrint")
    public static final Myprint myprint = new Myprint();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.780+08:00", comments="Source field: MYPrint.Title")
    public static final SqlColumn<String> title = myprint.title;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.780+08:00", comments="Source field: MYPrint.FTitle")
    public static final SqlColumn<String> ftitle = myprint.ftitle;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.780+08:00", comments="Source field: MYPrint.Footer")
    public static final SqlColumn<String> footer = myprint.footer;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.780+08:00", comments="Source Table: MYPrint")
    public static final class Myprint extends SqlTable {
        public final SqlColumn<String> title = column("Title", JDBCType.VARCHAR);

        public final SqlColumn<String> ftitle = column("FTitle", JDBCType.VARCHAR);

        public final SqlColumn<String> footer = column("Footer", JDBCType.VARCHAR);

        public Myprint() {
            super("MYPrint");
        }
    }
}