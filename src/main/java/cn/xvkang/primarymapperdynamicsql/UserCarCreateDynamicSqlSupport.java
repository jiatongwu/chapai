package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UserCarCreateDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.989+08:00", comments="Source Table: user_car_create")
    public static final UserCarCreate userCarCreate = new UserCarCreate();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.989+08:00", comments="Source field: user_car_create.id")
    public static final SqlColumn<Integer> id = userCarCreate.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.989+08:00", comments="Source field: user_car_create.user_id")
    public static final SqlColumn<Integer> userId = userCarCreate.userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.989+08:00", comments="Source field: user_car_create.car_id")
    public static final SqlColumn<Integer> carId = userCarCreate.carId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.989+08:00", comments="Source field: user_car_create.createtime")
    public static final SqlColumn<Date> createtime = userCarCreate.createtime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-16T10:08:57.989+08:00", comments="Source Table: user_car_create")
    public static final class UserCarCreate extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> userId = column("user_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> carId = column("car_id", JDBCType.INTEGER);

        public final SqlColumn<Date> createtime = column("createtime", JDBCType.TIMESTAMP);

        public UserCarCreate() {
            super("user_car_create");
        }
    }
}