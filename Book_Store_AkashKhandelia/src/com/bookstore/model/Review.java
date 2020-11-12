package com.bookstore.model;

public class Review {
	
	private Integer reviewId;
	private String comment;
	private Book book;
	private Customer customer;
	
	public Review(Integer reviewId, String comment, Book book, Customer customer) {
		super();
		this.reviewId = reviewId;
		this.comment = comment;
		this.book = book;
		this.customer = customer;
	}

	public Integer getReviewId() {
		return reviewId;
	}

	public void setReviewId(Integer reviewId) {
		this.reviewId = reviewId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Reviview [reviewId=" + reviewId + ", comment=" + comment + ", book=" + book + ", customer=" + customer
				+ "]";
	}
}
