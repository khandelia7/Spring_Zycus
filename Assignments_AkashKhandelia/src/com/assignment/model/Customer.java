package com.assignment.model;

import java.util.Date;

public class Customer {
	
	private Long id;
	private String name;
	private String mobileNumber;
	private Date birthdate;
	private Double averageSpendAmount;
	private Double totalAmount;
	private Date dateEnrolled;
	private Double rating;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(Long id, String name, String mobileNumber, Date birthdate, Double averageSpendAmount,
			Double totalAmount, Date dateEnrolled, Double rating) {
		super();
		this.id = id;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.birthdate = birthdate;
		this.averageSpendAmount = averageSpendAmount;
		this.totalAmount = totalAmount;
		this.dateEnrolled = dateEnrolled;
		this.rating = rating;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public Double getAverageSpendAmount() {
		return averageSpendAmount;
	}

	public void setAverageSpendAmount(Double averageSpendAmount) {
		this.averageSpendAmount = averageSpendAmount;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Date getDateEnrolled() {
		return dateEnrolled;
	}

	public void setDateEnrolled(Date dateEnrolled) {
		this.dateEnrolled = dateEnrolled;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Customer other = (Customer) obj;
		
		if (birthdate == null) {
			if (other.birthdate != null) {
				return false;
			}	
		} else if(birthdate.equals(other.birthdate)) {
			System.out.println("birthdate same");
			return true;
		} else {
			System.out.println("birthdate not same");
		}
			
		if (mobileNumber == null) {
			if (other.mobileNumber != null) {
				return false;
			}	
		} else if(mobileNumber.equals(other.mobileNumber)) {	
			System.out.println("mobno  same");
			return true;
		} else {
			System.out.println("mobno not same");
		}
			
		
		if (name == null) {
			if (other.name != null) {
				return false;
			}		
		} else if(name.equals(other.name)) {
			System.out.println("name  same");
			return true;
		}
		else {
			System.out.println("name not same");
		}
		
		return false;
	}

//  Assignment 21
//	@Override
//	public String toString() {
//		return "id=" + id + "\nname=" + name + "\nmobileNumber=" + mobileNumber + "\nbirthdate=" + birthdate
//				+ "\navgspendamount=" + averageSpendAmount + "\ntotalAmount=" + totalAmount + "\ndateEnrolled="
//				+ dateEnrolled + "\nrating=" + rating ;
//	}
	
	@Override
	public String toString() {
		return id + " "+ name + " " + mobileNumber + " " + birthdate
				+ " " + averageSpendAmount + " " + totalAmount + " ="
				+ dateEnrolled + " " + rating ;
	}
	
	

}
