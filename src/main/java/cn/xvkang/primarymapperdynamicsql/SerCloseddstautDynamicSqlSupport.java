package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SerCloseddstautDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.917+08:00", comments="Source Table: Ser_ClosedDStaut")
    public static final SerCloseddstaut serCloseddstaut = new SerCloseddstaut();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.917+08:00", comments="Source field: Ser_ClosedDStaut.id")
    public static final SqlColumn<Integer> id = serCloseddstaut.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.917+08:00", comments="Source field: Ser_ClosedDStaut.DevcNo")
    public static final SqlColumn<Integer> devcno = serCloseddstaut.devcno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.917+08:00", comments="Source field: Ser_ClosedDStaut.Stuat")
    public static final SqlColumn<String> stuat = serCloseddstaut.stuat;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.917+08:00", comments="Source Table: Ser_ClosedDStaut")
    public static final class SerCloseddstaut extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> devcno = column("DevcNo", JDBCType.INTEGER);

        public final SqlColumn<String> stuat = column("Stuat", JDBCType.VARCHAR);

        public SerCloseddstaut() {
            super("Ser_ClosedDStaut");
        }
    }
}