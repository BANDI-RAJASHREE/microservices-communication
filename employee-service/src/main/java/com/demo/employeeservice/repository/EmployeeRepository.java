package com.demo.employeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.employeeservice.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
