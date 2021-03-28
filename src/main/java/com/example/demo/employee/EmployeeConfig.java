package com.example.demo.employee;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {
	@Bean
	CommandLineRunner commandLineRunner(EmployeeRepository repository) {
		return args -> {
			employee  push =new employee(
					"push",
					"push@gmail.com",
					21,
					LocalDate.of(2000, Month.JANUARY, 05)
					
					);
			employee  Test =new employee(
					"Test",
					"Test@gmail.com",
					21,
					LocalDate.of(2009, Month.FEBRUARY, 05)
					
					);
			repository.saveAll(
					List.of(push,Test)
					
					);
		};
	}
	
}
