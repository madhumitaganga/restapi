package com.restapi.restapimongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.restapimongo.model.Person;
import com.restapi.restapimongo.repository.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository personRepository;
	
	//Create
	public Person create(String firstName, String lastName, int age) {
		return personRepository.save(new Person(firstName, lastName, age));
	}
	
	//Retrieve
	public List<Person> getAll(){
		return personRepository.findAll();
	}
	public Person getByFirstName(String firstName) {
		return personRepository.findByFirstName(firstName);
	}
	
	//Update
	public Person update(String firstName, String lastName, int age) {
		Person p = personRepository.findByFirstName(firstName);
		p.setFirstName(firstName);
		p.setLastName(lastName);
		p.setAge(age);
		return personRepository.save(p);
	}
	
	//Delete
	public void deleteAll() {
		personRepository.deleteAll();
	}
	public void delete(String firstName) {
		Person p = personRepository.findByFirstName(firstName);
		personRepository.delete(p);
	}

}
