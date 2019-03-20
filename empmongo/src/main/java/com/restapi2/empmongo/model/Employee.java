package com.restapi2.empmongo.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document(collection="employee")
public class Employee {
	@Id
	String Id;
	String name;
	String position;
	int salary;
	
	public Employee(String name, String position, int salary) {
		this.name=name;
		this.position=position;
		this.salary=salary;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String toString() {
		return "Employee Name:"+name+" Position:"+position+", Salary:"+salary;
	}

}
