package com.tester;


import static utils.BankingUtils.populateMap;

import java.util.Map;
import java.util.Scanner;

import com.banking.BankAccount;
public class testbanking {
	public static void main(String args[])
	{
		try(Scanner sc=new Scanner(System.in))
		{
			Map<Integer,BankAccount> acctMap=populateMap();
			//put vs putIfAbsent
			//put:replace old value my new value
			//putIfAbsent:
//			System.out.println("put "+map.put(101, validateAllInputs(101,"Rama Kher","saving",12000,"2023-01-01", map)));
//			System.out.println("put"+Map.put());
			
		}
	}
}
