package com.demo.spring.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private int emp_id;
	private String name;
	private String address;
	private int salary;
	private Date doj;
	
	
	public Employee() {
		super();
	}


	public Employee(int emp_id, String name, String address, int salary, Date doj) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.doj = doj;
	}


	public int getEmp_id() {
		return emp_id;
	}


	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public Date getDoj() {
		return doj;
	}


	public void setDoj(Date doj) {
		this.doj = doj;
	}


	

}
