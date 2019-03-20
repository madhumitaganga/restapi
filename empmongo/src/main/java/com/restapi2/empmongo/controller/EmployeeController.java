package com.restapi2.empmongo.controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restapi2.empmongo.model.Employee;
import com.restapi2.empmongo.service.EmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("employee/create")
	public String create(@RequestParam String name, @RequestParam String position, @RequestParam int salary){
		Employee p = employeeService.create(name, position, salary);
		return p.toString();
	}
	
	@GetMapping("employee/get")
	public Employee getEmployee(@RequestParam String name) {
		return employeeService.getByFirstName(name);
	}
	
	@GetMapping("employee/getAll")
	public List<Employee> getAll(){
		return employeeService.getAll();
	}
	
	@PutMapping("employee/update")
	 public String update(@RequestParam String name, @RequestParam String position, @RequestParam int salary){
		 Employee p = employeeService.update(name, position, salary);
		 return p.toString();
	 }
	
	 @DeleteMapping("employee/delete")
	 public String delete(@RequestParam String name){
		 employeeService.delete(name);
		 return "Deleted "+name+".";
	 }
	 
	 @DeleteMapping("employee/deleteAll")
	 public String deleteAll() {
		 employeeService.deleteAll();
		 return "Deleted all records.";
	 }

}
