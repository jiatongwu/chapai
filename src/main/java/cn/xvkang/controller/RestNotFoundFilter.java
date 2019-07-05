package cn.xvkang.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cn.xvkang.utils.Constants;

@RestController
public class RestNotFoundFilter implements ErrorController {

	public static final String NOT_FOUND = "404";
	private static final String ERROR_PATH = "/error";

	/**
	 * { "timestamp": 1561712585109, "status": 404, "error": "Not Found", "message":
	 * "No message available", "path": "/app/getSignupStudents"}
	 * 
	 * @return
	 */
	@RequestMapping(value = ERROR_PATH)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public Map<String, Object> handleError(Exception e) {
		e.printStackTrace();
		Map<String, Object> result = new HashMap<String, Object>();
		List<String> message = new ArrayList<String>();
		result.put("code", Constants.ReturnCode.找不到.getCode());
		result.put("message", message);
		message.add(Constants.ReturnCode.找不到.getMessage());
		return result;
	}

	@Override
	public String getErrorPath() {
		return ERROR_PATH;
	}

}
