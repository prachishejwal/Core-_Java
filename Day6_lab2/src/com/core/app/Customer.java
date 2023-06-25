package com.core.app;

import java.time.LocalDate;

public class Customer {

//	customer id(int) ,first name, last name (string),email(string),password(string)
//	,registrationAmount(double),dob(LocalDate),plan(ServicePlan : enum)
	
	private int customerid;
	private String fname;
	private String lname;
	private String email;
	private String password;
	private double regAmount;
	private LocalDate dob;
	private ServicePlan plan;
	public static int idcounter;
	
	static
	{
		idcounter=0;
	}
	
	public Customer( String fname, String lname, String email,String password,
			double regAmount,LocalDate dob, ServicePlan plan) 
	{
		super();
		this.customerid = ++idcounter;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.regAmount = regAmount;
		this.dob = dob;
		this.plan = plan;
	}
	
	//pk based constructor
	public Customer(String email)
	{
		this.email=email;
	}
	
	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", fname=" + fname + ", lname=" + lname + ", email=" + email
		+ ", password=" + password + ", regAmount=" + regAmount + ", dob=" + dob + ", plan=" + plan + "]";
	}
	@Override
	//Indicates whether some other object is "equal to" this one.
	public boolean equals(Object o)
	{
		System.out.println("in a customer equals");
		if(o instanceof Customer)
		{
			return this.email.equals(((Customer)o).email);
		}
	return false;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
