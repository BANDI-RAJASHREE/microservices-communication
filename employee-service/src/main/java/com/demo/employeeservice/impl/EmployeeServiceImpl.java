package com.demo.employeeservice.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.demo.employeeservice.dto.ApiResponseDto;
import com.demo.employeeservice.dto.DepartmentDto;
import com.demo.employeeservice.dto.EmployeeDto;
import com.demo.employeeservice.entity.Employee;
import com.demo.employeeservice.repository.EmployeeRepository;
import com.demo.employeeservice.service.EmployeeService;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeRepository employeeRepository;
	
	private RestTemplate restTemplate;

	@Override
	public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
		
		Employee employee=new Employee(
				employeeDto.getId(),
				employeeDto.getFirstName(),
				employeeDto.getLastName(),
				employeeDto.getEmail(),
				employeeDto.getDepartmentCode()
				
				);
		Employee savedEmployee=employeeRepository.save(employee);
		
		EmployeeDto savedEmployeeDto=new EmployeeDto(
				savedEmployee.getId(),
				savedEmployee.getFirstName(),
				savedEmployee.getLastName(),
				savedEmployee.getLastName(),
				savedEmployee.getDepartmentCode()
						
		);
	
	
	return savedEmployeeDto;
	
	}

	@Override
	public ApiResponseDto getEmployeeById(Long Id) {
		
		Employee employee=employeeRepository.findById(Id).get();
		
		ResponseEntity<DepartmentDto>responseEntity=restTemplate.getForEntity("http://localhost:8080/api/departments/"+employee.getDepartmentCode(),DepartmentDto.class);
		
		DepartmentDto departmentDto=responseEntity.getBody();
		
		EmployeeDto employeeDto=new EmployeeDto(
				employee.getId(),
				employee.getFirstName(),
				employee.getLastName(),
				employee.getEmail(),
				employee.getDepartmentCode()
				);
		
		ApiResponseDto apiResponseDto=new ApiResponseDto();
		apiResponseDto.setEmployee(employeeDto);
		apiResponseDto.setDepartment(departmentDto);
		return apiResponseDto;
	}
}
