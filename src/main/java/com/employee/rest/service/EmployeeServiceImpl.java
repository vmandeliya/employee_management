package com.employee.rest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.rest.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public List<Employee> getEmployeesByAge(List<Employee> ref, int maxAge) {
		 List<Employee> empObj=ref;
		 empObj=empObj.stream().filter(s->s.getEmpAge()<maxAge).toList();
		return empObj;
	}

	




	

}