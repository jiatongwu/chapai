package cn.xvkang.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.xvkang.utils.Constants;

@ControllerAdvice
public class ExceptionControllerAdvice {

	@ExceptionHandler(AccessDeniedException.class)
	@ResponseBody
	public Map<String, Object> exception(HttpServletRequest request, HttpServletResponse response,
			AccessDeniedException e) {
		Map<String, Object> result = new HashMap<String, Object>();
		List<String> message = new ArrayList<String>();
		result.put("code", Constants.ReturnCode.未授权.getCode());
		result.put("message", message);
		message.add("没有权限");
		return result;
	}
}