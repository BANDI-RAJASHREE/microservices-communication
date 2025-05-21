package com.demo.employeeservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.employeeservice.dto.ApiResponseDto;
import com.demo.employeeservice.dto.EmployeeDto;
import com.demo.employeeservice.service.EmployeeService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")

public class EmployeeController {
	private EmployeeService employeeService;
	
	@PostMapping
	public ResponseEntity<EmployeeDto>saveEmployee(@RequestBody EmployeeDto employeeDto)
	{
		EmployeeDto savedEmployee=employeeService.saveEmployee(employeeDto);
		return new ResponseEntity<>(savedEmployee,HttpStatus.CREATED);
		
	}
	
	@GetMapping("{id}")
	public ResponseEntity<ApiResponseDto>getEmployee(@PathVariable("id") Long employeeId)
	{
		ApiResponseDto apiResponseDto=employeeService.getEmployeeById(employeeId);
		return new ResponseEntity<>(apiResponseDto,HttpStatus.OK);
	}
	

}
