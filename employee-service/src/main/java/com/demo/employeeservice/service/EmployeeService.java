package com.demo.employeeservice.service;

import com.demo.employeeservice.dto.ApiResponseDto;
import com.demo.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
	EmployeeDto saveEmployee(EmployeeDto employeeDto);
	
	ApiResponseDto getEmployeeById(Long Id);
	
}
