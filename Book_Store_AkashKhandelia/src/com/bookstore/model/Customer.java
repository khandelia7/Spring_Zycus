package com.bookstore.model;

import java.util.Set;

public class Customer {
	
	private Integer customerId;
	private String email;
	private String fullName;
	private Set<Review> reviews;
	private Set<BookOrder> bookOrders;
	
	public Customer(Integer customerId, String email, String fullName, Set<Review> reviews, Set<BookOrder> bookOrders) {
		super();
		this.customerId = customerId;
		this.email = email;
		this.fullName = fullName;
		this.reviews = reviews;
		this.bookOrders = bookOrders;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Set<Review> getReviews() {
		return reviews;
	}

	public void setReviews(Set<Review> reviews) {
		this.reviews = reviews;
	}

	public Set<BookOrder> getBookOrders() {
		return bookOrders;
	}

	public void setBookOrders(Set<BookOrder> bookOrders) {
		this.bookOrders = bookOrders;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", email=" + email + ", fullName=" + fullName + ", reviews="
				+ reviews + ", bookOrders=" + bookOrders + "]";
	}

}
