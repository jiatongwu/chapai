package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MOpendoormodelDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.861+08:00", comments="Source Table: M_OpenDoorModel")
    public static final MOpendoormodel MOpendoormodel = new MOpendoormodel();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.861+08:00", comments="Source field: M_OpenDoorModel.id")
    public static final SqlColumn<Integer> id = MOpendoormodel.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.862+08:00", comments="Source field: M_OpenDoorModel.devcnum")
    public static final SqlColumn<Integer> devcnum = MOpendoormodel.devcnum;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.862+08:00", comments="Source field: M_OpenDoorModel.OpenMode")
    public static final SqlColumn<Integer> openmode = MOpendoormodel.openmode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.861+08:00", comments="Source Table: M_OpenDoorModel")
    public static final class MOpendoormodel extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> devcnum = column("devcnum", JDBCType.INTEGER);

        public final SqlColumn<Integer> openmode = column("OpenMode", JDBCType.INTEGER);

        public MOpendoormodel() {
            super("M_OpenDoorModel");
        }
    }
}