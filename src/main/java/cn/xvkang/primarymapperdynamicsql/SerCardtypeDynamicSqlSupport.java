package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SerCardtypeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.175+08:00", comments="Source Table: Ser_CardType")
    public static final SerCardtype serCardtype = new SerCardtype();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.175+08:00", comments="Source field: Ser_CardType.id")
    public static final SqlColumn<Integer> id = serCardtype.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.175+08:00", comments="Source field: Ser_CardType.CardCname")
    public static final SqlColumn<String> cardcname = serCardtype.cardcname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.175+08:00", comments="Source field: Ser_CardType.CardEname")
    public static final SqlColumn<String> cardename = serCardtype.cardename;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.175+08:00", comments="Source field: Ser_CardType.Mark")
    public static final SqlColumn<String> mark = serCardtype.mark;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-31T15:28:01.175+08:00", comments="Source Table: Ser_CardType")
    public static final class SerCardtype extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> cardcname = column("CardCname", JDBCType.VARCHAR);

        public final SqlColumn<String> cardename = column("CardEname", JDBCType.VARCHAR);

        public final SqlColumn<String> mark = column("Mark", JDBCType.VARCHAR);

        public SerCardtype() {
            super("Ser_CardType");
        }
    }
}