package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OpencloseddoorstautDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.816+08:00", comments="Source Table: OpenClosedDoorStaut")
    public static final Opencloseddoorstaut opencloseddoorstaut = new Opencloseddoorstaut();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.816+08:00", comments="Source field: OpenClosedDoorStaut.id")
    public static final SqlColumn<Integer> id = opencloseddoorstaut.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.816+08:00", comments="Source field: OpenClosedDoorStaut.DevcNo")
    public static final SqlColumn<Integer> devcno = opencloseddoorstaut.devcno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.816+08:00", comments="Source field: OpenClosedDoorStaut.Stuat")
    public static final SqlColumn<String> stuat = opencloseddoorstaut.stuat;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.816+08:00", comments="Source Table: OpenClosedDoorStaut")
    public static final class Opencloseddoorstaut extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> devcno = column("DevcNo", JDBCType.INTEGER);

        public final SqlColumn<String> stuat = column("Stuat", JDBCType.VARCHAR);

        public Opencloseddoorstaut() {
            super("OpenClosedDoorStaut");
        }
    }
}