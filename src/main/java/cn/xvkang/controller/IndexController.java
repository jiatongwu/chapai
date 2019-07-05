package cn.xvkang.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping("/welcome.html")
	public String welcome() {
		return "welcome";
	}

	@GetMapping("/loginPage.html")
	public String loginPage() {
		return "loginPage";
	}

	@GetMapping("/notLogin.html")
	public String notLogin() {
		return "notLogin";
	}

	@GetMapping("/test")
	public String test(HttpServletRequest request) {
		HttpSession session = request.getSession();
		return session.getId();

	}

	@GetMapping("/index.html")
	public String index(HttpServletRequest request) {

		return "index";
	}

	@GetMapping("/index/main")
	public String indexIndex(HttpServletRequest request) {
		return "index_index";
	}

}
