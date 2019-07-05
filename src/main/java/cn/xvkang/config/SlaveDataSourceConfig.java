package cn.xvkang.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.SpringBootVFS;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
@MapperScan(basePackages = { "cn.xvkang.slavemapperdynamicsql",
		"cn.xvkang.slavecustommapper" }, sqlSessionFactoryRef = "slaveSqlSessionFactory")
public class SlaveDataSourceConfig {

	@Bean("slaveDataSource")
	@ConfigurationProperties(prefix = "slave.datasource")
	public DataSource slaveDataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean(name = "slaveTransactionManager")
	public DataSourceTransactionManager transactionManager(@Qualifier("slaveDataSource") DataSource slaveDataSource) {
		return new DataSourceTransactionManager(slaveDataSource);
	}

	@Bean(name = "slaveSqlSessionFactory")
	public SqlSessionFactory slaveSqlSessionFactory(@Qualifier("slaveDataSource") DataSource slaveDataSource)
			throws Exception {

		final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setVfs(SpringBootVFS.class);
		sessionFactory.setDataSource(slaveDataSource);
		// 配置mapper的扫描，找到所有的mapper.xml映射文件
		Resource[] resources1 = new PathMatchingResourcePatternResolver()
				.getResources("classpath*:slavemybatis/custommapper/*.xml");
		Resource[] resources2 = new PathMatchingResourcePatternResolver()
				.getResources("classpath*:slavemybatis/mapperdynamic/*.xml");
		// 加载全局的配置文件
		sessionFactory.setConfigLocation(
				new DefaultResourceLoader().getResource("classpath:slavemybatis/mybatis-config.xml"));
		// 添加插件
		// sessionFactory.setPlugins(new Interceptor[] { pageHelper() });
		List<Resource> resourceList = new ArrayList<>();
		Arrays.asList(resources1, resources2);
		sessionFactory.setMapperLocations(resourceList.toArray(new Resource[resourceList.size()]));
		return sessionFactory.getObject();
	}

}
