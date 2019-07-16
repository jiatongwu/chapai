package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MycardtypeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.828+08:00", comments="Source Table: MYCardType")
    public static final Mycardtype mycardtype = new Mycardtype();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.828+08:00", comments="Source field: MYCardType.ID")
    public static final SqlColumn<Integer> id = mycardtype.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.828+08:00", comments="Source field: MYCardType.CardType")
    public static final SqlColumn<String> cardtype = mycardtype.cardtype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.828+08:00", comments="Source field: MYCardType.Identifying")
    public static final SqlColumn<String> identifying = mycardtype.identifying;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.828+08:00", comments="Source field: MYCardType.Enabled")
    public static final SqlColumn<Boolean> enabled = mycardtype.enabled;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.828+08:00", comments="Source field: MYCardType.Reamrks")
    public static final SqlColumn<String> reamrks = mycardtype.reamrks;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.828+08:00", comments="Source Table: MYCardType")
    public static final class Mycardtype extends SqlTable {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<String> cardtype = column("CardType", JDBCType.VARCHAR);

        public final SqlColumn<String> identifying = column("Identifying", JDBCType.VARCHAR);

        public final SqlColumn<Boolean> enabled = column("Enabled", JDBCType.BIT);

        public final SqlColumn<String> reamrks = column("Reamrks", JDBCType.VARCHAR);

        public Mycardtype() {
            super("MYCardType");
        }
    }
}