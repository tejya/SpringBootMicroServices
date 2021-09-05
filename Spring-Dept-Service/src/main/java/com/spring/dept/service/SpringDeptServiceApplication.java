package com.spring.dept.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringDeptServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDeptServiceApplication.class, args);
	}

}
