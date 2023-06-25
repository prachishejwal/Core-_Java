package com.app.core;

import java.time.LocalDate;

public class Customer {
	public static int idGenerator;
	static
	{
		idGenerator=0;
	}
	
	//	customer id(int) ,first name, last name (string),email(string),password(string)
//	,registrationAmount(double),dob(LocalDate),plan(ServicePlan : enum)
	private int customerid;
	private String firstname;
	private String lastname;
	private String email;
	private String Password;
	private double registrationAmount;
	private LocalDate dob;
	private Services plan;
	
	public Customer( String firstname, String lastname, String email, String password,
				double registrationAmount, LocalDate dob, Services plan)
    {
		super();
		this.customerid = ++idGenerator;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		Password = password;
		this.registrationAmount = registrationAmount;
		this.dob = dob;
		this.plan = plan;
	}
	
	public String getPassword() {
		return Password;
	}

	//pk based conmstructor
	public Customer(String email)
	{
		this.email=email;
	}

	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", firstname=" + firstname + ", lastname=" + lastname + ", email="
				+ email + ", Password=" + Password + ", registrationAmount=" + registrationAmount + ", dob=" + dob
				+ ", plan=" + plan + "]";
	}
	
	//for pk based equality testing
	@Override
	public boolean equals(Object o)
	{
		System.out.println("in customer equals");
		if(o instanceof Customer)
		{
			return this.email.equals(((Customer)o).email);//downcast
		}
		return false;
			
	}
	
	
	
}
