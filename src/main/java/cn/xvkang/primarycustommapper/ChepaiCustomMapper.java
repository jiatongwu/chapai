package cn.xvkang.primarycustommapper;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;

import cn.xvkang.utils.Constants;

@Mapper
public interface ChepaiCustomMapper {
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	String selectMaxCarno(SelectStatementProvider selectStatement);
//	@Select("select max(reg_code) from signup where census = #{census}")
//	public Integer selectMaxRegCodeByCensue(String census);
//
//	@Select("select reg_code from signup where census = #{census}")
//	public List<Integer> selectAllRegCodeByCensue(String census);

	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	// @Results(id = "AutocphResult", value = { @Result(column = "CPH", property =
	// "cph", jdbcType = JdbcType.VARCHAR) })
	List<Map<String, Object>> selectMany(SelectStatementProvider selectStatement);

	@SelectProvider(type = ChepaiCustomMapperProvider.class, method = "findAll")
	public List<Map<String, Object>> findAll(@Param("params") Map<String, Object> params);

	class ChepaiCustomMapperProvider {
		@SuppressWarnings({ "unchecked", "unused" })
		public String findAll(Map<String, Object> para) {
			Map<String, Object> params = (Map<String, Object>) para.get("params");
			SQL sql = new SQL() {
				{
					SELECT("signup.*");
					// SELECT("GROUP_CONCAT(cr.name) checkRoomName");
					FROM("signup signup");
					// LEFT_OUTER_JOIN(" grade g on d.grade_id=g.id");
					// LEFT_OUTER_JOIN(" school sc on sc.id=g.school_id");

				}
			};

			/*
			 * personName personPhone cheBianma chexing chepaihao isInDate createTimeAsc
			 */
			String name = (String) params.get("name");
			if (StringUtils.isNotBlank(name)) {
				sql.WHERE("signup.name like #{params.name}");
			}
			String idcard = (String) params.get("idcard");
			if (StringUtils.isNotBlank(idcard)) {
				sql.WHERE("signup.idcard like #{params.idcard}");
			}
			String phone = (String) params.get("phone");
			if (StringUtils.isNotBlank(phone)) {
				sql.WHERE("signup.phone like #{params.phone}");
			}

			String regCode = (String) params.get("regCode");
			if (StringUtils.isNotBlank(regCode)) {
				sql.WHERE("signup.reg_code like #{params.regCode}");
			}

			String regCodeEnd = (String) params.get("regCodeEnd");
			if (StringUtils.isNotBlank(regCodeEnd) && StringUtils.isNumeric(regCodeEnd)) {
				sql.WHERE("signup.reg_code <= #{params.regCodeEnd}");
			}

			String regCodeStart = (String) params.get("regCodeStart");
			if (StringUtils.isNotBlank(regCodeStart) && StringUtils.isNumeric(regCodeStart)) {
				sql.WHERE("signup.reg_code >= #{params.regCodeStart}");
			}

			String census = (String) params.get("census");
			if (StringUtils.isNotBlank(census)) {
				sql.WHERE("signup.census = #{params.census}");
			}
			Date birthdayStart = (Date) params.get("birthdayStart");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

			if (birthdayStart != null) {
				sql.WHERE("signup.create_time >= #{params.birthdayStart}");
			}
			Date birthdayEnd = (Date) params.get("birthdayEnd");
			if (birthdayEnd != null) {
				sql.WHERE("signup.create_time <= #{params.birthdayEnd}");
			}

			String chushenStatus = (String) params.get("chushenStatus");
			if (StringUtils.isNotBlank(chushenStatus)) {
				Integer chushenStatusInt = Integer.parseInt(chushenStatus);
				if (Constants.FIRST_TRIAL_STATUS.初审通过.getStatus() == chushenStatusInt.intValue()) {
					sql.WHERE("signup.first_trial = #{params.chushenStatus}");
				} else if (Constants.FIRST_TRIAL_STATUS.初审不通过.getStatus() == chushenStatusInt.intValue()) {
					sql.WHERE("signup.first_trial = #{params.chushenStatus}");
				} else {
					sql.WHERE("signup.first_trial is null");
				}
			}
			String isRegCodeDeleted = (String) params.get("isRegCodeDeleted");
			if (StringUtils.isNotBlank(isRegCodeDeleted)) {
				if ("1".equals(isRegCodeDeleted)) {
					sql.WHERE("signup.reg_code is null");
				} else if ("0".equals(isRegCodeDeleted)) {
					sql.WHERE("signup.reg_code is not null");
				}
			}
			String createTimeAsc = (String) params.get("createTimeAsc");
			if (StringUtils.isNotBlank(createTimeAsc)) {
				if ("1".equals(createTimeAsc)) {
					sql.ORDER_BY("signup.create_time asc");
				} else if ("0".equals(createTimeAsc)) {
					sql.ORDER_BY("signup.create_time desc");
				}
			}

			return sql.toString();
		}

	}

}
