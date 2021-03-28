package com.example.demo.employee;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api/v1/employee")
public class employeeController {
	private final EmployeeService employeeService;
	
	@Autowired
	public employeeController(EmployeeService employeeService) {
		
		this.employeeService = employeeService;
	}


	@GetMapping
	public List<employee> getEmployees() {
		return employeeService.getEmployees();
	}
}
