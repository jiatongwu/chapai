package cn.xvkang.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import cn.xvkang.utils.SpringUtils;
import cn.xvkang.utils.YamlPropertySourceFactory;

@Configuration
//@PropertySource(factory = YamlPropertySourceFactory.class, value = "file:${ymlPath}", ignoreResourceNotFound = true)
@PropertySource(factory = YamlPropertySourceFactory.class, value = "classpath:config.yml", ignoreResourceNotFound = true)
//@PropertySource(value = "file:${propertiesPath}")
public class BeanConfig {

	@Bean
	public SpringUtils springUtils() {
		return new SpringUtils();
	}

}
