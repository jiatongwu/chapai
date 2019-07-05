/**
 * 
 */
package cn.xvkang.validate.code.sms;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.ServletWebRequest;

import cn.xvkang.properties.ApplicationProperties;
import cn.xvkang.validate.code.ValidateCode;
import cn.xvkang.validate.code.ValidateCodeGenerator;

/**
 * @author zhailiang
 *
 */
@Component("smsValidateCodeGenerator")
public class SmsCodeGenerator implements ValidateCodeGenerator {

	@Autowired
	private ApplicationProperties applicationProperties;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.imooc.security.core.validate.code.ValidateCodeGenerator#generate(org.
	 * springframework.web.context.request.ServletWebRequest)
	 */
	@Override
	public ValidateCode generate(ServletWebRequest request) {
		String code = RandomStringUtils.randomNumeric(applicationProperties.getSms().getLength());
		return new ValidateCode(code, applicationProperties.getSms().getValidateSecond());
	}
}
