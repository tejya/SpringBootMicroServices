package com.spring.dept.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.dept.service.entity.Department;
import com.spring.dept.service.serviceimpl.DepartmentService;

import lombok.extern.slf4j.Slf4j;


@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

	@Autowired
	DepartmentService departmentService;
	
	
	@PostMapping("/saveDepartment")
	public Department saveDepartment(@RequestBody Department department) {
		log.info("Inside the save department method");
		return departmentService.saveDepartment(department);
	}
	
	@GetMapping("/findDept/{deptId}")
	public Department findByDepartmentId(@PathVariable Long deptId) {
		log.info("Inside the findByDepartmentId"+deptId);
	 return	departmentService.findDeptById(deptId);
	}
}
