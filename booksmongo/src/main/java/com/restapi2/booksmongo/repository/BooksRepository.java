package com.restapi2.booksmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.restapi2.booksmongo.model.Books;

@Repository
public interface BooksRepository extends MongoRepository<Books, String> {
	public Books findByName(String name);
	public Books findByAuthor(String author);
	public List<Books> findByPages(int pages);

}
