package com.project.springboot.restcrud.service;

import java.util.List;

import com.project.springboot.restcrud.entity.Employee;

public interface EmployeeService {

	
	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee employee);
	
	public void deleteById(int theId);
	
}
