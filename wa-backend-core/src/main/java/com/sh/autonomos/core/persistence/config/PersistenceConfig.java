package com.sh.autonomos.core.persistence.config;


import java.util.Properties;

import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.jndi.JndiTemplate;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan("com.sh.autonomos.core.persistence")
public class PersistenceConfig {
	
	@Autowired
	PersistenceConfigService persistenceConfigService;
	
	public PersistenceConfig() {
		super();
	}
	
	@Bean
	public DataSource dataSource() throws NamingException {
		return (DataSource) new JndiTemplate().lookup(persistenceConfigService.getJndiBackendDS());
	}	

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() throws NamingException {
		final LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(dataSource());
		em.setPackagesToScan(new String[] { persistenceConfigService.getEntitiesPackage()});
		em.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		em.setJpaProperties(additionalProperties());
		return em;
	}
	
    @Bean
    public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
        return new PersistenceExceptionTranslationPostProcessor();
    }

	private final Properties additionalProperties() {
		final Properties hibernateProperties = new Properties();
		hibernateProperties.setProperty("hibernate.dialect", persistenceConfigService.getDialect());
		hibernateProperties.setProperty("hibernate.cache.use_second_level_cache", persistenceConfigService.getUseSecondCache());
		return hibernateProperties;
	}
}