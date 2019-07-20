package cn.xvkang.utils;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import freemarker.cache.StringTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class FreeMarkerStringUtils {
	/**
	 * 
	 * @param templateContent              需要给字符串模板内容,例如"欢迎：${name}登入!"
	 * @param dataMap里存放的数据Key值要与模板中的相对应参数
	 */
	@SuppressWarnings("deprecation")
	public static String getPage(String templateContent, Map<String, String> dataMap) {

		Configuration cfg = new Configuration();
		StringTemplateLoader stringLoader = new StringTemplateLoader();
		stringLoader.putTemplate("myTemplate", templateContent);
		cfg.setTemplateLoader(stringLoader);
		try {
			Template template = cfg.getTemplate("myTemplate", "utf-8");
			StringWriter writer = new StringWriter();
			try {
				template.process(dataMap, writer);
				return writer.toString();
			} catch (TemplateException e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		Map<String, String> dataMap = new HashMap<String, String>();
		dataMap.put("name", "张三");
		getPage("欢迎：${name}登入!", dataMap);
	}
}