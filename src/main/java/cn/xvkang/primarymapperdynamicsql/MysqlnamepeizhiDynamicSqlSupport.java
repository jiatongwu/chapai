package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MysqlnamepeizhiDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.751+08:00", comments="Source Table: MYSQLNAMEPEIZHI")
    public static final Mysqlnamepeizhi mysqlnamepeizhi = new Mysqlnamepeizhi();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.751+08:00", comments="Source field: MYSQLNAMEPEIZHI.ID")
    public static final SqlColumn<Integer> id = mysqlnamepeizhi.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.751+08:00", comments="Source field: MYSQLNAMEPEIZHI.EN_Name")
    public static final SqlColumn<String> enName = mysqlnamepeizhi.enName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.752+08:00", comments="Source field: MYSQLNAMEPEIZHI.CH_Name")
    public static final SqlColumn<String> chName = mysqlnamepeizhi.chName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.752+08:00", comments="Source field: MYSQLNAMEPEIZHI.Type")
    public static final SqlColumn<String> type = mysqlnamepeizhi.type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.751+08:00", comments="Source Table: MYSQLNAMEPEIZHI")
    public static final class Mysqlnamepeizhi extends SqlTable {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<String> enName = column("EN_Name", JDBCType.VARCHAR);

        public final SqlColumn<String> chName = column("CH_Name", JDBCType.VARCHAR);

        public final SqlColumn<String> type = column("Type", JDBCType.VARCHAR);

        public Mysqlnamepeizhi() {
            super("MYSQLNAMEPEIZHI");
        }
    }
}