package cn.xvkang;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import cn.xvkang.phone.ThriftServer;

@SpringBootApplication
public class StarterApplication implements CommandLineRunner {

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	private static ThriftServer thriftServer;

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(StarterApplication.class, args);

		try {
			thriftServer = context.getBean(ThriftServer.class);
			thriftServer.start();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void run(String... args) throws Exception {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i] + ",");
		}
	}

}
