package cn.xvkang.primarycustommapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;

@Mapper
public interface SendSmsLogCustomMapper {
//	@Select("select max(reg_code) from signup where census = #{census}")
//	public Integer selectMaxRegCodeByCensue(String census);
//
//	@Select("select reg_code from signup where census = #{census}")
//	public List<Integer> selectAllRegCodeByCensue(String census);

	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	// @Results(id = "AutocphResult", value = { @Result(column = "CPH", property =
	// "cph", jdbcType = JdbcType.VARCHAR) })
	List<Map<String, Object>> selectMany(SelectStatementProvider selectStatement);

}
