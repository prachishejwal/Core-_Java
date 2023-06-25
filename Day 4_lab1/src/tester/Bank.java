package tester;

public class Bank {

	private int Accid;
	private String Name;
	private String Type;
	private double Balance;
	
	public Bank(int Accid,String Name,String Type,double Balance)
	{
		super();
		this.Accid=Accid;
		this.Name=Name;
		this.Type=Type;
		this.Balance=Balance;
	}
	
	@Override
    public String toString()
	{
	return "Accid : "+Accid+"Name: "+Name+"Type: "+Type+"Balanec: "+Balance;
    }
	
//	@Override
//	public boolean equals(Object o)
//	{
//		if(o instanceof Bank)
//				     return ((Bank)o).Accid==this.Accid ;
//		return false;
//		
//	}
	
	
	
}
