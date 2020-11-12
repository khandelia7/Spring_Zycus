package com.hotelRoom_Cost.MainController;

import java.util.Scanner;

import com.hotelRoom_Cost.model.DeluxeACRoom;
import com.hotelRoom_Cost.model.DeluxeRoom;

public class AppMain {

	public static void main(String[] args) {
		System.out.println("Hotel Tariff Calculator  \n 1. Deluxe Room \n 2. Deluxe AC Room \n 3. Suite AC Room");
		System.out.println("Select Room Type:");
		
		Scanner s= new Scanner(System.in); 
		int choice = s.nextInt();
		
		System.out.println("Hotel Name: ");
		String hotelName = s.next();
		
		System.out.println("Room Square Feet Area:");
		Integer numberOfSqFeet = s.nextInt();
		
		System.out.println("Room has TV (yes/no):");
		String havingTV = s.next();
		Boolean hasTV;
		if(havingTV.equals("yes")) {
			hasTV = true;
		}
		else {
			hasTV = false;
		}
		
		System.out.println("Room has Wifi (yes/no):");
		String havingWifi = s.next();
		Boolean hasWifi;
		if(havingWifi.equals("yes")) {
			hasWifi = true;
		}
		else {
			hasWifi = false;
		}
		
		switch (choice) {
		case 1:
			DeluxeRoom deluxeRoom =  new DeluxeRoom(hotelName,numberOfSqFeet, hasTV, hasWifi);
			Integer ratePerSqFeet = deluxeRoom.getRatePerSqFeet(hasWifi);
			Integer calculateTariff = deluxeRoom.calculateTariff(ratePerSqFeet);
			System.out.println(calculateTariff);
			break;
			
		case 2:
			DeluxeRoom deluxeRoom1 = new DeluxeACRoom(hotelName,numberOfSqFeet, hasTV, hasWifi);
//			//Integer ratePerSqFeet = deluxeRoom.getRatePerSqFeet(hasWifi);
//			Integer calculateTariff1 = deluxeRoom1.calculateTariff(ratePerSqFeet);
//			System.out.println(calculateTariff1);
			break;
			
		case 3:
			System.out.println("Hotel Name: ");
			break;
		}

	}

}
