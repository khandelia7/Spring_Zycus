package com.bookstore.model;

import java.util.Date;
import java.util.Set;

public class BookOrder {
	
	private Integer orderId;
	private Customer customer;
	private Date orderDate;
	private String shippingAddress;
	private Set<OrderDetail> orderDetails;
	
	public BookOrder(Integer orderId, Customer customer, Date orderDate, String shippingAddress,
			Set<OrderDetail> orderDetails) {
		super();
		this.orderId = orderId;
		this.customer = customer;
		this.orderDate = orderDate;
		this.shippingAddress = shippingAddress;
		this.orderDetails = orderDetails;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public Set<OrderDetail> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(Set<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	@Override
	public String toString() {
		return "BookOrder [orderId=" + orderId + ", customer=" + customer + ", orderDate=" + orderDate
				+ ", shippingAddress=" + shippingAddress + ", orderDetails=" + orderDetails + "]";
	}
	
}
