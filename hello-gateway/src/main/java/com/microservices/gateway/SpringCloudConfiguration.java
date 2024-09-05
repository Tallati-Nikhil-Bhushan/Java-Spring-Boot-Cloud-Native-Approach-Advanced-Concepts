package com.microservices.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfiguration {
//	@Bean
//    RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
//		return
//			  builder.routes().route("hello-service",r -> r.path("/service1/**")
//			  .filters(f -> f.addRequestHeader("hello", "world").addResponseHeader("hello", "world"))
//			  .uri("http://localhost:8051"))
//			  .route("another-service",r -> r.path("/service2/**")
//			  .uri("http://localhost:8052"))
//			  .build();
//	}
}
