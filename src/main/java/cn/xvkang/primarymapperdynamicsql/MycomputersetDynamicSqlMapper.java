package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MycomputersetDynamicSqlSupport.*;

import cn.xvkang.primaryentity.Mycomputerset;
import java.util.List;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
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
public interface MycomputersetDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.245+08:00", comments="Source Table: MYCOMPUTERSET")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.245+08:00", comments="Source Table: MYCOMPUTERSET")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.245+08:00", comments="Source Table: MYCOMPUTERSET")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Mycomputerset> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.245+08:00", comments="Source Table: MYCOMPUTERSET")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MycomputersetResult", value = {
        @Result(column="PCName", property="pcname", jdbcType=JdbcType.VARCHAR),
        @Result(column="CtrlNumber", property="ctrlnumber", jdbcType=JdbcType.INTEGER)
    })
    List<Mycomputerset> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.245+08:00", comments="Source Table: MYCOMPUTERSET")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.245+08:00", comments="Source Table: MYCOMPUTERSET")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(mycomputerset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.245+08:00", comments="Source Table: MYCOMPUTERSET")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, mycomputerset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.245+08:00", comments="Source Table: MYCOMPUTERSET")
    default int insert(Mycomputerset record) {
        return insert(SqlBuilder.insert(record)
                .into(mycomputerset)
                .map(pcname).toProperty("pcname")
                .map(ctrlnumber).toProperty("ctrlnumber")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.245+08:00", comments="Source Table: MYCOMPUTERSET")
    default int insertSelective(Mycomputerset record) {
        return insert(SqlBuilder.insert(record)
                .into(mycomputerset)
                .map(pcname).toPropertyWhenPresent("pcname", record::getPcname)
                .map(ctrlnumber).toPropertyWhenPresent("ctrlnumber", record::getCtrlnumber)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.245+08:00", comments="Source Table: MYCOMPUTERSET")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Mycomputerset>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, pcname, ctrlnumber)
                .from(mycomputerset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.245+08:00", comments="Source Table: MYCOMPUTERSET")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Mycomputerset>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, pcname, ctrlnumber)
                .from(mycomputerset);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.245+08:00", comments="Source Table: MYCOMPUTERSET")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Mycomputerset record) {
        return UpdateDSL.updateWithMapper(this::update, mycomputerset)
                .set(pcname).equalTo(record::getPcname)
                .set(ctrlnumber).equalTo(record::getCtrlnumber);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.245+08:00", comments="Source Table: MYCOMPUTERSET")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Mycomputerset record) {
        return UpdateDSL.updateWithMapper(this::update, mycomputerset)
                .set(pcname).equalToWhenPresent(record::getPcname)
                .set(ctrlnumber).equalToWhenPresent(record::getCtrlnumber);
    }
}