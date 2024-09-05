package com.security.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
//important annotation : without it default login page will override
@EnableOAuth2Sso
public class SpringBootSecurityOauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityOauthApplication.class, args);
	}

}
