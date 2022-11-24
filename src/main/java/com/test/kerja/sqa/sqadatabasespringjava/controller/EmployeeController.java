package com.test.kerja.sqa.sqadatabasespringjava.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.kerja.sqa.sqadatabasespringjava.model.Employee;
import com.test.kerja.sqa.sqadatabasespringjava.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	private final EmployeeRepository employeeRepository;
	
	EmployeeController(EmployeeRepository employeeRepository){
		this.employeeRepository = employeeRepository;
	}
	
	@GetMapping("/employee")
	List<Employee> all() {
		return employeeRepository.findAll();
	}
	
	@PostMapping("/employee")
	Employee newEmployee(@RequestBody Employee newEmployee) {
		return employeeRepository.save(newEmployee);
	}
	
//	@DeleteMapping("/employee/{id}")
//	void deleteEmployee(@PathVariable Long id) {
//		employeeRepository.deleteById(id);
//	}
//	@PutMapping("/employee/{id}")
//	Employee updateEmployee(@RequestBody Employee newEmplyee,@PathVariable Long id) {
//		return employeeRepository.findById(id)
//				.map(employee->{
//					employee.setFirstName(newEmplyee.getFirstName());
//					employee.setLastName(newEmplyee.getLastName());
//				});
//	}
	
}
