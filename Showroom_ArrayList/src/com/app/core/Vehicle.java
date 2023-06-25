package com.app.core;

import java.time.LocalDate;

public class Vehicle implements Comparable<Vehicle> {
	/*
	 * chasisNo(string) : Unique ID, color(enum) , netPrice(double) ,
	 * manufactureDate(LocalDate),company,isAvailable
	 */
	
	private String chasisNo;
	private Colours colour;
	private double netPrice;
	private LocalDate manufactureDate;
	private String company;
	private boolean isAvailable;
	
	public Vehicle(String chasisNo, Colours colour, double netPrice, LocalDate manufactureDate, String company) {
		super();
		this.chasisNo = chasisNo;
		this.colour = colour;
		this.netPrice = netPrice;
		this.manufactureDate = manufactureDate;
		this.company = company;
		this.isAvailable = true;
	}
	

	public Vehicle(String chasisNo)
	{
		this.chasisNo=chasisNo;
	}

	@Override
	public String toString() {
		return "Vehicle [chasisNo=" + chasisNo + ", colour=" + colour + ", netPrice=" + netPrice + ", manufactureDate="
				+ manufactureDate + ", company=" + company + ", isAvailable=" + isAvailable + "]";
	}
	
	public boolean equals(Object o)
	{
		System.out.println("Inside vehicle equals method");
		if(o instanceof Vehicle)
			return this.chasisNo.equals(((Vehicle)o).chasisNo);
		return false;
	}

	public double getNetPrice() {
		return netPrice;
	}
	public void setNetPrice(double netPrice) {
		this.netPrice = netPrice;
	}
	public LocalDate getManufactureDate() {
		return manufactureDate;
	}
	public Colours getVehicleColor() {
		return colour;
	}


	@Override
	public int compareTo(Vehicle anotherVehicle) {
		System.out.println("Inside Vehicle CompareTo");
		return this.chasisNo.compareTo(anotherVehicle.chasisNo);
	}
}
