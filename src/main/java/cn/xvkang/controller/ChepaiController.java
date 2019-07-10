package cn.xvkang.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageImpl;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
}
