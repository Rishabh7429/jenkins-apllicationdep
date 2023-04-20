package com.demo.spring.service;

import java.util.List;
import java.util.Optional;

import com.demo.spring.entity.Employee;

public interface MockRestService {
	
	public List<Employee> getList();
	public Employee getanEmployee(int emp_id);
	public String addEmployee(Employee employee);
	public String updateDetails(Employee employee);
	public String deleteEmployee(int emp_id);

}
