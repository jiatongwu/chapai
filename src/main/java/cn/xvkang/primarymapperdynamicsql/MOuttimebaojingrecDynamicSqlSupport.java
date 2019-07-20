package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MOuttimebaojingrecDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.395+08:00", comments="Source Table: M_OutTimeBaoJingRec")
    public static final MOuttimebaojingrec MOuttimebaojingrec = new MOuttimebaojingrec();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.395+08:00", comments="Source field: M_OutTimeBaoJingRec.id")
    public static final SqlColumn<Integer> id = MOuttimebaojingrec.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.395+08:00", comments="Source field: M_OutTimeBaoJingRec.DevcNum")
    public static final SqlColumn<Integer> devcnum = MOuttimebaojingrec.devcnum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.395+08:00", comments="Source field: M_OutTimeBaoJingRec.Baojin")
    public static final SqlColumn<String> baojin = MOuttimebaojingrec.baojin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.395+08:00", comments="Source Table: M_OutTimeBaoJingRec")
    public static final class MOuttimebaojingrec extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> devcnum = column("DevcNum", JDBCType.INTEGER);

        public final SqlColumn<String> baojin = column("Baojin", JDBCType.VARCHAR);

        public MOuttimebaojingrec() {
            super("M_OutTimeBaoJingRec");
        }
    }
}