package com.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

	@GetMapping("getUserServiceFallBack")
	public String userServiceFallBackMethod() {
		return "User service is taking longer time than expected time,Please try again later";
	}
	@GetMapping("getDepartmentServiceFallBack")
	public String departmentServiceFallBackMethod() {
		return "Department  service is taking longer time than expected time,Please try again later";
	}
}
