package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class InoutpermitionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.664+08:00", comments="Source Table: InOutPermition")
    public static final Inoutpermition inoutpermition = new Inoutpermition();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.665+08:00", comments="Source field: InOutPermition.ID")
    public static final SqlColumn<Integer> id = inoutpermition.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.665+08:00", comments="Source field: InOutPermition.CtrlNumbers")
    public static final SqlColumn<String> ctrlnumbers = inoutpermition.ctrlnumbers;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.665+08:00", comments="Source field: InOutPermition.CardTypes")
    public static final SqlColumn<String> cardtypes = inoutpermition.cardtypes;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.665+08:00", comments="Source field: InOutPermition.WeekDays")
    public static final SqlColumn<String> weekdays = inoutpermition.weekdays;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.665+08:00", comments="Source field: InOutPermition.TimeBegin")
    public static final SqlColumn<Date> timebegin = inoutpermition.timebegin;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.665+08:00", comments="Source field: InOutPermition.TimeEnd")
    public static final SqlColumn<Date> timeend = inoutpermition.timeend;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-14T17:27:27.664+08:00", comments="Source Table: InOutPermition")
    public static final class Inoutpermition extends SqlTable {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<String> ctrlnumbers = column("CtrlNumbers", JDBCType.VARCHAR);

        public final SqlColumn<String> cardtypes = column("CardTypes", JDBCType.VARCHAR);

        public final SqlColumn<String> weekdays = column("WeekDays", JDBCType.VARCHAR);

        public final SqlColumn<Date> timebegin = column("TimeBegin", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> timeend = column("TimeEnd", JDBCType.TIMESTAMP);

        public Inoutpermition() {
            super("InOutPermition");
        }
    }
}