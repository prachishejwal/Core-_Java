package com.banking;

import java.time.LocalDate;

public class BankAccount {
	
	private int acctNo;
	private String customerName;
	private AccountType type;
	private double balance;
	private LocalDate createdOn;
	private LocalDate lastUpdated;
	private boolean isActive;
	
	public BankAccount(int acctNo, String customerName, AccountType type, double balance, LocalDate createdOn,
			LocalDate lastUpdated ) 
	{
		
		this.acctNo = acctNo;
		this.customerName = customerName;
		this.type = type;
		this.balance = balance;
		this.createdOn = createdOn;
		this.lastUpdated = this.createdOn;
		this.isActive = true;
	}

	public int getAcctNo() {
		return acctNo;
	}

	public void setAcctNo(int acctNo) {
		this.acctNo = acctNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public AccountType getType() {
		return type;
	}

	public void setType(AccountType type) {
		this.type = type;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public LocalDate getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDate createdOn) {
		this.createdOn = createdOn;
	}

	public LocalDate getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(LocalDate lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	@Override
	public String toString() {
		return "BankAccount [acctNo=" + acctNo + ", customerName=" + customerName + ", type=" + type + ", balance="
				+ balance + ", createdOn=" + createdOn + ", lastUpdated=" + lastUpdated + ", isActive=" + isActive
				+ "]";
	}
	
	// For correct working of hashing algo + O(1) :
		// which methods(equals , hashCode) should be overridden? NONE , since HM will
		// call these methods on Key type
		// BankAccount : Value type
	public void deposite(double amount)
	{
		if(isActive)
		{
			this.balance=this.balance+amount;
			this.lastUpdated=LocalDate.now();
		}
	}
	
	public void withdraw(double amount)
	{
		if(isActive)
		{
			this.balance=this.balance-amount;
			this.lastUpdated=LocalDate.now();
		}
	}
	public void fundTransfer(double amount,BankAccount dest)
	{
		this.withdraw(amount);
		dest.deposite(amount);
	}

	
	
	
	
	
	
	
	
	
}
