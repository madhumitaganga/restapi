package com.restapi2.booksmongo.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document(collection="book")
public class Books {
	@Id
	String Id;
	String name;
	String author;
	int pages;
	
	public Books(String name, String author, int pages) {
		this.name=name;
		this.author=author;
		this.pages=pages;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
	public String toString() {
		return "Book Name:"+name+", Author:"+author+", Pages:"+pages;
	}

}
