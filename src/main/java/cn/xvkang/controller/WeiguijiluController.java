package cn.xvkang.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.xvkang.service.WeiguijiluService;

@Controller
@RequestMapping("/weiguijilu")
//@PermissionAnnotation(code = "student_directory", describe = "学生管理", name = "学生管理", parentCode = "parent_directory", type = 0, url = "")
public class WeiguijiluController {
	@Autowired
	private WeiguijiluService weiguijiluService;

	@GetMapping("/selectAll")
	@ResponseBody
	// @PermissionAnnotation(code = "student_list_menu",describe = "学生列表",name =
	// "学生列表",parentCode = "student_directory",type = 1,url =
	// "/browser/weiguijilu/listPage,/browser/weiguijilu/selectAll",isFirst =
	// false)
	public PageImpl<Map<String, Object>> selectAll(@RequestParam Map<String, Object> params,
			@RequestParam(name = "page", defaultValue = "1", required = false) Integer pageNumber,
			@RequestParam(name = "limit", defaultValue = "10", required = false) Integer pageSize) {
		PageImpl<Map<String, Object>> selectAll = weiguijiluService.selectAll(params, pageNumber, pageSize);
		return selectAll;
	}

	@GetMapping("/listPage.html")
	// @PermissionAnnotation(code = "student_list_menu",describe = "学生列表",name =
	// "学生列表",parentCode = "student_directory",type = 1,url =
	// "/browser/weiguijilu/listPage,/browser/weiguijilu/selectAll",isFirst =
	// true)
	public String list(HttpServletRequest request) {
		return "weiguijilu/weiguijilu_listPage";
	}

//	@GetMapping("/viewPage")
//	@PermissionAnnotation(code = "student_",describe = "学生",name = "学生",parentCode = "student_list_menu",type = 2,url = "",isFirst = false)
//	public String viewPage(HttpServletRequest request, String id) {
////		Weiguijilu findById = weiguijiluService.findById(Integer.parseInt(id));
////		request.setAttribute("xm", findById);
//		return "weiguijilu/viewPage";
//	}
	// @PermissionAnnotation(code = "student_add",describe = "新增学生",name =
	// "新增学生",parentCode = "student_list_menu",type = 2,url = "",isFirst = false)
	@GetMapping("/addPage.html")
	public String addPage(HttpServletRequest request, String id) {
//		Weiguijilu findById = weiguijiluService.findById(Integer.parseInt(id));
//		request.setAttribute("xm", findById);
		return "weiguijilu/weiguijilu_addPage";
	}

}
