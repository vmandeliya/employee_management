package com.employee.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.employee.rest.model.Employee;
import com.employee.rest.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService service;


	@RequestMapping(value= "/employee/{maxAge}", method= RequestMethod.POST)
	public List<Employee> createEmployee(@RequestBody List<Employee> newemp,@PathVariable int maxAge) {
		return service.getEmployeesByAge(newemp,maxAge);
	}

	
}