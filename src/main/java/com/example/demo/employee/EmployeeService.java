package com.example.demo.employee;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService {
	
	private final EmployeeRepository employeeRepository;
	@Autowired
	public EmployeeService(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	public List<employee> getEmployees() {
		return employeeRepository.findAll();
	}
}
