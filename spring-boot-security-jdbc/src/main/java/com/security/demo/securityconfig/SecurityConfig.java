package com.security.demo.securityconfig;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig {

	@Bean
	BCryptPasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		return http
				.csrf(csrf -> csrf.disable())
				.authorizeHttpRequests(req -> req
				.requestMatchers("/encode/**","/signup")
				.permitAll()
				.requestMatchers("/product-api/**")
				.hasRole("ADMIN")
				.anyRequest().authenticated())
				.httpBasic(Customizer.withDefaults())
				.build();
		
	}
	
	@Bean
	UserDetailsManager userDetailsManager(DataSource dataSource){
		
		JdbcUserDetailsManager users = new JdbcUserDetailsManager(dataSource);
		
		return users;
	}
	
	@Bean
	@ConfigurationProperties("app.datasource")
	
	DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}
	
	
	
}
