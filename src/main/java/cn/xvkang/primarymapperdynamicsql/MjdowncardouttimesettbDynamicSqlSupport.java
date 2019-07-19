package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MjdowncardouttimesettbDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.627+08:00", comments="Source Table: MJDownCardOutTimeSettb")
    public static final Mjdowncardouttimesettb mjdowncardouttimesettb = new Mjdowncardouttimesettb();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.628+08:00", comments="Source field: MJDownCardOutTimeSettb.outtime")
    public static final SqlColumn<Integer> outtime = mjdowncardouttimesettb.outtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.627+08:00", comments="Source Table: MJDownCardOutTimeSettb")
    public static final class Mjdowncardouttimesettb extends SqlTable {
        public final SqlColumn<Integer> outtime = column("outtime", JDBCType.INTEGER);

        public Mjdowncardouttimesettb() {
            super("MJDownCardOutTimeSettb");
        }
    }
}