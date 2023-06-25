package tester;

import Bank.BankAccount;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount AC1=new BankAccount(101,"rama mathur","saving",12000);
		BankAccount AC2=new BankAccount(101,"rama kelka","current",15000);
		
//		System.out.println(AC1==AC2);//f
//		System.out.println(AC1.equals(AC2));//false Objectclass --->tostring goes by ref
		
//		//overload
//	    System.out.println(AC1==AC2);//f
//		System.out.println(AC1.equals(AC2));//false Objectclass --->tostring goes by ref
		
		//override
//		System.out.println(AC1==AC2);//f
//		System.out.println(AC1.equals(AC2));
		
//		Object o=100;//autoboxing --upcast
//		System.out.println(o.getClass());
//		System.out.println(AC1.equals(o));//integer not casted to Object class
		
//		//pk:Accno
//		Object o=100;//autoboxing --upcast
//		System.out.println(o.getClass());//class java.lang.Integer
//		System.out.println(AC1.equals(o));//added proper condition//false
		
		//pk:Accno+acctype
		Object o=100;//autoboxing --upcast
		System.out.println(o.getClass());//class java.lang.Integer
		System.out.println(AC1.equals(o));//added proper condition
	}

}
//for runtime:instance of------>downcasting