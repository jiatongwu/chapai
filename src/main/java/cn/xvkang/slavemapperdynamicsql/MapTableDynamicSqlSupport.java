package cn.xvkang.slavemapperdynamicsql;

import java.sql.JDBCType;

import javax.annotation.Generated;

import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MapTableDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.551+08:00", comments="Source Table: map_table")
    public static final MapTable mapTable = new MapTable();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.551+08:00", comments="Source field: map_table.id")
    public static final SqlColumn<Integer> id = mapTable.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.552+08:00", comments="Source field: map_table.key")
    public static final SqlColumn<String> key = mapTable.key;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.552+08:00", comments="Source field: map_table.value")
    public static final SqlColumn<String> value = mapTable.value;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-05T19:11:32.551+08:00", comments="Source Table: map_table")
    public static final class MapTable extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> key = column("`key`", JDBCType.VARCHAR);

        public final SqlColumn<String> value = column("`value`", JDBCType.VARCHAR);

        public MapTable() {
            super("map_table");
        }
    }
}