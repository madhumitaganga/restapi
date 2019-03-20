package com.restapi2.booksmongo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.restapi2.booksmongo.model.Books;
import com.restapi2.booksmongo.service.BooksService;

@RestController
public class BooksController {
	
	@Autowired
	private BooksService booksService;
	
	@PostMapping("books/create")
	public String create(@RequestParam String name, @RequestParam String author, @RequestParam int pages){
		Books b = booksService.create(name, author, pages);
		return b.toString();
	}
	
	@GetMapping("books/get")
	public Books getBooks(@RequestParam String name) {
		return booksService.getByName(name);
	}
	
	@GetMapping("books/getAll")
	public List<Books> getAll(){
		return booksService.getAll();
	}
	
	@PutMapping("books/update")
	 public String update(@RequestParam String name, @RequestParam String author, @RequestParam int pages){
		 Books b = booksService.update(name, author, pages);
		 return b.toString();
	 }
	
	@DeleteMapping("books/delete")
	 public String delete(@RequestParam String name){
		 booksService.delete(name);
		 return "Deleted "+name+".";
	 }
	
	 @DeleteMapping("books/deleteAll")
	 public String deleteAll() {
		 booksService.deleteAll();
		 return "Deleted all records.";
	 }

}
