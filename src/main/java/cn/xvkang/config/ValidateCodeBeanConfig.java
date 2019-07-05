/**
 * 
 */
package cn.xvkang.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.code.kaptcha.Producer;

import cn.xvkang.properties.ApplicationProperties;
import cn.xvkang.validate.code.ValidateCodeGenerator;
import cn.xvkang.validate.code.image.ImageCodeGenerator;
import cn.xvkang.validate.code.sms.DefaultSmsCodeSender;
import cn.xvkang.validate.code.sms.SmsCodeSender;

/**
 * @author zhailiang
 *
 */
@Configuration
public class ValidateCodeBeanConfig {

	@Autowired
	private ApplicationProperties applicationProperties;
	@Autowired
	private Producer captchaProducer;
	@Autowired
	private ObjectMapper objectMapper;

	@Autowired
	private RedisTemplate<String, String> redisTemplateString;// 一个手机号 一个短信验证码
	@Autowired
	private RedisTemplate<String, Integer> redisTemplateInteger;//
	@Value("${isRealySendSms}")
	private boolean isRealySendSms;

	@Bean
	// @ConditionalOnMissingBean(name = "imageValidateCodeGenerator")
	public ValidateCodeGenerator imageValidateCodeGenerator() {
		ImageCodeGenerator codeGenerator = new ImageCodeGenerator();
		codeGenerator.setApplicationProperties(applicationProperties);
		codeGenerator.setCaptchaProducer(captchaProducer);
		return codeGenerator;
	}

	@Bean
	// @ConditionalOnMissingBean(SmsCodeSender.class)
	public SmsCodeSender smsCodeSender() {
		DefaultSmsCodeSender defaultSmsCodeSender = new DefaultSmsCodeSender();
		defaultSmsCodeSender.setRealySendSms(isRealySendSms);
		defaultSmsCodeSender.setSmsName(applicationProperties.getSms().getSmsName());
		defaultSmsCodeSender.setSmsMessageFormatString(applicationProperties.getSms().getSmsMessageFormatString());
		defaultSmsCodeSender.setSmsPrdid(applicationProperties.getSms().getSmsPrdid());
		defaultSmsCodeSender.setSmsPwd(applicationProperties.getSms().getSmsPwd());
		defaultSmsCodeSender.setSmsSign(applicationProperties.getSms().getSmsSign());
		defaultSmsCodeSender.setSmsUrl(applicationProperties.getSms().getSmsUrl());
		defaultSmsCodeSender.setObjectMapper(objectMapper);
		defaultSmsCodeSender.setRedisTemplateString(redisTemplateString);
		defaultSmsCodeSender.setRedisTemplateInteger(redisTemplateInteger);
		defaultSmsCodeSender.setRedisNamespace(applicationProperties.getRedisNameSpace());
		defaultSmsCodeSender
				.setOnePhoneOneDayMaxSendCount(applicationProperties.getSms().getOnePhoneOneDayMaxSendCount());
		return defaultSmsCodeSender;
	}

}
