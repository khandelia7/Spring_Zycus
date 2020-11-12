package com.assignment.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.assignment.model.Customer;

public class ContactBO {
	
	// This method accepts a String as argument. Comma separated Customer detail is passed to the method. 
	// Split the value then create a customer object and return the customer object.
	public static Customer createCustomer(String line) throws NumberFormatException, ParseException {
		String[] parts = line.split(",");
		Customer c1 = new Customer(Long.parseLong(parts[0]),
									parts[1],
									parts[2],
									new SimpleDateFormat("dd-MMyyyy").parse(parts[3]),
									Double.parseDouble(parts[4]),
									Double.parseDouble(parts[5]),
									new SimpleDateFormat("dd-MM-yyyy").parse(parts[6]),
									Double.parseDouble(parts[7]));
		return c1;
	}
	
	// This method accepts customer list and a customer name as arguments. Find the list of customers with given name and
	// return the list. If no customers found with the given name return null.
	public static List<Customer> findCustomer(List<Customer> customerList,String name){
		List<Customer> match = new ArrayList<Customer>();
		
		for(Customer c: customerList) {
			if(name.equals(c.getName())){
				match.add(c);
			}
		}
		
		if(match.isEmpty()) {
			return null;
		}
		else {
			return match;
		}
	}
	
	// This method accepts customer list and birth date as arguments. Find the list of customers with the given birth 
	// date and return the list. If no customers found with the givenbirth date return null.
	public static List<Customer> findCustomer(List<Customer> customerList,Date birth){
		
		List<Customer> match = new ArrayList<Customer>();
		
		for(Customer c: customerList) {
			if(birth.compareTo(c.getBirthdate()) == 0){
				match.add(c);
			}
		}
		
		if(match.isEmpty()) {
			return null;
		}
		else {
			return match;
		}
	}
	
	//This method accepts customer list and rating as arguments. Find the list of customers with the given rating value and
	// return the list. If no customers found with the givenrating return null.
	public static List<Customer> findCustomer(List<Customer> customerList,Double rating){
		
		List<Customer> match = new ArrayList<Customer>();
		
		for(Customer c: customerList) {
			if(Double.compare(rating, c.getRating()) == 0 ){
				match.add(c);
			}
		}
		
		if(match.isEmpty()) {
			return null;
		}
		else {
			return match;
		}
	}
	

}
