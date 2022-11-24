package com.test.kerja.sqa.sqadatabasespringjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.kerja.sqa.sqadatabasespringjava.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
}
