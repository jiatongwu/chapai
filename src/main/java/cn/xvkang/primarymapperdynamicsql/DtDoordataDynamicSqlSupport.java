package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class DtDoordataDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.607+08:00", comments="Source Table: Dt_DoorData")
    public static final DtDoordata dtDoordata = new DtDoordata();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.608+08:00", comments="Source field: Dt_DoorData.DevcNo")
    public static final SqlColumn<Integer> devcno = dtDoordata.devcno;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.608+08:00", comments="Source field: Dt_DoorData.Place")
    public static final SqlColumn<String> place = dtDoordata.place;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.608+08:00", comments="Source field: Dt_DoorData.DevcType")
    public static final SqlColumn<Integer> devctype = dtDoordata.devctype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.608+08:00", comments="Source field: Dt_DoorData.DevcIpadress")
    public static final SqlColumn<String> devcipadress = dtDoordata.devcipadress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.608+08:00", comments="Source field: Dt_DoorData.TxType")
    public static final SqlColumn<Integer> txtype = dtDoordata.txtype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.608+08:00", comments="Source Table: Dt_DoorData")
    public static final class DtDoordata extends SqlTable {
        public final SqlColumn<Integer> devcno = column("DevcNo", JDBCType.INTEGER);

        public final SqlColumn<String> place = column("Place", JDBCType.VARCHAR);

        public final SqlColumn<Integer> devctype = column("DevcType", JDBCType.INTEGER);

        public final SqlColumn<String> devcipadress = column("DevcIpadress", JDBCType.VARCHAR);

        public final SqlColumn<Integer> txtype = column("TxType", JDBCType.INTEGER);

        public DtDoordata() {
            super("Dt_DoorData");
        }
    }
}