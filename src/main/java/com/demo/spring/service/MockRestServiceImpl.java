package com.demo.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.spring.dao.MockRestDao;
import com.demo.spring.entity.Employee;
@Service
public class MockRestServiceImpl implements MockRestService {
	
	@Autowired
	
	MockRestDao mockDao;

	@Override
	public List<Employee> getList() {
		
		return mockDao.findAll();
		
	}

	@Override
	public Employee getanEmployee(int emp_id) {
		
		Employee emp=null;
		 
		Optional<Employee> op=mockDao.findById(emp_id);
		if(op.isPresent())
		{
			return op.get();
		}
		
		return emp;
		
		
				
		
	}

	@Override
	public String addEmployee(Employee employee) {
		Optional<Employee> op=mockDao.findById(employee.getEmp_id());
		if(op.isPresent())
		{
		return "Employee Already Exists";
		}
		else 
		{
			mockDao.save(employee);
			return "New Employee Added";
		}
		
	}

	@Override
	public String updateDetails(Employee employee) {
		
		Optional<Employee>op=mockDao.findById(employee.getEmp_id());
		if(op.isPresent())
		{
			mockDao.save(employee);
			return "Employee Details Updated";
		}
		else
			return "Employee not Exists";
	}

	@Override
	public String deleteEmployee(int emp_id) {
		Optional<Employee> op=mockDao.findById(emp_id);
		
		if(op.isPresent())
		{
			Employee emp=op.get();
			mockDao.delete(emp);
			return "Employee Deleted";
		}
		else
		{
			return "Employee Not Exists";
		}
	}
	
	
	
	

}
