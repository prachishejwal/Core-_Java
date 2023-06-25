package com.core.app;

public enum ServicePlan {

//	SILVER : 1000 
//	GOLD : 2000
//	DIAMOND : 5000
//	PLATINUM : 10000
	
	silver(1000),gold(2000),diamond(5000),platinum(10000);
	
	private double colourcost;
	
	private ServicePlan(double colourCost)
	{
		this.colourcost=colourcost;
	}
	
	@Override
	public String toString()
	{
		return name()+"@"+this.colourcost;
	}
	
	
}
