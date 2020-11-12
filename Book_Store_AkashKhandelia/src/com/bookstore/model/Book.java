package com.bookstore.model;

import java.util.Set;

public class Book {
	
	private Integer bookId;
	private String title;
	private String author;
	private String description;
	private Category category;
	private Set<Review> reviews;
	
	public Book(Integer bookId, String title, String author, String description, Category category,
			Set<Review> reviews) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.description = description;
		this.category = category;
		this.reviews = reviews;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Set<Review> getReviews() {
		return reviews;
	}

	public void setReviews(Set<Review> reviews) {
		this.reviews = reviews;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", description=" + description
				+ ", category=" + category + ", reviews=" + reviews + "]";
	} 
	
}
