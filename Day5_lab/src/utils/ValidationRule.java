package utils;

import java.util.List;
import Custom_Exception.CustomerHnadlingException;
import com.app.core.Customer;

public class ValidationRule {
//ADD A STATIC METHOD TO CHECK FOR DUPLICATION
	public static void CheckForDuplicate(String email,List<Customer> customerlist,String newEmail)throws  CustomerHnadlingException
	{
		//Wrap email in customer ref
		Customer newCustomer=new Customer(newEmail);
		if(customerlist.contains(newCustomer))//refer memory diagram
			throw new CustomerHnadlingException("Duplicate emailid,choose new email!!!!!!!!!!!");
	}
}

//string to enum===valueOf

//java.time.period===>parse