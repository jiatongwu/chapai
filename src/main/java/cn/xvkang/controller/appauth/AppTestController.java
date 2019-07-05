package cn.xvkang.controller.appauth;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.xvkang.dto.MyUserDetails;

@RestController
@RequestMapping("/appauth")
public class AppTestController {
	@GetMapping("/test")
	public String test() {
		// request.setAttribute("a", 8);
		// Object attribute = request.getAttribute("a");
		// System.out.println(attribute);
		return "test";

	}

	@GetMapping("/me")
	public Object me(Authentication authentication) {
		// request.setAttribute("a", 8);
		// Object attribute = request.getAttribute("a");
		// System.out.println(attribute);
		MyUserDetails principal = (MyUserDetails) authentication.getPrincipal();

		return principal;

	}
}
