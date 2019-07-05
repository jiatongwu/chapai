package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TspecialcphDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.870+08:00", comments="Source Table: tSpecialCPH")
    public static final Tspecialcph tspecialcph = new Tspecialcph();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.870+08:00", comments="Source field: tSpecialCPH.ID")
    public static final SqlColumn<Long> id = tspecialcph.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.870+08:00", comments="Source field: tSpecialCPH.Type")
    public static final SqlColumn<Integer> type = tspecialcph.type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.870+08:00", comments="Source field: tSpecialCPH.CPH")
    public static final SqlColumn<String> cph = tspecialcph.cph;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.870+08:00", comments="Source field: tSpecialCPH.Mode")
    public static final SqlColumn<String> mode = tspecialcph.mode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.870+08:00", comments="Source field: tSpecialCPH.Show")
    public static final SqlColumn<String> show = tspecialcph.show;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.870+08:00", comments="Source Table: tSpecialCPH")
    public static final class Tspecialcph extends SqlTable {
        public final SqlColumn<Long> id = column("ID", JDBCType.BIGINT);

        public final SqlColumn<Integer> type = column("Type", JDBCType.INTEGER);

        public final SqlColumn<String> cph = column("CPH", JDBCType.VARCHAR);

        public final SqlColumn<String> mode = column("Mode", JDBCType.VARCHAR);

        public final SqlColumn<String> show = column("Show", JDBCType.VARCHAR);

        public Tspecialcph() {
            super("tSpecialCPH");
        }
    }
}