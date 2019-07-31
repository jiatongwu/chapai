package cn.xvkang.primarycustommapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;

@Mapper
public interface UserCustomMapper {

	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	// @Results(id = "AutocphResult", value = { @Result(column = "CPH", property =
	// "cph", jdbcType = JdbcType.VARCHAR) })
	List<Map<String, Object>> selectMany(SelectStatementProvider selectStatement);

}
