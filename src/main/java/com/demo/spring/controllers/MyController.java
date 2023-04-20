package com.demo.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.spring.entity.Employee;
import com.demo.spring.service.MockRestService;

@Controller
public class MyController {
	
	@Autowired
	
	MockRestService mockService;
	
	
	@GetMapping("/")
	public String viewhomepage(Model model)
	{
		model.addAttribute("empList", this.mockService.getList());
		return "index";
	}
	
	@GetMapping("/addEmp")
	public String getnewemployeeform(Model model)
	{
		Employee employee=new Employee();
		model.addAttribute("employee", employee);
		return "add_emp";
	}
	
	
	
	@GetMapping("/getoneemployee/{emp_id}")
	
	public Employee getanEmployee(@PathVariable int emp_id) {
		return this.mockService.getanEmployee(emp_id);
	}
	
	@PostMapping("/addEmployee")
	public String addNewEmployee(@ModelAttribute ("employee") Employee employee)
	{
		this.mockService.addEmployee(employee);
		return "redirect:/";
	}
	
	@GetMapping("/updateEmp")
	public String showupdateEmployeeForm(Model model)
	{
		Employee employee=new Employee();
		model.addAttribute("employee", employee);
		return "update_emp";
	}
	
	
	
	@PostMapping("/updateEmployee")
	public String updateDetails(@ModelAttribute ("employee") Employee employee )
	{
		this.mockService.updateDetails(employee);
		return "redirect:/";
	}
	@GetMapping("/deleteEmp")
	public String showDeleteEmployeeForm(Model model)
	{
		Employee employee=new Employee();
		model.addAttribute("emp_id", employee.getEmp_id());
		return "delete_emp";
	}
	
	
	@PostMapping("/deleteEmployee/{emp_id}")
	public String deleteEmployee(@ModelAttribute ("employee") Employee employee) 
	{
		this.mockService.deleteEmployee(employee.getEmp_id());
		return "redirect:/";
		
	}
	
	
	
	

}
