package com.sh.autonomos.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.sh.autonomos.bpm.config.BPMConfiguration;
import com.sh.autonomos.security.config.SecurityConfig;

@Configuration
@EnableWebMvc
@ComponentScan("com.sh.autonomos.backend")
@Import({BPMConfiguration.class, SecurityConfig.class})
public class BackendConfig {

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

}