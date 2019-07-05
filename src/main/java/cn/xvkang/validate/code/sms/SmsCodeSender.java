/**
 * 
 */
package cn.xvkang.validate.code.sms;

import org.springframework.web.context.request.ServletWebRequest;

/**
 * @author zhailiang
 *
 */
public interface SmsCodeSender {

	void send(ServletWebRequest request, String mobile, String code);

}
