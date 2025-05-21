package com.demo.departmentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.departmentservice.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department,Long>{
	
	Department findByDepartmentCode(String departmentCode);
	
	

}
