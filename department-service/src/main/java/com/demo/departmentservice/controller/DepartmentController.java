package com.demo.departmentservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.departmentservice.dto.DepartmentDto;
import com.demo.departmentservice.service.DepartmentService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/departments")
@AllArgsConstructor
public class DepartmentController {
	private DepartmentService departmentService;
	
	@PostMapping
	public ResponseEntity<DepartmentDto>saveDepartment(@RequestBody DepartmentDto departmentDto)
	{
		DepartmentDto savedDepartment=departmentService.saveDepartment(departmentDto);
		return new ResponseEntity<>(savedDepartment,HttpStatus.CREATED);
	
	}
	
	@GetMapping("{department-code}")
	public ResponseEntity<DepartmentDto>getDepartment(@PathVariable("department-code") String departmentCode)
	{
		DepartmentDto departmentDto=departmentService.getDepartmentByCode(departmentCode);
		return new ResponseEntity<>(departmentDto,HttpStatus.OK);
	}
	
	
	
	
	
	

}
