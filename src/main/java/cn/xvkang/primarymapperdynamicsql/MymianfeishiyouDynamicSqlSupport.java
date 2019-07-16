package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MymianfeishiyouDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.782+08:00", comments="Source Table: MYMIANFEISHIYOU")
    public static final Mymianfeishiyou mymianfeishiyou = new Mymianfeishiyou();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.782+08:00", comments="Source field: MYMIANFEISHIYOU.ItemID")
    public static final SqlColumn<Integer> itemid = mymianfeishiyou.itemid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.782+08:00", comments="Source field: MYMIANFEISHIYOU.ItemDetail")
    public static final SqlColumn<String> itemdetail = mymianfeishiyou.itemdetail;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.782+08:00", comments="Source Table: MYMIANFEISHIYOU")
    public static final class Mymianfeishiyou extends SqlTable {
        public final SqlColumn<Integer> itemid = column("ItemID", JDBCType.INTEGER);

        public final SqlColumn<String> itemdetail = column("ItemDetail", JDBCType.VARCHAR);

        public Mymianfeishiyou() {
            super("MYMIANFEISHIYOU");
        }
    }
}