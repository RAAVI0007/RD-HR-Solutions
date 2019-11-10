package com.rd.hrsolutions.controllers;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rd.hrsolutions.models.Employee;
import com.rd.hrsolutions.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	private static Logger logger = Logger.getLogger(EmployeeController.class);
	
	@Autowired
	private EmployeeService employeService;

	@GetMapping(value = "/getAllEmployees")
	public List<Employee> getAllUsers() {
		logger.info("Inside the Empployee Details ...");
		List<Employee> lt = null;
		lt = employeService.getAllEmployees();
		return lt;
	}
	
	@GetMapping(value = "/getAllEmployees1")
	public List<Employee> getAllUsers1() {
		logger.info("Inside the Empployee Details1 ...");
		List<Employee> lt = new ArrayList<>();
		Employee e1 = new Employee() ;
		e1.setId("1");
		e1.setName("Hello");
		e1.setRole("Developer");
		lt.add(e1);
		return lt;
	}
	

}
