package com.chenlin.neworganization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@ServletComponentScan(basePackages = "com.chenlin.neworganization.*")
public class OrganizationNewServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrganizationNewServiceApplication.class, args);
	}

}
