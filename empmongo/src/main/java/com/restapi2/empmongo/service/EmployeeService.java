package com.restapi2.empmongo.service;

import org.springframework.stereotype.Service;

import com.restapi2.empmongo.model.Employee;
import com.restapi2.empmongo.repository.EmployeeRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	// create
	public Employee create(String name, String position, int salary) {
		return employeeRepository.save(new Employee(name, position, salary));
	}

	// Retrieve
	public List<Employee> getAll() {
		return employeeRepository.findAll();
	}

	public Employee getByFirstName(String name) {
		return employeeRepository.findByName(name);
	}

	// Update
	public Employee update(String name, String position, int salary) {
		Employee p = employeeRepository.findByName(name);
		p.setName(name);
		p.setPosition(position);
		p.setSalary(salary);
		return employeeRepository.save(p);
	}

	// Delete
	public void deleteAll() {
		employeeRepository.deleteAll();
	}

	public void delete(String firstName) {
		Employee p = employeeRepository.findByName(firstName);
		employeeRepository.delete(p);
	}

}
