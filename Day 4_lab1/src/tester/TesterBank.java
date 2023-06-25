package tester;

public class TesterBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank B1=new Bank(101,"ramaa","saving",10000);
		System.out.println(B1);
		

		Bank B2=new Bank(101,"ramaa","saving",10000);
		System.out.println(B2);
		
	    //System.out.println(B1==B2);//f

	     System.out.println(B1.equals(B2));//f
		
//		System.out.println(B1==B2);//f
//     	System.out.println(B1.equals(B2));//t
     
//     	Object o=100;//autoboxing--->upcasting
//     	System.out.println(o);//java.lang.Integer
//     	System.out.println(B1.equals(o));
     	
//     	System.out.println(B1.equals(B2));
//		
		
	}

}
