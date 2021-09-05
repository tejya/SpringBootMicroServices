package com.spring.dept.service.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dept.service.entity.Department;
import com.spring.dept.service.repository.DepartmentRepository;

@Service
public class DepartmentService  {

	@Autowired
	private DepartmentRepository departmentRepository;
	
	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}
	
	public Department findDeptById(long deptId) {
		System.out.println("The return obj:"+departmentRepository.findBydeptId(deptId));
		return departmentRepository.findBydeptId(deptId);
	}
}
