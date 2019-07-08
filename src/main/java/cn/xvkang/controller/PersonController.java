package cn.xvkang.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageImpl;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.xvkang.service.PersonService;

@Controller
@RequestMapping("/person")
public class PersonController {
	@Autowired
	private PersonService personService;

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

	@GetMapping("/addPage.html")
	public String personAddPage() {

		return "person/person_addPage";
	}

	@GetMapping("/editPage.html")
	public String personEditPage() {

		return "person/person_editPage";
	}
}
