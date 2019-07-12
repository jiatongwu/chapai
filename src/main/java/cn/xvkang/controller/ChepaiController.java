package cn.xvkang.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.data.domain.PageImpl;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.UriUtils;

import cn.xvkang.primaryentity.Myfaxingssue;
import cn.xvkang.primaryentity.Myjibenziliao;
import cn.xvkang.service.ChepaiService;
import cn.xvkang.service.PersonService;
import cn.xvkang.utils.Constants;

@Controller
@RequestMapping("/chepai")
public class ChepaiController {
	@Autowired
	private ChepaiService chepaiService;
	@Autowired
	private PersonService personService;

	@GetMapping("/listPage.html")
	public String chepaiListPage() {
		return "chepai/chepai_listPage";
	}

	@GetMapping("/selectAll")
	@ResponseBody
	public PageImpl<Map<String, Object>> selectAll(@RequestParam Map<String, Object> params,
			@RequestParam(name = "page", defaultValue = "1", required = false) Integer pageNumber,
			@RequestParam(name = "limit", defaultValue = "10", required = false) Integer pageSize,
			Authentication authentication) {
		PageImpl<Map<String, Object>> selectAll = chepaiService.selectAllPage(params, pageNumber, pageSize);
		return selectAll;
	}

	@GetMapping("/addPage.html")
	public String chepaiAddPage() {

		return "chepai/chepai_addPage";
	}

	@PostMapping("/add")
	@ResponseBody
	public Map<String, Object> add(@RequestParam Map<String, Object> params) {
		Map<String, Object> result = new HashMap<String, Object>();
		List<String> message = new ArrayList<String>();
		result.put("message", message);
		result.put("code", Constants.ReturnCode.成功.getCode());
//		String idString = (String) params.get("id");
//		int id = Integer.parseInt(idString);
//		Signup oldSignup = signUpService.findById(id);
//		if (oldSignup.getRegCode() == null) {
//			return result;
//		}
//		Integer firstTrial = oldSignup.getFirstTrial();
//		if (!(firstTrial != null && firstTrial.intValue() == Constants.FIRST_TRIAL_STATUS.初审不通过.getStatus())) {
//			 
//		}

		int code = (Integer) result.get("code");
		if (code == 0) {
			int i = chepaiService.add(params);
			if (i <= 0) {
				result.put("code", Constants.ReturnCode.服务器内部错误.getCode());
				message.add("操作失败");
			}
		}

		return result;
	}

	@GetMapping("/viewPage.html")
	public String chepaiViewPage(HttpServletRequest request, HttpServletResponse response, String id) {
		Myfaxingssue carById = chepaiService.getCarById(id);
		if (carById != null) {
			String userno = carById.getUserno();
			Myjibenziliao personByUserno = personService.getPersonByUserno(userno);
			request.setAttribute("person", personByUserno);
			if (personByUserno != null) {
				List<Myfaxingssue> carsByUserno = personService.getCarsByUserno(userno);
				request.setAttribute("cars", carsByUserno);
			}
		}
		return "chepai/chepai_viewPage";
	}

	@PostMapping("/delete")
	@ResponseBody
	public Map<String, Object> delete(String id) {
		Map<String, Object> result = new HashMap<String, Object>();
		List<String> message = new ArrayList<String>();
		result.put("message", message);
		result.put("code", Constants.ReturnCode.成功.getCode());

		int code = (Integer) result.get("code");
		if (code == 0) {
			int i = chepaiService.delete(id);
			if (i <= 0) {
				result.put("code", Constants.ReturnCode.服务器内部错误.getCode());
				message.add("操作失败");
			}
		}

		return result;

	}

	@GetMapping("/yanqiPage.html")
	public String yanqiPage(HttpServletRequest request, String id) {
		Myfaxingssue carById = chepaiService.getCarById(id);
		request.setAttribute("car", carById);
		if (carById != null) {
			String userno = carById.getUserno();
			Myjibenziliao personByUserno = personService.getPersonByUserno(userno);
			request.setAttribute("person", personByUserno);
		}
		return "chepai/chepai_yanqiPage";
	}

	@PostMapping("/yanqi")
	@ResponseBody
	public Map<String, Object> yanqi(String id, String endDate) {
		Map<String, Object> result = new HashMap<String, Object>();
		List<String> message = new ArrayList<String>();
		result.put("message", message);
		result.put("code", Constants.ReturnCode.成功.getCode());

		int code = (Integer) result.get("code");
		if (code == 0) {
			int i = chepaiService.yaqi(id, endDate);
			if (i <= 0) {
				result.put("code", Constants.ReturnCode.服务器内部错误.getCode());
				message.add("操作失败");
			}
		}

		return result;

	}

	// @PermissionAnnotation(code = "student_import", describe = "导入学生", name =
	// "导入学生", parentCode = "student_list_menu", type = 2, url = "", isFirst =
	// false)
	@GetMapping("/importExcelPage.html")
	public String importSportScorePage(HttpServletRequest request) {
		return "chepai/chepai_importExcelPage";
	}

	// @PermissionAnnotation(code = "student_import", describe = "导入学生", name =
	// "导入学生", parentCode = "student_list_menu", type = 2, url = "", isFirst =
	// false)
	@PostMapping("/importExcel")
	@ResponseBody
	public Map<String, Object> importExcel(MultipartFile excel) throws IOException {
		Map<String, Object> importExcel = chepaiService.importExcel(excel.getInputStream());
		return importExcel;
	}

	// @PermissionAnnotation(code = "student_import", describe = "导入学生", name =
	// "导入学生", parentCode = "student_list_menu", type = 2, url = "", isFirst =
	// false)
	@GetMapping(value = "/importTemplateDownload.xlsx", produces = Constants.EXCEL_XLSX_MIMETYPE)
	public ResponseEntity<Resource> importTemplateDownload() throws UnsupportedEncodingException {
		Resource file = null;
		InputStream inputStream;
		try {
			inputStream = getClass().getClassLoader().getResourceAsStream("template/importChepai.xlsx");
			file = new InputStreamResource(inputStream);
			if (file.exists()) {
				return ResponseEntity.ok()
						.header(HttpHeaders.CONTENT_DISPOSITION,
								"attachment; filename=\"" + UriUtils.encode("导入车牌模板.xlsx", "UTF-8")
										+ "\";filename*=utf-8''" + UriUtils.encode("导入车牌模板.xlsx", "UTF-8"))
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
