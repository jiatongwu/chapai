package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class SerOuttimebaojingrecDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.867+08:00", comments="Source Table: Ser_OutTimeBaoJingRec")
    public static final SerOuttimebaojingrec serOuttimebaojingrec = new SerOuttimebaojingrec();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.867+08:00", comments="Source field: Ser_OutTimeBaoJingRec.id")
    public static final SqlColumn<Integer> id = serOuttimebaojingrec.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.867+08:00", comments="Source field: Ser_OutTimeBaoJingRec.DevcNum")
    public static final SqlColumn<Integer> devcnum = serOuttimebaojingrec.devcnum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.867+08:00", comments="Source field: Ser_OutTimeBaoJingRec.Baojin")
    public static final SqlColumn<String> baojin = serOuttimebaojingrec.baojin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.867+08:00", comments="Source Table: Ser_OutTimeBaoJingRec")
    public static final class SerOuttimebaojingrec extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> devcnum = column("DevcNum", JDBCType.INTEGER);

        public final SqlColumn<String> baojin = column("Baojin", JDBCType.VARCHAR);

        public SerOuttimebaojingrec() {
            super("Ser_OutTimeBaoJingRec");
        }
    }
}