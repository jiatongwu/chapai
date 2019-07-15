package cn.xvkang.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageImpl;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.xvkang.dto.MyUserDetails;
import cn.xvkang.primaryentity.Log;
import cn.xvkang.primaryentity.UserCarCreate;
import cn.xvkang.primaryentity.UserPersonCreate;
import cn.xvkang.primaryentity.UserTable;
import cn.xvkang.primarymapperdynamicsql.LogDynamicSqlSupport;
import cn.xvkang.primarymapperdynamicsql.UserCarCreateDynamicSqlSupport;
import cn.xvkang.primarymapperdynamicsql.UserPersonCreateDynamicSqlSupport;
import cn.xvkang.primarymapperdynamicsql.UserTableDynamicSqlSupport;
import cn.xvkang.service.LogService;
import cn.xvkang.service.UserCarCreateService;
import cn.xvkang.service.UserPersonCreateService;
import cn.xvkang.service.UserService;
import cn.xvkang.utils.Constants;
import cn.xvkang.utils.RandomStringUtil;

@Controller
@RequestMapping("/user")
//@PermissionAnnotation(code = "student_directory", describe = "学生管理", name = "学生管理", parentCode = "parent_directory", type = 0, url = "")
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private LogService logService;
	@Autowired
	private UserCarCreateService userCarCreateService;
	@Autowired
	private UserPersonCreateService userPersonCreateService;
	@Autowired
	private PasswordEncoder passwordEncoder;

	@GetMapping("/selectAll")
	@ResponseBody
	// @PermissionAnnotation(code = "student_list_menu",describe = "学生列表",name =
	// "学生列表",parentCode = "student_directory",type = 1,url =
	// "/browser/user/listPage,/browser/user/selectAll",isFirst = false)
	public PageImpl<UserTable> selectAll(@RequestParam Map<String, Object> params,
			@RequestParam(name = "page", defaultValue = "1", required = false) Integer pageNumber,
			@RequestParam(name = "limit", defaultValue = "10", required = false) Integer pageSize) {
		PageImpl<UserTable> selectAll = userService.selectAll(params, pageNumber, pageSize);
		return selectAll;
	}

	@GetMapping("/listPage.html")
	// @PermissionAnnotation(code = "student_list_menu",describe = "学生列表",name =
	// "学生列表",parentCode = "student_directory",type = 1,url =
	// "/browser/user/listPage,/browser/user/selectAll",isFirst = true)
	public String list(HttpServletRequest request) {
		return "user/user_listPage";
	}

