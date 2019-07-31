package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DtCardtypeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.872+08:00", comments="Source Table: Dt_CardType")
    public static final DtCardtype dtCardtype = new DtCardtype();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.872+08:00", comments="Source field: Dt_CardType.id")
    public static final SqlColumn<Integer> id = dtCardtype.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.872+08:00", comments="Source field: Dt_CardType.CardCname")
    public static final SqlColumn<String> cardcname = dtCardtype.cardcname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.872+08:00", comments="Source field: Dt_CardType.CardEname")
    public static final SqlColumn<String> cardename = dtCardtype.cardename;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.872+08:00", comments="Source field: Dt_CardType.Mark")
    public static final SqlColumn<String> mark = dtCardtype.mark;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:00.872+08:00", comments="Source Table: Dt_CardType")
    public static final class DtCardtype extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> cardcname = column("CardCname", JDBCType.VARCHAR);

        public final SqlColumn<String> cardename = column("CardEname", JDBCType.VARCHAR);

        public final SqlColumn<String> mark = column("Mark", JDBCType.VARCHAR);

        public DtCardtype() {
            super("Dt_CardType");
        }
    }
}