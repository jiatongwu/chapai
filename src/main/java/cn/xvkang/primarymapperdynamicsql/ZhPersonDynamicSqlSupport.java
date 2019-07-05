package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ZhPersonDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.916+08:00", comments="Source Table: zh_Person")
    public static final ZhPerson zhPerson = new ZhPerson();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.916+08:00", comments="Source field: zh_Person.id")
    public static final SqlColumn<Integer> id = zhPerson.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.916+08:00", comments="Source field: zh_Person.userNo")
    public static final SqlColumn<String> userno = zhPerson.userno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.916+08:00", comments="Source field: zh_Person.userName")
    public static final SqlColumn<String> username = zhPerson.username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.916+08:00", comments="Source field: zh_Person.sex")
    public static final SqlColumn<String> sex = zhPerson.sex;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.916+08:00", comments="Source field: zh_Person.homeAddress")
    public static final SqlColumn<String> homeaddress = zhPerson.homeaddress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.916+08:00", comments="Source field: zh_Person.mobNumber")
    public static final SqlColumn<String> mobnumber = zhPerson.mobnumber;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.916+08:00", comments="Source field: zh_Person.carSpalcesNum")
    public static final SqlColumn<String> carspalcesnum = zhPerson.carspalcesnum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.916+08:00", comments="Source field: zh_Person.synflag")
    public static final SqlColumn<Integer> synflag = zhPerson.synflag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T20:12:44.916+08:00", comments="Source Table: zh_Person")
    public static final class ZhPerson extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> userno = column("userNo", JDBCType.VARCHAR);

        public final SqlColumn<String> username = column("userName", JDBCType.VARCHAR);

        public final SqlColumn<String> sex = column("sex", JDBCType.VARCHAR);

        public final SqlColumn<String> homeaddress = column("homeAddress", JDBCType.VARCHAR);

        public final SqlColumn<String> mobnumber = column("mobNumber", JDBCType.VARCHAR);

        public final SqlColumn<String> carspalcesnum = column("carSpalcesNum", JDBCType.VARCHAR);

        public final SqlColumn<Integer> synflag = column("synflag", JDBCType.INTEGER);

        public ZhPerson() {
            super("zh_Person");
        }
    }
}