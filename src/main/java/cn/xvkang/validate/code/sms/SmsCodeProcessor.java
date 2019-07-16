/**
 * 
 */
package cn.xvkang.validate.code.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.context.request.ServletWebRequest;

import cn.xvkang.utils.Constants;
import cn.xvkang.validate.code.ValidateCode;
import cn.xvkang.validate.code.impl.AbstractValidateCodeProcessor;

/**
 * 短信验证码处理器
 * 
 * @author zhailiang
 *
 */
@Component("smsValidateCodeProcessor")
public class SmsCodeProcessor extends AbstractValidateCodeProcessor<ValidateCode> {

	/**
	 * 短信验证码发送器
	 */
	@Autowired
	private SmsCodeSender smsCodeSender;

	@Override
	protected void send(ServletWebRequest request, ValidateCode validateCode) throws Exception {
		String paramName = Constants.DEFAULT_PARAMETER_NAME_MOBILE;
		String mobile = ServletRequestUtils.getRequiredStringParameter(request.getRequest(), paramName);
		smsCodeSender.send(request, mobile, validateCode.getCode());
	}

}
