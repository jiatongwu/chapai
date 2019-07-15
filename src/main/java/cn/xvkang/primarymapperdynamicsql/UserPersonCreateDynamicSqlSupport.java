package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UserPersonCreateDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.973+08:00", comments="Source Table: user_person_create")
    public static final UserPersonCreate userPersonCreate = new UserPersonCreate();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.973+08:00", comments="Source field: user_person_create.id")
    public static final SqlColumn<Integer> id = userPersonCreate.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.973+08:00", comments="Source field: user_person_create.user_id")
    public static final SqlColumn<Integer> userId = userPersonCreate.userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.973+08:00", comments="Source field: user_person_create.person_id")
    public static final SqlColumn<String> personId = userPersonCreate.personId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.973+08:00", comments="Source field: user_person_create.createtime")
    public static final SqlColumn<Date> createtime = userPersonCreate.createtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.973+08:00", comments="Source Table: user_person_create")
    public static final class UserPersonCreate extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> userId = column("user_id", JDBCType.INTEGER);

        public final SqlColumn<String> personId = column("person_id", JDBCType.VARCHAR);

        public final SqlColumn<Date> createtime = column("createtime", JDBCType.TIMESTAMP);

        public UserPersonCreate() {
            super("user_person_create");
        }
    }
}