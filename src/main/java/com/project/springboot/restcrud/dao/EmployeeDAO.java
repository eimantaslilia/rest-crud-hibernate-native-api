package com.project.springboot.restcrud.dao;

import java.util.List;

import com.project.springboot.restcrud.entity.Employee;

public interface EmployeeDAO {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee employee);
	
	public void deleteByid(int theId);
}
