package com.hotelRoom_Cost.model;

public class DeluxeRoom extends HotelRoom{
	
	protected Integer ratePerSqFeet;

	public DeluxeRoom(String hotelName, Integer numberOfSqFeet, Boolean hasTV, Boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 10;
	}
	
	// returns (ratePerSqFeet + 2) if wifi is present, else returns ratePerSqFeet.
	public Integer getRatePerSqFeet(Boolean hasWifi) {
		if(hasWifi) {
			return this.ratePerSqFeet + 2;
		}
		else {
			return this.ratePerSqFeet;
		}
	}
}
