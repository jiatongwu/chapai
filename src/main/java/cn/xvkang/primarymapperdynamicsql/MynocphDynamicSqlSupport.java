package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MynocphDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.885+08:00", comments="Source Table: MyNoCPH")
    public static final Mynocph mynocph = new Mynocph();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.885+08:00", comments="Source field: MyNoCPH.ID")
    public static final SqlColumn<Integer> id = mynocph.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.885+08:00", comments="Source field: MyNoCPH.InTime")
    public static final SqlColumn<Date> intime = mynocph.intime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.885+08:00", comments="Source field: MyNoCPH.InPic")
    public static final SqlColumn<String> inpic = mynocph.inpic;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.885+08:00", comments="Source field: MyNoCPH.InGateName")
    public static final SqlColumn<String> ingatename = mynocph.ingatename;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.885+08:00", comments="Source Table: MyNoCPH")
    public static final class Mynocph extends SqlTable {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<Date> intime = column("InTime", JDBCType.TIMESTAMP);

        public final SqlColumn<String> inpic = column("InPic", JDBCType.VARCHAR);

        public final SqlColumn<String> ingatename = column("InGateName", JDBCType.VARCHAR);

        public Mynocph() {
            super("MyNoCPH");
        }
    }
}