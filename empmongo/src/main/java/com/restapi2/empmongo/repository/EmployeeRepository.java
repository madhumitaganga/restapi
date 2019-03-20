package com.restapi2.empmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.restapi2.empmongo.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String>{
	public Employee findByName(String name);
	public Employee findByPosition(String position);
	public List<Employee> findBySalary(int salary);

}
