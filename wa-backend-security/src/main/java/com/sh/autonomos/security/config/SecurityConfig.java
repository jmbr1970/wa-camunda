package com.sh.autonomos.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.sh.autonomos.security.service.JwtService;
import com.sh.autonomos.security.service.impl.JwtServiceImpl;

@Configuration
@EnableWebSecurity
@ComponentScan(basePackages = {"com.sh.autonomos.security"})
@PropertySource("classpath:securityConfig.properties")
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	Environment env;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().ignoringAntMatchers("/login");
		
		http.authorizeRequests()
		.antMatchers("/login")
		.permitAll()
		.antMatchers("/**/*")
		.denyAll();
	}
	
	@Bean
	public JwtService jwtService() {
		return new JwtServiceImpl(env.getProperty("key"));
	}
}