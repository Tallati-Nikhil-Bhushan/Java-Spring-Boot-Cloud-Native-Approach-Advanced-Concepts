package com.security.demo.securityconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@EnableMethodSecurity
@Configuration
public class SecurityConfig  {
	
	@Bean
	public static PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
		return http
				.csrf(csrf->csrf.disable())
				.authorizeHttpRequests((auth) -> auth
				.anyRequest().authenticated())
				.httpBasic(Customizer.withDefaults())
				.build();		
		
	}
	
	@Bean
	InMemoryUserDetailsManager userDetailsService() {
		UserDetails userDetails = User.builder()
								 .username("james")
								 .password(passwordEncoder().encode("bond"))
								 .roles("USER")
								 .build();
		UserDetails adminDetails = User.builder()
								 .username("admin")
								 .password(passwordEncoder().encode("1234"))
								 .roles("ADMIN")
								 .build();
		return new InMemoryUserDetailsManager(userDetails,adminDetails);
	}
	
	
	
	
	
}
