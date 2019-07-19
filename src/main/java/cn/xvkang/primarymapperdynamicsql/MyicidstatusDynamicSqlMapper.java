package cn.xvkang.primarymapperdynamicsql;

import static cn.xvkang.primarymapperdynamicsql.MyicidstatusDynamicSqlSupport.*;

import cn.xvkang.primaryentity.Myicidstatus;
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
public interface MyicidstatusDynamicSqlMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.721+08:00", comments="Source Table: MYICIDSTATUS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.721+08:00", comments="Source Table: MYICIDSTATUS")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.721+08:00", comments="Source Table: MYICIDSTATUS")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Myicidstatus> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.721+08:00", comments="Source Table: MYICIDSTATUS")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MyicidstatusResult", value = {
        @Result(column="CardState", property="cardstate", jdbcType=JdbcType.VARCHAR),
        @Result(column="CardState2", property="cardstate2", jdbcType=JdbcType.VARCHAR)
    })
    List<Myicidstatus> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.721+08:00", comments="Source Table: MYICIDSTATUS")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.721+08:00", comments="Source Table: MYICIDSTATUS")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(myicidstatus);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.721+08:00", comments="Source Table: MYICIDSTATUS")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, myicidstatus);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.721+08:00", comments="Source Table: MYICIDSTATUS")
    default int insert(Myicidstatus record) {
        return insert(SqlBuilder.insert(record)
                .into(myicidstatus)
                .map(cardstate).toProperty("cardstate")
                .map(cardstate2).toProperty("cardstate2")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.721+08:00", comments="Source Table: MYICIDSTATUS")
    default int insertSelective(Myicidstatus record) {
        return insert(SqlBuilder.insert(record)
                .into(myicidstatus)
                .map(cardstate).toPropertyWhenPresent("cardstate", record::getCardstate)
                .map(cardstate2).toPropertyWhenPresent("cardstate2", record::getCardstate2)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.721+08:00", comments="Source Table: MYICIDSTATUS")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myicidstatus>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, cardstate, cardstate2)
                .from(myicidstatus);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.721+08:00", comments="Source Table: MYICIDSTATUS")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<Myicidstatus>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, cardstate, cardstate2)
                .from(myicidstatus);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.721+08:00", comments="Source Table: MYICIDSTATUS")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(Myicidstatus record) {
        return UpdateDSL.updateWithMapper(this::update, myicidstatus)
                .set(cardstate).equalTo(record::getCardstate)
                .set(cardstate2).equalTo(record::getCardstate2);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-07-18T14:55:17.721+08:00", comments="Source Table: MYICIDSTATUS")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(Myicidstatus record) {
        return UpdateDSL.updateWithMapper(this::update, myicidstatus)
                .set(cardstate).equalToWhenPresent(record::getCardstate)
                .set(cardstate2).equalToWhenPresent(record::getCardstate2);
    }
}