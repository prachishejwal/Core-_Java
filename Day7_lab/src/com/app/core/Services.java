package com.app.core;

public enum Services {

//	SILVER : 1000 
//	GOLD : 2000
//	DIAMOND : 5000
//	PLATINUM : 10000
	
	SIVER(1000),GOLD(2000),DIAMOND(5000),PLATINUM(10000);
	
	private double plancost;
	
	private Services(double plancost)
	{
		//super(name,Ordinal);:java.lang.Enum
		this.plancost=plancost;
	}
	
	public  double getPlanCost()
	{
		return this.plancost;
	}
	
	@Override
	public String toString()
	{
		return name()+"cost"+this.plancost;
	}
}
