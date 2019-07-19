package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MoneyschemeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.798+08:00", comments="Source Table: MoneyScheme")
    public static final Moneyscheme moneyscheme = new Moneyscheme();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.798+08:00", comments="Source field: MoneyScheme.SchId")
    public static final SqlColumn<Integer> schid = moneyscheme.schid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.798+08:00", comments="Source field: MoneyScheme.SchName")
    public static final SqlColumn<String> schname = moneyscheme.schname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.798+08:00", comments="Source field: MoneyScheme.FieldName")
    public static final SqlColumn<String> fieldname = moneyscheme.fieldname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.798+08:00", comments="Source field: MoneyScheme.Operators")
    public static final SqlColumn<String> operators = moneyscheme.operators;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.798+08:00", comments="Source field: MoneyScheme.Selectvalues")
    public static final SqlColumn<String> selectvalues = moneyscheme.selectvalues;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.798+08:00", comments="Source field: MoneyScheme.startime")
    public static final SqlColumn<String> startime = moneyscheme.startime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.798+08:00", comments="Source field: MoneyScheme.endtime")
    public static final SqlColumn<String> endtime = moneyscheme.endtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.798+08:00", comments="Source Table: MoneyScheme")
    public static final class Moneyscheme extends SqlTable {
        public final SqlColumn<Integer> schid = column("SchId", JDBCType.INTEGER);

        public final SqlColumn<String> schname = column("SchName", JDBCType.VARCHAR);

        public final SqlColumn<String> fieldname = column("FieldName", JDBCType.VARCHAR);

        public final SqlColumn<String> operators = column("Operators", JDBCType.VARCHAR);

        public final SqlColumn<String> selectvalues = column("Selectvalues", JDBCType.VARCHAR);

        public final SqlColumn<String> startime = column("startime", JDBCType.VARCHAR);

        public final SqlColumn<String> endtime = column("endtime", JDBCType.VARCHAR);

        public Moneyscheme() {
            super("MoneyScheme");
        }
    }
}