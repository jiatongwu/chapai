package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MycaozuoyuangroupDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import cn.xvkang.primaryentity.Mycaozuoyuangroup;
import java.util.List;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.delete.DeleteDSL;
import org.mybatis.dynamic.sql.delete.MyBatis3DeleteModelAdapter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.MyBatis3SelectModelAdapter;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectDSL;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.MyBatis3UpdateModelAdapter;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;

@Mapper
public interface MycaozuoyuangroupDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.665+08:00", comments="Source Table: MYCAOZUOYUANGROUP")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.665+08:00", comments="Source Table: MYCAOZUOYUANGROUP")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.665+08:00", comments="Source Table: MYCAOZUOYUANGROUP")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.groupno", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<Mycaozuoyuangroup> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.665+08:00", comments="Source Table: MYCAOZUOYUANGROUP")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MycaozuoyuangroupResult")
    Mycaozuoyuangroup selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.665+08:00", comments="Source Table: MYCAOZUOYUANGROUP")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MycaozuoyuangroupResult", value = {
        @Result(column="GroupNo", property="groupno", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="GroupName", property="groupname", jdbcType=JdbcType.VARCHAR),
        @Result(column="Remarks", property="remarks", jdbcType=JdbcType.VARCHAR)
    })
    List<Mycaozuoyuangroup> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.665+08:00", comments="Source Table: MYCAOZUOYUANGROUP")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.665+08:00", comments="Source Table: MYCAOZUOYUANGROUP")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(mycaozuoyuangroup);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.665+08:00", comments="Source Table: MYCAOZUOYUANGROUP")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, mycaozuoyuangroup);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.665+08:00", comments="Source Table: MYCAOZUOYUANGROUP")
    default int deleteByPrimaryKey(Integer groupno_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, mycaozuoyuangroup)
                .where(groupno, isEqualTo(groupno_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.665+08:00", comments="Source Table: MYCAOZUOYUANGROUP")
    default int insert(Mycaozuoyuangroup record) {
        return insert(SqlBuilder.insert(record)
                .into(mycaozuoyuangroup)
                .map(groupname).toProperty("groupname")
                .map(remarks).toProperty("remarks")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.665+08:00", comments="Source Table: MYCAOZUOYUANGROUP")
    default int insertSelective(Mycaozuoyuangroup record) {
        return insert(SqlBuilder.insert(record)
                .into(mycaozuoyuangroup)
                .map(groupname).toPropertyWhenPresent("groupname", record::getGroupname)
                .map(remarks).toPropertyWhenPresent("remarks", record::getRemarks)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.665+08:00", comments="Source Table: MYCAOZUOYUANGROUP")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Mycaozuoyuangroup>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, groupno, groupname, remarks)
                .from(mycaozuoyuangroup);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.665+08:00", comments="Source Table: MYCAOZUOYUANGROUP")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Mycaozuoyuangroup>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, groupno, groupname, remarks)
                .from(mycaozuoyuangroup);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.665+08:00", comments="Source Table: MYCAOZUOYUANGROUP")
    default Mycaozuoyuangroup selectByPrimaryKey(Integer groupno_) {
        return SelectDSL.selectWithMapper(this::selectOne, groupno, groupname, remarks)
                .from(mycaozuoyuangroup)
                .where(groupno, isEqualTo(groupno_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.665+08:00", comments="Source Table: MYCAOZUOYUANGROUP")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Mycaozuoyuangroup record) {
        return UpdateDSL.updateWithMapper(this::update, mycaozuoyuangroup)
                .set(groupname).equalTo(record::getGroupname)
                .set(remarks).equalTo(record::getRemarks);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.666+08:00", comments="Source Table: MYCAOZUOYUANGROUP")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Mycaozuoyuangroup record) {
        return UpdateDSL.updateWithMapper(this::update, mycaozuoyuangroup)
                .set(groupname).equalToWhenPresent(record::getGroupname)
                .set(remarks).equalToWhenPresent(record::getRemarks);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.666+08:00", comments="Source Table: MYCAOZUOYUANGROUP")
    default int updateByPrimaryKey(Mycaozuoyuangroup record) {
        return UpdateDSL.updateWithMapper(this::update, mycaozuoyuangroup)
                .set(groupname).equalTo(record::getGroupname)
                .set(remarks).equalTo(record::getRemarks)
                .where(groupno, isEqualTo(record::getGroupno))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.666+08:00", comments="Source Table: MYCAOZUOYUANGROUP")
    default int updateByPrimaryKeySelective(Mycaozuoyuangroup record) {
        return UpdateDSL.updateWithMapper(this::update, mycaozuoyuangroup)
                .set(groupname).equalToWhenPresent(record::getGroupname)
                .set(remarks).equalToWhenPresent(record::getRemarks)
                .where(groupno, isEqualTo(record::getGroupno))
                .build()
                .execute();
    }
}