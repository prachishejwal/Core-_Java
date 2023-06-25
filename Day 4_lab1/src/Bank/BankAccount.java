package Bank;
//if we are using Equals methods of Object class then it will check by Address
//if we Override it in any class then checks by content //i.e by state
//if we use == operator it works by address

public class BankAccount {

	private int AccNo;
	private String Name;
	private String Type;
	private double Balance;
	
	
	public BankAccount(int accNo, String name, String type, double balance) {
		super();
		AccNo = accNo;
		Name = name;
		Type = type;
		Balance = balance;
	}
	
	@Override
	public String toString() {
		return "BankAccount [AccNo=" + AccNo + ", Name=" + Name + ", Type=" + Type + ", Balance=" + Balance + "]";
	}
	
	
//due overridding equals methods goes by content checking//direct and indirrect should work proper
	
//overloading:compile time:resolves by type of ref 
//	public boolean equals(BankAccount anoac)
//	{
//	      System.out.println("in a bankaccount");
//		  return anoac.AccNo==this.AccNo;
//		
//	}
	
	
//overidding checks by instance of class:lhs
//	@Override
//	public boolean equals(Object o)
//	{
//		System.out.println("in a bankaccount equals");
//		
//		return this.AccNo==((BankAccount)o).AccNo;
//		
//	}
	
	
//	    pk:Accno
//		@Override
//		public boolean equals(Object o)
//		{
//			System.out.println("in a bankaccount equals");
//			if(o instanceof BankAccount)
//			   return this.AccNo==((BankAccount)o).AccNo ;
//			return false;
	
//pk:Accno+Acctype
	@Override
	public boolean equals(Object o)
	{
		System.out.println("in a bankaccount equals");
		if(o instanceof BankAccount)
		   return this.AccNo==((BankAccount)o).AccNo && this.Type==((BankAccount)o).Type ;
		return false;
	
}

	
}
