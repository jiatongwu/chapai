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
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.xvkang.primaryentity.SmsTemplate;
import cn.xvkang.primarymapperdynamicsql.SmsTemplateDynamicSqlSupport;
import cn.xvkang.service.SmsTemplateService;
import cn.xvkang.utils.Constants;

@Controller
@RequestMapping("/smsTemplate")
//@PermissionAnnotation(code = "student_directory", describe = "学生管理", name = "学生管理", parentCode = "parent_directory", type = 0, url = "")
public class SmsTemplateController {
	@Autowired
	private SmsTemplateService smsTemplateService;

	@GetMapping("/selectAll")
	@ResponseBody
	// @PermissionAnnotation(code = "student_list_menu",describe = "学生列表",name =
	// "学生列表",parentCode = "student_directory",type = 1,url =
	// "/browser/smsTemplate/listPage,/browser/smsTemplate/selectAll",isFirst =
	// false)
	public PageImpl<SmsTemplate> selectAll(@RequestParam Map<String, Object> params,
			@RequestParam(name = "page", defaultValue = "1", required = false) Integer pageNumber,
			@RequestParam(name = "limit", defaultValue = "10", required = false) Integer pageSize) {
		PageImpl<SmsTemplate> selectAll = smsTemplateService.selectAll(params, pageNumber, pageSize);
		return selectAll;
	}

	@GetMapping("/listPage.html")
	// @PermissionAnnotation(code = "student_list_menu",describe = "学生列表",name =
	// "学生列表",parentCode = "student_directory",type = 1,url =
	// "/browser/smsTemplate/listPage,/browser/smsTemplate/selectAll",isFirst =
	// true)
	public String list(HttpServletRequest request) {
		return "smsTemplate/smsTemplate_listPage";
	}

//	@GetMapping("/viewPage")
//	@PermissionAnnotation(code = "student_",describe = "学生",name = "学生",parentCode = "student_list_menu",type = 2,url = "",isFirst = false)
//	public String viewPage(HttpServletRequest request, String id) {
////		SmsTemplate findById = smsTemplateService.findById(Integer.parseInt(id));
////		request.setAttribute("xm", findById);
//		return "smsTemplate/viewPage";
//	}
	// @PermissionAnnotation(code = "student_add",describe = "新增学生",name =
	// "新增学生",parentCode = "student_list_menu",type = 2,url = "",isFirst = false)
	@GetMapping("/addPage.html")
	public String addPage(HttpServletRequest request, String id) {
//		SmsTemplate findById = smsTemplateService.findById(Integer.parseInt(id));
//		request.setAttribute("xm", findById);
		return "smsTemplate/smsTemplate_addPage";
	}

	// @PermissionAnnotation(code = "student_add",describe = "新增学生",name =
	// "新增学生",parentCode = "student_list_menu",type = 2,url = "",isFirst = false)
	@PostMapping("/add")
	@ResponseBody
	public Map<String, Object> add(HttpServletRequest request, @RequestParam Map<String, Object> params) {
//		SmsTemplate findById = smsTemplateService.findById(Integer.parseInt(id));
//		request.setAttribute("xm", findById);

		Map<String, Object> result = new HashMap<String, Object>();
		List<String> message = new ArrayList<String>();
		result.put("message", message);
		result.put("code", Constants.ReturnCode.成功.getCode());
		String name = (String) params.get("name");
		SelectStatementProvider render = SqlBuilder.select(SmsTemplateDynamicSqlSupport.smsTemplate.allColumns())
				.from(SmsTemplateDynamicSqlSupport.smsTemplate, "smsTemplate")
				.where(SmsTemplateDynamicSqlSupport.smsTemplate.name, SqlBuilder.isEqualTo(name)).build()
				.render(RenderingStrategy.MYBATIS3);
		List<SmsTemplate> smsTemplates = smsTemplateService.findByExample(render);
		if (smsTemplates.size() > 0) {
			result.put("code", Constants.ReturnCode.参数错误.getCode());
			message.add("名称已经存在，请更换一个名称");
		}
		int code = (Integer) result.get("code");
		if (code == 0) {
			int i = smsTemplateService.add(params);
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
//		SmsTemplate findById = smsTemplateService.findById(Integer.parseInt(id));
//		request.setAttribute("xm", findById);
		request.setAttribute("smsTemplate", smsTemplateService.findById(Integer.parseInt(id)));
		return "smsTemplate/smsTemplate_editPage";
	}

	// @PermissionAnnotation(code = "student_edit",describe = "编辑学生",name =
	// "编辑学生",parentCode = "student_list_menu",type = 2,url = "",isFirst = false)
	@PostMapping("/edit")
	@ResponseBody
	public Map<String, Object> edit(HttpServletRequest request, @RequestParam Map<String, Object> params) {
//		SmsTemplate findById = smsTemplateService.findById(Integer.parseInt(id));
//		request.setAttribute("xm", findById);

		Map<String, Object> result = new HashMap<String, Object>();
		List<String> message = new ArrayList<String>();
		result.put("message", message);
		result.put("code", Constants.ReturnCode.成功.getCode());

		String name = (String) params.get("name");
		String id = (String) params.get("id");
		SelectStatementProvider render = SqlBuilder.select(SmsTemplateDynamicSqlSupport.smsTemplate.allColumns())
				.from(SmsTemplateDynamicSqlSupport.smsTemplate, "smsTemplate")
				.where(SmsTemplateDynamicSqlSupport.smsTemplate.name, SqlBuilder.isEqualTo(name)).build()
				.render(RenderingStrategy.MYBATIS3);
		List<SmsTemplate> smsTemplates = smsTemplateService.findByExample(render);
		if (smsTemplates.size() > 0) {
			SmsTemplate smsTemplate = smsTemplates.get(0);
			String oldId = smsTemplate.getId() + "";
			if (!oldId.equals(id)) {
				result.put("code", Constants.ReturnCode.参数错误.getCode());
				message.add("名称已经存在，请更换一个名称");
			}
		}
		int code = (Integer) result.get("code");
		if (code == 0) {
			int i = smsTemplateService.edit(params);
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
//		SmsTemplate findById = smsTemplateService.findById(Integer.parseInt(id));
//		request.setAttribute("xm", findById);

		Map<String, Object> result = new HashMap<String, Object>();
		List<String> message = new ArrayList<String>();
		result.put("message", message);
		result.put("code", Constants.ReturnCode.成功.getCode());
		int code = (Integer) result.get("code");
		if (code == 0) {
			int i = smsTemplateService.delete(params);
			if (i <= 0) {
				result.put("code", Constants.ReturnCode.服务器内部错误.getCode());
				message.add("删除失败");
			}
		}
		return result;
	}

}
