package cn.xvkang.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.SpringBootVFS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
@MapperScan(basePackages = { "cn.xvkang.primarymapperdynamicsql",
		"cn.xvkang.primarycustommapper" }, sqlSessionFactoryRef = "primarySqlSessionFactory")
public class PrimaryDataSourceConfig {
	@Autowired
	private Environment env;

	@Bean(value = "primaryDataSource", destroyMethod = "close")
	@Primary
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource primaryDataSource(DataSourceProperties properties) {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setUrl(properties.determineUrl());
		dataSource.setUsername(properties.determineUsername());
		dataSource.setPassword(properties.determinePassword());
		dataSource.setDriverClassName(properties.determineDriverClassName());
		dataSource.setMaxIdle(Integer.parseInt(env.getProperty("spring.datasource.dbcp2.max-idle")));
		dataSource.setMinIdle(Integer.parseInt(env.getProperty("spring.datasource.dbcp2.min-idle")));
		dataSource.setInitialSize(Integer.parseInt(env.getProperty("spring.datasource.dbcp2.initial-size")));
		dataSource.setTestOnBorrow(Boolean.parseBoolean(env.getProperty("spring.datasource.dbcp2.test-on-borrow")));
		dataSource.setTestWhileIdle(Boolean.parseBoolean(env.getProperty("spring.datasource.dbcp2.test-while-idle")));
		dataSource.setTimeBetweenEvictionRunsMillis(
				Integer.parseInt(env.getProperty("spring.datasource.dbcp2.time-between-eviction-runs-millis")));
		dataSource.setValidationQuery(env.getProperty("spring.datasource.dbcp2.validation-query"));
		return dataSource;

		// return DataSourceBuilder.create().build();
	}

	@Primary
	@Bean(name = "primaryTransactionManager")
	public DataSourceTransactionManager transactionManager(
			@Qualifier("primaryDataSource") DataSource primaryDataSource) {
		return new DataSourceTransactionManager(primaryDataSource);
	}

	@Bean(name = "primarySqlSessionFactory")
	@Primary
	public SqlSessionFactory primarySqlSessionFactory(@Qualifier("primaryDataSource") DataSource primaryDataSource)
			throws Exception {
		final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setVfs(SpringBootVFS.class);
		// 配置mapper的扫描，找到所有的mapper.xml映射文件
		Resource[] resources1 = new PathMatchingResourcePatternResolver()
				.getResources("classpath*:primarymybatis/custommapper/*.xml");
		Resource[] resources2 = new PathMatchingResourcePatternResolver()
				.getResources("classpath*:primarymybatis/mapperdynamic/*.xml");
		// 加载全局的配置文件
		sessionFactory.setConfigLocation(// applicationContext.getResource("classpath:primarymybatis/mybatis-config.xml"));
				new DefaultResourceLoader().getResource("classpath:primarymybatis/mybatis-config.xml"));
		// 添加插件
		// sessionFactory.setPlugins(new Interceptor[] { pageHelper() });
		List<Resource> resourceList = new ArrayList<>();
		Arrays.asList(resources1, resources2);
		sessionFactory.setMapperLocations(resourceList.toArray(new Resource[resourceList.size()]));
		sessionFactory.setTypeAliasesPackage("cn.xvkang.primaryentity");
		sessionFactory.setDataSource(primaryDataSource);
		return sessionFactory.getObject();
	}
}
