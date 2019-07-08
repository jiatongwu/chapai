package cn.xvkang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/example")
public class ExampleController {
	@GetMapping("/listPage.html")
	public String exampleListPage() {
		
		return "example/example_listPage";
	}
	
	@GetMapping("/addPage.html")
	public String exampleAddPage() {
		
		return "example/example_addPage";
	}
	@GetMapping("/editPage.html")
	public String exampleEditPage() {
		
		return "example/example_editPage";
	}
}
