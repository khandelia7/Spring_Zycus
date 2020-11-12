package com.assignment.MainController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.assignment.model.Customer;

public class Assign21 {

	public static void main(String[] args) throws NumberFormatException, ParseException {
		
		Scanner s = new Scanner(System.in);
		Set<Customer> set = new HashSet<>();
		
		System.out.println("Enter the details of Customer 1: ");
		String customer1 = s.next();
		String[] c1parts = customer1.split(",");
		Customer c1 = new Customer(Long.parseLong(c1parts[0]),
									c1parts[1],
									c1parts[2],
									new SimpleDateFormat("dd-MMyyyy").parse(c1parts[3]),
									Double.parseDouble(c1parts[4]),
									Double.parseDouble(c1parts[5]),
									new SimpleDateFormat("dd-MM-yyyy").parse(c1parts[6]),
									Double.parseDouble(c1parts[7]));
		
		
		
		
		
		System.out.println("Enter the details of Customer 2: ");
		String customer2 = s.next();
		String[] c2parts = customer2.split(",");
		Customer c2 = new Customer(Long.parseLong(c2parts[0]),
									c2parts[1],
									c2parts[2],
									new SimpleDateFormat("dd-MMyyyy").parse(c2parts[3]),
									Double.parseDouble(c2parts[4]),
									Double.parseDouble(c2parts[5]),
									new SimpleDateFormat("dd-MM-yyyy").parse(c2parts[6]),
									Double.parseDouble(c2parts[7]));
		
		set.add(c1);
		set.add(c2);
		
		System.out.println("\nDetails of customer 1:");
		System.out.println(c1);
		System.out.println("\nDetails of customer 2:");
		System.out.println(c2);
		
		if(c1.equals(c2))
			System.out.print("\nCustomer 1 is same as Customer 2");
		else 
			System.out.println("\nCustomer 1 and Customer 2 are different");

	}

}
