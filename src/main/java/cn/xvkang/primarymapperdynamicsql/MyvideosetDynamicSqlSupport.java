package cn.xvkang.primarymapperdynamicsql;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MyvideosetDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.339+08:00", comments="Source Table: MYVideoSet")
    public static final Myvideoset myvideoset = new Myvideoset();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.339+08:00", comments="Source field: MYVideoSet.ID")
    public static final SqlColumn<Integer> id = myvideoset.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.339+08:00", comments="Source field: MYVideoSet.VideoIP")
    public static final SqlColumn<String> videoip = myvideoset.videoip;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.339+08:00", comments="Source field: MYVideoSet.VideoPort")
    public static final SqlColumn<String> videoport = myvideoset.videoport;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.339+08:00", comments="Source field: MYVideoSet.VideoUserName")
    public static final SqlColumn<String> videousername = myvideoset.videousername;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.339+08:00", comments="Source field: MYVideoSet.VideoPassWord")
    public static final SqlColumn<String> videopassword = myvideoset.videopassword;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.339+08:00", comments="Source field: MYVideoSet.PCName")
    public static final SqlColumn<String> pcname = myvideoset.pcname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.339+08:00", comments="Source field: MYVideoSet.VideoType")
    public static final SqlColumn<String> videotype = myvideoset.videotype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.339+08:00", comments="Source Table: MYVideoSet")
    public static final class Myvideoset extends SqlTable {
        public final SqlColumn<Integer> id = column("ID", JDBCType.INTEGER);

        public final SqlColumn<String> videoip = column("VideoIP", JDBCType.VARCHAR);

        public final SqlColumn<String> videoport = column("VideoPort", JDBCType.VARCHAR);

        public final SqlColumn<String> videousername = column("VideoUserName", JDBCType.VARCHAR);

        public final SqlColumn<String> videopassword = column("VideoPassWord", JDBCType.VARCHAR);

        public final SqlColumn<String> pcname = column("PCName", JDBCType.VARCHAR);

        public final SqlColumn<String> videotype = column("VideoType", JDBCType.VARCHAR);

        public Myvideoset() {
            super("MYVideoSet");
        }
    }
}