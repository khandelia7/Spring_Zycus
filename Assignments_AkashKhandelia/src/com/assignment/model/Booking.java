package com.assignment.model;

import java.util.Date;

public class Booking {
	
	private Long id;
	private String customerName;
	private Table table;
	private Integer membersPresent;
	private Double billamount; 
	private Date bookingTime;
	
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Booking(Long id, String customerName, Table table, Integer membersPresent, Double billamount,
			Date bookingTime) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.table = table;
		this.membersPresent = membersPresent;
		this.billamount = billamount;
		this.bookingTime = bookingTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Table getTable() {
		return table;
	}

	public void setTable(Table table) {
		this.table = table;
	}

	public Integer getMembersPresent() {
		return membersPresent;
	}

	public void setMembersPresent(Integer membersPresent) {
		this.membersPresent = membersPresent;
	}

	public Double getBillamount() {
		return billamount;
	}

	public void setBillamount(Double billamount) {
		this.billamount = billamount;
	}

	public Date getBookingTime() {
		return bookingTime;
	}

	public void setBookingTime(Date bookingTime) {
		this.bookingTime = bookingTime;
	}

	@Override
	public String toString() {
		return "Booking [id=" + id + ", customerName=" + customerName + ", table=" + table + ", membersPresent="
				+ membersPresent + ", billamount=" + billamount + ", bookingTime=" + bookingTime + "]";
	}
	
	

}
