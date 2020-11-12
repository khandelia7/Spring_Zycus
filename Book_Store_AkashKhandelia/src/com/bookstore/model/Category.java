package com.bookstore.model;

import java.util.Set;

public class Category {
	
	private Integer categoryId;
	private String name;
	private Set<Book> books;

	public Category(Integer categoryId, String name, Set<Book> books) {
		super();
		this.categoryId = categoryId;
		this.name = name;
		this.books = books;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", name=" + name + ", books=" + books + "]";
	}

}
