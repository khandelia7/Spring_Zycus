package com.bookstore.model;

public class OrderDetail {
	
	private Book book;
	private BookOrder bookOrder;
	private int quantity;
	private float subtotal;
	
	public OrderDetail(Book book, BookOrder bookOrder, int quantity, float subtotal) {
		super();
		this.book = book;
		this.bookOrder = bookOrder;
		this.quantity = quantity;
		this.subtotal = subtotal;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public BookOrder getBookOrder() {
		return bookOrder;
	}

	public void setBookOrder(BookOrder bookOrder) {
		this.bookOrder = bookOrder;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}

	@Override
	public String toString() {
		return "OrderDetail [book=" + book + ", bookOrder=" + bookOrder + ", quantity=" + quantity + ", subtotal="
				+ subtotal + "]";
	}

}
