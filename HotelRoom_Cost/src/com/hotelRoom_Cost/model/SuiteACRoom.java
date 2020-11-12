package com.hotelRoom_Cost.model;

public class SuiteACRoom extends HotelRoom{
	private Integer ratePerSqFeet;

	public SuiteACRoom(String hotelName, Integer numberOfSqFeet, Boolean hasTV, Boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		// TODO Auto-generated constructor stub
	}

	// returns (ratePerSqFeet + 2) if wifi is present, else returns ratePerSqFeet.
	public Integer getRatePerSqFeet(Boolean hasWifi) {
		if(hasWifi) {
			return ratePerSqFeet + 2;
		}
		else {
				return ratePerSqFeet;
		}
	}

	public Integer getRatePerSqFeet() {
		return ratePerSqFeet;
	}

	public void setRatePerSqFeet(Integer ratePerSqFeet) {
		this.ratePerSqFeet = ratePerSqFeet;
	}

	@Override
	public String toString() {
		return "SuiteACRoom [ratePerSqFeet=" + ratePerSqFeet + "]";
	}
	
}
