package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MyphotoimageDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.297+08:00", comments="Source Table: MYPHOTOIMAGE")
    public static final Myphotoimage myphotoimage = new Myphotoimage();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.297+08:00", comments="Source field: MYPHOTOIMAGE.PicIndex")
    public static final SqlColumn<String> picindex = myphotoimage.picindex;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.297+08:00", comments="Source field: MYPHOTOIMAGE.PicTime")
    public static final SqlColumn<Date> pictime = myphotoimage.pictime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.297+08:00", comments="Source field: MYPHOTOIMAGE.PicContent")
    public static final SqlColumn<byte[]> piccontent = myphotoimage.piccontent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.297+08:00", comments="Source Table: MYPHOTOIMAGE")
    public static final class Myphotoimage extends SqlTable {
        public final SqlColumn<String> picindex = column("PicIndex", JDBCType.VARCHAR);

        public final SqlColumn<Date> pictime = column("PicTime", JDBCType.TIMESTAMP);

        public final SqlColumn<byte[]> piccontent = column("PicContent", JDBCType.BLOB);

        public Myphotoimage() {
            super("MYPHOTOIMAGE");
        }
    }
}