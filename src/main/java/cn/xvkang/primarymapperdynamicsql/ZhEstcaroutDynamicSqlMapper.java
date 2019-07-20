package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.ZhEstcaroutDynamicSqlSupport.*;

import cn.xvkang.primaryentity.ZhEstcarout;
import java.util.List;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
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
public interface ZhEstcaroutDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.542+08:00", comments="Source Table: zh_EstCarOut")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.542+08:00", comments="Source Table: zh_EstCarOut")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.542+08:00", comments="Source Table: zh_EstCarOut")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT SCOPE_IDENTITY()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<ZhEstcarout> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.542+08:00", comments="Source Table: zh_EstCarOut")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ZhEstcaroutResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER),
        @Result(column="orderNo", property="orderno", jdbcType=JdbcType.VARCHAR),
        @Result(column="carNo", property="carno", jdbcType=JdbcType.VARCHAR),
        @Result(column="carType", property="cartype", jdbcType=JdbcType.VARCHAR),
        @Result(column="outTime", property="outtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="imgpath", property="imgpath", jdbcType=JdbcType.VARCHAR),
        @Result(column="gateName", property="gatename", jdbcType=JdbcType.VARCHAR),
        @Result(column="ctlNo", property="ctlno", jdbcType=JdbcType.INTEGER),
        @Result(column="synflag", property="synflag", jdbcType=JdbcType.INTEGER)
    })
    List<ZhEstcarout> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.542+08:00", comments="Source Table: zh_EstCarOut")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.542+08:00", comments="Source Table: zh_EstCarOut")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(zhEstcarout);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.542+08:00", comments="Source Table: zh_EstCarOut")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, zhEstcarout);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.542+08:00", comments="Source Table: zh_EstCarOut")
    default int insert(ZhEstcarout record) {
        return insert(SqlBuilder.insert(record)
                .into(zhEstcarout)
                .map(orderno).toProperty("orderno")
                .map(carno).toProperty("carno")
                .map(cartype).toProperty("cartype")
                .map(outtime).toProperty("outtime")
                .map(imgpath).toProperty("imgpath")
                .map(gatename).toProperty("gatename")
                .map(ctlno).toProperty("ctlno")
                .map(synflag).toProperty("synflag")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.542+08:00", comments="Source Table: zh_EstCarOut")
    default int insertSelective(ZhEstcarout record) {
        return insert(SqlBuilder.insert(record)
                .into(zhEstcarout)
                .map(orderno).toPropertyWhenPresent("orderno", record::getOrderno)
                .map(carno).toPropertyWhenPresent("carno", record::getCarno)
                .map(cartype).toPropertyWhenPresent("cartype", record::getCartype)
                .map(outtime).toPropertyWhenPresent("outtime", record::getOuttime)
                .map(imgpath).toPropertyWhenPresent("imgpath", record::getImgpath)
                .map(gatename).toPropertyWhenPresent("gatename", record::getGatename)
                .map(ctlno).toPropertyWhenPresent("ctlno", record::getCtlno)
                .map(synflag).toPropertyWhenPresent("synflag", record::getSynflag)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.542+08:00", comments="Source Table: zh_EstCarOut")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ZhEstcarout>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, orderno, carno, cartype, outtime, imgpath, gatename, ctlno, synflag)
                .from(zhEstcarout);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.542+08:00", comments="Source Table: zh_EstCarOut")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<ZhEstcarout>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, orderno, carno, cartype, outtime, imgpath, gatename, ctlno, synflag)
                .from(zhEstcarout);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.542+08:00", comments="Source Table: zh_EstCarOut")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(ZhEstcarout record) {
        return UpdateDSL.updateWithMapper(this::update, zhEstcarout)
                .set(orderno).equalTo(record::getOrderno)
                .set(carno).equalTo(record::getCarno)
                .set(cartype).equalTo(record::getCartype)
                .set(outtime).equalTo(record::getOuttime)
                .set(imgpath).equalTo(record::getImgpath)
                .set(gatename).equalTo(record::getGatename)
                .set(ctlno).equalTo(record::getCtlno)
                .set(synflag).equalTo(record::getSynflag);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-19T09:31:22.542+08:00", comments="Source Table: zh_EstCarOut")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(ZhEstcarout record) {
        return UpdateDSL.updateWithMapper(this::update, zhEstcarout)
                .set(orderno).equalToWhenPresent(record::getOrderno)
                .set(carno).equalToWhenPresent(record::getCarno)
                .set(cartype).equalToWhenPresent(record::getCartype)
                .set(outtime).equalToWhenPresent(record::getOuttime)
                .set(imgpath).equalToWhenPresent(record::getImgpath)
                .set(gatename).equalToWhenPresent(record::getGatename)
                .set(ctlno).equalToWhenPresent(record::getCtlno)
                .set(synflag).equalToWhenPresent(record::getSynflag);
    }
}