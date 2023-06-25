package com.app.core;

public enum Colours {

	//Each constant is an instance of the enum class
	red(15000),white(10000),blue(12000),black(25000),gray(11000);
	
	//the constructors of an enum are implicitly private. 
	//This means that you cannot create an instance of an enum using the new operator, 
	//and you cannot extend an enum using inheritance.
	private double colourCost;
	private Colours(double colourCost)
	{
		this.colourCost=colourCost;
	}
	// the name() method of an enum returns the name of the 
	//enumeration constant as a String.
	public String toString()
	{
		return name()+"@"+colourCost;
	}
	
	public double getColourCost()
	{
		return colourCost;
	}
}
