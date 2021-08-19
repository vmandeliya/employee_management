package com.employee.rest.service;

import java.util.List;
import java.util.Optional;

import com.employee.rest.model.Employee;

public interface EmployeeService {

	List<Employee> getEmployeesByAge(List<Employee> ref, int maxAge);
}