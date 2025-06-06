package com.demo.departmentservice.impl;

import org.springframework.stereotype.Service;

import com.demo.departmentservice.dto.DepartmentDto;
import com.demo.departmentservice.entity.Department;
import com.demo.departmentservice.repository.DepartmentRepository;
import com.demo.departmentservice.service.DepartmentService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService{
	
	private DepartmentRepository departmentRepository;

	@Override
	public DepartmentDto saveDepartment(DepartmentDto departmentDto) {
		
		Department department=new Department(
				departmentDto.getId(),
				departmentDto.getDepartmentName(), 
				departmentDto.getDepartmentDescription(),
				departmentDto.getDepartmentCode()
				);
		Department savedDepartment=departmentRepository.save(department);
		
		DepartmentDto savedDepartmentDto=new DepartmentDto(
				savedDepartment.getId(),
				savedDepartment.getDepartmentName(),
				savedDepartment.getDepartmentDescription(),
				savedDepartment.getDepartmentCode()
				
				
				);
		return savedDepartmentDto;
		
				
	}
	
	@Override
	public DepartmentDto getDepartmentByCode(String departmentCode)
	{
		Department department=departmentRepository.findByDepartmentCode(departmentCode);
		
		DepartmentDto departmentDto=new DepartmentDto(
				department.getId(),
				department.getDepartmentName(),
				department.getDepartmentDescription(),
				department.getDepartmentCode()
				);
		return departmentDto;
	}

}
