package com.hotelRoom_Cost.model;

public class DeluxeACRoom extends DeluxeRoom{
	
	protected Integer ratePerSqFeet;

	public DeluxeACRoom(String hotelName, Integer numberOfSqFeet, Boolean hasTV, Boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 12;
		HotelRoom hotelRoom = new HotelRoom();
		System.out.println(hotelRoom.calculateTariff(this.numberOfSqFeet));
		
	}
}