//	@GetMapping("/viewPage")
//	@PermissionAnnotation(code = "student_",describe = "学生",name = "学生",parentCode = "student_list_menu",type = 2,url = "",isFirst = false)
//	public String viewPage(HttpServletRequest request, String id) {
////		User findById = userService.findById(Integer.parseInt(id));
////		request.setAttribute("xm", findById);
//		return "user/viewPage";
//	}
	// @PermissionAnnotation(code = "student_add",describe = "新增学生",name =
	// "新增学生",parentCode = "student_list_menu",type = 2,url = "",isFirst = false)
	@GetMapping("/addPage.html")
	public String addPage(HttpServletRequest request, String id) {
//		User findById = userService.findById(Integer.parseInt(id));
//		request.setAttribute("xm", findById);
		return "user/user_addPage";
	}

	// @PermissionAnnotation(code = "student_add",describe = "新增学生",name =
	// "新增学生",parentCode = "student_list_menu",type = 2,url = "",isFirst = false)
	@PostMapping("/add")
	@ResponseBody
	public Map<String, Object> add(HttpServletRequest request, @RequestParam Map<String, Object> params) {
//		User findById = userService.findById(Integer.parseInt(id));
//		request.setAttribute("xm", findById);

		Map<String, Object> result = new HashMap<String, Object>();
		List<String> message = new ArrayList<String>();
		result.put("message", message);
		result.put("code", Constants.ReturnCode.成功.getCode());

		String username = (String) params.get("username");
		String password = (String) params.get("password");
		String password2 = (String) params.get("password2");

		if (!password2.equals(password)) {
			result.put("code", Constants.ReturnCode.参数错误.getCode());
			message.add("2次密码输入的不一致");
		}

		SelectStatementProvider render = SqlBuilder.select(UserTableDynamicSqlSupport.userTable.allColumns())
				.from(UserTableDynamicSqlSupport.userTable, "userTable")
				.where(UserTableDynamicSqlSupport.username, SqlBuilder.isEqualTo(username)).build()
				.render(RenderingStrategy.MYBATIS3);
		List<UserTable> students = userService.findByExample(render);
		if (students.size() > 0) {
			result.put("code", Constants.ReturnCode.参数错误.getCode());
			message.add("用户名已经存在，请更换一个用户名");
		}
		int code = (Integer) result.get("code");
		if (code == 0) {
			int i = userService.add(params);
			if (i <= 0) {
				result.put("code", Constants.ReturnCode.服务器内部错误.getCode());
				message.add("新增失败");
			}
		}

		return result;
	}

	// @PermissionAnnotation(code = "student_edit",describe = "编辑学生",name =
	// "编辑学生",parentCode = "student_list_menu",type = 2,url = "",isFirst = false)
	@GetMapping("/editPage.html")
	public String editPage(HttpServletRequest request, String id) {
//		User findById = userService.findById(Integer.parseInt(id));
//		request.setAttribute("xm", findById);
		request.setAttribute("user", userService.findById(Integer.parseInt(id)));
		return "user/user_editPage";
	}

	// @PermissionAnnotation(code = "student_edit",describe = "编辑学生",name =
	// "编辑学生",parentCode = "student_list_menu",type = 2,url = "",isFirst = false)
	@PostMapping("/edit")
	@ResponseBody
	public Map<String, Object> edit(HttpServletRequest request, @RequestParam Map<String, Object> params) {
//		User findById = userService.findById(Integer.parseInt(id));
//		request.setAttribute("xm", findById);

		Map<String, Object> result = new HashMap<String, Object>();
		List<String> message = new ArrayList<String>();
		result.put("message", message);
		result.put("code", Constants.ReturnCode.成功.getCode());

		int code = (Integer) result.get("code");
		if (code == 0) {
			int i = userService.edit(params);
			if (i <= 0) {
				result.put("code", Constants.ReturnCode.服务器内部错误.getCode());
				message.add("修改失败");
			}
		}
		return result;
	}

	// @PermissionAnnotation(code = "student_delete",describe = "删除学生",name =
	// "删除学生",parentCode = "student_list_menu",type = 2,url = "",isFirst = false)
	@PostMapping("/delete")
	@ResponseBody
	public Map<String, Object> delete(HttpServletRequest request, @RequestParam Map<String, Object> params) {
//		User findById = userService.findById(Integer.parseInt(id));
//		request.setAttribute("xm", findById);

		Map<String, Object> result = new HashMap<String, Object>();
		List<String> message = new ArrayList<String>();
		result.put("message", message);
		result.put("code", Constants.ReturnCode.成功.getCode());
		Integer id = Integer.parseInt((String) params.get("id"));
		if (((Integer) result.get("code")) == 0) {
			SelectStatementProvider renderlog = SqlBuilder.select(LogDynamicSqlSupport.log.allColumns())
					.from(LogDynamicSqlSupport.log, "log").where(LogDynamicSqlSupport.userId, SqlBuilder.isEqualTo(id))
					.build().render(RenderingStrategy.MYBATIS3);
			List<Log> logs = logService.findByExample(renderlog);
			if (logs.size() > 0) {
				result.put("code", Constants.ReturnCode.参数错误.getCode());
				message.add("此用户已经有相关记录了，不能删除，您可以禁用此用户。");
			}
		}
		UserTable oldUser = userService.findById(id);
		if (oldUser != null && oldUser.getUsername().equals(Constants.DEFAULT_USER_NAME.管理员.getName())) {
			result.put("code", Constants.ReturnCode.参数错误.getCode());
			message.add("管理员不能删除。");
		}
		if (((Integer) result.get("code")) == 0) {
			SelectStatementProvider renderUserCarCreate = SqlBuilder
					.select(UserCarCreateDynamicSqlSupport.userCarCreate.allColumns())
					.from(UserCarCreateDynamicSqlSupport.userCarCreate, "userCarCreate")
					.where(UserCarCreateDynamicSqlSupport.userId, SqlBuilder.isEqualTo(id)).build()
					.render(RenderingStrategy.MYBATIS3);
			List<UserCarCreate> userCarCreates = userCarCreateService.findByExample(renderUserCarCreate);
			if (userCarCreates.size() > 0) {
				result.put("code", Constants.ReturnCode.参数错误.getCode());
				message.add("此用户已经有相关记录了，不能删除，您可以禁用此用户。。");
			}
		}
		if (((Integer) result.get("code")) == 0) {
			SelectStatementProvider renderUserPersonCreate = SqlBuilder
					.select(UserPersonCreateDynamicSqlSupport.userPersonCreate.allColumns())
					.from(UserPersonCreateDynamicSqlSupport.userPersonCreate, "userPersonCreate")
					.where(UserPersonCreateDynamicSqlSupport.userId, SqlBuilder.isEqualTo(id)).build()
					.render(RenderingStrategy.MYBATIS3);
			List<UserPersonCreate> userPersonCreates = userPersonCreateService.findByExample(renderUserPersonCreate);
			if (userPersonCreates.size() > 0) {
				result.put("code", Constants.ReturnCode.参数错误.getCode());
				message.add("此用户已经有相关记录了，不能删除，您可以禁用此用户。。");
			}
		}

		int code = (Integer) result.get("code");
		if (code == 0) {
			int i = userService.delete(params);
			if (i <= 0) {
				result.put("code", Constants.ReturnCode.服务器内部错误.getCode());
				message.add("删除失败");
			}
		}

		return result;
	}

	// @PermissionAnnotation(code = "student_import",describe = "导入学生",name =
	// "导入学生",parentCode = "student_list_menu",type = 2,url = "",isFirst = false)
	@GetMapping("/importExcelPage.html")
	public String importSportScorePage(HttpServletRequest request) {

		return "user/user_importExcelPage";
	}

	// @PermissionAnnotation(code = "user_modifyPwd",describe = "用户修改密码",name =
	// "用户修改密码",parentCode = "user_list_menu",type = 2,url = "")
	@GetMapping("/modifyPwdPage.html")
	public String modifyPwdPage(HttpServletRequest request, Authentication authentication) {
		MyUserDetails principal = (MyUserDetails) authentication.getPrincipal();
		String username = principal.getUsername();
		request.setAttribute("username", username);

		return "user/user_modifyPwdPage";
	}

	// @PermissionAnnotation(code = "user_modifyPwd",describe = "用户修改密码",name =
	// "用户修改密码",parentCode = "user_list_menu",type = 2,url = "")
	@PostMapping("/modifyPwd")
	@ResponseBody
	public Map<String, Object> modifyPwd(String oldPassword, String password, HttpServletRequest request,
			Authentication authentication) {

		Map<String, Object> result = new HashMap<String, Object>();
		List<String> message = new ArrayList<String>();
		result.put("message", message);
		result.put("code", Constants.ReturnCode.成功.getCode());

		MyUserDetails principal = (MyUserDetails) authentication.getPrincipal();
		String username = principal.getUsername();
		UserTable oldUser = userService.findByUsername(username);

		if (oldUser != null && password != null) {
			if (!passwordEncoder.matches(oldPassword, oldUser.getPassword())) {
				// 旧密码不正确
				result.put("code", Constants.ReturnCode.参数错误.getCode());
				message.add("旧密码不正确");
			}
		}
		if (((Integer) result.get("code")) == 0) {
			userService.modifyPwd(oldUser.getId(), password);
		}
		return result;
	}

	@PostMapping("/disabled")
	@ResponseBody
	public Map<String, Object> disabled(String id, String disabled, HttpServletRequest request) {

		Map<String, Object> result = new HashMap<String, Object>();
		List<String> message = new ArrayList<String>();
		result.put("message", message);
		result.put("code", Constants.ReturnCode.成功.getCode());
		userService.disabled(Integer.parseInt(id), Integer.parseInt(disabled));
		return result;
	}

	@PostMapping("/resetPwd")
	@ResponseBody
	public Map<String, Object> resetPwd(String id, HttpServletRequest request) {

		Map<String, Object> result = new HashMap<String, Object>();
		List<String> message = new ArrayList<String>();
		result.put("message", message);
		result.put("code", Constants.ReturnCode.成功.getCode());
		String newPwd = RandomStringUtil.getRandomChar(6);
		int resetPwdResult = userService.resetPwd(Integer.parseInt(id), newPwd);
		if (resetPwdResult > 0) {
			result.put("data", newPwd);
		} else {
			result.put("code", Constants.ReturnCode.参数错误.getCode());
			message.add("重置密码失败");
		}
		return result;
	}

}
