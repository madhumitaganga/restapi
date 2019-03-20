package com.restapi2.booksmongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi2.booksmongo.model.Books;
import com.restapi2.booksmongo.repository.BooksRepository;

@Service
public class BooksService {
	
	@Autowired
	private BooksRepository booksRepository;
	
	//create
	public Books create(String name, String author, int pages) {
		return booksRepository.save(new Books(name, author, pages));
	}
	
	//Retrieve
	public List<Books> getAll(){
		return booksRepository.findAll();
	}
	public Books getByName(String name) {
		return booksRepository.findByName(name);
	}
	
	//Update
	public Books update(String name, String author, int pages) {
		Books p = booksRepository.findByName(name);
		p.setName(name);
		p.setAuthor(author);
		p.setPages(pages);
		return booksRepository.save(p);
	}
	

	//Delete
	public void deleteAll() {
		booksRepository.deleteAll();
	}
	public void delete(String name) {
		Books p = booksRepository.findByName(name);
		booksRepository.delete(p);
	}
	
	
	

}
