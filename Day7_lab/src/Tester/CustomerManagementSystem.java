package Tester;
//unsuscribe:email+remove
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static utils.ValidationRule.*;
import com.app.core.Customer;

import Custom_Exception.CustomerHnadlingException;
public class CustomerManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(Scanner sc=new Scanner(System.in))
		{
			List<Customer> customerList=new ArrayList<>();
			boolean exit=false;
			while(!exit)
			{
				System.out.println("1.Signup 2.sign in 3.DisplayAll");
				System.out.println("Choose option");
				try 
				{
					switch(sc.nextInt())
					{
					case 1:
						System.out.println("Enter customer detail:String firstname, String lastname, String email, String password,double registrationAmount, LocalDate dob, Services plan");
						Customer validCustomer=ValidateAllInputs(sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),sc.next(),sc.next(),  customerList);	
						customerList.add(validCustomer);
						System.out.println("Customer register");
						break;
					case 2:
						System.out.println("Singnin");
						System.out.println("Enter email and password");
						String email=sc.next();
//						String pwd=sc.next();
//						//search by email:pk
//						int index=customerList.indexOf(new Customer(email));//wrap in customer object proper checking
//						//invalid
//						if(index == -1)
//							throw new CustomerHnadlingException("Invalid Email");
//						validCustomer=customerList.get(index);
//						if(validCustomer.getPassword().equals(pwd))
//							System.out.println("Succesful login");
//						//==>invalid pwd
//						else
//							throw new CustomerHnadlingException("unsuccesful login");
						break;
					case 4:
			
						
						break;
					
					case 0:
						exit=true;
						break;
					
					}
				}
				catch(Exception E)
				{
					E.printStackTrace();
					//read off pending token from sacnner yill EOL(End of line)
					sc.next();
				}
			}
		}
	}

	

}
