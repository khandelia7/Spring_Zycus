package com.assignment.MainController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


import com.assignment.model.Customer;
import com.assignment.service.ContactBO;

public class Assign22 {

	public static void main(String[] args) throws NumberFormatException, ParseException {
		
		Scanner s = new Scanner(System.in);
		ContactBO contactBO = new ContactBO(); 
		List<Customer> set = new ArrayList<Customer>();
		List<Customer> match = new ArrayList<Customer>();
		
		System.out.println("Enter the number of customers: ");
		int count = s.nextInt();
		
		for (int i=0; i<count; i++) {
			set.add(contactBO.createCustomer(s.next()));
		}
		
		System.out.println("Enter the search type:\n 1.By name\n 2.By birth date\n 3.By rating");
		int choice = s.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter the name of the customer to be searched: ");
			String name = s.next();
			match = contactBO.findCustomer(set, name);
			if(match == null) {
				System.out.println("No customers found with the given name");
			}
			else {
				System.out.println(match);
			}
			break;
			
		case 2:
			System.out.println("Enter the birthday of the customer to be searched: ");
			String birth1 = s.next();
			Date birth = new SimpleDateFormat("dd-MMyyyy").parse(birth1);
			match = contactBO.findCustomer(set, birth);
			if(match == null) {
				System.out.println("No customers found with the given birthday");
			}
			else {
				System.out.println(match);
			}
			break;
		
		case 3:
			System.out.println("Enter the rating of the customer to be searched: ");
			Double rating = s.nextDouble();
			match = contactBO.findCustomer(set, rating);
			if(match == null) {
				System.out.println("No customers found with the given rating");
			}
			else {
				System.out.println(match);
			}
			break;
		}
		
		
	}

}
