package com.demo.employeeservice.impl;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.demo.employeeservice.dto.DepartmentDto;

@FeignClient(name="DEPARTMENT-SERVICE")
public interface APIClient {
	
	@GetMapping("/api/departments/{department-code}")
	DepartmentDto getDepartment(@PathVariable("department-code") String departmentCode);

	

}
