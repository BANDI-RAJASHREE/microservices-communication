package com.demo.departmentservice.service;

import com.demo.departmentservice.dto.DepartmentDto;

public interface DepartmentService {
	DepartmentDto saveDepartment(DepartmentDto departmentDto);
	
	DepartmentDto getDepartmentByCode(String departmentCode);

}
