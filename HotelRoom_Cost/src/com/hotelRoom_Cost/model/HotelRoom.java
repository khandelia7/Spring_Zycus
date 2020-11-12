package com.hotelRoom_Cost.model;

public class HotelRoom {
	
	protected String hotelName;
	protected Integer numberOfSqFeet;
	protected Boolean hasTV;
	protected Boolean hasWifi;

	public HotelRoom() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HotelRoom(String hotelName, Integer numberOfSqFeet, Boolean hasTV, Boolean hasWifi) {
		super();
		this.hotelName = hotelName;
		this.numberOfSqFeet = numberOfSqFeet;
		this.hasTV = hasTV;
		this.hasWifi = hasWifi;
	}
	
	// Calculates cost using the number of sq feets and cost per sq feet and returns an Integer
	public Integer calculateTariff(Integer ratePerSqFeet) {
		return (ratePerSqFeet * this.numberOfSqFeet);
	}
	
	// This method returns an Integer. In this case, it always returns 0
	public Integer getRatePerSqFeet() {
		return 0;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public Integer getNumberOfSqFeet() {
		return numberOfSqFeet;
	}

	public void setNumberOfSqFeet(Integer numberOfSqFeet) {
		this.numberOfSqFeet = numberOfSqFeet;
	}

	public Boolean getHasTV() {
		return hasTV;
	}

	public void setHasTV(Boolean hasTV) {
		this.hasTV = hasTV;
	}

	public Boolean getHasWifi() {
		return hasWifi;
	}

	public void setHasWifi(Boolean hasWifi) {
		this.hasWifi = hasWifi;
	}

	@Override
	public String toString() {
		return "HotelRoom [hotelName=" + hotelName + ", numberOfSqFeet=" + numberOfSqFeet + ", hasTV=" + hasTV
				+ ", hasWifi=" + hasWifi + "]";
	}

}
