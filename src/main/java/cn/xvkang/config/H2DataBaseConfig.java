package cn.xvkang.config;

import java.util.HashMap;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@EnableJpaRepositories(basePackages = "cn.xvkang.h2.dao", entityManagerFactoryRef = "h2EntityManager", transactionManagerRef = "h2TransactionManager")
public class H2DataBaseConfig {

	@Bean
	public LocalContainerEntityManagerFactoryBean h2EntityManager() {
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(productDataSource());
		em.setPackagesToScan(new String[] { "cn.xvkang.h2.entity" });

		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		em.setJpaVendorAdapter(vendorAdapter);
		HashMap<String, Object> properties = new HashMap<>();
		properties.put("hibernate.hbm2ddl.auto", "update");
		properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		em.setJpaPropertyMap(properties);

		return em;
	}

	@Bean
	public DataSource productDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:mem:huolu;MODE=MYSQL;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE;AUTO_RECONNECT=TRUE");

		return dataSource;
	}

	@Bean("h2TransactionManager")
	public PlatformTransactionManager h2TransactionManager() {

		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(h2EntityManager().getObject());
		return transactionManager;
	}

//	@Bean(name = "h2DataSource")
//	@ConfigurationProperties(prefix = "h2.datasource")
//	public DataSource h2DataSource() throws Exception {
//		DataSource datasource = DataSourceBuilder.create().hat a dedicated connection pool is chosen (in code) and its settings are exposed in the app.datasource.configuration subbuild();
//		return datasource;
////		ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
////		comboPooledDataSource.setDriverClass("org.h2.Driver");
////		comboPooledDataSource.setJdbcUrl("jdbc:h2:mem:jiayuguan;MODE=MYSQL;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE");
////		comboPooledDataSource.setMaxPoolSize(20);
////		comboPooledDataSource.setMinPoolSize(5);
////		comboPooledDataSource.setInitialPoolSize(10);
////		comboPooledDataSource.setMaxIdleTime(300);
////		comboPooledDataSource.setAcquireIncrement(5);
////		comboPooledDataSource.setIdleConnectionTestPeriod(60);
//		// return comboPooledDataSource;
//	}
//
////	@Bean(name = "h2HibernateSessionFactory")
//	public LocalSessionFactoryBean h2HibernateSessionFactory() throws Exception {
//		LocalSessionFactoryBean sfb = new LocalSessionFactoryBean();
//		sfb.setDataSource(h2DataSource());
//		sfb.setPackagesToScan(new String[] { "cn.xvkang.h2.entity" });
//		Properties pros = new Properties();
//		pros.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
//		pros.setProperty("hibernate.show_sql", "true");
//		pros.setProperty("hibernate.hbm2ddl.auto", "update");
//		pros.setProperty("hibernate.format_sql", "true");
//		sfb.setHibernateProperties(pros);
//		
//		return sfb;
//
//	}
}
