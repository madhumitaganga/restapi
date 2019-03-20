package com.restapi.restapimongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.restapi.restapimongo.model.Person;

@Repository
public interface PersonRepository extends MongoRepository<Person, String>{
	public Person findByLastName(String lastName);
	public Person findByFirstName(String firstName);
	public List<Person> findByAge(int age);

}
