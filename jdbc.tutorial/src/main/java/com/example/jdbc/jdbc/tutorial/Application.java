package com.example.jdbc.jdbc.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {

//	@Autowired
//	EmployeeRepository employeeRepository;

	@Autowired
	IEmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		List<Employee> allEmployees = (List<Employee>) employeeRepository.findAll();
//		System.out.println("All Employees");
//		System.out.println(allEmployees);
//
//		Employee employee102 = employeeRepository.findById(102);
//		System.out.println("Employee_102");
//		System.out.println(employee102);
//
//		int count = employeeRepository.deleteById(102);
//
//		System.out.println(count);
//
//		allEmployees = (List<Employee>) employeeRepository.findAll();
//		System.out.println("All Employees");
//		System.out.println(allEmployees);
//
//		Employee newEmployees = new Employee();
//
//		newEmployees.setId(105);
//		newEmployees.setName("Rashicka");
//		newEmployees.setLocation("Chandigarh");
//		newEmployees.setDepartment("SE");
//		newEmployees.setDateOfBirth(new Date());
//
//		employeeRepository.addEmployee(newEmployees);
//
//		allEmployees = (List<Employee>) employeeRepository.findAll();
//		System.out.println("All Employees");
//		System.out.println(allEmployees);

		System.out.println(employeeRepository.findAll());

	}

}
