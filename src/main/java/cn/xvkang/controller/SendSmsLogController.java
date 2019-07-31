package cn.xvkang.controller;

import java.io.UnsupportedEncodingException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.data.domain.PageImpl;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.UriUtils;

import cn.xvkang.service.SendSmsLogService;
import cn.xvkang.utils.Constants;

@Controller
@RequestMapping("/sendSmsLog")
//@PermissionAnnotation(code = "student_directory", describe = "学生管理", name = "学生管理", parentCode = "parent_directory", type = 0, url = "")
public class SendSmsLogController {

	@Autowired
	private SendSmsLogService sendSmsLogService;

	@GetMapping("/selectAll")
	@ResponseBody
	// @PermissionAnnotation(code = "student_list_menu",describe = "学生列表",name =
	// "学生列表",parentCode = "student_directory",type = 1,url =
	// "/browser/sendSmsLog/listPage,/browser/sendSmsLog/selectAll",isFirst
	// = false)
	public PageImpl<Map<String, Object>> selectAll(@RequestParam Map<String, Object> params,
			@RequestParam(name = "page", defaultValue = "1", required = false) Integer pageNumber,
			@RequestParam(name = "limit", defaultValue = "10", required = false) Integer pageSize) {
		PageImpl<Map<String, Object>> selectAll = sendSmsLogService.selectAll(params, pageNumber, pageSize);
		return selectAll;
	}

	@GetMapping("/listPage.html")
	// @PermissionAnnotation(code = "student_list_menu",describe = "学生列表",name =
	// "学生列表",parentCode = "student_directory",type = 1,url =
	// "/browser/sendSmsLog/listPage,/browser/sendSmsLog/selectAll",isFirst
	// = true)
	public String list(HttpServletRequest request) {

		return "sendSmsLog/sendSmsLog_listPage";
	}

	// @PermissionAnnotation(code = "student_edit",describe = "编辑学生",name =
	// "编辑学生",parentCode = "student_list_menu",type = 2,url = "",isFirst = false)
	@GetMapping("/viewPage.html")
	public String viewPage(HttpServletRequest request, String id) {
//		User findById = userService.findById(Integer.parseInt(id));
//		request.setAttribute("xm", findById);
		request.setAttribute("sendSmsLog", sendSmsLogService.findMapById(Integer.parseInt(id)));
		return "sendSmsLog/sendSmsLog_viewPage";
	}

	@GetMapping(value = "/exportAllSendSmsLog", produces = Constants.EXCEL_XLSX_MIMETYPE)
	public ResponseEntity<Resource> exportAllSendSmsLog(@RequestParam Map<String, Object> params,
			Authentication authentication) throws UnsupportedEncodingException {
		Resource file = null;
		try {
			file = sendSmsLogService.exportSendSmsLog(params);// new FileSystemResource(templateFolderPath +
			// "importStudent2.xlsx");
			if (file.exists()) {
				return ResponseEntity.ok()
						.header(HttpHeaders.CONTENT_DISPOSITION,
								"attachment; filename=\"" + UriUtils.encode("导出短信发送情况.xlsx", "UTF-8")
										+ "\";filename*=utf-8''" + UriUtils.encode("导出短信发送情况.xlsx", "UTF-8"))
						// .header(HttpHeaders.CONTENT_TYPE, "application/msword")
						.header("Set-Cookie", "fileDownload=true; path=/").body(file);
			} else {
				return ResponseEntity.notFound().header("Set-Cookie", "fileDownload=false; path=/").build();
			}
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.notFound().header("Set-Cookie", "fileDownload=false; path=/").build();
		}
	}

}
