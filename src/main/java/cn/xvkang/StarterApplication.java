package cn.xvkang;

import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import cn.xvkang.phone.ThriftServer;

@SpringBootApplication
public class StarterApplication implements CommandLineRunner, ApplicationListener<ContextRefreshedEvent> {
	private Logger logger = LoggerFactory.getLogger(StarterApplication.class);

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Autowired
	private ThriftServer thriftServer;

	public static void main(String[] args) {
		SpringApplication.run(StarterApplication.class, args);
	}

	@PreDestroy
	public void destory() {
		if (thriftServer != null && thriftServer.gettServer() != null) {
			try {
				thriftServer.gettServer().stop();
			} catch (Exception e) {
				e.printStackTrace();
			}
			logger.info("thrift停止 ");
		}
	}

	@Override
	public void run(String... args) throws Exception {
		Thread t = new Thread(() -> {
			for (int i = 0; i < args.length; i++) {
				System.out.println(args[i] + ",");
			}
			try {
				thriftServer.start();
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		t.setDaemon(true);
		t.start();

	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {

		if (thriftServer != null && thriftServer.gettServer() != null) {
			try {
				thriftServer.gettServer().stop();
				logger.info("thrift停止 ");
			} catch (Exception e) {
				e.printStackTrace();
			}
			// logger.debug("thrift停止 ");
		}
	}

}
