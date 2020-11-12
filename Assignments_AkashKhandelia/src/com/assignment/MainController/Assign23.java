package com.assignment.MainController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class Assign23 {
	public static void main(String[] args) throws NumberFormatException, ParseException {
		Scanner s = new Scanner(System.in);
		System.out.println("1.Validate Age\n2.Validate Name\n3.Lucky Customer");
		System.out.println("Enter your choice:");
		int choice = s.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter birthdate:");
			String birth1 = s.next();
			Date birth = new SimpleDateFormat("dd-MM-yyyy").parse(birth1);
			if (validateAge(birth)) {
				System.out.println("Age is valid");
			} else {
				System.out.println("Age is invalid");
			}
			break;

		case 2:
			System.out.println("Enter name: ");
			String name = s.next();
			if (validateName(name)) {
				System.out.println("Name is valid");
			} else {
				System.out.println("Name is invalid");
			}
			break;

		case 3:
			System.out.println("Enter mobile number: ");
			String mobileNumber = s.next();
			if (validateLuckyCustomer(mobileNumber)) {
				System.out.println("Lucky Customer");
			} else {
				System.out.println("UnLucky Customer ");
			}
			break;
		}

	}

	// This method accepts java.util.Date as argument and returns a boolean.
	// Calculate the age and return True 
	// if the age of the customer is greater than or equal to 18, else return False
	static Boolean validateAge(java.util.Date birth) throws ParseException {
		LocalDate bday = LocalDate.of(2018, 01, 01);
		LocalDate date = birth.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		int diff = Period.between(date, bday).getYears();
		if (diff > 18) {
			return true;
		} else {
			return false;
		}
	}

	// This method accepts a String as argument and returns a boolean.Validate the
	// name of the
	// customer and return True if the name is valid, else return False
	static Boolean validateName(String name) {
		return ((name != null) && (name.equals(" ")) && (name.matches("^[a-zA-Z]*$")));
	}

	// This method accepts a String as argument and returns a boolean.Check
	// whether the mobile
	// number of the customer is lucky and return True, else return False
	static Boolean validateLuckyCustomer(String mobile) {
		do {
			int n, sum = 0;
			int m = Integer.parseInt(mobile);
			while(m > 0) {
				n = m % 10;
		        sum = sum + n;
		        m = m / 10;
		   }
		   mobile =String.valueOf(sum); //15
		}while(mobile.length()!=1);
		if(mobile.equals("1")) {
			return true;
		}
		else {
			return false;
		}
	}
}
