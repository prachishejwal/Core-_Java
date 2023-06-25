package utils;

import java.util.Map;

import com.banking.AccountType;
import com.banking.BankAccount;

import custome_exceptions.BankAccountException;

public class ValidationRule {

	
	public static final int MIN_BAL;
	static
	{
		MIN_BAL=8000;
	}
	
	public static void checkForBalance(int balance)throws BankAccountException
	{
		if(balance<MIN_BAL)
		{
			throw new BankAccountException("balance is tooo low");
		}
	}
	
	public static void checkForDuplicate(int accNo,Map<Integer,BankAccount> accts)throws BankAccountException
	{
		if(accts.containsKey(accNo))
		{
			throw new BankAccountException("The duplicate customer found!!!!!!!!!!!!!!");
		}
	}
	
	// add a static method for parsing n validating ac yype

	public static void parseAndValidateAccType(String type)
	{
			AccountType.valueOf(type.toLowerCase());
	}


}
