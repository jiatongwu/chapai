package cn.xvkang.utils;

import java.util.ArrayList;
import java.util.List;

public class Constants {

	// 所有redis存放的值前缀
	// public static final String REDIS_PREFIX = "fuxing:";
	// jwt相关的redis key 前缘
	public static final String REDIS_JWT_PREFIX = "jwt:";
	public static final String PHONE_JWT_SET_SUFFIX = "_JWT_SET";
	public static final String MOBILE_LOGIN_PARAMETER = "mobile";

	public static final String JWT_ISSUER = "template_signup";

	public static final String CONFIG_TABLE_NAME = "config";
	public static final String MF_FENGSHUDUAN_TABLE_NAME = "mfFengshuduan";
	// 前多少名2档设置
	public static final String FIRST_TOP_KEY = "firstTop";
	public static final String SECOND_TOP_KEY = "secondTop";

	public static final String SPORT_SCORE_SUFFIX = "_Sport_Sco";
	public static final String SCOREAll_SUFFIX = "_ScoAll";
	// 这个表不能用
	// public static final String SCOREAll_TEMP_SUFFIX = "_ScoAll_Temp";
	public static final String STUINFO_SUFFIX = "_Stu_info";
	public static final String SUB_SUFFIX = "_Sub";
	public static final String SUB_EXT_SUFFIX = "_Sub_Ext";
	public static final String TEACHER_SUFFIX = "_Teacher_Java";
	public static final String XM_SUB_MF_SUFFIX = "_Xm_Sub_Mf";

	// 文件下载时用到的MIME类型
	public static final String EXCEL_XLSX_MIMETYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
	public static final String WORD_DOC_MIME = "application/msword";
	public static final String EXCEL_XLS_MIME = "application/vnd.ms-excel";
	public static final String WORD_DOCX_MIME = "application/vnd.openxmlformats-officedocument.wordprocessingml.document";

	// 验证码相关常量
	public static final String DEFAULT_PARAMETER_NAME_MOBILE = "mobile";
	public static final String SMS_VALIDAE_PREFIX_NAME = "sms";
	public static final String IMAGE_VALIDAE_PREFIX_NAME = "image";

	public static final String DEFAULT_MOBILE_PROCESS_URL = "/mobileLoginProcessingUrl";

	public static enum CENSUE_NAME_ENUM {
		农业户籍或县域外户籍("农业户籍或外县域户籍"), 非农业户籍("非农业户籍");
		private String name;

		CENSUE_NAME_ENUM(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public static List<String> getAll() {
			List<String> result = new ArrayList<>();
			CENSUE_NAME_ENUM[] values = CENSUE_NAME_ENUM.values();
			for (CENSUE_NAME_ENUM value : values) {
				result.add(value.getName());
			}
			return result;
		}
	}

	public static enum DEFAULT_USER_NAME {
		管理员("管理员");
		private String name;

		DEFAULT_USER_NAME(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public static List<String> getAll() {
			List<String> result = new ArrayList<>();
			CENSUE_NAME_ENUM[] values = CENSUE_NAME_ENUM.values();
			for (CENSUE_NAME_ENUM value : values) {
				result.add(value.getName());
			}
			return result;
		}
	}

	public static enum FIRST_TRIAL_STATUS {
		初审通过(1, "初审通过"), 初审不通过(2, "初审不通过");
		private int status;
		private String name;

		FIRST_TRIAL_STATUS(int status, String name) {
			this.status = status;
			this.name = name;
		}

		public int getStatus() {
			return status;
		}

		public void setStatus(int status) {
			this.status = status;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public static List<FIRST_TRIAL_STATUS> getAll() {
			List<FIRST_TRIAL_STATUS> result = new ArrayList<>();
			FIRST_TRIAL_STATUS[] values = FIRST_TRIAL_STATUS.values();
			for (FIRST_TRIAL_STATUS value : values) {
				result.add(value);
			}
			return result;
		}
	}

	public static enum LOG_MESSAGE_KEY_ENUM {
		人员删除("人员删除"), 添加车牌("添加车牌"), 批量导入车牌("批量导入车牌"), 车牌延期("车牌延期"), 车牌删除("车牌删除");
		private String name;

		LOG_MESSAGE_KEY_ENUM(String name) {

			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public static List<String> getAll() {
			List<String> result = new ArrayList<>();
			LOG_MESSAGE_KEY_ENUM[] values = LOG_MESSAGE_KEY_ENUM.values();
			for (LOG_MESSAGE_KEY_ENUM value : values) {
				result.add(value.getName());
			}
			return result;
		}
	}

	public static enum ReturnCode {
		成功(0, "执行成功"), 参数错误(1, "参数错误"), 未认证(2, "未认证"), 未授权(3, "未授权"), 服务器内部错误(5, "服务器内部错误"), 其他错误(4, "其他错误"),
		账号不存在(6, "账号不存在"), 密码错误(7, "密码错误"), 您已经登录了不能再次登录(8, "您已经登录了不能再次登录"), 该用户已注册(9, "该用户已注册"),
		扫码登录时_登录失败提示信息_这种情况不应该出现(10, "扫码登录失败,这种情况不应该出现，因为如果超时了前端就应该提示重新获取验证码，让用户重新扫"), 刚注册的用户不允许登录(11, "刚注册的用户不允许登录"),
		验证码错误(12, "验证码错误"), 登录失败(15, "登录失败"), 短信验证码发送失败(16, "短信验证码发送失败"), 找不到(404, "迷路了"), 您被挤掉线了(17, "您被挤掉线了"),
		用户名或密码错误(18, "用户名或密码错误"), 用户名或短信验证码错误(18, "用户名或短信验证码错误"), 账号被禁用(19, "账号被禁用"),;

		private Integer code;
		private String message;

		ReturnCode(Integer code, String message) {
			this.code = code;
			this.message = message;
		}

		public Integer getCode() {
			return this.code;
		}

		public String getMessage() {
			return this.message;
		}
	}

	public static enum DEFAULT_ROLES_ENUM_FUXING {
		学生家长角色("student_parent"), 学校管理员角色("school_manager");
		private String code;

		DEFAULT_ROLES_ENUM_FUXING(String code) {
			this.code = code;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

	}

	public static enum DEFAULT_ROLES_ENUM {
		管理员("admin_user"), 普通用户("normal_user"), 超级管理员("super_admin");
		private String code;

		DEFAULT_ROLES_ENUM(String code) {
			this.code = code;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

	}
}
