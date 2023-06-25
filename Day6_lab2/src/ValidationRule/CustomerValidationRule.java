package ValidationRule;

import java.util.List;

import com.core.app.Customer;

import custom_Exceptions.CustomerHandlingException;
public class CustomerValidationRule {

	// No dup vehicles should be added in the showroom :
	public static void checkForDuplicate(List<Customer> customerList,String newEmail)throws CustomerHandlingException
	{
		//Wrap email in customer ref
		Customer newCustomer=new Customer(newEmail);
		if(customerList.contains(newEmail))
			throw new CustomerHandlingException("Duplicate customer");
	}
	
	
}
