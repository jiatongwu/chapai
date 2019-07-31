package cn.xvkang.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
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
import cn.xvkang.primarymapperdynamicsql.MyjibenziliaoDynamicSqlSupport;
import cn.xvkang.service.PersonService;
import cn.xvkang.utils.Constants;

@Controller
@RequestMapping("/person")
public class PersonController {
	@Autowired
	private PersonService personService;
	// @Autowired
	// private ChepaiService chepainService;

	@GetMapping("/listPage.html")
	public String personListPage() {

		return "person/person_listPage";
	}

	@GetMapping("/selectAll")
	@ResponseBody
	public PageImpl<Map<String, Object>> selectAll(@RequestParam Map<String, Object> params,
			@RequestParam(name = "page", defaultValue = "1", required = false) Integer pageNumber,
			@RequestParam(name = "limit", defaultValue = "10", required = false) Integer pageSize,
			Authentication authentication) {
		PageImpl<Map<String, Object>> selectAll = personService.selectAllPage(params, pageNumber, pageSize);
		return selectAll;
	}

	@GetMapping("/viewPage.html")
	public String personViewPage(HttpServletRequest request, HttpServletResponse response, String userno) {
		List<Myfaxingssue> carsByUserno = personService.getCarsByUserno(userno);
		request.setAttribute("cars", carsByUserno);
		Myjibenziliao personByUserno = personService.getPersonByUserno(userno);
		request.setAttribute("person", personByUserno);
		return "person/person_viewPage";
	}

	@GetMapping("/modifyPhonePage.html")
	public String modifyPhonePage(HttpServletRequest request, HttpServletResponse response, String userno) {
		Myjibenziliao personByUserno = personService.getPersonByUserno(userno);
		request.setAttribute("person", personByUserno);
		return "person/person_modifyPhonePage";
	}

	@PostMapping("/modifyPhone")
	@ResponseBody
	public Map<String, Object> modifyPhone(String userno, String phone) {
		Map<String, Object> result = new HashMap<String, Object>();
		List<String> message = new ArrayList<String>();
		result.put("message", message);
		result.put("code", Constants.ReturnCode.成功.getCode());
		Myjibenziliao personByUserno = personService.getPersonByUserno(userno);
		String oldPhone = personByUserno.getMobnumber();

		SelectStatementProvider render = SqlBuilder.select(MyjibenziliaoDynamicSqlSupport.myjibenziliao.allColumns())
				.from(MyjibenziliaoDynamicSqlSupport.myjibenziliao).where()
				.and(MyjibenziliaoDynamicSqlSupport.mobnumber, SqlBuilder.isEqualTo(phone)).build()
				.render(RenderingStrategy.MYBATIS3);

		String phoneRegexp = "1[0-9]{10}";
		if (StringUtils.isNotBlank(phone)) {
			if (!phone.matches(phoneRegexp)) {
				result.put("code", Constants.ReturnCode.参数错误.getCode());
				message.add("手机号格式不正确");
			}
		}

		if (StringUtils.isNotBlank(oldPhone)) {
			if (!oldPhone.equals(phone) && StringUtils.isNotBlank(phone)) {
				List<Myjibenziliao> selectByExample = personService.selectByExample(render);
				if (selectByExample.size() > 0) {
					result.put("code", Constants.ReturnCode.参数错误.getCode());
					message.add("手机号已存在，请更换一个手机号");
				}
			}
		} else {
			// 以前的手机号是空
			if (StringUtils.isNotBlank(phone)) {
				List<Myjibenziliao> selectByExample = personService.selectByExample(render);
				if (selectByExample.size() > 0) {
					result.put("code", Constants.ReturnCode.参数错误.getCode());
					message.add("手机号已存在，请更换一个手机号");
				}
			}
		}
		int code = (Integer) result.get("code");
		if (code == 0) {
			int i = personService.modifyPhone(userno, phone);
			if (i <= 0) {
				result.put("code", Constants.ReturnCode.服务器内部错误.getCode());
				message.add("操作失败");
			}
		}
		return result;
	}

	@PostMapping("/delete")
	@ResponseBody
	public Map<String, Object> delete(String userno) {
		Map<String, Object> result = new HashMap<String, Object>();
		List<String> message = new ArrayList<String>();
		result.put("message", message);
		result.put("code", Constants.ReturnCode.成功.getCode());
		if ("888888".equals(userno)) {
			result.put("code", Constants.ReturnCode.参数错误.getCode());
			message.add("不能删除管理员");
		}
		int code = (Integer) result.get("code");
		if (code == 0) {
			int i = personService.delete(userno);
			if (i <= 0) {
				result.put("code", Constants.ReturnCode.服务器内部错误.getCode());
				message.add("操作失败");
			}
		}
		return result;
	}
}
