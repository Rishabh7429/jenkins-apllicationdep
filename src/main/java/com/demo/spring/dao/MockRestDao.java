package com.demo.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.spring.entity.Employee;
@Repository
public interface MockRestDao extends JpaRepository<Employee,Integer> {
	
	

}
