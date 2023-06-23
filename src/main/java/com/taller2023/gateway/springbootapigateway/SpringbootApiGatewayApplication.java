package com.taller2023.gateway.springbootapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringbootApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApiGatewayApplication.class, args);
	}

}
