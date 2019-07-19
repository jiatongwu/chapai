package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class QrfxselectschemeDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.820+08:00", comments="Source Table: QrFxSelectScheme")
    public static final Qrfxselectscheme qrfxselectscheme = new Qrfxselectscheme();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.820+08:00", comments="Source field: QrFxSelectScheme.SchId")
    public static final SqlColumn<Integer> schid = qrfxselectscheme.schid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.820+08:00", comments="Source field: QrFxSelectScheme.SchName")
    public static final SqlColumn<String> schname = qrfxselectscheme.schname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.820+08:00", comments="Source field: QrFxSelectScheme.FieldName")
    public static final SqlColumn<String> fieldname = qrfxselectscheme.fieldname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.820+08:00", comments="Source field: QrFxSelectScheme.Operators")
    public static final SqlColumn<String> operators = qrfxselectscheme.operators;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.820+08:00", comments="Source field: QrFxSelectScheme.Selectvalues")
    public static final SqlColumn<String> selectvalues = qrfxselectscheme.selectvalues;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.820+08:00", comments="Source field: QrFxSelectScheme.startime")
    public static final SqlColumn<String> startime = qrfxselectscheme.startime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.820+08:00", comments="Source field: QrFxSelectScheme.endtime")
    public static final SqlColumn<String> endtime = qrfxselectscheme.endtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.820+08:00", comments="Source Table: QrFxSelectScheme")
    public static final class Qrfxselectscheme extends SqlTable {
        public final SqlColumn<Integer> schid = column("SchId", JDBCType.INTEGER);

        public final SqlColumn<String> schname = column("SchName", JDBCType.VARCHAR);

        public final SqlColumn<String> fieldname = column("FieldName", JDBCType.VARCHAR);

        public final SqlColumn<String> operators = column("Operators", JDBCType.VARCHAR);

        public final SqlColumn<String> selectvalues = column("Selectvalues", JDBCType.VARCHAR);

        public final SqlColumn<String> startime = column("startime", JDBCType.VARCHAR);

        public final SqlColumn<String> endtime = column("endtime", JDBCType.VARCHAR);

        public Qrfxselectscheme() {
            super("QrFxSelectScheme");
        }
    }
}