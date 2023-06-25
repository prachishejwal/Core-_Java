package com.core.app;

import java.time.LocalDate;
import java.util.Objects;

//
public class Emp {

	private String id;
	private String fname;
	private String lname;
	private double salary;
	private Dept dname;
	private LocalDate joinDate;
	
	public Emp(String id, String fname, String lname, double salary, Dept dname, LocalDate joinDate) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.salary = salary;
		this.dname = dname;
		this.joinDate = joinDate;
	}
	public Emp(String id) {
		super();
		this.id = id;
	}




	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public Dept getDname() {
		return dname;
	}


	public void setDname(Dept dname) {
		this.dname = dname;
	}


	public LocalDate getJoinDate() {
		return joinDate;
	}


	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}


	@Override
	public String toString() {
		return "Emp [id=" + id + ", fname=" + fname + ", lname=" + lname + ", salary=" + salary + ", dname=" + dname
				+ ", joinDate=" + joinDate + "]";
	}
	
	
}
