package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MycommonalityDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.880+08:00", comments="Source Table: MyCommonality")
    public static final Mycommonality mycommonality = new Mycommonality();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.880+08:00", comments="Source field: MyCommonality.FileDate")
    public static final SqlColumn<Date> filedate = mycommonality.filedate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.880+08:00", comments="Source Table: MyCommonality")
    public static final class Mycommonality extends SqlTable {
        public final SqlColumn<Date> filedate = column("FileDate", JDBCType.TIMESTAMP);

        public Mycommonality() {
            super("MyCommonality");
        }
    }
}